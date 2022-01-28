package lesson_4.garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> garage = new ArrayList<>();

        Car car = new Car("BMW", 100, 100);
        Bike bike = new Bike("JAVA", 20 );

        garage.add(car);
        garage.add(bike);

        System.out.println(garage.indexOf(bike));

        Car car1 = new Car("IMG", 100, 120);
        garage.add(car1);

        Collections.sort(garage);
        System.out.println(garage);

        ArrayList<Car> carArrayList = new ArrayList<>(Arrays.asList(new Car("BMV", 100, 12),
                new Car("AMG",120, 15), new Car("JAVA", 80, 8)));

        Collections.sort(carArrayList, new CarComparatorByValue());
        System.out.println(carArrayList);

        Collections.reverse(carArrayList);
        System.out.println(carArrayList);
    }
}
