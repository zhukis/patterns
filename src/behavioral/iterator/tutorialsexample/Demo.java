package behavioral.iterator.tutorialsexample;

import behavioral.iterator.tutorialsexample.iterable.NameRepository;
import behavioral.iterator.tutorialsexample.iterator.Iterator;

public class Demo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name: " + name);
        }
    }
}
