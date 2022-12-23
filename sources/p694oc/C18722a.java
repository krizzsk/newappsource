package p694oc;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.C14096a;
import p355ac.C13403d;
import p355ac.C13407h;

/* renamed from: oc.a */
public final class C18722a extends C14096a {
    public C18722a(Context context) {
        super(context);
    }

    public final int getItemDefaultMarginResId() {
        return C13403d.mtrl_navigation_rail_icon_margin;
    }

    public final int getItemLayoutResId() {
        return C13407h.mtrl_navigation_rail_item;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}
