package seminar1_Homework;

public class PureCoffee extends Drinks  {

    public PureCoffee(String name, int volume, int temperature, int price, int quantity) {
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
