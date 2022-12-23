package ck0;

import android.os.Handler;
import android.os.Looper;
import ck0.C21227c;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: ck0.p */
public class C21261p {

    /* renamed from: a */
    public static final C21261p f53214a;

    /* renamed from: ck0.p$a */
    public static class C21262a extends C21261p {

        /* renamed from: ck0.p$a$a */
        public static class C21263a implements Executor {

            /* renamed from: b */
            public final Handler f53215b = new Handler(Looper.getMainLooper());

            public final void execute(Runnable runnable) {
                this.f53215b.post(runnable);
            }
        }

        /* renamed from: a */
        public final C21227c.C21228a mo53603a(Executor executor) {
            if (executor != null) {
                return new C21237k(executor);
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public final Executor mo53604b() {
            return new C21263a();
        }
    }

    @IgnoreJRERequirement
    /* renamed from: ck0.p$b */
    public static class C21264b extends C21261p {
        /* renamed from: c */
        public final Object mo53605c(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[]{cls, -1}).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* renamed from: d */
        public final boolean mo53606d(Method method) {
            return method.isDefault();
        }
    }

    static {
        C21261p pVar;
        try {
            Class.forName("android.os.Build");
            pVar = new C21262a();
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName("java.util.Optional");
                pVar = new C21264b();
            } catch (ClassNotFoundException unused2) {
                pVar = new C21261p();
            }
        }
        f53214a = pVar;
    }

    /* renamed from: a */
    public C21227c.C21228a mo53603a(Executor executor) {
        if (executor != null) {
            return new C21237k(executor);
        }
        return C21233g.f53172a;
    }

    /* renamed from: b */
    public Executor mo53604b() {
        return null;
    }

    /* renamed from: c */
    public Object mo53605c(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public boolean mo53606d(Method method) {
        return false;
    }
}
