package trains;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Wagon> cars = new ArrayList<>();

    public Train(List<Wagon> cars) {
        this.cars = cars;
    }

    public int numberOfCars() {
        return cars.size();
    }

    public static void main(String[] args) {
        TrainBuilder trainBuilder = new TrainBuilder();
        Train t = trainBuilder
            .addEngine(1500)
            .addCargoWagon()
            .addPassengerWagon()
            .build();
        System.out.println(t.numberOfCars());
    }
}
