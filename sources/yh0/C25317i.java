package yh0;

import bf0.C21050d;
import bi0.C21068g;
import bi0.C21079q;
import java.util.ArrayList;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.C24196a;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import lf0.C24236l;
import p583jk.C17875h;

/* renamed from: yh0.i */
public final class C25317i<E> extends AbstractChannel<E> {
    public C25317i(C24236l<? super E, C21050d> lVar) {
        super(lVar);
    }

    /* renamed from: g */
    public final boolean mo60347g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo60348h() {
        return false;
    }

    /* renamed from: i */
    public final Object mo60349i(E e) {
        C25322n nVar;
        do {
            Object i = super.mo60349i(e);
            C21079q qVar = C17875h.f45864h;
            if (i == qVar) {
                return qVar;
            }
            if (i == C17875h.f45865i) {
                C21068g gVar = this.f61445c;
                C24196a.C24197a aVar = new C24196a.C24197a(e);
                while (true) {
                    LockFreeLinkedListNode k = gVar.mo60371k();
                    if (!(k instanceof C25322n)) {
                        if (k.mo60366f(aVar, gVar)) {
                            nVar = null;
                            break;
                        }
                    } else {
                        nVar = (C25322n) k;
                        break;
                    }
                }
                if (nVar == null) {
                    return C17875h.f45864h;
                }
            } else if (i instanceof C25315g) {
                return i;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + i).toString());
            }
        } while (!(nVar instanceof C25315g));
        return nVar;
    }

    /* renamed from: m */
    public final boolean mo60324m() {
        return true;
    }

    /* renamed from: n */
    public final boolean mo60325n() {
        return true;
    }

    /* renamed from: r */
    public final void mo60328r(Object obj, C25315g<?> gVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                C25324p pVar = (C25324p) obj;
                if (pVar instanceof C24196a.C24197a) {
                    C24236l<E, C21050d> lVar = this.f61444b;
                    if (lVar != null) {
                        undeliveredElementException = OnUndeliveredElementKt.m60694b(lVar, ((C24196a.C24197a) pVar).f61446e, (UndeliveredElementException) null);
                    }
                } else {
                    pVar.mo60356s(gVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    C25324p pVar2 = (C25324p) arrayList.get(size);
                    if (pVar2 instanceof C24196a.C24197a) {
                        C24236l<E, C21050d> lVar2 = this.f61444b;
                        if (lVar2 != null) {
                            undeliveredElementException2 = OnUndeliveredElementKt.m60694b(lVar2, ((C24196a.C24197a) pVar2).f61446e, undeliveredElementException2);
                        } else {
                            undeliveredElementException2 = null;
                        }
                    } else {
                        pVar2.mo60356s(gVar);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }
}
