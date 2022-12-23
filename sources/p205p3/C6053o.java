package p205p3;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.impl.foreground.C1410a;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C1420a;
import java.util.UUID;
import p081f3.C4652d;
import p092g3.C4755d;
import p192o3.C5959r;

/* renamed from: p3.o */
public final class C6053o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1420a f19291b;

    /* renamed from: c */
    public final /* synthetic */ UUID f19292c;

    /* renamed from: d */
    public final /* synthetic */ C4652d f19293d;

    /* renamed from: e */
    public final /* synthetic */ Context f19294e;

    /* renamed from: f */
    public final /* synthetic */ C6054p f19295f;

    public C6053o(C6054p pVar, C1420a aVar, UUID uuid, C4652d dVar, Context context) {
        this.f19295f = pVar;
        this.f19291b = aVar;
        this.f19292c = uuid;
        this.f19293d = dVar;
        this.f19294e = context;
    }

    public final void run() {
        try {
            if (!(this.f19291b.f5240b instanceof AbstractFuture.C1414b)) {
                String uuid = this.f19292c.toString();
                WorkInfo$State f = ((C5959r) this.f19295f.f19298c).mo21948f(uuid);
                if (f == null || f.isFinished()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((C4755d) this.f19295f.f19297b).mo20264d(uuid, this.f19293d);
                this.f19294e.startService(C1410a.m3772a(this.f19294e, uuid, this.f19293d));
            }
            this.f19291b.mo5756h(null);
        } catch (Throwable th) {
            this.f19291b.mo5757i(th);
        }
    }
}
