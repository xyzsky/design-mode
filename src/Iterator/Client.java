package Iterator;

import java.util.Iterator;

/**
 * @Author Xyz
 * @Date 2022/7/8
 */
public class Client {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Iterator<Staff> iterator = bank.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
