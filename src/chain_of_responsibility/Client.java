package chain_of_responsibility;

/**
 * @Author Xyz
 * @Date 2022/3/22
 */
public class Client {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        CFO cfo = new CFO();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(cfo);
        //我职位太低，只能请示小组leader
        System.out.println("希望买台电脑，预算5000");
        if (groupLeader.handle(5000)) {
            System.out.println("谢谢leader");
        } else {
            System.out.println("okok我再降低预算");
        }
    }
}
