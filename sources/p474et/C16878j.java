package p474et;

import androidx.lifecycle.C1044w;
import com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import com.moovit.app.tod.center.subscriptions.TodWeeklySubscriptionDetailsFragment;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: et.j */
public final /* synthetic */ class C16878j implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f43898a;

    /* renamed from: b */
    public final /* synthetic */ C24236l f43899b;

    public /* synthetic */ C16878j(C24236l lVar, int i) {
        this.f43898a = i;
        this.f43899b = lVar;
    }

    public final void onChanged(Object obj) {
        switch (this.f43898a) {
            case 0:
                C24236l lVar = this.f43899b;
                int i = SuggestionsSectionFragment.f38283w;
                C24362h.m61211f(lVar, "$tmp0");
                lVar.invoke(obj);
                return;
            case 1:
                C24236l lVar2 = this.f43899b;
                int i2 = StopArrivalsActivity.f39603q0;
                C24362h.m61211f(lVar2, "$tmp0");
                lVar2.invoke(obj);
                return;
            default:
                C24236l lVar3 = this.f43899b;
                int i3 = TodWeeklySubscriptionDetailsFragment.f40230u;
                C24362h.m61211f(lVar3, "$tmp0");
                lVar3.invoke(obj);
                return;
        }
    }
}
