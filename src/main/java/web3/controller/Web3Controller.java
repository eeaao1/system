package biz.controller;


import biz.service.CMDServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/web3")
public class Web3Controller {

    @Autowired
    CMDServiceImpl cmdService;

    @RequestMapping("/execSql")
    public String redisDel() {
        cmdService.execSqlFiles();
        return "success";
    }
}
