package p077f;

/* renamed from: f.g */
public final class C4630g {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if ((r7.getApplicationInfo(r4.packageName, 0).flags & 1) != 0) goto L_0x0048;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<android.content.pm.ServiceInfo> m11942a(android.content.pm.PackageManager r7) {
        /*
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "androidx.ads.identifier.provider.GET_AD_ID"
            r0.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 24
            if (r1 < r3) goto L_0x0011
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            java.util.List r0 = r7.queryIntentServices(r0, r1)
            if (r0 == 0) goto L_0x004f
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001f
            goto L_0x004f
        L_0x001f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r0.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ServiceInfo r4 = r4.serviceInfo
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 >= r3) goto L_0x004a
            java.lang.String r5 = r4.packageName
            r6 = 1
            android.content.pm.ApplicationInfo r5 = r7.getApplicationInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x0047 }
            int r5 = r5.flags     // Catch:{ NameNotFoundException -> 0x0047 }
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            if (r6 == 0) goto L_0x0028
        L_0x004a:
            r1.add(r4)
            goto L_0x0028
        L_0x004e:
            return r1
        L_0x004f:
            java.util.List r7 = java.util.Collections.emptyList()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f.C4630g.m11942a(android.content.pm.PackageManager):java.util.List");
    }
}
