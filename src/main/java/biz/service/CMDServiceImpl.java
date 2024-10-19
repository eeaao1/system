package biz.service;

import biz.dto.BaseDto;
import biz.service.component.CMD.InputThread;
import biz.service.component.CMD.OutputThread;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class CMDServiceImpl {


    public static void execProjectClean() {
        File codeDir = new File("E:\\code\\new6.0-branch");
//        File codeDir = new File("E:\\code\\6.0_branch_20230901");
        File[] files = codeDir.listFiles();
        String command = "cmd /c  e: ";
        for (File f : files) {
            if (!f.getName().startsWith("T")) {
                continue;
            }
            command += " & cd E:\\code\\new6.0-branch\\" + f.getName() + "\\Sources\\DTL\\dtl & mvn clean ";
//            command += " & cd E:\\code\\6.0_branch_20230901\\" + f.getName() + "\\Sources\\backend\\dtl & mvn clean ";
//            command += " & cd E:\\code\\6.0_branch_20230901\\" + f.getName() + "\\Sources\\backend\\dtl-4.0 & mvn clean ";
//            command += " & cd E:\\code\\6.0_branch_20230901\\" + f.getName() + "\\Sources\\backend\\dtl-6.0 & mvn clean ";
//            command += " & cd E:\\code\\6.0_branch_20230901\\" + f.getName() + "\\Sources\\backend\\trust-base & mvn clean ";
//            command += " & cd E:\\code\\6.0_branch_20230901\\" + f.getName() + "\\Sources\\backend\\trust-ta & mvn clean ";
//            command += " & cd E:\\code\\6.0_branch_20230901\\" + f.getName() + "\\Sources\\DTL\\dtl & mvn clean ";
        }
//        String command = "cmd /c  dir & e: & dir & cd E:\\code\\new6.0-branch & dir";
        runtime(command);//chcp 65001 &
    }

    public static void execSqlFiles() {
        File codeDir = new File("E:\\code\\new6.0-branch");
        File[] files = codeDir.listFiles();
        String command = "cmd /c  sqlplus hsta/hsta@orcl @F:\\222\\123.sql & exit;";
//        for (File f : files) {
//            if (!f.getName().startsWith("T")) {
//                continue;
//            }
//            command += " & hsta & hsta & @F:\\222\\123.sql";
//        }
        runtime(command);
        command = "cmd /c  sqlplus hsta/hsta@orcl @F:\\222\\112.sql & exit;";
        runtime(command);
    }

    /**
     * 单条简单命令
     *
     * @param command
     */
    public static void runtime(String command) {
        try {
            Process process = Runtime.getRuntime().exec(command);
            // 如果需要获取命令执行的输出结果
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(), "GBK"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("命令执行结束，退出码：" + exitCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        execProjectClean();
    }

    /**
     * 可连续的命令
     */
    public static void processBuild() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd");
            Process process = processBuilder.start();

            // 获取进程的输入流和输出流
            InputStream inputStream = process.getInputStream();
            OutputStream outputStream = process.getOutputStream();

            // 创建读取进程输出的线程
            Thread outThread = OutputThread.start(inputStream);

            // 向进程发送命令
            String command1 = "sqlplus hsta/hsta@orcl\n";
            outputStream.write(command1.getBytes());
            outputStream.flush();

            // 创建线程来发送后续命令
            Thread inThread = InputThread.start(outputStream);
            outThread.join();
            inThread.join();
            outputStream.write("exit\n".getBytes());
            outputStream.flush();

            // 等待进程执行完毕
            int exitCode = process.waitFor();
            System.out.println(Thread.currentThread() + "---" + "Exit Code: " + exitCode);

            // 终止进程
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
