package p571iv;

import com.moovit.app.reports.list.StopsReportsListActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import i30.C5265a;
import i30.C5267c;
import i30.C5268d;
import i30.C5271f;
import i30.C5272g;
import java.util.ArrayList;

/* renamed from: iv.d */
public final class C17657d extends C5272g<C5267c, C5271f> {

    /* renamed from: d */
    public final /* synthetic */ StopsReportsListActivity f45383d;

    public C17657d(StopsReportsListActivity stopsReportsListActivity) {
        this.f45383d = stopsReportsListActivity;
    }

    /* renamed from: e */
    public final void mo21078e(C5265a aVar, C5268d dVar, ArrayList arrayList) {
        C5267c cVar = (C5267c) aVar;
        if (arrayList.isEmpty()) {
            TransitStop c = dVar.mo21064c(this.f45383d.f39185X);
            StopsReportsListActivity stopsReportsListActivity = this.f45383d;
            int i = StopsReportsListActivity.f39203o0;
            ListItemView listItemView = (ListItemView) stopsReportsListActivity.findViewById(R.id.reports_list_title);
            listItemView.setTitle((CharSequence) c.f23731c);
            listItemView.setIcon(c.f23734f);
            listItemView.setSubtitle((CharSequence) c.f23733e);
            stopsReportsListActivity.mo45695A2(stopsReportsListActivity.mo45706E2());
        }
    }
}
