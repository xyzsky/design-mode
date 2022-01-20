package decorator;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public abstract class CoffeeDecorator implements ICoffee{
    private ICoffee coffee;

    public CoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
    }
}
