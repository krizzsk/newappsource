package p288v9;

import android.content.Context;
import p001a0.C0016g;
import p075ea.C4614a;

/* renamed from: v9.b */
public final class C6875b extends C6879f {

    /* renamed from: a */
    public final Context f21231a;

    /* renamed from: b */
    public final C4614a f21232b;

    /* renamed from: c */
    public final C4614a f21233c;

    /* renamed from: d */
    public final String f21234d;

    public C6875b(Context context, C4614a aVar, C4614a aVar2, String str) {
        if (context != null) {
            this.f21231a = context;
            if (aVar != null) {
                this.f21232b = aVar;
                if (aVar2 != null) {
                    this.f21233c = aVar2;
                    if (str != null) {
                        this.f21234d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: a */
    public final Context mo23130a() {
        return this.f21231a;
    }

    /* renamed from: b */
    public final String mo23131b() {
        return this.f21234d;
    }

    /* renamed from: c */
    public final C4614a mo23132c() {
        return this.f21233c;
    }

    /* renamed from: d */
    public final C4614a mo23133d() {
        return this.f21232b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6879f)) {
            return false;
        }
        C6879f fVar = (C6879f) obj;
        if (!this.f21231a.equals(fVar.mo23130a()) || !this.f21232b.equals(fVar.mo23133d()) || !this.f21233c.equals(fVar.mo23132c()) || !this.f21234d.equals(fVar.mo23131b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.f21231a.hashCode() ^ 1000003) * 1000003) ^ this.f21232b.hashCode()) * 1000003) ^ this.f21233c.hashCode()) * 1000003) ^ this.f21234d.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CreationContext{applicationContext=");
        k.append(this.f21231a);
        k.append(", wallClock=");
        k.append(this.f21232b);
        k.append(", monotonicClock=");
        k.append(this.f21233c);
        k.append(", backendName=");
        return C0016g.m31o(k, this.f21234d, "}");
    }
}
