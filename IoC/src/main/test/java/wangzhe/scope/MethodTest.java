package wangzhe.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wangzhe.project4.Bean3;

/**
 * 描述：通过方法注入bean实例
 */
public class MethodTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("scope/spring5.xml");
        Bean3 bean3 = context.getBean("bean3", Bean3.class);
        bean3.printBean2();
        bean3.printBean2();
        bean3.printBean2();
        bean3.printBean2();
    }
}
