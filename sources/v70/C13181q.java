package v70;

import com.moovit.sdk.requests.UploadDataType;
import e70.C4590c;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: v70.q */
public final class C13181q extends C13173i<C13181q, C13182r> {
    public C13181q(C13177m mVar, UploadDataType uploadDataType) {
        super(mVar, C4590c.server_path_sdk_server_url, C4590c.api_path_moovit_sdk_upload_url_request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", uploadDataType.toThriftCategory().getValue());
            jSONObject.put("prefix", "profiler");
        } catch (JSONException unused) {
        }
        this.f32717r = jSONObject;
    }

    public C13181q(C13177m mVar, UploadDataType uploadDataType, long j, long j2, long j3, List list) {
        super(mVar, C4590c.server_path_sdk_server_url, C4590c.api_path_moovit_sdk_upload_url_request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", uploadDataType.toThriftCategory().getValue());
            jSONObject.put("prefix", "");
            jSONObject.put("sequenceId", j3);
            jSONObject.put("startTime", j);
            jSONObject.put("endTime", j2);
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((Integer) it.next());
            }
            jSONObject.put("sensorTypes", jSONArray);
        } catch (JSONException unused) {
        }
        this.f32717r = jSONObject;
    }
}
