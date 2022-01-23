package proxy.demo;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class RealObjectImpl implements RealObject{
    @Override
    public void doSomething() {
        System.out.println("真实对象");
    }
}
