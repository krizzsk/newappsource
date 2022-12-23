package p444dn;

import com.masabi.justride.sdk.internal.models.ticket_activation.TicketActivationRecordList;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p364al.C13483d;
import p364al.C13487h;
import p413co.C13867m;
import p413co.C13872r;
import p513gk.C17200a;
import p561ik.C17618a;
import p725pj.C18926a;
import p774rn.C19292b;
import p913xi.C20531d;

/* renamed from: dn.b */
public final class C16687b implements C13483d<Void> {

    /* renamed from: a */
    public final C13867m f43471a;

    /* renamed from: b */
    public final C20531d f43472b;

    /* renamed from: c */
    public final String f43473c;

    /* renamed from: d */
    public final List<C19292b> f43474d;

    /* renamed from: dn.b$a */
    public static class C16688a {

        /* renamed from: a */
        public final C13867m f43475a;

        /* renamed from: b */
        public final C20531d f43476b;

        public C16688a(C13867m mVar, C20531d dVar) {
            this.f43475a = mVar;
            this.f43476b = dVar;
        }
    }

    public C16687b(C13867m mVar, C20531d dVar, String str, ArrayList arrayList) {
        this.f43471a = mVar;
        this.f43472b = dVar;
        this.f43473c = str;
        this.f43474d = arrayList;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        try {
            String b = this.f43472b.mo52733b(new TicketActivationRecordList(this.f43474d));
            StringBuilder k = C13555b.m33972k("activations-");
            k.append(this.f43473c);
            C13872r<Void> b2 = this.f43471a.mo40782b(k.toString(), b);
            if (b2.mo40817a()) {
                return new C13487h<>(null, new C17200a(b2.f34120b, C17200a.f44443f, "Write failed"));
            }
            return new C13487h<>(null, (C18926a) null);
        } catch (JSONException e) {
            return new C13487h<>(null, new C17200a(new C17618a(e.getMessage()), C17200a.f44443f, "Write failed"));
        }
    }
}
