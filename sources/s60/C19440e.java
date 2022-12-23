package s60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import p543hq.C17474b;
import p808sx.C19568d;
import v40.C25750e;
import v40.C25751f;

/* renamed from: s60.e */
public class C19440e extends C15676b<PaymentRegistrationActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f49452h = 0;

    /* renamed from: s60.e$a */
    public interface C19441a {
        /* renamed from: f0 */
        void mo51853f0();
    }

    public C19440e() {
        super(PaymentRegistrationActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.profile_skip_dialog_fragment, viewGroup, false);
        inflate.findViewById(C25750e.got_it_button).setOnClickListener(new C19568d(this, 9));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "skip_dialog");
        mo22564R1(aVar.mo49933a());
    }
}
