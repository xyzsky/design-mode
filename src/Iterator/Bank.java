package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Xyz
 * @Date 2022/7/8
 */
public class Bank implements Iterable<Staff> {

    private final List<Staff> staffList = new ArrayList<>();

    public Bank() {
        staffList.add(new Staff("张三", 12));
        staffList.add(new Staff("李四", 15));
        staffList.add(new Staff("王五", 44));
    }

    public boolean addStaff(Staff staff) {
        return staffList.add(staff);
    }

    public boolean removeStaff(Staff staff) {
        return staffList.remove(staff);
    }

    @Override
    public Iterator<Staff> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Staff> {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < staffList.size()) {
                return  true;
            }
            return false;
        }

        @Override
        public Staff next() {
            Staff staff = staffList.get(index);
            index++;
            return staff;
        }
    }
}
