package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.util.u0 */
public class C3733u0 {

    /* renamed from: a */
    public volatile String f12928a = null;

    /* renamed from: b */
    public Context f12929b = null;

    /* renamed from: c */
    public AtomicBoolean f12930c = new AtomicBoolean(false);

    /* renamed from: d */
    public final Runnable f12931d = new C3734a();

    /* renamed from: com.fyber.inneractive.sdk.util.u0$a */
    public class C3734a implements Runnable {
        public C3734a() {
        }

        public void run() {
            C3733u0.this.mo15380e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$b */
    public class C3735b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f12933a;

        public C3735b(String str) {
            this.f12933a = str;
        }

        public void run() {
            C3733u0.this.f12929b.getSharedPreferences("fyber.ua", 0).edit().putString("ua", this.f12933a).apply();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$c */
    public class C3736c implements Runnable {
        public C3736c() {
        }

        public void run() {
            C3733u0 u0Var = C3733u0.this;
            Context context = u0Var.f12929b;
            if (context != null) {
                String str = null;
                try {
                    str = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(str)) {
                    u0Var.mo15376a(str);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.u0$d */
    public class C3737d implements Runnable {
        public C3737d() {
        }

        public void run() {
            C3733u0.this.mo15377b();
        }
    }

    /* renamed from: a */
    public String mo15375a() {
        if (!TextUtils.isEmpty(this.f12928a)) {
            return this.f12928a;
        }
        Runnable runnable = this.f12931d;
        if (runnable != null) {
            Handler handler = C3714n.f12902b;
            handler.removeCallbacks(runnable);
            handler.postDelayed(this.f12931d, 50);
        }
        return System.getProperty("http.agent");
    }

    /* renamed from: b */
    public final void mo15377b() {
        WebView webView;
        String str = null;
        try {
            webView = new WebView(this.f12929b);
            try {
                str = webView.getSettings().getUserAgentString();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            webView = null;
        }
        if (!TextUtils.isEmpty(str)) {
            mo15376a(str);
        }
        if (webView != null) {
            webView.destroy();
        }
    }

    /* renamed from: c */
    public final void mo15378c() {
        if (this.f12929b != null && TextUtils.isEmpty(this.f12928a)) {
            this.f12928a = this.f12929b.getSharedPreferences("fyber.ua", 0).getString("ua", (String) null);
            if (!TextUtils.isEmpty(this.f12928a)) {
                IAlog.m9902a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
                this.f12930c.compareAndSet(false, true);
            }
            mo15380e();
        }
    }

    /* renamed from: d */
    public void mo15379d() {
        Context context;
        mo15378c();
        if (!this.f12930c.get() && (context = this.f12929b) != null) {
            String str = null;
            try {
                str = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                mo15376a(str);
            }
        }
    }

    /* renamed from: e */
    public final void mo15380e() {
        C3714n.m9976a(new C3736c());
    }

    /* renamed from: a */
    public final void mo15376a(String str) {
        this.f12928a = str;
        if (!TextUtils.isEmpty(this.f12928a)) {
            IAlog.m9902a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
            this.f12930c.compareAndSet(false, true);
        }
        C3714n.m9976a(new C3735b(str));
    }
}
