package p195o6;

import com.bumptech.glide.load.C2137a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4564b;
import p988j$.util.Spliterator;

/* renamed from: o6.i */
public final class C6008i implements C1493f<InputStream, C5998c> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f19199a;

    /* renamed from: b */
    public final C1493f<ByteBuffer, C5998c> f19200b;

    /* renamed from: c */
    public final C4564b f19201c;

    public C6008i(List list, C5994a aVar, C4564b bVar) {
        this.f19199a = list;
        this.f19200b = aVar;
        this.f19201c = bVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) eVar.mo5848c(C6007h.f19198b)).booleanValue()) {
            if (C2137a.m5567b(this.f19201c, inputStream, this.f19199a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Spliterator.SUBSIZED);
        try {
            byte[] bArr2 = new byte[Spliterator.SUBSIZED];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f19200b.mo5851b(ByteBuffer.wrap(bArr), i, i2, eVar);
    }
}
