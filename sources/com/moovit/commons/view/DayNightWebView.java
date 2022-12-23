package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import p057d3.C4338b;
import p584jl.C17885a;

public class DayNightWebView extends WebView {
    public DayNightWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DayNightWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (C17885a.m44438f0("FORCE_DARK")) {
            int i2 = getResources().getConfiguration().uiMode & 48;
            if (i2 == 0 || i2 == 16) {
                C4338b.m11477a(getSettings(), 0);
            } else if (i2 == 32) {
                C4338b.m11477a(getSettings(), 2);
            }
        }
    }
}
