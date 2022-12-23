package p411cm;

import androidx.lifecycle.C1042u;
import com.masabi.justride.sdk.internal.models.network.HttpMethod;
import java.util.Map;
import p030bo.C13648b;
import p364al.C13481b;
import p364al.C13482c;
import p819tk.C19690g;

/* renamed from: cm.f */
public final class C13849f extends C13482c<C19690g> implements C13844b<C19690g> {

    /* renamed from: a */
    public final C13648b f34063a;

    /* renamed from: b */
    public final String f34064b;

    /* renamed from: c */
    public final HttpMethod f34065c;

    /* renamed from: d */
    public final Map<String, String> f34066d;

    /* renamed from: e */
    public final Map<String, String> f34067e;

    /* renamed from: f */
    public final byte[] f34068f;

    /* renamed from: cm.f$a */
    public static class C13850a {

        /* renamed from: a */
        public final C13648b f34069a;

        public C13850a(C13648b bVar) {
            this.f34069a = bVar;
        }
    }

    public C13849f(C13648b bVar, String str, HttpMethod httpMethod, Map map, Map map2, byte[] bArr) {
        this.f34063a = bVar;
        this.f34064b = str;
        this.f34065c = httpMethod;
        this.f34066d = map;
        this.f34067e = map2;
        this.f34068f = bArr;
    }

    /* renamed from: a */
    public final void mo40395a(C13481b bVar) {
        this.f34063a.mo40531a(this.f34064b, this.f34065c, this.f34067e, this.f34066d, this.f34068f, new C1042u((Object) bVar));
    }
}
