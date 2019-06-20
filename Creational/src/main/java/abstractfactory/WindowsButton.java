package abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked windows button");
    }
}
