package p862vf;

import android.os.Bundle;
import com.google.android.gms.common.util.BiConsumer;
import java.util.Map;
import org.json.JSONObject;
import p434dd.C16545c;
import p836ud.C19885a;
import p886wf.C20299d;
import p956ze.C20839b;

/* renamed from: vf.d */
public final /* synthetic */ class C20120d implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C16545c f51048a;

    public /* synthetic */ C20120d(C16545c cVar) {
        this.f51048a = cVar;
    }

    public final void accept(Object obj, Object obj2) {
        JSONObject optJSONObject;
        C16545c cVar = this.f51048a;
        String str = (String) obj;
        C20299d dVar = (C20299d) obj2;
        C19885a aVar = (C19885a) ((C20839b) cVar.f43180a).get();
        if (aVar != null) {
            JSONObject jSONObject = dVar.f51473e;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = dVar.f51470b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (((Map) cVar.f43181b)) {
                            if (!optString.equals(((Map) cVar.f43181b).get(str))) {
                                ((Map) cVar.f43181b).put(str, optString);
                                Bundle b = C25541a.m63872b("arm_key", str);
                                b.putString("arm_value", jSONObject2.optString(str));
                                b.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                b.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                b.putString("group", optJSONObject.optString("group"));
                                aVar.mo52166a("fp", "personalization_assignment", b);
                                Bundle bundle = new Bundle();
                                bundle.putString("_fpid", optString);
                                aVar.mo52166a("fp", "_fpc", bundle);
                            }
                        }
                    }
                }
            }
        }
    }
}
