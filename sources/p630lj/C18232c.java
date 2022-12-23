package p630lj;

import com.masabi.justride.sdk.internal.models.ticket_activation.TicketActivationRecordList;
import org.json.JSONException;
import org.json.JSONObject;
import p358af.C13437d;
import p774rn.C19292b;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: lj.c */
public final class C18232c extends C20528a<TicketActivationRecordList> {
    public C18232c(C20531d dVar) {
        super(dVar, TicketActivationRecordList.class);
    }

    /* renamed from: a */
    public final Object mo50643a(String str) throws JSONException {
        return new TicketActivationRecordList(mo52727l(new JSONObject(C13437d.m33706k("{ root : ", str, " }")), "root", C19292b.class));
    }

    /* renamed from: b */
    public final String mo50644b(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "root", (TicketActivationRecordList) obj);
        return jSONObject.getJSONArray("root").toString();
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new TicketActivationRecordList(mo52727l(jSONObject, "root", C19292b.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "root", (TicketActivationRecordList) obj);
        return jSONObject;
    }
}
