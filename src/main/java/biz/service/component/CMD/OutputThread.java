package biz.service.component.CMD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

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
public class OutputThread implements Runnable{
    private InputStream inputStream;

    public OutputThread(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("OUT---" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Thread start(InputStream inputStream){
        OutputThread outputThread = new OutputThread(inputStream);
        Thread thread = new Thread(outputThread);
        thread.start();
        return thread;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
