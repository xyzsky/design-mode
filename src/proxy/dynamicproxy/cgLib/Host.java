package proxy.dynamicproxy.cgLib;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */

//定义业务类，没有实现接口！！！
public class Host {
    public void sell() {
        System.out.println("-------房东出售房子-----");
    }
    public void rent() {
        System.out.println("-------房东出租房子-----");
    }
}
