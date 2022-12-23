package p121i6;

import com.bumptech.glide.load.data.C2152j;
import java.io.InputStream;
import java.util.ArrayDeque;
import p025b6.C1489d;
import p025b6.C1492e;
import p108h6.C5091f;
import p108h6.C5102m;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;

/* renamed from: i6.a */
public final class C5284a implements C5104n<C5091f, InputStream> {

    /* renamed from: b */
    public static final C1489d<Integer> f17454b = C1489d.m3904a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a */
    public final C5102m<C5091f, C5091f> f17455a;

    /* renamed from: i6.a$a */
    public static class C5285a implements C5106o<C5091f, InputStream> {

        /* renamed from: a */
        public final C5102m<C5091f, C5091f> f17456a = new C5102m<>();

        /* renamed from: b */
        public final C5104n<C5091f, InputStream> mo20818b(C5112r rVar) {
            return new C5284a(this.f17456a);
        }
    }

    public C5284a(C5102m<C5091f, C5091f> mVar) {
        this.f17455a = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        C5091f fVar = (C5091f) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        C5091f fVar = (C5091f) obj;
        C5102m<C5091f, C5091f> mVar = this.f17455a;
        if (mVar != null) {
            C5102m.C5103a a = C5102m.C5103a.m12980a(fVar);
            Object a2 = mVar.f17099a.mo23471a(a);
            ArrayDeque arrayDeque = C5102m.C5103a.f17100d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a);
            }
            C5091f fVar2 = (C5091f) a2;
            if (fVar2 == null) {
                C5102m<C5091f, C5091f> mVar2 = this.f17455a;
                mVar2.getClass();
                mVar2.f17099a.mo23472d(C5102m.C5103a.m12980a(fVar), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new C5104n.C5105a(fVar, new C2152j(fVar, ((Integer) eVar.mo5848c(f17454b)).intValue()));
    }
}
