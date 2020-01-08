package dp01factorymethod;

/*
    Defining an interface for creating an object, but letting
    subclasses of that object decide which class to instantiate.
    This lets a class differ instantiation to subclasses.
 */
public class Client {
    public static void main(String[] args) {
        CreditUnionFactory factory = new SavingsAccountFactory ();
        SavingsAccount account = factory.createSavingsAccount ( "CITI" );

        System.out.println (account.Balance);
    }
}
