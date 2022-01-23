package proxy.staticproxy;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class Client {
    public static void main(String[] args) {
        Room agent = new Agent(new Host());
        agent.sell();
        agent.rent();
    }
}
