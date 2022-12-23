package p295w3;

import java.net.URL;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p043ch.qos.logback.core.joran.spi.JoranException;
import p168m4.C5691i;
import p180n4.C5856e;
import p193o4.C5982h;
import p295w3.C6972a;

/* renamed from: w3.d */
public final class C6976d extends C5691i {
    public C6976d() {
        this.f18482g = 1;
    }

    /* renamed from: m */
    public final void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException {
    }

    /* renamed from: o */
    public final void mo171o(C5982h hVar, String str) throws ActionException {
        if (!hVar.f19130e.isEmpty() && (hVar.mo21974n() instanceof C6972a.C6973a)) {
            URL url = ((C6972a.C6973a) hVar.mo21975o()).f21737a;
            if (url != null) {
                StringBuilder k = C13555b.m33972k("Path found [");
                k.append(url.toString());
                k.append("]");
                mo22865i(k.toString());
                try {
                    mo21537u(hVar, url);
                } catch (JoranException e) {
                    StringBuilder k2 = C13555b.m33972k("Failed to process include [");
                    k2.append(url.toString());
                    k2.append("]");
                    mo21727f(k2.toString(), e);
                }
            } else {
                mo22865i("No paths found from includes");
            }
        }
    }

    /* renamed from: v */
    public final C5856e mo21541v() {
        return new C5856e(this.f20771c);
    }
}
