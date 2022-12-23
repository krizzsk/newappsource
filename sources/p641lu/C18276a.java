package p641lu;

import android.view.View;
import android.widget.ExpandableListView;
import com.moovit.app.metro.selection.MetroListActivity;
import com.moovit.metro.selection.Country;
import com.moovit.metro.selection.MetroArea;
import com.tranzmate.R;
import p977zz.C20975x0;

/* renamed from: lu.a */
public final /* synthetic */ class C18276a implements ExpandableListView.OnChildClickListener {

    /* renamed from: a */
    public final /* synthetic */ MetroListActivity f46608a;

    public /* synthetic */ C18276a(MetroListActivity metroListActivity) {
        this.f46608a = metroListActivity;
    }

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        MetroListActivity metroListActivity = this.f46608a;
        int i3 = MetroListActivity.f38959o0;
        metroListActivity.getClass();
        Country country = (Country) expandableListView.getExpandableListAdapter().getGroup(i);
        MetroArea metroArea = country.f14799e.get(i2);
        if (!C20975x0.m49118e(metroListActivity.f38960U, metroArea)) {
            metroListActivity.f38961X = country;
            metroListActivity.f38960U = metroArea;
            metroListActivity.mo45522z2();
            metroListActivity.mo45520y2(metroArea);
            metroListActivity.f38966n0.setContentDescription(metroListActivity.getString(R.string.voice_over_current_metro, new Object[]{metroListActivity.f38960U.f14803c}));
        }
        return false;
    }
}
