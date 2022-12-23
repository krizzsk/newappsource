package com.cubic.umo.api;

import com.squareup.moshi.C8017o;
import ff0.C23349c;
import hi0.C23521b0;
import hi0.C23529c0;
import hi0.C23536e0;
import hi0.C23571x;
import hi0.C23574z;
import java.util.Map;
import mf0.C24362h;
import ob0.C12977b;
import p096g7.C4839a;
import p096g7.C4842b;
import sf0.C24866j;
import uh0.C25081h;
import wh0.C25177g;

public abstract class UmoService {
    /* renamed from: f */
    public static final C4839a m5970f(UmoService umoService, C23529c0 c0Var, Class cls) {
        String str;
        boolean z;
        umoService.getClass();
        C23536e0 e0Var = c0Var.f59416h;
        if (e0Var == null) {
            str = null;
        } else {
            str = e0Var.mo58649v();
        }
        if (c0Var.mo58644v()) {
            if (str == null || C25081h.m62831B(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C24866j<Object>[] jVarArr = C4842b.f16264a;
                C8017o.C8018a aVar = new C8017o.C8018a();
                aVar.mo25084a(new UTCDateAdapter());
                Object b = new C8017o(aVar).mo25080a(cls).mo25049b(str);
                C24362h.m61208c(b);
                return new C4839a.C4841b(b);
            }
        }
        return new C4839a.C4840a(c0Var.f59412d, str);
    }

    /* renamed from: g */
    public static Object m5971g(UmoService umoService, String str, Map map, C23349c cVar) {
        umoService.getClass();
        C23571x.C23572a aVar = new C23571x.C23572a();
        aVar.mo58731e(C24362h.m61216k(str, umoService.mo11592j()));
        C4842b.m12162a(aVar, map);
        aVar.mo58728b("DELETE", (C23521b0) null);
        return C25177g.m63221e(C4842b.f16265b.f52870b, new UmoService$delete$2(aVar.mo58727a(), umoService, (C23349c<? super UmoService$delete$2>) null), cVar);
    }

    /* renamed from: h */
    public final Object mo11590h(String str, Map map, C12977b.C12979b bVar, C23349c cVar) {
        C23571x.C23572a aVar = new C23571x.C23572a();
        aVar.mo58731e(C24362h.m61216k(str, mo11592j()));
        C4842b.m12162a(aVar, map);
        aVar.mo58728b("GET", (C23521b0) null);
        return C25177g.m63221e(C4842b.f16265b.f52870b, new UmoService$get$4(aVar.mo58727a(), this, bVar, (C23349c<? super UmoService$get$4>) null), cVar);
    }

    /* renamed from: i */
    public final Object mo11591i(Map map, Class cls, C23349c cVar) {
        C23571x.C23572a aVar = new C23571x.C23572a();
        aVar.mo58731e(C24362h.m61216k("user", mo11592j()));
        C4842b.m12162a(aVar, map);
        aVar.mo58728b("GET", (C23521b0) null);
        return C25177g.m63221e(C4842b.f16265b.f52870b, new UmoService$get$2(aVar.mo58727a(), this, cls, (C23349c<? super UmoService$get$2>) null), cVar);
    }

    /* renamed from: j */
    public abstract String mo11592j();

    /* renamed from: k */
    public final Object mo11593k(String str, Map map, C23574z zVar, C23349c cVar) {
        C23571x.C23572a aVar = new C23571x.C23572a();
        aVar.mo58731e(C24362h.m61216k(str, mo11592j()));
        C4842b.m12162a(aVar, map);
        aVar.mo58728b("POST", zVar);
        return C25177g.m63221e(C4842b.f16265b.f52870b, new UmoService$post$6(aVar.mo58727a(), this, (C23349c<? super UmoService$post$6>) null), cVar);
    }

    /* renamed from: l */
    public final <T> Object mo11594l(String str, Map<String, String> map, C23521b0 b0Var, Class<T> cls, C23349c<? super C4839a<T>> cVar) {
        C23571x.C23572a aVar = new C23571x.C23572a();
        aVar.mo58731e(C24362h.m61216k(str, mo11592j()));
        C4842b.m12162a(aVar, map);
        aVar.mo58728b("POST", b0Var);
        return C25177g.m63221e(C4842b.f16265b.f52870b, new UmoService$post$4(aVar.mo58727a(), this, cls, (C23349c<? super UmoService$post$4>) null), cVar);
    }
}
