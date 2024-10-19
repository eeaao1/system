package biz.service;

import biz.dao.mappers.CropMapper;
import biz.dao.mappers.UserBaseMapper;
import biz.dao.mappers.entity.UserBase;
import biz.dao.mappers.entity.UserBaseExample;
import io.netty.util.internal.ObjectUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.UUID;

/********************************************
 * 文件名称: UserServiceImpl.java
 * 系统名称: 信托登记过户平台
 * 软件版权: 恒生电子股份有限公司
 * 模块名称:
 * 功能说明: 
 * 版本: 6.0
 * 开发人员: kongli26489
 * 开发时间: 2023/8/10
 * 修改记录: 修改日期    修改人员    修改说明
 *********************************************/
@Component
public class UserServiceImpl {
    @Autowired
    private UserBaseMapper userBaseMapper;

    public void addUser(String userName, String passWord) {
        UserBase userBase = new UserBase();
        userBase.setUserName(userName);
        userBase.setUserId(UUID.randomUUID().toString());
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userBase.setUserPassword(passwordEncoder.encode(passWord));
        userBaseMapper.insert(userBase);
    }

    public UserBase getUser(String userName) {
        UserBaseExample userBaseExample = new UserBaseExample();
        userBaseExample.createCriteria().andUserNameEqualTo(userName);
        List<UserBase> userBases = userBaseMapper.selectByExampleWithPage(userBaseExample, new RowBounds(0, 2));
        return ObjectUtils.isEmpty(userBases) ? new UserBase() : userBases.get(0);
    }
}
