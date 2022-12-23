package p821tm;

import ce0.C21100e;
import com.masabi.justride.sdk.jobs.ticket.get.TicketSummaryBuilderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import p634ln.C18247a;
import p702ok.C18777c;
import p798sn.C19493a;
import p891wk.C20344a;
import p891wk.C20346b;
import p891wk.C20349d;
import p891wk.C20359n;
import p891wk.C20362q;

/* renamed from: tm.r */
public final class C19714r {
    /* renamed from: a */
    public static C19493a m47180a(C20362q qVar) throws TicketSummaryBuilderException {
        Integer num;
        Integer num2;
        Long l;
        Long l2;
        boolean z;
        String str;
        List list;
        C18247a aVar;
        C18247a aVar2;
        String str2;
        Long l3;
        Date date;
        Date date2;
        Date date3;
        Date date4;
        List list2;
        C20362q qVar2 = qVar;
        C20344a aVar3 = qVar2.f51608n;
        if (aVar3 != null) {
            l2 = aVar3.f51509d;
            l = aVar3.f51513h;
            num2 = aVar3.f51510e;
            num = aVar3.f51512g;
            z = aVar3.f51508c;
        } else {
            z = false;
            l2 = null;
            l = null;
            num2 = null;
            num = null;
        }
        C20346b bVar = qVar2.f51596b;
        if (bVar != null) {
            str = bVar.f51517b;
        } else {
            str = null;
        }
        C20359n nVar = qVar2.f51607m;
        if (nVar != null) {
            aVar2 = nVar.f51569c.mo51257a();
            aVar = qVar2.f51607m.f51570d.mo51257a();
            List<C18777c> list3 = qVar2.f51607m.f51572f;
            if (list3 == null) {
                list2 = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C18777c a : list3) {
                    arrayList.add(a.mo51257a());
                }
                list2 = arrayList;
            }
            list = C21100e.m49362r0(list2);
        } else {
            aVar2 = null;
            aVar = null;
            list = null;
        }
        C20349d dVar = qVar2.f51591M;
        if (dVar != null) {
            str2 = dVar.f51526b;
        } else {
            str2 = null;
        }
        C19713q qVar3 = new C19713q();
        qVar3.f50097a = qVar2.f51613s;
        Long l4 = qVar2.f51618x;
        if (l4 != null) {
            l3 = l2;
            date = new Date(l4.longValue());
        } else {
            l3 = l2;
            date = null;
        }
        qVar3.f50098b = date;
        Long l5 = qVar2.f51619y;
        if (l5 != null) {
            date2 = new Date(l5.longValue());
        } else {
            date2 = null;
        }
        qVar3.f50099c = date2;
        qVar3.f50100d = qVar2.f51612r;
        qVar3.f50101e = qVar2.f51582D.name();
        qVar3.f50102f = qVar2.f51581C;
        qVar3.f50103g = new Date(qVar2.f51606l.f51514a.longValue());
        qVar3.f50104h = new Date(qVar2.f51606l.f51515b.longValue());
        if (l3 != null) {
            date3 = new Date(l3.longValue());
        } else {
            date3 = null;
        }
        qVar3.f50106j = date3;
        if (l != null) {
            date4 = new Date(l.longValue());
        } else {
            date4 = null;
        }
        qVar3.f50107k = date4;
        qVar3.f50112p = qVar2.f51611q;
        qVar3.f50113q = qVar2.f51599e;
        qVar3.f50111o = str;
        qVar3.f50115s = num2;
        qVar3.f50114r = num;
        qVar3.f50105i = new Date(qVar2.f51609o.longValue());
        qVar3.f50108l = aVar2;
        qVar3.f50109m = aVar;
        qVar3.f50110n = C21100e.m49362r0(list);
        qVar3.f50116t = qVar2.f51587I;
        qVar3.f50117u = C21100e.m49362r0(qVar2.f51600f);
        qVar3.f50118v = str2;
        qVar3.f50119w = qVar2.f51579A;
        qVar3.f50120x = qVar2.f51593O;
        qVar3.f50121y = qVar2.f51604j.booleanValue();
        qVar3.f50122z = z;
        return qVar3.mo52063a();
    }
}
