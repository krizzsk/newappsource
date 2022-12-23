package kotlinx.coroutines;

import bi0.C21066e;
import ff0.C23347a;
import ff0.C23348b;
import ff0.C23349c;
import ff0.C23350d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import mf0.C24362h;
import wh0.C25154a0;

public abstract class CoroutineDispatcher extends C23347a implements C23350d {

    /* renamed from: c */
    public static final Key f61412c = new Key();

    public static final class Key extends C23348b<C23350d, CoroutineDispatcher> {
        public Key() {
            super(C23350d.C23351a.f59126b, C241801.f61413f);
        }
    }

    public CoroutineDispatcher() {
        super(C23350d.C23351a.f59126b);
    }

    /* renamed from: C */
    public final CoroutineContext mo53079C(CoroutineContext.C23829b<?> bVar) {
        boolean z;
        C24362h.m61211f(bVar, LinksConfiguration.KEY_KEY);
        if (bVar instanceof C23348b) {
            C23348b bVar2 = (C23348b) bVar;
            CoroutineContext.C23829b<?> bVar3 = this.f59122b;
            C24362h.m61211f(bVar3, LinksConfiguration.KEY_KEY);
            if (bVar3 == bVar2 || bVar2.f59124c == bVar3) {
                z = true;
            } else {
                z = false;
            }
            if (z && ((CoroutineContext.C23827a) bVar2.f59123b.invoke(this)) != null) {
                return EmptyCoroutineContext.f60190b;
            }
        } else if (C23350d.C23351a.f59126b == bVar) {
            return EmptyCoroutineContext.f60190b;
        }
        return this;
    }

    /* renamed from: R */
    public final void mo58472R(C23349c<?> cVar) {
        ((C21066e) cVar).mo53200p();
    }

    /* renamed from: c */
    public final <E extends CoroutineContext.C23827a> E mo53081c(CoroutineContext.C23829b<E> bVar) {
        boolean z;
        C24362h.m61211f(bVar, LinksConfiguration.KEY_KEY);
        if (bVar instanceof C23348b) {
            C23348b bVar2 = (C23348b) bVar;
            CoroutineContext.C23829b<?> bVar3 = this.f59122b;
            C24362h.m61211f(bVar3, LinksConfiguration.KEY_KEY);
            if (bVar3 == bVar2 || bVar2.f59124c == bVar3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                E e = (CoroutineContext.C23827a) bVar2.f59123b.invoke(this);
                if (e instanceof CoroutineContext.C23827a) {
                    return e;
                }
            }
        } else if (C23350d.C23351a.f59126b == bVar) {
            return this;
        }
        return null;
    }

    /* renamed from: k */
    public abstract void mo4335k(CoroutineContext coroutineContext, Runnable runnable);

    /* renamed from: o */
    public final C21066e mo58473o(C23349c cVar) {
        return new C21066e(this, cVar);
    }

    /* renamed from: q */
    public void mo53205q(CoroutineContext coroutineContext, Runnable runnable) {
        mo4335k(coroutineContext, runnable);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C25154a0.m63137b(this);
    }

    /* renamed from: x */
    public boolean mo4336x(CoroutineContext coroutineContext) {
        return !(this instanceof C24200e);
    }
}
