package decorator;

public class SugarDecorator extends AbstractCoffeeDecorator {

    public SugarDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getCoffee() {
        return super.getCoffee() + "+Sugar";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 00.00;
    }
}
