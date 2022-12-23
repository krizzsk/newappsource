package com.moovit.payment.account.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import p480ez.C16910b;
import p543hq.C17474b;
import v40.C25750e;
import v40.C25751f;

/* renamed from: com.moovit.payment.account.profile.a */
public class C25705a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f64111h = 0;

    /* renamed from: com.moovit.payment.account.profile.a$a */
    public interface C25706a {
        /* renamed from: S0 */
        void mo83552S0();
    }

    public C25705a() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_account_delete_profile_dialog_fragment, viewGroup, false);
        inflate.findViewById(C25750e.delete_button).setOnClickListener(new C16910b(this, 7));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "dismiss_dialog");
        mo22564R1(aVar.mo49933a());
    }
}
