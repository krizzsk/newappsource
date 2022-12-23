package p568ir;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: ir.f */
public final class C17643f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ View f45360b;

    /* renamed from: c */
    public final /* synthetic */ View f45361c;

    public C17643f(View view, View view2) {
        this.f45360b = view;
        this.f45361c = view2;
    }

    public final void onGlobalLayout() {
        View view = this.f45360b;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        boolean z = true;
        int i = 0;
        if (!view.canScrollVertically(1) && !this.f45360b.canScrollVertically(-1)) {
            z = false;
        }
        View view2 = this.f45361c;
        if (!z) {
            i = 8;
        }
        view2.setVisibility(i);
    }
}
