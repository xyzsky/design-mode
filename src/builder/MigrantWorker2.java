package builder;

import org.junit.platform.commons.util.StringUtils;

/**
 * @Author Xyz
 * @Date 2022/1/17
 */

/**
 * 如果我们并不是很关心对象是否有短暂的无效状态，也不是太在意对象是否是可变的; 则用 MigrantWork 即可
 */
public class MigrantWorker2 {
    private String name;
    private int age;
    private String phone;
    private String gender;

    private MigrantWorker2(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.gender = builder.gender;
    }

    public static class Builder {

        private String name;
        private int age;
        private String phone;
        private String gender;

        public MigrantWorker2 build() {
            return new MigrantWorker2(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            if (phone.length() != 13) {
                throw new RuntimeException("phone 输入错误");
            }
            this.phone = phone;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }
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
