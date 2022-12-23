package p718pc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C14077m;
import com.google.android.play.core.assetpacks.C14256d1;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13411l;
import p742qc.C19099c;

/* renamed from: pc.c */
public abstract class C18893c {

    /* renamed from: a */
    public int f48082a;

    /* renamed from: b */
    public int f48083b;

    /* renamed from: c */
    public int[] f48084c = new int[0];

    /* renamed from: d */
    public int f48085d;

    /* renamed from: e */
    public int f48086e;

    /* renamed from: f */
    public int f48087f;

    public C18893c(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C13403d.mtrl_progress_track_thickness);
        TypedArray d = C14077m.m35060d(context, attributeSet, C13411l.BaseProgressIndicator, i, i2, new int[0]);
        this.f48082a = C19099c.m46249c(context, d, C13411l.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f48083b = Math.min(C19099c.m46249c(context, d, C13411l.BaseProgressIndicator_trackCornerRadius, 0), this.f48082a / 2);
        this.f48086e = d.getInt(C13411l.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f48087f = d.getInt(C13411l.BaseProgressIndicator_hideAnimationBehavior, 0);
        int i3 = C13411l.BaseProgressIndicator_indicatorColor;
        if (!d.hasValue(i3)) {
            this.f48084c = new int[]{C14256d1.m35486d(context, C13401b.colorPrimary, -1)};
        } else if (d.peekValue(i3).type != 1) {
            this.f48084c = new int[]{d.getColor(i3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(d.getResourceId(i3, -1));
            this.f48084c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        int i4 = C13411l.BaseProgressIndicator_trackColor;
        if (d.hasValue(i4)) {
            this.f48085d = d.getColor(i4, -1);
        } else {
            this.f48085d = this.f48084c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.f48085d = C14256d1.m35483a(this.f48085d, (int) (f * 255.0f));
        }
        d.recycle();
    }

    /* renamed from: a */
    public abstract void mo42099a();
}
