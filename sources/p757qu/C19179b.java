package p757qu;

import android.widget.CompoundButton;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import p543hq.C17474b;

/* renamed from: qu.b */
public final /* synthetic */ class C19179b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C19180c f48765a;

    public /* synthetic */ C19179b(C19180c cVar) {
        this.f48765a = cVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C19180c cVar = this.f48765a;
        int i = C19180c.f48766i;
        cVar.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_exit_station_explanation_dont_show_again_clicked");
        aVar.mo49941i(AnalyticsAttributeKey.IS_CHECKED, z);
        cVar.mo22564R1(aVar.mo49933a());
    }
}
