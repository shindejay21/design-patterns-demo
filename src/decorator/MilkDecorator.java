package decorator;

public class MilkDecorator extends AbstractCoffeeDecorator {

    public MilkDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffee() {
        return super.getCoffee() + "+Milk";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 00.50;
    }
}
