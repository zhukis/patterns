package behavioral.iterator.journaldevexample;

import behavioral.iterator.journaldevexample.channel.Channel;
import behavioral.iterator.journaldevexample.collection.ChannelCollection;
import behavioral.iterator.journaldevexample.collection.ChannelCollectionImpl;
import behavioral.iterator.journaldevexample.iterator.ChannelIterator;

public class Demo {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(ChannelTypeEnum.ALL);

        while (baseIterator.hasNext()) {
            Channel channel = baseIterator.next();
            System.out.println(channel);
        }

        ChannelIterator englishIterator = channels.iterator(ChannelTypeEnum.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }
}
