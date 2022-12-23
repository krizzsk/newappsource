package w10;

import android.graphics.Bitmap;
import android.graphics.PointF;
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

/* renamed from: w10.c */
public final class C20270c implements C1493f<ImageData, C20268a> {

    /* renamed from: a */
    public final C20804h f51400a;

    public C20270c(C20804h hVar) {
        this.f51400a = hVar;
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
        ImageData imageData = (ImageData) obj;
        C20803g gVar = (C20803g) this.f51400a.get();
        C20938f0<NinePatchDrawable, Bitmap> b = gVar.mo52924b(imageData, eVar);
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) b.f52685a;
        PointF pointF = imageData.f41742e;
        Bitmap bitmap = (Bitmap) b.f52686b;
        C4566d dVar = gVar.f52502b;
        if (ninePatchDrawable == null) {
            return null;
        }
        return new C20271d(new C20268a(ninePatchDrawable, pointF), bitmap, dVar);
    }
}
