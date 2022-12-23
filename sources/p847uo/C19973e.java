package p847uo;

import android.content.Context;
import android.widget.Toast;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import java.util.ArrayList;
import mf0.C24361g;
import p364al.C13487h;
import p364al.C13488i;
import p583jk.C17880m;
import p605ki.C18066t;
import p682no.C18578a;
import p752qn.C19148f;
import p775ro.C19295b;
import p847uo.C19970c;
import p891wk.C20362q;

/* renamed from: uo.e */
public final /* synthetic */ class C19973e implements C13488i {

    /* renamed from: a */
    public final /* synthetic */ C19974f f50788a;

    public /* synthetic */ C19973e(C19974f fVar) {
        this.f50788a = fVar;
    }

    /* renamed from: a */
    public final void mo40393a(C13487h hVar) {
        C19974f fVar = this.f50788a;
        fVar.getClass();
        if (hVar.mo40399a()) {
            Toast.makeText(((C19964a) fVar.f45943a).getContext(), C18066t.com_masabi_justride_sdk_ticket_info_loading_error, 1).show();
            return;
        }
        C20362q qVar = (C20362q) hVar.f33365a;
        C19967b bVar = fVar.f50795h;
        Context context = ((C19964a) fVar.f45943a).getContext();
        bVar.f50768l.clear();
        ArrayList arrayList = bVar.f50768l;
        String string = context.getString(C18066t.com_masabi_justride_sdk_ticket_info_price_header);
        C17880m mVar = bVar.f50767k;
        C19148f fVar2 = qVar.f51611q;
        mVar.getClass();
        String a = C17880m.m44327a(fVar2);
        C19970c.C19971a aVar = new C19970c.C19971a();
        aVar.f50781a = string;
        C18578a aVar2 = bVar.f50763g;
        aVar.f50782b = aVar2.f47301e;
        aVar.f50783c = a;
        aVar.f50784d = aVar2.f47306j;
        aVar.f50785e = "";
        aVar.f50786f = aVar2.f47302f;
        arrayList.add(aVar.mo52268a());
        bVar.f50768l.add(bVar.mo52267k(context.getString(C18066t.com_masabi_justride_sdk_ticket_info_ticket_number_header), qVar.f51581C, ""));
        ArrayList arrayList2 = bVar.f50768l;
        String string2 = context.getString(C18066t.com_masabi_justride_sdk_ticket_info_fare_type_header);
        arrayList2.add(bVar.mo52267k(string2, qVar.f51613s + " " + qVar.f51612r, ""));
        if (qVar.f51582D.isActive()) {
            bVar.f50768l.add(bVar.mo52266j(qVar.f51608n.f51509d, context.getString(C18066t.com_masabi_justride_sdk_ticket_info_activated_header)));
            bVar.f50768l.add(bVar.mo52266j(qVar.f51608n.f51513h, context.getString(C18066t.com_masabi_justride_sdk_ticket_info_activation_ends_header)));
        } else if (qVar.f51582D.equals(TicketState.USED)) {
            bVar.f50768l.add(bVar.mo52266j(qVar.f51618x, context.getString(C18066t.com_masabi_justride_sdk_ticket_info_used_header)));
        } else if (qVar.f51582D.equals(TicketState.EXPIRED)) {
            bVar.f50768l.add(bVar.mo52266j(qVar.f51618x, context.getString(C18066t.com_masabi_justride_sdk_ticket_info_expired_header)));
        } else if (qVar.f51582D.equals(TicketState.REFUNDED)) {
            bVar.f50768l.add(bVar.mo52266j(qVar.f51618x, context.getString(C18066t.com_masabi_justride_sdk_ticket_info_refunded_header)));
        } else {
            bVar.f50768l.add(bVar.mo52266j(qVar.f51606l.f51514a, context.getString(C18066t.com_masabi_justride_sdk_ticket_info_valid_from_header)));
            bVar.f50768l.add(bVar.mo52266j(qVar.f51606l.f51515b, context.getString(C18066t.com_masabi_justride_sdk_ticket_info_valid_to_header)));
        }
        bVar.f50768l.add(bVar.mo52266j(qVar.f51609o, context.getString(C18066t.com_masabi_justride_sdk_ticket_info_purchased_header)));
        bVar.notifyDataSetChanged();
        String str = qVar.f51612r;
        C19295b bVar2 = ((C19964a) fVar.f45943a).f50760k;
        if (bVar2 != null) {
            bVar2.mo44434y0(str);
        }
        C19964a aVar3 = (C19964a) fVar.f45943a;
        String str2 = qVar.f51601g;
        aVar3.getClass();
        aVar3.f50759j.setText(C24361g.m61186s0(str2));
    }
}
