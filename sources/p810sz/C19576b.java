package p810sz;

import ce0.C21100e;
import java.io.IOException;
import java.util.Collection;

/* renamed from: sz.b */
public final class C19576b<T> implements C19600l<Collection<Object>> {

    /* renamed from: u */
    public final C19600l<Object> f49759u;

    /* renamed from: v */
    public final boolean f49760v;

    public C19576b(C19600l<T> lVar, boolean z) {
        C21100e.m49373x(lVar, "writer");
        this.f49759u = lVar;
        this.f49760v = z;
    }

    /* renamed from: a */
    public static <T> C19576b<T> m46958a(C19600l<T> lVar) {
        return new C19576b<>(lVar, false);
    }

    public final void write(Object obj, C19616q qVar) throws IOException {
        Collection collection = (Collection) obj;
        if (this.f49760v) {
            qVar.mo51965h(collection, this.f49759u);
        } else {
            qVar.mo51964g(collection, this.f49759u);
        }
    }
}
