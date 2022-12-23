package p644lx;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import p543hq.C17474b;
import p644lx.C18294i;

/* renamed from: lx.h */
public final /* synthetic */ class C18293h implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C18294i.C18295a f46645b;

    /* renamed from: c */
    public final /* synthetic */ TodShuttleTrip f46646c;

    /* renamed from: d */
    public final /* synthetic */ int f46647d;

    public /* synthetic */ C18293h(C18294i.C18295a aVar, TodShuttleTrip todShuttleTrip, int i) {
        this.f46645b = aVar;
        this.f46646c = todShuttleTrip;
        this.f46647d = i;
    }

    public final void onClick(View view) {
        C18294i.C18295a aVar = this.f46645b;
        TodShuttleTrip todShuttleTrip = this.f46646c;
        int i = this.f46647d;
        int i2 = aVar.f46655i;
        aVar.f46655i = i;
        if (i2 != -1) {
            aVar.notifyItemChanged(i2);
        }
        aVar.notifyItemChanged(aVar.f46655i);
        C18294i iVar = C18294i.this;
        int i3 = C18294i.f46648v;
        iVar.getClass();
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "list_item_clicked");
        aVar2.mo49939g(AnalyticsAttributeKey.TRIP_ID, todShuttleTrip.f40431b);
        iVar.mo46797j2(aVar2.mo49933a());
        iVar.f46652u.setEnabled(true);
    }
}
