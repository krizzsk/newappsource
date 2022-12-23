package p821tm;

import java.util.ArrayList;
import java.util.List;
import p364al.C13487h;
import p725pj.C18926a;
import p752qn.C19150h;
import p891wk.C20362q;
import p962zk.C20872a;

/* renamed from: tm.c */
public final class C19697c {

    /* renamed from: a */
    public final C19708l f50014a;

    /* renamed from: b */
    public final C19712p f50015b;

    public C19697c(C19708l lVar, C19712p pVar) {
        this.f50014a = lVar;
        this.f50015b = pVar;
    }

    /* renamed from: a */
    public final C13487h<List<C19150h>> mo52055a() {
        C13487h<C20872a> a = this.f50014a.mo52057a();
        if (a.mo40399a()) {
            return new C13487h<>(null, a.f33366b);
        }
        ArrayList arrayList = new ArrayList();
        for (C20362q a2 : ((C20872a) a.f33365a).f52608a) {
            C13487h<C19150h> a3 = this.f50015b.mo52062a(a2);
            if (a3.mo40399a()) {
                return new C13487h<>(null, a3.f33366b);
            }
            arrayList.add(a3.f33365a);
        }
        return new C13487h<>(arrayList, (C18926a) null);
    }
}
