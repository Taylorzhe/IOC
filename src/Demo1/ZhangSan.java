package Demo1;

/**
 * 描述：张三想要回家和购物，他需要一辆奥迪车，奥迪车需要启动、左转、右转、停车才能到达目的地
 */
public class ZhangSan {

    public void goHome(){
        Audi audi = new Audi();
        audi.start();
        audi.turnLeft();
        audi.turnRight();
        audi.stop();
    }

    public void goShop(){
        Audi audi = new Audi();
        audi.start();
        audi.turnLeft();
        audi.turnRight();
        audi.stop();
    }

}
