package biz.dto.generator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/********************************************
 * 文件名称: BaseInfo.java
 * 系统名称: 信托登记过户平台
 * 软件版权: 恒生电子股份有限公司
 * 模块名称:
 * 功能说明: 
 * 版本: 6.0
 * 开发人员: kongli26489
 * 开发时间: 2023/9/6
 * 修改记录: 修改日期    修改人员    修改说明
 *********************************************/
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseInfo {

    private String apiName;
    private String apiURI;
}
