package singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        DbSingleton object1 = DbSingleton.getInstance();
        DbSingleton object2 = DbSingleton.getInstance();
        System.out.println("Created objects are equal = " + (object1 == object2));
    }
}
