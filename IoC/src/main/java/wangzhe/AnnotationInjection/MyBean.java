package wangzhe.AnnotationInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 描述：
 */
@Component
public class MyBean {

    private AnotherBean anotherBean1;
    private AnotherBean anotherBean2;
    @Autowired
    private AnotherBean anotherBean3;

    private List<String> stringList;
    private Map<String, Integer> integerMap;

    private String string;

    private ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }

    @Autowired
    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public String getString() {
        return string;
    }

    @Value("5555")  //如果注入的数据类型是一个基本的数据类型，可以通过Value标签直接注入
    public void setString(String string) {
        this.string = string;
    }

    public Map<String, Integer> getIntegerMap() {
        return integerMap;
    }

    @Autowired
    public void setIntegerMap(Map<String, Integer> integerMap) {
        this.integerMap = integerMap;
    }

    public List<String> getStringList() {
        return stringList;
    }

    @Autowired
    @Qualifier("stringList")
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    /**
     * 通过构造函数来注入bean
     * @param anotherBean1
     */
    @Autowired
    public MyBean(AnotherBean anotherBean1) {
        this.anotherBean1 = anotherBean1;
    }

    /**
     * 通过setter方法来注入bean
     * @param anotherBean2
     */
    @Autowired
    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "anotherBean1=" + anotherBean1 +
                ", anotherBean2=" + anotherBean2 +
                ", anotherBean3=" + anotherBean3 +
                '}';
    }
}
