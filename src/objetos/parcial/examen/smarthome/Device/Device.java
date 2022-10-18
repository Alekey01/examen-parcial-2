package objetos.parcial.examen.smarthome.Device;

import objetos.parcial.examen.smarthome.SmartHome;

public abstract class Device extends SmartHome {

    private String name;

    public Device(String name,){
        super();
        this.name = name;
    }


}
