package structural.facade.bookexample.complex_library;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1, name.length());
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
