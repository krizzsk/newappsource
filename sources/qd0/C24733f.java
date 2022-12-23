package qd0;

import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import com.vungle.warren.network.VungleApi;
import hi0.C23521b0;
import hi0.C23534e;
import hi0.C23558r;
import hi0.C23562t;
import hi0.C23571x;
import java.util.Map;
import p001a0.C0016g;
import p359ag.C13452i;
import rd0.C24791a;
import rd0.C24792b;
import rd0.C24793c;

/* renamed from: qd0.f */
public final class C24733f implements VungleApi {

    /* renamed from: d */
    public static final C24793c f62603d = new C24793c();

    /* renamed from: e */
    public static final C24792b f62604e = new C24792b();

    /* renamed from: a */
    public C23558r f62605a;

    /* renamed from: b */
    public C23534e.C23535a f62606b;

    /* renamed from: c */
    public String f62607c;

    public C24733f(C23558r rVar, C23534e.C23535a aVar) {
        this.f62605a = rVar;
        this.f62606b = aVar;
    }

    /* renamed from: a */
    public final C24728d mo61219a(String str, String str2, Map map, C24791a aVar) {
        C23558r.C23559a l = C23558r.m57725j(str2).mo58703l();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                l.mo58706a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        C23571x.C23572a c = mo61221c(str, l.mo58707b().f59542i);
        c.mo58728b("GET", (C23521b0) null);
        return new C24728d(this.f62606b.mo58647a(c.mo58727a()), aVar);
    }

    public final C24725a<C13452i> ads(String str, String str2, C13452i iVar) {
        return mo61220b(str, str2, iVar);
    }

    /* renamed from: b */
    public final C24728d mo61220b(String str, String str2, C13452i iVar) {
        String str3;
        if (iVar != null) {
            str3 = iVar.toString();
        } else {
            str3 = "";
        }
        C23571x.C23572a c = mo61221c(str, str2);
        c.mo58728b("POST", C23521b0.m57647d(str3, (C23562t) null));
        return new C24728d(this.f62606b.mo58647a(c.mo58727a()), f62603d);
    }

    /* renamed from: c */
    public final C23571x.C23572a mo61221c(String str, String str2) {
        C23571x.C23572a aVar = new C23571x.C23572a();
        aVar.mo58731e(str2);
        aVar.f59644c.mo58690a(HttpHeader.USER_AGENT, str);
        aVar.f59644c.mo58690a("Vungle-Version", "5.10.0");
        aVar.f59644c.mo58690a(HttpHeader.CONTENT_TYPE, "application/json");
        if (!TextUtils.isEmpty(this.f62607c)) {
            aVar.f59644c.mo58690a("X-Vungle-App-Id", this.f62607c);
        }
        return aVar;
    }

    public final C24725a<C13452i> cacheBust(String str, String str2, C13452i iVar) {
        return mo61220b(str, str2, iVar);
    }

    public final C24725a<C13452i> config(String str, C13452i iVar) {
        return mo61220b(str, C0016g.m31o(new StringBuilder(), this.f62605a.f59542i, "config"), iVar);
    }

    public final C24725a<Void> pingTPAT(String str, String str2) {
        return mo61219a(str, str2, (Map) null, f62604e);
    }

    public final C24725a<C13452i> reportAd(String str, String str2, C13452i iVar) {
        return mo61220b(str, str2, iVar);
    }

    public final C24725a<C13452i> reportNew(String str, String str2, Map<String, String> map) {
        return mo61219a(str, str2, map, f62603d);
    }

    /* renamed from: ri */
    public final C24725a<C13452i> mo58257ri(String str, String str2, C13452i iVar) {
        return mo61220b(str, str2, iVar);
    }

    public final C24725a<C13452i> sendBiAnalytics(String str, String str2, C13452i iVar) {
        return mo61220b(str, str2, iVar);
    }

    public final C24725a<C13452i> sendLog(String str, String str2, C13452i iVar) {
        return mo61220b(str, str2, iVar);
    }

    public final C24725a<C13452i> willPlayAd(String str, String str2, C13452i iVar) {
        return mo61220b(str, str2, iVar);
    }
}
