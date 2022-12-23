package p118i3;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.C1402a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p081f3.C4656h;
import p092g3.C4757e;
import p192o3.C5956p;

/* renamed from: i3.b */
public final class C5264b implements C4757e {

    /* renamed from: b */
    public final Context f17394b;

    static {
        C4656h.m11961e("SystemAlarmScheduler");
    }

    public C5264b(Context context) {
        this.f17394b = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo20270a(C5956p... pVarArr) {
        for (C5956p pVar : pVarArr) {
            C4656h c = C4656h.m11960c();
            String.format("Scheduling work with workSpecId %s", new Object[]{pVar.f19082a});
            c.mo20176a(new Throwable[0]);
            this.f17394b.startService(C1402a.m3754b(this.f17394b, pVar.f19082a));
        }
    }

    /* renamed from: b */
    public final void mo20271b(String str) {
        Context context = this.f17394b;
        int i = C1402a.f5181e;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.f17394b.startService(intent);
    }

    /* renamed from: d */
    public final boolean mo20272d() {
        return true;
    }
}
