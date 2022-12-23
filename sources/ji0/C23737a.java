package ji0;

import hi0.C23522c;
import ii0.C23610d;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import si0.C24893c0;
import si0.C24895d0;
import si0.C24898f;
import si0.C24901h;
import si0.C24902i;
import si0.C24917w;

/* renamed from: ji0.a */
public final class C23737a implements C24893c0 {

    /* renamed from: b */
    public boolean f59962b;

    /* renamed from: c */
    public final /* synthetic */ C24902i f59963c;

    /* renamed from: d */
    public final /* synthetic */ C23739c f59964d;

    /* renamed from: e */
    public final /* synthetic */ C24901h f59965e;

    public C23737a(C24902i iVar, C23522c.C23524b bVar, C24917w wVar) {
        this.f59963c = iVar;
        this.f59964d = bVar;
        this.f59965e = wVar;
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return this.f59963c.mo58974E();
    }

    public final void close() throws IOException {
        boolean z;
        if (!this.f59962b) {
            try {
                z = C23610d.m57810r(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f59962b = true;
                ((C23522c.C23524b) this.f59964d).mo58633a();
            }
        }
        this.f59963c.close();
    }

    /* renamed from: m */
    public final long mo53601m(C24898f fVar, long j) throws IOException {
        try {
            long m = this.f59963c.mo53601m(fVar, j);
            if (m == -1) {
                if (!this.f59962b) {
                    this.f59962b = true;
                    this.f59965e.close();
                }
                return -1;
            }
            fVar.mo61426t(this.f59965e.mo61377D(), fVar.f62947c - m, m);
            this.f59965e.mo61382M();
            return m;
        } catch (IOException e) {
            if (!this.f59962b) {
                this.f59962b = true;
                ((C23522c.C23524b) this.f59964d).mo58633a();
            }
            throw e;
        }
    }
}
