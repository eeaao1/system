package test.classloader;

import test.Main;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

public class ClassLoaderBootStrap {

    public static void main(String[] args) throws Exception {
        System.out.println(Main.class.getClassLoader().getClass().getClassLoader());

        // 指定类文件所在的目录
        File dir = new File("./classes/");

        // 将File对象转换为URL对象
        URL url = dir.toURI().toURL();
        URL[] urls = {url};
        URLClassLoader urlClassLoader = new URLClassLoader(urls);
        Class<?> aClass = urlClassLoader.loadClass("test.common.pojo.Person");
        Object o = aClass.newInstance();
        System.out.println(aClass.getClassLoader());
        aClass.getMethod("whoami").invoke(o);

    }

    public <S> List<S> s(Class<S> f){
        return null;
    }

}
