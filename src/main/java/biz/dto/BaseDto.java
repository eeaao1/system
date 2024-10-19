package biz.dto;

import lombok.Data;

@Data
public class BaseDto {
    private String userName;
    private String userId;
    private String token;

    private String pageSize;
    private String pageNo;
    private String counts;
}
