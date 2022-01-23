package proxy.dynamicproxy.cgLib;


import net.sf.cglib.proxy.Enhancer;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        // 经过测试，使用java8没问题，高版本有问题
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(host.getClass());
        enhancer.setCallback(new cgLibDynProxy());
        Host agent = (Host) enhancer.create();
        agent.rent();
        agent.sell();
    }
}
