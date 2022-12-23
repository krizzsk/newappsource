package u10;

import android.net.Uri;
import com.moovit.image.model.UriImage;
import java.io.InputStream;
import p025b6.C1492e;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;

/* renamed from: u10.h */
public final class C19872h implements C5104n<UriImage, InputStream> {

    /* renamed from: a */
    public final C5104n<Uri, InputStream> f50485a;

    /* renamed from: u10.h$a */
    public static class C19873a implements C5106o<UriImage, InputStream> {
        /* renamed from: b */
        public final C5104n<UriImage, InputStream> mo20818b(C5112r rVar) {
            return new C19872h(rVar.mo20844b(Uri.class, InputStream.class));
        }
    }

    public C19872h(C5104n<Uri, InputStream> nVar) {
        this.f50485a = nVar;
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        return this.f50485a.mo20815a((Uri) ((UriImage) obj).f41804c);
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        return this.f50485a.mo20816b((Uri) ((UriImage) obj).f41804c, i, i2, eVar);
    }
}
