package yh0;

import bi0.C21079q;
import ce0.C21100e;
import kotlinx.coroutines.channels.C24196a;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: yh0.a */
public final class C25305a extends LockFreeLinkedListNode.C24214a {

    /* renamed from: d */
    public final /* synthetic */ C24196a f63611d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25305a(C25326r rVar, C24196a aVar) {
        super(rVar);
        this.f63611d = aVar;
    }

    /* renamed from: c */
    public final C21079q mo53191c(Object obj) {
        LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
        if (this.f63611d.mo60348h()) {
            return null;
        }
        return C21100e.f52942c;
    }
}
