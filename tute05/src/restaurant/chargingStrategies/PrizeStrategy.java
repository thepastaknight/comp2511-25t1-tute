package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class PrizeStrategy implements ChargingStrategy {

    @Override
    public double getCost(List<Meal> order, boolean isMember) {
        return 0;
    }

    @Override
    public double standardChargeModifier() {
        return 0;
    }

}
