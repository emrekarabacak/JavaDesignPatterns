package abstractfactory;

public class MacOSMenu implements Menu {
    @Override
    public void select() {
        System.out.println("MacOS menu selected");
    }
}
