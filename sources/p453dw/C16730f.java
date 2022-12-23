package p453dw;

import android.view.View;
import android.widget.AdapterView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.transit.TransitType;
import com.moovit.view.dialogs.DropDownListPopup;
import java.util.List;
import p001a0.C0016g;
import p543hq.C17474b;
import p977zz.C20975x0;

/* renamed from: dw.f */
public final /* synthetic */ class C16730f implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ StopDetailActivity f43573b;

    /* renamed from: c */
    public final /* synthetic */ DropDownListPopup f43574c;

    /* renamed from: d */
    public final /* synthetic */ List f43575d;

    public /* synthetic */ C16730f(StopDetailActivity stopDetailActivity, DropDownListPopup dropDownListPopup, List list) {
        this.f43573b = stopDetailActivity;
        this.f43574c = dropDownListPopup;
        this.f43575d = list;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        StopDetailActivity stopDetailActivity = this.f43573b;
        DropDownListPopup dropDownListPopup = this.f43574c;
        List list = this.f43575d;
        int i2 = StopDetailActivity.f39653z0;
        stopDetailActivity.getClass();
        dropDownListPopup.dismiss();
        TransitType transitType = (TransitType) list.get(i);
        C15340c cVar = stopDetailActivity.f39662p0;
        if (cVar != null && !C20975x0.m49118e(cVar.f39712q, transitType)) {
            stopDetailActivity.mo45907J2(i, list);
            C15340c cVar2 = stopDetailActivity.f39662p0;
            if (!C20975x0.m49118e(cVar2.f39712q, transitType)) {
                cVar2.f39712q = transitType;
                cVar2.notifyDataSetChanged();
            }
            stopDetailActivity.mo45916z2();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.VIEW_TYPE_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, C0016g.m14D(transitType.f23761f));
            stopDetailActivity.mo44545v2(aVar.mo49933a());
        }
    }
}
