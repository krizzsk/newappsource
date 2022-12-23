package p565io;

import android.os.Bundle;
import mf0.C24362h;
import p247s6.C6478c;
import p469eo.C16846b;
import p565io.C17626c;
import p587jo.C17903b;

/* renamed from: io.c */
public abstract class C17626c<F extends C17626c<F, P>, P extends C17903b<F>> extends C17624a {

    /* renamed from: c */
    public P f45311c;

    /* renamed from: d */
    public final Class<? extends C17903b.C17904a<F, P>> f45312d;

    public C17626c(Class<? extends C17903b.C17904a<F, P>> cls) {
        this.f45312d = cls;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        P p = this.f45311c;
        if (p != null) {
            p.getClass();
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6478c cVar = this.f45307b.f46180j;
        cVar.getClass();
        P a = ((C17903b.C17904a) ((C16846b) cVar.f20215b).mo49505a(this.f45312d, (String) null)).mo50459a(this);
        C24362h.m61210e(a, "presenterFactory.create(presentedFragment as F)");
        this.f45311c = a;
        a.mo50455a(bundle);
    }

    public final void onPause() {
        super.onPause();
        P p = this.f45311c;
        if (p != null) {
            p.mo50456b();
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    public final void onResume() {
        super.onResume();
        P p = this.f45311c;
        if (p != null) {
            p.mo50457c();
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C24362h.m61211f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        P p = this.f45311c;
        if (p != null) {
            p.mo50458d(bundle);
        } else {
            C24362h.m61217l("presenter");
            throw null;
        }
    }
}
