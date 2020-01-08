package dp01factorymethod;

// Abstract Creator
public interface CreditUnionFactory {
    public SavingsAccount createSavingsAccount(String acctNo);
}
