package f10;

import a00.C13382a;
import android.widget.TextView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.utils.UiUtils;
import com.moovit.gcm.GcmNotificationActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PersonalDetails;
import com.moovit.payment.account.personalinfo.PaymentAccountPersonalInfoFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import p977zz.C20964s0;
import q00.C19047a;
import v40.C25754i;

/* renamed from: f10.c */
public final /* synthetic */ class C16932c implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f43945b;

    /* renamed from: c */
    public final /* synthetic */ Object f43946c;

    /* renamed from: d */
    public final /* synthetic */ Object f43947d;

    public /* synthetic */ C16932c(int i, Object obj, Object obj2) {
        this.f43945b = i;
        this.f43946c = obj;
        this.f43947d = obj2;
    }

    public final void onComplete(Task task) {
        PaymentAccount paymentAccount;
        boolean z;
        String str;
        switch (this.f43945b) {
            case 0:
                GcmNotificationActivity gcmNotificationActivity = (GcmNotificationActivity) this.f43946c;
                String str2 = GcmNotificationActivity.f41492x;
                gcmNotificationActivity.getClass();
                ((AtomicBoolean) this.f43947d).set(false);
                gcmNotificationActivity.finish();
                gcmNotificationActivity.overridePendingTransition(0, 0);
                return;
            default:
                PaymentAccountPersonalInfoFragment paymentAccountPersonalInfoFragment = (PaymentAccountPersonalInfoFragment) this.f43946c;
                C19047a aVar = (C19047a) this.f43947d;
                int i = PaymentAccountPersonalInfoFragment.f64090r;
                paymentAccountPersonalInfoFragment.getClass();
                PersonalDetails personalDetails = null;
                if (task.isSuccessful()) {
                    paymentAccount = (PaymentAccount) task.getResult();
                } else {
                    paymentAccount = null;
                }
                if (paymentAccount != null) {
                    personalDetails = paymentAccount.f64015d;
                }
                if (personalDetails != null) {
                    if (!C20964s0.m49090h(personalDetails.f64038b) || !C20964s0.m49090h(personalDetails.f64039c) || !C20964s0.m49090h(personalDetails.f64040d)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        String b = PersonalDetails.m64189b(aVar, personalDetails);
                        UiUtils.m40236D(paymentAccountPersonalInfoFragment.f64093p, b, 4);
                        C13382a.m33674j(paymentAccountPersonalInfoFragment.f64093p, paymentAccountPersonalInfoFragment.getResources().getString(C25754i.voiceover_user_name), b);
                        TextView textView = paymentAccountPersonalInfoFragment.f64094q;
                        if (C20964s0.m49090h(personalDetails.f64040d)) {
                            str = paymentAccountPersonalInfoFragment.f64094q.getContext().getString(C25754i.payment_my_account_empty_email);
                        } else {
                            str = personalDetails.f64040d;
                        }
                        textView.setText(str);
                        paymentAccountPersonalInfoFragment.f64092o.setVisibility(0);
                        return;
                    }
                }
                paymentAccountPersonalInfoFragment.f64092o.setVisibility(8);
                return;
        }
    }
}
