package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
public abstract class C1249z {

    /* renamed from: a */
    public final RecyclerView.C1134m f4699a;

    /* renamed from: b */
    public int f4700b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f4701c = new Rect();

    public C1249z(RecyclerView.C1134m mVar) {
        this.f4699a = mVar;
    }

    /* renamed from: a */
    public static C1249z m3371a(RecyclerView.C1134m mVar, int i) {
        if (i == 0) {
            return new C1247x(mVar);
        }
        if (i == 1) {
            return new C1248y(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo5166b(View view);

    /* renamed from: c */
    public abstract int mo5167c(View view);

    /* renamed from: d */
    public abstract int mo5168d(View view);

    /* renamed from: e */
    public abstract int mo5169e(View view);

    /* renamed from: f */
    public abstract int mo5170f();

    /* renamed from: g */
    public abstract int mo5171g();

    /* renamed from: h */
    public abstract int mo5172h();

    /* renamed from: i */
    public abstract int mo5173i();

    /* renamed from: j */
    public abstract int mo5174j();

    /* renamed from: k */
    public abstract int mo5175k();

    /* renamed from: l */
    public abstract int mo5176l();

    /* renamed from: m */
    public final int mo5180m() {
        if (Integer.MIN_VALUE == this.f4700b) {
            return 0;
        }
        return mo5176l() - this.f4700b;
    }

    /* renamed from: n */
    public abstract int mo5177n(View view);

    /* renamed from: o */
    public abstract int mo5178o(View view);

    /* renamed from: p */
    public abstract void mo5179p(int i);
}
