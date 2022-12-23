package s10;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;

/* renamed from: s10.f */
public final class C19399f<Model> implements C2142d<Model> {

    /* renamed from: b */
    public final Model f49355b;

    public C19399f(Model model) {
        this.f49355b = model;
    }

    /* renamed from: a */
    public final Class<Model> mo6607a() {
        return this.f49355b.getClass();
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
        aVar.mo10914f(this.f49355b);
    }
}
