package wangzhe.project1.Human;

import wangzhe.project1.Car.Car;

/**
 * 描述：
 */
public abstract class HumanWithCar implements Human{

    protected Car car;

    public HumanWithCar(Car car) {
        this.car = car;
    }

    public abstract void goHome();
}
