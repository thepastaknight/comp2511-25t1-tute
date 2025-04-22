package trains;

import java.util.ArrayList;
import java.util.List;

public class TrainBuilder implements TrainBuilderInterface {
    private List<Wagon> wagons = new ArrayList<>();
    private int power = 0;

    public TrainBuilder() {
    }

    public TrainBuilder reset() {
        wagons = new ArrayList<>();
        return this;
    }

    public TrainBuilder addCargoWagon() {
        if (power >= CargoWagon.POWER_REQUIRED) {
            wagons.add(new CargoWagon());
            power -= CargoWagon.POWER_REQUIRED;
        } else {
            throw new IllegalStateException();
        }
        return this;
    }

    public TrainBuilder addPassengerWagon() {
        if (power >= PassengerWagon.POWER_REQUIRED) {
            wagons.add(new PassengerWagon());
            power -= PassengerWagon.POWER_REQUIRED;
        } else {
            throw new IllegalStateException();
        }
        return this;
    }

    public TrainBuilder addEngine(int power) {
        this.power += power;
        wagons.add(new Engine(power));
        return this;
    }

    public Train build() {
        return new Train(wagons);
    }
}
