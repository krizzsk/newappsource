package re0;

import com.google.android.play.core.appupdate.C14226d;
import je0.C23711d;
import me0.C24353c;
import oe0.C24577a;
import qe0.C24734a;

/* renamed from: re0.c */
public final class C24797c<T, U> extends C24794a<T, U> {

    /* renamed from: c */
    public final C24353c<? super T, ? extends U> f62719c;

    /* renamed from: re0.c$a */
    public static final class C24798a<T, U> extends C24734a<T, U> {

        /* renamed from: f */
        public final C24353c<? super T, ? extends U> f62720f;

        public C24798a(C23711d<? super U> dVar, C24353c<? super T, ? extends U> cVar) {
            super(dVar);
            this.f62720f = cVar;
        }

        /* renamed from: e */
        public final void mo58911e(T t) {
            if (!this.f62611e) {
                try {
                    Object apply = this.f62720f.apply(t);
                    if (apply != null) {
                        this.f62608b.mo58911e(apply);
                        return;
                    }
                    throw new NullPointerException("The mapper function returned a null value.");
                } catch (Throwable th) {
                    C14226d.m35340G0(th);
                    this.f62609c.dispose();
                    onError(th);
                }
            }
        }

        public final U poll() throws Exception {
            T poll = this.f62610d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f62720f.apply(poll);
            if (apply != null) {
                return apply;
            }
            throw new NullPointerException("The mapper function returned a null value.");
        }

        public final int requestFusion(int i) {
            return mo61222a();
        }
    }

    public C24797c(C24795b bVar, C24577a.C24578a aVar) {
        super(bVar);
        this.f62719c = aVar;
    }

    /* renamed from: v */
    public final void mo53556v(C23711d<? super U> dVar) {
        this.f62716b.mo53555u(new C24798a(dVar, this.f62719c));
    }
}
