package zendesk.support;

import ge0.C23408a;
import java.util.List;
import p384bg.C13622c;

class HelpResponse {
    private List<CategoryItem> categories;
    @C13622c("category_count")
    private int categoryCount;

    public List<CategoryItem> getCategories() {
        return C23408a.m57526a(this.categories);
    }

    public int getCategoryCount() {
        return this.categoryCount;
    }
}
