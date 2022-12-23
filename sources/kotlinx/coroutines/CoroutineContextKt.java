package kotlinx.coroutines;

import ci0.C21207b;
import ff0.C23349c;
import ff0.C23350d;
import gf0.C23412b;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import wh0.C25175f0;
import wh0.C25184i0;
import wh0.C25218t1;
import wh0.C25221u1;
import wh0.C25235z;

public final class CoroutineContextKt {
    /* renamed from: a */
    public static final CoroutineContext m60586a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean b = m60587b(coroutineContext);
        boolean b2 = m60587b(coroutineContext2);
        if (!b && !b2) {
            return coroutineContext.mo53082y(coroutineContext2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f60190b;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.mo53080N(emptyCoroutineContext, new CoroutineContextKt$foldCopies$folded$1(ref$ObjectRef, z));
        if (b2) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).mo53080N(emptyCoroutineContext, CoroutineContextKt$foldCopies$1.f61410f);
        }
        return coroutineContext3.mo53082y((CoroutineContext) ref$ObjectRef.element);
    }

    /* renamed from: b */
    public static final boolean m60587b(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.mo53080N(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.f61411f)).booleanValue();
    }

    /* renamed from: c */
    public static final CoroutineContext m60588c(C25235z zVar, CoroutineContext coroutineContext) {
        CoroutineContext a = m60586a(zVar.mo4232K(), coroutineContext, true);
        C21207b bVar = C25184i0.f63459a;
        if (a == bVar || a.mo53081c(C23350d.C23351a.f59126b) != null) {
            return a;
        }
        return a.mo53082y(bVar);
    }

    /* renamed from: d */
    public static final C25218t1<?> m60589d(C23349c<?> cVar, CoroutineContext coroutineContext, Object obj) {
        boolean z;
        C25218t1<?> t1Var = null;
        if (!(cVar instanceof C23412b)) {
            return null;
        }
        if (coroutineContext.mo53081c(C25221u1.f63495b) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C23412b bVar = (C23412b) cVar;
        while (true) {
            if (!(bVar instanceof C25175f0) && (bVar = bVar.getCallerFrame()) != null) {
                if (bVar instanceof C25218t1) {
                    t1Var = (C25218t1) bVar;
                    break;
                }
            } else {
                break;
            }
        }
        if (t1Var != null) {
            t1Var.f63491e.set(new Pair(coroutineContext, obj));
        }
        return t1Var;
    }
}
