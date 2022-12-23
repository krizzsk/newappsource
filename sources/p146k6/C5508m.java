package p146k6;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p034c2.C1759a;
import p072e6.C4564b;
import p311x6.C7160a;

/* renamed from: k6.m */
public final class C5508m implements ImageHeaderParser {
    /* renamed from: a */
    public final int mo10892a(InputStream inputStream, C4564b bVar) throws IOException {
        int g = new C1759a(inputStream).mo6534g(1, "Orientation");
        if (g == 0) {
            return -1;
        }
        return g;
    }

    /* renamed from: b */
    public final ImageHeaderParser.ImageType mo10893b(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public final ImageHeaderParser.ImageType mo10894c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: d */
    public final int mo10895d(ByteBuffer byteBuffer, C4564b bVar) throws IOException {
        AtomicReference<byte[]> atomicReference = C7160a.f22239a;
        return mo10892a(new C7160a.C7161a(byteBuffer), bVar);
    }
}
