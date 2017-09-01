package structural.bridge.habralarm.abstraction;

import structural.bridge.habralarm.realization.AlarmClockImpl;

public class LockupAlarmClock implements AlarmClock {
    protected AlarmClockImpl alarmClockImpl;
    private int hour;
    private int minute;
    boolean waitForWake;

    public LockupAlarmClock(AlarmClockImpl alarmClockImpl, int hour, int minute) {
        this.alarmClockImpl = alarmClockImpl;
        this.hour = hour;
        this.minute = minute;
        this.waitForWake = false;
    }

    public void toWake() {
        alarmClockImpl.notifyPerson();
        alarmClockImpl.ring();
    }

    public void start() {
        waitForWake = true;
        toWake();
        stop();
    }

    public void stop() {
        System.out.println("Stopped");
    }
}
