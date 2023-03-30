package seminar1_Homework;

public class main {
    public static void main(String[] args) {
        CoffeeMachine bestCoffee = new CoffeeMachine();
        bestCoffee.addDrink(new PureCoffee("Espresso", 100, 85, 100, 10))
        .addDrink(new MilkCoffee("Americano", 200, 90, 150, 10))
        .addDrink(new MilkCoffee("Latte", 300, 80, 200, 15))
        .addDrink(new Syrop("Hazelnut Cappuccino", 350, 80, 350, 10, "Hazelnut"))
        .addDrink(new Syrop("Coconut Cappuccino", 350, 80, 350, 10, "Coconut"));

        System.out.println(bestCoffee);
        SellCoffee(bestCoffee, "Latte");
        SellCoffee(bestCoffee, "Latte");
        SellCoffee(bestCoffee, "Coconut Cappuccino");

        System.out.println(bestCoffee);

    }

        public static void SellCoffee (CoffeeMachine machine, String drink){
            try{
                System.out.println("Sold "+machine.Sell(drink)+"\n");
            } catch (Exception e) {
                System.out.println("Товар не найден");
            }
        }
    }

