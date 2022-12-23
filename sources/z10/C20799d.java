package z10;

import android.graphics.Bitmap;
import com.bumptech.glide.load.data.C2141c;
import java.io.IOException;
import p072e6.C4564b;
import p810sz.C19600l;
import p810sz.C19616q;

/* renamed from: z10.d */
public final class C20799d implements C19600l<Bitmap> {

    /* renamed from: u */
    public final C4564b f52496u;

    public C20799d(C4564b bVar) {
        this.f52496u = bVar;
    }

    public final void write(Object obj, C19616q qVar) throws IOException {
        Bitmap.CompressFormat compressFormat;
        C2141c cVar;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap.hasAlpha()) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        try {
            cVar = new C2141c(qVar.mo51933a(), this.f52496u);
            bitmap.compress(compressFormat, 90, cVar);
            cVar.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
