package visitor;

/**
 * @Author Xyz
 * @Date 2022/4/19
 */
public interface RouterVisitor {
    void visit(MiRouter miRouter);

    void visit(TpLinkRouter tpLinkRouter);
}
