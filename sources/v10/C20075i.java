package v10;

import android.content.Context;
import android.graphics.Bitmap;
import com.moovit.image.C16035l;
import com.moovit.image.glide.ImageDataException;
import com.moovit.image.glide.data.ImageData;
import com.moovit.image.model.Image;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4566d;
import r10.C19218b;
import z10.C20798c;

/* renamed from: v10.i */
public final class C20075i implements C1493f<ImageData, Bitmap> {

    /* renamed from: a */
    public final Context f50926a;

    /* renamed from: b */
    public final C4566d f50927b;

    /* renamed from: c */
    public final C20798c f50928c;

    /* renamed from: d */
    public final C20076a f50929d = new C20076a();

    /* renamed from: v10.i$a */
    public class C20076a extends C16035l.C16039d {
        public C20076a() {
        }

        /* renamed from: a */
        public final Bitmap mo48208a(int i, int i2) {
            return C20075i.this.f50927b.mo20087e(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    public C20075i(Context context, C4566d dVar, C20798c cVar) {
        this.f50926a = context;
        this.f50927b = dVar;
        this.f50928c = cVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        if (((ImageData) obj).f41740c == ImageData.Format.MVF) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        ImageData imageData = (ImageData) obj;
        Image image = (Image) eVar.mo5848c(C19218b.f48818b);
        if (image != null) {
            Bitmap c = C16035l.m40845c(this.f50926a, imageData.f41739b, image.mo48223b(), imageData.f41741d, this.f50929d);
            if (c == null) {
                return null;
            }
            return this.f50928c.mo52922a(this.f50927b, c, i, i2, eVar);
        }
        throw new ImageDataException("MVF image missing image params");
    }
}
