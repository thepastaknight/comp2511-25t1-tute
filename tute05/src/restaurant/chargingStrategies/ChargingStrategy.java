package restaurant.chargingStrategies;

import java.util.List;

import restaurant.Meal;

public interface ChargingStrategy {
    public double getCost(List<Meal> order, boolean isMember);

    public double standardChargeModifier();
}
