package p146k6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p311x6.C7160a;

/* renamed from: k6.p */
public final class C5511p implements C1493f<InputStream, Bitmap> {

    /* renamed from: a */
    public final C5497c f18064a = new C5497c();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        return this.f18064a.mo5851b(ImageDecoder.createSource(C7160a.m16768b((InputStream) obj)), i, i2, eVar);
    }
}
