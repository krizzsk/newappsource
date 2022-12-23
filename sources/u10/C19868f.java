package u10;

import android.content.res.Resources;
import com.moovit.image.C16035l;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import p025b6.C1492e;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;
import p693nz.C18659h;
import s10.C19396c;
import s10.C19399f;

/* renamed from: u10.f */
public final class C19868f implements C5104n<ResourceImage, ResourceImage> {

    /* renamed from: a */
    public final Resources f50483a;

    /* renamed from: u10.f$a */
    public static class C19869a implements C5106o<ResourceImage, ResourceImage> {

        /* renamed from: a */
        public final Resources f50484a;

        public C19869a(Resources resources) {
            this.f50484a = resources;
        }

        /* renamed from: b */
        public final C5104n<ResourceImage, ResourceImage> mo20818b(C5112r rVar) {
            return new C19868f(this.f50484a);
        }
    }

    public C19868f(Resources resources) {
        this.f50483a = resources;
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        Resources resources = this.f50483a;
        int c = ((ResourceImage) obj).mo48250c();
        C18659h hVar = C16035l.f41753a;
        return "raw".equals(resources.getResourceTypeName(c));
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        ResourceImage resourceImage = (ResourceImage) obj;
        return new C5104n.C5105a(new C19396c((Image) resourceImage), new C19399f(resourceImage));
    }
}
