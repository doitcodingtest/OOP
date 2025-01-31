import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("벤츠EQS", 13000, true));
        carList.add(new Car("BMW520", 6000, false));

        for(Car car : carList){
            car.printCarInfo();
        }
    }
}
