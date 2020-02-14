package wangzhe;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wangzhe.lazyloading.LazyBean;

/**
 * 描述：bean的懒加载
 * 适用场景：如果某个Bean在程序整个运行周期都可能不会被适用，那么可以考虑设置该Bean为懒加载
 * 优点：尽可能的节省了资源
 * 缺点：可能会导致某个操作响应时间增加
 */
public class LazyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        System.out.println("context已经被创建");
        LazyBean bean = context.getBean("bean", LazyBean.class);
        System.out.println("bean = " + bean);
    }
}
