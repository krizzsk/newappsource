package p515gm;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.amazonaws.http.HttpHeader;
import com.masabi.justride.sdk.internal.models.network.HttpMethod;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import p363ak.C13478d;
import p364al.C13487h;
import p388bk.C13634a;
import p411cm.C13843a;
import p411cm.C13849f;
import p468en.C16842b;
import p725pj.C18926a;
import p795sk.C19468a;
import p819tk.C19690g;

/* renamed from: gm.a */
public final class C17205a {

    /* renamed from: a */
    public final C13843a f44486a;

    /* renamed from: b */
    public final C13849f.C13850a f44487b;

    /* renamed from: c */
    public final C16842b f44488c;

    /* renamed from: d */
    public final String f44489d;

    public C17205a(C13843a aVar, C13849f.C13850a aVar2, C16842b bVar, String str) {
        this.f44486a = aVar;
        this.f44487b = aVar2;
        this.f44488c = bVar;
        this.f44489d = str;
    }

    /* renamed from: a */
    public final C13487h mo49783a(HttpMethod httpMethod, String str, Map map, String str2, C19468a aVar) {
        C13487h hVar;
        byte[] bArr;
        C13487h<String> a = this.f44488c.mo49503a("mpg");
        if (a.mo40399a()) {
            hVar = new C13487h(null, new C13634a(a.f33366b, C13634a.f33620n, "Could not get token"));
        } else {
            StringBuilder k = C13555b.m33972k("Bearer ");
            k.append((String) a.f33365a);
            String sb = k.toString();
            C13487h<Map<String, String>> a2 = this.f44486a.mo40777a();
            if (a2.mo40399a()) {
                hVar = new C13487h(null, new C13634a(a2.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
            } else {
                Map map2 = (Map) a2.f33365a;
                map2.put(HttpHeader.AUTHORIZATION, sb);
                if (!C21100e.m49352m0((CharSequence) null)) {
                    map2.put("JR-Email", (Object) null);
                }
                if (aVar != null) {
                    map2.put("JR-Geolocation-Lat", String.valueOf(aVar.f49497a));
                    map2.put("JR-Geolocation-Lon", String.valueOf(aVar.f49498b));
                    map2.put("JR-Geolocation-Accuracy", String.valueOf(aVar.f49499c));
                    map2.put("JR-Geolocation-Timestamp", String.valueOf(aVar.f49500d));
                }
                C13849f.C13850a aVar2 = this.f44487b;
                StringBuilder k2 = C13555b.m33972k(UrlPrivacyValidator.HTTPS_SCHEME);
                k2.append(this.f44489d);
                StringBuilder sb2 = new StringBuilder(k2.toString());
                if (!str.startsWith("/")) {
                    sb2.append("/");
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                if (str2 == null) {
                    bArr = "".getBytes(StandardCharsets.UTF_8);
                } else {
                    bArr = str2.getBytes(StandardCharsets.UTF_8);
                }
                hVar = new C13849f(aVar2.f34069a, sb3, httpMethod, map2, map, bArr).mo40394C();
                if (hVar.mo40399a()) {
                    hVar = new C13487h(null, hVar.f33366b);
                }
            }
        }
        if (hVar.mo40399a()) {
            return new C13487h(null, hVar.f33366b);
        }
        C19690g gVar = (C19690g) hVar.f33365a;
        int i = gVar.f49981c;
        String str3 = new String(gVar.f49980b, StandardCharsets.UTF_8);
        if (i == 200 || i == 201) {
            return new C13487h(str3, (C18926a) null);
        }
        return new C13487h(null, new C13478d(Integer.valueOf(i), str3));
    }
}
