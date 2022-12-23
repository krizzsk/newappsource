package p443dm;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import java.util.HashMap;
import java.util.Map;
import mf0.C24361g;
import p583jk.C17879l;
import p725pj.C18926a;
import p794sj.C19465b;
import p794sj.C19467d;
import p890wj.C20343a;
import p914xj.C20533a;

/* renamed from: dm.a */
public final class C16675a {

    /* renamed from: a */
    public final Map<C17879l<String, Integer>, C18926a> f43427a;

    /* renamed from: b */
    public final String f43428b;

    public C16675a(String str, HashMap hashMap) {
        this.f43427a = C24361g.m61133C(hashMap);
        this.f43428b = str;
    }

    /* renamed from: a */
    public final C18926a mo49399a(C18926a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C18926a aVar2 = null;
        boolean z4 = false;
        for (C18926a aVar3 = aVar; aVar3 != null; aVar3 = aVar3.f48172d) {
            if (!aVar3.f48169a.equals("authentication.device") || !aVar3.f48170b.equals(C19467d.f49496e)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return new C18926a("fatal", C20533a.f51924e, "Device blocked", aVar);
            }
            if (!aVar3.f48169a.equals("UserServiceError") || !aVar3.f48170b.equals(C20343a.f51505b)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return new C19465b(aVar);
            }
            C18926a aVar4 = this.f43427a.get(new C17879l(aVar3.f48169a, aVar3.f48170b));
            if (aVar4 != null) {
                aVar2 = new C18926a(aVar4.f48169a, aVar4.f48170b, aVar4.f48171c, aVar);
            }
            if (!"network.http".equals(aVar3.f48169a) || 200 != aVar3.f48170b.intValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                z4 = true;
            }
        }
        if (aVar2 != null) {
            return aVar2;
        }
        if (z4) {
            return new C18926a(this.f43428b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error", aVar);
        }
        return new C18926a(this.f43428b, 200, "Underlying network error.", aVar);
    }
}
