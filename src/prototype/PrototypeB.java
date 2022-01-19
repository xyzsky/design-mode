package prototype;

/**
 * @Author Xyz
 * @Date 2022/1/19
 */
public class PrototypeB implements Prototype{
    @Override
    public PrototypeB clone() throws CloneNotSupportedException {
        System.out.println("------ Clone new object B---------");
        return (PrototypeB) super.clone();
    }
}
