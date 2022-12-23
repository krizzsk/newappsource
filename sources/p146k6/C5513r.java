package p146k6;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import com.bumptech.glide.load.resource.bitmap.C2208b;
import java.io.IOException;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;

/* renamed from: k6.r */
public final class C5513r implements C1493f<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    public final C2205a f18067a;

    public C5513r(C2205a aVar) {
        this.f18067a = aVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        boolean z;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        this.f18067a.getClass();
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        C2205a aVar = this.f18067a;
        return aVar.mo11005a(new C2208b.C2211c((ParcelFileDescriptor) obj, aVar.f7179d, aVar.f7178c), i, i2, eVar, C2205a.f7174k);
    }
}
