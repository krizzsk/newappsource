package kotlinx.coroutines.flow.internal;

import ai0.C20999c;
import ai0.C21001e;
import bf0.C21050d;
import cf0.C21136j;
import ff0.C23349c;
import gf0.C23412b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.C23825c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.C24178a;
import kotlin.text.C24179b;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17875h;
import uh0.C25081h;
import wh0.C25232y0;
import zh0.C25523d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, mo59060d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lzh0/d;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lgf0/b;", "collector", "Lzh0/d;", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "", "collectContextSize", "I", "lastEmissionContext", "Lff0/c;", "Lbf0/d;", "completion", "Lff0/c;", "kotlinx-coroutines-core"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class SafeCollector<T> extends ContinuationImpl implements C25523d<T> {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final C25523d<T> collector;
    private C23349c<? super C21050d> completion;
    private CoroutineContext lastEmissionContext;

    public SafeCollector(C25523d<? super T> dVar, CoroutineContext coroutineContext) {
        super(C21001e.f52749b, EmptyCoroutineContext.f60190b);
        this.collector = dVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.mo53080N(0, SafeCollector$collectContextSize$1.f61481f)).intValue();
    }

    /* renamed from: a */
    public final Object mo60362a(C23349c<? super C21050d> cVar, T t) {
        int i;
        boolean z;
        CoroutineContext context = cVar.getContext();
        C25232y0 y0Var = (C25232y0) context.mo53081c(C25232y0.C25234b.f63506b);
        if (y0Var == null || y0Var.isActive()) {
            CoroutineContext coroutineContext = this.lastEmissionContext;
            if (coroutineContext != context) {
                if (coroutineContext instanceof C20999c) {
                    StringBuilder k = C13555b.m33972k("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    k.append(((C20999c) coroutineContext).f52747b);
                    k.append(", but then emission attempt of value '");
                    k.append(t);
                    k.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                    String sb = k.toString();
                    C24362h.m61211f(sb, "<this>");
                    List Q = C24179b.m60569Q(sb);
                    ArrayList arrayList = new ArrayList();
                    for (Object next : Q) {
                        if (!C25081h.m62831B((String) next)) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        int length = str.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                i2 = -1;
                                break;
                            } else if (!C24361g.m61157a0(str.charAt(i2))) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i2 == -1) {
                            i2 = str.length();
                        }
                        arrayList2.add(Integer.valueOf(i2));
                    }
                    Integer num = (Integer) C23825c.m58524u0(arrayList2);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    int size = (Q.size() * 0) + sb.length();
                    C24236l w = C24178a.m60558w();
                    int y = C17875h.m44314y(Q);
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Object next2 : Q) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            String str2 = (String) next2;
                            if ((i3 == 0 || i3 == y) && C25081h.m62831B(str2)) {
                                str2 = null;
                            } else {
                                C24362h.m61211f(str2, "<this>");
                                if (i >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    int length2 = str2.length();
                                    if (i <= length2) {
                                        length2 = i;
                                    }
                                    String substring = str2.substring(length2);
                                    C24362h.m61210e(substring, "this as java.lang.String).substring(startIndex)");
                                    String str3 = (String) w.invoke(substring);
                                    if (str3 != null) {
                                        str2 = str3;
                                    }
                                } else {
                                    throw new IllegalArgumentException(C25541a.m63878h("Requested character count ", i, " is less than zero.").toString());
                                }
                            }
                            if (str2 != null) {
                                arrayList3.add(str2);
                            }
                            i3 = i4;
                        } else {
                            C17875h.m44294U();
                            throw null;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(size);
                    C23825c.m58518o0(arrayList3, sb2, "\n", (String) null, (String) null, (C24236l) null, 124);
                    String sb3 = sb2.toString();
                    C24362h.m61210e(sb3, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
                    throw new IllegalStateException(sb3.toString());
                } else if (((Number) context.mo53080N(0, new SafeCollector_commonKt$checkContext$result$1(this))).intValue() == this.collectContextSize) {
                    this.lastEmissionContext = context;
                } else {
                    StringBuilder k2 = C13555b.m33972k("Flow invariant is violated:\n\t\tFlow was collected in ");
                    k2.append(this.collectContext);
                    k2.append(",\n\t\tbut emission happened in ");
                    k2.append(context);
                    k2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    throw new IllegalStateException(k2.toString().toString());
                }
            }
            this.completion = cVar;
            Object invoke = SafeCollectorKt.f61482a.invoke(this.collector, t, this);
            if (!C24362h.m61206a(invoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
                this.completion = null;
            }
            return invoke;
        }
        throw y0Var.mo61782i();
    }

    public final Object emit(T t, C23349c<? super C21050d> cVar) {
        try {
            Object a = mo60362a(cVar, t);
            if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a;
            }
            return C21050d.f52856a;
        } catch (Throwable th) {
            this.lastEmissionContext = new C20999c(cVar.getContext(), th);
            throw th;
        }
    }

    public final C23412b getCallerFrame() {
        C23349c<? super C21050d> cVar = this.completion;
        if (cVar instanceof C23412b) {
            return (C23412b) cVar;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.f60190b : coroutineContext;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object invokeSuspend(Object obj) {
        Throwable a = Result.m58423a(obj);
        if (a != null) {
            this.lastEmissionContext = new C20999c(getContext(), a);
        }
        C23349c<? super C21050d> cVar = this.completion;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
