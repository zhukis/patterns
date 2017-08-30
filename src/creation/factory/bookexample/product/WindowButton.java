package creation.factory.bookexample.product;

public class WindowButton implements Button {
    public void render() {
        System.out.println("Render window");
    }

    public void onClick(String event) {
        System.out.println("Window did " + event);
    }
}
