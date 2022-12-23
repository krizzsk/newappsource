package p311x6;

import java.util.concurrent.Executor;

/* renamed from: x6.e */
public final class C7166e {

    /* renamed from: a */
    public static final C7167a f22251a = new C7167a();

    /* renamed from: b */
    public static final C7168b f22252b = new C7168b();

    /* renamed from: x6.e$a */
    public class C7167a implements Executor {
        public final void execute(Runnable runnable) {
            C7176l.m16786f().post(runnable);
        }
    }

    /* renamed from: x6.e$b */
    public class C7168b implements Executor {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
