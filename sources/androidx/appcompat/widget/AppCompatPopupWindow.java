package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0798j;
import p114i.C5224j;
import p127j.C5344a;

class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1553a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    public final void mo1553a(Context context, AttributeSet attributeSet, int i, int i2) {
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5224j.PopupWindow, i, i2);
        int i3 = C5224j.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i3)) {
            C0798j.m2412a(this, obtainStyledAttributes.getBoolean(i3, false));
        }
        int i4 = C5224j.PopupWindow_android_popupBackground;
        if (!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i4);
        } else {
            drawable = C5344a.m13397a(context, resourceId);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo1553a(context, attributeSet, i, i2);
    }
}
