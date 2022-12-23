package zendesk.support;

import ge0.C23410c;
import java.util.Locale;

public class SuggestedArticleSearch {
    /* access modifiers changed from: private */
    public Long categoryId;
    /* access modifiers changed from: private */
    public String labelNames;
    /* access modifiers changed from: private */
    public Locale locale;
    /* access modifiers changed from: private */
    public String query;
    /* access modifiers changed from: private */
    public Long sectionId;

    public static class Builder {
        private Long categoryId;
        private String[] labelNames;
        private Locale locale;
        private String query;
        private Long sectionId;

        public SuggestedArticleSearch build() {
            SuggestedArticleSearch suggestedArticleSearch = new SuggestedArticleSearch();
            String unused = suggestedArticleSearch.query = this.query;
            Locale unused2 = suggestedArticleSearch.locale = this.locale;
            String unused3 = suggestedArticleSearch.labelNames = C23410c.m57536d(this.labelNames);
            Long unused4 = suggestedArticleSearch.categoryId = this.categoryId;
            Long unused5 = suggestedArticleSearch.sectionId = this.sectionId;
            return suggestedArticleSearch;
        }

        public Builder forLocale(Locale locale2) {
            this.locale = locale2;
            return this;
        }

        public Builder withCategoryId(Long l) {
            this.categoryId = l;
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public Builder withQuery(String str) {
            this.query = str;
            return this;
        }

        public Builder withSectionId(Long l) {
            this.sectionId = l;
            return this;
        }
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getQuery() {
        return this.query;
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    private SuggestedArticleSearch() {
    }
}
