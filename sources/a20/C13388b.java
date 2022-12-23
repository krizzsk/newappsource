package a20;

import android.util.SparseArray;
import ce0.C21100e;
import com.moovit.image.model.ImageRef;
import java.io.IOException;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;

/* renamed from: a20.b */
public final class C13388b {

    /* renamed from: a */
    public final SparseArray<ImageRef> f33226a;

    /* renamed from: a20.b$a */
    public static class C13389a extends C19619s<C13388b> {

        /* renamed from: w */
        public final C19589j<? extends ImageRef> f33227w;

        /* renamed from: x */
        public final C19600l<? super ImageRef> f33228x;

        public C13389a(C19617r rVar, C19617r rVar2) {
            super(0, C13388b.class);
            this.f33227w = rVar;
            this.f33228x = rVar2;
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new C13388b(pVar.mo51963s(this.f33227w), false);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51968s(((C13388b) obj).f33226a, this.f33228x);
        }
    }

    public C13388b() {
        throw null;
    }

    public C13388b(SparseArray<ImageRef> sparseArray, boolean z) {
        C21100e.m49373x(sparseArray, "imageRefs");
        this.f33226a = z ? sparseArray.clone() : sparseArray;
    }
}
