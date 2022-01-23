package proxy.staticproxy;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class Host implements Room{
    @Override
    public void sell() {
        System.out.println("-------房东出售房子-----");
    }

    @Override
    public void rent() {
        System.out.println("-------房东出租房子-----");
    }
}
