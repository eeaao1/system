package biz.service;

import biz.dao.mappers.UserBaseMapper;
import biz.dao.mappers.entity.UserBase;
import biz.dao.mappers.entity.UserBaseExample;
import biz.dto.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.List;


@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 在这里实现从数据库或其他地方加载用户信息的逻辑
        // 例如，查询数据库中是否有匹配的用户记录，并返回 CustomUserDetails 对象
        UserBaseExample example = new UserBaseExample();
        UserBaseExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(username);
        List<UserBase> userBases = userBaseMapper.selectByExample(example);
        // 示例代码，实际情况需要根据具体数据库或其他存储方式实现
        if (CollectionUtils.isEmpty(userBases)) {
            throw new UsernameNotFoundException("User not found");
        } else {
            UserBase userBase = userBases.get(0);
            return new CustomUserDetails(userBase.getUserName(), userBase.getUserPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
        }
    }
}
