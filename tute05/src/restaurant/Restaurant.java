package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import restaurant.strategy.ChargingStrategy;
import restaurant.strategy.DiscountStrat;
import restaurant.strategy.StandardStrat;

public class Restaurant {

    private ChargingStrategy strat = new StandardStrat();

    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();
    
    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public void setStrategy(ChargingStrategy strat) {
        this.strat = strat;
    } 

    public double cost(List<Meal> order, String payee) {
        return strat.cost(order, members.contains(payee));
    }

    public void displayMenu() {
        double modifier = strat.getStandardChargeModifier();
        
        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();

        String today = "Thursday";

        if (today.equals("Thursday")) {
            r.setStrategy(new DiscountStrat());
        }
    }

}