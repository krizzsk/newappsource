package p70;

import com.moovit.sdk.profilers.activitytransition.config.ActivityTransitionConfig;
import com.moovit.sdk.profilers.config.BaseConfig;
import com.moovit.sdk.protocol.ProtocolEnums$ActivityRecognitionType;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q70.C19094a;

/* renamed from: p70.a */
public final class C18886a extends C19094a<ActivityTransitionConfig> {
    public C18886a(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: b */
    public final BaseConfig mo51353b(JSONObject jSONObject, long j, int i) throws JSONException {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = jSONObject.getJSONObject("activityTransitionProfiler").getJSONArray("types");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            hashMap.put(ProtocolEnums$ActivityRecognitionType.findByValue(jSONObject2.getInt("type")), Integer.valueOf(jSONObject2.getInt("locationSampleMin")));
        }
        return new ActivityTransitionConfig(j, i, hashMap);
    }
}
