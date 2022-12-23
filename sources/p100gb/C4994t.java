package p100gb;

import p100gb.C4995u;
import p646lz.C18299a;
import p646lz.C18304b;

/* renamed from: gb.t */
public final /* synthetic */ class C4994t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f16880b;

    /* renamed from: c */
    public final /* synthetic */ Object f16881c;

    /* renamed from: d */
    public final /* synthetic */ Object f16882d;

    /* renamed from: e */
    public final /* synthetic */ Object f16883e;

    /* renamed from: f */
    public final /* synthetic */ Object f16884f;

    public /* synthetic */ C4994t(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f16880b = i;
        this.f16881c = obj;
        this.f16882d = obj2;
        this.f16883e = obj3;
        this.f16884f = obj4;
    }

    public final void run() {
        switch (this.f16880b) {
            case 0:
                C4995u.C4996a aVar = (C4995u.C4996a) this.f16881c;
                ((C4995u) this.f16882d).mo20591o(aVar.f16885a, aVar.f16886b, (C4978i) this.f16883e, (C4983l) this.f16884f);
                return;
            default:
                C18299a aVar2 = (C18299a) this.f16881c;
                String str = (String) this.f16882d;
                C18304b bVar = (C18304b) this.f16883e;
                C18299a.C18303d dVar = (C18299a.C18303d) this.f16884f;
                synchronized (aVar2) {
                    if (aVar2.f46673l.mo47007p(str, bVar)) {
                        Object obj = dVar.f46683b;
                        if (obj != null) {
                            bVar.mo44554g(obj, str);
                        } else {
                            bVar.mo44553d(dVar.f46684c, str);
                        }
                    }
                }
                return;
        }
    }
}
