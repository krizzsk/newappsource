package p164m0;

import androidx.camera.core.C0544a;
import androidx.camera.core.C0627p;
import java.nio.ByteBuffer;

/* renamed from: m0.a */
public final class C5661a {
    /* renamed from: a */
    public static byte[] m13931a(C0627p pVar) {
        C0627p.C0628a aVar = pVar.getPlanes()[0];
        C0627p.C0628a aVar2 = pVar.getPlanes()[1];
        C0627p.C0628a aVar3 = pVar.getPlanes()[2];
        C0544a.C0545a aVar4 = (C0544a.C0545a) aVar;
        ByteBuffer a = aVar4.mo2406a();
        C0544a.C0545a aVar5 = (C0544a.C0545a) aVar2;
        ByteBuffer a2 = aVar5.mo2406a();
        C0544a.C0545a aVar6 = (C0544a.C0545a) aVar3;
        ByteBuffer a3 = aVar6.mo2406a();
        a.rewind();
        a2.rewind();
        a3.rewind();
        int remaining = a.remaining();
        byte[] bArr = new byte[(((pVar.getHeight() * pVar.getWidth()) / 2) + remaining)];
        int i = 0;
        for (int i2 = 0; i2 < pVar.getHeight(); i2++) {
            a.get(bArr, i, pVar.getWidth());
            i += pVar.getWidth();
            a.position(Math.min(remaining, aVar4.mo2408c() + (a.position() - pVar.getWidth())));
        }
        int height = pVar.getHeight() / 2;
        int width = pVar.getWidth() / 2;
        int c = aVar6.mo2408c();
        int c2 = aVar5.mo2408c();
        int b = aVar6.mo2407b();
        int b2 = aVar5.mo2407b();
        byte[] bArr2 = new byte[c];
        byte[] bArr3 = new byte[c2];
        for (int i3 = 0; i3 < height; i3++) {
            a3.get(bArr2, 0, Math.min(c, a3.remaining()));
            a2.get(bArr3, 0, Math.min(c2, a2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i = i7 + 1;
                bArr[i7] = bArr3[i5];
                i4 += b;
                i5 += b2;
            }
        }
        return bArr;
    }
}
