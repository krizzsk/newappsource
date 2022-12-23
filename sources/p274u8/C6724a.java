package p274u8;

import com.appboy.support.AppboyFileUtils;
import java.io.File;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p001a0.C0016g;
import p584jl.C17885a;

/* renamed from: u8.a */
public final class C6724a {

    /* renamed from: a */
    public String f20820a;

    /* renamed from: b */
    public String f20821b;

    /* renamed from: c */
    public Long f20822c;

    public C6724a(String str) {
        this.f20822c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f20821b = str;
        StringBuffer q = C0016g.m33q("error_log_");
        Long l = this.f20822c;
        if (l != null) {
            q.append(l.longValue());
            q.append(".json");
            String stringBuffer = q.toString();
            C24362h.m61210e(stringBuffer, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
            this.f20820a = stringBuffer;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f20822c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f20821b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        C24362h.m61210e(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public C6724a(File file) {
        C24362h.m61211f(file, AppboyFileUtils.FILE_SCHEME);
        String name = file.getName();
        C24362h.m61210e(name, "file.name");
        this.f20820a = name;
        JSONObject o0 = C17885a.m44453o0(name);
        if (o0 != null) {
            this.f20822c = Long.valueOf(o0.optLong("timestamp", 0));
            this.f20821b = o0.optString("error_message", (String) null);
        }
    }
}
