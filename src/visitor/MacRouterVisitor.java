package visitor;

/**
 * @Author Xyz
 * @Date 2022/4/19
 */
public class MacRouterVisitor implements RouterVisitor{
    @Override
    public void visit(MiRouter miRouter) {
        System.out.println("=====mac访问MiRouter成功！");
    }

    @Override
    public void visit(TpLinkRouter tpLinkRouter) {
        System.out.println("=====mac访问TpLinkRouter成功！");
    }
}
