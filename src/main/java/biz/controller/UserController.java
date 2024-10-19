package biz.controller;

import biz.dao.mappers.entity.UserBase;
import biz.dto.BaseResp;
import biz.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biz/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("addUser")
    public BaseResp addUser(String userName, String passWord) {
        BaseResp resp = new BaseResp();
        userService.addUser(userName, passWord);
        return resp;
    }

    @RequestMapping("getUser")
    public BaseResp getUser(String userName) {
        BaseResp resp = new BaseResp();
        UserBase user = userService.getUser(userName);

        resp.setUserId(user.getUserName());
        return resp;
    }
}
