package z10;

import android.content.res.Resources;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import p072e6.C4566d;

/* renamed from: z10.h */
public final class C20804h extends ThreadLocal<C20803g> {

    /* renamed from: a */
    public final Resources f52512a;

    /* renamed from: b */
    public final C4566d f52513b;

    /* renamed from: c */
    public final C2205a f52514c;

    public C20804h(Resources resources, C4566d dVar, C2205a aVar) {
        this.f52512a = resources;
        this.f52513b = dVar;
        this.f52514c = aVar;
    }

    public final Object initialValue() {
        return new C20803g(this.f52512a, this.f52513b, this.f52514c);
    }
}
