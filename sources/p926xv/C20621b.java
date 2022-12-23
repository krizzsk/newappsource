package p926xv;

import android.view.View;
import android.widget.Toast;
import c70.C13751d;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.MoovitActivity;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.settings.PaymentAccountSettings;
import com.moovit.payment.account.settings.PaymentAccountSettingsActivity;
import com.moovit.request.RequestOptions;
import h60.C17367w1;
import j80.C12773b;
import m30.C5679b;
import m30.C5680c;
import p977zz.C20964s0;
import t30.C6560b;
import v40.C25754i;

/* renamed from: xv.b */
public final /* synthetic */ class C20621b implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f52131b;

    /* renamed from: c */
    public final /* synthetic */ Object f52132c;

    /* renamed from: d */
    public final /* synthetic */ Object f52133d;

    public /* synthetic */ C20621b(int i, Object obj, Object obj2) {
        this.f52131b = i;
        this.f52132c = obj;
        this.f52133d = obj2;
    }

    public final void onSuccess(Object obj) {
        boolean z;
        switch (this.f52131b) {
            case 0:
                C20622c cVar = (C20622c) this.f52132c;
                cVar.mo52812S1((View) this.f52133d, cVar.f52135h, (C12773b) obj);
                return;
            case 1:
                ((LocationSettingsFixer) this.f52132c).mo48526g((MoovitActivity) this.f52133d, (C16202a.C16203a) obj);
                return;
            case 2:
                C5679b bVar = (C5679b) this.f52132c;
                MoovitActivity moovitActivity = (MoovitActivity) this.f52133d;
                C6560b bVar2 = (C6560b) obj;
                int i = C5679b.f18460q;
                bVar.getClass();
                C5680c cVar2 = bVar2.f20374m;
                if (cVar2 != null) {
                    bVar.mo21531o2(cVar2);
                }
                String str = bVar2.f20375n;
                if (!C20964s0.m49090h(str)) {
                    Toast.makeText(moovitActivity, str, 0).show();
                }
                bVar.mo21530n2(true, (Exception) null, cVar2);
                return;
            default:
                PaymentAccountSettingsActivity paymentAccountSettingsActivity = (PaymentAccountSettingsActivity) this.f52132c;
                Boolean bool = (Boolean) this.f52133d;
                PaymentAccount paymentAccount = (PaymentAccount) obj;
                int i2 = PaymentAccountSettingsActivity.f64114l0;
                if (paymentAccount == null) {
                    paymentAccountSettingsActivity.mo83562y2();
                    paymentAccountSettingsActivity.mo44530n2(C13751d.m34341b(paymentAccountSettingsActivity, (String) null, (Exception) null));
                    return;
                }
                paymentAccountSettingsActivity.getClass();
                PaymentAccountSettings paymentAccountSettings = paymentAccount.f64020i;
                if (bool == null || bool.equals(paymentAccountSettings.f64113b)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C17367w1 w1Var = new C17367w1(paymentAccountSettingsActivity.mo44548x1(), bool);
                    StringBuilder sb = new StringBuilder();
                    C13715c.m34249o(C17367w1.class, sb, "_");
                    sb.append(w1Var.f44759w);
                    String sb2 = sb.toString();
                    RequestOptions requestOptions = new RequestOptions();
                    requestOptions.f42909f = true;
                    paymentAccountSettingsActivity.mo44527k2(sb2, w1Var, requestOptions, paymentAccountSettingsActivity.f64115U);
                    return;
                }
                paymentAccountSettingsActivity.mo83562y2();
                Toast.makeText(paymentAccountSettingsActivity, C25754i.settings_account_settings_saved_message, 0).show();
                return;
        }
    }
}
