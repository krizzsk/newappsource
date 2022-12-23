package p988j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p988j$.time.C25782a;
import p988j$.time.C25783b;
import p988j$.time.C25819g;
import p988j$.time.Instant;
import p988j$.time.LocalDateTime;
import p988j$.time.ZoneOffset;
import p988j$.util.C26016n;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.c */
public final class C25852c implements Serializable {

    /* renamed from: h */
    private static final long[] f64457h = new long[0];

    /* renamed from: i */
    private static final C25851b[] f64458i = new C25851b[0];

    /* renamed from: j */
    private static final LocalDateTime[] f64459j = new LocalDateTime[0];

    /* renamed from: a */
    private final long[] f64460a;

    /* renamed from: b */
    private final ZoneOffset[] f64461b;

    /* renamed from: c */
    private final long[] f64462c;

    /* renamed from: d */
    private final LocalDateTime[] f64463d;

    /* renamed from: e */
    private final ZoneOffset[] f64464e;

    /* renamed from: f */
    private final C25851b[] f64465f;

    /* renamed from: g */
    private final transient ConcurrentHashMap f64466g = new ConcurrentHashMap();

    private C25852c(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[1];
        this.f64461b = zoneOffsetArr;
        zoneOffsetArr[0] = zoneOffset;
        long[] jArr = f64457h;
        this.f64460a = jArr;
        this.f64462c = jArr;
        this.f64463d = f64459j;
        this.f64464e = zoneOffsetArr;
        this.f64465f = f64458i;
    }

    /* renamed from: a */
    private C25850a[] m64661a(int i) {
        Integer valueOf = Integer.valueOf(i);
        C25850a[] aVarArr = (C25850a[]) this.f64466g.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        C25851b[] bVarArr = this.f64465f;
        C25850a[] aVarArr2 = new C25850a[bVarArr.length];
        if (bVarArr.length <= 0) {
            if (i < 2100) {
                this.f64466g.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        }
        C25851b bVar = bVarArr[0];
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r7.mo83630o(r2.mo83799a()) != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r7.mo83630o(r2.mo83799a()) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[LOOP:0: B:9:0x0027->B:25:0x006d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m64662c(p988j$.time.LocalDateTime r7) {
        /*
            r6 = this;
            long[] r0 = r6.f64462c
            int r0 = r0.length
            r1 = 0
            if (r0 != 0) goto L_0x000b
            j$.time.ZoneOffset[] r7 = r6.f64461b
            r7 = r7[r1]
            return r7
        L_0x000b:
            j$.time.zone.b[] r0 = r6.f64465f
            int r0 = r0.length
            r2 = -1
            if (r0 <= 0) goto L_0x0073
            j$.time.LocalDateTime[] r0 = r6.f64463d
            int r3 = r0.length
            int r3 = r3 + r2
            r0 = r0[r3]
            boolean r0 = r7.mo83629n(r0)
            if (r0 == 0) goto L_0x0073
            int r0 = r7.mo83628m()
            j$.time.zone.a[] r0 = r6.m64661a(r0)
            r2 = 0
            int r3 = r0.length
        L_0x0027:
            if (r1 >= r3) goto L_0x0072
            r2 = r0[r1]
            j$.time.LocalDateTime r4 = r2.mo83800b()
            boolean r5 = r2.mo83807g()
            boolean r4 = r7.mo83630o(r4)
            if (r5 == 0) goto L_0x004b
            if (r4 == 0) goto L_0x0040
        L_0x003b:
            j$.time.ZoneOffset r4 = r2.mo83804e()
            goto L_0x005e
        L_0x0040:
            j$.time.LocalDateTime r4 = r2.mo83799a()
            boolean r4 = r7.mo83630o(r4)
            if (r4 == 0) goto L_0x004d
            goto L_0x005d
        L_0x004b:
            if (r4 != 0) goto L_0x0052
        L_0x004d:
            j$.time.ZoneOffset r4 = r2.mo83803d()
            goto L_0x005e
        L_0x0052:
            j$.time.LocalDateTime r4 = r2.mo83799a()
            boolean r4 = r7.mo83630o(r4)
            if (r4 == 0) goto L_0x005d
            goto L_0x003b
        L_0x005d:
            r4 = r2
        L_0x005e:
            boolean r5 = r4 instanceof p988j$.time.zone.C25850a
            if (r5 != 0) goto L_0x0071
            j$.time.ZoneOffset r2 = r2.mo83804e()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            int r1 = r1 + 1
            r2 = r4
            goto L_0x0027
        L_0x0071:
            return r4
        L_0x0072:
            return r2
        L_0x0073:
            j$.time.LocalDateTime[] r0 = r6.f64463d
            int r7 = java.util.Arrays.binarySearch(r0, r7)
            if (r7 != r2) goto L_0x0080
            j$.time.ZoneOffset[] r7 = r6.f64464e
            r7 = r7[r1]
            return r7
        L_0x0080:
            if (r7 >= 0) goto L_0x0086
            int r7 = -r7
            int r7 = r7 + -2
            goto L_0x0099
        L_0x0086:
            j$.time.LocalDateTime[] r0 = r6.f64463d
            int r1 = r0.length
            int r1 = r1 + r2
            if (r7 >= r1) goto L_0x0099
            r1 = r0[r7]
            int r2 = r7 + 1
            r0 = r0[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0099
            r7 = r2
        L_0x0099:
            r0 = r7 & 1
            if (r0 != 0) goto L_0x00c5
            j$.time.LocalDateTime[] r0 = r6.f64463d
            r1 = r0[r7]
            int r2 = r7 + 1
            r0 = r0[r2]
            j$.time.ZoneOffset[] r2 = r6.f64464e
            int r7 = r7 / 2
            r3 = r2[r7]
            int r7 = r7 + 1
            r7 = r2[r7]
            int r2 = r7.mo83654j()
            int r4 = r3.mo83654j()
            if (r2 <= r4) goto L_0x00bf
            j$.time.zone.a r0 = new j$.time.zone.a
            r0.<init>(r1, r3, r7)
            return r0
        L_0x00bf:
            j$.time.zone.a r1 = new j$.time.zone.a
            r1.<init>(r0, r3, r7)
            return r1
        L_0x00c5:
            j$.time.ZoneOffset[] r0 = r6.f64464e
            int r7 = r7 / 2
            int r7 = r7 + 1
            r7 = r0[r7]
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.time.zone.C25852c.m64662c(j$.time.LocalDateTime):java.lang.Object");
    }

    /* renamed from: g */
    public static C25852c m64663g(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return new C25852c(zoneOffset);
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: b */
    public final ZoneOffset mo83811b(Instant instant) {
        if (this.f64462c.length == 0) {
            return this.f64461b[0];
        }
        long k = instant.mo83617k();
        if (this.f64465f.length > 0) {
            long[] jArr = this.f64462c;
            if (k > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.f64464e;
                C25850a[] a = m64661a(C25819g.m64491s(C25782a.m64413h(((long) zoneOffsetArr[zoneOffsetArr.length - 1].mo83654j()) + k, 86400)).mo83730p());
                C25850a aVar = null;
                for (int i = 0; i < a.length; i++) {
                    aVar = a[i];
                    if (k < aVar.mo83808h()) {
                        return aVar.mo83804e();
                    }
                }
                return aVar.mo83803d();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f64462c, k);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f64464e[binarySearch + 1];
    }

    /* renamed from: d */
    public final C25850a mo83812d(LocalDateTime localDateTime) {
        Object c = m64662c(localDateTime);
        if (c instanceof C25850a) {
            return (C25850a) c;
        }
        return null;
    }

    /* renamed from: e */
    public final List mo83813e(LocalDateTime localDateTime) {
        Object c = m64662c(localDateTime);
        return c instanceof C25850a ? ((C25850a) c).mo83806f() : Collections.singletonList((ZoneOffset) c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25852c)) {
            return false;
        }
        C25852c cVar = (C25852c) obj;
        cVar.getClass();
        return C26016n.m64895k((Object) null, (Object) null) && Arrays.equals(this.f64460a, cVar.f64460a) && Arrays.equals(this.f64461b, cVar.f64461b) && Arrays.equals(this.f64462c, cVar.f64462c) && Arrays.equals(this.f64464e, cVar.f64464e) && Arrays.equals(this.f64465f, cVar.f64465f);
    }

    /* renamed from: f */
    public final boolean mo83815f() {
        return this.f64462c.length == 0;
    }

    public final int hashCode() {
        return ((((0 ^ Arrays.hashCode(this.f64460a)) ^ Arrays.hashCode(this.f64461b)) ^ Arrays.hashCode(this.f64462c)) ^ Arrays.hashCode(this.f64464e)) ^ Arrays.hashCode(this.f64465f);
    }

    public final String toString() {
        StringBuilder a = C25783b.m64414a("ZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.f64461b;
        a.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        a.append("]");
        return a.toString();
    }
}
