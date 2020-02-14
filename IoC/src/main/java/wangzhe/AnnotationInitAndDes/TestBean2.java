package wangzhe.AnnotationInitAndDes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 描述：
 */
@Component
public class TestBean2 implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("TestBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestBean.afterPropertiesSet");
    }

    @PostConstruct
    public void onInit(){
        System.out.println("TestBean.onInit");
    }

    @PreDestroy
    public void onDestroy(){
        System.out.println("TestBean.onDestroy");
    }

    public void onInit1(){
        System.out.println("TestBean.onInit1");
    }

    public void onDestroy1(){
        System.out.println("TestBean.onDestroy1");
    }
}
