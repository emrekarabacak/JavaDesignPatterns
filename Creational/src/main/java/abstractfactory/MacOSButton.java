package abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked MacOS button");
    }
}
