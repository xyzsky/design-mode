package combination;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class ItDepartment extends OrganizationComponent{

    public ItDepartment(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent organization) {
        throw new UnsupportedOperationException(this.getName() + "已经是基本部门，不能增加下属部门");
    }

    @Override
    public OrganizationComponent getChild(String orgName) {
        if (getName().equals(orgName)) {
            return this;
        }
        return null;
    }

    @Override
    public int getStaffCount() {
        return 20;
    }
}
