package objetos.parcial.examen.smarthome;
import objetos.parcial.examen.smarthome.Device.*;
import java.util.List;
public class SmartHome {

    private SmartMiniSplit miniSplit;
    private SmartSwitch smartSwitch;
    private SmartLight smartLight;
    private Smartplug smartplug;

    SmartHome(SmartMiniSplit miniSplit, SmartSwitch smartSwitch, SmartLight smartLight, Smartplug smartplug){
       this.smartLight = smartLight;
       this.miniSplit = miniSplit;
       this.smartSwitch = smartSwitch;
       this.smartplug = smartplug;
    }

    public void addDevice(Device device){
        this.addDevice(device);
    }

    public void configure(String[] deviceName, String[] command, String[] standardCommand){

    }

    public void processCommand(String command) {

    }
}
