package strategy;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */
public class Client {
    public static void main(String[] args) {
        Promotional promotional = new Promotional();
        promotional.recommend(new SecondsKill(), "123");
        promotional.recommend(new Discount(), "344");
        promotional.recommend(new FullReduceStrategy(), "898");
    }
}
