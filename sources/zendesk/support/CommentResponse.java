package zendesk.support;

import ge0.C23408a;
import java.util.Date;
import java.util.List;
import p384bg.C13622c;

public class CommentResponse {
    private List<Attachment> attachments;
    private Long authorId;
    private String body;
    private Date createdAt;
    private String htmlBody;

    /* renamed from: id */
    private Long f63716id;
    @C13622c("public")
    private boolean isPublic = true;
    private String requestId;
    private String url;

    public List<Attachment> getAttachments() {
        return C23408a.m57526a(this.attachments);
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public String getHtmlBody() {
        return this.htmlBody;
    }

    public Long getId() {
        return this.f63716id;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public void setAttachments(List<Attachment> list) {
        this.attachments = list;
    }

    public void setAuthorId(Long l) {
        this.authorId = l;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setId(Long l) {
        this.f63716id = l;
    }
}
