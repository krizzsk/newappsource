package zendesk.support;

import ge0.C23410c;
import java.util.List;

public class HelpRequest {
    private static final int DEFAULT_ARTICLES_PER_SECTION = 5;
    private static final String INCLUDE_ALL = "categories,sections";
    private static final String INCLUDE_CATEGORIES = "categories";
    private static final String INCLUDE_SECTIONS = "sections";
    private static final String LOG_TAG = "HelpRequest";
    private int articlesPerPageLimit;
    private String categoryIds;
    private String includes;
    private String[] labelNames;
    private String sectionIds;

    public static class Builder {
        /* access modifiers changed from: private */
        public int articlesPerSectionLimit = 5;
        /* access modifiers changed from: private */
        public String categoryIds;
        /* access modifiers changed from: private */
        public String includes;
        /* access modifiers changed from: private */
        public String[] labelNames;
        /* access modifiers changed from: private */
        public String sectionIds;

        public HelpRequest build() {
            return new HelpRequest(this);
        }

        public Builder includeCategories() {
            if (C23410c.m57534b(this.includes)) {
                this.includes = HelpRequest.INCLUDE_CATEGORIES;
            } else if (this.includes.equals(HelpRequest.INCLUDE_SECTIONS)) {
                this.includes = HelpRequest.INCLUDE_ALL;
            }
            return this;
        }

        public Builder includeSections() {
            if (C23410c.m57534b(this.includes)) {
                this.includes = HelpRequest.INCLUDE_SECTIONS;
            } else if (this.includes.equals(HelpRequest.INCLUDE_CATEGORIES)) {
                this.includes = HelpRequest.INCLUDE_ALL;
            }
            return this;
        }

        public Builder withArticlesPerSectionLimit(int i) {
            this.articlesPerSectionLimit = i;
            return this;
        }

        public Builder withCategoryIds(List<Long> list) {
            this.categoryIds = C23410c.m57537e(list);
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            this.labelNames = strArr;
            return this;
        }

        public Builder withSectionIds(List<Long> list) {
            this.sectionIds = C23410c.m57537e(list);
            return this;
        }
    }

    public int getArticlesPerPageLimit() {
        return this.articlesPerPageLimit;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public String getIncludes() {
        return this.includes;
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public String getSectionIds() {
        return this.sectionIds;
    }

    private HelpRequest(Builder builder) {
        this.categoryIds = builder.categoryIds;
        this.sectionIds = builder.sectionIds;
        this.includes = builder.includes;
        this.articlesPerPageLimit = builder.articlesPerSectionLimit;
        this.labelNames = builder.labelNames;
    }
}
