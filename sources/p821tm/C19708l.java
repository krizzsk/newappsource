package p821tm;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.android.play.core.assetpacks.C14248b1;
import com.masabi.justride.sdk.error.ConvertedErrorException;
import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import java.util.ArrayList;
import java.util.List;
import p332z4.C7469h;
import p364al.C13487h;
import p465ek.C16835c;
import p583jk.C17873f;
import p583jk.C17875h;
import p725pj.C18926a;
import p728pm.C18933a;
import p773rm.C19290c;
import p891wk.C20362q;
import p962zk.C20872a;

/* renamed from: tm.l */
public final class C19708l {

    /* renamed from: a */
    public final C7469h f50050a;

    /* renamed from: b */
    public final C19290c f50051b;

    public C19708l(C7469h hVar, C19290c cVar) {
        this.f50050a = hVar;
        this.f50051b = cVar;
    }

    /* renamed from: a */
    public final C13487h<C20872a> mo52057a() {
        C13487h hVar;
        C7469h hVar2 = this.f50050a;
        hVar2.getClass();
        try {
            hVar = ((C14248b1) hVar2.f22901b).mo42802b(((C18933a) hVar2.f22902c).mo51447a().f51528a, false);
            if (!hVar.mo40399a()) {
                ArrayList arrayList = new ArrayList();
                for (C20362q qVar : (List) hVar.f33365a) {
                    if (qVar.f51582D != TicketState.UNKNOWN) {
                        arrayList.add(qVar);
                    }
                }
                hVar = new C13487h(arrayList, (C18926a) null);
            }
        } catch (ConvertedErrorException e) {
            ((C17873f) hVar2.f22900a).getClass();
            hVar = new C13487h(null, new C16835c(C17873f.m44275b(e), Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        if (hVar.mo40399a()) {
            return new C13487h<>(null, new C16835c(hVar.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        List<C20362q> list = (List) hVar.f33365a;
        C19290c cVar = this.f50051b;
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (C20362q qVar2 : list) {
            if (C17875h.m44278B(qVar2.f51584F) || cVar.f49043b.containsAll(qVar2.f51584F)) {
                arrayList2.add(qVar2);
            }
        }
        return new C13487h<>(new C20872a(arrayList2, list.size() - arrayList2.size()), (C18926a) null);
    }
}
