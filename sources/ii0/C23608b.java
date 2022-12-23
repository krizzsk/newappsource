package ii0;

/* renamed from: ii0.b */
public abstract class C23608b implements Runnable {

    /* renamed from: b */
    public final String f59681b;

    public C23608b(String str, Object... objArr) {
        this.f59681b = C23610d.m57802j(str, objArr);
    }

    /* renamed from: a */
    public abstract void mo58724a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f59681b);
        try {
            mo58724a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
