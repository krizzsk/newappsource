package p271u4;

import java.io.PrintStream;
import p070e4.C4548c;
import p070e4.C4549d;
import p283v4.C6856a;
import p283v4.C6860e;

/* renamed from: u4.e */
public class C6694e implements C6692c {

    /* renamed from: b */
    public int f20773b = 0;

    /* renamed from: c */
    public C4549d f20774c;

    /* renamed from: d */
    public final Object f20775d;

    public C6694e(C4549d dVar, Object obj) {
        this.f20774c = dVar;
        this.f20775d = obj;
    }

    /* renamed from: a */
    public final void mo21722a(String str) {
        mo22869c(new C6856a(str, mo21960e()));
    }

    /* renamed from: b */
    public final void mo20064b(C4549d dVar) {
        C4549d dVar2 = this.f20774c;
        if (dVar2 == null) {
            this.f20774c = dVar;
        } else if (dVar2 != dVar) {
            throw new IllegalStateException("Context has been already set");
        }
    }

    /* renamed from: c */
    public final void mo22869c(C6860e eVar) {
        C4549d dVar = this.f20774c;
        if (dVar == null) {
            int i = this.f20773b;
            this.f20773b = i + 1;
            if (i == 0) {
                PrintStream printStream = System.out;
                printStream.println("LOGBACK: No context given for " + this);
                return;
            }
            return;
        }
        C4548c cVar = dVar.f15676d;
        if (cVar != null) {
            cVar.mo20056a(eVar);
        }
    }

    /* renamed from: e */
    public Object mo21960e() {
        return this.f20775d;
    }

    /* renamed from: f */
    public final void mo21727f(String str, Throwable th) {
        mo22869c(new C6856a(mo21960e(), str, th));
    }
}
