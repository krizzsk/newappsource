package xd0;

import android.webkit.JavascriptInterface;
import yd0.C25287b;

/* renamed from: xd0.c */
public final class C25244c {

    /* renamed from: a */
    public C25245a f63519a;

    /* renamed from: xd0.c$a */
    public interface C25245a {
        /* renamed from: m */
        void mo61870m(String str);
    }

    public C25244c(C25287b bVar) {
        this.f63519a = bVar;
    }

    @JavascriptInterface
    public void performAction(String str) {
        this.f63519a.mo61870m(str);
    }
}
