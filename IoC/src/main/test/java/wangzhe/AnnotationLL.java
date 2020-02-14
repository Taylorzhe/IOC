package wangzhe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wangzhe.AnnotationLazyLoad.TestBean1;
import wangzhe.AnnotationLazyLoad.TestConfiguration1;

/**
 * 描述：
 */
public class AnnotationLL {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration1.class);
        System.out.println("context init");
        TestBean1 testBean1 = context.getBean("testBean1", TestBean1.class);
        System.out.println("testBean1 = " + testBean1);
        TestBean1 testBean2 = context.getBean("testBean2", TestBean1.class);
        System.out.println("testBean2 = " + testBean2);

    }
}
