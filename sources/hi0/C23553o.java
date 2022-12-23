package hi0;

import ii0.C23610d;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import si0.C24898f;
import si0.C24901h;

/* renamed from: hi0.o */
public final class C23553o extends C23521b0 {

    /* renamed from: c */
    public static final C23562t f59522c = C23562t.m57742b("application/x-www-form-urlencoded");

    /* renamed from: a */
    public final List<String> f59523a;

    /* renamed from: b */
    public final List<String> f59524b;

    /* renamed from: hi0.o$a */
    public static final class C23554a {

        /* renamed from: a */
        public final ArrayList f59525a = new ArrayList();

        /* renamed from: b */
        public final ArrayList f59526b = new ArrayList();

        /* renamed from: a */
        public final void mo58678a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f59525a.add(C23558r.m57723c(str, false, (Charset) null));
                this.f59526b.add(C23558r.m57723c(str2, false, (Charset) null));
            } else {
                throw new NullPointerException("value == null");
            }
        }
    }

    public C23553o(ArrayList arrayList, ArrayList arrayList2) {
        this.f59523a = C23610d.m57804l(arrayList);
        this.f59524b = C23610d.m57804l(arrayList2);
    }

    /* renamed from: a */
    public final long mo53612a() {
        return mo58677f((C24901h) null, true);
    }

    /* renamed from: b */
    public final C23562t mo53613b() {
        return f59522c;
    }

    /* renamed from: e */
    public final void mo53614e(C24901h hVar) throws IOException {
        mo58677f(hVar, false);
    }

    /* renamed from: f */
    public final long mo58677f(C24901h hVar, boolean z) {
        C24898f fVar;
        if (z) {
            fVar = new C24898f();
        } else {
            fVar = hVar.mo61377D();
        }
        int size = this.f59523a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fVar.mo61395V(38);
            }
            fVar.mo61404c0(this.f59523a.get(i));
            fVar.mo61395V(61);
            fVar.mo61404c0(this.f59524b.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = fVar.f62947c;
        fVar.mo61413i();
        return j;
    }
}
