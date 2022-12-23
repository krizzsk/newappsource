package xh0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlinx.coroutines.android.C24183a;
import p584jl.C17885a;

/* renamed from: xh0.e */
public final class C25275e {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new C24183a(m63480a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = C17885a.m44400G(th);
        }
        if (obj instanceof Result.Failure) {
            obj = null;
        }
        C25274d dVar = (C25274d) obj;
    }

    /* renamed from: a */
    public static final Handler m63480a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
