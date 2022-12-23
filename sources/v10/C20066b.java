package v10;

import com.moovit.image.glide.data.ImageData;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;

/* renamed from: v10.b */
public final class C20066b implements C1493f<ImageData, C20065a> {

    /* renamed from: a */
    public final C20069e f50911a;

    public C20066b(C20069e eVar) {
        this.f50911a = eVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        this.f50911a.getClass();
        if (((ImageData) obj).f41740c == ImageData.Format.BUILT_IN) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        ImageData imageData = (ImageData) obj;
        return C20067c.m47570c(this.f50911a.mo5851b(imageData, i, i2, eVar), imageData.f41742e);
    }
}
