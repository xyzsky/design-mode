package decorator;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class Client {
    public static void main(String[] args) {
        ICoffee originCoffee = new OriginCoffee();
        originCoffee.makeCoffee();
        System.out.println();
        originCoffee  = new MilkCoffeeDecorator(originCoffee);
        originCoffee.makeCoffee();
        System.out.println();
        originCoffee  = new SugarCoffeeDecorator(originCoffee);
        originCoffee.makeCoffee();
    }
}
