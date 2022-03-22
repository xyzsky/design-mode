package chain_of_responsibility;

/**
 * @Author Xyz
 * @Date 2022/3/22
 */
public class GroupLeader implements BudgetHandler{

    private BudgetHandler next;

    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public boolean handle(int budget) {
        if (budget < 4000) {
            System.out.println("ok，批了！");
            return true;
        }
        System.out.println("需要请示Manager");
        return next.handle(budget);
    }
}
