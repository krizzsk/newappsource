package p757qu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotNearestStationInfo;
import com.moovit.app.mot.purchase.C15161a;
import com.moovit.app.mot.purchase.MotStationEntranceActivationActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.payment.account.external.C25651a;
import com.moovit.payment.account.external.ExternalPaymentAccountHelper;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import p543hq.C17474b;

/* renamed from: qu.e */
public final /* synthetic */ class C19182e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f48770b;

    /* renamed from: c */
    public final /* synthetic */ Object f48771c;

    /* renamed from: d */
    public final /* synthetic */ Object f48772d;

    /* renamed from: e */
    public final /* synthetic */ Object f48773e;

    public /* synthetic */ C19182e(int i, Object obj, Object obj2, Object obj3) {
        this.f48770b = i;
        this.f48771c = obj;
        this.f48772d = obj2;
        this.f48773e = obj3;
    }

    public final void onClick(View view) {
        boolean z;
        switch (this.f48770b) {
            case 0:
                MotStationEntranceActivationActivity motStationEntranceActivationActivity = (MotStationEntranceActivationActivity) this.f48771c;
                LatLonE6 latLonE6 = (LatLonE6) this.f48772d;
                int i = MotStationEntranceActivationActivity.f39036p0;
                motStationEntranceActivationActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "validate_clicked");
                aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, ((MotNearestStationInfo) this.f48773e).f39023b.f23730b);
                aVar.mo49935c(AnalyticsAttributeKey.COUNT, motStationEntranceActivationActivity.f39039m0.getCounter());
                motStationEntranceActivationActivity.mo44545v2(aVar.mo49933a());
                int i2 = C15161a.f39052i;
                TrackingEvent trackingEvent = TrackingEvent.MOT_STATION_ENTRANCE_EXPLANATION_DIALOG_DISPLAYED;
                boolean z2 = false;
                if (motStationEntranceActivationActivity.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("userLocation", latLonE6);
                    C15161a aVar2 = new C15161a();
                    aVar2.setArguments(bundle);
                    aVar2.show(motStationEntranceActivationActivity.getSupportFragmentManager(), "station_entrance_explanation_tag");
                    z2 = true;
                }
                if (!z2) {
                    motStationEntranceActivationActivity.mo45595D2(latLonE6);
                    return;
                }
                return;
            default:
                C25651a aVar3 = (C25651a) this.f48771c;
                PaymentAccountContextStatus paymentAccountContextStatus = (PaymentAccountContextStatus) this.f48773e;
                int i3 = C25651a.f63987s;
                aVar3.getClass();
                Intent intent = ((ExternalPaymentAccountHelper.C25647a) this.f48772d).f63973b;
                if (intent != null) {
                    String str = aVar3.f63990p;
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_external_account_clicked");
                    aVar4.mo49939g(AnalyticsAttributeKey.ID, str);
                    aVar4.mo49939g(AnalyticsAttributeKey.STATE, C13555b.m33979s(paymentAccountContextStatus));
                    aVar3.mo46797j2(aVar4.mo49933a());
                    aVar3.f63988n.mo772a(intent);
                    return;
                }
                return;
        }
    }
}
