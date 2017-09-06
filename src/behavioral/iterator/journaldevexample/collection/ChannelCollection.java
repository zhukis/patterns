package behavioral.iterator.journaldevexample.collection;

import behavioral.iterator.journaldevexample.channel.Channel;
import behavioral.iterator.journaldevexample.iterator.ChannelIterator;
import behavioral.iterator.journaldevexample.ChannelTypeEnum;

public interface ChannelCollection {
    void addChannel(Channel c);
    void removeChannel(Channel c);
    ChannelIterator iterator(ChannelTypeEnum type);
}
