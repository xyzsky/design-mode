package Iterator;

/**
 * @Author Xyz
 * @Date 2022/7/8
 */
public class Staff {
    private String name;

    private int age;

    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                "age=" + age +
                '}';
    }
}
