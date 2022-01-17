package builder;

/**
 * @Author Xyz
 * @Date 2022/1/17
 */

/**
 * 这样可以理解为一个简单的建造者模式，实际上还有问题。我们应该独立一个建造者类去创建对象；见 MigrantWorker2
 */
public class MigrantWorker {
    private String name;
    private int age;
    private String phone;
    private String gender;

    private MigrantWorker() {
    }

    public static MigrantWorker builder() {
        return new MigrantWorker();
    }

    public MigrantWorker setName(String name) {
        this.name = name;
        return this;
    }

    public MigrantWorker setAge(int age) {
        this.phone = phone;
        return this;
    }

    public MigrantWorker setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public MigrantWorker setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    //执行创建操作
    public MigrantWorker build() {
        validateObject(this);
        return this;
    }
    private void validateObject(MigrantWorker migrantWorker) {
        //可以做基础预校验，或自定义校验
    }
    @Override
    public String toString() {
        return "MigrantWorker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
