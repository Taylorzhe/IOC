package wangzhe.InitAndDestroy;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：
 */
public class InterfaceTest {
    @Test
    public void test(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("InitAndDestroy/spring8.xml");
        BeanByInterface bean = context.getBean("bean", BeanByInterface.class);
        System.out.println("bean = " + bean);
        context.close();
    }
}
