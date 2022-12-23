package com.usebutton.sdk.internal.views;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.webkit.WebView;
import com.usebutton.sdk.internal.views.ObservableWebView;
import com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout;

public class WebViewScrollManager implements ObservableWebView.OnScrollChangeListener {
    /* access modifiers changed from: private */
    public View footer;
    /* access modifiers changed from: private */
    public ViewGroup.MarginLayoutParams footerParams;
    /* access modifiers changed from: private */
    public View header;
    /* access modifiers changed from: private */
    public ViewGroup.MarginLayoutParams headerParams;
    private WebScrollEventListener listener;
    private int previousDeltaY;
    private boolean shouldAnimateHeaderAndFooter;
    private WebView webView;

    public class ReverseInterpolator implements Interpolator {
        public ReverseInterpolator() {
        }

        public float getInterpolation(float f) {
            return Math.abs(f - 1.0f);
        }
    }

    public interface WebScrollEventListener {
        void onFooterReachedBottom();
    }

    public WebViewScrollManager(View view, WebView webView2) {
        this(view, webView2, (View) null, (WebScrollEventListener) null);
    }

    private void adjustMargins(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.headerParams;
        marginLayoutParams.topMargin -= i;
        this.header.setLayoutParams(marginLayoutParams);
        View view = this.footer;
        if (view != null) {
            this.footerParams.bottomMargin = Math.max(-view.getHeight(), Math.min(0, this.footerParams.bottomMargin - i));
            this.footer.setLayoutParams(this.footerParams);
            if (this.footerParams.bottomMargin == (-this.footer.getHeight())) {
                this.shouldAnimateHeaderAndFooter = false;
                this.listener.onFooterReachedBottom();
            }
        }
    }

    private void resetMargins() {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.headerParams;
        marginLayoutParams.topMargin = 0;
        this.header.setLayoutParams(marginLayoutParams);
        View view = this.footer;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = this.footerParams;
            marginLayoutParams2.bottomMargin = 0;
            view.setLayoutParams(marginLayoutParams2);
        }
    }

    public void animateMargins(BottomSheetLayout.State state) {
        if (!this.shouldAnimateHeaderAndFooter) {
            this.shouldAnimateHeaderAndFooter = true;
            return;
        }
        int i = this.headerParams.topMargin;
        if (i == 0 && state != BottomSheetLayout.State.EXPANDED) {
            return;
        }
        if ((i != (-this.header.getHeight()) || state != BottomSheetLayout.State.EXPANDED) && state != BottomSheetLayout.State.PEEKED) {
            if (!(state == BottomSheetLayout.State.HIDDEN && this.headerParams.topMargin == 0) && this.header.getAnimation() == null) {
                C123741 r0 = new Animation() {
                    public void applyTransformation(float f, Transformation transformation) {
                        WebViewScrollManager.this.headerParams.topMargin = (int) (((float) (-WebViewScrollManager.this.header.getHeight())) * f);
                        WebViewScrollManager.this.header.setLayoutParams(WebViewScrollManager.this.headerParams);
                    }
                };
                r0.setDuration(200);
                BottomSheetLayout.State state2 = BottomSheetLayout.State.EXPANDED;
                if (state != state2) {
                    r0.setInterpolator(new ReverseInterpolator());
                }
                this.header.startAnimation(r0);
                C123752 r02 = new Animation() {
                    public void applyTransformation(float f, Transformation transformation) {
                        WebViewScrollManager.this.footerParams.bottomMargin = (int) (((float) (-WebViewScrollManager.this.footer.getHeight())) * f);
                        WebViewScrollManager.this.footer.setLayoutParams(WebViewScrollManager.this.footerParams);
                    }
                };
                r02.setDuration(200);
                if (state != state2) {
                    r02.setInterpolator(new ReverseInterpolator());
                }
                this.footer.startAnimation(r02);
            }
        }
    }

    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int height = this.webView.getHeight() + this.headerParams.topMargin;
        if (this.footer != null) {
            i5 = this.footerParams.bottomMargin;
        } else {
            i5 = 0;
        }
        if (this.webView.getContentHeight() >= height + i5) {
            int i7 = i2 - i4;
            int i8 = this.previousDeltaY;
            if ((i8 <= 0 || i7 >= 0) && (i8 >= 0 || i7 <= 0)) {
                if (i7 > 0 && this.headerParams.topMargin > (-this.header.getHeight())) {
                    if (i7 > this.header.getHeight() + this.headerParams.topMargin) {
                        i7 = this.header.getHeight() + this.headerParams.topMargin;
                    }
                    adjustMargins(i7);
                } else if (i7 < 0 && (i6 = this.headerParams.topMargin) < 0) {
                    if (i7 < i6) {
                        i7 = i6;
                    }
                    adjustMargins(i7);
                }
                this.previousDeltaY = i7;
                return;
            }
            this.previousDeltaY = i7;
        }
    }

    public void reset() {
        if (this.header.getHeight() > 0) {
            resetMargins();
        }
    }

    public WebViewScrollManager(View view, WebView webView2, View view2, WebScrollEventListener webScrollEventListener) {
        this.shouldAnimateHeaderAndFooter = true;
        this.previousDeltaY = 0;
        this.header = view;
        this.webView = webView2;
        this.footer = view2;
        this.listener = webScrollEventListener;
        this.headerParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (view2 != null) {
            this.footerParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        }
    }
}
