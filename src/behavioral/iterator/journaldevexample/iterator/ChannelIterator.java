package behavioral.iterator.journaldevexample.iterator;

import behavioral.iterator.journaldevexample.channel.Channel;

public interface ChannelIterator {
    boolean hasNext();
    Channel next();
}
