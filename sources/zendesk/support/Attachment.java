package zendesk.support;

import ge0.C23408a;
import java.util.List;

public class Attachment {
    private String contentType;
    private String contentUrl;
    private String fileName;
    private Long height;

    /* renamed from: id */
    private Long f63712id;
    private String mappedContentUrl;
    private Long size;
    private List<Attachment> thumbnails;
    private String url;
    private Long width;

    public String getContentType() {
        return this.contentType;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getHeight() {
        return this.height;
    }

    public Long getId() {
        return this.f63712id;
    }

    public Long getSize() {
        return this.size;
    }

    public List<Attachment> getThumbnails() {
        return C23408a.m57526a(this.thumbnails);
    }

    public String getUrl() {
        return this.url;
    }

    public Long getWidth() {
        return this.width;
    }
}
