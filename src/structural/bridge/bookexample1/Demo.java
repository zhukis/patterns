package structural.bridge.bookexample1;

import structural.bridge.bookexample1.devices.Device;
import structural.bridge.bookexample1.devices.Radio;
import structural.bridge.bookexample1.devices.Tv;
import structural.bridge.bookexample1.remotes.AdvancedRemote;
import structural.bridge.bookexample1.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Test with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Test with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
