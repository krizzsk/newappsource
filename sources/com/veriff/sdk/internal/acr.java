package com.veriff.sdk.internal;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.veriff.sdk.internal.acf;
import com.veriff.sdk.internal.aci;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

class acr {

    /* renamed from: a */
    private static final acr f53718a = m50763e();

    /* renamed from: b */
    private final boolean f53719b;

    /* renamed from: c */
    private final Constructor<MethodHandles.Lookup> f53720c;

    /* renamed from: com.veriff.sdk.internal.acr$a */
    public static final class C21379a extends acr {

        /* renamed from: com.veriff.sdk.internal.acr$a$a */
        public static final class C21380a implements Executor {

            /* renamed from: a */
            private final Handler f53721a = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.f53721a.post(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21379a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        /* renamed from: a */
        public Object mo54047a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return acr.super.mo54047a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        /* renamed from: b */
        public Executor mo54050b() {
            return new C21380a();
        }
    }

    public acr(boolean z) {
        this.f53719b = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f53720c = constructor;
    }

    /* renamed from: a */
    public static acr m50762a() {
        return f53718a;
    }

    /* renamed from: e */
    private static acr m50763e() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new C21379a();
        }
        return new acr(true);
    }

    /* renamed from: b */
    public Executor mo54050b() {
        return null;
    }

    /* renamed from: c */
    public List<? extends aci.C21342a> mo54051c() {
        return this.f53719b ? Collections.singletonList(acp.f53671a) : Collections.emptyList();
    }

    /* renamed from: d */
    public int mo54052d() {
        return this.f53719b ? 1 : 0;
    }

    /* renamed from: a */
    public List<? extends acf.C21336a> mo54048a(Executor executor) {
        acj acj = new acj(executor);
        if (!this.f53719b) {
            return Collections.singletonList(acj);
        }
        return Arrays.asList(new acf.C21336a[]{ach.f53620a, acj});
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public boolean mo54049a(Method method) {
        return this.f53719b && method.isDefault();
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public Object mo54047a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f53720c;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
