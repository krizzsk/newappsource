package p821tm;

import ce0.C21100e;
import com.google.android.material.internal.C14080o;
import com.masabi.justride.sdk.jobs.ticket.get.TicketDetailsBuilderException;
import com.masabi.justride.sdk.models.ticket.ValidationMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import p364al.C13487h;
import p583jk.C17873f;
import p583jk.C17880m;
import p583jk.C17883o;
import p634ln.C18247a;
import p702ok.C18777c;
import p725pj.C18926a;
import p752qn.C19143a;
import p752qn.C19145c;
import p752qn.C19146d;
import p752qn.C19148f;
import p752qn.C19150h;
import p752qn.C19151i;
import p891wk.C20346b;
import p891wk.C20349d;
import p891wk.C20359n;
import p891wk.C20362q;
import p891wk.C20370y;
import p940ym.C20745a;

/* renamed from: tm.p */
public final class C19712p {

    /* renamed from: a */
    public final C14080o f50092a;

    /* renamed from: b */
    public final C17880m f50093b;

    /* renamed from: c */
    public final C17883o f50094c;

    /* renamed from: d */
    public final C20745a f50095d;

    /* renamed from: e */
    public final C17873f f50096e;

    public C19712p(C14080o oVar, C17880m mVar, C17883o oVar2, C20745a aVar, C17873f fVar) {
        this.f50092a = oVar;
        this.f50093b = mVar;
        this.f50094c = oVar2;
        this.f50095d = aVar;
        this.f50096e = fVar;
    }

    /* renamed from: a */
    public final C13487h<C19150h> mo52062a(C20362q qVar) {
        C19146d dVar;
        List<C18247a> list;
        C20346b bVar = qVar.f51596b;
        if (bVar != null) {
            dVar = new C19146d(bVar.f51517b, bVar.f51518c, bVar.f51519d, bVar.f51516a);
        } else {
            dVar = null;
        }
        C19143a a = this.f50092a.mo41889a(qVar.f51608n);
        C17883o oVar = this.f50094c;
        Long l = qVar.f51619y;
        oVar.getClass();
        Date a2 = C17883o.m44329a(l);
        C17883o oVar2 = this.f50094c;
        Long l2 = qVar.f51618x;
        oVar2.getClass();
        Date a3 = C17883o.m44329a(l2);
        C17883o oVar3 = this.f50094c;
        Long l3 = qVar.f51609o;
        oVar3.getClass();
        Date a4 = C17883o.m44329a(l3);
        C17883o oVar4 = this.f50094c;
        Long l4 = qVar.f51606l.f51514a;
        oVar4.getClass();
        Date a5 = C17883o.m44329a(l4);
        C17883o oVar5 = this.f50094c;
        Long l5 = qVar.f51606l.f51515b;
        oVar5.getClass();
        Date a6 = C17883o.m44329a(l5);
        String T = C21100e.m49325T(qVar.f51613s, qVar.f51612r);
        C19711o oVar6 = new C19711o();
        oVar6.f50071f = qVar.f51581C;
        oVar6.f50066a = qVar.f51613s;
        oVar6.f50069d = qVar.f51612r;
        oVar6.f50078m = T;
        oVar6.f50072g = qVar.f51587I;
        oVar6.f50084s = dVar;
        oVar6.f50090y = qVar.f51601g;
        oVar6.f50070e = qVar.f51582D.getBrokerName();
        oVar6.f50080o = a;
        oVar6.f50079n = a4;
        oVar6.f50076k = a5;
        oVar6.f50077l = a6;
        oVar6.f50067b = a3;
        oVar6.f50068c = a2;
        C19148f fVar = qVar.f51611q;
        oVar6.f50085t = fVar;
        this.f50093b.getClass();
        oVar6.f50086u = C17880m.m44327a(fVar);
        oVar6.f50087v = qVar.f51617w;
        oVar6.f50056A = qVar.f51599e;
        oVar6.f50073h = qVar.f51600f;
        oVar6.f50057B = ValidationMethod.parse(qVar.f51602h);
        oVar6.f50058C = qVar.f51620z;
        oVar6.f50059D = qVar.f51588J;
        oVar6.f50060E = qVar.f51590L;
        oVar6.f50089x = qVar.f51584F;
        oVar6.f50074i = qVar.f51597c;
        oVar6.f50075j = qVar.f51583E;
        oVar6.f50088w = qVar.f51604j;
        oVar6.f50061F = Boolean.valueOf(qVar.f51592N);
        C20359n nVar = qVar.f51607m;
        if (nVar != null) {
            List<C18777c> list2 = nVar.f51572f;
            if (list2 == null) {
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C18777c a7 : list2) {
                    arrayList.add(a7.mo51257a());
                }
                list = arrayList;
            }
            oVar6.f50081p = nVar.f51569c.mo51257a();
            oVar6.f50083r = nVar.f51570d.mo51257a();
            oVar6.f50082q = list;
        }
        C20349d dVar2 = qVar.f51591M;
        if (dVar2 != null) {
            oVar6.f50091z = dVar2.f51526b;
        }
        List<C20370y> list3 = qVar.f51615u;
        if (list3 != null) {
            LinkedList linkedList = new LinkedList();
            for (C20370y next : list3) {
                C19145c cVar = new C19145c(next.f51653g, next.f51650d, Boolean.TRUE.equals(next.f51652f));
                if (next.f51651e.booleanValue()) {
                    linkedList.addFirst(cVar);
                } else {
                    linkedList.addLast(cVar);
                }
            }
            oVar6.f50062G = linkedList;
        }
        oVar6.f50063H = qVar.f51579A;
        oVar6.f50064I = qVar.f51593O;
        C13487h<C19151i> a8 = this.f50095d.mo52890a(qVar);
        if (a8.mo40399a()) {
            return new C13487h<>(null, a8.f33366b);
        }
        oVar6.f50065J = (C19151i) a8.f33365a;
        try {
            return new C13487h<>(oVar6.mo52061a(), (C18926a) null);
        } catch (TicketDetailsBuilderException e) {
            this.f50096e.getClass();
            return new C13487h<>(null, C17873f.m44275b(e));
        }
    }
}
