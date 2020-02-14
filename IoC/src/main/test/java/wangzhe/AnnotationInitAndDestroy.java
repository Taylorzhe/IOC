package wangzhe;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import wangzhe.AnnotationInitAndDes.TestBean2;
import wangzhe.AnnotationInitAndDes.TestConfiguration2;



/**
 * 描述：
 */
public class AnnotationInitAndDestroy {
    @Test
    public void test(){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration2.class);
        TestBean2 testBean2 = context.getBean("testBean2", TestBean2.class);
        System.out.println("testBean = " + testBean2);
        context.close();
    }
}
