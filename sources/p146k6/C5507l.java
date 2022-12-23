package p146k6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2125f;
import java.security.MessageDigest;
import p025b6.C1495h;
import p060d6.C4397l;
import p072e6.C4566d;

/* renamed from: k6.l */
public final class C5507l implements C1495h<Drawable> {

    /* renamed from: b */
    public final C1495h<Bitmap> f18050b;

    /* renamed from: c */
    public final boolean f18051c;

    public C5507l(C1495h<Bitmap> hVar, boolean z) {
        this.f18050b = hVar;
        this.f18051c = z;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        this.f18050b.mo5841a(messageDigest);
    }

    /* renamed from: b */
    public final C4397l mo5844b(C2125f fVar, C4397l lVar, int i, int i2) {
        C4566d dVar = C2116c.m5520b(fVar).f6882c;
        Drawable drawable = (Drawable) lVar.get();
        C5498d a = C5505k.m13697a(dVar, drawable, i, i2);
        if (a != null) {
            C4397l b = this.f18050b.mo5844b(fVar, a, i, i2);
            if (!b.equals(a)) {
                return new C5512q(fVar.getResources(), b);
            }
            b.mo10979a();
            return lVar;
        } else if (!this.f18051c) {
            return lVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5507l) {
            return this.f18050b.equals(((C5507l) obj).f18050b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18050b.hashCode();
    }
}
