package behavioral.iterator.journaldevexample.collection;

import behavioral.iterator.journaldevexample.ChannelTypeEnum;
import behavioral.iterator.journaldevexample.channel.Channel;
import behavioral.iterator.journaldevexample.iterator.ChannelIterator;
import behavioral.iterator.journaldevexample.iterator.ChannelIteratorImpl;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channellList;

    public ChannelCollectionImpl() {
        this.channellList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        this.channellList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channellList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channellList);
    }
}
