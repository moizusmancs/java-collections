package collections.lecture2;

import java.util.Comparator;

public class Car implements Comparator<Car> {
    String carName;
    String carType;

    Car(){};

    Car(String carName, String carType){
        this.carName = carName;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "collections.lecture2.Car{" +
                "carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }


    @Override
    public int compare(Car o1, Car o2) {
        return  o1.carName.compareTo(o2.carName);
    }
}
