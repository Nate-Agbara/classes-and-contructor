import com.learning.Car;
import com.learning.CarType;

public class Main {
    public static void main(String[] args) {
        Car myfavoriteCar = new Car(25, 5, CarType.PORSCHE);
        System.out.println(myfavoriteCar);

        System.out.println(Car.COLOR);
        Car.announceCar();
    }
}