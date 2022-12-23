package oe0;

import me0.C24351a;
import me0.C24352b;
import me0.C24353c;
import me0.C24354d;
import p565io.reactivex.exceptions.OnErrorNotImplementedException;
import ve0.C25088a;

/* renamed from: oe0.a */
public final class C24577a {

    /* renamed from: a */
    public static final C24582e f62308a = new C24582e();

    /* renamed from: b */
    public static final C24580c f62309b = new C24580c();

    /* renamed from: c */
    public static final C24581d f62310c = new C24581d();

    /* renamed from: d */
    public static final C24583f f62311d = new C24583f();

    /* renamed from: oe0.a$a */
    public static final class C24578a<T, U> implements C24353c<T, U> {

        /* renamed from: a */
        public final Class<U> f62312a;

        public C24578a(Class<U> cls) {
            this.f62312a = cls;
        }

        public final U apply(T t) throws Exception {
            return this.f62312a.cast(t);
        }
    }

    /* renamed from: oe0.a$b */
    public static final class C24579b<T, U> implements C24354d<T> {

        /* renamed from: a */
        public final Class<U> f62313a;

        public C24579b(Class<U> cls) {
            this.f62313a = cls;
        }

        public final boolean test(T t) throws Exception {
            return this.f62313a.isInstance(t);
        }
    }

    /* renamed from: oe0.a$c */
    public static final class C24580c implements C24351a {
        public final String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: oe0.a$d */
    public static final class C24581d implements C24352b<Object> {
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: oe0.a$e */
    public static final class C24582e implements Runnable {
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: oe0.a$f */
    public static final class C24583f implements C24352b<Throwable> {
        public final void accept(Object obj) throws Exception {
            C25088a.m62857b(new OnErrorNotImplementedException((Throwable) obj));
        }
    }
}
