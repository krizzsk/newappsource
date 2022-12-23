package p463ei;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p361ai.C13469d;
import p407ci.C13836a;
import p439di.C16670b;
import p959zh.C20849b;
import p959zh.C20850c;
import p959zh.C20851d;

/* renamed from: ei.b */
public final class C16828b extends AdSessionStatePublisher {

    /* renamed from: d */
    public WebView f43805d;

    /* renamed from: e */
    public Long f43806e = null;

    /* renamed from: f */
    public final Map<String, C20850c> f43807f;

    /* renamed from: g */
    public final String f43808g;

    /* renamed from: ei.b$a */
    public class C16829a implements Runnable {

        /* renamed from: b */
        public final WebView f43809b;

        public C16829a(C16828b bVar) {
            this.f43809b = bVar.f43805d;
        }

        public final void run() {
            this.f43809b.destroy();
        }
    }

    public C16828b(Map<String, C20850c> map, String str) {
        this.f43807f = map;
        this.f43808g = str;
    }

    /* renamed from: a */
    public final void mo44199a() {
        WebView webView = new WebView(C13469d.f33339b.f33340a);
        this.f43805d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f36941a = new C16670b(this.f43805d);
        WebView webView2 = this.f43805d;
        String str = this.f43808g;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        Iterator<String> it = this.f43807f.keySet().iterator();
        if (!it.hasNext()) {
            this.f43806e = Long.valueOf(System.nanoTime());
            return;
        }
        this.f43807f.get(it.next()).getClass();
        throw null;
    }

    /* renamed from: c */
    public final void mo44201c(C20851d dVar, C20849b bVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(bVar.f52586d);
        for (String str : unmodifiableMap.keySet()) {
            C13836a.m34520c(jSONObject, str, (C20850c) unmodifiableMap.get(str));
        }
        mo44202d(dVar, bVar, jSONObject);
    }

    /* renamed from: e */
    public final void mo44203e() {
        long j;
        super.mo44203e();
        if (this.f43806e == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f43806e.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new C16829a(this), Math.max(4000 - j, 2000));
        this.f43805d = null;
    }
}
