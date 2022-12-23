package p840uh;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p699oh.C18751d;
import p699oh.C18753f;
import p699oh.C18754g;
import p746qh.C19124d;
import p792sh.C19461a;
import p816th.C19681b;

/* renamed from: uh.b */
public final class C19913b extends AdSessionStatePublisher {

    /* renamed from: f */
    public WebView f50563f;

    /* renamed from: g */
    public Long f50564g = null;

    /* renamed from: h */
    public final Map<String, C18753f> f50565h;

    /* renamed from: i */
    public final String f50566i;

    /* renamed from: uh.b$a */
    public class C19914a implements Runnable {

        /* renamed from: b */
        public final WebView f50567b;

        public C19914a(C19913b bVar) {
            this.f50567b = bVar.f50563f;
        }

        public final void run() {
            this.f50567b.destroy();
        }
    }

    public C19913b(Map<String, C18753f> map, String str) {
        this.f50565h = map;
        this.f50566i = str;
    }

    /* renamed from: a */
    public final void mo44186a() {
        WebView webView = new WebView(C19124d.f48618b.f48619a);
        this.f50563f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f36928a = new C19681b(this.f50563f);
        WebView webView2 = this.f50563f;
        String str = this.f50566i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String next : this.f50565h.keySet()) {
            String externalForm = this.f50565h.get(next).f47708b.toExternalForm();
            WebView webView3 = this.f50563f;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f50564g = Long.valueOf(System.nanoTime());
    }

    /* renamed from: d */
    public final void mo44189d(C18754g gVar, C18751d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(dVar.f47700d);
        for (String str : unmodifiableMap.keySet()) {
            C19461a.m46861c(jSONObject, str, (C18753f) unmodifiableMap.get(str));
        }
        mo44190e(gVar, dVar, jSONObject);
    }

    /* renamed from: f */
    public final void mo44191f() {
        long j;
        super.mo44191f();
        if (this.f50564g == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f50564g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new C19914a(this), Math.max(4000 - j, 2000));
        this.f50563f = null;
    }
}
