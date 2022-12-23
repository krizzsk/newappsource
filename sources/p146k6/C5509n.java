package p146k6;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p025b6.C1487b;
import p072e6.C4566d;

/* renamed from: k6.n */
public final class C5509n extends C5499e {

    /* renamed from: b */
    public static final byte[] f18052b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C1487b.f5389a);

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(f18052b);
    }

    /* renamed from: c */
    public final Bitmap mo21381c(C4566d dVar, Bitmap bitmap, int i, int i2) {
        return C5516u.m13721b(dVar, bitmap, i, i2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C5509n;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
