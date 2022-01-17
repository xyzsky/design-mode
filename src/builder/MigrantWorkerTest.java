package builder;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/17
 */
public class MigrantWorkerTest {

    @Test
    public void test() {
        // 实例可以随意set改值
        MigrantWorker migrantWorker1 = MigrantWorker.builder()
                .setName("xyz")
                .setAge(25)
                .setGender("男")
                .build();
        MigrantWorker migrantWorker2 = MigrantWorker.builder()
                .setName("ttt")
                .setAge(25)
                .setPhone("12888821889")
                .setGender("男")
                .build();

        MigrantWorker migrantWorker3 = MigrantWorker.builder()
                .setName("ttt")
                .setAge(25)
                .build();

        System.out.println("man1: " + migrantWorker1);
        System.out.println("man2: " + migrantWorker2);
        System.out.println("man3: " + migrantWorker3);

    }

    @Test
    public void test2() {
        // 实例不可以随意改值
        MigrantWorker2 man1 = new MigrantWorker2.Builder()
                .setName("xyz")
                .setAge(32)
                .setPhone("1234567891234")
                .build();
        System.out.println("man1: " + man1);
    }
}
