package wangzhe.project1.Human;

import wangzhe.project1.Car.Car;

/**
 * 描述：
 */
public class LiSi extends HumanWithCar{

    public LiSi(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.stop();
    }
}
