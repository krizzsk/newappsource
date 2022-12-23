package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import p081f3.C4656h;
import p092g3.C4753b;
import p092g3.C4755d;
import p092g3.C4763k;
import p205p3.C6045j;
import p205p3.C6049m;
import p205p3.C6057s;
import p218q3.C6165a;
import p218q3.C6166b;

/* renamed from: androidx.work.impl.background.systemalarm.d */
public final class C1405d implements C4753b {

    /* renamed from: l */
    public static final /* synthetic */ int f5199l = 0;

    /* renamed from: b */
    public final Context f5200b;

    /* renamed from: c */
    public final C6165a f5201c;

    /* renamed from: d */
    public final C6057s f5202d = new C6057s();

    /* renamed from: e */
    public final C4755d f5203e;

    /* renamed from: f */
    public final C4763k f5204f;

    /* renamed from: g */
    public final C1402a f5205g;

    /* renamed from: h */
    public final Handler f5206h;

    /* renamed from: i */
    public final ArrayList f5207i;

    /* renamed from: j */
    public Intent f5208j;

    /* renamed from: k */
    public C1408c f5209k;

    /* renamed from: androidx.work.impl.background.systemalarm.d$a */
    public class C1406a implements Runnable {
        public C1406a() {
        }

        public final void run() {
            C1409d dVar;
            C1405d dVar2;
            synchronized (C1405d.this.f5207i) {
                C1405d dVar3 = C1405d.this;
                dVar3.f5208j = (Intent) dVar3.f5207i.get(0);
            }
            Intent intent = C1405d.this.f5208j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1405d.this.f5208j.getIntExtra("KEY_START_ID", 0);
                C4656h c = C4656h.m11960c();
                int i = C1405d.f5199l;
                String.format("Processing command %s, %s", new Object[]{C1405d.this.f5208j, Integer.valueOf(intExtra)});
                c.mo20176a(new Throwable[0]);
                PowerManager.WakeLock a = C6049m.m14532a(C1405d.this.f5200b, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C4656h c2 = C4656h.m11960c();
                    String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a});
                    c2.mo20176a(new Throwable[0]);
                    a.acquire();
                    C1405d dVar4 = C1405d.this;
                    dVar4.f5205g.mo5710c(intExtra, dVar4.f5208j, dVar4);
                    C4656h c3 = C4656h.m11960c();
                    String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a});
                    c3.mo20176a(new Throwable[0]);
                    a.release();
                    dVar2 = C1405d.this;
                    dVar = new C1409d(dVar2);
                } catch (Throwable th) {
                    C4656h c4 = C4656h.m11960c();
                    int i2 = C1405d.f5199l;
                    String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a});
                    c4.mo20176a(new Throwable[0]);
                    a.release();
                    C1405d dVar5 = C1405d.this;
                    dVar5.mo5721d(new C1409d(dVar5));
                    throw th;
                }
                dVar2.mo5721d(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$b */
    public static class C1407b implements Runnable {

        /* renamed from: b */
        public final C1405d f5211b;

        /* renamed from: c */
        public final Intent f5212c;

        /* renamed from: d */
        public final int f5213d;

        public C1407b(int i, Intent intent, C1405d dVar) {
            this.f5211b = dVar;
            this.f5212c = intent;
            this.f5213d = i;
        }

        public final void run() {
            this.f5211b.mo5718a(this.f5213d, this.f5212c);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$c */
    public interface C1408c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    public static class C1409d implements Runnable {

        /* renamed from: b */
        public final C1405d f5214b;

        public C1409d(C1405d dVar) {
            this.f5214b = dVar;
        }

        public final void run() {
            boolean z;
            C1405d dVar = this.f5214b;
            dVar.getClass();
            C4656h c = C4656h.m11960c();
            int i = C1405d.f5199l;
            c.mo20176a(new Throwable[0]);
            dVar.mo5719b();
            synchronized (dVar.f5207i) {
                boolean z2 = true;
                if (dVar.f5208j != null) {
                    C4656h c2 = C4656h.m11960c();
                    String.format("Removing command %s", new Object[]{dVar.f5208j});
                    c2.mo20176a(new Throwable[0]);
                    if (((Intent) dVar.f5207i.remove(0)).equals(dVar.f5208j)) {
                        dVar.f5208j = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                C6045j jVar = ((C6166b) dVar.f5201c).f19549a;
                C1402a aVar = dVar.f5205g;
                synchronized (aVar.f5184d) {
                    if (!aVar.f5183c.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    if (dVar.f5207i.isEmpty()) {
                        synchronized (jVar.f19269d) {
                            if (jVar.f19267b.isEmpty()) {
                                z2 = false;
                            }
                        }
                        if (!z2) {
                            C4656h.m11960c().mo20176a(new Throwable[0]);
                            C1408c cVar = dVar.f5209k;
                            if (cVar != null) {
                                ((SystemAlarmService) cVar).mo5709b();
                            }
                        }
                    }
                }
                if (!dVar.f5207i.isEmpty()) {
                    dVar.mo5722f();
                }
            }
        }
    }

    static {
        C4656h.m11961e("SystemAlarmDispatcher");
    }

    public C1405d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5200b = applicationContext;
        this.f5205g = new C1402a(applicationContext);
        C4763k g = C4763k.m12079g(context);
        this.f5204f = g;
        C4755d dVar = g.f16075f;
        this.f5203e = dVar;
        this.f5201c = g.f16073d;
        dVar.mo20262a(this);
        this.f5207i = new ArrayList();
        this.f5208j = null;
        this.f5206h = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo5718a(int i, Intent intent) {
        C4656h c = C4656h.m11960c();
        boolean z = false;
        String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)});
        c.mo20176a(new Throwable[0]);
        mo5719b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C4656h.m11960c().mo20179f(new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            mo5719b();
            synchronized (this.f5207i) {
                Iterator it = this.f5207i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f5207i) {
            boolean z2 = !this.f5207i.isEmpty();
            this.f5207i.add(intent);
            if (!z2) {
                mo5722f();
            }
        }
    }

    /* renamed from: b */
    public final void mo5719b() {
        if (this.f5206h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: c */
    public final void mo5720c() {
        C4656h.m11960c().mo20176a(new Throwable[0]);
        C4755d dVar = this.f5203e;
        synchronized (dVar.f16051l) {
            dVar.f16050k.remove(this);
        }
        C6057s sVar = this.f5202d;
        if (!sVar.f19306a.isShutdown()) {
            sVar.f19306a.shutdownNow();
        }
        this.f5209k = null;
    }

    /* renamed from: d */
    public final void mo5721d(Runnable runnable) {
        this.f5206h.post(runnable);
    }

    /* renamed from: e */
    public final void mo5711e(String str, boolean z) {
        Context context = this.f5200b;
        int i = C1402a.f5181e;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        mo5721d(new C1407b(0, intent, this));
    }

    /* renamed from: f */
    public final void mo5722f() {
        mo5719b();
        PowerManager.WakeLock a = C6049m.m14532a(this.f5200b, "ProcessCommand");
        try {
            a.acquire();
            ((C6166b) this.f5204f.f16073d).mo22153a(new C1406a());
        } finally {
            a.release();
        }
    }
}
