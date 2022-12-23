package p665mv;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ridesharing.EventDetailActivity;
import com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenView;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.payment.account.profile.PaymentAccountEditProfileActivity;
import com.moovit.payment.account.profile.PaymentAccountProfilesFragment;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.ticketing.activation.C7632a;
import com.moovit.ticketing.purchase.cart.CartInfo;
import com.moovit.ticketing.purchase.cart.CartItem;
import com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketConfirmedActivity;
import com.moovit.ticketing.purchase.fare.PurchaseTicketsConfirmedActivity;
import com.moovit.ticketing.ticket.Ticket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m80.C12880o;
import m80.C12886u;
import m80.C12887v;
import p244s3.C6444s;
import p543hq.C17474b;
import x80.C13239a;

/* renamed from: mv.c */
public final /* synthetic */ class C18467c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f47066b;

    /* renamed from: c */
    public final /* synthetic */ Object f47067c;

    /* renamed from: d */
    public final /* synthetic */ Object f47068d;

    public /* synthetic */ C18467c(int i, Object obj, Object obj2) {
        this.f47066b = i;
        this.f47067c = obj;
        this.f47068d = obj2;
    }

    public final void onClick(View view) {
        switch (this.f47066b) {
            case 0:
                int i = EventDetailActivity.f39265u0;
                ((EventDetailActivity) this.f47067c).startActivity((Intent) this.f47068d);
                return;
            case 1:
                int i2 = WondoFullScreenView.f40690h;
                ((WondoFullScreenView.C15651a) this.f47067c).mo46679e((WondoFullScreenDisplayInfo) this.f47068d);
                return;
            case 2:
                PaymentAccountProfilesFragment paymentAccountProfilesFragment = (PaymentAccountProfilesFragment) this.f47067c;
                PaymentProfile paymentProfile = (PaymentProfile) this.f47068d;
                int i3 = PaymentAccountProfilesFragment.f64106q;
                paymentAccountProfilesFragment.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_edit_profile_clicked");
                aVar.mo49937e(AnalyticsAttributeKey.ID, paymentProfile.f42828b);
                paymentAccountProfilesFragment.mo46797j2(aVar.mo49933a());
                paymentAccountProfilesFragment.startActivity(PaymentAccountEditProfileActivity.m64248y2(paymentAccountProfilesFragment.requireContext(), paymentProfile.f42828b));
                return;
            case 3:
                C7632a aVar2 = (C7632a) this.f47067c;
                int i4 = C7632a.f23237h;
                aVar2.mo23976U1((Ticket) this.f47068d, "cancel_clicked");
                aVar2.dismissAllowingStateLoss();
                return;
            case 4:
                CartItem cartItem = (CartItem) this.f47068d;
                C13239a aVar3 = PurchaseCartConfirmationActivity.this.f23271m0;
                CartInfo value = aVar3.f32862c.getValue();
                if (value != null) {
                    C12887v b = C12887v.m32668b();
                    String str = value.f23253b;
                    String str2 = cartItem.f23258b;
                    ExecutorService executorService = MoovitExecutors.COMPUTATION;
                    Tasks.call(executorService, new C12880o(b, 1)).onSuccessTask(executorService, new C12886u(str, str2)).addOnSuccessListener((Executor) executorService, new C6444s(aVar3, 5));
                    return;
                }
                return;
            case 5:
                int i5 = PurchaseTicketConfirmedActivity.f23294l0;
                ((PurchaseTicketConfirmedActivity) this.f47067c).mo24057I2((Ticket) this.f47068d);
                return;
            default:
                PurchaseTicketsConfirmedActivity purchaseTicketsConfirmedActivity = PurchaseTicketsConfirmedActivity.this;
                int i6 = PurchaseTicketsConfirmedActivity.f23305Z;
                purchaseTicketsConfirmedActivity.mo23967D2((Ticket) this.f47068d);
                return;
        }
    }
}
