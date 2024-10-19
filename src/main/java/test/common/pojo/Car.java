package test.common.pojo;

import lombok.Data;

@Data
public class Car <T extends Person>{

    private String carType;

    private Person person;


    public void whoDriver(T t){
        System.out.println(t.getName());
    }
}
