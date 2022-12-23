package com.moovit.payment.account.external.mot;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.play.core.assetpacks.C14314s;
import com.moovit.commons.utils.LinkedText;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.request.RequestOptions;
import com.moovit.request.UserRequestError;
import com.moovit.util.CurrencyAmount;
import f60.C16947a;
import h60.C17346q;
import h60.C17349r;
import p451du.C16723t;
import p453dw.C16740o;
import p495fq.C17057b;
import p551hy.C17517b;
import p597jy.C17979a;
import p761qy.C19201a;
import p783rw.C19370b;
import p808sx.C19568d;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20927a0;
import p977zz.C20964s0;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

public class MotPaymentAccountActivity extends MoovitPaymentActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f64002X = 0;

    /* renamed from: U */
    public final C25665a f64003U = new C25665a();

    /* renamed from: com.moovit.payment.account.external.mot.MotPaymentAccountActivity$a */
    public class C25665a extends C20438i<C17346q, C17349r> {
        public C25665a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17346q qVar = (C17346q) cVar;
            MotPaymentAccountActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            boolean z;
            C17346q qVar = (C17346q) cVar;
            C17349r rVar = (C17349r) gVar;
            C14314s sVar = rVar.f44734m;
            C17517b bVar = rVar.f44735n;
            CreditCardInstructions creditCardInstructions = rVar.f44736o;
            MotPaymentAccountActivity motPaymentAccountActivity = MotPaymentAccountActivity.this;
            int i = MotPaymentAccountActivity.f64002X;
            motPaymentAccountActivity.setContentView(C25751f.mot_payment_account_activity);
            View findViewById = motPaymentAccountActivity.findViewById(C25750e.account_warning_group);
            LinkedText linkedText = (LinkedText) bVar.f45096d;
            int i2 = 0;
            if (linkedText != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C20964s0.m49103u(motPaymentAccountActivity.mo44549x2(C25750e.account_warning), linkedText, new C17057b(motPaymentAccountActivity, 4));
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
            ListItemView listItemView = (ListItemView) motPaymentAccountActivity.findViewById(C25750e.payment_method_view);
            if (((MotPaymentMethodType) sVar.f36023b) == MotPaymentMethodType.PANGO) {
                listItemView.setIcon(C25749d.img_logo_pango_24);
                listItemView.setTitle(C25754i.payment_mot_services_pango);
                String str = (String) sVar.f36025d;
                if (str != null) {
                    listItemView.setSubtitle((CharSequence) motPaymentAccountActivity.getString(C25754i.format_last_digits, new Object[]{str}));
                }
                if (creditCardInstructions != null) {
                    listItemView.setOnClickListener(new C16723t(7, motPaymentAccountActivity, creditCardInstructions));
                    listItemView.setVisibility(0);
                } else {
                    listItemView.setOnClickListener((View.OnClickListener) null);
                    listItemView.setVisibility(8);
                }
            } else {
                listItemView.setIcon(C25749d.img_logo_bit_24);
                listItemView.setTitle(C25754i.payment_mot_services_bit);
                listItemView.setOnClickListener((View.OnClickListener) null);
                listItemView.setVisibility(8);
            }
            CurrencyAmount currencyAmount = ((C16947a) sVar.f36024c).f43959a;
            ListItemView listItemView2 = (ListItemView) motPaymentAccountActivity.findViewById(C25750e.payment_bills_view);
            listItemView2.setSubtitle((CharSequence) motPaymentAccountActivity.getString(C25754i.payment_mot_my_bills_estimate_short, new Object[]{currencyAmount.toString()}));
            listItemView2.setOnClickListener(new C19370b(motPaymentAccountActivity, 10));
            View findViewById2 = motPaymentAccountActivity.findViewById(C25750e.disconnect_view);
            if (!PaymentAccountContextStatus.isStatusOf((PaymentAccountContextStatus) bVar.f45095c, PaymentAccountContextStatus.INCOMPLETE, PaymentAccountContextStatus.CONNECTED)) {
                i2 = 8;
            }
            findViewById2.setVisibility(i2);
            findViewById2.setOnClickListener(new C17979a(motPaymentAccountActivity, 6));
            ((ListItemView) motPaymentAccountActivity.findViewById(C25750e.price_information)).setOnClickListener(new C16740o(motPaymentAccountActivity, 13));
            ((ListItemView) motPaymentAccountActivity.findViewById(C25750e.terms_service)).setOnClickListener(new C19568d(motPaymentAccountActivity, 5));
            ((ListItemView) motPaymentAccountActivity.findViewById(C25750e.feedback_view)).setOnClickListener(new C19201a(motPaymentAccountActivity, 7));
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17346q qVar = (C17346q) cVar;
            MotPaymentAccountActivity motPaymentAccountActivity = MotPaymentAccountActivity.this;
            int i = MotPaymentAccountActivity.f64002X;
            motPaymentAccountActivity.setContentView(C25751f.general_error_view);
            if (!(exc instanceof UserRequestError)) {
                return true;
            }
            UserRequestError userRequestError = (UserRequestError) exc;
            AlertMessageView alertMessageView = (AlertMessageView) motPaymentAccountActivity.findViewById(C25750e.failure_view);
            alertMessageView.setTitle((CharSequence) userRequestError.mo49162d());
            alertMessageView.setSubtitle((CharSequence) userRequestError.mo49161c());
            return true;
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo44543u2((CharSequence) null);
        C17346q qVar = new C17346q(mo44548x1());
        String name = C17346q.class.getName();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2(name, qVar, requestOptions, this.f64003U);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Toast.makeText(this, C25754i.payment_mot_services_update_success, 1).show();
        }
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("confirm_disconnect_dialog_tag".equals(str)) {
            if (i == -1) {
                Intent i2 = C20927a0.m49014i(Uri.parse("moovit://feedback").buildUpon().appendQueryParameter("o", "mot_disconnect").appendQueryParameter("ctag", "feedback_cat_mot").appendQueryParameter("ftag", "mot_disconnect").build());
                i2.setPackage(getPackageName());
                C20927a0.m49017l(this, i2);
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
