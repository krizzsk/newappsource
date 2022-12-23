package p108h6;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import p025b6.C1492e;
import p108h6.C5104n;
import p298w6.C7000d;

/* renamed from: h6.u */
public final class C5125u<Model> implements C5104n<Model, Model> {

    /* renamed from: a */
    public static final C5125u<?> f17136a = new C5125u<>();

    /* renamed from: h6.u$a */
    public static class C5126a<Model> implements C5106o<Model, Model> {

        /* renamed from: a */
        public static final C5126a<?> f17137a = new C5126a<>();

        /* renamed from: b */
        public final C5104n<Model, Model> mo20818b(C5112r rVar) {
            return C5125u.f17136a;
        }
    }

    /* renamed from: h6.u$b */
    public static class C5127b<Model> implements C2142d<Model> {

        /* renamed from: b */
        public final Model f17138b;

        public C5127b(Model model) {
            this.f17138b = model;
        }

        /* renamed from: a */
        public final Class<Model> mo6607a() {
            return this.f17138b.getClass();
        }

        /* renamed from: b */
        public final void mo6608b() {
        }

        public final void cancel() {
        }

        /* renamed from: d */
        public final DataSource mo6610d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final void mo6611e(Priority priority, C2142d.C2143a<? super Model> aVar) {
            aVar.mo10914f(this.f17138b);
        }
    }

    /* renamed from: a */
    public final boolean mo20815a(Model model) {
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a<Model> mo20816b(Model model, int i, int i2, C1492e eVar) {
        return new C5104n.C5105a<>(new C7000d(model), new C5127b(model));
    }
}
