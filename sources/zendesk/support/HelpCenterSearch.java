package zendesk.support;

import ge0.C23408a;
import ge0.C23410c;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;

public class HelpCenterSearch implements Serializable, Cloneable {
    /* access modifiers changed from: private */
    public String categoryIds;
    /* access modifiers changed from: private */
    public String include;
    /* access modifiers changed from: private */
    public String labelNames;
    /* access modifiers changed from: private */
    public Locale locale;
    /* access modifiers changed from: private */
    public Integer page;
    /* access modifiers changed from: private */
    public Integer perPage;
    /* access modifiers changed from: private */
    public String query;
    /* access modifiers changed from: private */
    public String sectionIds;

    public static class Builder {
        private String categoryIds;
        private String[] include;
        private String[] labelNames;
        private Locale locale;
        private Integer page;
        private Integer perPage;
        private String query;
        private String sectionIds;

        public HelpCenterSearch build() {
            HelpCenterSearch helpCenterSearch = new HelpCenterSearch();
            String unused = helpCenterSearch.query = this.query;
            Locale unused2 = helpCenterSearch.locale = this.locale;
            String unused3 = helpCenterSearch.include = C23410c.m57536d(this.include);
            String unused4 = helpCenterSearch.labelNames = C23410c.m57536d(this.labelNames);
            String unused5 = helpCenterSearch.categoryIds = this.categoryIds;
            String unused6 = helpCenterSearch.sectionIds = this.sectionIds;
            Integer unused7 = helpCenterSearch.page = this.page;
            Integer unused8 = helpCenterSearch.perPage = this.perPage;
            return helpCenterSearch;
        }

        public Builder forLocale(Locale locale2) {
            this.locale = locale2;
            return this;
        }

        public Builder page(Integer num) {
            this.page = num;
            return this;
        }

        public Builder perPage(Integer num) {
            this.perPage = num;
            return this;
        }

        public Builder withCategoryId(Long l) {
            if (l != null) {
                this.categoryIds = Long.toString(l.longValue());
            }
            return this;
        }

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = C23410c.m57537e(C23408a.m57526a(list));
            return this;
        }

        public Builder withIncludes(String... strArr) {
            this.include = strArr;
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
            if (l != null) {
                this.sectionIds = Long.toString(l.longValue());
            }
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = C23410c.m57537e(C23408a.m57526a(list));
            return this;
        }
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getInclude() {
        return this.include;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Integer getPage() {
        return this.page;
    }

    public Integer getPerPage() {
        return this.perPage;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    public HelpCenterSearch withQuery(String str) {
        HelpCenterSearch helpCenterSearch = new HelpCenterSearch();
        try {
            HelpCenterSearch helpCenterSearch2 = (HelpCenterSearch) clone();
            try {
                helpCenterSearch2.query = str;
                return helpCenterSearch2;
            } catch (CloneNotSupportedException e) {
                e = e;
                helpCenterSearch = helpCenterSearch2;
            }
        } catch (CloneNotSupportedException e2) {
            e = e2;
            e.printStackTrace();
            return helpCenterSearch;
        }
    }

    private HelpCenterSearch() {
    }
}
