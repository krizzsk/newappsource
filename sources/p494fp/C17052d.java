package p494fp;

import android.view.View;
import mf0.C24362h;
import p658mo.C18408b;
import p658mo.C18412f;
import p798sn.C19493a;

/* renamed from: fp.d */
public final class C17052d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C18412f f44206b;

    /* renamed from: c */
    public final /* synthetic */ C19493a f44207c;

    public C17052d(C18412f fVar, C19493a aVar) {
        this.f44206b = fVar;
        this.f44207c = aVar;
    }

    public final void onClick(View view) {
        C18408b bVar = this.f44206b.f46964d;
        C24362h.m61210e(view, "it");
        bVar.mo50863b(view.getContext(), this.f44207c);
    }
}
