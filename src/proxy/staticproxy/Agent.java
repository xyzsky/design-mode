package proxy.staticproxy;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class Agent implements Room{

    private Room host;

    public Agent(Room host) {
        this.host = host;
    }

    @Override
    public void sell() {
        System.out.println("-------代理人出售房子-----");
        host.sell();
    }

    @Override
    public void rent() {
        System.out.println("-------代理人出租房子-----");
        host.rent();
    }
}
