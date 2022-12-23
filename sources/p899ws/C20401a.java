package p899ws;

import android.os.Parcelable;
import c00.C13722f;
import com.moovit.app.help.feedback.CategoryType;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContext;
import p664mu.C18443f;

/* renamed from: ws.a */
public final /* synthetic */ class C20401a implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f51696b;

    /* renamed from: c */
    public final /* synthetic */ String f51697c;

    public /* synthetic */ C20401a(String str, int i) {
        this.f51696b = i;
        this.f51697c = str;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f51696b) {
            case 0:
                String str = this.f51697c;
                int i = FeedbackFormActivity.f38102u0;
                return ((CategoryType) obj).getCategoryTypeTag().equals(str);
            case 1:
                String str2 = this.f51697c;
                C18443f fVar = C18443f.f47013e;
                return str2.equals(((MotActivation) obj).f38989f);
            default:
                String str3 = this.f51697c;
                Parcelable.Creator<PaymentAccount> creator = PaymentAccount.CREATOR;
                return str3.equals(((PaymentAccountContext) obj).f64030b);
        }
    }
}
