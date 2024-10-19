package biz.dto.generator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestInfo {

    private String paramKey;
    private String paramType;
    private String paramNotNull;
    private String paramName;
    private List<RequestInfo> childList;
}
