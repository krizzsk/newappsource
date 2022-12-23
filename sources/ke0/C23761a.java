package ke0;

import android.os.Handler;
import android.os.Looper;
import p565io.reactivex.internal.util.ExceptionHelper;

/* renamed from: ke0.a */
public final class C23761a {

    /* renamed from: a */
    public static final C23763b f60029a;

    /* renamed from: ke0.a$a */
    public static final class C23762a {

        /* renamed from: a */
        public static final C23763b f60030a = new C23763b(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            C23763b bVar = C23762a.f60030a;
            if (bVar != null) {
                f60029a = bVar;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ExceptionHelper.m58212a(th);
        }
    }
}
