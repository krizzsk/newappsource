package qd0;

import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23538f;
import java.io.IOException;

/* renamed from: qd0.c */
public final class C24727c implements C23538f {

    /* renamed from: b */
    public final /* synthetic */ C24726b f62591b;

    /* renamed from: c */
    public final /* synthetic */ C24728d f62592c;

    public C24727c(C24728d dVar, C24726b bVar) {
        this.f62592c = dVar;
        this.f62591b = bVar;
    }

    /* renamed from: c */
    public final void mo5762c(C23534e eVar, IOException iOException) {
        try {
            this.f62591b.onFailure(iOException);
        } catch (Throwable unused) {
            int i = C24728d.f62593c;
        }
    }

    /* renamed from: d */
    public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
        try {
            try {
                this.f62591b.mo58057a(C24728d.m62218b(c0Var, this.f62592c.f62594a));
            } catch (Throwable unused) {
                int i = C24728d.f62593c;
            }
        } catch (Throwable unused2) {
            int i2 = C24728d.f62593c;
        }
    }
}
