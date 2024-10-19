package test.common.pojo;

import lombok.Data;

@Data
public class Kid extends Person{
    private   String name;
    private String address;

    private  String fahterName;
    int age;

    public void whoami(){
        System.out.println(name);
    }
}
