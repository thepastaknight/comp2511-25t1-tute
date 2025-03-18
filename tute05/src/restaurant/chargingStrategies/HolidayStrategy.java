package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public class HolidayStrategy implements ChargingStrategy {

    @Override
    public double getCost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }

    @Override
    public double standardChargeModifier() {
        return 1.15;
    }

}
