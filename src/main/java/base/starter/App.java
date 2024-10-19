package base.starter;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;


@SpringBootApplication
@ComponentScans({
        @ComponentScan("biz.*"),
//        @ComponentScan("base.*"),
//        @ComponentScan("hundsun.test"),
        @ComponentScan("web3")
})
@MapperScan(basePackages = "biz.dao.mappers", annotationClass = Mapper.class)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
