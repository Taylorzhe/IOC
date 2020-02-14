package wangzhe.AnnotationInitAndDes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：
 */
@Configuration
@ComponentScan("wangzhe/AnnotationInitAndDes")
public class TestConfiguration2 {

    @Bean(initMethod = "onInit1", destroyMethod = "onDestroy1")
    public TestBean2 testBean2(){
        return new TestBean2();
    }
}
