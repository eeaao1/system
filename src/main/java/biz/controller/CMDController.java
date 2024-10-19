package biz.controller;


import biz.dto.BaseDto;
import biz.service.CMDServiceImpl;
import biz.service.CacheServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/cmd")
public class CMDController {

    @Autowired
    CMDServiceImpl cmdService;

    @RequestMapping("/execSql")
    public String redisDel() {
        cmdService.execSqlFiles();
        return "success";
    }
}
