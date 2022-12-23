package ci0;

import wh0.C25154a0;

/* renamed from: ci0.j */
public final class C21215j extends C21212g {

    /* renamed from: d */
    public final Runnable f53148d;

    public C21215j(Runnable runnable, long j, C21213h hVar) {
        super(j, hVar);
        this.f53148d = runnable;
    }

    public final void run() {
        try {
            this.f53148d.run();
        } finally {
            this.f53146c.mo53557a();
        }
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Task[");
        k.append(this.f53148d.getClass().getSimpleName());
        k.append('@');
        k.append(C25154a0.m63137b(this.f53148d));
        k.append(", ");
        k.append(this.f53145b);
        k.append(", ");
        k.append(this.f53146c);
        k.append(']');
        return k.toString();
    }
}
