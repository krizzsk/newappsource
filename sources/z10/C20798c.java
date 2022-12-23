package z10;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import com.bumptech.glide.load.resource.bitmap.C2208b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import p025b6.C1492e;
import p072e6.C4564b;
import p072e6.C4566d;
import p146k6.C5498d;
import p311x6.C7176l;

/* renamed from: z10.c */
public final class C20798c {

    /* renamed from: a */
    public final C4564b f52494a;

    /* renamed from: b */
    public final C2205a f52495b;

    public C20798c(C4564b bVar, C2205a aVar) {
        this.f52494a = bVar;
        this.f52495b = aVar;
    }

    /* renamed from: a */
    public final C5498d mo52922a(C4566d dVar, Bitmap bitmap, int i, int i2, C1492e eVar) throws IOException {
        boolean z;
        byte[] bArr;
        boolean z2 = false;
        if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
            z2 = true;
        }
        if (z || z2) {
            return C5498d.m13681c(bitmap, dVar);
        }
        C20805i iVar = new C20805i(C7176l.m16783c(bitmap), this.f52494a);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, iVar);
            synchronized (iVar) {
                bArr = iVar.f52515b;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            C2205a aVar = this.f52495b;
            C5498d a = aVar.mo11005a(new C2208b.C2210b(aVar.f7178c, byteArrayInputStream, aVar.f7179d), i, i2, eVar, C2205a.f7174k);
            dVar.mo20086d(bitmap);
            iVar.close();
            return a;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
