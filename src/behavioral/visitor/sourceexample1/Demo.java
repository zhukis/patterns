package behavioral.visitor.sourceexample1;

import behavioral.visitor.sourceexample1.element.BAR;
import behavioral.visitor.sourceexample1.element.BAZ;
import behavioral.visitor.sourceexample1.element.Element;
import behavioral.visitor.sourceexample1.element.FOO;
import behavioral.visitor.sourceexample1.visitor.DownVisitor;
import behavioral.visitor.sourceexample1.visitor.UpVisitor;

public class Demo {
    public static void main(String[] args) {
        Element[] list = {new FOO(), new BAR(), new BAZ()};
        UpVisitor upVisitor = new UpVisitor();
        DownVisitor downVisitor = new DownVisitor();

        for (Element element : list) {
            element.accept(upVisitor);
        }

        for (Element element : list) {
            element.accept(downVisitor);
        }
    }
}
