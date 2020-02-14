package wangzhe.AnnotationInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 */
@Configuration
@ComponentScan("wangzhe")
public class MyConfiguration {

    /**
     * 如果要是两种方式同时进行，那么优先运行返回值为字符串类型的那种
     * 如果要是在同时进行的情况下注入第一个list，则需要@Bean("stringList"),然后再在注入的时候添加@Qualifier("stringList")
     */
//    @Bean
//    public List<String> stringList(){
//        List<String> list = new ArrayList<>();
//        list.add("1111");
//        list.add("2222");
//        return list;
//    }

    @Bean("stringList")
    public List<String> stringList(){
        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("2222");
        return list;
    }

    @Bean
    @Order(44) //1.参数不需要从0开始  2.参数不需要是连续的 3.作用是调整顺序
    public String string1(){
        return "3333";
    }

    @Bean
    @Order(33)
    public String string2(){
        return "4444";
    }

//    @Bean
//    public Map<String, Integer> integerMap(){
//        Map<String, Integer> map = new HashMap<>();
//        map.put("aaa", 111);
//        map.put("bbb", 222);
//        return map;
//    }

    @Bean("int1")
    public Integer integer1(){
        return 333;
    }

    @Bean
    public Integer integer2(){
        return 444;
    }
}

