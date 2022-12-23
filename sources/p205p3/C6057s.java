package p205p3;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p081f3.C4656h;

/* renamed from: p3.s */
public final class C6057s {

    /* renamed from: a */
    public final ScheduledExecutorService f19306a;

    /* renamed from: b */
    public final HashMap f19307b = new HashMap();

    /* renamed from: c */
    public final HashMap f19308c = new HashMap();

    /* renamed from: d */
    public final Object f19309d = new Object();

    /* renamed from: p3.s$a */
    public class C6058a implements ThreadFactory {

        /* renamed from: b */
        public int f19310b = 0;

        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder k = C13555b.m33972k("WorkManager-WorkTimer-thread-");
            k.append(this.f19310b);
            newThread.setName(k.toString());
            this.f19310b++;
            return newThread;
        }
    }

    /* renamed from: p3.s$b */
    public interface C6059b {
        /* renamed from: a */
        void mo5712a(String str);
    }

    /* renamed from: p3.s$c */
    public static class C6060c implements Runnable {

        /* renamed from: b */
        public final C6057s f19311b;

        /* renamed from: c */
        public final String f19312c;

        public C6060c(C6057s sVar, String str) {
            this.f19311b = sVar;
            this.f19312c = str;
        }

        public final void run() {
            synchronized (this.f19311b.f19309d) {
                if (((C6060c) this.f19311b.f19307b.remove(this.f19312c)) != null) {
                    C6059b bVar = (C6059b) this.f19311b.f19308c.remove(this.f19312c);
                    if (bVar != null) {
                        bVar.mo5712a(this.f19312c);
                    }
                } else {
                    C4656h c = C4656h.m11960c();
                    String.format("Timer with %s is already marked as complete.", new Object[]{this.f19312c});
                    c.mo20176a(new Throwable[0]);
                }
            }
        }
    }

    static {
        C4656h.m11961e("WorkTimer");
    }

    public C6057s() {
        C6058a aVar = new C6058a();
        this.f19306a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public final void mo22042a(String str, C6059b bVar) {
        synchronized (this.f19309d) {
            C4656h c = C4656h.m11960c();
            String.format("Starting timer for %s", new Object[]{str});
            c.mo20176a(new Throwable[0]);
            mo22043b(str);
            C6060c cVar = new C6060c(this, str);
            this.f19307b.put(str, cVar);
            this.f19308c.put(str, bVar);
            this.f19306a.schedule(cVar, 600000, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    public final void mo22043b(String str) {
        synchronized (this.f19309d) {
            if (((C6060c) this.f19307b.remove(str)) != null) {
                C4656h c = C4656h.m11960c();
                String.format("Stopping timer for %s", new Object[]{str});
                c.mo20176a(new Throwable[0]);
                this.f19308c.remove(str);
            }
        }
    }
}
