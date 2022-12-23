package p923xs;

import android.content.UriMatcher;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.C1044w;
import c00.C13717b;
import c00.C13723g;
import c60.C13745a;
import c70.C13751d;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.LinkedText;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.ticketing.purchase.cart.PurchaseCartConfirmationActivity;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.Text;
import com.tranzmate.R;
import com.zendesk.service.ZendeskException;
import java.util.List;
import m80.C12869e;
import m80.C12873i;
import m80.C12875k;
import n10.C18505b;
import p435de.C16596f;
import p472er.C16864f;
import p946ys.C20760a;
import p970zs.C20888b;
import p977zz.C20961r;
import p977zz.C20964s0;
import v40.C25754i;
import w30.C6982a;
import w50.C20283g;
import y50.C20703a;
import y80.C13265d;

/* renamed from: xs.b */
public final /* synthetic */ class C20566b implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f52020a;

    /* renamed from: b */
    public final /* synthetic */ Object f52021b;

    public /* synthetic */ C20566b(Object obj, int i) {
        this.f52020a = i;
        this.f52021b = obj;
    }

    public final void onChanged(Object obj) {
        T t;
        String str;
        T t2;
        PaymentGatewayInstructions paymentGatewayInstructions;
        List<PaymentGateway> list;
        CreditCardInstructions creditCardInstructions;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        LinkedText linkedText = null;
        switch (this.f52020a) {
            case 0:
                C20568d dVar = (C20568d) this.f52021b;
                C20961r rVar = (C20961r) obj;
                UriMatcher uriMatcher = C20568d.f52024u;
                dVar.getClass();
                if (!rVar.f52711a || (t2 = rVar.f52712b) == null) {
                    Exception exc = rVar.f52713c;
                    if (exc instanceof ZendeskException) {
                        str = exc.getMessage();
                    } else {
                        str = dVar.getString(R.string.general_error_title);
                    }
                    AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a(dVar.requireContext()).mo47682k("alert_dialog_fragment_error_tag");
                    k.mo47676e(R.drawable.img_empty_warning, false);
                    AlertDialogFragment.C15856a h = k.mo47679h(str);
                    h.mo47674c(true);
                    h.mo47681j(R.string.retry_connect).mo47673b().show(dVar.getChildFragmentManager(), "alert_dialog_fragment_error_tag");
                    return;
                }
                C20760a aVar = (C20760a) t2;
                dVar.f52027p.setText(aVar.f52378b);
                Text.m17954b(dVar.f52028q, aVar.f52379c);
                dVar.f52030s.setTag(aVar);
                dVar.mo52780n2();
                return;
            case 1:
                C20283g gVar = (C20283g) this.f52021b;
                gVar.mo52457i(gVar.f51438l.getValue(), gVar.f51434h.getValue(), (CurrencyAmount) obj, gVar.f51435i.getValue());
                return;
            case 2:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) this.f52021b;
                C20703a aVar2 = (C20703a) obj;
                int i = PaymentGatewayFragment.f42661y;
                paymentGatewayFragment.getClass();
                if (aVar2 != null) {
                    paymentGatewayInstructions = aVar2.f52278b;
                } else {
                    paymentGatewayInstructions = null;
                }
                if (paymentGatewayInstructions != null) {
                    list = paymentGatewayInstructions.f42678c;
                } else {
                    list = null;
                }
                if (paymentGatewayInstructions != null) {
                    creditCardInstructions = paymentGatewayInstructions.f42679d;
                } else {
                    creditCardInstructions = null;
                }
                if (creditCardInstructions == null) {
                    z = false;
                } else {
                    z = creditCardInstructions.f42774c.f42605c.getClearanceProvider().mo48829f().contains(ClearanceProvider.Capabilities.CHANGE_SINGLE_PAYMENT_METHOD);
                }
                if (!z || !C13723g.m34280a(list, new C20888b(1))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (creditCardInstructions == null) {
                    z3 = false;
                } else {
                    z3 = creditCardInstructions.f42774c.f42605c.getClearanceProvider().mo48829f().contains(ClearanceProvider.Capabilities.REGISTER_MULTI_PAYMENT_METHOD);
                }
                if (z3 || (!z2 && creditCardInstructions != null)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Boolean bool = Boolean.TRUE;
                boolean equals = bool.equals(paymentGatewayFragment.mo46779N1(PaymentGatewayFragment.C16322a.class, new C18505b(4)));
                boolean z5 = !C13717b.m34258e(list);
                if (z2 || z4 || equals || z5) {
                    paymentGatewayFragment.f42666r.setAccessoryText(C25754i.action_change);
                    paymentGatewayFragment.f42666r.setOnClickListener(new C13745a(paymentGatewayFragment, z2, z4, equals));
                } else {
                    paymentGatewayFragment.f42666r.setAccessoryText((CharSequence) null);
                    paymentGatewayFragment.f42666r.setOnClickListener((View.OnClickListener) null);
                    paymentGatewayFragment.f42666r.setClickable(false);
                }
                if (aVar2 != null) {
                    linkedText = aVar2.f52285i;
                }
                if (linkedText == null) {
                    UiUtils.m40238F(8, paymentGatewayFragment.f42668t, paymentGatewayFragment.f42667s);
                    return;
                }
                C20964s0.m49103u(paymentGatewayFragment.f42668t.getTitleView(), linkedText, new C16864f(paymentGatewayFragment, 3));
                paymentGatewayFragment.f42668t.setChecked(bool.equals(paymentGatewayFragment.f42664p.f51442p.getValue()));
                paymentGatewayFragment.f42668t.setOnCheckedChangeListener(new C6982a(paymentGatewayFragment, 1));
                UiUtils.m40238F(0, paymentGatewayFragment.f42668t, paymentGatewayFragment.f42667s);
                return;
            default:
                PurchaseCartConfirmationActivity purchaseCartConfirmationActivity = (PurchaseCartConfirmationActivity) this.f52021b;
                C20961r rVar2 = (C20961r) obj;
                int i2 = PurchaseCartConfirmationActivity.f23266o0;
                purchaseCartConfirmationActivity.mo44506I1();
                if (!rVar2.f52711a || (t = rVar2.f52712b) == null) {
                    Exception exc2 = rVar2.f52713c;
                    purchaseCartConfirmationActivity.mo44530n2(C13751d.m34341b(purchaseCartConfirmationActivity, (String) null, exc2));
                    C16596f.m42113a().mo49364c(new ApplicationBugException("Failed to purchase cart!", exc2));
                    return;
                }
                C13265d dVar2 = (C13265d) t;
                PaymentRegistrationInstructions paymentRegistrationInstructions = dVar2.f32916n;
                if (paymentRegistrationInstructions != null) {
                    purchaseCartConfirmationActivity.startActivity(PaymentRegistrationActivity.m41719z2(purchaseCartConfirmationActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions));
                    return;
                }
                PurchaseVerificationType purchaseVerificationType = dVar2.f32917o;
                if (purchaseVerificationType != null) {
                    PaymentGatewayFragment paymentGatewayFragment2 = (PaymentGatewayFragment) purchaseCartConfirmationActivity.getSupportFragmentManager().mo3983z(C12869e.payment_method_view);
                    if (paymentGatewayFragment2 != null) {
                        paymentGatewayFragment2.mo48925m2(purchaseVerificationType);
                        return;
                    }
                    return;
                }
                Toast.makeText(purchaseCartConfirmationActivity, C12873i.payment_ticket_cash_confirmation_confirm_subtitle, 1).show();
                purchaseCartConfirmationActivity.startActivity(C12875k.m32667g(purchaseCartConfirmationActivity));
                purchaseCartConfirmationActivity.finish();
                return;
        }
    }
}
