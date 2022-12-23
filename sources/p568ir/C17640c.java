package p568ir;

import android.view.View;
import android.widget.AdapterView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.fastbooking.CarpoolBookRideRequestActivity;
import com.moovit.view.dialogs.DropDownListPopup;
import p543hq.C17474b;

/* renamed from: ir.c */
public final class C17640c implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ DropDownListPopup f45356b;

    /* renamed from: c */
    public final /* synthetic */ CarpoolBookRideRequestActivity f45357c;

    public C17640c(CarpoolBookRideRequestActivity carpoolBookRideRequestActivity, DropDownListPopup dropDownListPopup) {
        this.f45357c = carpoolBookRideRequestActivity;
        this.f45356b = dropDownListPopup;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f45356b.dismiss();
        CarpoolBookRideRequestActivity carpoolBookRideRequestActivity = this.f45357c;
        carpoolBookRideRequestActivity.f37742w0 = i;
        carpoolBookRideRequestActivity.f37729Y.setText((CharSequence) adapterView.getItemAtPosition(i));
        CarpoolBookRideRequestActivity carpoolBookRideRequestActivity2 = this.f45357c;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "total_walking_time_selected");
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, CarpoolBookRideRequestActivity.f37721F0[i]);
        carpoolBookRideRequestActivity2.mo44545v2(aVar.mo49933a());
    }
}
