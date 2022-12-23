package p376ax;

import android.content.Intent;
import androidx.lifecycle.C1044w;
import c70.C13751d;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.bookingflow.model.FailureReason;
import com.moovit.app.tod.bookingflow.model.TodBookingPickupLocationState;
import com.moovit.app.tod.center.rides.TodRidesCenterFragment;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.micromobility.MicroMobilityRideActivity;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.payment.account.deposit.C25643a;
import com.moovit.payment.account.deposit.DepositActivity;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import lf0.C24236l;
import mf0.C24362h;
import p304x.C7097r;
import p435de.C16596f;
import p543hq.C17474b;
import p950yw.C20779f;
import p977zz.C20961r;
import t30.C6572l;
import v30.C6855a;
import z20.C20806a;

/* renamed from: ax.g */
public final /* synthetic */ class C13545g implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f33481a;

    /* renamed from: b */
    public final /* synthetic */ Object f33482b;

    public /* synthetic */ C13545g(Object obj, int i) {
        this.f33481a = i;
        this.f33482b = obj;
    }

    public final void onChanged(Object obj) {
        T t;
        String str;
        CurrencyAmount currencyAmount;
        CurrencyAmount currencyAmount2 = null;
        boolean z = false;
        switch (this.f33481a) {
            case 0:
                C13546h hVar = (C13546h) this.f33482b;
                TodBookingPickupLocationState todBookingPickupLocationState = (TodBookingPickupLocationState) obj;
                int i = C13546h.f33483w;
                hVar.getClass();
                if (todBookingPickupLocationState != null) {
                    String f = todBookingPickupLocationState.f40099b.mo24313f();
                    hVar.f33484r.setText(f);
                    FailureReason failureReason = todBookingPickupLocationState.f40100c;
                    boolean equals = FailureReason.NONE.equals(failureReason);
                    hVar.f33486t.setEnabled(equals);
                    if (equals && hVar.f33486t.getContext().getString(R.string.current_location).equals(f)) {
                        z = true;
                    }
                    if (!z) {
                        hVar.mo40424A2(failureReason);
                    }
                    C20779f o2 = hVar.mo40435o2();
                    if (!z) {
                        o2.mo52910c(todBookingPickupLocationState);
                        return;
                    }
                    o2.mo52910c((TodBookingPickupLocationState) null);
                    o2.mo52908a(new C7097r(20, hVar, todBookingPickupLocationState));
                    return;
                }
                return;
            case 1:
                C24236l lVar = (C24236l) this.f33482b;
                int i2 = TodRidesCenterFragment.f40217r;
                C24362h.m61211f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
            case 2:
                C6855a aVar = (C6855a) this.f33482b;
                C20961r rVar = (C20961r) obj;
                int i3 = C6855a.f21206q;
                aVar.mo46784S1();
                if (!rVar.f52711a || (t = rVar.f52712b) == null) {
                    Exception exc = rVar.f52713c;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.MICRO_MOBILITY_PURCHASE_RESULT);
                    aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
                    aVar2.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
                    aVar.mo46797j2(aVar2.mo49933a());
                    ((MicroMobilityPurchaseActivity) aVar.f40822c).mo19506A2(exc);
                    C16596f.m42113a().mo49364c(new ApplicationBugException("Failed to purchase micro-mobility ride!", exc));
                    return;
                }
                C6572l lVar2 = (C6572l) t;
                MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) aVar.f40822c;
                if (microMobilityPurchaseActivity != null) {
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.MICRO_MOBILITY_PURCHASE_RESULT);
                    aVar3.mo49941i(AnalyticsAttributeKey.SUCCESS, lVar2.f20390p);
                    aVar3.mo49943k(AnalyticsAttributeKey.ID, lVar2.f20387m);
                    aVar.mo46797j2(aVar3.mo49933a());
                    C20806a.C20807a aVar4 = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
                    aVar4.mo52934b("micro_mobility", "feature");
                    aVar4.mo52936d("item_id", lVar2.f20387m);
                    DepositInstructions depositInstructions = lVar2.f20389o;
                    if (depositInstructions != null) {
                        str = depositInstructions.f63958b;
                    } else {
                        str = null;
                    }
                    aVar4.mo52934b(str, "payment_context");
                    DepositInstructions depositInstructions2 = lVar2.f20389o;
                    if (depositInstructions2 != null) {
                        currencyAmount = depositInstructions2.f63959c;
                    } else {
                        currencyAmount = null;
                    }
                    aVar4.mo52938f(currencyAmount);
                    DepositInstructions depositInstructions3 = lVar2.f20389o;
                    if (depositInstructions3 != null) {
                        currencyAmount2 = depositInstructions3.f63959c;
                    }
                    aVar4.mo52937e(InAppPurchaseMetaData.KEY_PRICE, currencyAmount2);
                    aVar4.mo52935c();
                    PaymentRegistrationInstructions paymentRegistrationInstructions = lVar2.f20388n;
                    if (paymentRegistrationInstructions != null) {
                        aVar.startActivity(PaymentRegistrationActivity.m41719z2(microMobilityPurchaseActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions));
                        return;
                    }
                    DepositInstructions depositInstructions4 = lVar2.f20389o;
                    if (depositInstructions4 != null) {
                        int i4 = DepositActivity.f63947m0;
                        Intent intent = new Intent(microMobilityPurchaseActivity, DepositActivity.class);
                        intent.putExtra("depositInstructions", depositInstructions4);
                        aVar.startActivity(intent);
                        return;
                    }
                    microMobilityPurchaseActivity.startActivity(MicroMobilityRideActivity.m11106y2(microMobilityPurchaseActivity, lVar2.f20387m));
                    microMobilityPurchaseActivity.setResult(-1);
                    microMobilityPurchaseActivity.finish();
                    return;
                }
                return;
            default:
                ((C25643a) this.f33482b).mo83449b((DepositInstructions) obj);
                return;
        }
    }
}
