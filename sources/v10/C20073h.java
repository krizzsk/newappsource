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

/* renamed from: v10.h */
public final class C20073h implements C1493f<ImageData, C20065a> {

    /* renamed from: a */
    public final Context f50921a;

    /* renamed from: b */
    public final C4566d f50922b;

    /* renamed from: c */
    public final C20798c f50923c;

    /* renamed from: d */
    public final C20074a f50924d = new C20074a();

    /* renamed from: v10.h$a */
    public class C20074a extends C16035l.C16039d {
        public C20074a() {
        }

        /* renamed from: a */
        public final Bitmap mo48208a(int i, int i2) {
            return C20073h.this.f50922b.mo20087e(i, i2, Bitmap.Config.ARGB_8888);
        }
    }

    public C20073h(Context context, C4566d dVar, C20798c cVar) {
        this.f50921a = context;
        this.f50922b = dVar;
        this.f50923c = cVar;
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
            Bitmap c = C16035l.m40845c(this.f50921a, imageData.f41739b, image.mo48223b(), imageData.f41741d, this.f50924d);
            if (c == null) {
                return null;
            }
            return C20067c.m47570c(this.f50923c.mo52922a(this.f50922b, c, i, i2, eVar), imageData.f41742e);
        }
        throw new ImageDataException("MVF image missing image params");
    }
}
