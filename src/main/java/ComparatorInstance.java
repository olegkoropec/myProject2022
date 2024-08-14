import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car {
    private int manufactureYear;
    private String model;
    private int maxSpeed;
    public Car(int manufactureYear, String model, int maxSpeed) {
        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public String toString() {
        return "Car{" +
                "manufactureYear=" + manufactureYear +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}

class MaxSpeedCarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
    }
}

class Years implements Comparator<Car>{

    @Override
    public int compare(Car car, Car t1) {
        if (car.getManufactureYear() > t1.getManufactureYear())
        return 1;
        else
            return -1;
    }
}

public class ComparatorInstance {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);
        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        Comparator <Car> carSpeed = new MaxSpeedCarComparator();
        Comparator <Car> carYear = new Years();

//        Collections.sort(cars, carSpeed);
        Collections.sort(cars, carYear);
        cars.stream().forEach(System.out::println);
    }
}