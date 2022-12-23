package p108h6;

import com.bumptech.glide.load.data.C2142d;
import java.util.Collections;
import java.util.List;
import p025b6.C1487b;
import p025b6.C1492e;
import p584jl.C17885a;

/* renamed from: h6.n */
public interface C5104n<Model, Data> {

    /* renamed from: h6.n$a */
    public static class C5105a<Data> {

        /* renamed from: a */
        public final C1487b f17104a;

        /* renamed from: b */
        public final List<C1487b> f17105b;

        /* renamed from: c */
        public final C2142d<Data> f17106c;

        public C5105a() {
            throw null;
        }

        public C5105a(C1487b bVar, C2142d<Data> dVar) {
            List<C1487b> emptyList = Collections.emptyList();
            C17885a.m44458r(bVar);
            this.f17104a = bVar;
            C17885a.m44458r(emptyList);
            this.f17105b = emptyList;
            C17885a.m44458r(dVar);
            this.f17106c = dVar;
        }
    }

    /* renamed from: a */
    boolean mo20815a(Model model);

    /* renamed from: b */
    C5105a<Data> mo20816b(Model model, int i, int i2, C1492e eVar);
}
