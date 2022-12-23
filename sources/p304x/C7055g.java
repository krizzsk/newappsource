package p304x;

import androidx.activity.C0199g;
import java.util.ArrayList;
import java.util.List;
import p019b0.C1431h;
import p054d0.C4291k0;
import p102h0.C5015a;
import p102h0.C5019d;
import p102h0.C5023g;
import p304x.C7045f0;
import p695od.C18728c;

/* renamed from: x.g */
public final /* synthetic */ class C7055g implements C5015a {

    /* renamed from: a */
    public final /* synthetic */ C7090q f21943a;

    /* renamed from: b */
    public final /* synthetic */ List f21944b;

    /* renamed from: c */
    public final /* synthetic */ int f21945c;

    /* renamed from: d */
    public final /* synthetic */ int f21946d;

    /* renamed from: e */
    public final /* synthetic */ int f21947e;

    public /* synthetic */ C7055g(C7090q qVar, ArrayList arrayList, int i, int i2, int i3) {
        this.f21943a = qVar;
        this.f21944b = arrayList;
        this.f21945c = i;
        this.f21946d = i2;
        this.f21947e = i3;
    }

    public final C18728c apply(Object obj) {
        boolean z;
        C18728c cVar;
        C7090q qVar = this.f21943a;
        List list = this.f21944b;
        int i = this.f21945c;
        int i2 = this.f21946d;
        int i3 = this.f21947e;
        Void voidR = (Void) obj;
        C7045f0 f0Var = qVar.f22047n;
        C1431h hVar = new C1431h(f0Var.f21912c);
        C7045f0.C7048c cVar2 = new C7045f0.C7048c(f0Var.f21915f, f0Var.f21913d, f0Var.f21910a, f0Var.f21914e, hVar);
        if (i == 0) {
            cVar2.f21930g.add(new C7045f0.C7047b(f0Var.f21910a));
        }
        if (f0Var.f21911b.f5286a || f0Var.f21915f == 3 || i3 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar2.f21930g.add(new C7045f0.C7053f(f0Var.f21910a, i2));
        } else {
            cVar2.f21930g.add(new C7045f0.C7046a(f0Var.f21910a, i2, hVar));
        }
        C18728c e = C5023g.m12857e((Object) null);
        if (!cVar2.f21930g.isEmpty()) {
            if (cVar2.f21931h.mo23304b()) {
                C7045f0.C7051e eVar = new C7045f0.C7051e(0, (C4291k0) null);
                cVar2.f21926c.mo23326c(eVar);
                cVar = eVar.f21934b;
            } else {
                cVar = C5023g.m12857e((Object) null);
            }
            e = C5019d.m12842a(cVar).mo20734c(new C7056g0(cVar2, i2), cVar2.f21925b).mo20734c(new C7059h0(cVar2), cVar2.f21925b);
        }
        C5019d c = C5019d.m12842a(e).mo20734c(new C7062i0(cVar2, list, i2), cVar2.f21925b);
        c.addListener(new C0199g(cVar2, 1), cVar2.f21925b);
        return C5023g.m12858f(c);
    }
}
