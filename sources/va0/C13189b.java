package va0;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: va0.b */
public final class C13189b {

    /* renamed from: a */
    public String f32751a;

    /* renamed from: b */
    public int f32752b;

    /* renamed from: c */
    public long f32753c;

    /* renamed from: d */
    public int f32754d;

    /* renamed from: e */
    public HashSet f32755e = new HashSet();

    /* renamed from: f */
    public C13191b f32756f;

    /* renamed from: g */
    public PriorityQueue<C13192c> f32757g = new PriorityQueue<>(1, new C13190a());

    /* renamed from: va0.b$a */
    public class C13190a implements Comparator<C13192c> {
        public final int compare(Object obj, Object obj2) {
            C13192c cVar = (C13192c) obj;
            C13192c cVar2 = (C13192c) obj2;
            int i = cVar.f32760c;
            int i2 = cVar2.f32760c;
            if (i != i2) {
                return i2 - i;
            }
            return (int) (cVar.f32761d - cVar2.f32761d);
        }
    }

    /* renamed from: va0.b$b */
    public interface C13191b {
    }

    /* renamed from: va0.b$c */
    public static class C13192c {

        /* renamed from: a */
        public final Runnable f32758a;

        /* renamed from: b */
        public final Object f32759b;

        /* renamed from: c */
        public final int f32760c;

        /* renamed from: d */
        public final long f32761d;

        public C13192c(C13196e eVar, int i, long j, Object obj) {
            this.f32758a = eVar;
            this.f32760c = i;
            this.f32761d = j;
            this.f32759b = obj;
        }
    }

    /* renamed from: va0.b$d */
    public static class C13193d extends Thread {

        /* renamed from: b */
        public final C13189b f32762b;

        public C13193d(String str, C13189b bVar) {
            super(str);
            this.f32762b = bVar;
            setPriority(1);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:9|(2:31|22)|26|27|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0053, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0094, code lost:
            if (va0.C13189b.m33244a(r4.f32762b, r4) == false) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0096, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0097, code lost:
            r0 = r4.f32762b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0099, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a0, code lost:
            if (r0.f32757g.size() <= 0) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a2, code lost:
            r1 = r0.f32757g.poll().f32758a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ac, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ae, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00af, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b0, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b2, code lost:
            r1.run();
            java.lang.Thread.yield();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bc, code lost:
            if (java.lang.Thread.interrupted() == false) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00be, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0052 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
            L_0x0000:
                va0.b r0 = r4.f32762b
                monitor-enter(r0)
                va0.b r1 = r4.f32762b     // Catch:{ all -> 0x00c2 }
                boolean r1 = va0.C13189b.m33244a(r1, r4)     // Catch:{ all -> 0x00c2 }
                if (r1 == 0) goto L_0x000d
                monitor-exit(r0)     // Catch:{ all -> 0x00c2 }
                return
            L_0x000d:
                va0.b r1 = r4.f32762b     // Catch:{ all -> 0x00c2 }
                java.util.PriorityQueue<va0.b$c> r1 = r1.f32757g     // Catch:{ all -> 0x00c2 }
                int r1 = r1.size()     // Catch:{ all -> 0x00c2 }
                if (r1 != 0) goto L_0x0054
                va0.b r1 = r4.f32762b     // Catch:{ all -> 0x00c2 }
                int r2 = r1.f32754d     // Catch:{ all -> 0x00c2 }
                int r2 = r2 + -1
                r1.f32754d = r2     // Catch:{ all -> 0x00c2 }
                if (r2 != 0) goto L_0x004c
                va0.b$b r1 = r1.f32756f     // Catch:{ all -> 0x00c2 }
                if (r1 == 0) goto L_0x004c
                na0.j$a r1 = (na0.C12932j.C12933a) r1     // Catch:{ all -> 0x00c2 }
                java.lang.ref.WeakReference<xa0.b> r1 = r1.f32056a     // Catch:{ all -> 0x00c2 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00c2 }
                xa0.b r1 = (xa0.C13244b) r1     // Catch:{ all -> 0x00c2 }
                if (r1 == 0) goto L_0x004c
                monitor-enter(r1)     // Catch:{ all -> 0x00c2 }
                int r2 = r1.f32865a     // Catch:{ all -> 0x0049 }
                int r2 = r2 + -1
                r1.f32865a = r2     // Catch:{ all -> 0x0049 }
                if (r2 != 0) goto L_0x0047
                android.os.Message r2 = new android.os.Message     // Catch:{ all -> 0x0049 }
                r2.<init>()     // Catch:{ all -> 0x0049 }
                r3 = 5
                r2.what = r3     // Catch:{ all -> 0x0049 }
                xa0.b$a r3 = r1.f32866b     // Catch:{ all -> 0x0049 }
                r3.sendMessage(r2)     // Catch:{ all -> 0x0049 }
            L_0x0047:
                monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
                goto L_0x004c
            L_0x0049:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
                throw r2     // Catch:{ all -> 0x00c2 }
            L_0x004c:
                va0.b r1 = r4.f32762b     // Catch:{ InterruptedException -> 0x0052 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0052 }
                goto L_0x0054
            L_0x0052:
                monitor-exit(r0)     // Catch:{ all -> 0x00c2 }
                return
            L_0x0054:
                va0.b r1 = r4.f32762b     // Catch:{ all -> 0x00c2 }
                int r2 = r1.f32754d     // Catch:{ all -> 0x00c2 }
                if (r2 != 0) goto L_0x0085
                va0.b$b r1 = r1.f32756f     // Catch:{ all -> 0x00c2 }
                if (r1 == 0) goto L_0x0085
                na0.j$a r1 = (na0.C12932j.C12933a) r1     // Catch:{ all -> 0x00c2 }
                java.lang.ref.WeakReference<xa0.b> r1 = r1.f32056a     // Catch:{ all -> 0x00c2 }
                java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00c2 }
                xa0.b r1 = (xa0.C13244b) r1     // Catch:{ all -> 0x00c2 }
                if (r1 == 0) goto L_0x0085
                monitor-enter(r1)     // Catch:{ all -> 0x00c2 }
                int r2 = r1.f32865a     // Catch:{ all -> 0x0082 }
                int r3 = r2 + 1
                r1.f32865a = r3     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0080
                android.os.Message r2 = new android.os.Message     // Catch:{ all -> 0x0082 }
                r2.<init>()     // Catch:{ all -> 0x0082 }
                r3 = 4
                r2.what = r3     // Catch:{ all -> 0x0082 }
                xa0.b$a r3 = r1.f32866b     // Catch:{ all -> 0x0082 }
                r3.sendMessage(r2)     // Catch:{ all -> 0x0082 }
            L_0x0080:
                monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
                goto L_0x0085
            L_0x0082:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
                throw r2     // Catch:{ all -> 0x00c2 }
            L_0x0085:
                va0.b r1 = r4.f32762b     // Catch:{ all -> 0x00c2 }
                int r2 = r1.f32754d     // Catch:{ all -> 0x00c2 }
                int r2 = r2 + 1
                r1.f32754d = r2     // Catch:{ all -> 0x00c2 }
                monitor-exit(r0)     // Catch:{ all -> 0x00c2 }
            L_0x008e:
                va0.b r0 = r4.f32762b
                boolean r0 = va0.C13189b.m33244a(r0, r4)
                if (r0 == 0) goto L_0x0097
                return
            L_0x0097:
                va0.b r0 = r4.f32762b
                monitor-enter(r0)
                java.util.PriorityQueue<va0.b$c> r1 = r0.f32757g     // Catch:{ all -> 0x00bf }
                int r1 = r1.size()     // Catch:{ all -> 0x00bf }
                if (r1 <= 0) goto L_0x00ae
                java.util.PriorityQueue<va0.b$c> r1 = r0.f32757g     // Catch:{ all -> 0x00bf }
                java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00bf }
                va0.b$c r1 = (va0.C13189b.C13192c) r1     // Catch:{ all -> 0x00bf }
                java.lang.Runnable r1 = r1.f32758a     // Catch:{ all -> 0x00bf }
                monitor-exit(r0)
                goto L_0x00b0
            L_0x00ae:
                r1 = 0
                monitor-exit(r0)
            L_0x00b0:
                if (r1 == 0) goto L_0x0000
                r1.run()
                java.lang.Thread.yield()
                boolean r0 = java.lang.Thread.interrupted()
                if (r0 == 0) goto L_0x008e
                return
            L_0x00bf:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00c2:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00c2 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: va0.C13189b.C13193d.run():void");
        }
    }

    public C13189b(String str) {
        this.f32751a = str;
        this.f32752b = 1;
        for (int i = 0; i < 1; i++) {
            C13193d dVar = new C13193d(C16759e.m42350f(str, "-", i), this);
            dVar.setPriority(1);
            dVar.start();
            this.f32755e.add(dVar);
        }
    }

    /* renamed from: a */
    public static boolean m33244a(C13189b bVar, C13193d dVar) {
        boolean z;
        synchronized (bVar) {
            if (bVar.f32752b < bVar.f32755e.size()) {
                bVar.f32755e.remove(dVar);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final synchronized void mo40065b() {
        Iterator<C13192c> it = this.f32757g.iterator();
        while (it.hasNext()) {
            Runnable runnable = it.next().f32758a;
            if (runnable instanceof C13196e) {
                C13196e eVar = (C13196e) runnable;
                eVar.mo40071H();
                eVar.cancel();
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo40066c(C13196e eVar, int i, Object obj) {
        this.f32757g.add(new C13192c(eVar, i, this.f32753c, obj));
        this.f32753c++;
        notify();
    }

    /* renamed from: d */
    public final synchronized void mo40067d(int i) {
        for (int size = this.f32755e.size(); size < i; size++) {
            C13193d dVar = new C13193d(this.f32751a + "-" + size, this);
            dVar.setPriority(1);
            dVar.start();
            this.f32755e.add(dVar);
        }
        this.f32752b = i;
    }

    /* renamed from: e */
    public final synchronized void mo40068e() {
        mo40067d(0);
        Iterator it = this.f32755e.iterator();
        while (it.hasNext()) {
            ((C13193d) it.next()).interrupt();
        }
        this.f32755e.clear();
    }
}
