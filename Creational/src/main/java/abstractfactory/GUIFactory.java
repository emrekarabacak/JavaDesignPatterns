package abstractfactory;

abstract class GUIFactory {

    static GUIFactory getFactory(Platform platforms) {
        switch (platforms) {
            case MACOS:
                return new MacOSGUIFactory();
            case WINDOWS:
                return new WindowsGUIFactory();
            default:
                throw new IllegalArgumentException();
        }
    }

    abstract Button createButton();

    abstract Menu createMenu();
}
