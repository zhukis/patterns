package structural.proxy.bookexample;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    private HashMap<String, Video> internalMap;
    private Video video;

    public ThirdPartyYoutubeClass() {
        internalMap = new HashMap<>();
        video = new Video("1", "title");
        internalMap.put("first", video);
    }

    public HashMap<String, Video> popularVideos() {
        return internalMap;
    }

    @Override
    public Video getVideo(String videoId) {
        return video;
    }
}
