package p412cn;

import com.masabi.justride.sdk.internal.models.ticket_activation.TicketActivationRecordList;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p364al.C13487h;
import p413co.C13867m;
import p413co.C13872r;
import p441dk.C16672a;
import p513gk.C17200a;
import p561ik.C17618a;
import p725pj.C18926a;
import p774rn.C19292b;
import p913xi.C20531d;

/* renamed from: cn.a */
public final class C13851a {

    /* renamed from: a */
    public final C13867m f34070a;

    /* renamed from: b */
    public final C20531d f34071b;

    public C13851a(C13867m mVar, C20531d dVar) {
        this.f34070a = mVar;
        this.f34071b = dVar;
    }

    /* renamed from: a */
    public final C13487h<List<C19292b>> mo40780a(String str) {
        C13872r<String> a = this.f34070a.mo40781a(C25541a.m63881k("activations-", str));
        if (a.mo40817a()) {
            return new C13487h<>(null, new C17200a(a.f34120b, C16672a.f43403f, "No item was found for the provided key"));
        }
        String str2 = (String) a.f34119a;
        if (str2 == null) {
            return new C13487h<>(new ArrayList(), (C18926a) null);
        }
        try {
            return new C13487h<>((List) this.f34071b.mo52732a(TicketActivationRecordList.class, str2), (C18926a) null);
        } catch (JSONException e) {
            return new C13487h<>(null, new C17200a(new C17618a(e.getMessage()), C17200a.f44442e, "Read failed"));
        }
    }
}
