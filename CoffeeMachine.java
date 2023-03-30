package seminar1_Homework;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Drinks> drinks = new ArrayList<>();
    private int money = 0;


    public CoffeeMachine addDrink(Drinks drink){
        drinks.add(drink);
        return this;
    }
    public Drinks searchDrink(String name) {
        for (Drinks item : drinks) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
    
    public Drinks Sell(String name) throws Exception {
        Drinks purchace = searchDrink(name);
        try {
            if (!purchace.SellDrink()){
                drinks.remove(purchace);
            }
            this.money += purchace.getPrice();
        } catch (NullPointerException e) {
//            System.out.println("Товар не найден");
            throw new Exception("Товар не найден", e);
        }
        return purchace;
    }

    @Override
    public String toString() {
        StringBuilder status = new StringBuilder();
        status.append("Machine status \n");
        for (Drinks item : drinks) {
            status.append(item);
            status.append("\n");
        }
        status.append(String.format("There are %d rub in machine\n", money));
        return status.toString();
    }


}
