package p478ex;

import androidx.lifecycle.C1044w;
import com.moovit.app.tod.center.subscriptions.TodSubscriptionsCenterFragment;
import com.moovit.app.tod.pincode.TodAutonomousRidePinCodeDialogFragment;
import com.moovit.app.tod.shuttle.booking.subscriptionenroll.TodShuttleBookingSubscriptionEnrollDialogFragment;
import com.moovit.payment.account.subscription.AccountMySubscriptionActivity;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: ex.a */
public final /* synthetic */ class C16888a implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f43911a;

    /* renamed from: b */
    public final /* synthetic */ C24236l f43912b;

    public /* synthetic */ C16888a(C24236l lVar, int i) {
        this.f43911a = i;
        this.f43912b = lVar;
    }

    public final void onChanged(Object obj) {
        switch (this.f43911a) {
            case 0:
                C24236l lVar = this.f43912b;
                int i = TodSubscriptionsCenterFragment.f40227r;
                C24362h.m61211f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
            case 1:
                C24236l lVar2 = this.f43912b;
                int i2 = TodAutonomousRidePinCodeDialogFragment.f40368m;
                C24362h.m61211f(lVar2, "$tmp0");
                lVar2.invoke(obj);
                return;
            case 2:
                C24236l lVar3 = this.f43912b;
                int i3 = TodShuttleBookingSubscriptionEnrollDialogFragment.f40407n;
                C24362h.m61211f(lVar3, "$tmp0");
                lVar3.invoke(obj);
                return;
            default:
                C24236l lVar4 = this.f43912b;
                int i4 = AccountMySubscriptionActivity.f64120X;
                C24362h.m61211f(lVar4, "$tmp0");
                lVar4.invoke(obj);
                return;
        }
    }
}
