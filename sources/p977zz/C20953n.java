package p977zz;

import android.webkit.CookieManager;
import com.veriff.sdk.camera.core.ImageCapture;

/* renamed from: zz.n */
public final /* synthetic */ class C20953n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f52703b;

    public /* synthetic */ C20953n(int i) {
        this.f52703b = i;
    }

    public final void run() {
        switch (this.f52703b) {
            case 0:
                try {
                    CookieManager.getInstance().flush();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                ImageCapture.lambda$triggerAf$17();
                return;
        }
    }
}
