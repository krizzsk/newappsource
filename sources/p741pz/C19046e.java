package p741pz;

import android.content.Context;
import ce0.C21100e;
import p810sz.C19589j;
import p810sz.C19600l;

/* renamed from: pz.e */
public abstract class C19046e<T> extends C19043b<T> {

    /* renamed from: c */
    public final C19600l<? super T> f48439c;

    /* renamed from: d */
    public final C19589j<? extends T> f48440d;

    public C19046e(Context context, C19600l<? super T> lVar, C19589j<? extends T> jVar) {
        super(context);
        C21100e.m49373x(lVar, "writer");
        this.f48439c = lVar;
        C21100e.m49373x(jVar, "reader");
        this.f48440d = jVar;
    }
}
