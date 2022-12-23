package com.moovit.payment.account.paymentmethod;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.moovit.C15676b;
import com.moovit.app.ads.C14761v;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.account.PaymentAccountActivity;
import e50.C25721c;
import e50.C25722d;
import p597jy.C17979a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25750e;
import v40.C25751f;

/* renamed from: com.moovit.payment.account.paymentmethod.b */
public class C25696b extends C15676b<PaymentAccountActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f64066j = 0;

    /* renamed from: h */
    public final C25697a f64067h = new C25697a();

    /* renamed from: i */
    public PaymentMethodId f64068i;

    /* renamed from: com.moovit.payment.account.paymentmethod.b$a */
    public class C25697a extends C20438i<C25721c, C25722d> {
        public C25697a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C25721c cVar2 = (C25721c) cVar;
            C25722d dVar = (C25722d) gVar;
            C25696b bVar = C25696b.this;
            int i = C25696b.f64066j;
            bVar.getClass();
            bVar.mo46753L1(C25698b.class, new C14761v(bVar, true, (Exception) null));
            bVar.dismissAllowingStateLoss();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C25721c cVar2 = (C25721c) cVar;
            C25696b bVar = C25696b.this;
            int i = C25696b.f64066j;
            bVar.getClass();
            bVar.mo46753L1(C25698b.class, new C14761v(bVar, false, exc));
            bVar.dismissAllowingStateLoss();
            return true;
        }
    }

    /* renamed from: com.moovit.payment.account.paymentmethod.b$b */
    public interface C25698b {
        /* renamed from: i1 */
        void mo83526i1();

        /* renamed from: y1 */
        void mo83529y1(Exception exc);
    }

    public C25696b() {
        super(PaymentAccountActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentMethodId paymentMethodId = (PaymentMethodId) mo46752K1().getParcelable("paymentMethodId");
        this.f64068i = paymentMethodId;
        if (paymentMethodId == null) {
            throw new ApplicationBugException("Did you use DeletePaymentDialogFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.delete_payment_method_dialog_fragment, viewGroup, false);
        ((Button) inflate.findViewById(C25750e.button)).setOnClickListener(new C17979a(this, 7));
        return inflate;
    }
}
