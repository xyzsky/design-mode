package visitor;

/**
 * @Author Xyz
 * @Date 2022/4/19
 */
public class Client {
    public static void main(String[] args) {
        RouterComposite routerComposite = new RouterComposite();
        routerComposite.startSendData(new WindowsRouterVisitor());
        routerComposite.startSendData(new LinuxRouterVisitor());
        routerComposite.startSendData(new MacRouterVisitor());
    }
}
