package p121i6;

import java.io.InputStream;
import java.net.URL;
import p025b6.C1492e;
import p108h6.C5091f;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;

/* renamed from: i6.e */
public final class C5295e implements C5104n<URL, InputStream> {

    /* renamed from: a */
    public final C5104n<C5091f, InputStream> f17478a;

    /* renamed from: i6.e$a */
    public static class C5296a implements C5106o<URL, InputStream> {
        /* renamed from: b */
        public final C5104n<URL, InputStream> mo20818b(C5112r rVar) {
            return new C5295e(rVar.mo20844b(C5091f.class, InputStream.class));
        }
    }

    public C5295e(C5104n<C5091f, InputStream> nVar) {
        this.f17478a = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        URL url = (URL) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        return this.f17478a.mo20816b(new C5091f((URL) obj), i, i2, eVar);
    }
}
