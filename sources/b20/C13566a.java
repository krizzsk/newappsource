package b20;

import android.content.Context;
import java.security.MessageDigest;
import p025b6.C1487b;
import p583jk.C17884p;

/* renamed from: b20.a */
public final class C13566a extends C13567b {

    /* renamed from: c */
    public static final byte[] f33514c = "com.moovit.image.transformation.AnchoredBitmapDecoration".getBytes(C1487b.f5389a);

    /* renamed from: b */
    public final C13568c f33515b;

    public C13566a(Context context) {
        this.f33515b = new C13568c(context);
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        messageDigest.update(f33514c);
        this.f33515b.mo5841a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13566a)) {
            return false;
        }
        return this.f33515b.equals(((C13566a) obj).f33515b);
    }

    public final int hashCode() {
        return C17884p.m44333D(-537412840, this.f33515b.hashCode());
    }
}
