package t70;

import com.moovit.sdk.profilers.schedule.ScheduleConfig;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q70.C19094a;

/* renamed from: t70.b */
public abstract class C19641b<CP extends ScheduleConfig> extends C19094a<CP> {
    /* renamed from: c */
    public static ArrayList m47089c(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject("onSchedule").getJSONArray("weekSchedule");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            int i2 = jSONObject2.getInt("dayOfWeek");
            TimeUnit timeUnit = TimeUnit.MINUTES;
            arrayList.add(new C19639a(i2, (int) timeUnit.toMillis((long) jSONObject2.getInt("startTimeInMin")), (int) timeUnit.toMillis((long) jSONObject2.getInt("endTimeInMin"))));
        }
        return arrayList;
    }
}
