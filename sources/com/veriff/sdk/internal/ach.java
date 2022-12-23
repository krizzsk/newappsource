package com.veriff.sdk.internal;

import com.veriff.sdk.internal.acf;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
final class ach extends acf.C21336a {

    /* renamed from: a */
    public static final acf.C21336a f53620a = new ach();

    @IgnoreJRERequirement
    /* renamed from: com.veriff.sdk.internal.ach$a */
    public static final class C21337a<R> implements acf<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f53621a;

        @IgnoreJRERequirement
        /* renamed from: com.veriff.sdk.internal.ach$a$a */
        public class C21338a implements acg<R> {

            /* renamed from: b */
            private final CompletableFuture<R> f53622b;

            public C21338a(C21337a aVar, CompletableFuture<R> completableFuture) {
                this.f53622b = completableFuture;
            }

            /* renamed from: a */
            public void mo54010a(ace<R> ace, acu<R> acu) {
                if (acu.mo54073d()) {
                    this.f53622b.complete(acu.mo54074e());
                } else {
                    this.f53622b.completeExceptionally(new ack(acu));
                }
            }

            /* renamed from: a_ */
            public void mo54011a_(ace<R> ace, Throwable th) {
                this.f53622b.completeExceptionally(th);
            }
        }

        public C21337a(Type type) {
            this.f53621a = type;
        }

        /* renamed from: a */
        public Type mo54007a() {
            return this.f53621a;
        }

        /* renamed from: a */
        public CompletableFuture<R> mo54008b(ace<R> ace) {
            C21339b bVar = new C21339b(ace);
            ace.mo54003a(new C21338a(this, bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: com.veriff.sdk.internal.ach$b */
    public static final class C21339b<T> extends CompletableFuture<T> {

        /* renamed from: a */
        private final ace<?> f53623a;

        public C21339b(ace<?> ace) {
            this.f53623a = ace;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f53623a.mo54002a();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: com.veriff.sdk.internal.ach$c */
    public static final class C21340c<R> implements acf<R, CompletableFuture<acu<R>>> {

        /* renamed from: a */
        private final Type f53624a;

        @IgnoreJRERequirement
        /* renamed from: com.veriff.sdk.internal.ach$c$a */
        public class C21341a implements acg<R> {

            /* renamed from: b */
            private final CompletableFuture<acu<R>> f53625b;

            public C21341a(C21340c cVar, CompletableFuture<acu<R>> completableFuture) {
                this.f53625b = completableFuture;
            }

            /* renamed from: a */
            public void mo54010a(ace<R> ace, acu<R> acu) {
                this.f53625b.complete(acu);
            }

            /* renamed from: a_ */
            public void mo54011a_(ace<R> ace, Throwable th) {
                this.f53625b.completeExceptionally(th);
            }
        }

        public C21340c(Type type) {
            this.f53624a = type;
        }

        /* renamed from: a */
        public Type mo54007a() {
            return this.f53624a;
        }

        /* renamed from: a */
        public CompletableFuture<acu<R>> mo54008b(ace<R> ace) {
            C21339b bVar = new C21339b(ace);
            ace.mo54003a(new C21341a(this, bVar));
            return bVar;
        }
    }

    /* renamed from: a */
    public acf<?, ?> mo54009a(Type type, Annotation[] annotationArr, acv acv) {
        if (acf.C21336a.m50652b(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = acf.C21336a.m50653b(0, (ParameterizedType) type);
            if (acf.C21336a.m50652b(b) != acu.class) {
                return new C21337a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C21340c(acf.C21336a.m50653b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
