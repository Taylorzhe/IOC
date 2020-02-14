package wangzhe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wangzhe.project2.bean3.Bean3;
import wangzhe.project2.bean3.Bean3Factory;
import wangzhe.project2.bean2.Bean2;
import wangzhe.project2.Bean1;

/**
 * 描述：实例化bean的三种方式
 */
public class BeanTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //通过构造方法实例化bean
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println("bean1 = " + bean1);

        //通过工厂模式，静态方法实例化bean
        Bean2 bean2 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2 = " + bean2);

        //通过实例方法实例化bean
        Bean3Factory bean3Factory = new Bean3Factory();
        Bean3 bean3 = context.getBean("bean3", Bean3.class);
        System.out.println("bean3 = " + bean3);
    }
}
