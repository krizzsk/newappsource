package com.vungle.warren.p979ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.vungle.warren.ui.view.MediaView */
public class MediaView extends RelativeLayout {

    /* renamed from: b */
    public ImageView f58970b;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo58339a(context);
    }

    /* renamed from: a */
    public final void mo58339a(Context context) {
        this.f58970b = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f58970b.setLayoutParams(layoutParams);
        this.f58970b.setAdjustViewBounds(true);
        addView(this.f58970b);
        requestLayout();
    }

    public ImageView getMainImage() {
        if (this.f58970b == null) {
            mo58339a(getContext());
        }
        return this.f58970b;
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo58339a(context);
    }
}
