package yh0;

import bf0.C21050d;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import lf0.C24236l;
import p389bl.C13637c;
import wh0.C25192l;

/* renamed from: yh0.s */
public final class C25327s<E> extends C25326r<E> {

    /* renamed from: g */
    public final C24236l<E, C21050d> f63630g;

    public C25327s(Object obj, C25192l lVar, C24236l lVar2) {
        super(obj, lVar);
        this.f63630g = lVar2;
    }

    /* renamed from: n */
    public final boolean mo53208n() {
        if (!super.mo53208n()) {
            return false;
        }
        mo61910u();
        return true;
    }

    /* renamed from: u */
    public final void mo61910u() {
        C24236l<E, C21050d> lVar = this.f63630g;
        E e = this.f63628e;
        CoroutineContext context = this.f63629f.getContext();
        UndeliveredElementException b = OnUndeliveredElementKt.m60694b(lVar, e, (UndeliveredElementException) null);
        if (b != null) {
            C13637c.m34080w(context, b);
        }
    }
}
