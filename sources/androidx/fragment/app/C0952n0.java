package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.fragment.app.n0 */
public final class C0952n0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f3826b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f3827c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f3828d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f3829e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f3830f;

    public C0952n0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f3826b = i;
        this.f3827c = arrayList;
        this.f3828d = arrayList2;
        this.f3829e = arrayList3;
        this.f3830f = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.f3826b; i++) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15105v((View) this.f3827c.get(i), (String) this.f3828d.get(i));
            C6333d0.C6342i.m15105v((View) this.f3829e.get(i), (String) this.f3830f.get(i));
        }
    }
}
