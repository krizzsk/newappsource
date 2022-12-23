package ic0;

import android.webkit.WebView;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity;
import ec0.C12632a;
import nc0.C12950a;
import wb0.C13233c;

/* renamed from: ic0.a */
public final class C12771a extends C12632a {

    /* renamed from: a */
    public final /* synthetic */ AKBrowserActivity f31564a;

    public C12771a(AKBrowserActivity aKBrowserActivity) {
        this.f31564a = aKBrowserActivity;
    }

    public final void onProgressChanged(WebView webView, int i) {
        if (i >= 75) {
            C13233c.f32843b.post(new C12950a(this.f31564a.f7316C, false));
        }
        super.onProgressChanged(webView, i);
    }
}
