package p923xs;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.lifecycle.C1044w;
import c00.C13717b;
import c70.C13751d;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.subscription.AdFreeMenuItemFragment;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.subscription.SubscriptionsActivity;
import com.moovit.app.subscription.model.PurchaseDetails;
import com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.UserRequestError;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import com.moovit.ticketing.purchase.itinerary.C7707a;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lf0.C24236l;
import m80.C12869e;
import m80.C12873i;
import mf0.C24362h;
import p376ax.C13544f;
import p435de.C16596f;
import p501fw.C17108g;
import p501fw.C17113k;
import p501fw.C17115l;
import p543hq.C17474b;
import p874vr.C20199a;
import p977zz.C20947k;
import p977zz.C20961r;
import q00.C19047a;
import q80.C13023l;
import z20.C20806a;

/* renamed from: xs.k */
public final /* synthetic */ class C20581k implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f52062a;

    /* renamed from: b */
    public final /* synthetic */ Object f52063b;

    public /* synthetic */ C20581k(Object obj, int i) {
        this.f52062a = i;
        this.f52063b = obj;
    }

    public final void onChanged(Object obj) {
        PaymentGatewayFragment paymentGatewayFragment;
        T t;
        String str;
        CurrencyAmount currencyAmount;
        T t2;
        int i = 8;
        int i2 = 0;
        boolean z = true;
        switch (this.f52062a) {
            case 0:
                C20582l lVar = (C20582l) this.f52063b;
                C20961r rVar = (C20961r) obj;
                int i3 = C20582l.f52064q;
                lVar.getClass();
                if (!rVar.f52711a || (t2 = rVar.f52712b) == null) {
                    lVar.f52067p.mo4627l0(lVar.f52065n);
                    return;
                } else {
                    lVar.f52067p.mo4627l0(new C20579j((List) t2, lVar));
                    return;
                }
            case 1:
                AdFreeMenuItemFragment adFreeMenuItemFragment = (AdFreeMenuItemFragment) this.f52063b;
                int i4 = AdFreeMenuItemFragment.f39754p;
                adFreeMenuItemFragment.getClass();
                int i5 = ((MoovitSubscriptionsManager.C15361d) obj).f39770a;
                if (!(i5 == 2 || i5 == 3)) {
                    z = !adFreeMenuItemFragment.mo46785T1("CONFIGURATION") ? false : ((Boolean) ((C19047a) adFreeMenuItemFragment.mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51277g1)).booleanValue();
                }
                if (z) {
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ad_free_menu_item_impression");
                    adFreeMenuItemFragment.mo46797j2(aVar.mo49933a());
                    adFreeMenuItemFragment.f39756o.setVisibility(0);
                    return;
                }
                adFreeMenuItemFragment.f39756o.setVisibility(8);
                return;
            case 2:
                SubscriptionsActivity subscriptionsActivity = (SubscriptionsActivity) this.f52063b;
                MoovitSubscriptionsManager.C15361d dVar = (MoovitSubscriptionsManager.C15361d) obj;
                int i6 = SubscriptionsActivity.f39776Y;
                subscriptionsActivity.f39777U.setVisibility(8);
                C17115l lVar2 = (C17115l) subscriptionsActivity.mo44534p1("subscription_dialog_fragment_tag");
                int i7 = dVar.f39770a;
                if (i7 == 1) {
                    subscriptionsActivity.setTitle("");
                    subscriptionsActivity.mo45942y2(new C17113k());
                    if (lVar2 != null) {
                        lVar2.dismissAllowingStateLoss();
                        return;
                    }
                    return;
                } else if (i7 == 2) {
                    subscriptionsActivity.setTitle("");
                    subscriptionsActivity.mo45942y2(new C17113k());
                    if (lVar2 == null) {
                        List<PurchaseDetails> list = dVar.f39771b;
                        int i8 = C17115l.f44295h;
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("purchaseDetails", C13717b.m34264k(list));
                        C17115l lVar3 = new C17115l();
                        lVar3.setArguments(bundle);
                        lVar3.show(subscriptionsActivity.getSupportFragmentManager(), "subscription_dialog_fragment_tag");
                        return;
                    }
                    return;
                } else if (i7 == 3) {
                    subscriptionsActivity.setTitle(R.string.more_ad_free);
                    subscriptionsActivity.mo45942y2(new C17108g());
                    if (lVar2 != null) {
                        lVar2.dismissAllowingStateLoss();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 3:
                C13544f fVar = (C13544f) this.f52063b;
                fVar.f33479s.setEnabled(false);
                ProgressBar progressBar = fVar.f33480t;
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    i = 0;
                }
                progressBar.setVisibility(i);
                return;
            case 4:
                C24236l lVar4 = (C24236l) this.f52063b;
                int i9 = TodSubscriptionDetailsActivity.f40220X;
                C24362h.m61211f(lVar4, "$tmp0");
                lVar4.invoke(obj);
                return;
            default:
                C7707a aVar2 = (C7707a) this.f52063b;
                C20961r rVar2 = (C20961r) obj;
                C7707a.C7708a aVar3 = C7707a.f23404s;
                aVar2.mo46784S1();
                CurrencyAmount currencyAmount2 = null;
                if (!rVar2.f52711a || (t = rVar2.f52712b) == null) {
                    Exception exc = rVar2.f52713c;
                    if (exc instanceof UserRequestError) {
                        UserRequestError userRequestError = (UserRequestError) exc;
                        if (aVar2.f40824e && (paymentGatewayFragment = (PaymentGatewayFragment) aVar2.getChildFragmentManager().mo3983z(C12869e.payment_method_view)) != null) {
                            paymentGatewayFragment.mo48928p2();
                        }
                        C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.TICKET_PURCHASE_RESULT);
                        aVar4.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
                        aVar4.mo49935c(AnalyticsAttributeKey.ERROR_CODE, userRequestError.mo49160b());
                        aVar2.mo46797j2(aVar4.mo49933a());
                        TicketingErrorAction.createErrorDialog(aVar2.requireContext(), userRequestError).show(aVar2.getChildFragmentManager(), "payment_error_dialog");
                        return;
                    }
                    C16596f.m42113a().mo49364c(new ApplicationBugException("Failed to purchase itinerary tickets!", exc));
                    if (!C20947k.m49056a(aVar2.requireContext())) {
                        aVar2.mo46795h2(C13751d.m34342c(aVar2.requireContext(), (String) null, (Exception) null).mo47683l(C12873i.payment_network_unavailable_title).mo47678g(C12873i.payment_network_unavailable_message).mo47673b());
                        return;
                    } else {
                        aVar2.mo46795h2(C13751d.m34341b(aVar2.requireContext(), (String) null, exc));
                        return;
                    }
                } else {
                    C13023l lVar5 = (C13023l) t;
                    PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) aVar2.f40822c;
                    if (purchaseTicketActivity != null) {
                        PaymentRegistrationInstructions paymentRegistrationInstructions = lVar5.f32228o;
                        PurchaseVerificationType purchaseVerificationType = lVar5.f32229p;
                        C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.TICKET_PURCHASE_RESULT);
                        aVar5.mo49941i(AnalyticsAttributeKey.SUCCESS, lVar5.f32226m);
                        aVar5.mo49938f(AnalyticsAttributeKey.REQUEST_ID, UUID.randomUUID());
                        aVar2.mo46797j2(aVar5.mo49933a());
                        if (paymentRegistrationInstructions != null) {
                            aVar2.startActivityForResult(PaymentRegistrationActivity.m41719z2(purchaseTicketActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions), 3811);
                            return;
                        } else if (purchaseVerificationType != null) {
                            PaymentGatewayFragment paymentGatewayFragment2 = (PaymentGatewayFragment) aVar2.getChildFragmentManager().mo3983z(C12869e.payment_method_view);
                            if (paymentGatewayFragment2 != null) {
                                paymentGatewayFragment2.mo48925m2(purchaseVerificationType);
                                return;
                            }
                            return;
                        } else {
                            Ticket ticket = (Ticket) C13717b.m34256c(lVar5.f32227n);
                            if (ticket != null) {
                                str = ticket.f23478g.mo24223c();
                            } else {
                                str = null;
                            }
                            if (ticket != null) {
                                currencyAmount = ticket.f23479h;
                            } else {
                                currencyAmount = null;
                            }
                            ArrayList arrayList = lVar5.f32227n;
                            if (arrayList != null) {
                                i2 = arrayList.size();
                            }
                            C20806a.C20807a aVar6 = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
                            aVar6.mo52934b("ticketing", "feature");
                            aVar6.mo52934b(Integer.valueOf(lVar5.f32227n.size()), "number_of_items");
                            aVar6.mo52934b(str, "agency_name");
                            aVar6.mo52938f(currencyAmount);
                            aVar6.mo52937e(InAppPurchaseMetaData.KEY_PRICE, currencyAmount);
                            if (currencyAmount != null) {
                                currencyAmount2 = CurrencyAmount.m17929f(i2, currencyAmount);
                            }
                            aVar6.mo52937e("revenue", currencyAmount2);
                            aVar6.mo52935c();
                            purchaseTicketActivity.mo24029C2(lVar5.f32227n);
                            return;
                        }
                    } else {
                        return;
                    }
                }
        }
    }
}
