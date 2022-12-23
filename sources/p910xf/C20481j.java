package p910xf;

import android.content.Intent;
import android.os.Bundle;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.dashboard.C14988w;
import com.moovit.app.tod.C15462b;
import com.moovit.app.wondo.tickets.offers.WondoOfferDetailsActivity;
import com.moovit.micromobility.MicroMobilityRideActivity;
import com.moovit.payment.account.PaymentAccountMenuItemFragment;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.request.UserRequestError;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import java.util.ArrayList;
import k10.C17993a;
import m60.C18341a;
import p090g1.C4732a;
import p543hq.C17474b;
import v80.C13183a;

/* renamed from: xf.j */
public final /* synthetic */ class C20481j implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f51854b;

    /* renamed from: c */
    public final /* synthetic */ Object f51855c;

    public /* synthetic */ C20481j(Object obj, int i) {
        this.f51854b = i;
        this.f51855c = obj;
    }

    public final void onFailure(Exception exc) {
        int i = -1;
        switch (this.f51854b) {
            case 0:
                ((TaskCompletionSource) this.f51855c).setException(exc);
                return;
            case 1:
                int i2 = C14988w.f38360o;
                ((C14988w) this.f51855c).mo45191n2((PaymentAccount) null);
                return;
            case 2:
                int i3 = C15462b.f40053x;
                ((C15462b) this.f51855c).mo46206q2((PaymentAccount) null);
                return;
            case 3:
                WondoOfferDetailsActivity wondoOfferDetailsActivity = (WondoOfferDetailsActivity) this.f51855c;
                int i4 = WondoOfferDetailsActivity.f40747Y;
                wondoOfferDetailsActivity.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(C14226d.m35335A0(wondoOfferDetailsActivity).putExtra(C17993a.f46076b, "suppress_popups"));
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    if (!C4732a.startActivities(wondoOfferDetailsActivity, intentArr, (Bundle) null)) {
                        Intent intent = new Intent(intentArr[intentArr.length - 1]);
                        intent.addFlags(268435456);
                        wondoOfferDetailsActivity.startActivity(intent);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            case 4:
                int i5 = MicroMobilityRideActivity.f14823n0;
                ((MicroMobilityRideActivity) this.f51855c).finish();
                return;
            case 5:
                int i6 = PaymentAccountMenuItemFragment.f63832r;
                ((PaymentAccountMenuItemFragment) this.f51855c).mo83331p2((PaymentAccount) null);
                return;
            case 6:
                ((C18341a) this.f51855c).mo50795o2(exc);
                return;
            default:
                C13183a aVar = (C13183a) this.f51855c;
                aVar.mo46784S1();
                if (exc instanceof UserRequestError) {
                    UserRequestError userRequestError = (UserRequestError) exc;
                    TicketingErrorAction.createErrorDialog(aVar.requireContext(), userRequestError).show(aVar.getChildFragmentManager(), "payment_error_dialog");
                    i = userRequestError.mo49160b();
                } else {
                    aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), (String) null, exc));
                }
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "general_error");
                aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, aVar.f32728o.f23247c);
                aVar2.mo49935c(AnalyticsAttributeKey.ERROR_CODE, i);
                aVar.mo46797j2(aVar2.mo49933a());
                return;
        }
    }
}
