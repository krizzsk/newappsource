package com.moovit.app.ads;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import p259t5.C6592b;
import p471eq.C16850a;
import p543hq.C17474b;

/* renamed from: com.moovit.app.ads.y */
public class C14764y extends C15682c<MoovitAppActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f37582n = 0;

    /* renamed from: com.moovit.app.ads.y$a */
    public interface C14765a {
        /* renamed from: x1 */
        void mo44736x1();
    }

    public C14764y() {
        super(MoovitAppActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.subscription_promo_cell, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "subscriptions_promo_cell_impression");
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageButton) view.findViewById(R.id.dismiss_button)).setOnClickListener(new C16850a(this, 1));
        ((Button) view.findViewById(R.id.subscribe_button)).setOnClickListener(new C6592b(this, 4));
    }
}
