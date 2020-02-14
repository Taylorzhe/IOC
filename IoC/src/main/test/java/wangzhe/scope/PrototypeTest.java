package wangzhe.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wangzhe.project4.Bean1;
import wangzhe.project4.Bean2;

/**
 * 描述：
 */
public class PrototypeTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("scope/spring4.xml");
        //多例模式：每次向spring上下文去请求bean实例的时候，spring都会返回全新的实例
        Bean2 bean2_1 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2_1 = " + bean2_1);
        Bean2 bean2_2 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2_2 = " + bean2_2);
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println("bean1 = " + bean1);
    }
}
