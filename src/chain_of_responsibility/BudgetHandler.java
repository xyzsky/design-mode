package chain_of_responsibility;

public interface BudgetHandler {
    void setNextHandler(BudgetHandler nextHandler);

    boolean handle(int budget);
}
