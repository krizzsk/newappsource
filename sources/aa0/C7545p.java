package aa0;

import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.moovit.util.Text;

/* renamed from: aa0.p */
public final /* synthetic */ class C7545p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ WebView f23029b;

    /* renamed from: c */
    public final /* synthetic */ Text f23030c;

    public /* synthetic */ C7545p(WebView webView, Text text) {
        this.f23029b = webView;
        this.f23030c = text;
    }

    public final void onGlobalLayout() {
        Text.m17954b(this.f23029b, this.f23030c);
    }
}
