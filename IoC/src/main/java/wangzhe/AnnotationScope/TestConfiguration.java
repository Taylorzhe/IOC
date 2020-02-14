package wangzhe.AnnotationScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 描述：
 */
@Configuration
@ComponentScan("wangzhe/AnnotationScope")
public class TestConfiguration {

    @Bean("testBean1")
    @Scope("prototype")
    public TestBean testBean(){
        return new TestBean();
    }
}
