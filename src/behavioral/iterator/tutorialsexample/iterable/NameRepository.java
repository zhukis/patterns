package behavioral.iterator.tutorialsexample.iterable;

import behavioral.iterator.tutorialsexample.iterator.Iterator;
import behavioral.iterator.tutorialsexample.iterator.NameIterator;

import java.util.Arrays;
import java.util.List;

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(this);
    }

    public List<String> getNames() {
        return Arrays.asList(names);
    }
}
