package seminar1_Homework;

public class Drinks {
    
    private String name;
    private int volume;
    private int temperature;
    private int price;
    private int quantity;
    

    public Drinks(String name, int volume, int temperature, int price, int quantity) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
        this.quantity = quantity;        
    }

    
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean SellDrink() {
        quantity --;
        return quantity >0;       
    }

    @Override
    public String toString() {
 //       return String.format("%s : Volume %d ml, Temperature %d C, Price %d rub, Quantity %d portions", name,volume,temperature,price,quantity);           
        return String.format(" Volume %d ml, Temperature %d C, Price %d rub, Quantity %d portions", volume,temperature,price,quantity);           

    }
}
