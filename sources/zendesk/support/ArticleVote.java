package zendesk.support;

import java.util.Arrays;
import java.util.Date;

public class ArticleVote {
    private Date createdAt;

    /* renamed from: id */
    private Long f63711id;
    private Long itemId;
    private String itemType;
    private Date updatedAt;
    private String url;
    private Long userId;
    private Integer value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArticleVote articleVote = (ArticleVote) obj;
        Long l = this.f63711id;
        if (l == null ? articleVote.f63711id != null : !l.equals(articleVote.f63711id)) {
            return false;
        }
        String str = this.url;
        if (str == null ? articleVote.url != null : !str.equals(articleVote.url)) {
            return false;
        }
        Long l2 = this.userId;
        if (l2 == null ? articleVote.userId != null : !l2.equals(articleVote.userId)) {
            return false;
        }
        Integer num = this.value;
        if (num == null ? articleVote.value != null : !num.equals(articleVote.value)) {
            return false;
        }
        Long l3 = this.itemId;
        if (l3 == null ? articleVote.itemId != null : !l3.equals(articleVote.itemId)) {
            return false;
        }
        String str2 = this.itemType;
        if (str2 == null ? articleVote.itemType != null : !str2.equals(articleVote.itemType)) {
            return false;
        }
        Date date = this.createdAt;
        if (date == null ? articleVote.createdAt != null : !date.equals(articleVote.createdAt)) {
            return false;
        }
        Date date2 = this.updatedAt;
        Date date3 = articleVote.updatedAt;
        if (date2 != null) {
            return date2.equals(date3);
        }
        if (date3 == null) {
            return true;
        }
        return false;
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public Long getId() {
        return this.f63711id;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getItemType() {
        return this.itemType;
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

    public Long getUserId() {
        return this.userId;
    }

    public Integer getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f63711id, this.url, this.userId, this.value, this.itemId, this.itemType, this.createdAt, this.updatedAt});
    }
}
