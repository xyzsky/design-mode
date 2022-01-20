package decorator;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class OriginCoffee implements ICoffee{
    @Override
    public void makeCoffee() {
        System.out.print("原味咖啡");
    }
}
