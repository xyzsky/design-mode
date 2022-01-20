package decorator;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class MilkCoffeeDecorator extends CoffeeDecorator{
    public MilkCoffeeDecorator(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        add();
    }

    public void add() {
        System.out.print("  加奶");
    }
}
