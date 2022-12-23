package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.a0 */
public final class C1163a0 extends C1240t {

    /* renamed from: p */
    public final /* synthetic */ C1165b0 f4433p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1163a0(C1165b0 b0Var, Context context) {
        super(context);
        this.f4433p = b0Var;
    }

    /* renamed from: b */
    public final void mo4931b(View view, RecyclerView.C1149w.C1150a aVar) {
        C1165b0 b0Var = this.f4433p;
        int[] b = b0Var.mo5015b(b0Var.f4503a.getLayoutManager(), view);
        int i = b[0];
        int i2 = b[1];
        int ceil = (int) Math.ceil(((double) mo5010f(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f4684i;
            aVar.f4343a = i;
            aVar.f4344b = i2;
            aVar.f4345c = ceil;
            aVar.f4347e = decelerateInterpolator;
            aVar.f4348f = true;
        }
    }

    /* renamed from: e */
    public final float mo5009e(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: f */
    public final int mo5010f(int i) {
        return Math.min(100, super.mo5010f(i));
    }
}
