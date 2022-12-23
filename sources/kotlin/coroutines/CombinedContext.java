package kotlin.coroutines;

import bf0.C21050d;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$IntRef;
import lf0.C24240p;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, mo59060d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "left", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext$a;", "element", "Lkotlin/coroutines/CoroutineContext$a;", "Serialized", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class CombinedContext implements CoroutineContext, Serializable {
    private final CoroutineContext.C23827a element;
    private final CoroutineContext left;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo59060d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "Lkotlin/coroutines/CoroutineContext;", "elements", "[Lkotlin/coroutines/CoroutineContext;", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        private final CoroutineContext[] elements;

        public Serialized(CoroutineContext[] coroutineContextArr) {
            this.elements = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContext = EmptyCoroutineContext.f60190b;
            for (CoroutineContext y : coroutineContextArr) {
                coroutineContext = coroutineContext.mo53082y(y);
            }
            return coroutineContext;
        }
    }

    public CombinedContext(CoroutineContext.C23827a aVar, CoroutineContext coroutineContext) {
        C24362h.m61211f(coroutineContext, "left");
        C24362h.m61211f(aVar, "element");
        this.left = coroutineContext;
        this.element = aVar;
    }

    private final Object writeReplace() {
        boolean z;
        int b = mo59255b();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[b];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        mo53080N(C21050d.f52856a, new CombinedContext$writeReplace$1(coroutineContextArr, ref$IntRef));
        if (ref$IntRef.element == b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: C */
    public final CoroutineContext mo53079C(CoroutineContext.C23829b<?> bVar) {
        C24362h.m61211f(bVar, LinksConfiguration.KEY_KEY);
        if (this.element.mo53081c(bVar) != null) {
            return this.left;
        }
        CoroutineContext C = this.left.mo53079C(bVar);
        if (C == this.left) {
            return this;
        }
        if (C == EmptyCoroutineContext.f60190b) {
            return this.element;
        }
        return new CombinedContext(this.element, C);
    }

    /* renamed from: N */
    public final <R> R mo53080N(R r, C24240p<? super R, ? super CoroutineContext.C23827a, ? extends R> pVar) {
        C24362h.m61211f(pVar, "operation");
        return pVar.invoke(this.left.mo53080N(r, pVar), this.element);
    }

    /* renamed from: b */
    public final int mo59255b() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: c */
    public final <E extends CoroutineContext.C23827a> E mo53081c(CoroutineContext.C23829b<E> bVar) {
        C24362h.m61211f(bVar, LinksConfiguration.KEY_KEY);
        CombinedContext combinedContext = this;
        while (true) {
            E c = combinedContext.element.mo53081c(bVar);
            if (c != null) {
                return c;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.mo53081c(bVar);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof CombinedContext)) {
                return false;
            }
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.mo59255b() != mo59255b()) {
                return false;
            }
            CombinedContext combinedContext2 = this;
            while (true) {
                CoroutineContext.C23827a aVar = combinedContext2.element;
                if (C24362h.m61206a(combinedContext.mo53081c(aVar.getKey()), aVar)) {
                    CoroutineContext coroutineContext = combinedContext2.left;
                    if (!(coroutineContext instanceof CombinedContext)) {
                        C24362h.m61209d(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.C23827a aVar2 = (CoroutineContext.C23827a) coroutineContext;
                        z = C24362h.m61206a(combinedContext.mo53081c(aVar2.getKey()), aVar2);
                        break;
                    }
                    combinedContext2 = (CombinedContext) coroutineContext;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    public final String toString() {
        return C0017h.m57N(C25541a.m63886q('['), (String) mo53080N("", CombinedContext$toString$1.f60188f), ']');
    }

    /* renamed from: y */
    public final CoroutineContext mo53082y(CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m58548a(this, coroutineContext);
    }
}
