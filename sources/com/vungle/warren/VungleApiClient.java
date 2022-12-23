package com.vungle.warren;

import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.Keep;
import ce0.C21119t;
import com.appboy.models.outgoing.AttributionData;
import com.appsflyer.AdvertisingIdUtil;
import com.appsflyer.ServerParameters;
import com.facebook.ads.BuildConfig;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import com.vungle.warren.PrivacyManager;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import de0.C23265c;
import hi0.C23521b0;
import hi0.C23529c0;
import hi0.C23536e0;
import hi0.C23558r;
import hi0.C23560s;
import hi0.C23562t;
import hi0.C23566v;
import hi0.C23571x;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import li0.C24319f;
import od0.C24557h;
import od0.C24559j;
import od0.C24573q;
import okhttp3.Protocol;
import p001a0.C0016g;
import p359ag.C13447d;
import p359ag.C13450g;
import p359ag.C13452i;
import p389bl.C13641g;
import p988j$.util.concurrent.ConcurrentHashMap;
import qd0.C24725a;
import qd0.C24728d;
import qd0.C24732e;
import qd0.C24733f;
import sd0.C24848a;
import sd0.C24849b;
import si0.C24898f;
import si0.C24907n;
import si0.C24917w;
import td0.C24927a;

public final class VungleApiClient {

    /* renamed from: C */
    public static String f58560C;

    /* renamed from: D */
    public static String f58561D = "https://ads.api.vungle.com/";

    /* renamed from: A */
    public final C24849b f58562A;

    /* renamed from: B */
    public String f58563B = "";

    /* renamed from: a */
    public final C23265c f58564a;

    /* renamed from: b */
    public Context f58565b;

    /* renamed from: c */
    public C24733f f58566c;

    /* renamed from: d */
    public String f58567d;

    /* renamed from: e */
    public String f58568e;

    /* renamed from: f */
    public String f58569f;

    /* renamed from: g */
    public String f58570g;

    /* renamed from: h */
    public String f58571h;

    /* renamed from: i */
    public String f58572i;

    /* renamed from: j */
    public String f58573j;

    /* renamed from: k */
    public String f58574k;

    /* renamed from: l */
    public C13452i f58575l;

    /* renamed from: m */
    public C13452i f58576m;

    /* renamed from: n */
    public boolean f58577n;

    /* renamed from: o */
    public int f58578o;

    /* renamed from: p */
    public C23566v f58579p;

    /* renamed from: q */
    public C24733f f58580q;

    /* renamed from: r */
    public C24733f f58581r;

    /* renamed from: s */
    public boolean f58582s;

    /* renamed from: t */
    public C24927a f58583t;

    /* renamed from: u */
    public Boolean f58584u;

    /* renamed from: v */
    public C21119t f58585v;

    /* renamed from: w */
    public ConcurrentHashMap f58586w = new ConcurrentHashMap();

    /* renamed from: x */
    public boolean f58587x;

    /* renamed from: y */
    public C23192a f58588y;

    /* renamed from: z */
    public String f58589z = System.getProperty("http.agent");

    public static class ClearTextTrafficException extends IOException {
        public ClearTextTrafficException() {
            super("Clear Text Traffic is blocked");
        }
    }

    @Keep
    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    /* renamed from: com.vungle.warren.VungleApiClient$a */
    public class C23087a implements C23560s {
        public C23087a() {
        }

        public final C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
            C24319f fVar = (C24319f) aVar;
            C23571x xVar = fVar.f61618e;
            String f = xVar.f59636a.mo58698f();
            Long l = (Long) VungleApiClient.this.f58586w.get(f);
            if (l != null) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(l.longValue() - System.currentTimeMillis());
                if (seconds > 0) {
                    C23529c0.C23530a aVar2 = new C23529c0.C23530a();
                    aVar2.f59424a = xVar;
                    aVar2.f59429f.mo58690a("Retry-After", String.valueOf(seconds));
                    aVar2.f59426c = 500;
                    aVar2.f59425b = Protocol.HTTP_1_1;
                    aVar2.f59427d = "Server is busy";
                    aVar2.f59430g = C23536e0.m57676r("{\"Error\":\"Retry-After\"}", C23562t.m57743c("application/json; charset=utf-8"));
                    return aVar2.mo58645a();
                }
                VungleApiClient.this.f58586w.remove(f);
            }
            C23529c0 a = fVar.mo60464a(xVar);
            int i = a.f59412d;
            if (i == 429 || i == 500 || i == 502 || i == 503) {
                String c = a.f59415g.mo58682c("Retry-After");
                if (!TextUtils.isEmpty(c)) {
                    try {
                        long parseLong = Long.parseLong(c);
                        if (parseLong > 0) {
                            VungleApiClient.this.f58586w.put(f, Long.valueOf((parseLong * 1000) + System.currentTimeMillis()));
                        }
                    } catch (NumberFormatException unused) {
                        String str = VungleApiClient.f58560C;
                    }
                }
            }
            return a;
        }
    }

    /* renamed from: com.vungle.warren.VungleApiClient$b */
    public static class C23088b implements C23560s {
        public final C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
            C24319f fVar = (C24319f) aVar;
            C23571x xVar = fVar.f61618e;
            if (xVar.f59639d == null || xVar.mo58725a("Content-Encoding") != null) {
                return fVar.mo60464a(xVar);
            }
            C23571x.C23572a aVar2 = new C23571x.C23572a(xVar);
            aVar2.f59644c.mo58695f("Content-Encoding", "gzip");
            String str = xVar.f59637b;
            C23521b0 b0Var = xVar.f59639d;
            C24898f fVar2 = new C24898f();
            C24917w wVar = new C24917w(new C24907n(fVar2));
            b0Var.mo53614e(wVar);
            wVar.close();
            aVar2.mo58728b(str, new C23228t1(b0Var, fVar2));
            return fVar.mo60464a(aVar2.mo58727a());
        }
    }

    static {
        String str;
        StringBuilder sb = new StringBuilder();
        if (AdvertisingIdUtil.AMAZON_MANUFACTURER.equals(Build.MANUFACTURER)) {
            str = "VungleAmazon/";
        } else {
            str = "VungleDroid/";
        }
        f58560C = C0016g.m31o(sb, str, BuildConfig.VERSION_NAME);
        new HashSet();
        new HashSet();
    }

    public VungleApiClient(Context context, C24927a aVar, C23192a aVar2, C24849b bVar, C23265c cVar) {
        this.f58583t = aVar;
        this.f58565b = context.getApplicationContext();
        this.f58588y = aVar2;
        this.f58562A = bVar;
        this.f58564a = cVar;
        C23087a aVar3 = new C23087a();
        C23566v.C23568b bVar2 = new C23566v.C23568b();
        bVar2.mo58715a(aVar3);
        this.f58579p = new C23566v(bVar2);
        bVar2.mo58715a(new C23088b());
        C23566v vVar = new C23566v(bVar2);
        C23566v vVar2 = this.f58579p;
        String str = f58561D;
        C23558r j = C23558r.m57725j(str);
        List<String> list = j.f59539f;
        if ("".equals(list.get(list.size() - 1))) {
            Vungle vungle = Vungle._instance;
            String str2 = vungle.appID;
            C24733f fVar = new C24733f(j, vVar2);
            fVar.f62607c = str2;
            this.f58566c = fVar;
            String str3 = f58561D;
            C23558r j2 = C23558r.m57725j(str3);
            List<String> list2 = j2.f59539f;
            if ("".equals(list2.get(list2.size() - 1))) {
                String str4 = vungle.appID;
                C24733f fVar2 = new C24733f(j2, vVar);
                fVar2.f62607c = str4;
                this.f58581r = fVar2;
                this.f58585v = (C21119t) C23236v0.m57280a(context).mo58350c(C21119t.class);
                return;
            }
            throw new IllegalArgumentException(C25541a.m63881k("baseUrl must end in /: ", str3));
        }
        throw new IllegalArgumentException(C25541a.m63881k("baseUrl must end in /: ", str));
    }

    /* renamed from: g */
    public static long m57014g(C24732e eVar) {
        try {
            return Long.parseLong(eVar.f62601a.f59415g.mo58682c("Retry-After")) * 1000;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final C24728d mo58073a(long j) {
        if (this.f58573j != null) {
            C13452i iVar = new C13452i();
            iVar.mo40346C(mo58076d(false), ServerParameters.DEVICE_KEY);
            iVar.mo40346C(this.f58576m, "app");
            iVar.mo40346C(mo58079h(), "user");
            C13452i iVar2 = new C13452i();
            iVar2.mo40348E("last_cache_bust", Long.valueOf(j));
            iVar.mo40346C(iVar2, "request");
            return this.f58581r.mo61220b(f58560C, this.f58573j, iVar);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: b */
    public final C24732e mo58074b() throws VungleException, IOException {
        C13452i iVar = new C13452i();
        iVar.mo40346C(mo58076d(true), ServerParameters.DEVICE_KEY);
        iVar.mo40346C(this.f58576m, "app");
        iVar.mo40346C(mo58079h(), "user");
        C13452i e = mo58077e();
        if (e != null) {
            iVar.mo40346C(e, "ext");
        }
        C24732e a = ((C24728d) this.f58566c.config(f58560C, iVar)).mo61216a();
        if (!a.mo61217a()) {
            return a;
        }
        C13452i iVar2 = (C13452i) a.f62602b;
        Objects.toString(iVar2);
        if (C13641g.m34129r(iVar2, "sleep")) {
            if (C13641g.m34129r(iVar2, "info")) {
                iVar2.mo40351I("info").mo40326B();
            }
            throw new VungleException(3);
        } else if (C13641g.m34129r(iVar2, "endpoints")) {
            C13452i K = iVar2.mo40353K("endpoints");
            C23558r m = C23558r.m57727m(K.mo40351I("new").mo40326B());
            C23558r m2 = C23558r.m57727m(K.mo40351I("ads").mo40326B());
            C23558r m3 = C23558r.m57727m(K.mo40351I("will_play_ad").mo40326B());
            C23558r m4 = C23558r.m57727m(K.mo40351I("report_ad").mo40326B());
            C23558r m5 = C23558r.m57727m(K.mo40351I("ri").mo40326B());
            C23558r m6 = C23558r.m57727m(K.mo40351I("log").mo40326B());
            C23558r m7 = C23558r.m57727m(K.mo40351I("cache_bust").mo40326B());
            C23558r m8 = C23558r.m57727m(K.mo40351I("sdk_bi").mo40326B());
            if (m == null || m2 == null || m3 == null || m4 == null || m5 == null || m6 == null || m7 == null || m8 == null) {
                throw new VungleException(3);
            }
            this.f58567d = m.f59542i;
            this.f58568e = m2.f59542i;
            this.f58570g = m3.f59542i;
            this.f58569f = m4.f59542i;
            this.f58571h = m5.f59542i;
            this.f58572i = m6.f59542i;
            this.f58573j = m7.f59542i;
            this.f58574k = m8.f59542i;
            C13452i K2 = iVar2.mo40353K("will_play_ad");
            this.f58578o = K2.mo40351I("request_timeout").mo40337p();
            this.f58577n = K2.mo40351I("enabled").mo40333i();
            this.f58582s = C13641g.m34122j(iVar2.mo40353K("viewability"), "om", false);
            if (this.f58577n) {
                C23566v vVar = this.f58579p;
                vVar.getClass();
                C23566v.C23568b bVar = new C23566v.C23568b(vVar);
                bVar.mo58717c((long) this.f58578o, TimeUnit.MILLISECONDS);
                C23566v vVar2 = new C23566v(bVar);
                C23558r j = C23558r.m57725j("https://api.vungle.com/");
                List<String> list = j.f59539f;
                if ("".equals(list.get(list.size() - 1))) {
                    String str = Vungle._instance.appID;
                    C24733f fVar = new C24733f(j, vVar2);
                    fVar.f62607c = str;
                    this.f58580q = fVar;
                } else {
                    throw new IllegalArgumentException("baseUrl must end in /: https://api.vungle.com/");
                }
            }
            if (this.f58582s) {
                C24849b bVar2 = this.f58562A;
                bVar2.f62844a.post(new C24848a(bVar2));
            } else {
                C23181n1 b = C23181n1.m57208b();
                C13452i iVar3 = new C13452i();
                SessionEvent sessionEvent = SessionEvent.OM_SDK;
                iVar3.mo40349F("event", sessionEvent.toString());
                iVar3.mo40347D(SessionAttribute.ENABLED.toString(), Boolean.FALSE);
                b.mo58250d(new C24573q(sessionEvent, iVar3));
            }
            return a;
        } else {
            throw new VungleException(3);
        }
    }

    /* renamed from: c */
    public final String mo58075c() {
        String str;
        if (TextUtils.isEmpty(this.f58563B)) {
            C24559j jVar = (C24559j) this.f58588y.mo58281p(C24559j.class, "appSetIdCookie").get(this.f58585v.mo53295a(), TimeUnit.MILLISECONDS);
            if (jVar != null) {
                str = jVar.mo60826c("appSetId");
            } else {
                str = null;
            }
            this.f58563B = str;
        }
        return this.f58563B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0370 A[SYNTHETIC, Splitter:B:184:0x0370] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0389 A[Catch:{ SettingNotFoundException -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0187  */
    @android.annotation.SuppressLint({"HardwareIds", "NewApi"})
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p359ag.C13452i mo58076d(boolean r13) throws java.lang.IllegalStateException {
        /*
            r12 = this;
            monitor-enter(r12)
            ag.i r0 = r12.f58575l     // Catch:{ all -> 0x03f1 }
            ag.i r0 = r0.mo40330e()     // Catch:{ all -> 0x03f1 }
            ag.i r1 = new ag.i     // Catch:{ all -> 0x03f1 }
            r1.<init>()     // Catch:{ all -> 0x03f1 }
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = "Amazon"
            java.lang.String r6 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0067 }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x0067 }
            if (r5 == 0) goto L_0x0034
            android.content.Context r5 = r12.f58565b     // Catch:{ SettingNotFoundException -> 0x0031 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0031 }
            java.lang.String r6 = "limit_ad_tracking"
            int r6 = android.provider.Settings.Secure.getInt(r5, r6)     // Catch:{ SettingNotFoundException -> 0x0031 }
            if (r6 != r4) goto L_0x0029
            r6 = 1
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            java.lang.String r7 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r7)     // Catch:{ SettingNotFoundException | Exception -> 0x0032 }
            goto L_0x006a
        L_0x0031:
            r6 = 1
        L_0x0032:
            r5 = r2
            goto L_0x006a
        L_0x0034:
            android.content.Context r5 = r12.f58565b     // Catch:{ NoClassDefFoundError -> 0x0054, GooglePlayServicesNotAvailableException -> 0x004e }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r5 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch:{ NoClassDefFoundError -> 0x0054, GooglePlayServicesNotAvailableException -> 0x004e }
            if (r5 == 0) goto L_0x004c
            java.lang.String r6 = r5.getId()     // Catch:{ NoClassDefFoundError -> 0x0054, GooglePlayServicesNotAvailableException -> 0x004e }
            boolean r5 = r5.isLimitAdTrackingEnabled()     // Catch:{ NoClassDefFoundError -> 0x004a, GooglePlayServicesNotAvailableException -> 0x0048 }
            r11 = r6
            r6 = r5
            r5 = r11
            goto L_0x006a
        L_0x0048:
            r5 = move-exception
            goto L_0x0050
        L_0x004a:
            r5 = move-exception
            goto L_0x0056
        L_0x004c:
            r5 = r2
            goto L_0x0065
        L_0x004e:
            r5 = move-exception
            r6 = r2
        L_0x0050:
            r5.getLocalizedMessage()     // Catch:{ Exception -> 0x0068 }
            goto L_0x0068
        L_0x0054:
            r5 = move-exception
            r6 = r2
        L_0x0056:
            r5.getLocalizedMessage()     // Catch:{ Exception -> 0x0068 }
            android.content.Context r5 = r12.f58565b     // Catch:{ Exception -> 0x0068 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r7 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r7)     // Catch:{ Exception -> 0x0068 }
        L_0x0065:
            r6 = 1
            goto L_0x006a
        L_0x0067:
            r6 = r2
        L_0x0068:
            r5 = r6
            goto L_0x0065
        L_0x006a:
            com.vungle.warren.PrivacyManager r7 = com.vungle.warren.PrivacyManager.m57004b()     // Catch:{ all -> 0x03f1 }
            r7.getClass()     // Catch:{ all -> 0x03f1 }
            boolean r7 = com.vungle.warren.PrivacyManager.m57005d()     // Catch:{ all -> 0x03f1 }
            if (r7 == 0) goto L_0x00c2
            if (r5 == 0) goto L_0x0091
            java.lang.String r7 = "Amazon"
            java.lang.String r8 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x03f1 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x03f1 }
            if (r7 == 0) goto L_0x0086
            java.lang.String r7 = "amazon_advertising_id"
            goto L_0x0088
        L_0x0086:
            java.lang.String r7 = "gaid"
        L_0x0088:
            r1.mo40349F(r7, r5)     // Catch:{ all -> 0x03f1 }
            java.lang.String r7 = "ifa"
            r0.mo40349F(r7, r5)     // Catch:{ all -> 0x03f1 }
            goto L_0x00c2
        L_0x0091:
            android.content.Context r5 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x03f1 }
            java.lang.String r7 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r7)     // Catch:{ all -> 0x03f1 }
            java.lang.String r7 = "ifa"
            boolean r8 = r12.f58587x     // Catch:{ all -> 0x03f1 }
            if (r8 == 0) goto L_0x00a6
            java.lang.String r8 = ""
            goto L_0x00b0
        L_0x00a6:
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x03f1 }
            if (r8 != 0) goto L_0x00ae
            r8 = r5
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r8 = ""
        L_0x00b0:
            r0.mo40349F(r7, r8)     // Catch:{ all -> 0x03f1 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x03f1 }
            if (r7 != 0) goto L_0x00c2
            boolean r7 = r12.f58587x     // Catch:{ all -> 0x03f1 }
            if (r7 != 0) goto L_0x00c2
            java.lang.String r7 = "android_id"
            r1.mo40349F(r7, r5)     // Catch:{ all -> 0x03f1 }
        L_0x00c2:
            com.vungle.warren.PrivacyManager r5 = com.vungle.warren.PrivacyManager.m57004b()     // Catch:{ all -> 0x03f1 }
            r5.getClass()     // Catch:{ all -> 0x03f1 }
            boolean r5 = com.vungle.warren.PrivacyManager.m57005d()     // Catch:{ all -> 0x03f1 }
            if (r5 == 0) goto L_0x00d1
            if (r13 == 0) goto L_0x00f9
        L_0x00d1:
            java.lang.String r13 = "ifa"
            com.google.gson.internal.LinkedTreeMap<java.lang.String, ag.g> r5 = r0.f33306b     // Catch:{ all -> 0x03f1 }
            java.lang.Object r13 = r5.remove(r13)     // Catch:{ all -> 0x03f1 }
            ag.g r13 = (p359ag.C13450g) r13     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "android_id"
            com.google.gson.internal.LinkedTreeMap<java.lang.String, ag.g> r5 = r1.f33306b     // Catch:{ all -> 0x03f1 }
            java.lang.Object r13 = r5.remove(r13)     // Catch:{ all -> 0x03f1 }
            ag.g r13 = (p359ag.C13450g) r13     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "gaid"
            com.google.gson.internal.LinkedTreeMap<java.lang.String, ag.g> r5 = r1.f33306b     // Catch:{ all -> 0x03f1 }
            java.lang.Object r13 = r5.remove(r13)     // Catch:{ all -> 0x03f1 }
            ag.g r13 = (p359ag.C13450g) r13     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "amazon_advertising_id"
            com.google.gson.internal.LinkedTreeMap<java.lang.String, ag.g> r5 = r1.f33306b     // Catch:{ all -> 0x03f1 }
            java.lang.Object r13 = r5.remove(r13)     // Catch:{ all -> 0x03f1 }
            ag.g r13 = (p359ag.C13450g) r13     // Catch:{ all -> 0x03f1 }
        L_0x00f9:
            java.lang.String r13 = "lmt"
            if (r6 == 0) goto L_0x00ff
            r5 = 1
            goto L_0x0100
        L_0x00ff:
            r5 = 0
        L_0x0100:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03f1 }
            r0.mo40348E(r13, r5)     // Catch:{ all -> 0x03f1 }
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x03f1 }
            java.lang.Boolean r5 = r12.mo58080i()     // Catch:{ all -> 0x03f1 }
            boolean r13 = r13.equals(r5)     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = "is_google_play_services_available"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x03f1 }
            r1.mo40347D(r5, r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = r12.mo58075c()     // Catch:{ all -> 0x03f1 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x03f1 }
            if (r13 != 0) goto L_0x012b
            java.lang.String r13 = "app_set_id"
            java.lang.String r5 = r12.f58563B     // Catch:{ all -> 0x03f1 }
            r1.mo40349F(r13, r5)     // Catch:{ all -> 0x03f1 }
        L_0x012b:
            android.content.Context r13 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            if (r13 == 0) goto L_0x013a
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ all -> 0x03f1 }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ all -> 0x03f1 }
            android.content.Intent r2 = r13.registerReceiver(r2, r5)     // Catch:{ all -> 0x03f1 }
        L_0x013a:
            r13 = 4
            r5 = 2
            if (r2 == 0) goto L_0x0187
            java.lang.String r6 = "level"
            r7 = -1
            int r6 = r2.getIntExtra(r6, r7)     // Catch:{ all -> 0x03f1 }
            java.lang.String r8 = "scale"
            int r8 = r2.getIntExtra(r8, r7)     // Catch:{ all -> 0x03f1 }
            if (r6 <= 0) goto L_0x015b
            if (r8 <= 0) goto L_0x015b
            java.lang.String r9 = "battery_level"
            float r6 = (float) r6     // Catch:{ all -> 0x03f1 }
            float r8 = (float) r8     // Catch:{ all -> 0x03f1 }
            float r6 = r6 / r8
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r9, r6)     // Catch:{ all -> 0x03f1 }
        L_0x015b:
            java.lang.String r6 = "status"
            int r6 = r2.getIntExtra(r6, r7)     // Catch:{ all -> 0x03f1 }
            if (r6 != r7) goto L_0x0166
            java.lang.String r2 = "UNKNOWN"
            goto L_0x0189
        L_0x0166:
            if (r6 == r5) goto L_0x016f
            r8 = 5
            if (r6 != r8) goto L_0x016c
            goto L_0x016f
        L_0x016c:
            java.lang.String r2 = "NOT_CHARGING"
            goto L_0x0189
        L_0x016f:
            java.lang.String r6 = "plugged"
            int r2 = r2.getIntExtra(r6, r7)     // Catch:{ all -> 0x03f1 }
            if (r2 == r4) goto L_0x0184
            if (r2 == r5) goto L_0x0181
            if (r2 == r13) goto L_0x017e
            java.lang.String r2 = "BATTERY_PLUGGED_OTHERS"
            goto L_0x0189
        L_0x017e:
            java.lang.String r2 = "BATTERY_PLUGGED_WIRELESS"
            goto L_0x0189
        L_0x0181:
            java.lang.String r2 = "BATTERY_PLUGGED_USB"
            goto L_0x0189
        L_0x0184:
            java.lang.String r2 = "BATTERY_PLUGGED_AC"
            goto L_0x0189
        L_0x0187:
            java.lang.String r2 = "UNKNOWN"
        L_0x0189:
            java.lang.String r6 = "battery_state"
            r1.mo40349F(r6, r2)     // Catch:{ all -> 0x03f1 }
            android.content.Context r2 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            java.lang.String r6 = "power"
            java.lang.Object r2 = r2.getSystemService(r6)     // Catch:{ all -> 0x03f1 }
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch:{ all -> 0x03f1 }
            java.lang.String r6 = "battery_saver_enabled"
            if (r2 == 0) goto L_0x01a4
            boolean r2 = r2.isPowerSaveMode()     // Catch:{ all -> 0x03f1 }
            if (r2 == 0) goto L_0x01a4
            r2 = 1
            goto L_0x01a5
        L_0x01a4:
            r2 = 0
        L_0x01a5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r6, r2)     // Catch:{ all -> 0x03f1 }
            android.content.Context r2 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            java.lang.String r6 = "android.permission.ACCESS_NETWORK_STATE"
            int r2 = mf0.C24361g.m61183r(r2, r6)     // Catch:{ all -> 0x03f1 }
            r6 = 24
            r7 = 3
            if (r2 != 0) goto L_0x0261
            java.lang.String r2 = "NONE"
            java.lang.String r8 = "unknown"
            android.content.Context r9 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            java.lang.String r10 = "connectivity"
            java.lang.Object r9 = r9.getSystemService(r10)     // Catch:{ all -> 0x03f1 }
            android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9     // Catch:{ all -> 0x03f1 }
            if (r9 == 0) goto L_0x0219
            android.net.NetworkInfo r10 = r9.getActiveNetworkInfo()     // Catch:{ all -> 0x03f1 }
            if (r10 == 0) goto L_0x0219
            int r2 = r10.getType()     // Catch:{ all -> 0x03f1 }
            if (r2 == 0) goto L_0x01ed
            if (r2 == r4) goto L_0x01ea
            r10 = 6
            if (r2 == r10) goto L_0x01ea
            r10 = 7
            if (r2 == r10) goto L_0x01e7
            r10 = 9
            if (r2 == r10) goto L_0x01e4
            java.lang.String r2 = "UNKNOWN"
            goto L_0x0219
        L_0x01e4:
            java.lang.String r2 = "ETHERNET"
            goto L_0x0219
        L_0x01e7:
            java.lang.String r2 = "BLUETOOTH"
            goto L_0x0219
        L_0x01ea:
            java.lang.String r2 = "WIFI"
            goto L_0x0219
        L_0x01ed:
            java.lang.String r2 = "MOBILE"
            int r8 = r10.getSubtype()     // Catch:{ all -> 0x03f1 }
            switch(r8) {
                case 1: goto L_0x0217;
                case 2: goto L_0x0214;
                case 3: goto L_0x01f6;
                case 4: goto L_0x0211;
                case 5: goto L_0x020e;
                case 6: goto L_0x020b;
                case 7: goto L_0x0208;
                case 8: goto L_0x0205;
                case 9: goto L_0x0202;
                case 10: goto L_0x01f6;
                case 11: goto L_0x01f6;
                case 12: goto L_0x01ff;
                case 13: goto L_0x01fc;
                case 14: goto L_0x01f9;
                default: goto L_0x01f6;
            }     // Catch:{ all -> 0x03f1 }
        L_0x01f6:
            java.lang.String r8 = "unknown"
            goto L_0x0219
        L_0x01f9:
            java.lang.String r8 = "hrpd"
            goto L_0x0219
        L_0x01fc:
            java.lang.String r8 = "LTE"
            goto L_0x0219
        L_0x01ff:
            java.lang.String r8 = "cdma_evdo_b"
            goto L_0x0219
        L_0x0202:
            java.lang.String r8 = "hsupa"
            goto L_0x0219
        L_0x0205:
            java.lang.String r8 = "hsdpa"
            goto L_0x0219
        L_0x0208:
            java.lang.String r8 = "cdma_1xrtt"
            goto L_0x0219
        L_0x020b:
            java.lang.String r8 = "cdma_evdo_a"
            goto L_0x0219
        L_0x020e:
            java.lang.String r8 = "cdma_evdo_0"
            goto L_0x0219
        L_0x0211:
            java.lang.String r8 = "wcdma"
            goto L_0x0219
        L_0x0214:
            java.lang.String r8 = "edge"
            goto L_0x0219
        L_0x0217:
            java.lang.String r8 = "gprs"
        L_0x0219:
            java.lang.String r10 = "connection_type"
            r1.mo40349F(r10, r2)     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "connection_type_detail"
            r1.mo40349F(r2, r8)     // Catch:{ all -> 0x03f1 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03f1 }
            if (r2 < r6) goto L_0x0261
            boolean r2 = r9.isActiveNetworkMetered()     // Catch:{ all -> 0x03f1 }
            if (r2 == 0) goto L_0x0251
            int r2 = r9.getRestrictBackgroundStatus()     // Catch:{ all -> 0x03f1 }
            if (r2 == r4) goto L_0x0240
            if (r2 == r5) goto L_0x023d
            if (r2 == r7) goto L_0x023a
            java.lang.String r2 = "UNKNOWN"
            goto L_0x0242
        L_0x023a:
            java.lang.String r2 = "ENABLED"
            goto L_0x0242
        L_0x023d:
            java.lang.String r2 = "WHITELISTED"
            goto L_0x0242
        L_0x0240:
            java.lang.String r2 = "DISABLED"
        L_0x0242:
            java.lang.String r5 = "data_saver_status"
            r1.mo40349F(r5, r2)     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "network_metered"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r2, r5)     // Catch:{ all -> 0x03f1 }
            goto L_0x0261
        L_0x0251:
            java.lang.String r2 = "data_saver_status"
            java.lang.String r5 = "NOT_APPLICABLE"
            r1.mo40349F(r2, r5)     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "network_metered"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r2, r5)     // Catch:{ all -> 0x03f1 }
        L_0x0261:
            java.lang.String r2 = "locale"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x03f1 }
            r1.mo40349F(r2, r5)     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "language"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = r5.getLanguage()     // Catch:{ all -> 0x03f1 }
            r1.mo40349F(r2, r5)     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "time_zone"
            java.util.TimeZone r5 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = r5.getID()     // Catch:{ all -> 0x03f1 }
            r1.mo40349F(r2, r5)     // Catch:{ all -> 0x03f1 }
            android.content.Context r2 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = "audio"
            java.lang.Object r2 = r2.getSystemService(r5)     // Catch:{ all -> 0x03f1 }
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch:{ all -> 0x03f1 }
            if (r2 == 0) goto L_0x02b6
            int r5 = r2.getStreamMaxVolume(r7)     // Catch:{ all -> 0x03f1 }
            int r2 = r2.getStreamVolume(r7)     // Catch:{ all -> 0x03f1 }
            float r7 = (float) r2     // Catch:{ all -> 0x03f1 }
            float r5 = (float) r5     // Catch:{ all -> 0x03f1 }
            float r7 = r7 / r5
            java.lang.String r5 = "volume_level"
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r5, r7)     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = "sound_enabled"
            if (r2 <= 0) goto L_0x02ae
            r2 = 1
            goto L_0x02af
        L_0x02ae:
            r2 = 0
        L_0x02af:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r5, r2)     // Catch:{ all -> 0x03f1 }
        L_0x02b6:
            td0.a r2 = r12.f58583t     // Catch:{ all -> 0x03f1 }
            java.io.File r2 = r2.mo61483c()     // Catch:{ all -> 0x03f1 }
            r2.getPath()     // Catch:{ all -> 0x03f1 }
            boolean r5 = r2.exists()     // Catch:{ all -> 0x03f1 }
            if (r5 == 0) goto L_0x02da
            boolean r2 = r2.isDirectory()     // Catch:{ all -> 0x03f1 }
            if (r2 == 0) goto L_0x02da
            java.lang.String r2 = "storage_bytes_available"
            td0.a r5 = r12.f58583t     // Catch:{ all -> 0x03f1 }
            long r7 = r5.mo61482b(r4)     // Catch:{ all -> 0x03f1 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r2, r5)     // Catch:{ all -> 0x03f1 }
        L_0x02da:
            java.lang.String r2 = "Amazon"
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x03f1 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x03f1 }
            if (r2 == 0) goto L_0x02f5
            android.content.Context r13 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ all -> 0x03f1 }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "amazon.hardware.fire_tv"
            boolean r13 = r13.hasSystemFeature(r2)     // Catch:{ all -> 0x03f1 }
            goto L_0x0334
        L_0x02f5:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03f1 }
            r5 = 23
            if (r2 < r5) goto L_0x030c
            android.content.Context r2 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            java.lang.String r5 = "uimode"
            java.lang.Object r2 = r2.getSystemService(r5)     // Catch:{ all -> 0x03f1 }
            android.app.UiModeManager r2 = (android.app.UiModeManager) r2     // Catch:{ all -> 0x03f1 }
            int r2 = r2.getCurrentModeType()     // Catch:{ all -> 0x03f1 }
            if (r2 != r13) goto L_0x0331
            goto L_0x0333
        L_0x030c:
            android.content.Context r13 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ all -> 0x03f1 }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "com.google.android.tv"
            boolean r13 = r13.hasSystemFeature(r2)     // Catch:{ all -> 0x03f1 }
            if (r13 != 0) goto L_0x0333
            android.content.Context r13 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ all -> 0x03f1 }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "android.hardware.touchscreen"
            boolean r13 = r13.hasSystemFeature(r2)     // Catch:{ all -> 0x03f1 }
            if (r13 != 0) goto L_0x0331
            goto L_0x0333
        L_0x0331:
            r13 = 0
            goto L_0x0334
        L_0x0333:
            r13 = 1
        L_0x0334:
            java.lang.String r2 = "is_tv"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x03f1 }
            r1.mo40347D(r2, r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "os_api_level"
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03f1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r13, r5)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "app_target_sdk_version"
            android.content.Context r5 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch:{ all -> 0x03f1 }
            int r5 = r5.targetSdkVersion     // Catch:{ all -> 0x03f1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r13, r5)     // Catch:{ all -> 0x03f1 }
            if (r2 < r6) goto L_0x036c
            java.lang.String r13 = "app_min_sdk_version"
            android.content.Context r5 = r12.f58565b     // Catch:{ all -> 0x03f1 }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch:{ all -> 0x03f1 }
            int r5 = r5.minSdkVersion     // Catch:{ all -> 0x03f1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r13, r5)     // Catch:{ all -> 0x03f1 }
        L_0x036c:
            r13 = 26
            if (r2 < r13) goto L_0x0389
            android.content.Context r13 = r12.f58565b     // Catch:{ SettingNotFoundException -> 0x0398 }
            java.lang.String r2 = "android.permission.REQUEST_INSTALL_PACKAGES"
            int r13 = r13.checkCallingOrSelfPermission(r2)     // Catch:{ SettingNotFoundException -> 0x0398 }
            if (r13 != 0) goto L_0x0398
            android.content.Context r13 = r12.f58565b     // Catch:{ SettingNotFoundException -> 0x0398 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ SettingNotFoundException -> 0x0398 }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ SettingNotFoundException -> 0x0398 }
            boolean r3 = r13.canRequestPackageInstalls()     // Catch:{ SettingNotFoundException -> 0x0398 }
            goto L_0x0398
        L_0x0389:
            android.content.Context r13 = r12.f58565b     // Catch:{ SettingNotFoundException -> 0x0398 }
            android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0398 }
            java.lang.String r2 = "install_non_market_apps"
            int r13 = android.provider.Settings.Secure.getInt(r13, r2)     // Catch:{ SettingNotFoundException -> 0x0398 }
            if (r13 != r4) goto L_0x0398
            r3 = 1
        L_0x0398:
            java.lang.String r13 = "is_sideload_enabled"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x03f1 }
            r1.mo40347D(r13, r2)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "mounted"
            boolean r13 = r13.equals(r2)     // Catch:{ all -> 0x03f1 }
            java.lang.String r2 = "sd_card_available"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x03f1 }
            r1.mo40348E(r2, r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "os_name"
            java.lang.String r2 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x03f1 }
            r1.mo40349F(r13, r2)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "vduid"
            java.lang.String r2 = ""
            r1.mo40349F(r13, r2)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "ua"
            java.lang.String r2 = r12.f58589z     // Catch:{ all -> 0x03f1 }
            r0.mo40349F(r13, r2)     // Catch:{ all -> 0x03f1 }
            ag.i r13 = new ag.i     // Catch:{ all -> 0x03f1 }
            r13.<init>()     // Catch:{ all -> 0x03f1 }
            ag.i r2 = new ag.i     // Catch:{ all -> 0x03f1 }
            r2.<init>()     // Catch:{ all -> 0x03f1 }
            java.lang.String r3 = "vungle"
            r13.mo40346C(r2, r3)     // Catch:{ all -> 0x03f1 }
            java.lang.String r3 = "ext"
            r0.mo40346C(r13, r3)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "Amazon"
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x03f1 }
            boolean r13 = r13.equals(r3)     // Catch:{ all -> 0x03f1 }
            if (r13 == 0) goto L_0x03ea
            java.lang.String r13 = "amazon"
            goto L_0x03ec
        L_0x03ea:
            java.lang.String r13 = "android"
        L_0x03ec:
            r2.mo40346C(r1, r13)     // Catch:{ all -> 0x03f1 }
            monitor-exit(r12)
            return r0
        L_0x03f1:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.VungleApiClient.mo58076d(boolean):ag.i");
    }

    /* renamed from: e */
    public final C13452i mo58077e() {
        String str;
        C24559j jVar = (C24559j) this.f58588y.mo58281p(C24559j.class, "config_extension").get(this.f58585v.mo53295a(), TimeUnit.MILLISECONDS);
        if (jVar != null) {
            str = jVar.mo60826c("config_extension");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C13452i iVar = new C13452i();
        iVar.mo40349F("config_extension", str);
        return iVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean mo58078f() {
        /*
            r4 = this;
            java.lang.String r0 = "isPlaySvcAvailable"
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()     // Catch:{ NoClassDefFoundError -> 0x002f, Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            android.content.Context r2 = r4.f58565b     // Catch:{ NoClassDefFoundError -> 0x002f, Exception -> 0x002d }
            int r1 = r1.isGooglePlayServicesAvailable(r2)     // Catch:{ NoClassDefFoundError -> 0x002f, Exception -> 0x002d }
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ NoClassDefFoundError -> 0x002f, Exception -> 0x002d }
            boolean r2 = r1.booleanValue()     // Catch:{ NoClassDefFoundError -> 0x002f }
            od0.j r3 = new od0.j     // Catch:{ NoClassDefFoundError -> 0x002f }
            r3.<init>(r0)     // Catch:{ NoClassDefFoundError -> 0x002f }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ NoClassDefFoundError -> 0x002f }
            r3.mo60827d(r2, r0)     // Catch:{ NoClassDefFoundError -> 0x002f }
            com.vungle.warren.persistence.a r2 = r4.f58588y     // Catch:{ NoClassDefFoundError -> 0x002f }
            r2.mo58288w(r3)     // Catch:{ NoClassDefFoundError -> 0x002f }
            goto L_0x003e
        L_0x002d:
            r1 = 0
            goto L_0x003e
        L_0x002f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            od0.j r2 = new od0.j     // Catch:{ Exception -> 0x003e }
            r2.<init>(r0)     // Catch:{ Exception -> 0x003e }
            r2.mo60827d(r1, r0)     // Catch:{ Exception -> 0x003e }
            com.vungle.warren.persistence.a r0 = r4.f58588y     // Catch:{ Exception -> 0x003e }
            r0.mo58288w(r2)     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.VungleApiClient.mo58078f():java.lang.Boolean");
    }

    /* renamed from: h */
    public final C13452i mo58079h() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        Class<C24559j> cls = C24559j.class;
        C13452i iVar = new C13452i();
        C24559j jVar = (C24559j) this.f58588y.mo58281p(cls, "consentIsImportantToVungle").get(this.f58585v.mo53295a(), TimeUnit.MILLISECONDS);
        String str5 = "";
        if (jVar != null) {
            str2 = jVar.mo60826c("consent_status");
            str = jVar.mo60826c("consent_source");
            j = jVar.mo60825b("timestamp").longValue();
            str3 = jVar.mo60826c("consent_message_version");
        } else {
            j = 0;
            str2 = "unknown";
            str = "no_interaction";
            str3 = str5;
        }
        C13452i iVar2 = new C13452i();
        iVar2.mo40349F("consent_status", str2);
        iVar2.mo40349F("consent_source", str);
        iVar2.mo40348E("consent_timestamp", Long.valueOf(j));
        if (!TextUtils.isEmpty(str3)) {
            str5 = str3;
        }
        iVar2.mo40349F("consent_message_version", str5);
        iVar.mo40346C(iVar2, "gdpr");
        C24559j jVar2 = (C24559j) this.f58588y.mo58281p(cls, "ccpaIsImportantToVungle").get();
        if (jVar2 != null) {
            str4 = jVar2.mo60826c("ccpa_status");
        } else {
            str4 = "opted_in";
        }
        C13452i iVar3 = new C13452i();
        iVar3.mo40349F(ServerParameters.STATUS, str4);
        iVar.mo40346C(iVar3, "ccpa");
        PrivacyManager.m57004b().getClass();
        if (PrivacyManager.m57003a() != PrivacyManager.COPPA.COPPA_NOTSET) {
            C13452i iVar4 = new C13452i();
            PrivacyManager.m57004b().getClass();
            iVar4.mo40347D("is_coppa", Boolean.valueOf(PrivacyManager.m57003a().getValue()));
            iVar.mo40346C(iVar4, "coppa");
        }
        return iVar;
    }

    /* renamed from: i */
    public final Boolean mo58080i() {
        Boolean bool;
        if (this.f58584u == null) {
            C24559j jVar = (C24559j) this.f58588y.mo58281p(C24559j.class, "isPlaySvcAvailable").get(this.f58585v.mo53295a(), TimeUnit.MILLISECONDS);
            if (jVar != null) {
                bool = jVar.mo60824a("isPlaySvcAvailable");
            } else {
                bool = null;
            }
            this.f58584u = bool;
        }
        if (this.f58584u == null) {
            this.f58584u = mo58078f();
        }
        return this.f58584u;
    }

    /* renamed from: j */
    public final boolean mo58081j(String str) throws ClearTextTrafficException, MalformedURLException {
        boolean z;
        boolean isEmpty = TextUtils.isEmpty(str);
        Boolean bool = Boolean.FALSE;
        if (isEmpty || C23558r.m57727m(str) == null) {
            C23181n1 b = C23181n1.m57208b();
            C13452i iVar = new C13452i();
            SessionEvent sessionEvent = SessionEvent.TPAT;
            iVar.mo40349F("event", sessionEvent.toString());
            iVar.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
            iVar.mo40349F(SessionAttribute.REASON.toString(), "Invalid URL");
            iVar.mo40349F(SessionAttribute.URL.toString(), str);
            b.mo58250d(new C24573q(sessionEvent, iVar));
            throw new MalformedURLException(C25541a.m63881k("Invalid URL : ", str));
        }
        try {
            String host = new URL(str).getHost();
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                z = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
            } else if (i >= 23) {
                z = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            } else {
                z = true;
            }
            if (z || !URLUtil.isHttpUrl(str)) {
                try {
                    C24732e a = ((C24728d) this.f58566c.pingTPAT(this.f58589z, str)).mo61216a();
                    if (!a.mo61217a()) {
                        C23181n1 b2 = C23181n1.m57208b();
                        C13452i iVar2 = new C13452i();
                        SessionEvent sessionEvent2 = SessionEvent.TPAT;
                        iVar2.mo40349F("event", sessionEvent2.toString());
                        iVar2.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                        SessionAttribute sessionAttribute = SessionAttribute.REASON;
                        iVar2.mo40349F(sessionAttribute.toString(), a.f62601a.f59412d + ": " + a.f62601a.f59413e);
                        iVar2.mo40349F(SessionAttribute.URL.toString(), str);
                        b2.mo58250d(new C24573q(sessionEvent2, iVar2));
                    }
                    return true;
                } catch (IOException e) {
                    C23181n1 b3 = C23181n1.m57208b();
                    C13452i iVar3 = new C13452i();
                    SessionEvent sessionEvent3 = SessionEvent.TPAT;
                    iVar3.mo40349F("event", sessionEvent3.toString());
                    iVar3.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                    SessionAttribute sessionAttribute2 = SessionAttribute.REASON;
                    iVar3.mo40349F(sessionAttribute2.toString(), e.getMessage());
                    iVar3.mo40349F(SessionAttribute.URL.toString(), str);
                    b3.mo58250d(new C24573q(sessionEvent3, iVar3));
                    return false;
                }
            } else {
                C23181n1 b4 = C23181n1.m57208b();
                C13452i iVar4 = new C13452i();
                SessionEvent sessionEvent4 = SessionEvent.TPAT;
                iVar4.mo40349F("event", sessionEvent4.toString());
                iVar4.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
                iVar4.mo40349F(SessionAttribute.REASON.toString(), "Clear Text Traffic is blocked");
                iVar4.mo40349F(SessionAttribute.URL.toString(), str);
                b4.mo58250d(new C24573q(sessionEvent4, iVar4));
                throw new ClearTextTrafficException();
            }
        } catch (MalformedURLException unused) {
            C23181n1 b5 = C23181n1.m57208b();
            C13452i iVar5 = new C13452i();
            SessionEvent sessionEvent5 = SessionEvent.TPAT;
            iVar5.mo40349F("event", sessionEvent5.toString());
            iVar5.mo40347D(SessionAttribute.SUCCESS.toString(), bool);
            iVar5.mo40349F(SessionAttribute.REASON.toString(), "Invalid URL");
            iVar5.mo40349F(SessionAttribute.URL.toString(), str);
            b5.mo58250d(new C24573q(sessionEvent5, iVar5));
            throw new MalformedURLException(C25541a.m63881k("Invalid URL : ", str));
        }
    }

    /* renamed from: k */
    public final C24728d mo58082k(C13452i iVar) {
        if (this.f58569f != null) {
            C13452i iVar2 = new C13452i();
            iVar2.mo40346C(mo58076d(false), ServerParameters.DEVICE_KEY);
            iVar2.mo40346C(this.f58576m, "app");
            iVar2.mo40346C(iVar, "request");
            iVar2.mo40346C(mo58079h(), "user");
            C13452i e = mo58077e();
            if (e != null) {
                iVar2.mo40346C(e, "ext");
            }
            return this.f58581r.mo61220b(f58560C, this.f58569f, iVar2);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: l */
    public final C24725a<C13452i> mo58083l() throws IllegalStateException {
        String str;
        if (this.f58567d != null) {
            HashMap hashMap = new HashMap(2);
            C13450g I = this.f58576m.mo40351I("id");
            String str2 = "";
            if (I != null) {
                str = I.mo40326B();
            } else {
                str = str2;
            }
            hashMap.put("app_id", str);
            C13452i d = mo58076d(false);
            PrivacyManager.m57004b().getClass();
            if (PrivacyManager.m57005d()) {
                C13450g I2 = d.mo40351I(GetBrowserSessionContextCommand.KEY_IFA);
                if (I2 != null) {
                    str2 = I2.mo40326B();
                }
                hashMap.put(GetBrowserSessionContextCommand.KEY_IFA, str2);
            }
            return this.f58566c.reportNew(f58560C, this.f58567d, hashMap);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    /* renamed from: m */
    public final C24728d mo58084m(LinkedList linkedList) {
        String str;
        if (this.f58574k == null) {
            throw new IllegalStateException("API Client not configured yet! Must call /config first.");
        } else if (!linkedList.isEmpty()) {
            C13452i iVar = new C13452i();
            iVar.mo40346C(mo58076d(false), ServerParameters.DEVICE_KEY);
            iVar.mo40346C(this.f58576m, "app");
            C13452i iVar2 = new C13452i();
            C13447d dVar = new C13447d(linkedList.size());
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C24557h hVar = (C24557h) it.next();
                for (String F : hVar.f62243d) {
                    C13452i iVar3 = new C13452i();
                    if (hVar.f62242c == 1) {
                        str = AttributionData.CAMPAIGN_KEY;
                    } else {
                        str = "creative";
                    }
                    iVar3.mo40349F("target", str);
                    iVar3.mo40349F("id", hVar.f62240a);
                    iVar3.mo40349F("event_id", F);
                    dVar.mo40327C(iVar3);
                }
            }
            if (dVar.size() > 0) {
                iVar2.mo40346C(dVar, "cache_bust");
            }
            iVar.mo40346C(iVar2, "request");
            return this.f58581r.mo61220b(f58560C, this.f58574k, iVar);
        } else {
            throw new IllegalArgumentException("Cannot send analytics when bust and session data is empty");
        }
    }

    /* renamed from: n */
    public final C24728d mo58085n(C13447d dVar) {
        if (this.f58574k != null) {
            C13452i iVar = new C13452i();
            iVar.mo40346C(mo58076d(false), ServerParameters.DEVICE_KEY);
            iVar.mo40346C(this.f58576m, "app");
            C13452i iVar2 = new C13452i();
            iVar2.mo40346C(dVar, "session_events");
            iVar.mo40346C(iVar2, "request");
            return this.f58581r.mo61220b(f58560C, this.f58574k, iVar);
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }
}
