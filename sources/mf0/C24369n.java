package mf0;

import com.appboy.support.StringUtils;
import java.util.Set;
import nf0.C24497a;
import nf0.C24500d;
import p358af.C13437d;

/* renamed from: mf0.n */
public final class C24369n {
    /* renamed from: a */
    public static Set m61245a(Object obj) {
        if (!(obj instanceof C24497a) || (obj instanceof C24500d)) {
            try {
                return (Set) obj;
            } catch (ClassCastException e) {
                C24362h.m61215j(C24369n.class.getName(), e);
                throw e;
            }
        } else {
            m61247c(obj, "kotlin.collections.MutableSet");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00b9, code lost:
        if (r0 == r3) goto L_0x00bd;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m61246b(int r3, java.lang.Object r4) {
        /*
            if (r4 == 0) goto L_0x00d6
            boolean r0 = r4 instanceof bf0.C21047a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r4 instanceof mf0.C24360f
            if (r0 == 0) goto L_0x0015
            r0 = r4
            mf0.f r0 = (mf0.C24360f) r0
            int r0 = r0.getArity()
            goto L_0x00b9
        L_0x0015:
            boolean r0 = r4 instanceof lf0.C24225a
            if (r0 == 0) goto L_0x001c
            r0 = 0
            goto L_0x00b9
        L_0x001c:
            boolean r0 = r4 instanceof lf0.C24236l
            if (r0 == 0) goto L_0x0023
            r0 = 1
            goto L_0x00b9
        L_0x0023:
            boolean r0 = r4 instanceof lf0.C24240p
            if (r0 == 0) goto L_0x002a
            r0 = 2
            goto L_0x00b9
        L_0x002a:
            boolean r0 = r4 instanceof lf0.C24241q
            if (r0 == 0) goto L_0x0031
            r0 = 3
            goto L_0x00b9
        L_0x0031:
            boolean r0 = r4 instanceof lf0.C24242r
            if (r0 == 0) goto L_0x0038
            r0 = 4
            goto L_0x00b9
        L_0x0038:
            boolean r0 = r4 instanceof lf0.C24243s
            if (r0 == 0) goto L_0x003f
            r0 = 5
            goto L_0x00b9
        L_0x003f:
            boolean r0 = r4 instanceof lf0.C24244t
            if (r0 == 0) goto L_0x0046
            r0 = 6
            goto L_0x00b9
        L_0x0046:
            boolean r0 = r4 instanceof lf0.C24245u
            if (r0 == 0) goto L_0x004d
            r0 = 7
            goto L_0x00b9
        L_0x004d:
            boolean r0 = r4 instanceof lf0.C24246v
            if (r0 == 0) goto L_0x0055
            r0 = 8
            goto L_0x00b9
        L_0x0055:
            boolean r0 = r4 instanceof lf0.C24247w
            if (r0 == 0) goto L_0x005d
            r0 = 9
            goto L_0x00b9
        L_0x005d:
            boolean r0 = r4 instanceof lf0.C24226b
            if (r0 == 0) goto L_0x0064
            r0 = 10
            goto L_0x00b9
        L_0x0064:
            boolean r0 = r4 instanceof lf0.C24227c
            if (r0 == 0) goto L_0x006b
            r0 = 11
            goto L_0x00b9
        L_0x006b:
            boolean r0 = r4 instanceof lf0.C24228d
            if (r0 == 0) goto L_0x0072
            r0 = 12
            goto L_0x00b9
        L_0x0072:
            boolean r0 = r4 instanceof lf0.C24229e
            if (r0 == 0) goto L_0x0079
            r0 = 13
            goto L_0x00b9
        L_0x0079:
            boolean r0 = r4 instanceof lf0.C24230f
            if (r0 == 0) goto L_0x0080
            r0 = 14
            goto L_0x00b9
        L_0x0080:
            boolean r0 = r4 instanceof lf0.C24231g
            if (r0 == 0) goto L_0x0087
            r0 = 15
            goto L_0x00b9
        L_0x0087:
            boolean r0 = r4 instanceof lf0.C24232h
            if (r0 == 0) goto L_0x008e
            r0 = 16
            goto L_0x00b9
        L_0x008e:
            boolean r0 = r4 instanceof lf0.C24233i
            if (r0 == 0) goto L_0x0095
            r0 = 17
            goto L_0x00b9
        L_0x0095:
            boolean r0 = r4 instanceof lf0.C24234j
            if (r0 == 0) goto L_0x009c
            r0 = 18
            goto L_0x00b9
        L_0x009c:
            boolean r0 = r4 instanceof lf0.C24235k
            if (r0 == 0) goto L_0x00a3
            r0 = 19
            goto L_0x00b9
        L_0x00a3:
            boolean r0 = r4 instanceof lf0.C24237m
            if (r0 == 0) goto L_0x00aa
            r0 = 20
            goto L_0x00b9
        L_0x00aa:
            boolean r0 = r4 instanceof lf0.C24238n
            if (r0 == 0) goto L_0x00b1
            r0 = 21
            goto L_0x00b9
        L_0x00b1:
            boolean r0 = r4 instanceof lf0.C24239o
            if (r0 == 0) goto L_0x00b8
            r0 = 22
            goto L_0x00b9
        L_0x00b8:
            r0 = -1
        L_0x00b9:
            if (r0 != r3) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            if (r1 == 0) goto L_0x00c0
            goto L_0x00d6
        L_0x00c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            m61247c(r4, r3)
            r3 = 0
            throw r3
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mf0.C24369n.m61246b(int, java.lang.Object):void");
    }

    /* renamed from: c */
    public static void m61247c(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            str2 = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(C13437d.m33706k(str2, " cannot be cast to ", str));
        C24362h.m61215j(C24369n.class.getName(), classCastException);
        throw classCastException;
    }
}
