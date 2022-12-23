package p673nf;

import com.google.firebase.perf.p414v1.C14530i;
import java.util.Iterator;
import p626lf.C18200a;

/* renamed from: nf.d */
public final class C18546d extends C18547e {

    /* renamed from: b */
    public static final C18200a f47228b = C18200a.m44901d();

    /* renamed from: a */
    public final C14530i f47229a;

    public C18546d(C14530i iVar) {
        this.f47229a = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0050 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45462d(com.google.firebase.perf.p414v1.C14530i r6, int r7) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            if (r7 <= r1) goto L_0x000d
            lf.a r6 = f47228b
            r6.mo50614f()
            return r0
        L_0x000d:
            java.util.Map r2 = r6.mo43572E()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x002e
            goto L_0x004b
        L_0x002e:
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x003e
            lf.a r4 = f47228b
            r4.mo50614f()
            goto L_0x004b
        L_0x003e:
            int r4 = r4.length()
            r5 = 100
            if (r4 <= r5) goto L_0x004d
            lf.a r4 = f47228b
            r4.mo50614f()
        L_0x004b:
            r4 = 0
            goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            if (r4 != 0) goto L_0x005c
            lf.a r6 = f47228b
            java.lang.Object r7 = r3.getKey()
            java.lang.String r7 = (java.lang.String) r7
            r6.mo50614f()
            return r0
        L_0x005c:
            java.lang.Object r4 = r3.getValue()
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0066
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 != 0) goto L_0x0019
            lf.a r6 = f47228b
            java.lang.Object r7 = r3.getValue()
            java.util.Objects.toString(r7)
            r6.mo50614f()
            return r0
        L_0x0076:
            com.google.protobuf.k$e r6 = r6.mo43577K()
            java.util.Iterator r6 = r6.iterator()
        L_0x007e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0093
            java.lang.Object r2 = r6.next()
            com.google.firebase.perf.v1.i r2 = (com.google.firebase.perf.p414v1.C14530i) r2
            int r3 = r7 + 1
            boolean r2 = m45462d(r2, r3)
            if (r2 != 0) goto L_0x007e
            return r0
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p673nf.C18546d.m45462d(com.google.firebase.perf.v1.i, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45463e(com.google.firebase.perf.p414v1.C14530i r7, int r8) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0009
            lf.a r7 = f47228b
            r7.mo50614f()
            return r0
        L_0x0009:
            r1 = 1
            if (r8 <= r1) goto L_0x0012
            lf.a r7 = f47228b
            r7.mo50614f()
            return r0
        L_0x0012:
            java.lang.String r2 = r7.mo43575I()
            if (r2 != 0) goto L_0x0019
            goto L_0x002d
        L_0x0019:
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x002d
            int r2 = r2.length()
            r3 = 100
            if (r2 > r3) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 != 0) goto L_0x0036
            lf.a r7 = f47228b
            r7.mo50614f()
            return r0
        L_0x0036:
            long r2 = r7.mo43574H()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r2 != 0) goto L_0x004b
            lf.a r7 = f47228b
            r7.mo50614f()
            return r0
        L_0x004b:
            boolean r2 = r7.mo43578L()
            if (r2 != 0) goto L_0x0057
            lf.a r7 = f47228b
            r7.mo50614f()
            return r0
        L_0x0057:
            java.lang.String r2 = r7.mo43575I()
            java.lang.String r3 = "_st_"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x008a
            java.util.Map r2 = r7.mo43572E()
            com.google.firebase.perf.util.Constants$CounterNames r3 = com.google.firebase.perf.util.Constants$CounterNames.FRAMES_TOTAL
            java.lang.String r3 = r3.toString()
            java.lang.Object r2 = r2.get(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0081
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L_0x0081
            r2 = 1
            goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            if (r2 != 0) goto L_0x008a
            lf.a r7 = f47228b
            r7.mo50614f()
            return r0
        L_0x008a:
            com.google.protobuf.k$e r2 = r7.mo43577K()
            java.util.Iterator r2 = r2.iterator()
        L_0x0092:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00a7
            java.lang.Object r3 = r2.next()
            com.google.firebase.perf.v1.i r3 = (com.google.firebase.perf.p414v1.C14530i) r3
            int r4 = r8 + 1
            boolean r3 = m45463e(r3, r4)
            if (r3 != 0) goto L_0x0092
            return r0
        L_0x00a7:
            java.util.Map r7 = r7.mo43573F()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00b3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00da
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r2 = r8.getKey()     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IllegalArgumentException -> 0x00cf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalArgumentException -> 0x00cf }
            p673nf.C18547e.m45465b(r2, r8)     // Catch:{ IllegalArgumentException -> 0x00cf }
            goto L_0x00b3
        L_0x00cf:
            r7 = move-exception
            lf.a r8 = f47228b
            r7.getLocalizedMessage()
            r8.mo50614f()
            r7 = 0
            goto L_0x00db
        L_0x00da:
            r7 = 1
        L_0x00db:
            if (r7 != 0) goto L_0x00de
            return r0
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p673nf.C18546d.m45463e(com.google.firebase.perf.v1.i, int):boolean");
    }

    /* renamed from: a */
    public final boolean mo50952a() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!m45463e(this.f47229a, 0)) {
            C18200a aVar = f47228b;
            this.f47229a.mo43575I();
            aVar.mo50614f();
            return false;
        }
        C14530i iVar = this.f47229a;
        if (iVar.mo43571D() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Iterator it = iVar.mo43577K().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((C14530i) it.next()).mo43571D() > 0) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
        } else {
            z2 = true;
        }
        if (!z2 || m45462d(this.f47229a, 0)) {
            return true;
        }
        C18200a aVar2 = f47228b;
        this.f47229a.mo43575I();
        aVar2.mo50614f();
        return false;
    }
}
