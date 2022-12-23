package r60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import n60.C18531b;
import p242s1.C6333d0;
import p501fw.C17102a;
import p543hq.C17474b;
import v40.C25750e;
import v40.C25751f;

/* renamed from: r60.g */
public class C19242g extends C15676b<PaymentRegistrationActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f48870h = 0;

    public C19242g() {
        super(PaymentRegistrationActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_registration_switch_device_dialog, viewGroup, false);
        C6333d0.m15030r(inflate.findViewById(C25750e.title), true);
        inflate.findViewById(C25750e.switch_button).setOnClickListener(new C17102a(this, 23));
        inflate.findViewById(C25750e.cancel).setOnClickListener(new C18531b(this, 1));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "switch_device_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }
}
