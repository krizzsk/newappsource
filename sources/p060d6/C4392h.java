package p060d6;

import java.security.MessageDigest;
import java.util.Map;
import p025b6.C1487b;
import p025b6.C1492e;
import p025b6.C1495h;
import p311x6.C7163b;
import p584jl.C17885a;

/* renamed from: d6.h */
public final class C4392h implements C1487b {

    /* renamed from: b */
    public final Object f15425b;

    /* renamed from: c */
    public final int f15426c;

    /* renamed from: d */
    public final int f15427d;

    /* renamed from: e */
    public final Class<?> f15428e;

    /* renamed from: f */
    public final Class<?> f15429f;

    /* renamed from: g */
    public final C1487b f15430g;

    /* renamed from: h */
    public final Map<Class<?>, C1495h<?>> f15431h;

    /* renamed from: i */
    public final C1492e f15432i;

    /* renamed from: j */
    public int f15433j;

    public C4392h(Object obj, C1487b bVar, int i, int i2, C7163b bVar2, Class cls, Class cls2, C1492e eVar) {
        C17885a.m44458r(obj);
        this.f15425b = obj;
        if (bVar != null) {
            this.f15430g = bVar;
            this.f15426c = i;
            this.f15427d = i2;
            C17885a.m44458r(bVar2);
            this.f15431h = bVar2;
            if (cls != null) {
                this.f15428e = cls;
                if (cls2 != null) {
                    this.f15429f = cls2;
                    C17885a.m44458r(eVar);
                    this.f15432i = eVar;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4392h)) {
            return false;
        }
        C4392h hVar = (C4392h) obj;
        if (!this.f15425b.equals(hVar.f15425b) || !this.f15430g.equals(hVar.f15430g) || this.f15427d != hVar.f15427d || this.f15426c != hVar.f15426c || !this.f15431h.equals(hVar.f15431h) || !this.f15428e.equals(hVar.f15428e) || !this.f15429f.equals(hVar.f15429f) || !this.f15432i.equals(hVar.f15432i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f15433j == 0) {
            int hashCode = this.f15425b.hashCode();
            this.f15433j = hashCode;
            int hashCode2 = ((((this.f15430g.hashCode() + (hashCode * 31)) * 31) + this.f15426c) * 31) + this.f15427d;
            this.f15433j = hashCode2;
            int hashCode3 = this.f15431h.hashCode() + (hashCode2 * 31);
            this.f15433j = hashCode3;
            int hashCode4 = this.f15428e.hashCode() + (hashCode3 * 31);
            this.f15433j = hashCode4;
            int hashCode5 = this.f15429f.hashCode() + (hashCode4 * 31);
            this.f15433j = hashCode5;
            this.f15433j = this.f15432i.hashCode() + (hashCode5 * 31);
        }
        return this.f15433j;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("EngineKey{model=");
        k.append(this.f15425b);
        k.append(", width=");
        k.append(this.f15426c);
        k.append(", height=");
        k.append(this.f15427d);
        k.append(", resourceClass=");
        k.append(this.f15428e);
        k.append(", transcodeClass=");
        k.append(this.f15429f);
        k.append(", signature=");
        k.append(this.f15430g);
        k.append(", hashCode=");
        k.append(this.f15433j);
        k.append(", transformations=");
        k.append(this.f15431h);
        k.append(", options=");
        k.append(this.f15432i);
        k.append('}');
        return k.toString();
    }
}
