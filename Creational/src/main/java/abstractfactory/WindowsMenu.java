package abstractfactory;

public class WindowsMenu implements Menu {
    @Override
    public void select() {
        System.out.println("Windows menu selected");
    }
}
