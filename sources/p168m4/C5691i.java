package p168m4;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.InputSource;
import p043ch.qos.logback.core.joran.spi.JoranException;
import p180n4.C5855d;
import p180n4.C5856e;
import p193o4.C5980f;
import p193o4.C5982h;
import p583jk.C17875h;

/* renamed from: m4.i */
public class C5691i extends C5683a {

    /* renamed from: g */
    public int f18482g = 2;

    /* renamed from: w */
    public static void m13987w(C5856e eVar) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        ArrayList arrayList = eVar.f18845c;
        if (arrayList.size() != 0) {
            C5855d dVar = (C5855d) arrayList.get(0);
            if (dVar != null) {
                if (dVar.f18842b.length() > 0) {
                    str2 = dVar.f18842b;
                } else {
                    str2 = dVar.f18841a;
                }
                z = "included".equalsIgnoreCase(str2);
                z2 = "configuration".equalsIgnoreCase(str2);
            } else {
                z2 = false;
                z = false;
            }
            if (z || z2) {
                arrayList.remove(0);
                int size = arrayList.size();
                if (size != 0) {
                    int i = size - 1;
                    C5855d dVar2 = (C5855d) arrayList.get(i);
                    if (dVar2 != null) {
                        if (dVar2.f18842b.length() > 0) {
                            str = dVar2.f18842b;
                        } else {
                            str = dVar2.f18841a;
                        }
                        if ((z && "included".equalsIgnoreCase(str)) || (z2 && "configuration".equalsIgnoreCase(str))) {
                            arrayList.remove(i);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public final void mo21537u(C5982h hVar, URL url) throws JoranException {
        InputStream inputStream;
        try {
            inputStream = FirebasePerfUrlConnection.openStream(url);
        } catch (IOException e) {
            StringBuilder k = C13555b.m33972k("Failed to open [");
            k.append(url.toString());
            k.append("]");
            mo21536t(k.toString(), e);
            inputStream = null;
        }
        if (inputStream != null) {
            try {
                C17875h.m44298e(this.f20771c, url);
                C5856e v = mo21541v();
                v.mo20064b(this.f20771c);
                v.mo21723c(new InputSource(inputStream));
                m13987w(v);
                C5980f fVar = hVar.f19133h.f19143g;
                ((List) fVar.f19127c).addAll(fVar.f19125a + this.f18482g, v.f18845c);
            } catch (JoranException e2) {
                mo21536t("Failed processing [" + url.toString() + "]", e2);
            } catch (Throwable th) {
                C5683a.m13969q(inputStream);
                throw th;
            }
        }
        C5683a.m13969q(inputStream);
    }

    /* renamed from: v */
    public C5856e mo21541v() {
        return new C5856e(this.f20771c);
    }
}
