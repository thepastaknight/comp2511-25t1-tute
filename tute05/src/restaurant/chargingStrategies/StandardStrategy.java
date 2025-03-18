package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {
    @Override
    public double getCost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double standardChargeModifier() {
        return 1;
    }
}
