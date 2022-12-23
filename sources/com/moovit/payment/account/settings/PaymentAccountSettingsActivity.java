package com.moovit.payment.account.settings;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.MoovitPaymentActivity;
import h60.C17367w1;
import h60.C17370x1;
import p613kq.C18114a;
import p613kq.C18115b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25751f;
import v40.C25754i;
import w40.C25761d;

public class PaymentAccountSettingsActivity extends MoovitPaymentActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f64114l0 = 0;

    /* renamed from: U */
    public final C25709a f64115U = new C25709a();

    /* renamed from: X */
    public ListItemView f64116X;

    /* renamed from: Y */
    public Button f64117Y;

    /* renamed from: Z */
    public View f64118Z;

    /* renamed from: com.moovit.payment.account.settings.PaymentAccountSettingsActivity$a */
    public class C25709a extends C20438i<C17367w1, C17370x1> {
        public C25709a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17367w1 w1Var = (C17367w1) cVar;
            PaymentAccountSettingsActivity paymentAccountSettingsActivity = PaymentAccountSettingsActivity.this;
            int i = PaymentAccountSettingsActivity.f64114l0;
            paymentAccountSettingsActivity.mo83562y2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17367w1 w1Var = (C17367w1) cVar;
            C17370x1 x1Var = (C17370x1) gVar;
            Toast.makeText(PaymentAccountSettingsActivity.this, C25754i.settings_account_settings_saved_message, 0).show();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17367w1 w1Var = (C17367w1) cVar;
            PaymentAccountSettingsActivity paymentAccountSettingsActivity = PaymentAccountSettingsActivity.this;
            paymentAccountSettingsActivity.mo44530n2(C13751d.m34341b(paymentAccountSettingsActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_account_settings_activity);
        C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) this, new C18114a(this, 11)).addOnFailureListener((Activity) this, (OnFailureListener) new C18115b(this, 6));
    }

    /* renamed from: y2 */
    public final void mo83562y2() {
        this.f64118Z.setVisibility(4);
        this.f64117Y.setText(C25754i.action_save);
        this.f64117Y.setClickable(true);
        this.f64116X.setClickable(true);
    }
}
