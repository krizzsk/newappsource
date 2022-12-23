package p108h6;

import java.util.HashMap;
import java.util.List;
import p322y6.C7333a;

/* renamed from: h6.p */
public final class C5107p {

    /* renamed from: a */
    public final C5112r f17107a;

    /* renamed from: b */
    public final C5108a f17108b = new C5108a();

    /* renamed from: h6.p$a */
    public static class C5108a {

        /* renamed from: a */
        public final HashMap f17109a = new HashMap();

        /* renamed from: h6.p$a$a */
        public static class C5109a<Model> {

            /* renamed from: a */
            public final List<C5104n<Model, ?>> f17110a;

            public C5109a(List<C5104n<Model, ?>> list) {
                this.f17110a = list;
            }
        }

        /* renamed from: a */
        public final <Model> void mo20840a(Class<Model> cls, List<C5104n<Model, ?>> list) {
            if (((C5109a) this.f17109a.put(cls, new C5109a(list))) != null) {
                throw new IllegalStateException(C25541a.m63880j("Already cached loaders for model: ", cls));
            }
        }
    }

    public C5107p(C7333a.C7336c cVar) {
        C5112r rVar = new C5112r(cVar);
        this.f17107a = rVar;
    }
}
