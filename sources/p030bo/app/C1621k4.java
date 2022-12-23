package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.braze.models.BrazeGeofence;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.k4 */
public final class C1621k4 {

    /* renamed from: a */
    public static final String f5789a = AppboyLogger.getBrazeLogTag(C1621k4.class);

    /* renamed from: a */
    public static List<BrazeGeofence> m4402a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                try {
                    AppboyLogger.m5459w(f5789a, "Received null or blank geofence Json. Not parsing.");
                } catch (JSONException e) {
                    String str = f5789a;
                    AppboyLogger.m5460w(str, "Failed to deserialize geofence Json due to JSONException: " + optJSONObject, e);
                } catch (Exception e2) {
                    String str2 = f5789a;
                    AppboyLogger.m5452e(str2, "Failed to deserialize geofence Json:" + optJSONObject, e2);
                }
            } else {
                arrayList.add(new BrazeGeofence(optJSONObject));
            }
        }
        return arrayList;
    }
}
