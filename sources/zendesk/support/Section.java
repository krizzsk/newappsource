package zendesk.support;

import java.io.Serializable;
import java.util.Date;
import p384bg.C13622c;

public class Section implements Serializable {
    @C13622c("article_count")
    private int articlesCount;
    private Long categoryId;
    private Date createdAt;
    private String description;
    private String htmlUrl;

    /* renamed from: id */
    private Long f63726id;
    private String locale;
    private String name;
    private boolean outdated;
    private int position;
    private String sorting;
    private String sourceLocale;
    private Date updatedAt;
    private String url;

    public int getArticlesCount() {
        return this.articlesCount;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public String getDescription() {
        return this.description;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public Long getId() {
        return this.f63726id;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public String getSorting() {
        return this.sorting;
    }

    public String getSourceLocale() {
        return this.sourceLocale;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isOutdated() {
        return this.outdated;
    }
}
