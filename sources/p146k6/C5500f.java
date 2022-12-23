package p146k6;

import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import com.bumptech.glide.load.resource.bitmap.C2208b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;

/* renamed from: k6.f */
public final class C5500f implements C1493f<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C2205a f18044a;

    public C5500f(C2205a aVar) {
        this.f18044a = aVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        this.f18044a.getClass();
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        C2205a aVar = this.f18044a;
        List<ImageHeaderParser> list = aVar.f7179d;
        return aVar.mo11005a(new C2208b.C2209a(aVar.f7178c, (ByteBuffer) obj, list), i, i2, eVar, C2205a.f7174k);
    }
}
