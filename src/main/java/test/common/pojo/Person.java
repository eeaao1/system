package test.common.pojo;

import lombok.Data;

@Data
public class Person {
    private  String name;
    private  String address;
    private  int age;

    public void whoami(){
        System.out.println(name);
    }
}
