package decorator;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class SugarCoffeeDecorator extends CoffeeDecorator{
    public SugarCoffeeDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        add();
    }

    public void add() {
        System.out.println("  加糖");
    }
}
