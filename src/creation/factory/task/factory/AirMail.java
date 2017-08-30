package creation.factory.task.factory;

import creation.factory.task.product.Plain;
import creation.factory.task.product.Transport;

public class AirMail extends PostOffice {
    public Transport sendLetters() {
        return new Plain();
    }
}
