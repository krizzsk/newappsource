package p641lu;

import android.widget.ExpandableListView;
import com.moovit.app.metro.selection.MetroListActivity;

/* renamed from: lu.d */
public final class C18279d implements ExpandableListView.OnGroupExpandListener {

    /* renamed from: a */
    public int f46612a = -1;

    /* renamed from: b */
    public final /* synthetic */ MetroListActivity f46613b;

    public C18279d(MetroListActivity metroListActivity) {
        this.f46613b = metroListActivity;
    }

    public final void onGroupExpand(int i) {
        int i2 = this.f46612a;
        if (!(i2 == -1 || i2 == i)) {
            this.f46613b.f38966n0.collapseGroup(i2);
        }
        this.f46612a = i;
        MetroListActivity metroListActivity = this.f46613b;
        int i3 = MetroListActivity.f38959o0;
        metroListActivity.mo45522z2();
    }
}
