package v70;

import e70.C4590c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y70.C13256a;

/* renamed from: v70.g */
public final class C13171g extends C13173i<C13171g, C13172h> {

    /* renamed from: t */
    public List<C13256a.C13259c> f32715t;

    public C13171g(C13177m mVar, ArrayList arrayList) {
        super(mVar, C4590c.api_path_moovit_sdk_heartbeat_request, C13172h.class);
        this.f32715t = arrayList;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C13256a.C13259c) it.next()).f32911b);
            }
            jSONObject.put("messages", jSONArray);
        } catch (JSONException unused) {
        }
        this.f32717r = jSONObject;
    }
}
