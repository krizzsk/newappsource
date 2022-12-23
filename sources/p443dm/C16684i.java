package p443dm;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.masabi.justride.sdk.internal.models.network.HttpMethod;
import com.masabi.justride.sdk.jobs.network.broker.BrokerEndpoint;
import java.util.List;
import mf0.C24368m;
import org.json.JSONException;
import p120i5.C5282c;
import p363ak.C13475a;
import p364al.C13487h;
import p390bm.C13643a;
import p411cm.C13844b;
import p443dm.C16676b;
import p561ik.C17618a;
import p584jl.C17885a;
import p608kl.C18092b;
import p610kn.C18107a;
import p681nn.C18577a;
import p725pj.C18926a;
import p819tk.C19685b;
import p819tk.C19686c;
import p819tk.C19687d;
import p819tk.C19691h;
import p913xi.C20531d;

/* renamed from: dm.i */
public final class C16684i<R extends C19687d> implements C13844b<R> {

    /* renamed from: a */
    public final BrokerEndpoint f43458a;

    /* renamed from: b */
    public final C19686c f43459b;

    /* renamed from: c */
    public final Class<R> f43460c;

    /* renamed from: d */
    public final C20531d f43461d;

    /* renamed from: e */
    public final C5282c f43462e;

    /* renamed from: f */
    public final C16676b.C16677a f43463f;

    /* renamed from: g */
    public final C24368m f43464g;

    /* renamed from: dm.i$a */
    public static class C16685a {

        /* renamed from: a */
        public final C20531d f43465a;

        /* renamed from: b */
        public final C5282c f43466b;

        /* renamed from: c */
        public final C16676b.C16677a f43467c;

        /* renamed from: d */
        public final C24368m f43468d;

        public C16685a(C20531d dVar, C5282c cVar, C16676b.C16677a aVar, C24368m mVar) {
            this.f43465a = dVar;
            this.f43466b = cVar;
            this.f43467c = aVar;
            this.f43468d = mVar;
        }
    }

    public C16684i(BrokerEndpoint brokerEndpoint, C19686c cVar, Class cls, C20531d dVar, C5282c cVar2, C16676b.C16677a aVar, C24368m mVar) {
        this.f43458a = brokerEndpoint;
        this.f43459b = cVar;
        this.f43460c = cls;
        this.f43461d = dVar;
        this.f43462e = cVar2;
        this.f43463f = aVar;
        this.f43464g = mVar;
    }

    /* renamed from: C */
    public final C13487h<R> mo40394C() {
        C13487h hVar;
        C19685b bVar;
        C5282c cVar = this.f43462e;
        cVar.getClass();
        C19691h hVar2 = new C19691h();
        C13487h<C18107a> a = ((C18092b) cVar.f17450b).mo50540a();
        if (a.mo40399a()) {
            hVar = new C13487h(null, a.f33366b);
        } else {
            C18107a aVar = (C18107a) a.f33365a;
            if (aVar != null) {
                hVar2.f49992k = aVar.f46300a;
            }
            C13487h<C18577a> a2 = ((C13643a) cVar.f17451c).mo40528a();
            if (a2.mo40399a()) {
                hVar = new C13487h(null, a2.f33366b);
            } else {
                C18577a aVar2 = (C18577a) a2.f33365a;
                hVar2.f49982a = aVar2.f47285b;
                hVar2.f49983b = aVar2.f47286c;
                hVar2.f49984c = aVar2.f47287d;
                hVar2.f49985d = aVar2.f47288e;
                hVar2.f49986e = aVar2.f47289f;
                hVar2.f49987f = aVar2.f47290g;
                hVar2.f49988g = aVar2.f47291h;
                hVar2.f49989h = aVar2.f47292i;
                hVar2.f49990i = aVar2.f47293j;
                hVar2.f49991j = aVar2.f47294k;
                hVar2.f49993l = C17885a.m44446k0(aVar2.f47295l).getTime() + "";
                hVar2.f49994m = aVar2.f47296m;
                hVar2.f49995n = aVar2.f47297n;
                hVar2.f49996o = (String) cVar.f17449a;
                hVar = new C13487h(hVar2, (C18926a) null);
            }
        }
        if (hVar.mo40399a()) {
            return mo49401a(hVar.f33366b);
        }
        C19691h hVar3 = (C19691h) hVar.f33365a;
        C19686c cVar2 = this.f43459b;
        cVar2.f49975a = hVar3;
        try {
            String b = this.f43461d.mo52733b(cVar2);
            C16676b.C16677a aVar3 = this.f43463f;
            HttpMethod httpMethod = this.f43458a.getHttpMethod();
            String path = this.f43458a.getPath();
            String str = hVar3.f49992k;
            aVar3.getClass();
            C13487h<String> C = new C16676b(aVar3.f43441a, aVar3.f43442b, aVar3.f43443c, aVar3.f43444d, aVar3.f43445e, aVar3.f43446f, aVar3.f43447g, httpMethod, path, b, str).mo40394C();
            if (C.mo40399a()) {
                return mo49401a(C.f33366b);
            }
            try {
                C19687d dVar = (C19687d) this.f43461d.mo52732a(this.f43460c, (String) C.f33365a);
                List<C19685b> list = dVar.f49978c;
                if (list == null || list.isEmpty()) {
                    bVar = null;
                } else {
                    bVar = list.get(0);
                }
                if (bVar == null) {
                    return new C13487h<>(dVar, (C18926a) null);
                }
                this.f43464g.getClass();
                return mo49401a(new C13475a(C24368m.m61231c(bVar), 200, "Underlying network error."));
            } catch (JSONException e) {
                return mo49401a(new C17618a(e.getMessage()));
            }
        } catch (JSONException e2) {
            return mo49401a(new C17618a(e2.getMessage()));
        }
    }

    /* renamed from: a */
    public final C13487h<R> mo49401a(C18926a aVar) {
        if ("network.http.broker".equals(aVar.f48169a)) {
            return new C13487h<>(null, aVar);
        }
        return new C13487h<>(null, new C13475a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }
}
