package wangzhe.project1.Human;

import wangzhe.project1.Car.Car;

/**
 * 描述：
 */
public class ZhangSan extends HumanWithCar{

    public ZhangSan(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
