package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import p114i.C5215a;
import p114i.C5216b;
import p114i.C5218d;
import p114i.C5224j;

/* renamed from: androidx.appcompat.widget.a1 */
public final class C0383a1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: androidx.appcompat.widget.a1$a */
    public class C0384a extends LinearLayout {
        public C0384a() {
            throw null;
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            throw null;
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C5224j.ActionBar, C5215a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C5224j.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(C5216b.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C5218d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        context.getResources().getDimensionPixelSize(C5218d.abc_action_bar_stacked_tab_max_width);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0384a) view).getClass();
        throw null;
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        throw null;
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
    }

    public void setContentHeight(int i) {
        requestLayout();
    }

    public void setTabSelected(int i) {
        throw null;
    }
}
