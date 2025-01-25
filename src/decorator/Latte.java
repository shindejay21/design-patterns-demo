package decorator;

public class Latte implements ICoffee {
    @Override
    public String getCoffee() {
        return "Espresso.Latte";
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }
}