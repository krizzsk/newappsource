package p947yt;

import android.widget.Toast;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity;
import com.moovit.design.view.list.ImageOrTextSubtitleListItemView;
import com.moovit.micromobility.external.CycleCenterReservationActivity;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.profile.PaymentAccountEditProfileActivity;
import p543hq.C17474b;
import p977zz.C20950l0;
import s30.C6452b;
import u30.C6687a;
import v40.C25750e;
import v40.C25754i;

/* renamed from: yt.b */
public final /* synthetic */ class C20767b implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f52406b;

    /* renamed from: c */
    public final /* synthetic */ Object f52407c;

    public /* synthetic */ C20767b(Object obj, int i) {
        this.f52406b = i;
        this.f52407c = obj;
    }

    public final void onFailure(Exception exc) {
        boolean z;
        switch (this.f52406b) {
            case 0:
                int i = ItineraryNoGroupActivity.f38596o0;
                ((ItineraryNoGroupActivity) this.f52407c).finish();
                return;
            case 1:
                C20950l0<Integer> l0Var = CycleCenterReservationActivity.f14868w0;
                ((CycleCenterReservationActivity) this.f52407c).mo19484y2((PaymentAccount) null);
                return;
            case 2:
                int i2 = C6452b.f20158y;
                ((ImageOrTextSubtitleListItemView) this.f52407c).setVisibility(8);
                return;
            case 3:
                C6687a aVar = (C6687a) this.f52407c;
                aVar.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "general_error");
                aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, aVar.f20766o.f14921c);
                aVar2.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
                aVar.mo46797j2(aVar2.mo49933a());
                aVar.mo46784S1();
                ((MicroMobilityPurchaseActivity) aVar.f40822c).mo19506A2(exc);
                return;
            default:
                PaymentAccountEditProfileActivity paymentAccountEditProfileActivity = (PaymentAccountEditProfileActivity) this.f52407c;
                int i3 = PaymentAccountEditProfileActivity.f64099l0;
                if (paymentAccountEditProfileActivity.mo44529n1(C25750e.documents_buttons_container) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    paymentAccountEditProfileActivity.finish();
                    return;
                } else {
                    Toast.makeText(paymentAccountEditProfileActivity, C25754i.general_error_title, 1).show();
                    return;
                }
        }
    }
}
