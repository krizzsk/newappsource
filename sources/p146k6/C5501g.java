package p146k6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;

/* renamed from: k6.g */
public final class C5501g implements C1493f<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C5497c f18045a = new C5497c();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        return this.f18045a.mo5851b(ImageDecoder.createSource((ByteBuffer) obj), i, i2, eVar);
    }
}
