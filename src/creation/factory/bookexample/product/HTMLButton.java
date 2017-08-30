package creation.factory.bookexample.product;

public class HTMLButton implements Button {
    public void render() {
        System.out.println("Render html button");
    }

    public void onClick(String event) {
        System.out.println("HTMLButton made " + event);
    }
}
