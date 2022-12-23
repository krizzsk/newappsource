package com.moovit.payment.account.personalinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PersonalDetails;
import p154l1.C5554b;
import p242s1.C6375m;
import p451du.C16705b;
import p543hq.C17474b;
import v40.C25750e;
import v40.C25751f;
import v40.C25752g;
import v40.C25754i;
import w40.C25761d;

public class PaymentAccountDetailsActivity extends MoovitPaymentActivity {

    /* renamed from: n0 */
    public static final /* synthetic */ int f64070n0 = 0;

    /* renamed from: U */
    public PaymentAccount f64071U;

    /* renamed from: X */
    public ListItemView f64072X;

    /* renamed from: Y */
    public ListItemView f64073Y;

    /* renamed from: Z */
    public ListItemView f64074Z;

    /* renamed from: l0 */
    public ListItemView f64075l0;

    /* renamed from: m0 */
    public ListItemView f64076m0;

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(C25752g.payment_account_details_menu, menu);
        MenuItem findItem = menu.findItem(C25750e.edit);
        String string = getString(C25754i.voiceover_edit_personal_details);
        if (findItem instanceof C5554b) {
            ((C5554b) findItem).setContentDescription(string);
            return true;
        } else if (Build.VERSION.SDK_INT < 26) {
            return true;
        } else {
            C6375m.m15192h(findItem, string);
            return true;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_account_details_activity);
        this.f64072X = (ListItemView) findViewById(C25750e.name_view);
        this.f64073Y = (ListItemView) findViewById(C25750e.email_view);
        this.f64074Z = (ListItemView) findViewById(C25750e.phone_view);
        this.f64075l0 = (ListItemView) findViewById(C25750e.birth_date_view);
        this.f64076m0 = (ListItemView) findViewById(C25750e.address_view);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo44543u2((CharSequence) null);
        C25761d.m64299a().mo83587b(false).addOnCompleteListener((Activity) this, new C16705b(this, 4));
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C25750e.edit) {
            return super.onOptionsItemSelected(menuItem);
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_edit_details_clicked");
        mo44545v2(aVar.mo49933a());
        PersonalDetails personalDetails = this.f64071U.f64015d;
        Intent intent = new Intent(this, PaymentAccountEditDetailsActivity.class);
        intent.putExtra("personalDetails", personalDetails);
        startActivity(intent);
        return true;
    }
}
