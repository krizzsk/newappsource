package zendesk.support;

import com.zendesk.logger.Logger;
import ge0.C23408a;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Article implements Serializable {
    private static final String LOG_TAG = "Article";
    public static final int UNKNOWN_VOTE_COUNT = -1;
    private User author;
    private Long authorId;
    private String body;
    private boolean commentsDisabled;
    private Date createdAt;
    private boolean draft;
    private String htmlUrl;

    /* renamed from: id */
    private Long f63709id;
    private List<String> labelNames;
    private String locale;
    private boolean outdated;
    private Long sectionId;
    private String sourceLocale;
    private String title;
    private Date updatedAt;
    private String url;
    private Integer voteCount;
    private Integer voteSum;

    public User getAuthor() {
        return this.author;
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

    public int getDownvoteCount() {
        Integer num = this.voteSum;
        if (num != null && this.voteCount != null) {
            return Math.abs(num.intValue() - this.voteCount.intValue()) / 2;
        }
        Logger.m57303b("Cannot determine vote count because vote_sum and / or vote_count are null", new Object[0]);
        return -1;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public Long getId() {
        return this.f63709id;
    }

    public List<String> getLabelNames() {
        return C23408a.m57526a(this.labelNames);
    }

    public String getLocale() {
        return this.locale;
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    public String getSourceLocale() {
        return this.sourceLocale;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }

    public int getUpvoteCount() {
        Integer num = this.voteSum;
        if (num == null || this.voteCount == null) {
            Logger.m57303b("Cannot determine vote count because vote_sum and / or vote_count are null", new Object[0]);
            return -1;
        }
        return (this.voteCount.intValue() + num.intValue()) / 2;
    }

    public String getUrl() {
        return this.url;
    }

    public int getVoteCount() {
        Integer num = this.voteCount;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getVoteSum() {
        Integer num = this.voteSum;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public boolean isCommentsDisabled() {
        return this.commentsDisabled;
    }

    public boolean isDraft() {
        return this.draft;
    }

    public boolean isOutdated() {
        return this.outdated;
    }

    public void setAuthor(User user) {
        this.author = user;
    }
}
