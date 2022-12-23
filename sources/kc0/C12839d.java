package kc0;

import ac0.C7557a;
import android.webkit.WebView;
import ce0.C21100e;
import ec0.C12632a;
import hc0.C12751a;
import kc0.C12836b;
import p043ch.qos.logback.classic.Logger;
import uh0.C25081h;

/* renamed from: kc0.d */
public final class C12839d extends C12632a {

    /* renamed from: a */
    public final /* synthetic */ C12836b f31719a;

    public C12839d(C12836b bVar) {
        this.f31719a = bVar;
    }

    public final void onProgressChanged(WebView webView, int i) {
        boolean z;
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("HTMLAdWebViewListener: Progress");
        J0.append(this.f31719a.f31715l);
        J0.append(": [");
        J0.append(i);
        J0.append(']');
        logger.mo6672i(J0.toString());
        C12836b bVar = this.f31719a;
        if (!bVar.f31714k && i == 100) {
            if (C25081h.m62830A(bVar.getUrl(), "about:blank", false) || (this.f31719a.getBannerUrl() != null && C25081h.m62830A(this.f31719a.getUrl(), this.f31719a.getBannerUrl(), false))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C12836b bVar2 = this.f31719a;
                if (!bVar2.f31713j) {
                    bVar2.mo39657d(false);
                    bVar2.f31714k = true;
                    C12836b.C12837a aVar = bVar2.f31708e;
                    if (aVar != null) {
                        ((C12751a) aVar).mo39547e(bVar2, bVar2.f31707d);
                    }
                }
            }
        }
        super.onProgressChanged(webView, i);
    }
}
