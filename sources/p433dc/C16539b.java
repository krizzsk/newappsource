package p433dc;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0291f;
import com.google.android.material.navigation.C14096a;
import com.google.android.material.navigation.C14103d;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13403d;

/* renamed from: dc.b */
public final class C16539b extends C14103d {

    /* renamed from: F */
    public final int f43169F;

    /* renamed from: G */
    public final int f43170G;

    /* renamed from: H */
    public final int f43171H;

    /* renamed from: I */
    public final int f43172I;

    /* renamed from: J */
    public boolean f43173J;

    /* renamed from: K */
    public int[] f43174K = new int[5];

    public C16539b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f43169F = resources.getDimensionPixelSize(C13403d.design_bottom_navigation_item_max_width);
        this.f43170G = resources.getDimensionPixelSize(C13403d.design_bottom_navigation_item_min_width);
        this.f43171H = resources.getDimensionPixelSize(C13403d.design_bottom_navigation_active_item_max_width);
        this.f43172I = resources.getDimensionPixelSize(C13403d.design_bottom_navigation_active_item_min_width);
    }

    /* renamed from: e */
    public final C14096a mo42041e(Context context) {
        return new C16538a(context);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6338e.m15063d(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        C0291f menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.mo1118l().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i6 = 1;
        if (!C14103d.m35102f(getLabelVisibilityMode(), size2) || !this.f43173J) {
            if (size2 != 0) {
                i6 = size2;
            }
            int min = Math.min(size / i6, this.f43171H);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.f43174K;
                    iArr[i8] = min;
                    if (i7 > 0) {
                        iArr[i8] = min + 1;
                        i7--;
                    }
                } else {
                    this.f43174K[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i9 = this.f43172I;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f43171H, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i11 = size2 - i3;
            int min2 = Math.min(size - (this.f43170G * i11), Math.min(i9, this.f43171H));
            int i12 = size - min2;
            if (i11 == 0) {
                i4 = 1;
            } else {
                i4 = i11;
            }
            int min3 = Math.min(i12 / i4, this.f43169F);
            int i13 = i12 - (i11 * min3);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() != 8) {
                    int[] iArr2 = this.f43174K;
                    if (i14 == getSelectedItemPosition()) {
                        i5 = min2;
                    } else {
                        i5 = min3;
                    }
                    iArr2[i14] = i5;
                    if (i13 > 0) {
                        int[] iArr3 = this.f43174K;
                        iArr3[i14] = iArr3[i14] + 1;
                        i13--;
                    }
                } else {
                    this.f43174K[i14] = 0;
                }
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f43174K[i16], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i15 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i15, View.MeasureSpec.makeMeasureSpec(i15, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f43173J = z;
    }
}
