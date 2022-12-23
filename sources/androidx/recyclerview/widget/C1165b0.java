package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b0 */
public class C1165b0 extends C1187h0 {

    /* renamed from: c */
    public C1248y f4435c;

    /* renamed from: d */
    public C1247x f4436d;

    /* renamed from: e */
    public static int m3198e(View view, C1249z zVar) {
        return ((zVar.mo5167c(view) / 2) + zVar.mo5169e(view)) - ((zVar.mo5176l() / 2) + zVar.mo5175k());
    }

    /* renamed from: f */
    public static View m3199f(RecyclerView.C1134m mVar, C1249z zVar) {
        int childCount = mVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l = (zVar.mo5176l() / 2) + zVar.mo5175k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = mVar.getChildAt(i2);
            int abs = Math.abs(((zVar.mo5167c(childAt) / 2) + zVar.mo5169e(childAt)) - l);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: b */
    public final int[] mo5015b(RecyclerView.C1134m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.canScrollHorizontally()) {
            iArr[0] = m3198e(view, mo5017g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.canScrollVertically()) {
            iArr[1] = m3198e(view, mo5018h(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: c */
    public View mo5016c(RecyclerView.C1134m mVar) {
        if (mVar.canScrollVertically()) {
            return m3199f(mVar, mo5018h(mVar));
        }
        if (mVar.canScrollHorizontally()) {
            return m3199f(mVar, mo5017g(mVar));
        }
        return null;
    }

    /* renamed from: g */
    public final C1249z mo5017g(RecyclerView.C1134m mVar) {
        C1247x xVar = this.f4436d;
        if (xVar == null || xVar.f4699a != mVar) {
            this.f4436d = new C1247x(mVar);
        }
        return this.f4436d;
    }

    /* renamed from: h */
    public final C1249z mo5018h(RecyclerView.C1134m mVar) {
        C1248y yVar = this.f4435c;
        if (yVar == null || yVar.f4699a != mVar) {
            this.f4435c = new C1248y(mVar);
        }
        return this.f4435c;
    }
}
