package seminar1_Homework;

public class MilkCoffee extends Drinks {

    public MilkCoffee(String name, int volume, int temperature, int price, int quantity) {
        super(name, volume, temperature, price, quantity);
       
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append (this.getName())
                .append(" : ")
                .append(super.toString());
        return res.toString();       
        
    }
    
}
