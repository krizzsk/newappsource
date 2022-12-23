package com.moovit.app.tod.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.model.TodOrderConfig;
import com.moovit.design.view.NumericStepperView;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import p543hq.C17474b;
import p783rw.C19370b;

/* renamed from: com.moovit.app.tod.order.a */
public abstract class C15529a extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f40366i = 0;

    /* renamed from: h */
    public NumericStepperView f40367h;

    /* renamed from: com.moovit.app.tod.order.a$a */
    public interface C15530a {
        /* renamed from: C0 */
        void mo46393C0(TodOrderConfig todOrderConfig);
    }

    public C15529a() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public abstract TodOrderConfig mo46410S1();

    /* renamed from: T1 */
    public abstract int mo46411T1();

    /* renamed from: U1 */
    public abstract void mo46412U1(ViewGroup viewGroup, TodOrderConfig todOrderConfig);

    /* renamed from: V1 */
    public void mo46413V1() {
        this.f40367h.mo47718a(0, mo46411T1(), false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.tod_order_settings_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("todOrderConfig", mo46410S1());
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ride_options_impression");
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, mo46411T1());
        aVar.mo49935c(AnalyticsAttributeKey.NUMBER_OF_ACCESSIBLE_SEATS, this.f40367h.getCounter());
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TodOrderConfig todOrderConfig;
        super.onViewCreated(view, bundle);
        Bundle K1 = mo46752K1();
        if (bundle != null) {
            todOrderConfig = (TodOrderConfig) bundle.getParcelable("todOrderConfig");
        } else {
            todOrderConfig = (TodOrderConfig) K1.getParcelable("todOrderConfig");
        }
        mo46412U1((ViewGroup) view.findViewById(R.id.profile_container), todOrderConfig);
        NumericStepperView numericStepperView = (NumericStepperView) ((ListItemView) view.findViewById(R.id.accessibility)).getAccessoryView();
        this.f40367h = numericStepperView;
        numericStepperView.setCounter(todOrderConfig.f40258d);
        ((Button) view.findViewById(R.id.save_button)).setOnClickListener(new C19370b(this, 4));
        mo46413V1();
    }
}
