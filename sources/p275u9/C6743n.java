package p275u9;

import java.util.HashMap;
import java.util.Map;
import p275u9.C6735h;

/* renamed from: u9.n */
public abstract class C6743n {

    /* renamed from: u9.n$a */
    public static abstract class C6744a {
        /* renamed from: a */
        public final void mo22924a(String str, String str2) {
            Map<String, String> map = ((C6735h.C6736a) this).f20857f;
            if (map != null) {
                map.put(str, str2);
                return;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }

    /* renamed from: a */
    public final String mo22921a(String str) {
        String str2 = mo22890b().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public abstract Map<String, String> mo22890b();

    /* renamed from: c */
    public abstract Integer mo22891c();

    /* renamed from: d */
    public abstract C6742m mo22892d();

    /* renamed from: e */
    public abstract long mo22893e();

    /* renamed from: f */
    public final int mo22922f(String str) {
        String str2 = mo22890b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: g */
    public abstract String mo22895g();

    /* renamed from: h */
    public abstract long mo22896h();

    /* renamed from: i */
    public final C6735h.C6736a mo22923i() {
        C6735h.C6736a aVar = new C6735h.C6736a();
        aVar.mo22901d(mo22895g());
        aVar.f20853b = mo22891c();
        aVar.mo22900c(mo22892d());
        aVar.f20855d = Long.valueOf(mo22893e());
        aVar.f20856e = Long.valueOf(mo22896h());
        aVar.f20857f = new HashMap(mo22890b());
        return aVar;
    }
}
