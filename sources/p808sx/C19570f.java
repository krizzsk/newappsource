package p808sx;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import j00.C17682a;
import p269u2.C6677a;
import p543hq.C17474b;
import p567iq.C17635b;

/* renamed from: sx.f */
public final class C19570f extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ View f49745a;

    public C19570f(Button button) {
        this.f49745a = button;
    }

    public final void onAnimationStart(Animator animator) {
        Context context = this.f49745a.getContext();
        C6677a aVar = C17635b.m43779f(context).f50173c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.GENIE;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.OPEN_ACTIVITY);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ginie_trip_plan_from_search_button");
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(context, analyticsFlowKey, true, bVarArr);
    }
}
