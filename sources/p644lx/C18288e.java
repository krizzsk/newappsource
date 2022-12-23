package p644lx;

import android.view.View;
import android.widget.Button;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.shuttle.model.TodShuttleStop;
import p543hq.C17474b;
import p644lx.C18289f;

/* renamed from: lx.e */
public final /* synthetic */ class C18288e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C18289f.C18290a f46622b;

    /* renamed from: c */
    public final /* synthetic */ TodShuttleStop f46623c;

    /* renamed from: d */
    public final /* synthetic */ int f46624d;

    public /* synthetic */ C18288e(C18289f.C18290a aVar, TodShuttleStop todShuttleStop, int i) {
        this.f46622b = aVar;
        this.f46623c = todShuttleStop;
        this.f46624d = i;
    }

    public final void onClick(View view) {
        boolean z;
        TodShuttleStop todShuttleStop;
        TodShuttleStop todShuttleStop2;
        boolean z2;
        C18289f.C18290a aVar = this.f46622b;
        TodShuttleStop todShuttleStop3 = this.f46623c;
        int i = this.f46624d;
        int i2 = aVar.f46640m;
        if (i == i2) {
            aVar.f46640m = -1;
        } else if (i == aVar.f46641n) {
            aVar.f46641n = aVar.f46634g.size();
        } else if (i2 == -1) {
            aVar.f46640m = i;
        } else {
            aVar.f46641n = i;
        }
        C18289f fVar = C18289f.this;
        boolean z3 = true;
        if (i == aVar.f46642o) {
            z = true;
        } else {
            z = false;
        }
        C18289f.C18290a aVar2 = (C18289f.C18290a) fVar.f46632x.f47543g;
        int i3 = aVar2.f46640m;
        if (i3 != -1) {
            todShuttleStop = aVar2.f46634g.get(i3);
        } else {
            todShuttleStop = null;
        }
        if (aVar2.f46641n != aVar2.f46634g.size()) {
            todShuttleStop2 = aVar2.f46634g.get(aVar2.f46641n);
        } else {
            todShuttleStop2 = null;
        }
        C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "stop_clicked");
        aVar3.mo49937e(AnalyticsAttributeKey.STOP_ID, todShuttleStop3.f40427b);
        aVar3.mo49935c(AnalyticsAttributeKey.STOP_INDEX, i);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.IS_CHECKED;
        if (todShuttleStop3 == todShuttleStop || todShuttleStop3 == todShuttleStop2) {
            z2 = true;
        } else {
            z2 = false;
        }
        aVar3.mo49941i(analyticsAttributeKey, z2);
        aVar3.mo49941i(AnalyticsAttributeKey.IS_CLOSEST_STATION, z);
        fVar.mo46797j2(aVar3.mo49933a());
        fVar.mo46797j2(fVar.f46631w.mo40228c());
        fVar.mo50679r2();
        fVar.f46630v.mo1788r((CharSequence) null, false);
        fVar.f46630v.clearFocus();
        Button button = fVar.f46633y;
        if (todShuttleStop == null || todShuttleStop2 == null) {
            z3 = false;
        }
        button.setEnabled(z3);
        aVar.notifyDataSetChanged();
    }
}
