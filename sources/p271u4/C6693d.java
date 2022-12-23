package p271u4;

import java.io.PrintStream;
import p070e4.C4548c;
import p070e4.C4549d;
import p283v4.C6856a;
import p283v4.C6857b;
import p283v4.C6860e;
import p283v4.C6862g;

/* renamed from: u4.d */
public class C6693d implements C6692c {

    /* renamed from: b */
    public int f20770b;

    /* renamed from: c */
    public C4549d f20771c;

    /* renamed from: d */
    public final C6692c f20772d;

    public C6693d() {
        this.f20770b = 0;
        this.f20772d = this;
    }

    public C6693d(C6692c cVar) {
        this.f20770b = 0;
        this.f20772d = cVar;
    }

    /* renamed from: a */
    public final void mo21722a(String str) {
        mo22866j(new C6856a(str, this.f20772d));
    }

    /* renamed from: b */
    public void mo20064b(C4549d dVar) {
        C4549d dVar2 = this.f20771c;
        if (dVar2 == null) {
            this.f20771c = dVar;
        } else if (dVar2 != dVar) {
            throw new IllegalStateException("Context has been already set");
        }
    }

    /* renamed from: f */
    public final void mo21727f(String str, Throwable th) {
        mo22866j(new C6856a(this.f20772d, str, th));
    }

    /* renamed from: i */
    public final void mo22865i(String str) {
        mo22866j(new C6857b(str, this.f20772d));
    }

    /* renamed from: j */
    public final void mo22866j(C6860e eVar) {
        C4549d dVar = this.f20771c;
        if (dVar == null) {
            int i = this.f20770b;
            this.f20770b = i + 1;
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

    /* renamed from: k */
    public final void mo22867k(String str) {
        mo22866j(new C6862g(str, this.f20772d));
    }

    /* renamed from: l */
    public final void mo22868l(String str, Throwable th) {
        mo22866j(new C6862g(this.f20772d, str, th));
    }
}
