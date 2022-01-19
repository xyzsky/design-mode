package prototype;

/**
 * @Author Xyz
 * @Date 2022/1/19
 */
public class PrototypeA implements Prototype{

    private String name;

    private int age;

    public PrototypeA(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public PrototypeA clone() throws CloneNotSupportedException {
        System.out.println("------ Clone new object A---------");
        // 实际调用的是 Object.clone() 方法
        return (PrototypeA) super.clone();
    }

    @Override
    public String toString() {
        return "PrototypeA{" +
                "name='" + name + '\'' +
                "age=" + age +
                '}';
    }
}
