package kotlinx.coroutines;

import bf0.C21050d;
import ce0.C21100e;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import mf0.C24369n;
import p258t4.C6587a;
import p584jl.C17885a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJY\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8FX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo59060d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "T", "Lkotlin/Function1;", "Lff0/c;", "", "block", "completion", "Lbf0/d;", "invoke", "(Llf0/l;Lff0/c;)V", "R", "Lkotlin/Function2;", "receiver", "(Llf0/p;Ljava/lang/Object;Lff0/c;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: kotlinx.coroutines.CoroutineStart$a */
    public /* synthetic */ class C24181a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61414a = null;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
            f61414a = iArr;
        }
    }

    public final <T> void invoke(C24236l<? super C23349c<? super T>, ? extends Object> lVar, C23349c<? super T> cVar) {
        CoroutineContext context;
        Object b;
        int i = C24181a.f61414a[ordinal()];
        if (i == 1) {
            try {
                C6587a.m15521z(C21100e.m49351l0(C21100e.m49314J(lVar, cVar)), C21050d.f52856a, (C24236l) null);
            } catch (Throwable th) {
                cVar.resumeWith(C17885a.m44400G(th));
                throw th;
            }
        } else if (i == 2) {
            C24362h.m61211f(lVar, "<this>");
            C24362h.m61211f(cVar, "completion");
            C21100e.m49351l0(C21100e.m49314J(lVar, cVar)).resumeWith(C21050d.f52856a);
        } else if (i == 3) {
            C24362h.m61211f(cVar, "completion");
            try {
                context = cVar.getContext();
                b = ThreadContextKt.m60696b(context, (Object) null);
                C24369n.m61246b(1, lVar);
                Object invoke = lVar.invoke(cVar);
                ThreadContextKt.m60695a(context, b);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    cVar.resumeWith(invoke);
                }
            } catch (Throwable th2) {
                cVar.resumeWith(C17885a.m44400G(th2));
            }
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(C24240p<? super R, ? super C23349c<? super T>, ? extends Object> pVar, R r, C23349c<? super T> cVar) {
        CoroutineContext context;
        Object b;
        int i = C24181a.f61414a[ordinal()];
        if (i == 1) {
            try {
                C6587a.m15521z(C21100e.m49351l0(C21100e.m49316K(pVar, r, cVar)), C21050d.f52856a, (C24236l) null);
            } catch (Throwable th) {
                cVar.resumeWith(C17885a.m44400G(th));
                throw th;
            }
        } else if (i == 2) {
            C24362h.m61211f(pVar, "<this>");
            C24362h.m61211f(cVar, "completion");
            C21100e.m49351l0(C21100e.m49316K(pVar, r, cVar)).resumeWith(C21050d.f52856a);
        } else if (i == 3) {
            C24362h.m61211f(cVar, "completion");
            try {
                context = cVar.getContext();
                b = ThreadContextKt.m60696b(context, (Object) null);
                C24369n.m61246b(2, pVar);
                Object invoke = pVar.invoke(r, cVar);
                ThreadContextKt.m60695a(context, b);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    cVar.resumeWith(invoke);
                }
            } catch (Throwable th2) {
                cVar.resumeWith(C17885a.m44400G(th2));
            }
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
