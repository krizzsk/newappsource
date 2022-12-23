package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.appboy.Constants;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.InAppMessageBase;
import com.appsflyer.ServerParameters;
import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.config.C2627d;
import com.fyber.inneractive.sdk.config.C2630e;
import com.fyber.inneractive.sdk.config.C2672k;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2640a;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.p048dv.C2721g;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.serverapi.C3655a;
import com.fyber.inneractive.sdk.serverapi.C3657b;
import com.fyber.inneractive.sdk.serverapi.C3658c;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3706k0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3725r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.usebutton.sdk.internal.util.DiskLruCache;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a0.C0016g;

/* renamed from: com.fyber.inneractive.sdk.network.c0 */
public class C2893c0 extends C2897e0<C3648e> implements C2915m {

    /* renamed from: g */
    public final InneractiveAdRequest f9886g;

    /* renamed from: h */
    public Map<String, String> f9887h;

    /* renamed from: i */
    public StringBuffer f9888i;

    /* renamed from: j */
    public final C3658c f9889j;

    /* renamed from: k */
    public C2721g f9890k;

    /* renamed from: l */
    public C2666s f9891l;

    /* renamed from: m */
    public boolean f9892m;

    public C2893c0(C2936u<C3648e> uVar, InneractiveAdRequest inneractiveAdRequest, C2666s sVar) {
        this(uVar, inneractiveAdRequest, new C3657b(sVar), C2937v.m7259b().mo13722a(), sVar);
    }

    /* renamed from: a */
    public String mo13664a() {
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        int i = C2630e.f9283a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            StringBuilder k = C13555b.m33972k(UrlPrivacyValidator.HTTPS_SCHEME);
            k.append(IAConfigManager.f9202J.f9221i.f9363f);
            str = k.toString();
        } else {
            str = C2618a.m6641a(property, "clientRequestEnhancedXmlAd");
        }
        InneractiveAdRequest inneractiveAdRequest = this.f9886g;
        C3658c cVar = this.f9889j;
        C2895d0 d0Var = new C2895d0(inneractiveAdRequest, cVar);
        d0Var.f9896c = new HashMap();
        d0Var.mo13694a("fromSDK", Boolean.toString(true));
        d0Var.mo13694a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        boolean z = (C3725r.m9983a() ^ true) || IAConfigManager.f9202J.f9230r;
        String str5 = DiskLruCache.VERSION_1;
        d0Var.mo13694a("secure", z ? str5 : "0");
        d0Var.mo13694a("spotid", inneractiveAdRequest.getSpotId());
        String property2 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property2 == null) {
            if (inneractiveAdRequest.getSelectedUnitConfig() == null) {
                property2 = null;
            } else {
                property2 = ((C2702y) inneractiveAdRequest.getSelectedUnitConfig()).f9422a;
            }
        }
        d0Var.mo13694a(ServerParameters.AF_USER_ID, property2);
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        if (!TextUtils.isEmpty(iAConfigManager.f9227o)) {
            d0Var.mo13694a("med", String.format("%s_%s", new Object[]{iAConfigManager.f9225m, iAConfigManager.f9227o}));
        } else {
            d0Var.mo13694a("med", iAConfigManager.f9225m);
        }
        cVar.getClass();
        d0Var.mo13694a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        C3657b bVar = (C3657b) cVar;
        List<Integer> list = C3657b.f12782e;
        if (!list.isEmpty()) {
            d0Var.mo13694a("protocols", C3707l.m9958a(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, (Collection<Integer>) list));
        }
        List<String> list2 = C3657b.f12783f;
        if (!list2.isEmpty()) {
            d0Var.mo13694a("mimes", C3707l.m9965b(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, list2));
        }
        List<Integer> list3 = C3657b.f12781d;
        if (!list3.isEmpty()) {
            d0Var.mo13694a("api", C3707l.m9958a(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, (Collection<Integer>) list3));
        }
        d0Var.mo13694a(Constants.APPBOY_PUSH_CONTENT_KEY, Integer.toString(iAConfigManager.f9222j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f9222j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            d0Var.mo13694a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            d0Var.mo13694a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        d0Var.mo13694a("zip", iAConfigManager.f9222j.getZipCode());
        d0Var.mo13694a("k", iAConfigManager.f9223k);
        d0Var.mo13694a(Constants.APPBOY_PUSH_TITLE_KEY, Long.toString(System.currentTimeMillis()));
        d0Var.mo13694a("v", bVar.mo15303a("2.2.0"));
        Boolean a = iAConfigManager.f9207D.mo13205a();
        if (a != null) {
            if (a.booleanValue()) {
                str4 = str5;
            } else {
                str4 = "0";
            }
            d0Var.mo13694a("gdpr_privacy_consent", str4);
        }
        C2627d dVar = iAConfigManager.f9207D;
        dVar.getClass();
        if (C3707l.f12893a == null) {
            bool = null;
        } else {
            bool = dVar.f9276f;
        }
        if (bool != null) {
            if (!bool.booleanValue()) {
                str5 = "0";
            }
            d0Var.mo13694a("lgpd_consent", str5);
        }
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.device");
        String str6 = C2672k.m6750b() ? "amazonId" : "aaid";
        if (TextUtils.isEmpty(property3)) {
            property3 = C2672k.m6749a();
        }
        d0Var.mo13694a(str6, property3);
        d0Var.mo13694a("dnt", Boolean.toString(C2672k.m6751c()));
        d0Var.mo13694a("dml", bVar.mo15305b());
        int c = C3707l.m9968c(C3707l.m9972e());
        int c2 = C3707l.m9968c(C3707l.m9970d());
        if (c > 0 && c2 > 0) {
            d0Var.mo13694a("w", Integer.toString(c));
            d0Var.mo13694a("h", Integer.toString(c2));
        }
        int c3 = C3707l.m9967c();
        d0Var.mo13694a("o", c3 == 1 ? Constants.APPBOY_PUSH_PRIORITY_KEY : c3 == 2 ? "l" : "u");
        if (bVar.mo15317n() && iAConfigManager.f9231s) {
            d0Var.mo13694a("lg", bVar.mo15307d() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + bVar.mo15308e());
            d0Var.mo13694a("hacc", bVar.mo15306c());
            d0Var.mo13694a("vacc", bVar.mo15310g());
            d0Var.mo13694a("tacc", bVar.mo15309f());
        }
        d0Var.mo13694a("ciso", C3705k.m9945g());
        d0Var.mo13694a("os", "Android");
        d0Var.mo13694a("mcc", bVar.mo15311h());
        d0Var.mo13694a("mnc", bVar.mo15312i());
        d0Var.mo13694a("nt", C3706k0.m9954f().f12892a);
        d0Var.mo13694a("crn", bVar.mo15301a());
        d0Var.mo13694a("lng", iAConfigManager.f9228p);
        List<String> list4 = iAConfigManager.f9229q;
        if (list4 != null && !list4.isEmpty()) {
            d0Var.mo13694a("in_lng", C3707l.m9965b(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, list4));
        }
        d0Var.mo13694a("bid", C3707l.f12893a.getPackageName());
        d0Var.mo13694a("appv", bVar.mo15314k());
        C2627d dVar2 = iAConfigManager.f9207D;
        dVar2.getClass();
        if (C3707l.f12893a == null) {
            str2 = null;
        } else {
            str2 = dVar2.f9272b;
        }
        d0Var.mo13694a("gdpr_consent_data", str2);
        C2627d dVar3 = iAConfigManager.f9207D;
        dVar3.getClass();
        if (C3707l.f12893a == null) {
            str3 = null;
        } else {
            str3 = dVar3.f9275e;
        }
        d0Var.mo13694a("us_privacy", str3);
        d0Var.mo13694a("mute_video", Boolean.toString(iAConfigManager.f9224l));
        d0Var.mo13694a("osv", Build.VERSION.RELEASE);
        HashMap hashMap = new HashMap();
        bVar.mo15304a(hashMap, inneractiveAdRequest.getSpotId());
        for (Map.Entry entry : hashMap.entrySet()) {
            d0Var.mo13694a((String) entry.getKey(), (String) entry.getValue());
        }
        Map<String, String> map = d0Var.f9896c;
        StringBuilder sb = new StringBuilder(str);
        boolean z2 = true;
        for (Map.Entry next : map.entrySet()) {
            sb.append(z2 ? "?" : "&");
            sb.append((String) next.getKey());
            sb.append("=");
            sb.append(Uri.encode((String) next.getValue()));
            z2 = false;
        }
        String sb2 = sb.toString();
        if (!this.f9892m) {
            IAlog.m9900a(1, (Exception) null, "%s %s", "AD_REQUEST", sb2);
            this.f9892m = true;
        }
        return sb2;
    }

    /* renamed from: d */
    public StringBuffer mo13685d() {
        return this.f9888i;
    }

    /* renamed from: f */
    public C2914l0 mo13671f() {
        return C2914l0.HIGH;
    }

    /* renamed from: h */
    public C2666s mo13673h() {
        return this.f9891l;
    }

    /* renamed from: i */
    public C2923o0 mo13674i() {
        C2640a aVar;
        int i;
        C2666s sVar = this.f9891l;
        if (sVar == null || (aVar = (C2640a) sVar.mo13264a(C2640a.class)) == null) {
            return super.mo13674i();
        }
        Integer b = aVar.mo13240b("connect_timeout");
        int i2 = InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        if (b != null) {
            i = b.intValue();
        } else {
            i = InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS;
        }
        int max = Math.max(i, 1);
        Integer b2 = aVar.mo13240b("read_timeout");
        if (b2 != null) {
            i2 = b2.intValue();
        }
        return new C2923o0(max, Math.max(i2, 1));
    }

    /* renamed from: j */
    public boolean mo13675j() {
        return false;
    }

    /* renamed from: k */
    public byte[] mo13676k() {
        JSONArray jSONArray;
        byte[] bArr = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            C2666s sVar = ((C3657b) this.f9889j).f12784a;
            if (sVar != null) {
                jSONArray = sVar.mo13269d();
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                jSONObject2.put("experiments", jSONArray);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType a = C3655a.m9852a(this.f9886g.getSpotId());
            IAConfigManager iAConfigManager = IAConfigManager.f9202J;
            JSONArray a2 = iAConfigManager.f9236x.mo13210a(a);
            if (a2 != null && a2.length() > 0) {
                jSONObject.put("user_sessions", a2);
            }
            int a3 = iAConfigManager.f9234v.f9337b.mo13271a("dv_enabled", 0, 0);
            if (a != null && a3 == 1) {
                C2721g a4 = iAConfigManager.f9208E.mo13329a(a);
                this.f9890k = a4;
                if (a4 != null) {
                    jSONObject.put("gdem_signal", a4.f9446a.getQuery());
                }
            }
            byte[] bytes = jSONObject.toString().getBytes(StandardCharsets.UTF_8);
            IAlog.m9902a("request json body - %s", jSONObject.toString());
            return bytes;
        } catch (Exception unused) {
            IAlog.m9902a("Failed building body for ad request!", new Object[0]);
            return bArr;
        }
    }

    /* renamed from: n */
    public C2943y mo13679n() {
        return C2943y.POST;
    }

    /* renamed from: o */
    public Map<String, String> mo13686o() {
        return this.f9887h;
    }

    /* renamed from: p */
    public int mo13680p() {
        return 0;
    }

    /* renamed from: q */
    public Map<String, String> mo13681q() {
        int i = C2630e.f9283a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap u = C0016g.m37u("mockadnetworkresponseid", property);
        IAlog.m9902a("NetworkRequestAd: Adding mock response header - %s", property);
        return u;
    }

    public C2893c0(C2936u<C3648e> uVar, InneractiveAdRequest inneractiveAdRequest, C3658c cVar, C2901g gVar, C2666s sVar) {
        super(uVar, gVar);
        this.f9890k = null;
        this.f9892m = false;
        this.f9891l = sVar;
        this.f9886g = inneractiveAdRequest;
        this.f9889j = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072 A[Catch:{ Exception -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077 A[Catch:{ Exception -> 0x0081 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.network.C2887a0 mo13662a(java.io.InputStream r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7, int r8) throws java.lang.Exception {
        /*
            r5 = this;
            r8 = 0
            if (r7 == 0) goto L_0x003a
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r7.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0010
            java.lang.Object r3 = r7.get(r2)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0010
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0010
            java.lang.String r2 = r2.toLowerCase()
            java.lang.Object r3 = r3.get(r8)
            r0.put(r2, r3)
            goto L_0x0010
        L_0x0038:
            r5.f9887h = r0
        L_0x003a:
            r7 = 0
            if (r6 == 0) goto L_0x004d
            java.lang.StringBuffer r6 = com.fyber.inneractive.sdk.util.C3727s.m9991a((java.io.InputStream) r6, (boolean) r8)     // Catch:{ Exception -> 0x0042 }
            goto L_0x004b
        L_0x0042:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r1 = "failed create response builder in network request ad"
            com.fyber.inneractive.sdk.util.IAlog.m9901a(r1, r6, r0)
            r6 = r7
        L_0x004b:
            r5.f9888i = r6
        L_0x004d:
            com.fyber.inneractive.sdk.network.a0 r6 = new com.fyber.inneractive.sdk.network.a0
            r6.<init>()
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.f9887h     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x006f
            java.lang.String r1 = "X-IA-Ad-Type"
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x0081 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0081 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0081 }
            if (r1 != 0) goto L_0x006f
            boolean r1 = android.text.TextUtils.isDigitsOnly(r0)     // Catch:{ Exception -> 0x0081 }
            if (r1 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = r7
        L_0x0070:
            if (r0 == 0) goto L_0x0077
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0078
        L_0x0077:
            r0 = 6
        L_0x0078:
            com.fyber.inneractive.sdk.dv.g r1 = r5.f9890k     // Catch:{ Exception -> 0x0081 }
            com.fyber.inneractive.sdk.response.e r7 = r5.mo13695a(r0, r5, r7, r1)     // Catch:{ Exception -> 0x0081 }
            r6.f9874a = r7     // Catch:{ Exception -> 0x0081 }
            return r6
        L_0x0081:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r8 = "failed parse ad network request"
            com.fyber.inneractive.sdk.util.IAlog.m9901a(r8, r6, r7)
            com.fyber.inneractive.sdk.network.z r7 = new com.fyber.inneractive.sdk.network.z
            r7.<init>((java.lang.Exception) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C2893c0.mo13662a(java.io.InputStream, java.util.Map, int):com.fyber.inneractive.sdk.network.a0");
    }
}
