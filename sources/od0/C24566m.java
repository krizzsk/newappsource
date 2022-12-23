package od0;

import com.vungle.warren.AdConfig;

/* renamed from: od0.m */
public final class C24566m {

    /* renamed from: a */
    public String f62257a;

    /* renamed from: b */
    public boolean f62258b;

    /* renamed from: c */
    public boolean f62259c;

    /* renamed from: d */
    public long f62260d;

    /* renamed from: e */
    public int f62261e;

    /* renamed from: f */
    public int f62262f;

    /* renamed from: g */
    public boolean f62263g;

    /* renamed from: h */
    public boolean f62264h;

    /* renamed from: i */
    public int f62265i = 0;

    /* renamed from: j */
    public AdConfig.AdSize f62266j;

    /* renamed from: k */
    public AdConfig.AdSize f62267k = AdConfig.AdSize.VUNGLE_DEFAULT;

    /* renamed from: l */
    public int f62268l;

    public C24566m() {
    }

    /* renamed from: a */
    public final AdConfig.AdSize mo60831a() {
        AdConfig.AdSize adSize = this.f62266j;
        return adSize == null ? AdConfig.AdSize.VUNGLE_DEFAULT : adSize;
    }

    /* renamed from: b */
    public final boolean mo60832b() {
        if (this.f62268l == 0 && this.f62263g) {
            return false;
        }
        if (AdConfig.AdSize.isNonMrecBannerAdSize(this.f62266j)) {
            return true;
        }
        return this.f62258b;
    }

    /* renamed from: c */
    public final boolean mo60833c() {
        return this.f62263g && this.f62268l > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24566m.class != obj.getClass()) {
            return false;
        }
        C24566m mVar = (C24566m) obj;
        String str = this.f62257a;
        if (str == null ? mVar.f62257a != null : !str.equals(mVar.f62257a)) {
            return false;
        }
        if (this.f62265i == mVar.f62265i && this.f62258b == mVar.f62258b && this.f62259c == mVar.f62259c && this.f62263g == mVar.f62263g && this.f62264h == mVar.f62264h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f62257a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((((((i * 31) + this.f62265i) * 31) + (this.f62258b ? 1 : 0)) * 31) + (this.f62259c ? 1 : 0)) * 31) + (this.f62263g ? 1 : 0)) * 31) + (this.f62264h ? 1 : 0);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Placement{identifier='");
        C25541a.m63890u(k, this.f62257a, '\'', ", autoCached=");
        k.append(this.f62258b);
        k.append(", incentivized=");
        k.append(this.f62259c);
        k.append(", wakeupTime=");
        k.append(this.f62260d);
        k.append(", adRefreshDuration=");
        k.append(this.f62261e);
        k.append(", autoCachePriority=");
        k.append(this.f62262f);
        k.append(", headerBidding=");
        k.append(this.f62263g);
        k.append(", isValid=");
        k.append(this.f62264h);
        k.append(", placementAdType=");
        k.append(this.f62265i);
        k.append(", adSize=");
        k.append(this.f62266j);
        k.append(", maxHbCache=");
        k.append(this.f62268l);
        k.append(", adSize=");
        k.append(this.f62266j);
        k.append(", recommendedAdSize=");
        k.append(this.f62267k);
        k.append('}');
        return k.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0170, code lost:
        if (r7.equals("banner") == false) goto L_0x0172;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24566m(p359ag.C13452i r7) throws java.lang.IllegalArgumentException {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f62265i = r0
            com.vungle.warren.AdConfig$AdSize r1 = com.vungle.warren.AdConfig.AdSize.VUNGLE_DEFAULT
            r6.f62267k = r1
            java.lang.String r1 = "reference_id"
            boolean r2 = r7.mo40354L(r1)
            if (r2 == 0) goto L_0x018d
            ag.g r1 = r7.mo40351I(r1)
            java.lang.String r1 = r1.mo40326B()
            r6.f62257a = r1
            java.lang.String r1 = "is_auto_cached"
            boolean r2 = r7.mo40354L(r1)
            r3 = 1
            if (r2 == 0) goto L_0x0031
            ag.g r1 = r7.mo40351I(r1)
            boolean r1 = r1.mo40333i()
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r6.f62258b = r1
            java.lang.String r1 = "cache_priority"
            boolean r2 = r7.mo40354L(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L_0x0055
            boolean r2 = r6.f62258b
            if (r2 == 0) goto L_0x0055
            ag.g r1 = r7.mo40351I(r1)     // Catch:{ Exception -> 0x0052 }
            int r1 = r1.mo40337p()     // Catch:{ Exception -> 0x0052 }
            r6.f62262f = r1     // Catch:{ Exception -> 0x0052 }
            if (r1 >= r3) goto L_0x0057
            r6.f62262f = r4     // Catch:{ Exception -> 0x0052 }
            goto L_0x0057
        L_0x0052:
            r6.f62262f = r4
            goto L_0x0057
        L_0x0055:
            r6.f62262f = r4
        L_0x0057:
            java.lang.String r1 = "is_incentivized"
            boolean r2 = r7.mo40354L(r1)
            if (r2 == 0) goto L_0x006b
            ag.g r1 = r7.mo40351I(r1)
            boolean r1 = r1.mo40333i()
            if (r1 == 0) goto L_0x006b
            r1 = 1
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            r6.f62259c = r1
            java.lang.String r1 = "ad_refresh_duration"
            boolean r2 = r7.mo40354L(r1)
            if (r2 == 0) goto L_0x007f
            ag.g r1 = r7.mo40351I(r1)
            int r1 = r1.mo40337p()
            goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            r6.f62261e = r1
            java.lang.String r1 = "header_bidding"
            boolean r2 = r7.mo40354L(r1)
            if (r2 == 0) goto L_0x0096
            ag.g r1 = r7.mo40351I(r1)
            boolean r1 = r1.mo40333i()
            if (r1 == 0) goto L_0x0096
            r1 = 1
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r6.f62263g = r1
            java.lang.String r1 = "max_hb_cache"
            boolean r2 = p389bl.C13641g.m34129r(r7, r1)
            if (r2 == 0) goto L_0x00cb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            ag.g r1 = r7.mo40351I(r1)     // Catch:{ NumberFormatException -> 0x00b5 }
            int r1 = r1.mo40337p()     // Catch:{ NumberFormatException -> 0x00b5 }
            r6.f62268l = r1     // Catch:{ NumberFormatException -> 0x00b5 }
            if (r1 < 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b2:
            r6.f62268l = r1     // Catch:{ NumberFormatException -> 0x00b5 }
            goto L_0x00cb
        L_0x00b5:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r1 = r1.getLocalizedMessage()
            r4[r0] = r1
            java.lang.String r1 = "Can't read int value from JSON: %s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            java.lang.String r4 = "Placement"
            com.vungle.warren.VungleLogger.m57029b(r4, r1)
            r6.f62268l = r2
        L_0x00cb:
            java.lang.String r1 = "supported_template_types"
            boolean r2 = p389bl.C13641g.m34129r(r7, r1)
            java.lang.String r4 = "banner"
            r5 = 2
            if (r2 == 0) goto L_0x0125
            ag.d r1 = r7.mo40352J(r1)
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0125
            java.lang.Object r1 = r1.next()
            ag.g r1 = (p359ag.C13450g) r1
            java.lang.String r1 = r1.mo40326B()
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L_0x00f7
            r6.f62265i = r3
            goto L_0x0125
        L_0x00f7:
            java.lang.String r2 = "flexfeed"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0123
            java.lang.String r2 = "flexview"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0108
            goto L_0x0123
        L_0x0108:
            java.lang.String r2 = "mrec"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0114
            r1 = 3
            r6.f62265i = r1
            goto L_0x0125
        L_0x0114:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0120
            r1 = 4
            r6.f62265i = r1
            goto L_0x0125
        L_0x0120:
            r6.f62265i = r0
            goto L_0x0125
        L_0x0123:
            r6.f62265i = r5
        L_0x0125:
            java.lang.String r1 = "ad_size"
            boolean r2 = p389bl.C13641g.m34129r(r7, r1)
            if (r2 == 0) goto L_0x018c
            int r2 = r6.f62265i
            if (r2 != r3) goto L_0x018c
            boolean r2 = r6.mo60833c()
            if (r2 == 0) goto L_0x018c
            ag.g r7 = r7.mo40351I(r1)
            java.lang.String r7 = r7.mo40326B()
            r7.getClass()
            int r1 = r7.hashCode()
            r2 = -1396342996(0xffffffffacc57f2c, float:-5.6131957E-12)
            if (r1 == r2) goto L_0x016c
            r0 = 557834986(0x213fe2ea, float:6.5013635E-19)
            if (r1 == r0) goto L_0x0161
            r0 = 1017009577(0x3c9e55a9, float:0.019327955)
            if (r1 == r0) goto L_0x0156
            goto L_0x0172
        L_0x0156:
            java.lang.String r0 = "banner_short"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x015f
            goto L_0x0172
        L_0x015f:
            r0 = 2
            goto L_0x0173
        L_0x0161:
            java.lang.String r0 = "banner_leaderboard"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x016a
            goto L_0x0172
        L_0x016a:
            r0 = 1
            goto L_0x0173
        L_0x016c:
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0173
        L_0x0172:
            r0 = -1
        L_0x0173:
            if (r0 == 0) goto L_0x0188
            if (r0 == r3) goto L_0x0183
            if (r0 == r5) goto L_0x017e
            com.vungle.warren.AdConfig$AdSize r7 = com.vungle.warren.AdConfig.AdSize.VUNGLE_DEFAULT
            r6.f62267k = r7
            goto L_0x018c
        L_0x017e:
            com.vungle.warren.AdConfig$AdSize r7 = com.vungle.warren.AdConfig.AdSize.BANNER_SHORT
            r6.f62267k = r7
            goto L_0x018c
        L_0x0183:
            com.vungle.warren.AdConfig$AdSize r7 = com.vungle.warren.AdConfig.AdSize.BANNER_LEADERBOARD
            r6.f62267k = r7
            goto L_0x018c
        L_0x0188:
            com.vungle.warren.AdConfig$AdSize r7 = com.vungle.warren.AdConfig.AdSize.BANNER
            r6.f62267k = r7
        L_0x018c:
            return
        L_0x018d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing placement reference ID, cannot use placement!"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.C24566m.<init>(ag.i):void");
    }
}
