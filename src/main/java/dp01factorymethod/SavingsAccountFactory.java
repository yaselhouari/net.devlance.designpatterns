package dp01factorymethod;

// Concrete Creators
public class SavingsAccountFactory implements CreditUnionFactory {
   public SavingsAccount createSavingsAccount(String acctNo) {
        if (acctNo.equals ("CITI")) {
            return new CitiSavingsAccount();
        }
        else if (acctNo.equals ("NATIONAL")) {
            return new NationalSavingsAccount(); }
        else
            throw new IllegalArgumentException ();
    }
}
