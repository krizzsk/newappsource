package ck0;

import ck0.C21227c;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: ck0.k */
public final class C21237k extends C21227c.C21228a {

    /* renamed from: a */
    public final Executor f53179a;

    /* renamed from: ck0.k$a */
    public static final class C21238a<T> implements C21226b<T> {

        /* renamed from: b */
        public final Executor f53180b;

        /* renamed from: c */
        public final C21226b<T> f53181c;

        /* renamed from: ck0.k$a$a */
        public class C21239a implements C21229d<T> {

            /* renamed from: a */
            public final /* synthetic */ C21229d f53182a;

            public C21239a(C21229d dVar) {
                this.f53182a = dVar;
            }

            /* renamed from: a */
            public final void mo53591a(C21267r rVar) {
                C21238a.this.f53180b.execute(new C21235i(this, rVar));
            }

            public final void onFailure(Throwable th) {
                C21238a.this.f53180b.execute(new C21236j(this, th));
            }
        }

        public C21238a(Executor executor, C21226b<T> bVar) {
            this.f53180b = executor;
            this.f53181c = bVar;
        }

        /* renamed from: C */
        public final C21267r<T> mo53584C() throws IOException {
            return this.f53181c.mo53584C();
        }

        /* renamed from: K0 */
        public final void mo53585K0(C21229d<T> dVar) {
            this.f53181c.mo53585K0(new C21239a(dVar));
        }

        public final boolean isCanceled() {
            return this.f53181c.isCanceled();
        }

        public final C21226b<T> clone() {
            return new C21238a(this.f53180b, this.f53181c.clone());
        }
    }

    public C21237k(Executor executor) {
        this.f53179a = executor;
    }

    /* renamed from: a */
    public final C21227c mo53590a(Type type) {
        if (C21273u.m49949e(type) != C21226b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C21234h(this, C21273u.m49948d(0, (ParameterizedType) type));
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
