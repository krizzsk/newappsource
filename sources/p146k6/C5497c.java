package p146k6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p072e6.C4567e;
import p133j6.C5385a;

/* renamed from: k6.c */
public final class C5497c implements C1493f<ImageDecoder.Source, Bitmap> {

    /* renamed from: a */
    public final C4567e f18041a = new C4567e();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final C5498d mo5851b(ImageDecoder.Source source, int i, int i2, C1492e eVar) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C5385a(i, i2, eVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new C5498d(decodeBitmap, this.f18041a);
    }
}
