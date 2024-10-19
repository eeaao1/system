package biz.controller;

import biz.dao.mappers.*;
import biz.dto.generator.CAInterInfo;
import biz.dto.generator.RequestInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

@RestController
@RequestMapping("/tools/generator")
public class JavaPojoGeneratorController {

    @Autowired
    private TblockcolumnsMapper tblockcolumnsMapper;
    @Autowired
    private TblockcontrolsMapper tblockcontrolsMapper;
    @Autowired
    private TinstinterinputconfigMapper tinstinterinputconfigMapper;
    @Autowired
    private TquerycolumnMapper tquerycolumnMapper;
    @Autowired
    private TbapiqueryconfigMapper tbapiqueryconfigMapper;
    @Autowired
    private TapiqueryconfigMapper tapiqueryconfigMapper;
    @Autowired
    private TbmsapimanagerMapper tbmsapimanagerMapper;
    @Autowired
    private TinterfaceMapper tinterfaceMapper;

    /**
     * tblockcolumns --- TINSTINTERINPUTCONFIG
     * C_NAME
     */

    @RequestMapping("/pojo")
    public String pojo(String test) {
        try {
            // 从文件中读取 JSON 数据
            File jsonFile = new File("F:\\dingding_download\\eoLinker_api_export_20230906104837.json");
            ObjectMapper objectMapper = new ObjectMapper();
            // 将 JSON 数据转换为 Person 对象
            CAInterInfo[] interInfos = objectMapper.readValue(jsonFile, CAInterInfo[].class);
            // 初始化Velocity引擎
            VelocityEngine velocityEngine = new VelocityEngine();
            velocityEngine.init();
            for (CAInterInfo apiInfo : interInfos) {
                String className = apiInfo.getBaseInfo().getApiName();
                String uri = apiInfo.getBaseInfo().getApiURI();
                List<RequestInfo> requestInfoList = apiInfo.getRequestInfo();

                // 创建Velocity上下文
                VelocityContext context = new VelocityContext();
               String busName =  uri.substring(uri.lastIndexOf("/")+1);
                if (busName.equals("pageQuery")){
                    className.replaceAll("\\\\","");
                    context.put("className", className);
                }else{
                    context.put("className", Character.toUpperCase(busName.charAt(0)) + busName.substring(1));
                }
                context.put("requestInfoList", requestInfoList);

                Properties p = new Properties();
                p.setProperty("resource.loader", "class");
                p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
                Velocity.init( p );
                // 获取模板文件
//                velocityEngine.setProperty("file.resource.loader.path", "E:\\code\\my\\system\\src\\main\\resources\\vm");
                Template template = Velocity.getTemplate("vm/dto.vm");
//                Template template = velocityEngine.getTemplate("E:\\code\\my\\system\\src\\main\\resources\\vm\\dto.vm");
                try {
                    // 指定生成的Java文件的输出路径和名称
                    String outputFileName = "E:\\code\\6.0_2023_0901\\Sources\\backend\\dtl\\dtl-cloud\\dtl-cloud-api" +
                            "\\src\\main\\java\\com\\hundsun\\trust\\cloud\\api\\core\\dto\\generatorDto\\" + context.get("className") + ".java";
                    Writer writer = new FileWriter(outputFileName);
                    // 填充模板并生成文件
                    template.merge(context, writer);
                    writer.close();
                    System.out.println("生成文件：" + outputFileName);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("/trans")
    public String trans(String test) {
        File trans = new File("F:\\dingding_download\\trans.txt");
        try (Writer writer = new FileWriter(trans);){
            // 从文件中读取 JSON 数据
            File jsonFile = new File("F:\\dingding_download\\eoLinker_api_export_20230906104837.json");
            ObjectMapper objectMapper = new ObjectMapper();
            // 将 JSON 数据转换为 Person 对象
            CAInterInfo[] interInfos = objectMapper.readValue(jsonFile, CAInterInfo[].class);
            // 初始化Velocity引擎
            VelocityEngine velocityEngine = new VelocityEngine();
            velocityEngine.init();
            for (CAInterInfo apiInfo : interInfos) {
                String uri = apiInfo.getBaseInfo().getApiURI();
                String busName =  uri.substring(uri.lastIndexOf("/")+1);
                if (!busName.equals("pageQuery") && uri.contains("trans")){
                    writer.write(apiInfo.getBaseInfo().getApiName());
                    writer.write("----");
                    writer.write(apiInfo.getBaseInfo().getApiURI());
                    writer.write("\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}
