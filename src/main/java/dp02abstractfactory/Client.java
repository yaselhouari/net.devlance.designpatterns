package dp02abstractfactory;

/*
    Providing an interface for creating families of related or
    dependent objects without specifying their concrete classes.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1 ();
        factory.createProductA ();
    }
}
