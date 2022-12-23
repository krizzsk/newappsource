package com.fyber.inneractive.sdk.web;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.m */
public class C3784m extends WebChromeClient {
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IAlog.m9905d("%s onConsoleMessage: %s", "IAwebChromeClient", consoleMessage.message());
        if (IAlog.f12814a >= 1) {
            IAlog.m9900a(1, (Exception) null, consoleMessage.message().replaceAll("%", "%%"), "VPAID");
        }
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m9905d("%sonJsAlert: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m9905d("%sonJsBeforeUnload: %s", "IAwebChromeClient", str2);
        jsResult.confirm();
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m9905d("%sonJsConfirm: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IAlog.m9905d("%sonJsPrompt: %s", "IAwebChromeClient", str2);
        jsPromptResult.cancel();
        return true;
    }
}
