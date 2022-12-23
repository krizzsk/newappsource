package p411cm;

import com.masabi.justride.sdk.internal.models.network.HttpMethod;
import java.util.Map;
import p030bo.C13648b;
import p092g3.C4752a;
import p364al.C13481b;
import p364al.C13482c;
import p819tk.C19690g;

@Deprecated
/* renamed from: cm.e */
public final class C13847e extends C13482c<C19690g> implements C13844b<C19690g> {

    /* renamed from: a */
    public final C13648b f34056a;

    /* renamed from: b */
    public final String f34057b;

    /* renamed from: c */
    public final HttpMethod f34058c;

    /* renamed from: d */
    public final Map<String, String> f34059d;

    /* renamed from: e */
    public final Map<String, String> f34060e;

    /* renamed from: f */
    public final byte[] f34061f;

    @Deprecated
    /* renamed from: cm.e$a */
    public static class C13848a {

        /* renamed from: a */
        public final C13648b f34062a;

        public C13848a(C13648b bVar) {
            this.f34062a = bVar;
        }

        /* renamed from: a */
        public final C13847e mo40779a(String str, HttpMethod httpMethod, Map<String, String> map, Map<String, String> map2, byte[] bArr) {
            return new C13847e(this.f34062a, str, httpMethod, map, map2, bArr);
        }
    }

    public C13847e(C13648b bVar, String str, HttpMethod httpMethod, Map map, Map map2, byte[] bArr) {
        this.f34056a = bVar;
        this.f34057b = str;
        this.f34058c = httpMethod;
        this.f34059d = map;
        this.f34060e = map2;
        this.f34061f = bArr;
    }

    /* renamed from: a */
    public final void mo40395a(C13481b bVar) {
        this.f34056a.mo40531a(this.f34057b, this.f34058c, this.f34060e, this.f34059d, this.f34061f, new C4752a((Object) bVar));
    }
}
