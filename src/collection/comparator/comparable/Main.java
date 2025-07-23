package collection.comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("suv","petrol"));
        carList.add(new Car("sedan","diesel"));

        Collections.sort(carList);
        carList.forEach(System.out::println);
    }
}
