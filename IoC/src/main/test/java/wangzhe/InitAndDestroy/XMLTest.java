package wangzhe.InitAndDestroy;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述：
 */
public class XMLTest {

    @Test
    public void test(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("InitAndDestroy/spring7.xml");
        BeanByXML bean = context.getBean("bean", BeanByXML.class);
        System.out.println("bean = " + bean);
        context.close();
    }
}
