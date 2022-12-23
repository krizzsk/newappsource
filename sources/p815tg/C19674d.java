package p815tg;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import p791sg.C19459a;

@KeepForSdk
/* renamed from: tg.d */
public final class C19674d {

    /* renamed from: a */
    public static C19674d f49953a = new C19674d();

    static {
        new GmsLogger("MLKitImageUtils", "");
    }

    @KeepForSdk
    /* renamed from: a */
    public static IObjectWrapper m47161a(C19459a aVar) throws MlKitException {
        int i = aVar.f49484f;
        if (i == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(aVar.f49479a));
        }
        Image image = null;
        if (i != 17) {
            if (i == 35) {
                if (aVar.f49480b != null) {
                    image = aVar.f49480b.f49486a;
                }
                return ObjectWrapper.wrap(image);
            } else if (i != 842094169) {
                throw new MlKitException(C13715c.m34241g(37, "Unsupported image format: ", aVar.f49484f), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(null));
    }

    @KeepForSdk
    /* renamed from: b */
    public static int m47162b(C19459a aVar) {
        int i = aVar.f49484f;
        if (i == -1) {
            return ((Bitmap) Preconditions.checkNotNull(aVar.f49479a)).getAllocationByteCount();
        }
        if (i == 17 || i == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(null)).limit();
        }
        if (i != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(aVar.mo51864b()))[0].getBuffer().limit() * 3) / 2;
    }
}
