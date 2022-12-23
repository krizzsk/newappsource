package f30;

import com.moovit.commons.utils.DataUnit;

/* renamed from: f30.e */
public final class C4678e {

    /* renamed from: a */
    public final int f15927a;

    /* renamed from: b */
    public final String f15928b;

    /* renamed from: c */
    public final int f15929c;

    /* renamed from: d */
    public final String f15930d;

    /* renamed from: e */
    public final boolean f15931e;

    /* renamed from: f */
    public final boolean f15932f;

    /* renamed from: g */
    public final boolean f15933g;

    /* renamed from: h */
    public final boolean f15934h;

    /* renamed from: i */
    public final int f15935i;

    /* renamed from: j */
    public final int f15936j;

    /* renamed from: k */
    public final long[] f15937k;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0154  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4678e(android.content.Context r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r18.<init>()
            java.lang.String r3 = "connectivity"
            java.lang.Object r3 = r1.getSystemService(r3)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            r4 = 23
            boolean r5 = p977zz.C20943i.m49051d(r4)
            r8 = 0
            if (r5 == 0) goto L_0x0036
            android.net.Network[] r5 = r3.getAllNetworks()
            if (r5 != 0) goto L_0x0022
            r6 = 0
            goto L_0x0023
        L_0x0022:
            int r6 = r5.length
        L_0x0023:
            r7 = 0
        L_0x0024:
            if (r7 >= r6) goto L_0x0036
            r9 = r5[r7]
            android.net.NetworkInfo r9 = r3.getNetworkInfo(r9)
            int r10 = r9.getType()
            if (r10 != r2) goto L_0x0033
            goto L_0x003a
        L_0x0033:
            int r7 = r7 + 1
            goto L_0x0024
        L_0x0036:
            android.net.NetworkInfo r9 = r3.getNetworkInfo(r2)
        L_0x003a:
            r5 = -1
            if (r9 == 0) goto L_0x006e
            int r6 = r9.getType()
            r0.f15927a = r6
            java.lang.String r6 = r9.getTypeName()
            r0.f15928b = r6
            int r6 = r9.getSubtype()
            r0.f15929c = r6
            java.lang.String r6 = r9.getSubtypeName()
            r0.f15930d = r6
            boolean r6 = r9.isAvailable()
            r0.f15931e = r6
            boolean r6 = r9.isConnectedOrConnecting()
            r0.f15932f = r6
            boolean r6 = r9.isFailover()
            r0.f15933g = r6
            boolean r6 = r9.isRoaming()
            r0.f15934h = r6
            goto L_0x0080
        L_0x006e:
            r0.f15927a = r2
            java.lang.String r6 = "none"
            r0.f15928b = r6
            r0.f15929c = r5
            r0.f15930d = r6
            r0.f15931e = r8
            r0.f15932f = r8
            r0.f15933g = r8
            r0.f15934h = r8
        L_0x0080:
            boolean r6 = p977zz.C20943i.m49051d(r4)
            if (r6 == 0) goto L_0x00a6
            android.net.Network[] r6 = r3.getAllNetworks()
            if (r6 != 0) goto L_0x008e
            r7 = 0
            goto L_0x008f
        L_0x008e:
            int r7 = r6.length
        L_0x008f:
            r9 = 0
        L_0x0090:
            if (r9 >= r7) goto L_0x00a6
            r10 = r6[r9]
            android.net.NetworkInfo r11 = r3.getNetworkInfo(r10)
            int r11 = r11.getType()
            if (r11 != r2) goto L_0x00a3
            android.net.NetworkCapabilities r3 = r3.getNetworkCapabilities(r10)
            goto L_0x00a7
        L_0x00a3:
            int r9 = r9 + 1
            goto L_0x0090
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            if (r3 == 0) goto L_0x00b6
            int r6 = r3.getLinkDownstreamBandwidthKbps()
            r0.f15935i = r6
            int r3 = r3.getLinkUpstreamBandwidthKbps()
            r0.f15936j = r3
            goto L_0x00ba
        L_0x00b6:
            r0.f15935i = r5
            r0.f15936j = r5
        L_0x00ba:
            r3 = 6
            long[] r9 = new long[r3]
            r0.f15937k = r9
            boolean r3 = p977zz.C20943i.m49051d(r4)
            if (r3 == 0) goto L_0x0154
            java.lang.String r3 = "netstats"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.app.usage.NetworkStatsManager r1 = (android.app.usage.NetworkStatsManager) r1
            android.app.usage.NetworkStats$Bucket r12 = new android.app.usage.NetworkStats$Bucket
            r12.<init>()
            java.lang.String r3 = "UTC"
            java.util.TimeZone r3 = p988j$.util.DesugarTimeZone.getTimeZone(r3)     // Catch:{ Exception -> 0x014e }
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3)     // Catch:{ Exception -> 0x014e }
            r13 = 4
            r3.add(r13, r5)     // Catch:{ Exception -> 0x014e }
            r4 = 7
            r14 = 1
            r3.set(r4, r14)     // Catch:{ Exception -> 0x014e }
            r5 = 11
            r3.set(r5, r8)     // Catch:{ Exception -> 0x014e }
            r5 = 12
            r3.set(r5, r8)     // Catch:{ Exception -> 0x014e }
            r5 = 13
            r3.set(r5, r8)     // Catch:{ Exception -> 0x014e }
            r5 = 14
            r3.set(r5, r8)     // Catch:{ Exception -> 0x014e }
            long r5 = r3.getTimeInMillis()     // Catch:{ Exception -> 0x014e }
            r3.add(r4, r4)     // Catch:{ Exception -> 0x014e }
            long r15 = r3.getTimeInMillis()     // Catch:{ Exception -> 0x014e }
            r3 = 0
            r2 = r20
            r4 = r5
            r6 = r15
            android.app.usage.NetworkStats r1 = r1.querySummary(r2, r3, r4, r6)     // Catch:{ Exception -> 0x014e }
            r2 = 0
            r4 = r2
            r6 = r4
            r15 = r6
        L_0x0112:
            boolean r17 = r1.hasNextBucket()     // Catch:{ Exception -> 0x014e }
            r10 = 2
            if (r17 == 0) goto L_0x013b
            r1.getNextBucket(r12)     // Catch:{ Exception -> 0x014e }
            int r11 = r12.getState()     // Catch:{ Exception -> 0x014e }
            if (r11 == r14) goto L_0x0130
            if (r11 == r10) goto L_0x0125
            goto L_0x0112
        L_0x0125:
            long r10 = r12.getRxBytes()     // Catch:{ Exception -> 0x014e }
            long r6 = r6 + r10
            long r10 = r12.getTxBytes()     // Catch:{ Exception -> 0x014e }
            long r2 = r2 + r10
            goto L_0x0112
        L_0x0130:
            long r10 = r12.getRxBytes()     // Catch:{ Exception -> 0x014e }
            long r15 = r15 + r10
            long r10 = r12.getTxBytes()     // Catch:{ Exception -> 0x014e }
            long r4 = r4 + r10
            goto L_0x0112
        L_0x013b:
            long r11 = r2 + r4
            r9[r8] = r11     // Catch:{ Exception -> 0x014e }
            r9[r14] = r2     // Catch:{ Exception -> 0x014e }
            r9[r10] = r4     // Catch:{ Exception -> 0x014e }
            r1 = 3
            long r2 = r6 + r15
            r9[r1] = r2     // Catch:{ Exception -> 0x014e }
            r9[r13] = r6     // Catch:{ Exception -> 0x014e }
            r1 = 5
            r9[r1] = r15     // Catch:{ Exception -> 0x014e }
            goto L_0x0159
        L_0x014e:
            r1 = -1
            java.util.Arrays.fill(r9, r1)
            goto L_0x0159
        L_0x0154:
            r1 = -1
            java.util.Arrays.fill(r9, r1)
        L_0x0159:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f30.C4678e.<init>(android.content.Context, int):void");
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("NetworkMetrics{typeId=");
        k.append(this.f15927a);
        k.append(", typeName='");
        C25541a.m63890u(k, this.f15928b, '\'', ", subtypeId=");
        k.append(this.f15929c);
        k.append(", subtypeName='");
        C25541a.m63890u(k, this.f15930d, '\'', ", isAvailable=");
        k.append(this.f15931e);
        k.append(", isConnectedOrConnecting=");
        k.append(this.f15932f);
        k.append(", isFailover=");
        k.append(this.f15933g);
        k.append(", isRoaming=");
        k.append(this.f15934h);
        k.append(", downstreamBandwidth=");
        k.append(this.f15935i);
        k.append(", upstreamBandwidth=");
        k.append(this.f15936j);
        k.append(", send=");
        k.append(DataUnit.formatSize(this.f15937k[0]));
        k.append(", foregroundSend=");
        k.append(DataUnit.formatSize(this.f15937k[1]));
        k.append(", backgroundSend=");
        k.append(DataUnit.formatSize(this.f15937k[2]));
        k.append(", received=");
        k.append(DataUnit.formatSize(this.f15937k[3]));
        k.append(", foregroundReceived=");
        k.append(DataUnit.formatSize(this.f15937k[4]));
        k.append(", backgroundReceived=");
        k.append(DataUnit.formatSize(this.f15937k[5]));
        k.append('}');
        return k.toString();
    }
}
