package fe0;

import androidx.appcompat.widget.C0411h;
import ck0.C21229d;
import ck0.C21267r;

/* renamed from: fe0.b */
public final class C23342b<E, F> implements C21229d<E> {

    /* renamed from: c */
    public static final C23343a f59118c = new C23343a();

    /* renamed from: a */
    public final C23345c<F> f59119a;

    /* renamed from: b */
    public final C23344b<E, F> f59120b;

    /* renamed from: fe0.b$a */
    public static final class C23343a<E> implements C23344b<E, E> {
        public final E extract(E e) {
            return e;
        }
    }

    /* renamed from: fe0.b$b */
    public interface C23344b<E, F> {
        F extract(E e);
    }

    public C23342b(C23345c<F> cVar, C23344b<E, F> bVar) {
        this.f59119a = cVar;
        this.f59120b = bVar;
    }

    /* renamed from: a */
    public final void mo53591a(C21267r rVar) {
        if (this.f59119a == null) {
            return;
        }
        if (rVar.f53229a.mo58644v()) {
            this.f59119a.onSuccess(this.f59120b.extract(rVar.f53230b));
        } else {
            this.f59119a.onError(new C0411h(rVar));
        }
    }

    public final void onFailure(Throwable th) {
        C23345c<F> cVar = this.f59119a;
        if (cVar != null) {
            cVar.onError(new C0411h(th));
        }
    }

    public C23342b(C23345c<F> cVar) {
        this(cVar, f59118c);
    }
}
