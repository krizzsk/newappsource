package bi0;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: bi0.m */
public final class C21075m {

    /* renamed from: a */
    public final LockFreeLinkedListNode f52891a;

    public C21075m(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f52891a = lockFreeLinkedListNode;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Removed[");
        k.append(this.f52891a);
        k.append(']');
        return k.toString();
    }
}
