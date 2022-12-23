package wh0;

import bf0.C21050d;
import java.util.concurrent.CancellationException;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: wh0.t */
public final class C25216t {

    /* renamed from: a */
    public final Object f63486a;

    /* renamed from: b */
    public final C25183i f63487b;

    /* renamed from: c */
    public final C24236l<Throwable, C21050d> f63488c;

    /* renamed from: d */
    public final Object f63489d;

    /* renamed from: e */
    public final Throwable f63490e;

    public C25216t(Object obj, C25183i iVar, C24236l<? super Throwable, C21050d> lVar, Object obj2, Throwable th) {
        this.f63486a = obj;
        this.f63487b = iVar;
        this.f63488c = lVar;
        this.f63489d = obj2;
        this.f63490e = th;
    }

    /* renamed from: a */
    public static C25216t m63306a(C25216t tVar, C25183i iVar, CancellationException cancellationException, int i) {
        Object obj = null;
        Object obj2 = (i & 1) != 0 ? tVar.f63486a : null;
        if ((i & 2) != 0) {
            iVar = tVar.f63487b;
        }
        C25183i iVar2 = iVar;
        C24236l<Throwable, C21050d> lVar = (i & 4) != 0 ? tVar.f63488c : null;
        if ((i & 8) != 0) {
            obj = tVar.f63489d;
        }
        Object obj3 = obj;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = tVar.f63490e;
        }
        tVar.getClass();
        return new C25216t(obj2, iVar2, lVar, obj3, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25216t)) {
            return false;
        }
        C25216t tVar = (C25216t) obj;
        return C24362h.m61206a(this.f63486a, tVar.f63486a) && C24362h.m61206a(this.f63487b, tVar.f63487b) && C24362h.m61206a(this.f63488c, tVar.f63488c) && C24362h.m61206a(this.f63489d, tVar.f63489d) && C24362h.m61206a(this.f63490e, tVar.f63490e);
    }

    public final int hashCode() {
        Object obj = this.f63486a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C25183i iVar = this.f63487b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        C24236l<Throwable, C21050d> lVar = this.f63488c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f63489d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f63490e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CompletedContinuation(result=");
        k.append(this.f63486a);
        k.append(", cancelHandler=");
        k.append(this.f63487b);
        k.append(", onCancellation=");
        k.append(this.f63488c);
        k.append(", idempotentResume=");
        k.append(this.f63489d);
        k.append(", cancelCause=");
        k.append(this.f63490e);
        k.append(')');
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25216t(Object obj, C25183i iVar, C24236l lVar, Object obj2, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : iVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : cancellationException);
    }
}
