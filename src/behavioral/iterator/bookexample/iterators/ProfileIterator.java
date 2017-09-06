package behavioral.iterator.bookexample.iterators;

import behavioral.iterator.bookexample.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
