package structural.bridge.habralarm.realization;

public class MP3AlarmClockImpl implements AlarmClockImpl {
    public void ring() {
        System.out.println("Hali-gali");
    }

    public void notifyPerson() {
        System.out.println("Ta-dam!!!!!");
    }
}
