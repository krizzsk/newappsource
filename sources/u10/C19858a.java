package u10;

import com.moovit.image.glide.data.ImageData;
import java.io.File;
import p025b6.C1492e;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;
import p298w6.C7000d;
import s10.C19394a;

/* renamed from: u10.a */
public final class C19858a implements C5104n<File, ImageData> {

    /* renamed from: u10.a$a */
    public static class C19859a implements C5106o<File, ImageData> {
        /* renamed from: b */
        public final C5104n<File, ImageData> mo20818b(C5112r rVar) {
            return new C19858a();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        File file = (File) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        File file = (File) obj;
        return new C5104n.C5105a(new C7000d(file), new C19394a(file));
    }
}
