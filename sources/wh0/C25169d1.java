package wh0;

import bi0.C21079q;
import ce0.C21100e;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* renamed from: wh0.d1 */
public final class C25169d1 extends LockFreeLinkedListNode.C24214a {

    /* renamed from: d */
    public final /* synthetic */ C25163c1 f63449d;

    /* renamed from: e */
    public final /* synthetic */ Object f63450e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25169d1(LockFreeLinkedListNode lockFreeLinkedListNode, C25163c1 c1Var, Object obj) {
        super(lockFreeLinkedListNode);
        this.f63449d = c1Var;
        this.f63450e = obj;
    }

    /* renamed from: c */
    public final C21079q mo53191c(Object obj) {
        boolean z;
        LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
        if (this.f63449d.mo61779d0() == this.f63450e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return C21100e.f52942c;
    }
}
