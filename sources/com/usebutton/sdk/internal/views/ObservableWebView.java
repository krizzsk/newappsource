package com.usebutton.sdk.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;

public class ObservableWebView extends WebView {
    private OnScrollChangeListener onScrollChangeListener;

    public interface OnScrollChangeListener {
        void onScrollChange(View view, int i, int i2, int i3, int i4);
    }

    public ObservableWebView(Context context) {
        super(context);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangeListener onScrollChangeListener2 = this.onScrollChangeListener;
        if (onScrollChangeListener2 != null) {
            onScrollChangeListener2.onScrollChange(this, i, i2, i3, i4);
        }
    }

    public void setCustomOnScrollChangeListener(OnScrollChangeListener onScrollChangeListener2) {
        this.onScrollChangeListener = onScrollChangeListener2;
    }

    public ObservableWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObservableWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
