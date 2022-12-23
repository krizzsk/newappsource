package p283v4;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: v4.e */
public abstract class C6860e implements C6859d {

    /* renamed from: f */
    public static final ArrayList f21211f = new ArrayList(0);

    /* renamed from: a */
    public int f21212a;

    /* renamed from: b */
    public final String f21213b;

    /* renamed from: c */
    public final Object f21214c;

    /* renamed from: d */
    public Throwable f21215d;

    /* renamed from: e */
    public long f21216e;

    public C6860e() {
        throw null;
    }

    public C6860e(int i, Object obj, String str, Throwable th) {
        this.f21212a = i;
        this.f21213b = str;
        this.f21214c = obj;
        this.f21215d = th;
        this.f21216e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final Long mo23111a() {
        return Long.valueOf(this.f21216e);
    }

    /* renamed from: b */
    public final int mo23112b() {
        return this.f21212a;
    }

    /* renamed from: c */
    public final Throwable mo23113c() {
        return this.f21215d;
    }

    /* renamed from: d */
    public final synchronized int mo23114d() {
        int i;
        i = this.f21212a;
        Iterator<C6859d> it = iterator();
        while (it.hasNext()) {
            int d = it.next().mo23114d();
            if (d > i) {
                i = d;
            }
        }
        return i;
    }

    /* renamed from: e */
    public final synchronized boolean mo23115e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6860e eVar = (C6860e) obj;
        if (this.f21212a != eVar.f21212a) {
            return false;
        }
        String str = this.f21213b;
        String str2 = eVar.f21213b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final String getMessage() {
        return this.f21213b;
    }

    public final int hashCode() {
        int i = (this.f21212a + 31) * 31;
        String str = this.f21213b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final synchronized Iterator<C6859d> iterator() {
        return f21211f.iterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.mo23114d()
            if (r1 == 0) goto L_0x0018
            r2 = 1
            if (r1 == r2) goto L_0x0015
            r2 = 2
            if (r1 == r2) goto L_0x0012
            goto L_0x001d
        L_0x0012:
            java.lang.String r1 = "ERROR"
            goto L_0x001a
        L_0x0015:
            java.lang.String r1 = "WARN"
            goto L_0x001a
        L_0x0018:
            java.lang.String r1 = "INFO"
        L_0x001a:
            r0.append(r1)
        L_0x001d:
            java.lang.Object r1 = r3.f21214c
            if (r1 == 0) goto L_0x0030
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.Object r1 = r3.f21214c
            r0.append(r1)
            java.lang.String r1 = " -"
            r0.append(r1)
        L_0x0030:
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r3.f21213b
            r0.append(r2)
            java.lang.Throwable r2 = r3.f21215d
            if (r2 == 0) goto L_0x0046
            r0.append(r1)
            java.lang.Throwable r1 = r3.f21215d
            r0.append(r1)
        L_0x0046:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p283v4.C6860e.toString():java.lang.String");
    }
}
