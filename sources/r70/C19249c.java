package r70;

import com.moovit.sdk.protocol.ProtocolEnums$MVProfilerStopReason;
import org.json.JSONException;
import org.json.JSONObject;
import u70.C13136a;

/* renamed from: r70.c */
public final class C19249c extends C13136a {

    /* renamed from: b */
    public long f48887b;

    /* renamed from: c */
    public int f48888c;

    /* renamed from: d */
    public final int f48889d;

    /* renamed from: e */
    public final String f48890e;

    public C19249c(int i, int i2, String str, long j) {
        super("profilerRecordingStop");
        this.f48887b = j;
        this.f48890e = str;
        this.f48889d = i;
        this.f48888c = i2;
    }

    /* renamed from: e */
    public final JSONObject mo40045e() {
        ProtocolEnums$MVProfilerStopReason protocolEnums$MVProfilerStopReason;
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f48888c;
        if (i == 1) {
            protocolEnums$MVProfilerStopReason = ProtocolEnums$MVProfilerStopReason.EXPIRED;
        } else if (i != 2) {
            protocolEnums$MVProfilerStopReason = null;
        } else {
            protocolEnums$MVProfilerStopReason = ProtocolEnums$MVProfilerStopReason.PUSH;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("profilerType", this.f48889d);
            jSONObject.put("sequenceId", this.f48887b);
            jSONObject.put("timestamp", currentTimeMillis);
            if (protocolEnums$MVProfilerStopReason != null) {
                jSONObject.put("stopReason", protocolEnums$MVProfilerStopReason);
            }
            jSONObject.put("metroId", this.f48890e);
        } catch (JSONException e) {
            e.toString();
        }
        return jSONObject;
    }
}
