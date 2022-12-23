package com.moovit.app.reports.list;

import android.os.Parcelable;
import android.os.SystemClock;
import android.view.MotionEvent;
import c70.C13752e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.design.view.list.ListItemView;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import java.util.HashSet;
import java.util.Set;
import p548hv.C17501c;
import p571iv.C17657d;
import p594jv.C17942l;
import p618kv.C18145f;
import p824tp.C19728f;

public class StopsReportsListActivity extends ReportsListActivity<TransitStop> implements C17942l.C17944b {

    /* renamed from: o0 */
    public static final /* synthetic */ int f39203o0 = 0;

    /* renamed from: B2 */
    public final void mo45690B2() {
        this.f39187Z.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
        C18145f.m44854S1(ReportEntityType.STOP, this.f39185X, 0).show(getSupportFragmentManager(), "ReportCategoryListDialog");
    }

    /* renamed from: D2 */
    public final void mo45692D2(Parcelable parcelable) {
        TransitStop transitStop = (TransitStop) parcelable;
        if (transitStop == null || !this.f39185X.equals(transitStop.f23730b)) {
            C13752e x1 = mo44548x1();
            String simpleName = getClass().getSimpleName();
            C4776h hVar = C19728f.m47195a(x1.f33852a).f50165a;
            C5269e d = C16759e.m42348d(hVar, "metroInfo");
            d.mo21066a(MetroEntityType.TRANSIT_STOP, this.f39185X);
            C5267c cVar = new C5267c(x1, simpleName, hVar, d);
            mo44528l2(cVar.mo21061O(), cVar, new C17657d(this));
            return;
        }
        ListItemView listItemView = (ListItemView) findViewById(R.id.reports_list_title);
        listItemView.setTitle((CharSequence) transitStop.f23731c);
        listItemView.setIcon(transitStop.f23734f);
        listItemView.setSubtitle((CharSequence) transitStop.f23733e);
        mo45695A2(mo45706E2());
    }

    /* renamed from: E2 */
    public final C17501c mo45706E2() {
        return new C17501c(this.f39185X, ReportEntityType.STOP);
    }

    /* renamed from: l */
    public final void mo45694l(boolean z) {
        if (z) {
            mo45695A2(mo45706E2());
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("GTFS_METRO_ENTITIES_LOADER");
        return s1;
    }
}
