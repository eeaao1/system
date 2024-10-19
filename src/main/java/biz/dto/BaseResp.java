package biz.dto;


import lombok.Data;

@Data
public class BaseResp extends BaseDto {

    private String retuenCode = "0";
    private String retuenMsg = "success";

    private String json;
}
