package p554id;

import java.util.concurrent.Executor;

/* renamed from: id.i */
public final class C17570i implements C17571j {

    /* renamed from: a */
    public final Executor f45190a;

    /* renamed from: b */
    public final Object f45191b = new Object();

    /* renamed from: c */
    public final C17563b f45192c;

    public C17570i(Executor executor, C17563b bVar) {
        this.f45190a = executor;
        this.f45192c = bVar;
    }

    /* renamed from: a */
    public final void mo50020a(C17576o oVar) {
        if (oVar.mo50028a()) {
            synchronized (this.f45191b) {
                if (this.f45192c != null) {
                    this.f45190a.execute(new C17569h(this, oVar));
                }
            }
        }
    }
}
