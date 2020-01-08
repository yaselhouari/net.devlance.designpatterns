package dp03singleton;

public class Policy {
    private static Policy instance;

    private Policy() {

    }

    public static Policy Instance() {
        if(instance == null) {
            instance = new Policy();
        }
        return instance;
    }
}
