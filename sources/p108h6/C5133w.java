package p108h6;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p025b6.C1492e;
import p108h6.C5104n;

/* renamed from: h6.w */
public final class C5133w<Data> implements C5104n<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f17144b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    public final C5104n<C5091f, Data> f17145a;

    /* renamed from: h6.w$a */
    public static class C5134a implements C5106o<Uri, InputStream> {
        /* renamed from: b */
        public final C5104n<Uri, InputStream> mo20818b(C5112r rVar) {
            return new C5133w(rVar.mo20844b(C5091f.class, InputStream.class));
        }
    }

    public C5133w(C5104n<C5091f, Data> nVar) {
        this.f17145a = nVar;
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        return f17144b.contains(((Uri) obj).getScheme());
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        return this.f17145a.mo20816b(new C5091f(((Uri) obj).toString()), i, i2, eVar);
    }
}
