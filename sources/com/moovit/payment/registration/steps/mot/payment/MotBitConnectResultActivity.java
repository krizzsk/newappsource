package com.moovit.payment.registration.steps.mot.payment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.RequestOptions;
import h60.C17334m;
import h60.C17343p;
import p067e1.C4503l0;
import p543hq.C17474b;
import p824tp.C19731i;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25751f;
import v40.C25754i;

public class MotBitConnectResultActivity extends MoovitPaymentActivity {

    /* renamed from: U */
    public final C16382a f42815U = new C16382a();

    /* renamed from: X */
    public boolean f42816X;

    /* renamed from: com.moovit.payment.registration.steps.mot.payment.MotBitConnectResultActivity$a */
    public class C16382a extends C20438i<C17334m, C17343p> {
        public C16382a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17334m mVar = (C17334m) cVar;
            C17343p pVar = (C17343p) gVar;
            MotBitConnectResultActivity.m41760y2(MotBitConnectResultActivity.this, pVar.f44727m, pVar.f44728n);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17334m mVar = (C17334m) cVar;
            MotBitConnectResultActivity.m41760y2(MotBitConnectResultActivity.this, false, (PaymentRegistrationInstructions) null);
            return true;
        }
    }

    /* renamed from: y2 */
    public static void m41760y2(MotBitConnectResultActivity motBitConnectResultActivity, boolean z, PaymentRegistrationInstructions paymentRegistrationInstructions) {
        int i;
        motBitConnectResultActivity.f42816X = z;
        if (z) {
            i = C25754i.payment_mot_registration_bit_connect_success_message;
        } else {
            i = C25754i.payment_mot_registration_bit_connect_fail_message;
        }
        Toast.makeText(motBitConnectResultActivity, i, 1).show();
        C4503l0 l0Var = new C4503l0(motBitConnectResultActivity);
        l0Var.f15585b.add(Intent.makeMainActivity(C19731i.m47197a(motBitConnectResultActivity).f50171a.f50151b));
        if (paymentRegistrationInstructions != null) {
            l0Var.mo20021a(PaymentRegistrationActivity.m41719z2(motBitConnectResultActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions));
        }
        l0Var.mo20024e();
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49941i(AnalyticsAttributeKey.SUCCESS, this.f42816X);
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.mot_connect_bit_result_activity);
        C17334m mVar = new C17334m(mo44548x1());
        String name = C17334m.class.getName();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(name, mVar, requestOptions, this.f42815U);
    }
}
