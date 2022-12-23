package p041ca;

import android.content.Context;
import p041ca.C1817f;
import p041ca.C1820h;
import p313x9.C7180b;
import ye0.C25292a;

/* renamed from: ca.c0 */
public final class C1814c0 implements C7180b<C1811b0> {

    /* renamed from: a */
    public final C25292a<Context> f6316a;

    /* renamed from: b */
    public final C25292a<String> f6317b;

    /* renamed from: c */
    public final C25292a<Integer> f6318c;

    public C1814c0(C25292a aVar) {
        C1817f fVar = C1817f.C1818a.f6320a;
        C1820h hVar = C1820h.C1821a.f6322a;
        this.f6316a = aVar;
        this.f6317b = fVar;
        this.f6318c = hVar;
    }

    public final Object get() {
        return new C1811b0(this.f6316a.get(), this.f6317b.get(), this.f6318c.get().intValue());
    }
}
