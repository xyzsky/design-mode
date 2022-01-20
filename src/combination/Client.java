package combination;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComposite company = new OrganizationComposite("总公司");
        ItDepartment itDepartment = new ItDepartment("It部门");
        company.add(itDepartment);
        company.add(new ItDepartment("管理部门"));
        company.add(new ItDepartment("财务部门"));
        int staffCount = company.getStaffCount();
        System.out.println(staffCount);
        System.out.println(company.getChild("管理部门"));

        ///// 组合-组合-子
        OrganizationComponent bigCompany = new OrganizationComposite("大公司");
        OrganizationComponent beiJin = new OrganizationComposite("北京公司");
        OrganizationComponent shanghai = new OrganizationComposite("上海公司");
        bigCompany.add(beiJin);
        bigCompany.add(shanghai);
        beiJin.add(itDepartment);
        beiJin.add(new ItDepartment("北京财务公司"));
        shanghai.add(new ItDepartment("上海it公司"));
        shanghai.add(new ItDepartment("上海财务公司"));
        System.out.println(bigCompany.getStaffCount());
        System.out.println(bigCompany.getChild("北京财务公司").getStaffCount());

        ///
        AbstractNode rootNode = new Node();
        rootNode.setId(0);
        rootNode.setParentId(-1);
        AbstractNode node1 = new Node();
        node1.add(new Leaf());
        node1.add(new Leaf());
        rootNode.add(new Leaf());
        rootNode.add(new Leaf());
        rootNode.add(node1);

        System.out.println(node1.getId());
    }
}
