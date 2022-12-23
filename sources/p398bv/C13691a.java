package p398bv;

import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.offline.tripplanner.OfflineTripPlannerOptions;
import com.moovit.app.suggestedroutes.TimeQuickAction;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.view.dialogs.DropDownListPopup;
import p543hq.C17474b;
import p572iw.C17663f;

/* renamed from: bv.a */
public final /* synthetic */ class C13691a implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f33747b;

    /* renamed from: c */
    public final /* synthetic */ DropDownListPopup f33748c;

    /* renamed from: d */
    public final /* synthetic */ C15581b f33749d;

    public /* synthetic */ C13691a(C15581b bVar, DropDownListPopup dropDownListPopup, int i) {
        this.f33747b = i;
        this.f33749d = bVar;
        this.f33748c = dropDownListPopup;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.f33747b) {
            case 0:
                C13692b bVar = (C13692b) this.f33749d;
                DropDownListPopup dropDownListPopup = this.f33748c;
                int i2 = C13692b.f33750t;
                bVar.getClass();
                dropDownListPopup.dismiss();
                if (i == 0) {
                    bVar.mo46541p2(new OfflineTripPlannerOptions(TripPlannerTime.m17899f()), 0);
                    return;
                } else if (i == 1) {
                    bVar.mo40553r2(TripPlannerTime.Type.DEPART);
                    return;
                } else if (i == 2) {
                    bVar.mo40553r2(TripPlannerTime.Type.ARRIVE);
                    return;
                } else if (i == 3) {
                    Parcelable.Creator<TripPlannerTime> creator = TripPlannerTime.CREATOR;
                    bVar.mo46541p2(new OfflineTripPlannerOptions(new TripPlannerTime(TripPlannerTime.Type.LAST, -1)), 0);
                    return;
                } else {
                    return;
                }
            default:
                C17663f fVar = (C17663f) this.f33749d;
                DropDownListPopup dropDownListPopup2 = this.f33748c;
                int i3 = C17663f.f45392x;
                fVar.getClass();
                dropDownListPopup2.dismiss();
                TimeQuickAction timeQuickAction = (TimeQuickAction) adapterView.getItemAtPosition(i);
                int i4 = C17663f.C17664a.f45398a[timeQuickAction.ordinal()];
                if (i4 == 1) {
                    fVar.mo50114u2((TripPlannerTime) null, 0);
                } else if (i4 == 2) {
                    fVar.mo50115v2(TripPlannerTime.Type.DEPART);
                } else if (i4 == 3) {
                    fVar.mo50115v2(TripPlannerTime.Type.ARRIVE);
                } else if (i4 == 4) {
                    Parcelable.Creator<TripPlannerTime> creator2 = TripPlannerTime.CREATOR;
                    fVar.mo50114u2(new TripPlannerTime(TripPlannerTime.Type.LAST, -1), 0);
                }
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, timeQuickAction.analyticsConst);
                fVar.mo46797j2(aVar.mo49933a());
                return;
        }
    }
}
