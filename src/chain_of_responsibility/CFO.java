package chain_of_responsibility;

/**
 * @Author Xyz
 * @Date 2022/3/22
 */
public class CFO implements BudgetHandler{

    private BudgetHandler next;

    @Override
    public void setNextHandler(BudgetHandler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public boolean handle(int budget) {
        if (budget < 10000) {
            System.out.println("cfo: 批了！");
            return true;
        }
        if (next != null) {
            return next.handle(budget);
        }
        System.out.println("顶不住了");
        return false;
    }
}
