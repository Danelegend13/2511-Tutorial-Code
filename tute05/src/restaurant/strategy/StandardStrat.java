package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class StandardStrat implements ChargingStrategy {

    @Override
    public double cost(List<Meal> order, boolean isMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double getStandardChargeModifier() {
        return 1;
    }
    
}
