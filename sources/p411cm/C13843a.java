package p411cm;

import ce0.C21100e;
import com.amazonaws.http.HttpHeader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p364al.C13487h;
import p390bm.C13643a;
import p583jk.C17877j;
import p584jl.C17885a;
import p681nn.C18577a;
import p725pj.C18926a;
import p726pk.C18928a;

/* renamed from: cm.a */
public final class C13843a {

    /* renamed from: a */
    public final C17877j f34052a;

    /* renamed from: b */
    public final C18928a f34053b;

    /* renamed from: c */
    public final C13643a f34054c;

    public C13843a(C17877j jVar, C18928a aVar, C13643a aVar2) {
        this.f34052a = jVar;
        this.f34053b = aVar;
        this.f34054c = aVar2;
    }

    /* renamed from: a */
    public final C13487h<Map<String, String>> mo40777a() {
        C13487h<C18577a> a = this.f34054c.mo40528a();
        if (a.mo40399a()) {
            return new C13487h<>(null, a.f33366b);
        }
        return new C13487h<>(mo40778b((C18577a) a.f33365a), (C18926a) null);
    }

    /* renamed from: b */
    public final HashMap mo40778b(C18577a aVar) {
        HashMap hashMap = new HashMap();
        this.f34052a.getClass();
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!C21100e.m49352m0(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toUpperCase());
        }
        hashMap.put("Accept-Language", sb.toString());
        hashMap.put("JR-AppVersion", aVar.f47286c);
        hashMap.put("JR-BuildStage", aVar.f47288e);
        hashMap.put(HttpHeader.CONTENT_TYPE, "application/json; charset=utf-8");
        hashMap.put("JR-DeviceID", aVar.f47290g);
        hashMap.put("JR-DeviceModel", aVar.f47291h);
        hashMap.put("JR-Locale", aVar.f47292i);
        hashMap.put("JR-PlatformName", aVar.f47293j);
        hashMap.put("JR-SDKVersion", aVar.f47294k);
        hashMap.put("JR-Timestamp", C17885a.m44446k0(aVar.f47295l).getTime() + "");
        hashMap.put("JR-TimeZone", aVar.f47296m);
        hashMap.put(HttpHeader.USER_AGENT, aVar.f47297n);
        String str = aVar.f47285b;
        if (str != null) {
            hashMap.put("JR-AppId", str);
        }
        if (aVar.f47285b != null) {
            hashMap.put("JR-ClientID", aVar.f47289f);
        }
        String str2 = this.f34053b.f48184k;
        if (str2 != null) {
            hashMap.put("JR-ReportingChannel", str2);
        }
        String str3 = this.f34053b.f48185l;
        if (str3 != null) {
            hashMap.put("X-JR-TrafficSource", str3);
        }
        return hashMap;
    }
}
