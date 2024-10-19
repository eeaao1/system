package biz.dto.generator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CAInterInfo {
    private BaseInfo baseInfo;
    private List<RequestInfo> requestInfo;
}
