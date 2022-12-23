package com.moovit.app.gcm.popup.rate;

import androidx.fragment.app.FragmentActivity;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.gcm.payload.RateUsPayload;
import p543hq.C17474b;
import p567iq.C17635b;

/* renamed from: com.moovit.app.gcm.popup.rate.a */
public abstract class C14884a extends C15676b<MoovitActivity> {
    public C14884a() {
        super(MoovitActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(getActivity()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public boolean mo44990S1() {
        return true;
    }

    public final void onStart() {
        super.onStart();
        if (!(this instanceof C14885b)) {
            FragmentActivity activity = getActivity();
            C17635b.m43779f(activity).f50173c.mo22849g(activity, AnalyticsFlowKey.POPUP);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_rate_us_type");
            if (((RateUsPayload) mo46752K1().getParcelable("payload")) != null) {
                aVar.mo49939g(AnalyticsAttributeKey.PUSH_ID, ((RateUsPayload) mo46752K1().getParcelable("payload")).f41546b);
            }
            mo22564R1(aVar.mo49933a());
        }
    }

    public final void onStop() {
        super.onStop();
        if (mo44990S1()) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_rate_us_type");
            mo22564R1(aVar.mo49933a());
            FragmentActivity activity = getActivity();
            C17635b.m43779f(activity).f50173c.mo22847b(activity, AnalyticsFlowKey.POPUP, true);
        }
    }
}
