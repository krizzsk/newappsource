package p988j$.util.stream;

/* renamed from: j$.util.stream.C3 */
final class C26036C3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f64710a;

    /* renamed from: b */
    final /* synthetic */ Runnable f64711b;

    C26036C3(Runnable runnable, Runnable runnable2) {
        this.f64710a = runnable;
        this.f64711b = runnable2;
    }

    public final void run() {
        try {
            this.f64710a.run();
            this.f64711b.run();
            return;
        } catch (Throwable th) {
            try {
                th.addSuppressed(th);
            } catch (Throwable unused) {
            }
        }
        throw th;
    }
}
