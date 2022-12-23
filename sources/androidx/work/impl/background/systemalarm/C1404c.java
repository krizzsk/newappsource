package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.C1405d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p081f3.C4656h;
import p092g3.C4753b;
import p143k3.C5464c;
import p143k3.C5465d;
import p192o3.C5956p;
import p192o3.C5959r;
import p205p3.C6049m;
import p205p3.C6057s;

/* renamed from: androidx.work.impl.background.systemalarm.c */
public final class C1404c implements C5464c, C4753b, C6057s.C6059b {

    /* renamed from: b */
    public final Context f5190b;

    /* renamed from: c */
    public final int f5191c;

    /* renamed from: d */
    public final String f5192d;

    /* renamed from: e */
    public final C1405d f5193e;

    /* renamed from: f */
    public final C5465d f5194f;

    /* renamed from: g */
    public final Object f5195g = new Object();

    /* renamed from: h */
    public int f5196h = 0;

    /* renamed from: i */
    public PowerManager.WakeLock f5197i;

    /* renamed from: j */
    public boolean f5198j = false;

    static {
        C4656h.m11961e("DelayMetCommandHandler");
    }

    public C1404c(Context context, int i, String str, C1405d dVar) {
        this.f5190b = context;
        this.f5191c = i;
        this.f5193e = dVar;
        this.f5192d = str;
        this.f5194f = new C5465d(context, dVar.f5201c, this);
    }

    /* renamed from: a */
    public final void mo5712a(String str) {
        C4656h c = C4656h.m11960c();
        String.format("Exceeded time limits on execution for %s", new Object[]{str});
        c.mo20176a(new Throwable[0]);
        mo5717g();
    }

    /* renamed from: b */
    public final void mo5713b() {
        synchronized (this.f5195g) {
            this.f5194f.mo21355c();
            this.f5193e.f5202d.mo22043b(this.f5192d);
            PowerManager.WakeLock wakeLock = this.f5197i;
            if (wakeLock != null && wakeLock.isHeld()) {
                C4656h c = C4656h.m11960c();
                String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f5197i, this.f5192d});
                c.mo20176a(new Throwable[0]);
                this.f5197i.release();
            }
        }
    }

    /* renamed from: c */
    public final void mo5714c(ArrayList arrayList) {
        mo5717g();
    }

    /* renamed from: d */
    public final void mo5715d() {
        this.f5197i = C6049m.m14532a(this.f5190b, String.format("%s (%s)", new Object[]{this.f5192d, Integer.valueOf(this.f5191c)}));
        C4656h c = C4656h.m11960c();
        String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f5197i, this.f5192d});
        c.mo20176a(new Throwable[0]);
        this.f5197i.acquire();
        C5956p i = ((C5959r) this.f5193e.f5204f.f16072c.mo5701q()).mo21951i(this.f5192d);
        if (i == null) {
            mo5717g();
            return;
        }
        boolean b = i.mo21935b();
        this.f5198j = b;
        if (!b) {
            C4656h c2 = C4656h.m11960c();
            String.format("No constraints for %s", new Object[]{this.f5192d});
            c2.mo20176a(new Throwable[0]);
            mo5716f(Collections.singletonList(this.f5192d));
            return;
        }
        this.f5194f.mo21354b(Collections.singletonList(i));
    }

    /* renamed from: e */
    public final void mo5711e(String str, boolean z) {
        C4656h c = C4656h.m11960c();
        String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        c.mo20176a(new Throwable[0]);
        mo5713b();
        if (z) {
            Intent b = C1402a.m3754b(this.f5190b, this.f5192d);
            C1405d dVar = this.f5193e;
            dVar.mo5721d(new C1405d.C1407b(this.f5191c, b, dVar));
        }
        if (this.f5198j) {
            Intent intent = new Intent(this.f5190b, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            C1405d dVar2 = this.f5193e;
            dVar2.mo5721d(new C1405d.C1407b(this.f5191c, intent, dVar2));
        }
    }

    /* renamed from: f */
    public final void mo5716f(List<String> list) {
        if (list.contains(this.f5192d)) {
            synchronized (this.f5195g) {
                if (this.f5196h == 0) {
                    this.f5196h = 1;
                    C4656h c = C4656h.m11960c();
                    String.format("onAllConstraintsMet for %s", new Object[]{this.f5192d});
                    c.mo20176a(new Throwable[0]);
                    if (this.f5193e.f5203e.mo20265f(this.f5192d, (WorkerParameters.C1384a) null)) {
                        this.f5193e.f5202d.mo22042a(this.f5192d, this);
                    } else {
                        mo5713b();
                    }
                } else {
                    C4656h c2 = C4656h.m11960c();
                    String.format("Already started work for %s", new Object[]{this.f5192d});
                    c2.mo20176a(new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo5717g() {
        synchronized (this.f5195g) {
            if (this.f5196h < 2) {
                this.f5196h = 2;
                C4656h c = C4656h.m11960c();
                String.format("Stopping work for WorkSpec %s", new Object[]{this.f5192d});
                c.mo20176a(new Throwable[0]);
                Context context = this.f5190b;
                String str = this.f5192d;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str);
                C1405d dVar = this.f5193e;
                dVar.mo5721d(new C1405d.C1407b(this.f5191c, intent, dVar));
                if (this.f5193e.f5203e.mo20263c(this.f5192d)) {
                    C4656h c2 = C4656h.m11960c();
                    String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f5192d});
                    c2.mo20176a(new Throwable[0]);
                    Intent b = C1402a.m3754b(this.f5190b, this.f5192d);
                    C1405d dVar2 = this.f5193e;
                    dVar2.mo5721d(new C1405d.C1407b(this.f5191c, b, dVar2));
                } else {
                    C4656h c3 = C4656h.m11960c();
                    String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f5192d});
                    c3.mo20176a(new Throwable[0]);
                }
            } else {
                C4656h c4 = C4656h.m11960c();
                String.format("Already stopped work for %s", new Object[]{this.f5192d});
                c4.mo20176a(new Throwable[0]);
            }
        }
    }
}
