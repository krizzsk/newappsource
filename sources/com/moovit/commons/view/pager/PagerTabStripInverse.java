package com.moovit.commons.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import p622kz.C18159a;

public class PagerTabStripInverse extends PagerTabStrip {
    public PagerTabStripInverse(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getPagerTabTextViewStripStyle() {
        return C18159a.pagerTabStripTextViewTabStyleInverse;
    }

    public PagerTabStripInverse(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
