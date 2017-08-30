package creation.factory.task;

import creation.factory.task.factory.AirMail;
import creation.factory.task.factory.GroundMail;
import creation.factory.task.factory.PostOffice;
import creation.factory.task.product.Transport;

import java.util.Random;

public class PostOfficeApplication {
    private static PostOffice postOffice;

    static {
        Random rand = new Random();
        if (rand.nextInt(2) < 1) {
            postOffice = new AirMail();
        } else {
            postOffice = new GroundMail();
        }
    }

    public static void main(String[] args) {
        Transport transport = postOffice.sendLetters();
        transport.move();
    }
}
