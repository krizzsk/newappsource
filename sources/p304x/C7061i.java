package p304x;

import ac0.C7557a;
import android.content.Context;
import android.webkit.WebView;
import ce0.C21100e;
import com.veriff.sdk.camera.camera2.internal.Camera2CameraControlImpl;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import zb0.C13364a;

/* renamed from: x.i */
public final /* synthetic */ class C7061i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f21957b;

    public /* synthetic */ C7061i(int i) {
        this.f21957b = i;
    }

    public final void run() {
        switch (this.f21957b) {
            case 0:
                return;
            case 1:
                Context context = C13364a.f33155a;
                String userAgentString = new WebView(C13364a.f33155a).getSettings().getUserAgentString();
                C24362h.m61210e(userAgentString, "webView.settings.userAgentString");
                C13364a.f33159e = userAgentString;
                if (!C12954d.m32800c(userAgentString)) {
                    C13364a.f33159e = "UNKNOWN_UA";
                }
                C13364a.f33159e += "; " + C13364a.f33156b + '/' + C13364a.f33157c + "; " + C13364a.f33158d;
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("*************** DEVICE_USER_AGENT: ");
                J0.append(C13364a.f33159e);
                J0.append(" ***************");
                logger.mo6672i(J0.toString());
                return;
            default:
                Camera2CameraControlImpl.lambda$addInteropConfig$1();
                return;
        }
    }
}
