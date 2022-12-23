package com.google.android.exoplayer2.p052ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0436m1;
import androidx.appcompat.widget.C0441n1;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;

/* renamed from: com.google.android.exoplayer2.ui.w */
public final /* synthetic */ class C4057w implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f14513b;

    /* renamed from: c */
    public final /* synthetic */ Object f14514c;

    public /* synthetic */ C4057w(Object obj, int i) {
        this.f14513b = i;
        this.f14514c = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i11;
        int i12;
        int i13;
        boolean z;
        switch (this.f14513b) {
            case 0:
                C4060z zVar = (C4060z) this.f14514c;
                int width = (zVar.f14520a.getWidth() - zVar.f14520a.getPaddingLeft()) - zVar.f14520a.getPaddingRight();
                int height = (zVar.f14520a.getHeight() - zVar.f14520a.getPaddingBottom()) - zVar.f14520a.getPaddingTop();
                int d = C4060z.m10921d(zVar.f14522c);
                ViewGroup viewGroup = zVar.f14522c;
                boolean z2 = false;
                if (viewGroup != null) {
                    i9 = zVar.f14522c.getPaddingRight() + viewGroup.getPaddingLeft();
                } else {
                    i9 = 0;
                }
                int i14 = d - i9;
                ViewGroup viewGroup2 = zVar.f14522c;
                if (viewGroup2 == null) {
                    i11 = 0;
                } else {
                    i11 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i11 += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                ViewGroup viewGroup3 = zVar.f14522c;
                if (viewGroup3 != null) {
                    i12 = zVar.f14522c.getPaddingBottom() + viewGroup3.getPaddingTop();
                } else {
                    i12 = 0;
                }
                int i15 = i11 - i12;
                int max = Math.max(i14, C4060z.m10921d(zVar.f14530k) + C4060z.m10921d(zVar.f14528i));
                ViewGroup viewGroup4 = zVar.f14523d;
                if (viewGroup4 == null) {
                    i13 = 0;
                } else {
                    i13 = viewGroup4.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup4.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        i13 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i16 = (i13 * 2) + i15;
                if (width <= max || height <= i16) {
                    z = true;
                } else {
                    z = false;
                }
                if (zVar.f14517A != z) {
                    zVar.f14517A = z;
                    view.post(new C0436m1(zVar, 11));
                }
                if (i3 - i != i7 - i5) {
                    z2 = true;
                }
                if (!zVar.f14517A && z2) {
                    view.post(new C0441n1(zVar, 9));
                    return;
                }
                return;
            default:
                int i17 = LineDetailActivity.f38727y0;
                ((LineDetailActivity) this.f14514c).mo45418J2();
                return;
        }
    }
}
