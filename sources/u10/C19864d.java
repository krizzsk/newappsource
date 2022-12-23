package u10;

import android.content.res.Resources;
import android.net.Uri;
import ce0.C21100e;
import com.moovit.image.C16035l;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import p025b6.C1492e;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;
import p693nz.C18659h;
import s10.C19396c;
import s10.C19398e;

/* renamed from: u10.d */
public final class C19864d implements C5104n<ResourceImage, Uri> {

    /* renamed from: a */
    public final Resources f50481a;

    /* renamed from: u10.d$a */
    public static class C19865a implements C5106o<ResourceImage, Uri> {

        /* renamed from: a */
        public final Resources f50482a;

        public C19865a(Resources resources) {
            this.f50482a = resources;
        }

        /* renamed from: b */
        public final C5104n<ResourceImage, Uri> mo20818b(C5112r rVar) {
            return new C19864d(this.f50482a);
        }
    }

    public C19864d(Resources resources) {
        C21100e.m49373x(resources, "resources");
        this.f50481a = resources;
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        Resources resources = this.f50481a;
        int c = ((ResourceImage) obj).mo48250c();
        C18659h hVar = C16035l.f41753a;
        return !"raw".equals(resources.getResourceTypeName(c));
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        ResourceImage resourceImage = (ResourceImage) obj;
        return new C5104n.C5105a(new C19396c((Image) resourceImage), new C19398e(this.f50481a, (Integer) resourceImage.f41804c));
    }
}
