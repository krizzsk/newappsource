package p060d6;

import com.bumptech.glide.load.data.C2142d;
import com.bumptech.glide.load.engine.C2169c;
import com.bumptech.glide.load.engine.C2188i;
import p025b6.C1487b;
import p108h6.C5104n;

/* renamed from: d6.o */
public final class C4401o implements C2142d.C2143a<Object> {

    /* renamed from: b */
    public final /* synthetic */ C5104n.C5105a f15453b;

    /* renamed from: c */
    public final /* synthetic */ C2188i f15454c;

    public C4401o(C2188i iVar, C5104n.C5105a aVar) {
        this.f15454c = iVar;
        this.f15453b = aVar;
    }

    /* renamed from: c */
    public final void mo10913c(Exception exc) {
        boolean z;
        C2188i iVar = this.f15454c;
        C5104n.C5105a<?> aVar = this.f15453b;
        C5104n.C5105a<?> aVar2 = iVar.f7141g;
        if (aVar2 == null || aVar2 != aVar) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C2188i iVar2 = this.f15454c;
            C5104n.C5105a aVar3 = this.f15453b;
            C2169c.C2170a aVar4 = iVar2.f7137c;
            C4382c cVar = iVar2.f7142h;
            C2142d<Data> dVar = aVar3.f17106c;
            aVar4.mo10923b(cVar, exc, dVar, dVar.mo6610d());
        }
    }

    /* renamed from: f */
    public final void mo10914f(Object obj) {
        boolean z;
        C2188i iVar = this.f15454c;
        C5104n.C5105a<?> aVar = this.f15453b;
        C5104n.C5105a<?> aVar2 = iVar.f7141g;
        if (aVar2 == null || aVar2 != aVar) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C2188i iVar2 = this.f15454c;
            C5104n.C5105a aVar3 = this.f15453b;
            C4385f fVar = iVar2.f7136b.f7057p;
            if (obj == null || !fVar.mo19904c(aVar3.f17106c.mo6610d())) {
                C2169c.C2170a aVar4 = iVar2.f7137c;
                C1487b bVar = aVar3.f17104a;
                C2142d<Data> dVar = aVar3.f17106c;
                aVar4.mo10922a(bVar, obj, dVar, dVar.mo6610d(), iVar2.f7142h);
                return;
            }
            iVar2.f7140f = obj;
            iVar2.f7137c.mo10928g();
        }
    }
}
