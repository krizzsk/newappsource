package p916xl;

import com.amazonaws.http.HttpHeader;
import com.masabi.justride.sdk.internal.models.network.HttpMethod;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import p364al.C13483d;
import p364al.C13487h;
import p411cm.C13849f;
import p584jl.C17885a;
import p681nn.C18577a;
import p725pj.C18926a;
import p749qk.C19131a;
import p749qk.C19132b;
import p749qk.C19133c;

/* renamed from: xl.a */
public final /* synthetic */ class C20535a implements C13483d {

    /* renamed from: a */
    public final /* synthetic */ C20536b f51926a;

    /* renamed from: b */
    public final /* synthetic */ List f51927b;

    public /* synthetic */ C20535a(C20536b bVar, List list) {
        this.f51926a = bVar;
        this.f51927b = list;
    }

    /* renamed from: C */
    public final C13487h mo40394C() {
        C20536b bVar = this.f51926a;
        List<C18926a> list = this.f51927b;
        C13487h<C18577a> a = bVar.f51930c.mo40528a();
        if (!a.mo40399a()) {
            C18577a aVar = (C18577a) a.f33365a;
            HashMap b = bVar.f51929b.mo40778b(aVar);
            b.put("JR-BrandId", aVar.f47287d);
            C13487h<String> a2 = bVar.f51931d.mo49503a("data");
            if (!a2.mo40399a()) {
                StringBuilder k = C13555b.m33972k("Bearer ");
                k.append((String) a2.f33365a);
                b.put(HttpHeader.AUTHORIZATION, k.toString());
                Date k0 = C17885a.m44446k0(aVar.f47295l);
                String str = aVar.f47285b;
                String str2 = aVar.f47286c;
                String str3 = aVar.f47287d;
                String str4 = aVar.f47289f;
                String str5 = aVar.f47291h;
                String str6 = aVar.f47290g;
                String str7 = aVar.f47293j;
                String str8 = bVar.f51937j;
                String str9 = str6;
                String str10 = str7;
                String str11 = str8;
                C19131a aVar2 = new C19131a(str, str2, str3, str4, str5, str9, str10, str11, aVar.f47294k, aVar.f47296m, bVar.f51938k);
                ArrayList arrayList = new ArrayList();
                for (C18926a aVar3 : list) {
                    arrayList.add(new C19132b("retail-sdk.error-logs", aVar3.mo51439b(), aVar3.f48169a, aVar3.f48170b.intValue(), k0.getTime(), bVar.f51935h.mo52262a(), aVar2));
                }
                try {
                    String b2 = bVar.f51932e.mo52733b(new C19133c(arrayList));
                    if (!(b2 == null || b2.length() == 0)) {
                        C13849f.C13850a aVar4 = bVar.f51933f;
                        new C13849f(aVar4.f34069a, bVar.f51936i, HttpMethod.POST, b, Collections.emptyMap(), b2.getBytes(StandardCharsets.UTF_8)).mo40394C();
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return new C13487h(null, (C18926a) null);
    }
}
