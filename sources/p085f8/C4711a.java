package p085f8;

import com.facebook.appevents.codeless.internal.PathComponent;
import java.util.ArrayList;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f8.a */
public final class C4711a {

    /* renamed from: a */
    public final String f15994a;

    /* renamed from: b */
    public final String f15995b;

    /* renamed from: c */
    public final ArrayList f15996c;

    /* renamed from: d */
    public final String f15997d;

    public C4711a(JSONObject jSONObject) {
        String string = jSONObject.getString("name");
        C24362h.m61210e(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f15994a = string;
        String optString = jSONObject.optString("value");
        C24362h.m61210e(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f15995b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        C24362h.m61210e(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f15997d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int i = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    C24362h.m61210e(jSONObject2, "jsonPathArray.getJSONObject(i)");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        this.f15996c = arrayList;
    }
}
