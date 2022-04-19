package visitor;

/**
 * @Author Xyz
 * @Date 2022/4/19
 */
public class LinuxRouterVisitor implements RouterVisitor{
    @Override
    public void visit(MiRouter miRouter) {
        System.out.println("=====linux访问MiRouter成功！");
    }

    @Override
    public void visit(TpLinkRouter tpLinkRouter) {
        System.out.println("=====linux访问TpLinkRouter成功！");
    }
}
