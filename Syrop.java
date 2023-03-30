package seminar1_Homework;

public class Syrop extends MilkCoffee {

    private String taste;
    public Syrop(String name, int volume, int temperature, int price, int quantity, String taste) {
        super(name, volume, temperature, price, quantity);
        this.taste = taste;
    }
    
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append (super.toString())
            .append(", Syrop ")
            .append(taste);
        return res.toString();       
        
    }

}
