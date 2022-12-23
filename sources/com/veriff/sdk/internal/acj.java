package com.veriff.sdk.internal;

import com.veriff.sdk.internal.acf;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

final class acj extends acf.C21336a {

    /* renamed from: a */
    private final Executor f53626a;

    public acj(Executor executor) {
        this.f53626a = executor;
    }

    /* renamed from: a */
    public acf<?, ?> mo54009a(Type type, Annotation[] annotationArr, acv acv) {
        final Executor executor = null;
        if (acf.C21336a.m50652b(type) != ace.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type a = acz.m50837a(0, (ParameterizedType) type);
            if (!acz.m50843a(annotationArr, (Class<? extends Annotation>) acx.class)) {
                executor = this.f53626a;
            }
            return new acf<Object, ace<?>>(this) {
                /* renamed from: a */
                public Type mo54007a() {
                    return a;
                }

                /* renamed from: a */
                public ace<Object> mo54008b(ace<Object> ace) {
                    Executor executor = executor;
                    return executor == null ? ace : new C21344a(executor, ace);
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: com.veriff.sdk.internal.acj$a */
    public static final class C21344a<T> implements ace<T> {

        /* renamed from: a */
        public final Executor f53629a;

        /* renamed from: b */
        public final ace<T> f53630b;

        public C21344a(Executor executor, ace<T> ace) {
            this.f53629a = executor;
            this.f53630b = ace;
        }

        /* renamed from: a */
        public void mo54003a(final acg<T> acg) {
            Objects.requireNonNull(acg, "callback == null");
            this.f53630b.mo54003a(new acg<T>() {
                /* renamed from: a */
                public void mo54010a(ace<T> ace, acu<T> acu) {
                    C21344a.this.f53629a.execute(new C21277a(this, acg, acu));
                }

                /* renamed from: a_ */
                public void mo54011a_(ace<T> ace, Throwable th) {
                    C21344a.this.f53629a.execute(new C21429b(this, acg, th));
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m50683a(acg acg, acu acu) {
                    if (C21344a.this.f53630b.mo54004b()) {
                        acg.mo54011a_(C21344a.this, new IOException("Canceled"));
                    } else {
                        acg.mo54010a(C21344a.this, acu);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m50684a(acg acg, Throwable th) {
                    acg.mo54011a_(C21344a.this, th);
                }
            });
        }

        /* renamed from: b */
        public boolean mo54004b() {
            return this.f53630b.mo54004b();
        }

        /* renamed from: c */
        public C22752ys mo54005c() {
            return this.f53630b.mo54005c();
        }

        /* renamed from: e */
        public ace<T> clone() {
            return new C21344a(this.f53629a, this.f53630b.mo54006e());
        }

        /* renamed from: a */
        public void mo54002a() {
            this.f53630b.mo54002a();
        }
    }
}
