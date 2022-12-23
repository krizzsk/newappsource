package p081f3;

import androidx.work.BackoffPolicy;
import androidx.work.C1388b;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p192o3.C5956p;

/* renamed from: f3.o */
public abstract class C4670o {

    /* renamed from: a */
    public UUID f15904a;

    /* renamed from: b */
    public C5956p f15905b;

    /* renamed from: c */
    public Set<String> f15906c;

    /* renamed from: f3.o$a */
    public static abstract class C4671a<B extends C4671a<?, ?>, W extends C4670o> {

        /* renamed from: a */
        public boolean f15907a = false;

        /* renamed from: b */
        public UUID f15908b = UUID.randomUUID();

        /* renamed from: c */
        public C5956p f15909c;

        /* renamed from: d */
        public HashSet f15910d = new HashSet();

        public C4671a(Class<? extends ListenableWorker> cls) {
            this.f15909c = new C5956p(this.f15908b.toString(), cls.getName());
            mo20189a(cls.getName());
        }

        /* renamed from: a */
        public final B mo20189a(String str) {
            this.f15910d.add(str);
            return mo20181d();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r5 == false) goto L_0x001f;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final W mo20190b() {
            /*
                r6 = this;
                f3.o r0 = r6.mo20180c()
                o3.p r1 = r6.f15909c
                f3.b r1 = r1.f19091j
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 1
                r4 = 0
                r5 = 24
                if (r2 < r5) goto L_0x001f
                f3.c r5 = r1.f15884h
                java.util.HashSet r5 = r5.f15892a
                int r5 = r5.size()
                if (r5 <= 0) goto L_0x001c
                r5 = 1
                goto L_0x001d
            L_0x001c:
                r5 = 0
            L_0x001d:
                if (r5 != 0) goto L_0x0031
            L_0x001f:
                boolean r5 = r1.f15880d
                if (r5 != 0) goto L_0x0031
                boolean r5 = r1.f15878b
                if (r5 != 0) goto L_0x0031
                r5 = 23
                if (r2 < r5) goto L_0x0030
                boolean r1 = r1.f15879c
                if (r1 == 0) goto L_0x0030
                goto L_0x0031
            L_0x0030:
                r3 = 0
            L_0x0031:
                o3.p r1 = r6.f15909c
                boolean r2 = r1.f19098q
                if (r2 == 0) goto L_0x0052
                if (r3 != 0) goto L_0x004a
                long r1 = r1.f19088g
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x0042
                goto L_0x0052
            L_0x0042:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs cannot be delayed"
                r0.<init>(r1)
                throw r0
            L_0x004a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expedited jobs only support network and storage constraints"
                r0.<init>(r1)
                throw r0
            L_0x0052:
                java.util.UUID r1 = java.util.UUID.randomUUID()
                r6.f15908b = r1
                o3.p r1 = new o3.p
                o3.p r2 = r6.f15909c
                r1.<init>(r2)
                r6.f15909c = r1
                java.util.UUID r2 = r6.f15908b
                java.lang.String r2 = r2.toString()
                r1.f19082a = r2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p081f3.C4670o.C4671a.mo20190b():f3.o");
        }

        /* renamed from: c */
        public abstract W mo20180c();

        /* renamed from: d */
        public abstract B mo20181d();

        /* renamed from: e */
        public final C4671a mo20191e(BackoffPolicy backoffPolicy, TimeUnit timeUnit) {
            this.f15907a = true;
            C5956p pVar = this.f15909c;
            pVar.f19093l = backoffPolicy;
            long millis = timeUnit.toMillis(30);
            if (millis > 18000000) {
                C4656h c = C4656h.m11960c();
                int i = C5956p.f19081s;
                c.mo20179f(new Throwable[0]);
                millis = 18000000;
            }
            if (millis < 10000) {
                C4656h c2 = C4656h.m11960c();
                int i2 = C5956p.f19081s;
                c2.mo20179f(new Throwable[0]);
                millis = 10000;
            }
            pVar.f19094m = millis;
            return mo20181d();
        }

        /* renamed from: f */
        public final B mo20192f(C4648b bVar) {
            this.f15909c.f19091j = bVar;
            return mo20181d();
        }

        /* renamed from: g */
        public final B mo20193g(long j, TimeUnit timeUnit) {
            this.f15909c.f19088g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f15909c.f19088g) {
                return mo20181d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        /* renamed from: h */
        public final B mo20194h(C1388b bVar) {
            this.f15909c.f19086e = bVar;
            return mo20181d();
        }
    }

    public C4670o(UUID uuid, C5956p pVar, HashSet hashSet) {
        this.f15904a = uuid;
        this.f15905b = pVar;
        this.f15906c = hashSet;
    }
}
