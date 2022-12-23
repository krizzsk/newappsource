package zendesk.support;

import java.io.Serializable;

public class SimpleArticle implements Serializable {

    /* renamed from: id */
    private Long f63727id;
    private String title;

    public SimpleArticle(Long l, String str) {
        this.f63727id = l;
        this.title = str;
    }

    public Long getId() {
        return this.f63727id;
    }

    public String getTitle() {
        return this.title;
    }
}
