package si0;

import bf0.C21050d;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import mf0.C24362h;
import p584jl.C17885a;

/* renamed from: si0.c */
public final class C24892c implements C24887a0 {

    /* renamed from: b */
    public final /* synthetic */ C24888b f62938b;

    /* renamed from: c */
    public final /* synthetic */ C24887a0 f62939c;

    public C24892c(C24891b0 b0Var, C24915u uVar) {
        this.f62938b = b0Var;
        this.f62939c = uVar;
    }

    /* renamed from: E */
    public final C24895d0 mo60537E() {
        return this.f62938b;
    }

    /* renamed from: P */
    public final void mo58998P(C24898f fVar, long j) {
        C24362h.m61211f(fVar, "source");
        C17885a.m44460s(fVar.f62947c, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                C24920y yVar = fVar.f62946b;
                C24362h.m61208c(yVar);
                while (true) {
                    if (j2 >= ((long) SQLiteDatabase.OPEN_FULLMUTEX)) {
                        break;
                    }
                    j2 += (long) (yVar.f62993c - yVar.f62992b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        yVar = yVar.f62996f;
                        C24362h.m61208c(yVar);
                    }
                }
                C24888b bVar = this.f62938b;
                bVar.mo61362h();
                try {
                    this.f62939c.mo58998P(fVar, j2);
                    C21050d dVar = C21050d.f52856a;
                    if (!bVar.mo61363i()) {
                        j -= j2;
                    } else {
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
            } else {
                return;
            }
        }
    }

    public final void close() {
        C24888b bVar = this.f62938b;
        bVar.mo61362h();
        try {
            this.f62939c.close();
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

    public final void flush() {
        C24888b bVar = this.f62938b;
        bVar.mo61362h();
        try {
            this.f62939c.flush();
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

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AsyncTimeout.sink(");
        k.append(this.f62939c);
        k.append(')');
        return k.toString();
    }
}
