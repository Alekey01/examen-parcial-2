package objetos.parcial.examen.smarthome;

import objetos.parcial.examen.smarthome.Device;
public class SmartMiniSplit extends Device {

    public SmartMiniSplit(String string) {
        super(string);
    }
    public void turnOn() {
        System.out.println(getName() + ":"+"Encendiendo: mini split");
    }
    public void turnOff() {
        System.out.println(getName() + ":"+"Apagando: mini split");
    }
}