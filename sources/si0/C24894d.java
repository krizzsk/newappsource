package si0;

import bf0.C21050d;
import java.io.IOException;
import mf0.C24362h;

/* renamed from: si0.d */
public final class C24894d implements C24893c0 {

    /* renamed from: b */
    public final /* synthetic */ C24888b f62940b;

    /* renamed from: c */
    public final /* synthetic */ C24893c0 f62941c;

    public C24894d(C24891b0 b0Var, C24910q qVar) {
        this.f62940b = b0Var;
        this.f62941c = qVar;
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return this.f62940b;
    }

    public final void close() {
        C24888b bVar = this.f62940b;
        bVar.mo61362h();
        try {
            this.f62941c.close();
            C21050d dVar = C21050d.f52856a;
            if (bVar.mo61363i()) {
                throw bVar.mo60787j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (bVar.mo61363i()) {
                e = bVar.mo60787j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.mo61363i();
        }
    }

    /* renamed from: m */
    public final long mo53601m(C24898f fVar, long j) {
        C24362h.m61211f(fVar, "sink");
        C24888b bVar = this.f62940b;
        bVar.mo61362h();
        try {
            long m = this.f62941c.mo53601m(fVar, j);
            if (!bVar.mo61363i()) {
                return m;
            }
            throw bVar.mo60787j((IOException) null);
        } catch (IOException e) {
            e = e;
            if (bVar.mo61363i()) {
                e = bVar.mo60787j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.mo61363i();
        }
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AsyncTimeout.source(");
        k.append(this.f62941c);
        k.append(')');
        return k.toString();
    }
}
