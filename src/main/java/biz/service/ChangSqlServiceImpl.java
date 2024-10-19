package biz.service;

import biz.service.component.CMD.InputThread;
import biz.service.component.CMD.OutputThread;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ChangSqlServiceImpl {

    public static String convertToInsertWithSelect(String sql) {
        // 正则表达式模式用于匹配INSERT语句中的表名、字段列表和值列表
        Pattern pattern = Pattern.compile("INSERT INTO (\\w+) \\(([^)]+)\\) VALUES \\((.+)\\);");


        Matcher matcher = pattern.matcher(sql);
        if (matcher.find()) {
            String tableName = matcher.group(1);
            String fieldList = matcher.group(2);
            String values = matcher.group(3);
            // 构建新的INSERT语句，包括SELECT子句和WHERE条件
            String newSql = "INSERT INTO " + tableName + " (" + fieldList + ") SELECT " + values + " FROM DUAL WHERE NOT EXISTS (SELECT 1 FROM " + tableName + " WHERE " + getWhereConditions(fieldList, values) + ");";
            return newSql;
        } else {
            // 如果无法匹配原始SQL，返回原始SQL
            return sql;
        }
    }

    // 用于生成WHERE条件的辅助方法
    private static String getWhereConditions(String fieldList, String values) {
        String[] fields = fieldList.split(", ");
        String[] fieldValues = values.split(", ");
        StringBuilder whereConditions = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            if ("C_SYSTEM,C_FUNCTIONID,C_INTERFACEID,C_FIELDCODE,ID,CODE".contains(fields[i])) {
                if (i > 0) {
                    whereConditions.append(" AND ");
                }
                if (fieldValues[i].equalsIgnoreCase("null")) {
                    whereConditions.append(fields[i]).append(" IS NULL");
                } else {
                    whereConditions.append(fields[i]).append(" = ").append(fieldValues[i]);
                }
            }
        }
        return whereConditions.toString();
    }

    public static void main(String[] args) {
//        String originalSql = "INSERT INTO TINSTINTERINPUTCONFIG (C_SYSTEM, C_FUNCTIONID, C_INTERFACEID, C_FIELDCODE, C_OTHERFIELDCODE, C_TYPE, C_ISMUST, C_FORMAT, C_DATASETID, C_DATATYPE, C_PARAMMAP, C_RELATCOLUMN, C_VERSION, C_PARTY, C_TRANSFERMAP, C_LENGTH, C_DICTNAME, C_FIELDNAME) VALUES ('CA', 'TM0016', '1000000000000000111', 'nameinbank', null, 'S', '1', null, null, null, null,  null, null, null, null,  null,  null, '账户名称(业务操作冻结必填)');";
//        String convertedSql = convertToInsertWithSelect(originalSql);
//        System.out.println(convertedSql);
//        String sourceDirectory = "E:\\code\\6.0_2023_0901\\Sources\\backend\\dtl\\dtl-schema\\dtl-sql\\02.个性化开通脚本\\1_86730_长安信托\\接口校验配置"; // 源文件夹路径
        String sourceDirectory = "E:\\code\\6.0_2023_0901\\Sources\\backend\\dtl\\dtl-schema\\dtl-sql\\02.个性化开通脚本\\1_86730_长安信托\\tinterface初始化接口配置.sql"; // 源文件夹路径
        String targetDirectory = "D:\\jiaoyan"; // 目标文件夹路径
        File sourceDir = new File(sourceDirectory);
        File[] files =new File[1];
        if (sourceDir.isDirectory()){
            files = sourceDir.listFiles();
        }else{
            files[0] =sourceDir;
        }
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    if (file.getName().equals("product") || file.getName().equals("trans")) {
                        processFilesInSubdirectory(file, file.getName(), targetDirectory);
                    }
                }else{
                    processFile(file, "folder", targetDirectory);
                }
            }
        }
    }


    public static void processFile(File file, String folder, String targetDirectory) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("GBK")));
             BufferedWriter writer =
                     new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetDirectory + File.separator + folder + File.separator + file.getName()), Charset.forName("GBK")));) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("DEL")) {
                    continue;
                } else if (line.startsWith("--")) {
                    writer.write(line);
                } else {
                    writer.write(convertToInsertWithSelect(line));
                }
                writer.newLine(); // 写入换行符
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void processFilesInSubdirectory(File directory, String folder, String targetDirectory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    processFile(file, folder, targetDirectory);
                } else if (file.isDirectory()) {
                    if (file.getName().equals("product") || file.getName().equals("trans")) {
                        processFilesInSubdirectory(file, file.getName(), targetDirectory);
                    }
                }
            }
        }
    }
}
