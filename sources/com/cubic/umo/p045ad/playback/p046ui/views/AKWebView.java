package com.cubic.umo.p045ad.playback.p046ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo59060d2 = {"Lcom/cubic/umo/ad/playback/ui/views/AKWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.playback.ui.views.AKWebView */
public class AKWebView extends WebView {

    /* renamed from: b */
    public boolean f7338b;

    /* renamed from: c */
    public boolean f7339c;

    public AKWebView(Context context) {
        super(context);
        mo11146a();
        if (!this.f7338b) {
            C24362h.m61210e(getContext(), AppActionRequest.KEY_CONTEXT);
            this.f7338b = true;
        }
        setBackgroundColor(0);
    }

    /* renamed from: a */
    public final void mo11146a() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: b */
    public final void mo11147b() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAppCacheEnabled(true);
        getSettings().setAppCachePath(getContext().getCacheDir().getAbsolutePath());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void destroy() {
        if (!this.f7339c) {
            this.f7339c = true;
            if (getParent() != null && (getParent() instanceof ViewGroup)) {
                ViewParent parent = getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            removeAllViews();
            super.destroy();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C24362h.m61208c(context);
        mo11146a();
        if (!this.f7338b) {
            C24362h.m61210e(getContext(), AppActionRequest.KEY_CONTEXT);
            this.f7338b = true;
        }
        setBackgroundColor(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AKWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C24362h.m61208c(context);
        mo11146a();
        if (!this.f7338b) {
            C24362h.m61210e(getContext(), AppActionRequest.KEY_CONTEXT);
            this.f7338b = true;
        }
        setBackgroundColor(0);
    }
}
