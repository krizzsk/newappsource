package p322y6;

import android.util.Log;
import p229r1.C6234d;
import p229r1.C6236f;
import p322y6.C7341d;

/* renamed from: y6.a */
public final class C7333a {

    /* renamed from: a */
    public static final C7334a f22556a = new C7334a();

    /* renamed from: y6.a$a */
    public class C7334a implements C7338e<Object> {
        /* renamed from: a */
        public final void mo23559a(Object obj) {
        }
    }

    /* renamed from: y6.a$b */
    public interface C7335b<T> {
        T create();
    }

    /* renamed from: y6.a$c */
    public static final class C7336c<T> implements C6234d<T> {

        /* renamed from: a */
        public final C7335b<T> f22557a;

        /* renamed from: b */
        public final C7338e<T> f22558b;

        /* renamed from: c */
        public final C6234d<T> f22559c;

        public C7336c(C6236f fVar, C7335b bVar, C7338e eVar) {
            this.f22559c = fVar;
            this.f22557a = bVar;
            this.f22558b = eVar;
        }

        /* renamed from: a */
        public final boolean mo22236a(T t) {
            if (t instanceof C7337d) {
                ((C7337d) t).mo10927f().f22560a = true;
            }
            this.f22558b.mo23559a(t);
            return this.f22559c.mo22236a(t);
        }

        /* renamed from: b */
        public final T mo22237b() {
            T b = this.f22559c.mo22237b();
            if (b == null) {
                b = this.f22557a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    b.getClass().toString();
                }
            }
            if (b instanceof C7337d) {
                ((C7337d) b).mo10927f().f22560a = false;
            }
            return b;
        }
    }

    /* renamed from: y6.a$d */
    public interface C7337d {
        /* renamed from: f */
        C7341d.C7342a mo10927f();
    }

    /* renamed from: y6.a$e */
    public interface C7338e<T> {
        /* renamed from: a */
        void mo23559a(T t);
    }

    /* renamed from: a */
    public static C7336c m16961a(int i, C7335b bVar) {
        return new C7336c(new C6236f(i), bVar, f22556a);
    }
}
