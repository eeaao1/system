package test.common.pojo;

import lombok.Data;

@Data
public class Daughter extends Person{
    private String name;
    private String address;

    private String fahterName;
    private int age;

    public void whoami(){
        System.out.println(name);
    }
}
