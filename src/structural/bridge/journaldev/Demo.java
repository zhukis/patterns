package structural.bridge.journaldev;

import structural.bridge.journaldev.abstr.Pentagon;
import structural.bridge.journaldev.abstr.Shape;
import structural.bridge.journaldev.abstr.Triangle;
import structural.bridge.journaldev.impls.GreenColor;
import structural.bridge.journaldev.impls.RedColor;

public class Demo {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
