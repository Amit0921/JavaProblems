package collection.comparator.comparable;

public class Car implements Comparable<Car> {
    String carName;
    String carType;

    Car(String name,String type){
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compareTo(Car o) {
        return this.carType.compareTo(o.carType);
    }
}
