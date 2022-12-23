package v70;

import com.moovit.commons.request.BadResponseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p229r1.C6233c;

/* renamed from: v70.f */
public final class C13169f extends C13175k<C13169f, List<C13170a>> {

    /* renamed from: v70.f$a */
    public static class C13170a {

        /* renamed from: a */
        public final String f32713a;

        /* renamed from: b */
        public final List<C6233c<Integer, String>> f32714b;

        public C13170a(String str, ArrayList arrayList) {
            this.f32713a = str;
            this.f32714b = arrayList;
        }
    }

    /* renamed from: e */
    public final Object mo40054e(JSONObject jSONObject) throws BadResponseException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("analyticRecords");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("event");
                JSONArray jSONArray2 = jSONObject2.getJSONArray("dimensions");
                int length2 = jSONArray2.length();
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    arrayList2.add(new C6233c(Integer.valueOf(jSONObject3.getInt("index")), jSONObject3.getString("value")));
                }
                arrayList.add(new C13170a(string, arrayList2));
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return arrayList;
    }
}
