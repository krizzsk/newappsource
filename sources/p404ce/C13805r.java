package p404ce;

import com.facebook.appevents.C2342l;
import p028ba.C1510d;
import p956ze.C20837a;
import p956ze.C20839b;

/* renamed from: ce.r */
public final class C13805r<T> implements C20839b<T>, C20837a<T> {

    /* renamed from: c */
    public static final C2342l f33979c = new C2342l(6);

    /* renamed from: d */
    public static final C13804q f33980d = new C13804q(0);

    /* renamed from: a */
    public C20837a.C20838a<T> f33981a;

    /* renamed from: b */
    public volatile C20839b<T> f33982b;

    public C13805r(C2342l lVar, C20839b bVar) {
        this.f33981a = lVar;
        this.f33982b = bVar;
    }

    /* renamed from: a */
    public final void mo40735a(C20837a.C20838a<T> aVar) {
        C20839b<T> bVar;
        C20839b<T> bVar2 = this.f33982b;
        C13804q qVar = f33980d;
        if (bVar2 != qVar) {
            aVar.mo5856d(bVar2);
            return;
        }
        C20839b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.f33982b;
            if (bVar != qVar) {
                bVar3 = bVar;
            } else {
                this.f33981a = new C1510d(2, this.f33981a, aVar);
            }
        }
        if (bVar3 != null) {
            aVar.mo5856d(bVar);
        }
    }

    public final T get() {
        return this.f33982b.get();
    }
}
