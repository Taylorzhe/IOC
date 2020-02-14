package wangzhe.AnnotationLazyLoad;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * 描述：
 */
@Component("testBean1")
@Lazy
public class TestBean1 {

    public TestBean1() {
        System.out.println("TestBean init" );
    }
}
