package visitor;

/**
 * @Author Xyz
 * @Date 2022/4/19
 */
public class WindowsRouterVisitor implements RouterVisitor{
    @Override
    public void visit(MiRouter miRouter) {
        System.out.println("=====windows访问MiRouter成功！");
    }

    @Override
    public void visit(TpLinkRouter tpLinkRouter) {
        System.out.println("=====windows访问TpLinkRouter成功！");
    }
}
