package decorator;

public class CoffeeShop {
    public static void main(String[] args) {

        ICoffee latte = new Latte();
        System.out.println("Coffee Description :" + latte.getCoffee() + " | Coffee Price :" + latte.getPrice());

        ICoffee milkedLatte = new MilkDecorator(latte);
        System.out.println("Coffee Description :" + milkedLatte.getCoffee() + " | Coffee Price :" + milkedLatte.getPrice());

        ICoffee milkedLatteWithSugar = new SugarDecorator(milkedLatte);
        System.out.println("Coffee Description :" + milkedLatteWithSugar.getCoffee() + " | Coffee Price :" + milkedLatteWithSugar.getPrice());

        ICoffee milkedLatteWithSugarAndWhippedCream = new WhippedCreamDecorator(milkedLatteWithSugar);
        System.out.println("Coffee Description :" + milkedLatteWithSugarAndWhippedCream.getCoffee() + " | Coffee Price :" + milkedLatteWithSugarAndWhippedCream.getPrice());

    }
}