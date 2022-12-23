package s10;

import ce0.C21100e;
import com.moovit.image.glide.data.ImageData;
import com.moovit.image.model.Image;
import java.security.MessageDigest;
import p025b6.C1487b;
import p583jk.C17884p;
import p977zz.C20975x0;
import r10.C19217a;

/* renamed from: s10.c */
public final class C19396c implements C1487b {

    /* renamed from: b */
    public final String f49348b;

    /* renamed from: c */
    public final Object f49349c;

    public C19396c(Image image) {
        C21100e.m49373x(image, "image");
        this.f49348b = image.f41803b;
        this.f49349c = image.f41804c;
    }

    /* renamed from: a */
    public final void mo5841a(MessageDigest messageDigest) {
        C19217a.f48815b.getClass();
        messageDigest.update((byte) 1);
        C17884p.m44381u(messageDigest, this.f49348b);
        C17884p.m44380t(messageDigest, C17884p.m44335F(this.f49349c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19396c)) {
            return false;
        }
        C19396c cVar = (C19396c) obj;
        if (!C20975x0.m49118e(this.f49348b, cVar.f49348b) || !C20975x0.m49118e(this.f49349c, cVar.f49349c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f49348b), C17884p.m44335F(this.f49349c));
    }

    public C19396c(ImageData imageData) {
        C21100e.m49373x(imageData, "imageData");
        this.f49348b = "RemoteImage";
        this.f49349c = imageData.f41739b;
    }
}
