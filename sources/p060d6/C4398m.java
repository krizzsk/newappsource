package p060d6;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p025b6.C1487b;
import p025b6.C1492e;
import p025b6.C1495h;
import p072e6.C4564b;
import p311x6.C7172i;
import p311x6.C7176l;

/* renamed from: d6.m */
public final class C4398m implements C1487b {

    /* renamed from: j */
    public static final C7172i<Class<?>, byte[]> f15442j = new C7172i<>(50);

    /* renamed from: b */
    public final C4564b f15443b;

    /* renamed from: c */
    public final C1487b f15444c;

    /* renamed from: d */
    public final C1487b f15445d;

    /* renamed from: e */
    public final int f15446e;

    /* renamed from: f */
    public final int f15447f;

    /* renamed from: g */
    public final Class<?> f15448g;

    /* renamed from: h */
    public final C1492e f15449h;

    /* renamed from: i */
    public final C1495h<?> f15450i;

    public C4398m(C4564b bVar, C1487b bVar2, C1487b bVar3, int i, int i2, C1495h<?> hVar, Class<?> cls, C1492e eVar) {
        this.f15443b = bVar;
        this.f15444c = bVar2;
        this.f15445d = bVar3;
        this.f15446e = i;
        this.f15447f = i2;
        this.f15450i = hVar;
        this.f15448g = cls;
        this.f15449h = eVar;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f15443b.mo20075d();
        ByteBuffer.wrap(bArr).putInt(this.f15446e).putInt(this.f15447f).array();
        this.f15445d.mo5841a(messageDigest);
        this.f15444c.mo5841a(messageDigest);
        messageDigest.update(bArr);
        C1495h<?> hVar = this.f15450i;
        if (hVar != null) {
            hVar.mo5841a(messageDigest);
        }
        this.f15449h.mo5841a(messageDigest);
        C7172i<Class<?>, byte[]> iVar = f15442j;
        byte[] a = iVar.mo23471a(this.f15448g);
        if (a == null) {
            a = this.f15448g.getName().getBytes(C1487b.f5389a);
            iVar.mo23472d(this.f15448g, a);
        }
        messageDigest.update(a);
        this.f15443b.put(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4398m)) {
            return false;
        }
        C4398m mVar = (C4398m) obj;
        if (this.f15447f != mVar.f15447f || this.f15446e != mVar.f15446e || !C7176l.m16782b(this.f15450i, mVar.f15450i) || !this.f15448g.equals(mVar.f15448g) || !this.f15444c.equals(mVar.f15444c) || !this.f15445d.equals(mVar.f15445d) || !this.f15449h.equals(mVar.f15449h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.f15445d.hashCode() + (this.f15444c.hashCode() * 31)) * 31) + this.f15446e) * 31) + this.f15447f;
        C1495h<?> hVar = this.f15450i;
        if (hVar != null) {
            hashCode = (hashCode * 31) + hVar.hashCode();
        }
        int hashCode2 = this.f15448g.hashCode();
        return this.f15449h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ResourceCacheKey{sourceKey=");
        k.append(this.f15444c);
        k.append(", signature=");
        k.append(this.f15445d);
        k.append(", width=");
        k.append(this.f15446e);
        k.append(", height=");
        k.append(this.f15447f);
        k.append(", decodedResourceClass=");
        k.append(this.f15448g);
        k.append(", transformation='");
        k.append(this.f15450i);
        k.append('\'');
        k.append(", options=");
        k.append(this.f15449h);
        k.append('}');
        return k.toString();
    }
}
