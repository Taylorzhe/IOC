package wangzhe.AnnotationInjection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述：注入成员变量的三种方式：对构造方法，setter方法和成员变量Autowired。
 */
public class InjectionByMethodAndAttribute {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println("myBean = " + myBean);
    }
}
