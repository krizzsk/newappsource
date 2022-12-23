package p283v4;

import java.util.Iterator;
import p271u4.C6693d;
import p271u4.C6695f;
import p296w4.C6993i;

/* renamed from: v4.c */
public final class C6858c extends C6693d implements C6861f, C6695f {

    /* renamed from: e */
    public boolean f21210e = false;

    /* renamed from: c */
    public final void mo23110c(C6860e eVar) {
        if (this.f21210e) {
            StringBuilder sb = new StringBuilder();
            C6993i.m16476a(sb, "", eVar);
            System.out.print(sb);
        }
    }

    public final boolean isStarted() {
        return this.f21210e;
    }

    public final void start() {
        boolean z;
        this.f21210e = true;
        if (this.f20771c != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = this.f20771c.f15676d.mo20058c().iterator();
            while (it.hasNext()) {
                C6859d dVar = (C6859d) it.next();
                if (currentTimeMillis - dVar.mo23111a().longValue() < 300) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    C6993i.m16476a(sb, "", dVar);
                    System.out.print(sb);
                }
            }
        }
    }

    public final void stop() {
        this.f21210e = false;
    }
}
