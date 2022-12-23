package hi0;

import hi0.C23558r;
import ii0.C23608b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import ki0.C23803h;
import pi0.C24721f;

/* renamed from: hi0.w */
public final class C23569w implements C23534e {

    /* renamed from: b */
    public final C23566v f59628b;

    /* renamed from: c */
    public C23803h f59629c;

    /* renamed from: d */
    public final C23571x f59630d;

    /* renamed from: e */
    public final boolean f59631e;

    /* renamed from: f */
    public boolean f59632f;

    /* renamed from: hi0.w$a */
    public final class C23570a extends C23608b {

        /* renamed from: c */
        public final C23538f f59633c;

        /* renamed from: d */
        public volatile AtomicInteger f59634d;

        /* renamed from: e */
        public final /* synthetic */ C23569w f59635e;

        static {
            Class<C23569w> cls = C23569w.class;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C23570a(hi0.C23569w r18, p697of.C18745g r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r0.f59635e = r1
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                hi0.x r1 = r1.f59630d
                hi0.r r1 = r1.f59636a
                r1.getClass()
                java.lang.String r3 = "/..."
                hi0.r$a r4 = new hi0.r$a     // Catch:{ IllegalArgumentException -> 0x001b }
                r4.<init>()     // Catch:{ IllegalArgumentException -> 0x001b }
                r4.mo58708c(r1, r3)     // Catch:{ IllegalArgumentException -> 0x001b }
                goto L_0x001c
            L_0x001b:
                r4 = 0
            L_0x001c:
                r4.getClass()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 1
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 1
                java.lang.String r11 = ""
                java.lang.String r12 = " \"':;<=>@[]^`{}|/\\?#"
                java.lang.String r1 = hi0.C23558r.m57722b(r11, r12, r13, r14, r15, r16)
                r4.f59544b = r1
                java.lang.String r5 = ""
                java.lang.String r6 = " \"':;<=>@[]^`{}|/\\?#"
                java.lang.String r1 = hi0.C23558r.m57722b(r5, r6, r7, r8, r9, r10)
                r4.f59545c = r1
                hi0.r r1 = r4.mo58707b()
                java.lang.String r1 = r1.f59542i
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "OkHttp %s"
                r0.<init>(r1, r2)
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r1.<init>(r3)
                r0.f59634d = r1
                r1 = r19
                r0.f59633c = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hi0.C23569w.C23570a.<init>(hi0.w, of.g):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x002d A[Catch:{ IOException -> 0x0050, all -> 0x0025, all -> 0x004e }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ IOException -> 0x0050, all -> 0x0025, all -> 0x004e }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[Catch:{ IOException -> 0x0050, all -> 0x0025, all -> 0x004e }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo58724a() {
            /*
                r5 = this;
                hi0.w r0 = r5.f59635e
                ki0.h r0 = r0.f59629c
                ki0.h$a r0 = r0.f60152e
                r0.mo61362h()
                r0 = 0
                hi0.w r1 = r5.f59635e     // Catch:{ IOException -> 0x0050, all -> 0x0025 }
                hi0.c0 r0 = r1.mo58721h()     // Catch:{ IOException -> 0x0050, all -> 0x0025 }
                r1 = 1
                hi0.f r2 = r5.f59633c     // Catch:{ IOException -> 0x0021, all -> 0x001d }
                hi0.w r3 = r5.f59635e     // Catch:{ IOException -> 0x0021, all -> 0x001d }
                r2.mo5763d(r3, r0)     // Catch:{ IOException -> 0x0021, all -> 0x001d }
            L_0x0018:
                hi0.w r0 = r5.f59635e
                hi0.v r0 = r0.f59628b
                goto L_0x0079
            L_0x001d:
                r0 = move-exception
                r1 = r0
                r0 = 1
                goto L_0x0026
            L_0x0021:
                r0 = move-exception
                r1 = r0
                r0 = 1
                goto L_0x0051
            L_0x0025:
                r1 = move-exception
            L_0x0026:
                hi0.w r2 = r5.f59635e     // Catch:{ all -> 0x004e }
                r2.mo58719f()     // Catch:{ all -> 0x004e }
                if (r0 != 0) goto L_0x004d
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x004e }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
                r2.<init>()     // Catch:{ all -> 0x004e }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x004e }
                r2.append(r1)     // Catch:{ all -> 0x004e }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x004e }
                r0.<init>(r2)     // Catch:{ all -> 0x004e }
                r0.addSuppressed(r1)     // Catch:{ all -> 0x004e }
                hi0.f r2 = r5.f59633c     // Catch:{ all -> 0x004e }
                hi0.w r3 = r5.f59635e     // Catch:{ all -> 0x004e }
                r2.mo5762c(r3, r0)     // Catch:{ all -> 0x004e }
            L_0x004d:
                throw r1     // Catch:{ all -> 0x004e }
            L_0x004e:
                r0 = move-exception
                goto L_0x007f
            L_0x0050:
                r1 = move-exception
            L_0x0051:
                if (r0 == 0) goto L_0x0071
                pi0.f r0 = pi0.C24721f.f62584a     // Catch:{ all -> 0x004e }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
                r3.<init>()     // Catch:{ all -> 0x004e }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x004e }
                hi0.w r4 = r5.f59635e     // Catch:{ all -> 0x004e }
                java.lang.String r4 = r4.mo58723j()     // Catch:{ all -> 0x004e }
                r3.append(r4)     // Catch:{ all -> 0x004e }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004e }
                r0.mo61202m(r2, r3, r1)     // Catch:{ all -> 0x004e }
                goto L_0x0018
            L_0x0071:
                hi0.f r0 = r5.f59633c     // Catch:{ all -> 0x004e }
                hi0.w r2 = r5.f59635e     // Catch:{ all -> 0x004e }
                r0.mo5762c(r2, r1)     // Catch:{ all -> 0x004e }
                goto L_0x0018
            L_0x0079:
                hi0.l r0 = r0.f59575b
                r0.mo58674b(r5)
                return
            L_0x007f:
                hi0.w r1 = r5.f59635e
                hi0.v r1 = r1.f59628b
                hi0.l r1 = r1.f59575b
                r1.mo58674b(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hi0.C23569w.C23570a.mo58724a():void");
        }
    }

    public C23569w(C23566v vVar, C23571x xVar, boolean z) {
        this.f59628b = vVar;
        this.f59630d = xVar;
        this.f59631e = z;
    }

    /* renamed from: i */
    public static C23569w m57753i(C23566v vVar, C23571x xVar, boolean z) {
        C23569w wVar = new C23569w(vVar, xVar, z);
        wVar.f59629c = new C23803h(vVar, wVar);
        return wVar;
    }

    public final Object clone() throws CloneNotSupportedException {
        return m57753i(this.f59628b, this.f59630d, this.f59631e);
    }

    /* renamed from: f */
    public final void mo58719f() {
        this.f59629c.mo59049a();
    }

    /* renamed from: g */
    public final C23529c0 mo58720g() throws IOException {
        synchronized (this) {
            if (!this.f59632f) {
                this.f59632f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f59629c.f60152e.mo61362h();
        C23803h hVar = this.f59629c;
        hVar.getClass();
        hVar.f60153f = C24721f.f62584a.mo61200k();
        hVar.f60151d.getClass();
        try {
            C23548l lVar = this.f59628b.f59575b;
            synchronized (lVar) {
                lVar.f59519f.add(this);
            }
            C23529c0 h = mo58721h();
            C23548l lVar2 = this.f59628b.f59575b;
            lVar2.mo58675c(lVar2.f59519f, this);
            return h;
        } catch (Throwable th) {
            C23548l lVar3 = this.f59628b.f59575b;
            lVar3.mo58675c(lVar3.f59519f, this);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hi0.C23529c0 mo58721h() throws java.io.IOException {
        /*
            r12 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            hi0.v r0 = r12.f59628b
            java.util.List<hi0.s> r0 = r0.f59579f
            r1.addAll(r0)
            li0.i r0 = new li0.i
            hi0.v r2 = r12.f59628b
            r0.<init>(r2)
            r1.add(r0)
            li0.a r0 = new li0.a
            hi0.v r2 = r12.f59628b
            hi0.k r2 = r2.f59583j
            r0.<init>(r2)
            r1.add(r0)
            ji0.b r0 = new ji0.b
            hi0.v r2 = r12.f59628b
            hi0.c r3 = r2.f59584k
            if (r3 == 0) goto L_0x002d
            hi0.c$a r2 = r3.f59383b
            goto L_0x002f
        L_0x002d:
            ji0.h r2 = r2.f59585l
        L_0x002f:
            r0.<init>(r2)
            r1.add(r0)
            ki0.a r0 = new ki0.a
            r0.<init>()
            r1.add(r0)
            boolean r0 = r12.f59631e
            if (r0 != 0) goto L_0x0048
            hi0.v r0 = r12.f59628b
            java.util.List<hi0.s> r0 = r0.f59580g
            r1.addAll(r0)
        L_0x0048:
            li0.b r0 = new li0.b
            boolean r2 = r12.f59631e
            r0.<init>(r2)
            r1.add(r0)
            li0.f r10 = new li0.f
            ki0.h r2 = r12.f59629c
            r3 = 0
            r4 = 0
            hi0.x r11 = r12.f59630d
            hi0.v r0 = r12.f59628b
            int r7 = r0.f59599z
            int r8 = r0.f59572A
            int r9 = r0.f59573B
            r0 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            hi0.c0 r2 = r10.mo60464a(r11)     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            ki0.h r3 = r12.f59629c     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            ki0.f r4 = r3.f60149b     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            monitor-enter(r4)     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            boolean r3 = r3.f60160m     // Catch:{ all -> 0x0089 }
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            if (r3 != 0) goto L_0x007e
            ki0.h r0 = r12.f59629c
            r0.mo59053e(r1)
            return r2
        L_0x007e:
            ii0.C23610d.m57796d(r2)     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x008e, all -> 0x008c }
            throw r2     // Catch:{ IOException -> 0x008e, all -> 0x008c }
        L_0x0089:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            throw r2     // Catch:{ IOException -> 0x008e, all -> 0x008c }
        L_0x008c:
            r2 = move-exception
            goto L_0x0099
        L_0x008e:
            r0 = move-exception
            ki0.h r2 = r12.f59629c     // Catch:{ all -> 0x0096 }
            java.io.IOException r0 = r2.mo59053e(r0)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x0099:
            if (r0 != 0) goto L_0x00a0
            ki0.h r0 = r12.f59629c
            r0.mo59053e(r1)
        L_0x00a0:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C23569w.mo58721h():hi0.c0");
    }

    public final boolean isCanceled() {
        boolean z;
        C23803h hVar = this.f59629c;
        synchronized (hVar.f60149b) {
            z = hVar.f60160m;
        }
        return z;
    }

    /* renamed from: j */
    public final String mo58723j() {
        String str;
        String str2;
        C23558r.C23559a aVar;
        StringBuilder sb = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f59631e) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        C23558r rVar = this.f59630d.f59636a;
        rVar.getClass();
        try {
            aVar = new C23558r.C23559a();
            aVar.mo58708c(rVar, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        aVar.getClass();
        aVar.f59544b = C23558r.m57722b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        aVar.f59545c = C23558r.m57722b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        sb.append(aVar.mo58707b().f59542i);
        return sb.toString();
    }
}
