package v10;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import com.bumptech.glide.load.resource.bitmap.C2208b;
import com.moovit.image.glide.data.ImageData;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p622kz.C18163e;

/* renamed from: v10.e */
public final class C20069e implements C1493f<ImageData, Bitmap> {

    /* renamed from: c */
    public static final C20070a f50915c = new C20070a();

    /* renamed from: a */
    public final C2205a f50916a;

    /* renamed from: b */
    public final float f50917b;

    /* renamed from: v10.e$a */
    public class C20070a extends ThreadLocal<BitmapFactory.Options> {
        public final Object initialValue() {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            return options;
        }
    }

    public C20069e(Resources resources, C2205a aVar) {
        this.f50916a = aVar;
        this.f50917b = ((float) resources.getDisplayMetrics().densityDpi) / ((float) resources.getInteger(C18163e.screen_density_bucket));
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        if (((ImageData) obj).f41740c == ImageData.Format.BUILT_IN) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C4397l<Bitmap> mo5851b(ImageData imageData, int i, int i2, C1492e eVar) throws IOException {
        byte[] bArr = imageData.f41741d;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
            BitmapFactory.Options options = (BitmapFactory.Options) f50915c.get();
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (i == Integer.MIN_VALUE) {
                i = Math.round(this.f50917b * ((float) options.outWidth));
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = Math.round(this.f50917b * ((float) options.outHeight));
            }
        }
        int i3 = i;
        int i4 = i2;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        C2205a aVar = this.f50916a;
        return aVar.mo11005a(new C2208b.C2210b(aVar.f7178c, byteArrayInputStream, aVar.f7179d), i3, i4, eVar, C2205a.f7174k);
    }
}
