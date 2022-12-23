package p195o6;

import android.graphics.Bitmap;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2125f;
import java.security.MessageDigest;
import p025b6.C1495h;
import p060d6.C4397l;
import p146k6.C5498d;
import p584jl.C17885a;

/* renamed from: o6.e */
public final class C6001e implements C1495h<C5998c> {

    /* renamed from: b */
    public final C1495h<Bitmap> f19173b;

    public C6001e(C1495h<Bitmap> hVar) {
        C17885a.m44458r(hVar);
        this.f19173b = hVar;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        this.f19173b.mo5841a(messageDigest);
    }

    /* renamed from: b */
    public final C4397l mo5844b(C2125f fVar, C4397l lVar, int i, int i2) {
        C5998c cVar = (C5998c) lVar.get();
        C5498d dVar = new C5498d(cVar.f19162b.f19172a.f19185l, C2116c.m5520b(fVar).f6882c);
        C4397l b = this.f19173b.mo5844b(fVar, dVar, i, i2);
        if (!dVar.equals(b)) {
            dVar.mo10979a();
        }
        C1495h<Bitmap> hVar = this.f19173b;
        cVar.f19162b.f19172a.mo22004c(hVar, (Bitmap) b.get());
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6001e) {
            return this.f19173b.equals(((C6001e) obj).f19173b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19173b.hashCode();
    }
}
