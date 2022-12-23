package zendesk.support;

import p384bg.C13622c;

public class ArticleItem implements HelpItem {

    /* renamed from: id */
    private Long f63710id;
    private String name;
    @C13622c("section_id")
    private Long sectionId;

    public ArticleItem(Long l, Long l2, String str) {
        this.f63710id = l;
        this.sectionId = l2;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArticleItem articleItem = (ArticleItem) obj;
        Long l = this.f63710id;
        if (l == null ? articleItem.f63710id != null : !l.equals(articleItem.f63710id)) {
            return false;
        }
        Long l2 = this.sectionId;
        Long l3 = articleItem.sectionId;
        if (l2 != null) {
            return l2.equals(l3);
        }
        if (l3 == null) {
            return true;
        }
        return false;
    }

    public Long getId() {
        return this.f63710id;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return this.sectionId;
    }

    public int getViewType() {
        return 3;
    }

    public int hashCode() {
        int i;
        Long l = this.f63710id;
        int i2 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Long l2 = this.sectionId;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i3 + i2;
    }
}
