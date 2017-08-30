package creation.factory.task.factory;

import creation.factory.task.product.Transport;

public abstract class PostOffice {

    public void open() {
        System.out.println("Office opened");
    }

    public abstract Transport sendLetters();
}
