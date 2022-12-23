package p757qu;

import android.widget.CompoundButton;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.C15161a;
import p543hq.C17474b;

/* renamed from: qu.f */
public final /* synthetic */ class C19183f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C15161a f48774a;

    public /* synthetic */ C19183f(C15161a aVar) {
        this.f48774a = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C15161a aVar = this.f48774a;
        int i = C15161a.f39052i;
        aVar.getClass();
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_station_entrance_explanation_dont_show_again_clicked");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_CHECKED, z);
        aVar.mo22564R1(aVar2.mo49933a());
    }
}
