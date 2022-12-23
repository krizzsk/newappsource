package r10;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2129i;
import com.bumptech.glide.C2131j;
import java.io.File;
import p221q6.C6189i;
import p221q6.C6197n;
import p260t6.C6601f;
import p260t6.C6602g;

/* renamed from: r10.e */
public final class C19221e extends C2131j {
    public C19221e(C2116c cVar, C6189i iVar, C6197n nVar, Context context) {
        super(cVar, iVar, nVar, context);
    }

    /* renamed from: f */
    public final C2131j mo10867f(C6601f fVar) {
        this.f6946j.add(fVar);
        return this;
    }

    /* renamed from: g */
    public final C2131j mo10868g(C6602g gVar) {
        synchronized (this) {
            super.mo10868g(gVar);
        }
        return this;
    }

    /* renamed from: k */
    public final C2129i mo10869k(Class cls) {
        return new C19220d(this.f6938b, this, cls, this.f6939c);
    }

    /* renamed from: m */
    public final C2129i mo10871m() {
        return (C19220d) super.mo10871m();
    }

    /* renamed from: r */
    public final void mo10882r(C6602g gVar) {
        if (gVar instanceof C19219c) {
            super.mo10882r(gVar);
        } else {
            super.mo10882r(new C19219c().mo10857a(gVar));
        }
    }

    /* renamed from: t */
    public final C19220d<Bitmap> mo10870l() {
        return (C19220d) super.mo10870l();
    }

    /* renamed from: u */
    public final C2129i mo51641u() {
        return (C19220d) mo10869k(File.class).mo10857a(C2131j.f6937m);
    }

    /* renamed from: v */
    public final C19220d<Drawable> mo51642v(Object obj) {
        return (C19220d) mo10871m().mo10855Y(obj);
    }

    /* renamed from: w */
    public final C19220d<Drawable> mo10880p(String str) {
        return (C19220d) super.mo10880p(str);
    }
}
