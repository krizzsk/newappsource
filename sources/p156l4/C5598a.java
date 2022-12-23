package p156l4;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.xml.sax.InputSource;
import p019b0.C1426c;
import p043ch.qos.logback.core.joran.spi.JoranException;
import p066e0.C4436j0;
import p070e4.C4549d;
import p180n4.C5855d;
import p180n4.C5856e;
import p193o4.C5976b;
import p193o4.C5978d;
import p193o4.C5982h;
import p193o4.C5983i;
import p193o4.C5986l;
import p271u4.C6693d;
import p283v4.C6859d;
import p583jk.C17875h;

/* renamed from: l4.a */
public abstract class C5598a extends C6693d {

    /* renamed from: e */
    public C5983i f18331e;

    /* renamed from: t */
    public static void m13807t(C4549d dVar, URL url) {
        if (dVar != null) {
            C5976b x = C17875h.m44313x(dVar);
            if (x == null) {
                x = new C5976b();
                x.mo20064b(dVar);
                dVar.mo20060c(x, "CONFIGURATION_WATCH_LIST");
            } else {
                x.f19121e = null;
                x.f19123g.clear();
                x.f19122f.clear();
            }
            x.f19121e = url;
            x.mo21961m(url);
        }
    }

    /* renamed from: m */
    public abstract void mo21417m(C1426c cVar);

    /* renamed from: n */
    public abstract void mo21418n(C5983i iVar);

    /* renamed from: o */
    public abstract void mo21419o(C5986l lVar);

    /* renamed from: p */
    public void mo21420p() {
        C5986l lVar = new C5986l(this.f20771c);
        mo21419o(lVar);
        C5983i iVar = new C5983i(this.f20771c, lVar, mo21424u());
        this.f18331e = iVar;
        C5982h hVar = iVar.f19138b;
        hVar.mo20064b(this.f20771c);
        mo21418n(this.f18331e);
        mo21417m(hVar.f19135j);
    }

    /* renamed from: q */
    public final void mo21421q(InputStream inputStream, String str) throws JoranException {
        boolean z;
        InputSource inputSource = new InputSource(inputStream);
        inputSource.setSystemId(str);
        long currentTimeMillis = System.currentTimeMillis();
        C5856e eVar = new C5856e(this.f20771c);
        eVar.mo21723c(inputSource);
        mo21423s(eVar.f18845c);
        ArrayList f = C4436j0.m11622f(currentTimeMillis, this.f20771c.f15676d.mo20058c());
        Pattern compile = Pattern.compile("XML_PARSING");
        Iterator it = f.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C6859d dVar = (C6859d) it.next();
            if (2 == dVar.mo23112b() && compile.matcher(dVar.getMessage()).lookingAt()) {
                z = true;
                break;
            }
        }
        if (!z) {
            mo22865i("Registering current configuration as safe fallback point");
            this.f20771c.mo20060c(eVar.f18845c, "SAFE_JORAN_CONFIGURATION");
        }
    }

    /* renamed from: r */
    public final void mo21422r(URL url) throws JoranException {
        InputStream inputStream = null;
        try {
            m13807t(this.f20771c, url);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            uRLConnection.setUseCaches(false);
            inputStream = uRLConnection.getInputStream();
            mo21421q(inputStream, url.toExternalForm());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        } catch (IOException e) {
            String str = "Could not open URL [" + url + "].";
            mo21727f(str, e);
            throw new JoranException(str, e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: s */
    public void mo21423s(List<C5855d> list) throws JoranException {
        mo21420p();
        synchronized (this.f20771c.f15679g) {
            this.f18331e.f19143g.mo21970a(list);
        }
    }

    /* renamed from: u */
    public C5978d mo21424u() {
        return new C5978d();
    }
}
