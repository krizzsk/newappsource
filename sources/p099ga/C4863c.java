package p099ga;

import p099ga.C4869d;
import p125ia.C5316d;

/* renamed from: ga.c */
public final /* synthetic */ class C4863c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C4869d.C4870a f16299b;

    /* renamed from: c */
    public final /* synthetic */ int f16300c;

    public /* synthetic */ C4863c(C4869d.C4870a aVar, int i) {
        this.f16299b = aVar;
        this.f16300c = i;
    }

    public final void run() {
        C4869d.C4870a aVar = this.f16299b;
        int i = this.f16300c;
        C4869d dVar = C4869d.this;
        boolean z = true;
        if (i == -3 || i == -2) {
            if (i != -2) {
                C5316d dVar2 = dVar.f16364d;
                if (dVar2 == null || dVar2.f17512a != 1) {
                    z = false;
                }
                if (!z) {
                    dVar.mo20433c(3);
                    return;
                }
            }
            dVar.mo20432b(0);
            dVar.mo20433c(2);
        } else if (i == -1) {
            dVar.mo20432b(-1);
            dVar.mo20431a();
        } else if (i != 1) {
            dVar.getClass();
        } else {
            dVar.mo20433c(1);
            dVar.mo20432b(1);
        }
    }
}
