package wangzhe.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wangzhe.project4.Bean1;
import wangzhe.project4.Bean2;

/**
 * 描述：
 */
public class SingletonTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("scope/spring3.xml");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("scope/spring3.xml");
        //单例模式：每次向spring上下文去请求bean实例的时候，spring都会返回同一个实例（在spring上下文整个生命周期中，只存在一个bean实例）
        Bean2 bean2_1 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2_1 = " + bean2_1);
        Bean2 bean2_2 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2_2 = " + bean2_2);
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println("bean1 = " + bean1);
        //多个spring上下文，只保证在一个spring上下文环境中是单例模式。
        Bean2 bean2_3 = context1.getBean("bean2", Bean2.class);
        System.out.println("bean2_3 = " + bean2_3);
        Bean2 bean2_4 = context1.getBean("bean2", Bean2.class);
        System.out.println("bean2_4 = " + bean2_4);

    }
}
