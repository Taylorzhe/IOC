package wangzhe.AnnotationBase.test1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：
 */

@Configuration
public class MyConfiguration {
    @Bean     //什么都不写默认id=方法名
    //@Bean(value="bean2")代表id=bean2
    //@Ban({"bean2", "bean3"})可以给bean取多个id
    public Bean1 bean1(){
        return new Bean1();
    }
}
