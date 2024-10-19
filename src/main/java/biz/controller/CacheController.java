package biz.controller;


import biz.dto.BaseDto;
import biz.service.CacheServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/cache")
public class CacheController {

    @Autowired
    private CacheServiceImpl cacheServiceImpl;

    /**
     * 字符串操作命令：
     * <p>
     * SET key value：设置键值对。
     * GET key：获取指定键的值。
     * DEL key：删除指定的键值对。
     * 哈希表操作命令：
     * <p>
     * HSET key field value：在指定键的哈希表中设置字段的值。
     * HGET key field：获取指定键的哈希表中字段的值。
     * HDEL key field：删除指定键的哈希表中的字段。
     * 列表操作命令：
     * <p>
     * LPUSH key value：将值插入到列表的左侧（头部）。
     * RPUSH key value：将值插入到列表的右侧（尾部）。
     * LPOP key：从列表的左侧弹出一个值。
     * RPOP key：从列表的右侧弹出一个值。
     * LRANGE key start stop：获取列表指定范围的值。
     * 集合操作命令：
     * <p>
     * SADD key member：将成员添加到集合中。
     * SMEMBERS key：获取集合中的所有成员。
     * SREM key member：从集合中移除指定成员。
     * 有序集合操作命令：
     * <p>
     * ZADD key score member：将成员添加到有序集合中，并指定分数。
     * ZRANGE key start stop：获取有序集合中指定范围的成员。
     * ZREM key member：从有序集合中移除指定成员。
     * 键操作命令：
     * <p>
     * EXPIRE key seconds：设置键的过期时间（秒）。
     * TTL key：获取键的剩余过期时间（秒）。
     * DEL key：删除指定的键。
     * 其他常用命令：
     * <p>
     * PING：检查服务器是否运行。
     * SELECT index：选择指定索引的数据库。
     * FLUSHDB：清空当前数据库的所有键。
     * INFO：获取服务器的信息摘要。
     * KEYS pattern：根据模式匹配获取键列表。
     */

    @RequestMapping("/redisDel")
    public String redisDel() {
        return null;
    }

    @RequestMapping("/redisAdd")
    public String redisAdd() {
        return null;
    }

    @RequestMapping("/cacheGet")
    public String cacheGet() {
        return cacheServiceImpl.cacheGet();
    }

    @RequestMapping("/cacheAdd")
    public @ResponseBody BaseDto cacheAdd() {
        return cacheServiceImpl.cacheAdd();
    }

    @RequestMapping("/cacheModify")
    public String cacheModify() {
        return null;
    }

    @RequestMapping("/cacheDel")
    public String cacheDel() {
        return null;
    }
}
