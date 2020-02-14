package wangzhe.project4;

/**
 * 描述：
 */
public abstract class Bean3 {

    protected abstract Bean2 createBean2();

    public void printBean2(){
        System.out.println("bean2 = " + createBean2());
    }

}
