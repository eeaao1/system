package biz.service;

import biz.dto.BaseDto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class CacheServiceImpl {


    public String redisDel() {
        return null;
    }

    @Cacheable("cacheGet")
    public String cacheGet() {
        System.out.println("cacheGet");
        return "cacheGet";
    }
    @Cacheable(key = "")
    public BaseDto cacheAdd() {
        System.out.println("cacheAdd");
        BaseDto baseDto = new BaseDto();
        baseDto.setPageNo("1");
        baseDto.setToken("token");
        return baseDto;
    }

    public String cacheModify() {
        return null;
    }

    public String cacheDel() {
        return null;
    }
}
