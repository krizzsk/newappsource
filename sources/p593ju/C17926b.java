package p593ju;

import a90.C7523e;
import android.location.Location;
import c00.C13717b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.map.layers.MapLayersManager;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStep;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.tranzmate.R;
import p039c7.C1800c;
import p543hq.C17474b;
import p712ou.C18830b;
import p713ov.C18841h;
import p757qu.C19185h;
import p977zz.C20935e;
import p977zz.C20961r;

/* renamed from: ju.b */
public final /* synthetic */ class C17926b implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ int f45988b;

    /* renamed from: c */
    public final /* synthetic */ Object f45989c;

    public /* synthetic */ C17926b(Object obj, int i) {
        this.f45988b = i;
        this.f45989c = obj;
    }

    public final void invoke(Object obj) {
        switch (this.f45988b) {
            case 0:
                MapLayersManager mapLayersManager = (MapLayersManager) this.f45989c;
                Integer num = (Integer) obj;
                mapLayersManager.mo45503d();
                mapLayersManager.mo45502c();
                return;
            case 1:
                C19185h hVar = (C19185h) this.f45989c;
                C20961r rVar = (C20961r) obj;
                int i = C19185h.f48779u;
                hVar.getClass();
                T t = rVar.f52712b;
                if (t == null || ((Location) t).isFromMockProvider()) {
                    String string = hVar.getString(R.string.payment_mot_train_no_location_error_title);
                    String string2 = hVar.getString(R.string.payment_mot_train_no_location_error_subtitle);
                    hVar.mo46784S1();
                    hVar.f48786t.setTitle((CharSequence) string);
                    hVar.f48786t.setSubtitle((CharSequence) string2);
                    hVar.f48786t.setPositiveButton((int) R.string.action_try_again);
                    hVar.f48786t.setPositiveButtonClickListener(new C1800c(hVar, 18));
                    MotActivationStationInfo motActivationStationInfo = ((MotActivation) C13717b.m34256c(((MotStationExitActivationActivity) hVar.f40822c).mo45599z2())).f38997n;
                    if (motActivationStationInfo != null) {
                        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_station_impression");
                        aVar.mo49939g(AnalyticsAttributeKey.STATE, "mot_station_location_no_gps");
                        aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, motActivationStationInfo.mo45575c());
                        hVar.mo46797j2(aVar.mo49933a());
                        hVar.mo51611p2((C18830b) null);
                        return;
                    }
                    throw new ApplicationBugException("Only station activations can be used!");
                }
                hVar.mo51609n2(LatLonE6.m40177j((Location) rVar.f52712b));
                return;
            case 2:
                int i2 = C18841h.f47970s;
                ((C18841h) this.f45989c).mo51329u2((C18841h.C18843b) obj);
                return;
            default:
                C7523e eVar = (C7523e) this.f45989c;
                int i3 = C7523e.f22998q;
                eVar.mo40058n2(new SuggestedTicketFareSelectionStepResult(((SuggestedTicketFareSelectionStep) eVar.f32728o).f23246b, (SuggestedTicketFare) obj));
                return;
        }
    }
}
