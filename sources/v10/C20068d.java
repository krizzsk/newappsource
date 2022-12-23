package v10;

import android.graphics.Bitmap;
import com.moovit.image.model.ViewImage;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;

/* renamed from: v10.d */
public final class C20068d implements C1493f<ViewImage, C20065a> {

    /* renamed from: a */
    public final C1493f<ViewImage, Bitmap> f50914a;

    public C20068d(C20072g gVar) {
        this.f50914a = gVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        return this.f50914a.mo5850a((ViewImage) obj, eVar);
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        ViewImage viewImage = (ViewImage) obj;
        return C20067c.m47570c(this.f50914a.mo5851b(viewImage, i, i2, eVar), viewImage.f41825g);
    }
}
