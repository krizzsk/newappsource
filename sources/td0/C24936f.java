package td0;

import ce0.C21105j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.C0016g;
import td0.C24927a;

/* renamed from: td0.f */
public final class C24936f implements C24932c, C24927a.C24930c {

    /* renamed from: a */
    public C24927a f63025a;

    public C24936f(C24927a aVar) {
        this.f63025a = aVar;
        synchronized (aVar) {
            aVar.mo61481a();
            aVar.f63009c.add(this);
            if (aVar.f63012f) {
                mo58065b();
            }
        }
        mo61491e();
        List<Class<?>> list = C21105j.f52950a;
    }

    /* renamed from: a */
    public final void mo61488a() {
        C24927a aVar = this.f63025a;
        if (aVar != null && aVar.mo61483c() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f63025a.mo61483c().getPath());
            File file = new File(C0016g.m31o(sb, File.separator, "vungle"));
            if (file.exists()) {
                try {
                    C21105j.m49397b(file);
                } catch (IOException e) {
                    e.getLocalizedMessage();
                }
            }
            if (!file.exists()) {
                file.mkdir();
            }
        }
    }

    /* renamed from: b */
    public final void mo58065b() {
        ArrayList arrayList;
        C24927a aVar = this.f63025a;
        if (aVar != null) {
            synchronized (aVar) {
                aVar.mo61481a();
                arrayList = aVar.f63011e;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                try {
                    C21105j.m49397b(new File(file.getPath() + File.separator + "vungle"));
                } catch (IOException e) {
                    e.getLocalizedMessage();
                }
            }
        }
    }

    /* renamed from: c */
    public final File mo61489c(String str) throws IllegalStateException {
        StringBuilder sb = new StringBuilder();
        sb.append(mo61491e().getPath());
        File file = new File(C0016g.m31o(sb, File.separator, str));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: d */
    public final void mo61490d(String str) throws IOException, IllegalStateException {
        File[] listFiles = mo61491e().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory() && file.getName().equals(str)) {
                    C21105j.m49397b(file);
                }
            }
        }
    }

    /* renamed from: e */
    public final File mo61491e() throws IllegalStateException {
        if (this.f63025a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f63025a.mo61483c());
            File file = new File(C0016g.m31o(sb, File.separator, "vungle"));
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }
        throw new IllegalStateException("Context has expired, cannot continue.");
    }
}
