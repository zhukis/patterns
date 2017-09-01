package structural.bridge.journaldev.abstr;

import structural.bridge.journaldev.impls.Color;

public class Pentagon extends Shape {
    public Pentagon(Color c) {
        super(c);
    }

    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
