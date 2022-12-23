package w10;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import com.moovit.image.glide.data.ImageData;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4566d;
import p977zz.C20938f0;
import z10.C20803g;
import z10.C20804h;

/* renamed from: w10.e */
public final class C20272e implements C1493f<ImageData, NinePatchDrawable> {

    /* renamed from: a */
    public final C20804h f51404a;

    public C20272e(C20804h hVar) {
        this.f51404a = hVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        if (((ImageData) obj).f41740c == ImageData.Format.NINE_PATCH) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        C20803g gVar = (C20803g) this.f51404a.get();
        C20938f0<NinePatchDrawable, Bitmap> b = gVar.mo52924b((ImageData) obj, eVar);
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) b.f52685a;
        Bitmap bitmap = (Bitmap) b.f52686b;
        C4566d dVar = gVar.f52502b;
        if (ninePatchDrawable == null) {
            return null;
        }
        return new C20273f(ninePatchDrawable, bitmap, dVar);
    }
}
