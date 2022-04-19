package visitor;

/**
 * @Author Xyz
 * @Date 2022/4/19
 */
public class TpLinkRouter implements Router{
    @Override
    public void accept(RouterVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void sendData(char[] data) {

    }
}
