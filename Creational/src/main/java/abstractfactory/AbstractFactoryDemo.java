package abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        // Create Factory for MacOs
        GUIFactory macOsFactory = GUIFactory.getFactory(Platform.MACOS);

        Button macOsButton = macOsFactory.createButton();
        Menu macOsMenu = macOsFactory.createMenu();

        macOsButton.click();
        macOsMenu.select();


        // Create Factory for Windows
        GUIFactory winFactory = GUIFactory.getFactory(Platform.WINDOWS);

        Button winButton = winFactory.createButton();
        Menu winMenu = winFactory.createMenu();


        winButton.click();
        winMenu.select();


    }
}
