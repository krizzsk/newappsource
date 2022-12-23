package p001a0;

import p066e0.C4433i0;
import p066e0.C4436j0;

/* renamed from: a0.m */
public final class C0022m {

    /* renamed from: a */
    public static final C4436j0 f8a;

    /* JADX WARNING: Removed duplicated region for block: B:100:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x019c  */
    static {
        /*
            e0.j0 r0 = new e0.j0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<java.lang.String> r2 = p001a0.C0029s.f16a
            java.lang.String r3 = android.os.Build.MODEL
            boolean r2 = r2.contains(r3)
            r4 = 1
            r5 = 0
            java.lang.String r6 = "Google"
            if (r2 == 0) goto L_0x0025
            java.lang.String r2 = android.os.Build.MANUFACTURER
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0025
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r2 < r7) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x0030
            a0.s r2 = new a0.s
            r2.<init>()
            r1.add(r2)
        L_0x0030:
            boolean r2 = p001a0.C0024o.m95b()
            if (r2 == 0) goto L_0x003e
            a0.o r2 = new a0.o
            r2.<init>()
            r1.add(r2)
        L_0x003e:
            java.util.List<java.lang.String> r2 = p001a0.C0032v.f19a
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r7 = "GOOGLE"
            boolean r7 = r7.equalsIgnoreCase(r2)
            r8 = 23
            if (r7 == 0) goto L_0x0060
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 >= r8) goto L_0x0060
            java.util.List<java.lang.String> r7 = p001a0.C0032v.f19a
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r9 = r3.toUpperCase(r9)
            boolean r7 = r7.contains(r9)
            if (r7 == 0) goto L_0x0060
            r7 = 1
            goto L_0x0061
        L_0x0060:
            r7 = 0
        L_0x0061:
            if (r7 == 0) goto L_0x006b
            a0.v r7 = new a0.v
            r7.<init>()
            r1.add(r7)
        L_0x006b:
            java.lang.String r7 = "OnePlus"
            boolean r9 = r7.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x007f
            java.lang.String r9 = android.os.Build.DEVICE
            java.lang.String r10 = "OnePlus6"
            boolean r9 = r10.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x007f
            r9 = 1
            goto L_0x0080
        L_0x007f:
            r9 = 0
        L_0x0080:
            if (r9 != 0) goto L_0x00b1
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0094
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r9 = "OnePlus6T"
            boolean r7 = r9.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0094
            r7 = 1
            goto L_0x0095
        L_0x0094:
            r7 = 0
        L_0x0095:
            if (r7 != 0) goto L_0x00b1
            java.lang.String r7 = "HUAWEI"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x00ab
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r9 = "HWANE"
            boolean r7 = r9.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x00ab
            r7 = 1
            goto L_0x00ac
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            if (r7 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r7 = 0
            goto L_0x00b2
        L_0x00b1:
            r7 = 1
        L_0x00b2:
            if (r7 == 0) goto L_0x00bc
            a0.n r7 = new a0.n
            r7.<init>()
            r1.add(r7)
        L_0x00bc:
            java.util.List<java.lang.String> r7 = p001a0.C0021l.f7a
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r10 = r3.toUpperCase(r9)
            boolean r7 = r7.contains(r10)
            if (r7 == 0) goto L_0x00d2
            a0.l r7 = new a0.l
            r7.<init>()
            r1.add(r7)
        L_0x00d2:
            java.util.List<java.lang.String> r7 = p001a0.C0034x.f20a
            java.lang.String r7 = android.os.Build.MANUFACTURER
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00f0
            java.util.List<java.lang.String> r6 = p001a0.C0034x.f20a
            java.lang.String r10 = android.os.Build.DEVICE
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.toLowerCase(r11)
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L_0x00f0
            r6 = 1
            goto L_0x00f1
        L_0x00f0:
            r6 = 0
        L_0x00f1:
            if (r6 == 0) goto L_0x00fb
            a0.x r6 = new a0.x
            r6.<init>()
            r1.add(r6)
        L_0x00fb:
            java.lang.String r6 = r7.toUpperCase(r9)
            java.lang.String r10 = "SAMSUNG"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0115
            java.lang.String r6 = r3.toUpperCase(r9)
            java.lang.String r10 = "SM-A716"
            boolean r6 = r6.startsWith(r10)
            if (r6 == 0) goto L_0x0115
            r6 = 1
            goto L_0x0116
        L_0x0115:
            r6 = 0
        L_0x0116:
            if (r6 == 0) goto L_0x0120
            a0.z r6 = new a0.z
            r6.<init>()
            r1.add(r6)
        L_0x0120:
            e0.n0 r6 = p001a0.C0026p.f11a
            java.lang.String r6 = android.os.Build.DEVICE
            java.lang.String r10 = "heroqltevzw"
            boolean r10 = r10.equalsIgnoreCase(r6)
            if (r10 != 0) goto L_0x0137
            java.lang.String r10 = "heroqltetmo"
            boolean r6 = r10.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r6 = 0
            goto L_0x0138
        L_0x0137:
            r6 = 1
        L_0x0138:
            if (r6 != 0) goto L_0x0143
            boolean r6 = p001a0.C0026p.m96a()
            if (r6 == 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r6 = 0
            goto L_0x0144
        L_0x0143:
            r6 = 1
        L_0x0144:
            if (r6 == 0) goto L_0x014e
            a0.p r6 = new a0.p
            r6.<init>()
            r1.add(r6)
        L_0x014e:
            java.util.HashSet r6 = p001a0.C0027q.f14a
            android.util.Pair r10 = new android.util.Pair
            java.lang.String r7 = r7.toLowerCase(r9)
            java.lang.String r9 = r3.toLowerCase(r9)
            r10.<init>(r7, r9)
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L_0x016b
            a0.q r6 = new a0.q
            r6.<init>()
            r1.add(r6)
        L_0x016b:
            java.lang.String r6 = "Huawei"
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x017d
            java.lang.String r2 = "mha-l29"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x017d
            r2 = 1
            goto L_0x017e
        L_0x017d:
            r2 = 0
        L_0x017e:
            if (r2 == 0) goto L_0x0188
            a0.y r2 = new a0.y
            r2.<init>()
            r1.add(r2)
        L_0x0188:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 > r8) goto L_0x018e
            r3 = 1
            goto L_0x018f
        L_0x018e:
            r3 = 0
        L_0x018f:
            if (r3 == 0) goto L_0x0199
            a0.a0 r3 = new a0.a0
            r3.<init>()
            r1.add(r3)
        L_0x0199:
            if (r2 >= r8) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r4 = 0
        L_0x019d:
            if (r4 == 0) goto L_0x01a7
            a0.i r2 = new a0.i
            r2.<init>()
            r1.add(r2)
        L_0x01a7:
            r0.<init>((java.util.ArrayList) r1)
            f8a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p001a0.C0022m.<clinit>():void");
    }

    /* renamed from: a */
    public static <T extends C4433i0> T m93a(Class<T> cls) {
        return f8a.mo19960g(cls);
    }
}
