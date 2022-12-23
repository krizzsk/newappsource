package p742qc;

import android.graphics.Typeface;
import ci0.C21211f;

/* renamed from: qc.a */
public final class C19096a extends C21211f {

    /* renamed from: b */
    public final Typeface f48539b;

    /* renamed from: c */
    public final C19097a f48540c;

    /* renamed from: d */
    public boolean f48541d;

    /* renamed from: qc.a$a */
    public interface C19097a {
        /* renamed from: a */
        void mo41875a(Typeface typeface);
    }

    public C19096a(C19097a aVar, Typeface typeface) {
        this.f48539b = typeface;
        this.f48540c = aVar;
    }

    /* renamed from: s */
    public final void mo41361s(int i) {
        Typeface typeface = this.f48539b;
        if (!this.f48541d) {
            this.f48540c.mo41875a(typeface);
        }
    }

    /* renamed from: t */
    public final void mo41362t(Typeface typeface, boolean z) {
        if (!this.f48541d) {
            this.f48540c.mo41875a(typeface);
        }
    }
}
