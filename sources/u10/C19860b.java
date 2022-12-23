package u10;

import java.io.InputStream;
import p025b6.C1489d;
import p025b6.C1492e;
import p108h6.C5091f;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;
import s10.C19395b;

/* renamed from: u10.b */
public final class C19860b implements C5104n<C5091f, InputStream> {

    /* renamed from: a */
    public static final C1489d<Boolean> f50478a = C1489d.m3904a(Boolean.FALSE, "com.moovit.glide.use_http_cache");

    /* renamed from: u10.b$a */
    public static class C19861a implements C5106o<C5091f, InputStream> {
        /* renamed from: b */
        public final C5104n<C5091f, InputStream> mo20818b(C5112r rVar) {
            return new C19860b();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        C5091f fVar = (C5091f) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        C5091f fVar = (C5091f) obj;
        if (!Boolean.TRUE.equals(eVar.mo5848c(f50478a))) {
            return null;
        }
        return new C5104n.C5105a(fVar, new C19395b(fVar));
    }
}
