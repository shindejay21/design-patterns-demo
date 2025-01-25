package decorator;

public class WhippedCreamDecorator extends AbstractCoffeeDecorator {

    public WhippedCreamDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffee() {
        return super.getCoffee() + "+Whipped Cream";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 00.75;
    }
}
