package t60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import p543hq.C17474b;
import p572iw.C17662e;
import p783rw.C19370b;
import v40.C25750e;
import v40.C25751f;

/* renamed from: t60.f */
public class C19637f extends C15676b<PaymentRegistrationActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f49826h = 0;

    /* renamed from: t60.f$a */
    public interface C19638a {
        /* renamed from: A0 */
        void mo51972A0();
    }

    public C19637f() {
        super(PaymentRegistrationActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.discard_certifications_dialog_fragment, viewGroup, false);
        inflate.findViewById(C25750e.discard_photos).setOnClickListener(new C17662e(this, 13));
        inflate.findViewById(C25750e.cancel).setOnClickListener(new C19370b(this, 17));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "dismiss_dialog");
        mo22564R1(aVar.mo49933a());
    }
}
