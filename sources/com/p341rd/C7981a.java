package com.p341rd;

import bb0.C7569a;
import cb0.C7583b;
import db0.C12611a;
import gb0.C12722a;
import ib0.C12770a;

/* renamed from: com.rd.a */
public final class C7981a implements C7583b.C7584a {

    /* renamed from: a */
    public C12722a f24186a;

    /* renamed from: b */
    public C7569a f24187b;

    /* renamed from: c */
    public C7982a f24188c;

    /* renamed from: com.rd.a$a */
    public interface C7982a {
    }

    public C7981a(C7982a aVar) {
        this.f24188c = aVar;
        C12722a aVar2 = new C12722a();
        this.f24186a = aVar2;
        if (aVar2.f31418a == null) {
            aVar2.f31418a = new C12770a();
        }
        this.f24187b = new C7569a(aVar2.f31418a, this);
    }

    /* renamed from: a */
    public final C12770a mo24974a() {
        C12722a aVar = this.f24186a;
        if (aVar.f31418a == null) {
            aVar.f31418a = new C12770a();
        }
        return aVar.f31418a;
    }

    /* renamed from: b */
    public final void mo24975b(C12611a aVar) {
        this.f24186a.f31419b.f31492a = aVar;
        C7982a aVar2 = this.f24188c;
        if (aVar2 != null) {
            ((PageIndicatorView) aVar2).invalidate();
        }
    }
}
