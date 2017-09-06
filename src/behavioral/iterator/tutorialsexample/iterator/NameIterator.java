package behavioral.iterator.tutorialsexample.iterator;

import behavioral.iterator.tutorialsexample.iterable.NameRepository;

import java.util.List;

public class NameIterator implements Iterator {
    private NameRepository data;
    private int position = 0;
    private List<String> loadedData;

    public NameIterator(NameRepository data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        if (position < loadedData.size()) {
            return true;
        }

        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return loadedData.get(position++);
        }

        return null;
    }
    private void lazyLoad() {
        if (loadedData != null) return;

        loadedData = data.getNames();
    }

}
