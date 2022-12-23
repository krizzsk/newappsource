package na0;

import android.content.Context;
import java.io.File;
import ma0.C12895a;
import ma0.C12897b;
import ma0.C12902c;
import pa0.C12999b;
import sa0.C13096e;
import va0.C13189b;
import ya0.C13283h;

/* renamed from: na0.d */
public final class C12925d {

    /* renamed from: a */
    public final C12926a f32003a = new C12926a();

    /* renamed from: b */
    public final C12902c f32004b = new C12902c();

    /* renamed from: c */
    public final C12895a f32005c = new C12895a();

    /* renamed from: d */
    public final C12897b f32006d;

    /* renamed from: e */
    public final C13189b f32007e;

    /* renamed from: f */
    public final C13189b f32008f;

    /* renamed from: g */
    public final C12999b f32009g;

    /* renamed from: h */
    public final C12927e f32010h;

    /* renamed from: i */
    public final C12932j f32011i;

    /* renamed from: j */
    public final C13096e f32012j;

    /* renamed from: na0.d$a */
    public static class C12926a {

        /* renamed from: b */
        public static Object f32013b = new Object();

        /* renamed from: a */
        public C13283h<Object> f32014a = new C13283h<>();

        /* renamed from: a */
        public final synchronized boolean mo39790a(long j) {
            boolean z;
            C13283h.C13284a<V>[] aVarArr = this.f32014a.f32957a;
            C13283h.C13284a<V> aVar = aVarArr[C13283h.m33414b(j) % aVarArr.length];
            while (true) {
                if (aVar == null) {
                    z = false;
                    break;
                } else if (aVar.f32961a == j) {
                    z = true;
                    break;
                } else {
                    aVar = aVar.f32963c;
                }
            }
            return z;
        }
    }

    public C12925d(Context context) {
        if (C12897b.f31913e == null) {
            synchronized (C12897b.class) {
                if (C12897b.f31913e == null) {
                    C12897b.f31913e = new C12897b(new File(context.getCacheDir(), "map_tiles"));
                }
            }
        }
        this.f32006d = C12897b.f31913e;
        this.f32007e = new C13189b("rasterPool");
        this.f32008f = new C13189b("vectorPool");
        this.f32009g = new C12999b(this);
        this.f32010h = new C12927e();
        this.f32011i = new C12932j(this);
        this.f32012j = new C13096e(this);
    }
}
