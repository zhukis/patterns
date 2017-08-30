package creation.factory.task.factory;

import creation.factory.task.product.Transport;
import creation.factory.task.product.Truck;

public class GroundMail extends PostOffice {
    public Transport sendLetters() {
        return new Truck();
    }
}
