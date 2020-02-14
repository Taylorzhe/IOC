package wangzhe;

import org.junit.Before;
import org.junit.Test;
import wangzhe.project1.Car.Audi;
import wangzhe.project1.Car.Buick;
import wangzhe.project1.Human.Human;
import wangzhe.project1.Human.LiSi;
import wangzhe.project1.Human.ZhangSan;
import wangzhe.project1.IoCContainer;

/**
 * 描述：简单实现一个自己的IOC
 */
public class IoCTest {
    private IoCContainer ioCContainer = new IoCContainer();
    @Before
    public void before(){
        ioCContainer.setBean(Audi.class, "audi");
        ioCContainer.setBean(Buick.class, "buick");
        ioCContainer.setBean(ZhangSan.class, "zhangsan", "audi");
        ioCContainer.setBean(LiSi.class, "lisi", "buick");
    }

    @Test
    public void Test(){
        Human zhangsan = (Human) ioCContainer.getBean("zhangsan");
        zhangsan.goHome();
        Human lisi = (Human) ioCContainer.getBean("lisi");
        lisi.goHome();
    }
}
