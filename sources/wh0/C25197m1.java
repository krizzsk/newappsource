package wh0;

import bf0.C21050d;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: wh0.m1 */
public final class C25197m1 extends C25167d {

    /* renamed from: b */
    public final LockFreeLinkedListNode f63472b;

    public C25197m1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f63472b = lockFreeLinkedListNode;
    }

    /* renamed from: a */
    public final void mo60339a(Throwable th) {
        this.f63472b.mo53208n();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo60339a((Throwable) obj);
        return C21050d.f52856a;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("RemoveOnCancel[");
        k.append(this.f63472b);
        k.append(']');
        return k.toString();
    }
}
