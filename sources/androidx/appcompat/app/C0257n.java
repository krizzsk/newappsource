package androidx.appcompat.app;

import android.view.View;
import ce0.C21100e;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6386q0;

/* renamed from: androidx.appcompat.app.n */
public final class C0257n extends C21100e {

    /* renamed from: i */
    public final /* synthetic */ AppCompatDelegateImpl f744i;

    public C0257n(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f744i = appCompatDelegateImpl;
    }

    /* renamed from: b */
    public final void mo909b(View view) {
        this.f744i.f662q.setAlpha(1.0f);
        this.f744i.f665t.mo22497g((C6386q0) null);
        this.f744i.f665t = null;
    }

    /* renamed from: d */
    public final void mo957d() {
        this.f744i.f662q.setVisibility(0);
        if (this.f744i.f662q.getParent() instanceof View) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6341h.m15083c((View) this.f744i.f662q.getParent());
        }
    }
}
