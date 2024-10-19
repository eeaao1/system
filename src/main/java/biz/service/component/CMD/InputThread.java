package biz.service.component.CMD;

import java.io.*;

/********************************************
 * 文件名称: OutputThread.java
 * 系统名称: 信托登记过户平台
 * 软件版权: 恒生电子股份有限公司
 * 模块名称:
 * 功能说明: 
 * 版本: 6.0
 * 开发人员: kongli26489
 * 开发时间: 2023/11/7
 * 修改记录: 修改日期    修改人员    修改说明
 *********************************************/
public class InputThread implements Runnable {
    private OutputStream outputStream;

    public InputThread(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String command = "";
            String sourceDirectory = "E:\\code\\6.0_2023_0901\\Sources\\backend\\dtl\\dtl-schema\\dtl-sql\\02.个性化开通脚本\\1_86730_长安信托\\接口校验配置"; // 源文件夹路径
            String targetDirectory = "D:\\jiaoyan"; // 目标文件夹路径
            File sourceDir = new File(sourceDirectory);
            File[] files = sourceDir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        if (file.getName().equals("product") || file.getName().equals("trans")) {
                            File[] subfiles = file.listFiles();
                            if (files != null) {
                                for (File subfile : subfiles) {
                                    command = "@" + subfile.getAbsolutePath() + "\n";
                                    System.out.println("COMMAND---" + command);
                                    outputStream.write(command.getBytes());
                                    outputStream.flush();
                                }
                            }
                        }
                    }
                }
            }
            command = "exit;\n";
            System.out.println(Thread.currentThread() + "---" + command);
            outputStream.write(command.getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Thread start(OutputStream outputStream) {
        InputThread inputThread = new InputThread(outputStream);
        Thread thread = new Thread(inputThread);
        thread.start();
        return thread;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
}
