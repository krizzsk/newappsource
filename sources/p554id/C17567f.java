package p554id;

import java.util.concurrent.Executor;
import p434dd.C16545c;

/* renamed from: id.f */
public final class C17567f implements C17571j {

    /* renamed from: a */
    public final Executor f45181a;

    /* renamed from: b */
    public final Object f45182b = new Object();

    /* renamed from: c */
    public final C16545c f45183c;

    public C17567f(C17575n nVar, C16545c cVar) {
        this.f45181a = nVar;
        this.f45183c = cVar;
    }

    /* renamed from: a */
    public final void mo50020a(C17576o oVar) {
        synchronized (this.f45182b) {
            if (this.f45183c != null) {
                this.f45181a.execute(new C17566e(this, oVar));
            }
        }
    }
}
