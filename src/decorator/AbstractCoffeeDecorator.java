package decorator;

public abstract class AbstractCoffeeDecorator implements ICoffee {
    protected ICoffee coffee;

    public AbstractCoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getCoffee() {
        return coffee.getCoffee();
    }

    @Override
    public Double getPrice() {
        return coffee.getPrice();
    }
}
