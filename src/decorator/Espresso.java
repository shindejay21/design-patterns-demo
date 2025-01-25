package decorator;

public class Espresso implements ICoffee {
    @Override
    public String getCoffee() {
        return "Espresso";
    }

    @Override
    public Double getPrice() {
        return 5.50;
    }

}