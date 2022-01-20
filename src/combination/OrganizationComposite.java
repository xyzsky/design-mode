package combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */

/**
 * 组合类
 */
public class OrganizationComposite extends OrganizationComponent{

    // 用于存放子节点
    private List<OrganizationComponent> organizations = new ArrayList<>();

    public OrganizationComposite(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent organization) {
        organizations.add(organization);
    }


    @Override
    public OrganizationComponent getChild(String orgName) {
        for (OrganizationComponent org : organizations) {
            // 得到的全是叶子节点
            OrganizationComponent child = org.getChild(orgName);
            if (child != null) {
                return child;
            }
        }
        return null;
    }

    @Override
    public int getStaffCount() {
        int count = 0;
        for (OrganizationComponent organization : organizations) {
            count += organization.getStaffCount();
        }
        return count;
    }
}
