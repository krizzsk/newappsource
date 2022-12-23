package p838uf;

import android.content.Context;
import p404ce.C13783a;
import p404ce.C13784b;
import p404ce.C13800m;

/* renamed from: uf.f */
public final class C19904f {

    /* renamed from: uf.f$a */
    public interface C19905a<T> {
        /* renamed from: c */
        String mo253c(Context context);
    }

    /* renamed from: a */
    public static C13784b<?> m47417a(String str, String str2) {
        C19899a aVar = new C19899a(str, str2);
        C13784b.C13785a<C19902d> a = C13784b.m34444a(C19902d.class);
        a.f33943d = 1;
        a.f33944e = new C13783a(aVar);
        return a.mo40716b();
    }

    /* renamed from: b */
    public static C13784b<?> m47418b(String str, C19905a<Context> aVar) {
        C13784b.C13785a<C19902d> a = C13784b.m34444a(C19902d.class);
        a.f33943d = 1;
        a.mo40715a(new C13800m(1, 0, Context.class));
        a.f33944e = new C19903e(str, aVar);
        return a.mo40716b();
    }
}
