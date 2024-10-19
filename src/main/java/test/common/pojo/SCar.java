package test.common.pojo;

import lombok.Data;

@Data
public class SCar<T>{

    private String carType;

    private T person;

}
