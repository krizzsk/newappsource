package p588jp;

import android.webkit.WebView;
import p701oj.C18770n;

/* renamed from: jp.c */
public final class C17908c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C17905a f45949b;

    public C17908c(C17905a aVar) {
        this.f45949b = aVar;
    }

    public final void run() {
        WebView webView;
        C18770n nVar = this.f45949b.f45945c;
        if (nVar != null && (webView = nVar.f47771b) != null) {
            webView.resumeTimers();
        }
    }
}
