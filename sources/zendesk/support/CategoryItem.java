package zendesk.support;

import ge0.C23408a;
import java.util.List;
import p384bg.C13622c;

public class CategoryItem implements HelpItem {
    private boolean expanded = true;
    @C13622c("id")

    /* renamed from: id */
    private Long f63714id;
    @C13622c("name")
    private String name;
    @C13622c("section_count")
    private int sectionCount;
    private List<SectionItem> sections;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Long l = this.f63714id;
        Long l2 = ((CategoryItem) obj).f63714id;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public Long getId() {
        return this.f63714id;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public Long getParentId() {
        return null;
    }

    public List<SectionItem> getSections() {
        return C23408a.m57526a(this.sections);
    }

    public int getViewType() {
        return 1;
    }

    public int hashCode() {
        Long l = this.f63714id;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean setExpanded(boolean z) {
        this.expanded = z;
        return z;
    }

    public void setSections(List<SectionItem> list) {
        this.sections = C23408a.m57526a(list);
    }
}
