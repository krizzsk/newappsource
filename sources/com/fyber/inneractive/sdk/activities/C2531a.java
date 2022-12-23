package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.network.C2931r;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3677d0;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3726r0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.activities.a */
public class C2531a extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ InneractiveInternalBrowserActivity f9019a;

    public C2531a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.f9019a = inneractiveInternalBrowserActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        Drawable drawable;
        Drawable drawable2;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            drawable = C3707l.m9971d(C2524R.C2525drawable.ia_ib_left_arrow);
        } else {
            drawable = C3707l.m9971d(C2524R.C2525drawable.ia_ib_unleft_arrow);
        }
        this.f9019a.f9010e.setImageDrawable(drawable);
        if (webView.canGoForward()) {
            drawable2 = C3707l.m9971d(C2524R.C2525drawable.ia_ib_right_arrow);
        } else {
            drawable2 = C3707l.m9971d(C2524R.C2525drawable.ia_ib_unright_arrow);
        }
        this.f9019a.f9011f.setImageDrawable(drawable2);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f9019a.f9011f.setImageDrawable(C3707l.m9971d(C2524R.C2525drawable.ia_ib_unright_arrow));
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m9906e("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C2931r.m7253a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", (InneractiveAdRequest) null, (C3648e) null);
        this.f9019a.finish();
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InneractiveAdRequest inneractiveAdRequest;
        C3648e eVar;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C3726r0.m9985a(str)) {
            this.f9019a.f9009d.loadUrl("chrome://crash");
            return true;
        }
        C3677d0.C3678a a = C3677d0.m9920a(this.f9019a.getApplicationContext(), str, true, C3677d0.C3681d.DO_NOT_OPEN_IN_INTERNAL_BROWSER, this.f9019a.f9007b);
        if (a.f12835a == C3677d0.C3680c.FAILED) {
            return !str.startsWith("http");
        }
        InneractiveInternalBrowserActivity.InternalBrowserListener internalBrowserListener = InneractiveInternalBrowserActivity.f9005j;
        if (internalBrowserListener != null) {
            internalBrowserListener.onApplicationInBackground();
        }
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.f9019a;
        if (!inneractiveInternalBrowserActivity.f9014i) {
            boolean unused = inneractiveInternalBrowserActivity.f9014i = true;
            C2924p pVar = C2924p.FYBER_SUCCESS_CLICK;
            C2776j jVar = this.f9019a.f9006a;
            if (jVar != null) {
                inneractiveAdRequest = jVar.f9590a;
            } else {
                inneractiveAdRequest = null;
            }
            if (jVar != null) {
                eVar = jVar.mo13293c();
            } else {
                eVar = null;
            }
            C2926q.C2927a aVar = new C2926q.C2927a(eVar);
            aVar.f10042c = pVar;
            aVar.f10040a = inneractiveAdRequest;
            aVar.f10043d = null;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", str);
            } catch (Exception unused2) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "url", str);
            }
            String str2 = a.f12835a.toString();
            try {
                jSONObject.put("opened_from", str2);
            } catch (Exception unused3) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "opened_from", str2);
            }
            try {
                jSONObject.put("opened_by", "internal_browser");
            } catch (Exception unused4) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "opened_by", "internal_browser");
            }
            aVar.f10045f.put(jSONObject);
            aVar.mo13717a((String) null);
        }
        this.f9019a.finish();
        return true;
    }
}
