package wangzhe.AnnotationLazyLoad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * 描述：
 */
@Configuration
@ComponentScan("wangzhe/AnnotationLazyLoad")
@Lazy
public class TestConfiguration1 {

    @Bean("testBean2")
//    @Lazy
    public TestBean1 testBean(){
        return new TestBean1();
    }
}
