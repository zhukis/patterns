package behavioral.iterator.journaldevexample.iterator;

import behavioral.iterator.journaldevexample.ChannelTypeEnum;
import behavioral.iterator.journaldevexample.channel.Channel;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {
    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position = 0;

    public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
        this.type = type;
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        if (position < channels.size())
            return true;
        else
            return false;
    }

    @Override
    public Channel next() {
        if (hasNext())
            return channels.get(position++);
        else
            return null;
    }
}
