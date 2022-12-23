package com.usebutton.sdk.internal.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.util.ButtonLog;

public class PopupWebView extends FrameLayout {
    private static final String TAG = "ButtonPopupWebView";
    private View mBackground;
    /* access modifiers changed from: private */
    public final OnPopupClosedListener mListener;
    private WebView mWebView;

    public interface OnPopupClosedListener {
        void onPopupClosed();
    }

    public PopupWebView(Context context, OnPopupClosedListener onPopupClosedListener) {
        super(context);
        this.mListener = onPopupClosedListener;
        initPopup();
    }

    /* access modifiers changed from: private */
    public void destroyWebView() {
        ((ViewGroup) this.mWebView.getParent()).removeView(this.mWebView);
        this.mWebView.stopLoading();
        this.mWebView.destroy();
        this.mWebView = null;
    }

    private void initPopup() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C12238R.layout.btn_web_view_popup, this, true);
        this.mBackground = findViewById(C12238R.C12240id.web_popup_background);
        WebView webView = (WebView) findViewById(C12238R.C12240id.web_popup_web_view);
        this.mWebView = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.getSettings().setUserAgentString(this.mWebView.getSettings().getUserAgentString().replaceAll("((?=Version)(.*)(?=Chrome))|(wv)", ""));
        this.mWebView.setWebViewClient(new WebViewClient());
        this.mWebView.setWebChromeClient(new WebChromeClient() {
            public void onCloseWindow(WebView webView) {
                PopupWebView.this.close();
            }

            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                ButtonLog.verboseFormat(PopupWebView.TAG, "onConsoleMessage %s: %s", consoleMessage.messageLevel().toString(), consoleMessage.message());
                return super.onConsoleMessage(consoleMessage);
            }
        });
    }

    private void open() {
        this.mBackground.startAnimation(AnimationUtils.loadAnimation(getContext(), C12238R.anim.btn_fade_in));
        this.mWebView.startAnimation(AnimationUtils.loadAnimation(getContext(), C12238R.anim.btn_slide_up));
    }

    public void close() {
        this.mBackground.startAnimation(AnimationUtils.loadAnimation(getContext(), C12238R.anim.btn_fade_out));
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C12238R.anim.btn_slide_down);
        loadAnimation.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                PopupWebView.this.destroyWebView();
                if (PopupWebView.this.mListener != null) {
                    PopupWebView.this.mListener.onPopupClosed();
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        this.mWebView.startAnimation(loadAnimation);
    }

    public WebView getWebView() {
        return this.mWebView;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        open();
    }
}
