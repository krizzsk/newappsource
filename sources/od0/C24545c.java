package od0;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.StringUtils;
import com.braze.support.WebContentUtils;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.vungle.warren.AdConfig;
import com.vungle.warren.VungleLogger;
import hi0.C23558r;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p359ag.C13447d;
import p359ag.C13452i;
import p384bg.C13622c;
import p389bl.C13641g;

/* renamed from: od0.c */
public final class C24545c implements Comparable<C24545c> {

    /* renamed from: l0 */
    public static final List f62177l0 = Arrays.asList(new String[]{"play_percentage", "checkpoint.0", "checkpoint.25", "checkpoint.50", "checkpoint.75", "checkpoint.100"});

    /* renamed from: m0 */
    public static final String[] f62178m0 = new String[0];

    /* renamed from: A */
    public String f62179A;

    /* renamed from: B */
    public Map<String, String> f62180B;

    /* renamed from: C */
    public Map<String, String> f62181C = new HashMap();

    /* renamed from: D */
    public Map<String, Pair<String, String>> f62182D = new HashMap();

    /* renamed from: E */
    public HashMap f62183E = new HashMap();

    /* renamed from: F */
    public String f62184F;

    /* renamed from: G */
    public String f62185G;

    /* renamed from: H */
    public boolean f62186H;

    /* renamed from: I */
    public String f62187I;

    /* renamed from: J */
    public boolean f62188J;

    /* renamed from: K */
    public String f62189K;

    /* renamed from: L */
    public String f62190L;

    /* renamed from: M */
    public boolean f62191M;

    /* renamed from: N */
    public int f62192N = 0;

    /* renamed from: O */
    public String f62193O;

    /* renamed from: P */
    public long f62194P;

    /* renamed from: Q */
    public String f62195Q;

    /* renamed from: R */
    public long f62196R;

    /* renamed from: S */
    public long f62197S;

    /* renamed from: T */
    public long f62198T;

    /* renamed from: U */
    public long f62199U;

    /* renamed from: X */
    public boolean f62200X;

    /* renamed from: Y */
    public boolean f62201Y = false;

    /* renamed from: Z */
    public List<String> f62202Z = new ArrayList();

    /* renamed from: b */
    public Gson f62203b = new Gson();

    /* renamed from: c */
    public int f62204c;

    /* renamed from: d */
    public String f62205d;

    /* renamed from: e */
    public String f62206e;

    /* renamed from: f */
    public long f62207f;

    /* renamed from: g */
    public List<C24546a> f62208g;

    /* renamed from: h */
    public Map<String, ArrayList<String>> f62209h = new LinkedTreeMap();

    /* renamed from: i */
    public int f62210i;

    /* renamed from: j */
    public String f62211j;

    /* renamed from: k */
    public int f62212k;

    /* renamed from: l */
    public int f62213l;

    /* renamed from: m */
    public int f62214m;

    /* renamed from: n */
    public String f62215n;

    /* renamed from: o */
    public int f62216o;

    /* renamed from: p */
    public int f62217p;

    /* renamed from: q */
    public String f62218q;

    /* renamed from: r */
    public String f62219r;

    /* renamed from: s */
    public boolean f62220s;

    /* renamed from: t */
    public boolean f62221t = true;

    /* renamed from: u */
    public String f62222u;

    /* renamed from: v */
    public String f62223v;

    /* renamed from: w */
    public AdConfig f62224w;

    /* renamed from: x */
    public int f62225x;

    /* renamed from: y */
    public String f62226y;

    /* renamed from: z */
    public String f62227z;

    public C24545c() {
    }

    /* renamed from: a */
    public final String mo60804a(boolean z) {
        int i = this.f62204c;
        if (i != 0) {
            if (i == 1) {
                return this.f62223v;
            }
            StringBuilder k = C13555b.m33972k("Unknown AdType ");
            k.append(this.f62204c);
            throw new IllegalArgumentException(k.toString());
        } else if (z) {
            return this.f62223v;
        } else {
            return this.f62222u;
        }
    }

    public final int compareTo(Object obj) {
        C24545c cVar = (C24545c) obj;
        if (cVar == null) {
            return 1;
        }
        String str = cVar.f62205d;
        if (str != null) {
            String str2 = this.f62205d;
            if (str2 == null) {
                return -1;
            }
            return str2.compareTo(str);
        } else if (this.f62205d == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24545c)) {
            return false;
        }
        C24545c cVar = (C24545c) obj;
        if (cVar.f62204c != this.f62204c || cVar.f62210i != this.f62210i || cVar.f62212k != this.f62212k || cVar.f62213l != this.f62213l || cVar.f62214m != this.f62214m || cVar.f62216o != this.f62216o || cVar.f62217p != this.f62217p || cVar.f62220s != this.f62220s || cVar.f62221t != this.f62221t || cVar.f62225x != this.f62225x || cVar.f62186H != this.f62186H || cVar.f62188J != this.f62188J || cVar.f62192N != this.f62192N || (str = cVar.f62205d) == null || (str2 = this.f62205d) == null || !str.equals(str2) || !cVar.f62211j.equals(this.f62211j) || !cVar.f62215n.equals(this.f62215n) || !cVar.f62218q.equals(this.f62218q) || !cVar.f62219r.equals(this.f62219r) || !cVar.f62222u.equals(this.f62222u) || !cVar.f62223v.equals(this.f62223v) || !cVar.f62226y.equals(this.f62226y) || !cVar.f62227z.equals(this.f62227z)) {
            return false;
        }
        String str3 = cVar.f62187I;
        if (str3 == null ? this.f62187I != null : !str3.equals(this.f62187I)) {
            return false;
        }
        if (!cVar.f62189K.equals(this.f62189K) || !cVar.f62190L.equals(this.f62190L) || cVar.f62208g.size() != this.f62208g.size()) {
            return false;
        }
        for (int i = 0; i < this.f62208g.size(); i++) {
            if (!cVar.f62208g.get(i).equals(this.f62208g.get(i))) {
                return false;
            }
        }
        if (this.f62209h.equals(cVar.f62209h) && cVar.f62199U == this.f62199U && cVar.f62200X == this.f62200X && cVar.f62191M == this.f62191M) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo60807f() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f62211j
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 1
            if (r1 < r2) goto L_0x0016
            r1 = 0
            r0 = r0[r1]
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "unknown"
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.C24545c.mo60807f():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo60808g() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f62211j
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "\\|"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 < r2) goto L_0x0016
            r1 = 1
            r0 = r0[r1]
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = "unknown"
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.C24545c.mo60808g():java.lang.String");
    }

    public final String getId() {
        String str = this.f62205d;
        return str == null ? "" : str;
    }

    /* renamed from: h */
    public final HashMap mo60810h() {
        boolean z;
        HashMap hashMap = new HashMap();
        int i = this.f62204c;
        if (i == 0) {
            hashMap.put("video", this.f62215n);
            if (!TextUtils.isEmpty(this.f62219r)) {
                hashMap.put("postroll", this.f62219r);
            }
        } else if (i == 1) {
            if (!"native".equals(this.f62185G)) {
                hashMap.put("template", this.f62179A);
            }
            for (Map.Entry<String, Pair<String, String>> value : this.f62182D.entrySet()) {
                String str = (String) ((Pair) value.getValue()).first;
                if (TextUtils.isEmpty(str) || C23558r.m57727m(str) == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    hashMap.put(URLUtil.guessFileName(str, (String) null, (String) null), str);
                }
            }
        } else {
            throw new IllegalStateException("Advertisement created without adType!");
        }
        return hashMap;
    }

    public final int hashCode() {
        int d0 = C21100e.m49335d0(this.f62205d);
        int d02 = C21100e.m49335d0(this.f62208g);
        int d03 = C21100e.m49335d0(this.f62209h);
        int d04 = C21100e.m49335d0(this.f62211j);
        int d05 = C21100e.m49335d0(this.f62215n);
        int d06 = C21100e.m49335d0(this.f62218q);
        int d07 = C21100e.m49335d0(this.f62219r);
        int d08 = C21100e.m49335d0(this.f62222u);
        int d09 = C21100e.m49335d0(this.f62223v);
        int d010 = C21100e.m49335d0(this.f62226y);
        int d011 = C21100e.m49335d0(this.f62227z);
        int d012 = C21100e.m49335d0(this.f62202Z);
        int d013 = C21100e.m49335d0(this.f62189K);
        return (((((int) (((long) ((((C21100e.m49335d0(this.f62190L) + ((d013 + ((((((((d012 + ((d011 + ((d010 + ((((d09 + ((d08 + ((((((d07 + ((d06 + ((((((d05 + ((((((((d04 + ((((d03 + ((d02 + ((d0 + (this.f62204c * 31)) * 31)) * 31)) * 31) + this.f62210i) * 31)) * 31) + this.f62212k) * 31) + this.f62213l) * 31) + this.f62214m) * 31)) * 31) + this.f62216o) * 31) + this.f62217p) * 31)) * 31)) * 31) + (this.f62220s ? 1 : 0)) * 31) + (this.f62221t ? 1 : 0)) * 31)) * 31)) * 31) + this.f62225x) * 31)) * 31)) * 31)) * 31) + (this.f62186H ? 1 : 0)) * 31) + C21100e.m49335d0(this.f62187I)) * 31) + (this.f62188J ? 1 : 0)) * 31)) * 31)) * 31) + this.f62192N) * 31)) + this.f62199U)) * 31) + (this.f62200X ? 1 : 0)) * 31) + (this.f62191M ? 1 : 0);
    }

    /* renamed from: i */
    public final String[] mo60812i(String str) {
        String k = C25541a.m63881k("Unknown TPAT Event ", str);
        ArrayList arrayList = this.f62209h.get(str);
        int i = this.f62204c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Unknown Advertisement Type!");
            } else if (str.startsWith("checkpoint")) {
                String[] strArr = f62178m0;
                C24546a aVar = this.f62208g.get(Integer.parseInt(str.split("\\.")[1]) / 25);
                if (aVar != null) {
                    return aVar.mo60818g();
                }
                return strArr;
            } else if (arrayList != null) {
                return (String[]) arrayList.toArray(f62178m0);
            } else {
                VungleLogger.m57032e(C24545c.class.getSimpleName() + "#getTpatUrls", k);
                return f62178m0;
            }
        } else if (arrayList != null) {
            return (String[]) arrayList.toArray(f62178m0);
        } else {
            VungleLogger.m57032e(C24545c.class.getSimpleName() + "#getTpatUrls", k);
            return f62178m0;
        }
    }

    /* renamed from: j */
    public final void mo60813j(List<C24543a> list) {
        for (Map.Entry next : this.f62182D.entrySet()) {
            String str = (String) ((Pair) next.getValue()).first;
            Iterator<C24543a> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C24543a next2 = it.next();
                if (!TextUtils.isEmpty(next2.f62170d) && next2.f62170d.equals(str)) {
                    File file = new File(next2.f62171e);
                    if (file.exists()) {
                        Map<String, String> map = this.f62181C;
                        Object key = next.getKey();
                        StringBuilder k = C13555b.m33972k(WebContentUtils.FILE_URI_SCHEME_PREFIX);
                        k.append(file.getPath());
                        map.put(key, k.toString());
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Advertisement{adType=");
        k.append(this.f62204c);
        k.append(", identifier='");
        C25541a.m63890u(k, this.f62205d, '\'', ", appID='");
        C25541a.m63890u(k, this.f62206e, '\'', ", expireTime=");
        k.append(this.f62207f);
        k.append(", checkpoints=");
        k.append(this.f62203b.toJson((Object) this.f62208g, C24547d.f62230e));
        k.append(", winNotifications='");
        k.append(TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, this.f62202Z));
        k.append(", dynamicEventsAndUrls=");
        k.append(this.f62203b.toJson((Object) this.f62209h, C24547d.f62231f));
        k.append(", delay=");
        k.append(this.f62210i);
        k.append(", campaign='");
        C25541a.m63890u(k, this.f62211j, '\'', ", showCloseDelay=");
        k.append(this.f62212k);
        k.append(", showCloseIncentivized=");
        k.append(this.f62213l);
        k.append(", countdown=");
        k.append(this.f62214m);
        k.append(", videoUrl='");
        C25541a.m63890u(k, this.f62215n, '\'', ", videoWidth=");
        k.append(this.f62216o);
        k.append(", videoHeight=");
        k.append(this.f62217p);
        k.append(", md5='");
        C25541a.m63890u(k, this.f62218q, '\'', ", postrollBundleUrl='");
        C25541a.m63890u(k, this.f62219r, '\'', ", ctaOverlayEnabled=");
        k.append(this.f62220s);
        k.append(", ctaClickArea=");
        k.append(this.f62221t);
        k.append(", ctaDestinationUrl='");
        C25541a.m63890u(k, this.f62222u, '\'', ", ctaUrl='");
        C25541a.m63890u(k, this.f62223v, '\'', ", adConfig=");
        k.append(this.f62224w);
        k.append(", retryCount=");
        k.append(this.f62225x);
        k.append(", adToken='");
        C25541a.m63890u(k, this.f62226y, '\'', ", videoIdentifier='");
        C25541a.m63890u(k, this.f62227z, '\'', ", templateUrl='");
        C25541a.m63890u(k, this.f62179A, '\'', ", templateSettings=");
        k.append(this.f62180B);
        k.append(", mraidFiles=");
        k.append(this.f62181C);
        k.append(", cacheableAssets=");
        k.append(this.f62182D);
        k.append(", templateId='");
        C25541a.m63890u(k, this.f62184F, '\'', ", templateType='");
        C25541a.m63890u(k, this.f62185G, '\'', ", enableOm=");
        k.append(this.f62186H);
        k.append(", oMSDKExtraVast='");
        C25541a.m63890u(k, this.f62187I, '\'', ", requiresNonMarketInstall=");
        k.append(this.f62188J);
        k.append(", adMarketId='");
        C25541a.m63890u(k, this.f62189K, '\'', ", bidToken='");
        C25541a.m63890u(k, this.f62190L, '\'', ", state=");
        k.append(this.f62192N);
        k.append('\'');
        k.append(", assetDownloadStartTime='");
        k.append(this.f62196R);
        k.append('\'');
        k.append(", assetDownloadDuration='");
        k.append(this.f62197S);
        k.append('\'');
        k.append(", adRequestStartTime='");
        k.append(this.f62198T);
        k.append('\'');
        k.append(", requestTimestamp='");
        k.append(this.f62199U);
        k.append('\'');
        k.append(", headerBidding='");
        return C13715c.m34247m(k, this.f62191M, '}');
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24545c(p359ag.C13452i r15) throws java.lang.IllegalArgumentException {
        /*
            r14 = this;
            r14.<init>()
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            r14.f62203b = r0
            com.google.gson.internal.LinkedTreeMap r0 = new com.google.gson.internal.LinkedTreeMap
            r0.<init>()
            r14.f62209h = r0
            r0 = 1
            r14.f62221t = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r14.f62181C = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r14.f62182D = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r14.f62183E = r1
            r1 = 0
            r14.f62192N = r1
            r14.f62201Y = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r14.f62202Z = r2
            java.lang.String r2 = "ad_markup"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x05f5
            ag.i r15 = r15.mo40353K(r2)
            java.lang.String r2 = "adType"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x05ed
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r2.getClass()
            java.lang.String r3 = "vungle_local"
            boolean r3 = r2.equals(r3)
            java.lang.String r4 = "url"
            java.lang.String r5 = ""
            if (r3 != 0) goto L_0x01eb
            java.lang.String r3 = "vungle_mraid"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x01dd
            r14.f62204c = r0
            r14.f62219r = r5
            java.lang.String r2 = "templateSettings"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x01d5
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r14.f62180B = r3
            ag.i r2 = r15.mo40353K(r2)
            java.lang.String r3 = "normal_replacements"
            boolean r6 = p389bl.C13641g.m34129r(r2, r3)
            if (r6 == 0) goto L_0x00e4
            ag.i r3 = r2.mo40353K(r3)
            com.google.gson.internal.LinkedTreeMap<java.lang.String, ag.g> r3 = r3.f33306b
            java.util.Set r3 = r3.entrySet()
            com.google.gson.internal.LinkedTreeMap$b r3 = (com.google.gson.internal.LinkedTreeMap.C14554b) r3
            com.google.gson.internal.LinkedTreeMap r3 = com.google.gson.internal.LinkedTreeMap.this
            com.google.gson.internal.LinkedTreeMap$e<K, V> r6 = r3.header
            com.google.gson.internal.LinkedTreeMap$e<K, V> r6 = r6.f36719e
            int r7 = r3.modCount
        L_0x009b:
            com.google.gson.internal.LinkedTreeMap$e<K, V> r8 = r3.header
            if (r6 == r8) goto L_0x00a1
            r9 = 1
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            if (r9 == 0) goto L_0x00e4
            if (r6 == r8) goto L_0x00de
            int r8 = r3.modCount
            if (r8 != r7) goto L_0x00d8
            com.google.gson.internal.LinkedTreeMap$e<K, V> r8 = r6.f36719e
            K r9 = r6.f36721g
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x00b7
            goto L_0x00d6
        L_0x00b7:
            V r9 = r6.f36722h
            if (r9 == 0) goto L_0x00ce
            ag.g r9 = (p359ag.C13450g) r9
            r9.getClass()
            boolean r9 = r9 instanceof p359ag.C13451h
            if (r9 == 0) goto L_0x00c5
            goto L_0x00ce
        L_0x00c5:
            V r9 = r6.f36722h
            ag.g r9 = (p359ag.C13450g) r9
            java.lang.String r9 = r9.mo40326B()
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            java.util.Map<java.lang.String, java.lang.String> r10 = r14.f62180B
            K r6 = r6.f36721g
            r10.put(r6, r9)
        L_0x00d6:
            r6 = r8
            goto L_0x009b
        L_0x00d8:
            java.util.ConcurrentModificationException r15 = new java.util.ConcurrentModificationException
            r15.<init>()
            throw r15
        L_0x00de:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            r15.<init>()
            throw r15
        L_0x00e4:
            java.lang.String r3 = "cacheable_replacements"
            boolean r6 = p389bl.C13641g.m34129r(r2, r3)
            if (r6 == 0) goto L_0x017d
            ag.i r2 = r2.mo40353K(r3)
            com.google.gson.internal.LinkedTreeMap<java.lang.String, ag.g> r2 = r2.f33306b
            java.util.Set r2 = r2.entrySet()
            com.google.gson.internal.LinkedTreeMap$b r2 = (com.google.gson.internal.LinkedTreeMap.C14554b) r2
            com.google.gson.internal.LinkedTreeMap r2 = com.google.gson.internal.LinkedTreeMap.this
            com.google.gson.internal.LinkedTreeMap$e<K, V> r3 = r2.header
            com.google.gson.internal.LinkedTreeMap$e<K, V> r3 = r3.f36719e
            int r6 = r2.modCount
            r7 = r5
        L_0x0101:
            com.google.gson.internal.LinkedTreeMap$e<K, V> r8 = r2.header
            if (r3 == r8) goto L_0x0107
            r9 = 1
            goto L_0x0108
        L_0x0107:
            r9 = 0
        L_0x0108:
            if (r9 == 0) goto L_0x017e
            if (r3 == r8) goto L_0x0177
            int r8 = r2.modCount
            if (r8 != r6) goto L_0x0171
            com.google.gson.internal.LinkedTreeMap$e<K, V> r8 = r3.f36719e
            K r9 = r3.f36721g
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x011d
            goto L_0x016f
        L_0x011d:
            V r9 = r3.f36722h
            if (r9 != 0) goto L_0x0122
            goto L_0x016f
        L_0x0122:
            ag.g r9 = (p359ag.C13450g) r9
            boolean r9 = p389bl.C13641g.m34129r(r9, r4)
            if (r9 == 0) goto L_0x016f
            V r9 = r3.f36722h
            ag.g r9 = (p359ag.C13450g) r9
            java.lang.String r10 = "extension"
            boolean r9 = p389bl.C13641g.m34129r(r9, r10)
            if (r9 == 0) goto L_0x016f
            V r9 = r3.f36722h
            ag.g r9 = (p359ag.C13450g) r9
            ag.i r9 = r9.mo40342u()
            ag.g r9 = r9.mo40351I(r4)
            java.lang.String r9 = r9.mo40326B()
            V r11 = r3.f36722h
            ag.g r11 = (p359ag.C13450g) r11
            ag.i r11 = r11.mo40342u()
            ag.g r10 = r11.mo40351I(r10)
            java.lang.String r10 = r10.mo40326B()
            java.util.Map<java.lang.String, android.util.Pair<java.lang.String, java.lang.String>> r11 = r14.f62182D
            K r12 = r3.f36721g
            android.util.Pair r13 = new android.util.Pair
            r13.<init>(r9, r10)
            r11.put(r12, r13)
            K r3 = r3.f36721g
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r10 = "MAIN_VIDEO"
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x016f
            r7 = r9
        L_0x016f:
            r3 = r8
            goto L_0x0101
        L_0x0171:
            java.util.ConcurrentModificationException r15 = new java.util.ConcurrentModificationException
            r15.<init>()
            throw r15
        L_0x0177:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            r15.<init>()
            throw r15
        L_0x017d:
            r7 = r5
        L_0x017e:
            java.lang.String r2 = "templateId"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x01cd
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r14.f62184F = r2
            java.lang.String r2 = "template_type"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x01c5
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r14.f62185G = r2
            java.lang.String r3 = "native"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x021f
            java.lang.String r2 = "templateURL"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x01bd
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r14.f62179A = r2
            goto L_0x021f
        L_0x01bd:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Template URL missing!"
            r15.<init>(r0)
            throw r15
        L_0x01c5:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Template Type missing!"
            r15.<init>(r0)
            throw r15
        L_0x01cd:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing templateID!"
            r15.<init>(r0)
            throw r15
        L_0x01d5:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing template adConfig!"
            r15.<init>(r0)
            throw r15
        L_0x01dd:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown Ad Type "
            java.lang.String r1 = "! Please add this ad type"
            java.lang.String r0 = p358af.C13437d.m33706k(r0, r2, r1)
            r15.<init>(r0)
            throw r15
        L_0x01eb:
            r14.f62204c = r1
            java.lang.String r2 = "postBundle"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x01fe
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            goto L_0x01ff
        L_0x01fe:
            r2 = r5
        L_0x01ff:
            r14.f62219r = r2
            boolean r2 = p389bl.C13641g.m34129r(r15, r4)
            if (r2 == 0) goto L_0x0211
            ag.g r2 = r15.mo40351I(r4)
            java.lang.String r2 = r2.mo40326B()
            r7 = r2
            goto L_0x0212
        L_0x0211:
            r7 = r5
        L_0x0212:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r14.f62180B = r2
            r14.f62179A = r5
            r14.f62184F = r5
            r14.f62185G = r5
        L_0x021f:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L_0x0228
            r14.f62215n = r7
            goto L_0x022a
        L_0x0228:
            r14.f62215n = r5
        L_0x022a:
            java.lang.String r2 = "deeplinkUrl"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x023c
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r14.f62195Q = r2
        L_0x023c:
            java.lang.String r2 = "id"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x05e5
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r14.f62205d = r2
            java.lang.String r2 = "campaign"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x05dd
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r14.f62211j = r2
            java.lang.String r2 = "app_id"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x05d5
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r14.f62206e = r2
            java.lang.String r2 = "expiry"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r3 == 0) goto L_0x02a0
            ag.g r3 = r15.mo40351I(r2)
            r3.getClass()
            boolean r3 = r3 instanceof p359ag.C13451h
            if (r3 != 0) goto L_0x02a0
            ag.g r2 = r15.mo40351I(r2)
            long r2 = r2.mo40339z()
            r8 = 0
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0298
            r14.f62207f = r2
            goto L_0x02a7
        L_0x0298:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 / r6
            r14.f62207f = r2
            goto L_0x02a7
        L_0x02a0:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 / r6
            r14.f62207f = r2
        L_0x02a7:
            java.lang.String r2 = "notification"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x02cd
            ag.d r2 = r15.mo40352J(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x02b7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02cd
            java.lang.Object r3 = r2.next()
            ag.g r3 = (p359ag.C13450g) r3
            java.util.List<java.lang.String> r4 = r14.f62202Z
            java.lang.String r3 = r3.mo40326B()
            r4.add(r3)
            goto L_0x02b7
        L_0x02cd:
            java.lang.String r2 = "tpat"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x03c0
            ag.i r2 = r15.mo40353K(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 5
            r3.<init>(r4)
            r14.f62208g = r3
            int r3 = r14.f62204c
            if (r3 == 0) goto L_0x031e
            if (r3 != r0) goto L_0x0316
            r3 = 0
        L_0x02e8:
            if (r3 >= r4) goto L_0x0352
            int r6 = r3 * 25
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8[r1] = r9
            java.lang.String r9 = "checkpoint.%d"
            java.lang.String r7 = java.lang.String.format(r7, r9, r8)
            boolean r8 = p389bl.C13641g.m34129r(r2, r7)
            if (r8 == 0) goto L_0x030d
            od0.c$a r8 = new od0.c$a
            ag.d r7 = r2.mo40352J(r7)
            byte r6 = (byte) r6
            r8.<init>(r7, r6)
            goto L_0x030e
        L_0x030d:
            r8 = 0
        L_0x030e:
            java.util.List<od0.c$a> r6 = r14.f62208g
            r6.add(r3, r8)
            int r3 = r3 + 1
            goto L_0x02e8
        L_0x0316:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown Ad Type!"
            r15.<init>(r0)
            throw r15
        L_0x031e:
            java.lang.String r3 = "play_percentage"
            boolean r4 = p389bl.C13641g.m34129r(r2, r3)
            if (r4 == 0) goto L_0x0352
            ag.d r3 = r2.mo40352J(r3)
            r4 = 0
        L_0x032b:
            int r6 = r3.size()
            if (r4 >= r6) goto L_0x034d
            ag.g r6 = r3.mo40329E(r4)
            if (r6 != 0) goto L_0x0338
            goto L_0x034a
        L_0x0338:
            java.util.List<od0.c$a> r6 = r14.f62208g
            od0.c$a r7 = new od0.c$a
            ag.g r8 = r3.mo40329E(r4)
            ag.i r8 = r8.mo40342u()
            r7.<init>(r8)
            r6.add(r7)
        L_0x034a:
            int r4 = r4 + 1
            goto L_0x032b
        L_0x034d:
            java.util.List<od0.c$a> r3 = r14.f62208g
            java.util.Collections.sort(r3)
        L_0x0352:
            java.util.TreeSet r3 = new java.util.TreeSet
            com.google.gson.internal.LinkedTreeMap<java.lang.String, ag.g> r4 = r2.f33306b
            java.util.Set r4 = r4.keySet()
            r3.<init>(r4)
            java.lang.String r4 = "moat"
            r3.remove(r4)
            java.util.List r4 = f62177l0
            r3.removeAll(r4)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x03c7
            java.util.Iterator r3 = r3.iterator()
        L_0x0371:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03c7
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            ag.g r6 = r2.mo40351I(r4)
            ag.d r6 = r6.mo40340s()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L_0x038b:
            int r9 = r6.size()
            if (r8 >= r9) goto L_0x03ba
            ag.g r9 = r6.mo40329E(r8)
            if (r9 == 0) goto L_0x03b4
            ag.g r9 = r6.mo40329E(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "null"
            boolean r9 = r10.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x03a8
            goto L_0x03b4
        L_0x03a8:
            ag.g r9 = r6.mo40329E(r8)
            java.lang.String r9 = r9.mo40326B()
            r7.add(r8, r9)
            goto L_0x03b7
        L_0x03b4:
            r7.add(r8, r5)
        L_0x03b7:
            int r8 = r8 + 1
            goto L_0x038b
        L_0x03ba:
            java.util.Map<java.lang.String, java.util.ArrayList<java.lang.String>> r6 = r14.f62209h
            r6.put(r4, r7)
            goto L_0x0371
        L_0x03c0:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r14.f62208g = r2
        L_0x03c7:
            java.lang.String r2 = "delay"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x03da
            ag.g r2 = r15.mo40351I(r2)
            int r2 = r2.mo40337p()
            r14.f62210i = r2
            goto L_0x03dc
        L_0x03da:
            r14.f62210i = r1
        L_0x03dc:
            java.lang.String r2 = "showClose"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x03ef
            ag.g r2 = r15.mo40351I(r2)
            int r2 = r2.mo40337p()
            r14.f62212k = r2
            goto L_0x03f1
        L_0x03ef:
            r14.f62212k = r1
        L_0x03f1:
            java.lang.String r2 = "showCloseIncentivized"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x0404
            ag.g r2 = r15.mo40351I(r2)
            int r2 = r2.mo40337p()
            r14.f62213l = r2
            goto L_0x0406
        L_0x0404:
            r14.f62213l = r1
        L_0x0406:
            java.lang.String r2 = "countdown"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x0419
            ag.g r2 = r15.mo40351I(r2)
            int r2 = r2.mo40337p()
            r14.f62214m = r2
            goto L_0x041b
        L_0x0419:
            r14.f62214m = r1
        L_0x041b:
            java.lang.String r2 = "videoWidth"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x05cd
            ag.g r2 = r15.mo40351I(r2)
            int r2 = r2.mo40337p()
            r14.f62216o = r2
            java.lang.String r2 = "videoHeight"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x05c5
            ag.g r2 = r15.mo40351I(r2)
            int r2 = r2.mo40337p()
            r14.f62217p = r2
            java.lang.String r2 = "md5"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x0452
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            r14.f62218q = r2
            goto L_0x0454
        L_0x0452:
            r14.f62218q = r5
        L_0x0454:
            java.lang.String r2 = "cta_overlay"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x049c
            ag.i r2 = r15.mo40353K(r2)
            java.lang.String r3 = "enabled"
            boolean r4 = p389bl.C13641g.m34129r(r2, r3)
            if (r4 == 0) goto L_0x0473
            ag.g r3 = r2.mo40351I(r3)
            boolean r3 = r3.mo40333i()
            r14.f62220s = r3
            goto L_0x0475
        L_0x0473:
            r14.f62220s = r1
        L_0x0475:
            java.lang.String r3 = "click_area"
            boolean r4 = p389bl.C13641g.m34129r(r2, r3)
            if (r4 == 0) goto L_0x049e
            ag.g r4 = r2.mo40351I(r3)
            java.lang.String r4 = r4.mo40326B()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x049e
            ag.g r2 = r2.mo40351I(r3)
            double r2 = r2.mo40335m()
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x049e
            r14.f62221t = r1
            goto L_0x049e
        L_0x049c:
            r14.f62220s = r1
        L_0x049e:
            java.lang.String r2 = "callToActionDest"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x04af
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            goto L_0x04b0
        L_0x04af:
            r2 = r5
        L_0x04b0:
            r14.f62222u = r2
            java.lang.String r2 = "callToActionUrl"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x04c3
            ag.g r2 = r15.mo40351I(r2)
            java.lang.String r2 = r2.mo40326B()
            goto L_0x04c4
        L_0x04c3:
            r2 = r5
        L_0x04c4:
            r14.f62223v = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x04d8
            java.util.Map<java.lang.String, java.lang.String> r2 = r14.f62180B
            java.lang.String r3 = "CTA_BUTTON_URL"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            r14.f62223v = r2
        L_0x04d8:
            java.lang.String r2 = "retryCount"
            boolean r3 = p389bl.C13641g.m34129r(r15, r2)
            if (r3 == 0) goto L_0x04eb
            ag.g r0 = r15.mo40351I(r2)
            int r0 = r0.mo40337p()
            r14.f62225x = r0
            goto L_0x04ed
        L_0x04eb:
            r14.f62225x = r0
        L_0x04ed:
            java.lang.String r0 = "ad_token"
            boolean r2 = p389bl.C13641g.m34129r(r15, r0)
            if (r2 == 0) goto L_0x05bd
            ag.g r0 = r15.mo40351I(r0)
            java.lang.String r0 = r0.mo40326B()
            r14.f62226y = r0
            java.lang.String r0 = "video_object_id"
            boolean r2 = p389bl.C13641g.m34129r(r15, r0)
            if (r2 == 0) goto L_0x0512
            ag.g r0 = r15.mo40351I(r0)
            java.lang.String r0 = r0.mo40326B()
            r14.f62227z = r0
            goto L_0x0514
        L_0x0512:
            r14.f62227z = r5
        L_0x0514:
            java.lang.String r0 = "requires_sideloading"
            boolean r2 = p389bl.C13641g.m34129r(r15, r0)
            if (r2 == 0) goto L_0x0527
            ag.g r0 = r15.mo40351I(r0)
            boolean r0 = r0.mo40333i()
            r14.f62188J = r0
            goto L_0x0529
        L_0x0527:
            r14.f62188J = r1
        L_0x0529:
            java.lang.String r0 = "ad_market_id"
            boolean r0 = p389bl.C13641g.m34129r(r15, r0)
            if (r0 == 0) goto L_0x053e
            java.lang.String r0 = "ad_market_id"
            ag.g r0 = r15.mo40351I(r0)
            java.lang.String r0 = r0.mo40326B()
            r14.f62189K = r0
            goto L_0x0540
        L_0x053e:
            r14.f62189K = r5
        L_0x0540:
            java.lang.String r0 = "bid_token"
            boolean r0 = p389bl.C13641g.m34129r(r15, r0)
            if (r0 == 0) goto L_0x0555
            java.lang.String r0 = "bid_token"
            ag.g r0 = r15.mo40351I(r0)
            java.lang.String r0 = r0.mo40326B()
            r14.f62190L = r0
            goto L_0x0557
        L_0x0555:
            r14.f62190L = r5
        L_0x0557:
            java.lang.String r0 = "timestamp"
            boolean r0 = p389bl.C13641g.m34129r(r15, r0)
            if (r0 == 0) goto L_0x056c
            java.lang.String r0 = "timestamp"
            ag.g r0 = r15.mo40351I(r0)
            long r2 = r0.mo40339z()
            r14.f62199U = r2
            goto L_0x0570
        L_0x056c:
            r2 = 1
            r14.f62199U = r2
        L_0x0570:
            java.lang.String r0 = "viewability"
            boolean r2 = p389bl.C13641g.m34129r(r15, r0)
            if (r2 == 0) goto L_0x0585
            ag.i r2 = r15.mo40342u()
            ag.g r0 = r2.mo40351I(r0)
            ag.i r0 = r0.mo40342u()
            goto L_0x0586
        L_0x0585:
            r0 = 0
        L_0x0586:
            java.lang.String r2 = "om"
            boolean r3 = p389bl.C13641g.m34129r(r0, r2)
            if (r3 == 0) goto L_0x059b
            ag.i r0 = r0.mo40342u()
            ag.g r0 = r0.mo40351I(r2)
            ag.i r0 = r0.mo40342u()
            goto L_0x059c
        L_0x059b:
            r0 = 0
        L_0x059c:
            java.lang.String r2 = "is_enabled"
            boolean r2 = p389bl.C13641g.m34122j(r0, r2, r1)
            r14.f62186H = r2
            java.lang.String r2 = "extra_vast"
            r3 = 0
            java.lang.String r0 = p389bl.C13641g.m34123k(r0, r2, r3)
            r14.f62187I = r0
            java.lang.String r0 = "click_coordinates_enabled"
            boolean r15 = p389bl.C13641g.m34122j(r15, r0, r1)
            r14.f62200X = r15
            com.vungle.warren.AdConfig r15 = new com.vungle.warren.AdConfig
            r15.<init>()
            r14.f62224w = r15
            return
        L_0x05bd:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "AdToken missing!"
            r15.<init>(r0)
            throw r15
        L_0x05c5:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing video height!"
            r15.<init>(r0)
            throw r15
        L_0x05cd:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing video width!"
            r15.<init>(r0)
            throw r15
        L_0x05d5:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing app Id, cannot process advertisement!"
            r15.<init>(r0)
            throw r15
        L_0x05dd:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing campaign information, cannot process advertisement!"
            r15.<init>(r0)
            throw r15
        L_0x05e5:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Missing identifier, cannot process advertisement!"
            r15.<init>(r0)
            throw r15
        L_0x05ed:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Advertisement did not contain an adType!"
            r15.<init>(r0)
            throw r15
        L_0x05f5:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "JSON does not contain ad markup!"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: od0.C24545c.<init>(ag.i):void");
    }

    /* renamed from: od0.c$a */
    public static class C24546a implements Comparable<C24546a> {
        @C13622c("percentage")

        /* renamed from: b */
        private byte f62228b;
        @C13622c("urls")

        /* renamed from: c */
        private String[] f62229c;

        public C24546a(C13452i iVar) throws IllegalArgumentException {
            if (C13641g.m34129r(iVar, "checkpoint")) {
                this.f62228b = (byte) ((int) (iVar.mo40351I("checkpoint").mo40336n() * 100.0f));
                if (C13641g.m34129r(iVar, "urls")) {
                    C13447d J = iVar.mo40352J("urls");
                    this.f62229c = new String[J.size()];
                    for (int i = 0; i < J.size(); i++) {
                        if (J.mo40329E(i) == null || StringUtils.NULL_USER_ID_SUBSTITUTE_STRING.equalsIgnoreCase(J.mo40329E(i).toString())) {
                            this.f62229c[i] = "";
                        } else {
                            this.f62229c[i] = J.mo40329E(i).mo40326B();
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Checkpoint missing reporting URL!");
            }
            throw new IllegalArgumentException("Checkpoint missing percentage!");
        }

        public final int compareTo(Object obj) {
            return Float.compare((float) this.f62228b, (float) ((C24546a) obj).f62228b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24546a)) {
                return false;
            }
            C24546a aVar = (C24546a) obj;
            if (aVar.f62228b != this.f62228b || aVar.f62229c.length != this.f62229c.length) {
                return false;
            }
            int i = 0;
            while (true) {
                String[] strArr = this.f62229c;
                if (i >= strArr.length) {
                    return true;
                }
                if (!aVar.f62229c[i].equals(strArr[i])) {
                    return false;
                }
                i++;
            }
        }

        /* renamed from: f */
        public final byte mo60817f() {
            return this.f62228b;
        }

        /* renamed from: g */
        public final String[] mo60818g() {
            return (String[]) this.f62229c.clone();
        }

        public final int hashCode() {
            String[] strArr = this.f62229c;
            return (((this.f62228b * 31) + strArr.length) * 31) + Arrays.hashCode(strArr);
        }

        public C24546a(C13447d dVar, byte b) {
            if (dVar.size() != 0) {
                this.f62229c = new String[dVar.size()];
                for (int i = 0; i < dVar.size(); i++) {
                    this.f62229c[i] = dVar.mo40329E(i).mo40326B();
                }
                this.f62228b = b;
                return;
            }
            throw new IllegalArgumentException("Empty URLS!");
        }
    }
}
