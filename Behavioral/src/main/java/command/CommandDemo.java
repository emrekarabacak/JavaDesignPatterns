package command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {

        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command command = new ToggleCommand(bedroomLight);

        lightSwitch.storeAndExecute(command);

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
