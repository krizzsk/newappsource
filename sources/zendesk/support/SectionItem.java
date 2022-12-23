package zendesk.support;

import java.util.ArrayList;
import java.util.List;
import p384bg.C13622c;

public class SectionItem implements HelpItem {
    private List<ArticleItem> articles;
    @C13622c("category_id")
    private Long categoryId;
    @C13622c("name")
    private String name;
    @C13622c("id")
    private Long sectionId;
    @C13622c("article_count")
    private int totalArticlesCount;

    public void addArticle(ArticleItem articleItem) {
        if (this.articles == null) {
            this.articles = new ArrayList();
        }
        this.articles.add(articleItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SectionItem sectionItem = (SectionItem) obj;
        Long l = this.sectionId;
        if (l == null ? sectionItem.sectionId != null : !l.equals(sectionItem.sectionId)) {
            return false;
        }
        Long l2 = this.categoryId;
        Long l3 = sectionItem.categoryId;
        if (l2 != null) {
            return l2.equals(l3);
        }
        if (l3 == null) {
            return true;
        }
        return false;
    }

    public List<HelpItem> getChildren() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.articles);
        if (this.articles.size() < this.totalArticlesCount) {
            arrayList.add(new SeeAllArticlesItem(this));
        }
        return arrayList;
    }

    public Long getId() {
        return this.sectionId;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return this.categoryId;
    }

    public int getTotalArticlesCount() {
        return this.totalArticlesCount;
    }

    public int getViewType() {
        return 2;
    }

    public int hashCode() {
        int i;
        Long l = this.sectionId;
        int i2 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Long l2 = this.categoryId;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i3 + i2;
    }
}
