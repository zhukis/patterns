package structural.proxy.wikiexample;

import structural.proxy.wikiexample.interf.IMath;
import structural.proxy.wikiexample.proxy.MathProxy;

public class Demo {
    public static void main(String[] args) {
        IMath p = new MathProxy();

        System.out.println("4 + 2 = " + p.add(4, 2));
        System.out.println("4 - 2 = " + p.sub(4, 2));
        System.out.println("4 * 2 = " + p.mul(4, 2));
        System.out.println("4 / 2 = " + p.div(4, 2));
    }
}
