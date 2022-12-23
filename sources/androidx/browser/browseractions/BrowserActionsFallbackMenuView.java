package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p240s.C6300a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b */
    public final int f1675b = getResources().getDimensionPixelOffset(C6300a.browser_actions_context_menu_min_padding);

    /* renamed from: c */
    public final int f1676c = getResources().getDimensionPixelOffset(C6300a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1675b * 2), this.f1676c), 1073741824), i2);
    }
}
