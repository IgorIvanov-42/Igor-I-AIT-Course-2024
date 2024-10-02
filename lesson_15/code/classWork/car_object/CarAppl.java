package classWork.car_object;

import classWork.car_object.model.Car;

public class CarAppl {
    public static void main(String[] args) {

        Car myCar = new Car("VW", 2014, 15000, "silver", false);
        System.out.println(myCar.toString());

        myCar.move();
        myCar.stop();

    }



}// end of class
