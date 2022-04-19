package visitor;

public interface Router {
    void accept(RouterVisitor visitor);

    void sendData(char[] data);
}
