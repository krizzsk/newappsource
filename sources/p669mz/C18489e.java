package p669mz;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1044w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c00.C13717b;
import c70.C13751d;
import c90.C7578a;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.location.places.Place;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.UserRequestError;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import com.moovit.ticketing.purchase.history.TransactionHistoryActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueConfirmedActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueStep;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.util.CurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.usebutton.sdk.internal.api.AppActionRequest;
import f90.C12639a;
import f90.C12640b;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import k00.C17988b;
import m80.C12868d;
import m80.C12869e;
import m80.C12873i;
import p435de.C16596f;
import p543hq.C17474b;
import p80.C12989a;
import p80.C12991b;
import p977zz.C20944i0;
import p977zz.C20947k;
import p977zz.C20961r;
import q80.C13027p;
import w40.C25761d;
import z00.C20795a;
import z20.C20806a;

/* renamed from: mz.e */
public final /* synthetic */ class C18489e implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f47092a;

    /* renamed from: b */
    public final /* synthetic */ Object f47093b;

    /* renamed from: c */
    public final /* synthetic */ Object f47094c;

    public /* synthetic */ C18489e(int i, Object obj, Object obj2) {
        this.f47092a = i;
        this.f47093b = obj;
        this.f47094c = obj2;
    }

    public final void onChanged(Object obj) {
        PaymentGatewayFragment paymentGatewayFragment;
        T t;
        TicketAgency ticketAgency;
        int i;
        CharSequence charSequence;
        int i2;
        boolean z = true;
        CharSequence charSequence2 = null;
        int i3 = 0;
        switch (this.f47092a) {
            case 0:
                C1044w wVar = (C1044w) this.f47094c;
                if (((C18490f) this.f47093b).f47095a.compareAndSet(true, false)) {
                    wVar.onChanged(obj);
                    return;
                }
                return;
            case 1:
                TransactionHistoryActivity transactionHistoryActivity = (TransactionHistoryActivity) this.f47093b;
                C20961r rVar = (C20961r) obj;
                int i4 = TransactionHistoryActivity.f23372Z;
                transactionHistoryActivity.getClass();
                ((SwipeRefreshLayout) this.f47094c).setRefreshing(false);
                if (rVar.f52711a) {
                    C20944i0 i0Var = (C20944i0) rVar.f52712b;
                    Calendar calendar = (Calendar) i0Var.f52692a;
                    List list = (List) i0Var.f52693b;
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "transaction_history_impression");
                    aVar.mo49935c(AnalyticsAttributeKey.COUNT, list.size());
                    aVar.mo49939g(AnalyticsAttributeKey.CHOSEN_TIME, String.format(Locale.US, "%02d_%d", new Object[]{Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1))}));
                    transactionHistoryActivity.mo44545v2(aVar.mo49933a());
                    boolean e = C25761d.m64299a().mo83590e();
                    ListItemView listItemView = transactionHistoryActivity.f23374X;
                    if (!e) {
                        i3 = 8;
                    }
                    listItemView.setVisibility(i3);
                    if (C13717b.m34258e(list)) {
                        RecyclerView recyclerView = transactionHistoryActivity.f23375Y;
                        Context context = recyclerView.getContext();
                        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
                        Drawable b = C17988b.m44611b(C12868d.img_transactions_history_empty, context);
                        if (e) {
                            i = C12873i.payment_transaction_monthly_empty_title;
                        } else {
                            i = C12873i.payment_transaction_empty_title;
                        }
                        if (i == 0) {
                            charSequence = null;
                        } else {
                            charSequence = context.getText(i);
                        }
                        if (e) {
                            i2 = C12873i.payment_transaction_monthly_empty_subtitle;
                        } else {
                            i2 = C12873i.payment_transaction_empty_subtitle;
                        }
                        if (i2 != 0) {
                            charSequence2 = context.getText(i2);
                        }
                        recyclerView.mo4627l0(new C20795a(b, charSequence, charSequence2));
                        return;
                    }
                    transactionHistoryActivity.f23375Y.mo4627l0(new C7578a(list, transactionHistoryActivity));
                    return;
                }
                transactionHistoryActivity.f23375Y.mo4627l0(C13751d.m34340a(rVar.f52713c, transactionHistoryActivity));
                return;
            default:
                C12640b bVar = (C12640b) this.f47093b;
                PurchaseStoredValueStep purchaseStoredValueStep = (PurchaseStoredValueStep) this.f47094c;
                C20961r rVar2 = (C20961r) obj;
                int i5 = C12640b.f31237s;
                bVar.mo46784S1();
                if (!rVar2.f52711a || (t = rVar2.f52712b) == null) {
                    Exception exc = rVar2.f52713c;
                    ServerId serverId = purchaseStoredValueStep.f23454e;
                    if (exc instanceof UserRequestError) {
                        UserRequestError userRequestError = (UserRequestError) exc;
                        if (bVar.f40824e && (paymentGatewayFragment = (PaymentGatewayFragment) bVar.getChildFragmentManager().mo3983z(C12869e.payment_method_view)) != null) {
                            paymentGatewayFragment.mo48928p2();
                        }
                        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.TICKET_PURCHASE_RESULT);
                        aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
                        aVar2.mo49937e(AnalyticsAttributeKey.PROVIDER, ((PurchaseStoredValueStep) bVar.f32728o).f23454e);
                        aVar2.mo49935c(AnalyticsAttributeKey.ERROR_CODE, userRequestError.mo49160b());
                        bVar.mo46797j2(aVar2.mo49933a());
                        TicketingErrorAction.createErrorDialog(bVar.requireContext(), userRequestError).show(bVar.getChildFragmentManager(), "payment_error_dialog");
                        return;
                    }
                    C16596f a = C16596f.m42113a();
                    a.mo49363b("ProviderId: " + serverId);
                    a.mo49364c(new ApplicationBugException("Failed to purchase itinerary tickets!", exc));
                    if (!C20947k.m49056a(bVar.requireContext())) {
                        bVar.mo46795h2(C13751d.m34342c(bVar.requireContext(), (String) null, (Exception) null).mo47683l(C12873i.payment_network_unavailable_title).mo47678g(C12873i.payment_network_unavailable_message).mo47673b());
                        return;
                    } else {
                        bVar.mo46795h2(C13751d.m34341b(bVar.requireContext(), (String) null, exc));
                        return;
                    }
                } else {
                    C13027p pVar = (C13027p) t;
                    PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) bVar.f40822c;
                    if (purchaseTicketActivity != null) {
                        C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.TICKET_PURCHASE_RESULT);
                        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.SUCCESS;
                        if (pVar.f32232m == null) {
                            z = false;
                        }
                        aVar3.mo49941i(analyticsAttributeKey, z);
                        aVar3.mo49937e(AnalyticsAttributeKey.PROVIDER, ((PurchaseStoredValueStep) bVar.f32728o).f23454e);
                        aVar3.mo49938f(AnalyticsAttributeKey.REQUEST_ID, UUID.randomUUID());
                        bVar.mo46797j2(aVar3.mo49933a());
                        PaymentRegistrationInstructions paymentRegistrationInstructions = pVar.f32233n;
                        if (paymentRegistrationInstructions != null) {
                            bVar.startActivityForResult(PaymentRegistrationActivity.m41719z2(purchaseTicketActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions), Place.TYPE_SUBPREMISE);
                            return;
                        }
                        PurchaseVerificationType purchaseVerificationType = pVar.f32234o;
                        if (purchaseVerificationType != null) {
                            PaymentGatewayFragment paymentGatewayFragment2 = (PaymentGatewayFragment) bVar.getChildFragmentManager().mo3983z(C12869e.payment_method_view);
                            if (paymentGatewayFragment2 != null) {
                                paymentGatewayFragment2.mo48925m2(purchaseVerificationType);
                                return;
                            }
                            return;
                        }
                        C12639a aVar4 = pVar.f32232m;
                        CurrencyAmount currencyAmount = aVar4.f31235c;
                        C12989a a2 = ((C12991b) bVar.mo46776J1("TICKETING_CONFIGURATION")).mo39880a(aVar4.f31233a, aVar4.f31234b);
                        if (a2 != null) {
                            ticketAgency = a2.f32150b;
                        } else {
                            ticketAgency = null;
                        }
                        if (ticketAgency != null) {
                            charSequence2 = ticketAgency.mo24223c();
                        }
                        C20806a.C20807a aVar5 = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
                        aVar5.mo52934b("ticketing", "feature");
                        aVar5.mo52936d("provider_id", aVar4.f31233a);
                        aVar5.mo52934b(charSequence2, "agency_name");
                        aVar5.mo52938f(currencyAmount);
                        aVar5.mo52937e(InAppPurchaseMetaData.KEY_PRICE, currencyAmount);
                        aVar5.mo52935c();
                        C12639a aVar6 = pVar.f32232m;
                        ServerId serverId2 = aVar6.f31233a;
                        String str = aVar6.f31234b;
                        CurrencyAmount currencyAmount2 = aVar6.f31235c;
                        if (aVar6.f31236d) {
                            Intent intent = new Intent(purchaseTicketActivity, PurchaseStoredValueConfirmedActivity.class);
                            intent.putExtra("providerId", serverId2);
                            intent.putExtra("agencyKey", str);
                            intent.putExtra("amount", currencyAmount2);
                            purchaseTicketActivity.startActivity(intent);
                        }
                        purchaseTicketActivity.setResult(-1);
                        purchaseTicketActivity.finish();
                        return;
                    }
                    return;
                }
        }
    }
}
