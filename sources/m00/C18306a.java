package m00;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import ce0.C21100e;
import java.util.List;

/* renamed from: m00.a */
public abstract class C18306a<G, C> extends BaseExpandableListAdapter {

    /* renamed from: b */
    public List<G> f46687b;

    public C18306a(List<G> list) {
        C21100e.m49373x(list, "groups");
        this.f46687b = list;
    }

    /* renamed from: a */
    public abstract int mo45057a(G g);

    /* renamed from: b */
    public abstract Object mo45058b(int i, Object obj);

    /* renamed from: c */
    public abstract View mo45059c(Object obj, View view, ViewGroup viewGroup);

    /* renamed from: d */
    public abstract View mo45060d(G g, boolean z, View view, ViewGroup viewGroup);

    public final C getChild(int i, int i2) {
        return mo45058b(i2, getGroup(i));
    }

    public final long getChildId(int i, int i2) {
        return 0;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        return mo45059c(mo45058b(i2, getGroup(i)), view, viewGroup);
    }

    public final int getChildrenCount(int i) {
        return mo45057a(getGroup(i));
    }

    public final G getGroup(int i) {
        return this.f46687b.get(i);
    }

    public final int getGroupCount() {
        return this.f46687b.size();
    }

    public final long getGroupId(int i) {
        return 0;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        return mo45060d(getGroup(i), z, view, viewGroup);
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
