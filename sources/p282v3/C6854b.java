package p282v3;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p043ch.qos.logback.core.joran.spi.JoranException;
import p066e0.C4436j0;
import p070e4.C4548c;
import p180n4.C5855d;
import p193o4.C5976b;
import p257t3.C6557a;
import p271u4.C6693d;
import p283v4.C6859d;
import p583jk.C17875h;

/* renamed from: v3.b */
public final class C6854b extends C6693d implements Runnable {

    /* renamed from: e */
    public long f21205e = System.currentTimeMillis();

    /* renamed from: m */
    public final void mo23100m(C6557a aVar, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5855d dVar = (C5855d) it.next();
                if (!"include".equalsIgnoreCase(dVar.f18841a)) {
                    arrayList.add(dVar);
                }
            }
        }
        C6853a aVar2 = new C6853a();
        aVar2.mo20064b(this.f20771c);
        C5976b x = C17875h.m44313x(this.f20771c);
        x.getClass();
        C5976b bVar = new C5976b();
        bVar.f19121e = x.f19121e;
        bVar.f19122f = new ArrayList(x.f19122f);
        bVar.f19123g = new ArrayList(x.f19123g);
        if (arrayList.isEmpty()) {
            mo22867k("No previous configuration to fall back on.");
            return;
        }
        mo22867k("Given previous errors, falling back to previously registered safe configuration.");
        try {
            aVar.mo22672i();
            this.f20771c.mo20060c(bVar, "CONFIGURATION_WATCH_LIST");
            aVar2.mo21423s(arrayList);
            mo22865i("Re-registering previous fallback configuration once more as a fallback configuration point");
            aVar2.f20771c.mo20060c(list, "SAFE_JORAN_CONFIGURATION");
            mo22865i("after registerSafeConfiguration: " + list);
        } catch (JoranException e) {
            mo21727f("Unexpected exception thrown by a configuration considered safe.", e);
        }
    }

    public final void run() {
        boolean z;
        C5976b x = C17875h.m44313x(this.f20771c);
        if (x == null) {
            mo22867k("Empty ConfigurationWatchList in context");
        } else if (new ArrayList(x.f19122f).isEmpty()) {
            mo22865i("Empty watch file list. Disabling ");
        } else {
            int size = x.f19122f.size();
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                } else if (((Long) x.f19123g.get(i)).longValue() != ((File) x.f19122f.get(i)).lastModified()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                URL url = x.f19121e;
                mo22865i("Detected change in configuration files.");
                mo22865i("Will reset and reconfigure context named [" + this.f20771c.f15675c + "]");
                C6557a aVar = (C6557a) this.f20771c;
                if (url.toString().endsWith("xml")) {
                    C6853a aVar2 = new C6853a();
                    aVar2.mo20064b(this.f20771c);
                    C4548c cVar = this.f20771c.f15676d;
                    List list = (List) aVar2.f20771c.mo20059b("SAFE_JORAN_CONFIGURATION");
                    C17875h.m44313x(this.f20771c);
                    aVar.mo22672i();
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        aVar2.mo21422r(url);
                        ArrayList f = C4436j0.m11622f(currentTimeMillis, cVar.mo20058c());
                        Pattern compile = Pattern.compile("XML_PARSING");
                        Iterator it = f.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C6859d dVar = (C6859d) it.next();
                            if (2 == dVar.mo23112b()) {
                                if (compile.matcher(dVar.getMessage()).lookingAt()) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        if (z2) {
                            mo23100m(aVar, list);
                        }
                    } catch (JoranException unused) {
                        mo23100m(aVar, list);
                    }
                } else if (url.toString().endsWith("groovy")) {
                    mo21722a("Groovy classes are not available on the class path. ABORTING INITIALIZATION.");
                }
            }
        }
    }

    public final String toString() {
        return C25541a.m63884o(C13555b.m33972k("ReconfigureOnChangeTask(born:"), this.f21205e, ")");
    }
}
