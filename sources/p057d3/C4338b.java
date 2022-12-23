package p057d3;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p069e3.C4528a;
import p069e3.C4539d;
import p069e3.C4540e;
import yi0.C25328a;

/* renamed from: d3.b */
public final class C4338b {
    @Deprecated
    /* renamed from: a */
    public static void m11477a(WebSettings webSettings, int i) {
        C4528a.C4532d dVar = C4539d.f15655a;
        dVar.getClass();
        if (dVar.mo20044d()) {
            ((WebSettingsBoundaryInterface) C25328a.m63628a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) C4540e.C4541a.f15657a.f3985a).convertSettings(webSettings))).setForceDark(i);
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
