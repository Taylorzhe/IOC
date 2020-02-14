package wangzhe.InitAndDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 描述：
 */
public class BeanByInterface implements InitializingBean, DisposableBean {

    public void onInit(){
        System.out.println("Bean.onInit");
    }

    public void onDestroy(){
        System.out.println("Bean.onDestroy");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Bean.Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean.afterPropertiesSet");
    }
}
