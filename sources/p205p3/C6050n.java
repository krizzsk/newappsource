package p205p3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1420a;
import java.util.UUID;
import p081f3.C4652d;
import p081f3.C4653e;
import p081f3.C4656h;
import p177n1.C5799a;
import p192o3.C5956p;
import p218q3.C6165a;
import p218q3.C6166b;

/* renamed from: p3.n */
public final class C6050n implements Runnable {

    /* renamed from: h */
    public static final /* synthetic */ int f19280h = 0;

    /* renamed from: b */
    public final C1420a<Void> f19281b = new C1420a<>();

    /* renamed from: c */
    public final Context f19282c;

    /* renamed from: d */
    public final C5956p f19283d;

    /* renamed from: e */
    public final ListenableWorker f19284e;

    /* renamed from: f */
    public final C4653e f19285f;

    /* renamed from: g */
    public final C6165a f19286g;

    /* renamed from: p3.n$a */
    public class C6051a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C1420a f19287b;

        public C6051a(C1420a aVar) {
            this.f19287b = aVar;
        }

        public final void run() {
            this.f19287b.mo5758j(C6050n.this.f19284e.getForegroundInfoAsync());
        }
    }

    /* renamed from: p3.n$b */
    public class C6052b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C1420a f19289b;

        public C6052b(C1420a aVar) {
            this.f19289b = aVar;
        }

        public final void run() {
            try {
                C4652d dVar = (C4652d) this.f19289b.get();
                if (dVar != null) {
                    C4656h c = C4656h.m11960c();
                    int i = C6050n.f19280h;
                    String.format("Updating notification for %s", new Object[]{C6050n.this.f19283d.f19084c});
                    c.mo20176a(new Throwable[0]);
                    C6050n.this.f19284e.setRunInForeground(true);
                    C6050n nVar = C6050n.this;
                    C1420a<Void> aVar = nVar.f19281b;
                    C4653e eVar = nVar.f19285f;
                    Context context = nVar.f19282c;
                    UUID id = nVar.f19284e.getId();
                    C6054p pVar = (C6054p) eVar;
                    pVar.getClass();
                    C1420a aVar2 = new C1420a();
                    ((C6166b) pVar.f19296a).mo22153a(new C6053o(pVar, aVar2, id, dVar, context));
                    aVar.mo5758j(aVar2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{C6050n.this.f19283d.f19084c}));
            } catch (Throwable th) {
                C6050n.this.f19281b.mo5757i(th);
            }
        }
    }

    static {
        C4656h.m11961e("WorkForegroundRunnable");
    }

    @SuppressLint({"LambdaLast"})
    public C6050n(Context context, C5956p pVar, ListenableWorker listenableWorker, C4653e eVar, C6165a aVar) {
        this.f19282c = context;
        this.f19283d = pVar;
        this.f19284e = listenableWorker;
        this.f19285f = eVar;
        this.f19286g = aVar;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f19283d.f19098q || C5799a.m14228b()) {
            this.f19281b.mo5756h(null);
            return;
        }
        C1420a aVar = new C1420a();
        ((C6166b) this.f19286g).f19551c.execute(new C6051a(aVar));
        aVar.addListener(new C6052b(aVar), ((C6166b) this.f19286g).f19551c);
    }
}
