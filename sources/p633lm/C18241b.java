package p633lm;

import ce0.C21100e;
import com.masabi.justride.sdk.internal.models.network.HttpMethod;
import com.masabi.justride.sdk.jobs.network.forc.FOrcEndpoint;
import java.util.Collections;
import p358af.C13437d;
import p364al.C13487h;
import p388bk.C13634a;
import p515gm.C17205a;
import p795sk.C19468a;
import p894wn.C20379b;
import p913xi.C20531d;
import p917xm.C20541d;

/* renamed from: lm.b */
public final class C18241b {

    /* renamed from: a */
    public final C20531d f46535a;

    /* renamed from: b */
    public final C20541d f46536b;

    /* renamed from: c */
    public final C17205a f46537c;

    /* renamed from: d */
    public final C20379b f46538d;

    /* renamed from: e */
    public final String f46539e;

    public C18241b(C20531d dVar, C20541d dVar2, C17205a aVar, C20379b bVar, String str) {
        this.f46535a = dVar;
        this.f46536b = dVar2;
        this.f46537c = aVar;
        this.f46538d = bVar;
        this.f46539e = str;
    }

    /* renamed from: a */
    public final C13487h<String> mo50653a(FOrcEndpoint fOrcEndpoint, String str, String str2) {
        C17205a aVar = this.f46537c;
        HttpMethod httpMethod = fOrcEndpoint.getHttpMethod();
        StringBuilder sb = new StringBuilder();
        sb.append(fOrcEndpoint.getPath());
        sb.append("/");
        String str3 = this.f46539e;
        if (!C21100e.m49352m0(str)) {
            str3 = C13437d.m33706k(str3, "-", str);
        }
        sb.append(str3);
        String sb2 = sb.toString();
        C19468a a = this.f46538d.mo44368a();
        aVar.getClass();
        C13487h<String> a2 = aVar.mo49783a(httpMethod, sb2, Collections.emptyMap(), str2, a);
        if (a2.mo40399a()) {
            return new C13487h<>(null, new C13634a(a2.f33366b, C13634a.f33621o, "Failed making payment"));
        }
        this.f46536b.mo40394C();
        return a2;
    }
}
