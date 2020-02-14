package wangzhe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wangzhe.project3.Bean;

/**
 * 描述：注入bean的方式
 */
public class InjectionTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean = " + bean);
        System.out.println("-----------------------------------------------------------");
        System.out.println("bean.getStringList() = " + bean.getStringList());
        System.out.println("bean.getStringSet() = " + bean.getStringSet());
        System.out.println("bean.getStringMap() = " + bean.getStringMap());
        System.out.println("bean.getProperties() = " + bean.getProperties());
        System.out.println("bean.getAnotherBean2() = " + bean.getAnotherBean2());
    }
}
