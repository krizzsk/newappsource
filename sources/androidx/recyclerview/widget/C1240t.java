package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.recyclerview.widget.t */
public class C1240t extends RecyclerView.C1149w {

    /* renamed from: h */
    public final LinearInterpolator f4683h = new LinearInterpolator();

    /* renamed from: i */
    public final DecelerateInterpolator f4684i = new DecelerateInterpolator();

    /* renamed from: j */
    public PointF f4685j;

    /* renamed from: k */
    public final DisplayMetrics f4686k;

    /* renamed from: l */
    public boolean f4687l = false;

    /* renamed from: m */
    public float f4688m;

    /* renamed from: n */
    public int f4689n = 0;

    /* renamed from: o */
    public int f4690o = 0;

    public C1240t(Context context) {
        this.f4686k = context.getResources().getDisplayMetrics();
    }

    /* renamed from: d */
    public static int m3327d(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: b */
    public void mo4931b(View view, RecyclerView.C1149w.C1150a aVar) {
        int i;
        int i2;
        int i3;
        PointF pointF = this.f4685j;
        int i4 = 0;
        if (pointF == null || pointF.x == BitmapDescriptorFactory.HUE_RED) {
            i = 0;
        } else if (i3 > 0) {
            i = 1;
        } else {
            i = -1;
        }
        RecyclerView.C1134m mVar = this.f4338c;
        if (mVar == null || !mVar.canScrollHorizontally()) {
            i2 = 0;
        } else {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            i2 = m3327d(mVar.getDecoratedLeft(view) - layoutParams.leftMargin, mVar.getDecoratedRight(view) + layoutParams.rightMargin, mVar.getPaddingLeft(), mVar.getWidth() - mVar.getPaddingRight(), i);
        }
        int g = mo5165g();
        RecyclerView.C1134m mVar2 = this.f4338c;
        if (mVar2 != null && mVar2.canScrollVertically()) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
            i4 = m3327d(mVar2.getDecoratedTop(view) - layoutParams2.topMargin, mVar2.getDecoratedBottom(view) + layoutParams2.bottomMargin, mVar2.getPaddingTop(), mVar2.getHeight() - mVar2.getPaddingBottom(), g);
        }
        int ceil = (int) Math.ceil(((double) mo5010f((int) Math.sqrt((double) ((i4 * i4) + (i2 * i2))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f4684i;
            aVar.f4343a = -i2;
            aVar.f4344b = -i4;
            aVar.f4345c = ceil;
            aVar.f4347e = decelerateInterpolator;
            aVar.f4348f = true;
        }
    }

    /* renamed from: e */
    public float mo5009e(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: f */
    public int mo5010f(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f4687l) {
            this.f4688m = mo5009e(this.f4686k);
            this.f4687l = true;
        }
        return (int) Math.ceil((double) (abs * this.f4688m));
    }

    /* renamed from: g */
    public int mo5165g() {
        PointF pointF = this.f4685j;
        if (pointF != null) {
            float f = pointF.y;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                return f > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
            }
        }
        return 0;
    }
}
