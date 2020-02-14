package wangzhe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wangzhe.AnnotationBase.test2.Bean1;
import wangzhe.AnnotationBase.test2.MyConfiguration;

/**
 * 描述：
 */
public class BaseAnnotationTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println("bean = " + bean1);
    }
}
