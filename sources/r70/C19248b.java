package r70;

import android.content.Context;
import com.moovit.sdk.protocol.ProtocolEnums$MVLocationState;
import com.moovit.sdk.protocol.ProtocolEnums$MVStartState;
import org.json.JSONException;
import org.json.JSONObject;
import p977zz.C20934d0;
import u70.C13136a;

/* renamed from: r70.b */
public final class C19248b extends C13136a {

    /* renamed from: b */
    public Context f48881b;

    /* renamed from: c */
    public final int f48882c;

    /* renamed from: d */
    public final String f48883d;

    /* renamed from: e */
    public final long f48884e;

    /* renamed from: f */
    public final int f48885f;

    /* renamed from: g */
    public final String f48886g;

    public C19248b(long j, String str, int i, Context context, int i2, String str2) {
        super("profilerRecordingStart");
        this.f48884e = j;
        this.f48886g = str;
        this.f48885f = i;
        this.f48881b = context;
        this.f48882c = i2;
        this.f48883d = str2;
    }

    /* renamed from: e */
    public final JSONObject mo40045e() {
        ProtocolEnums$MVLocationState protocolEnums$MVLocationState;
        ProtocolEnums$MVStartState protocolEnums$MVStartState;
        long currentTimeMillis = System.currentTimeMillis();
        Long l = -1L;
        long longValue = Long.valueOf(this.f48881b.getSharedPreferences("moovit_sdk_cfg_last_modified_prefs_name", 0).getLong("configuration_handler_last_modified_key", l.longValue())).longValue();
        if (!C20934d0.m49032c(this.f48881b)) {
            protocolEnums$MVLocationState = ProtocolEnums$MVLocationState.NO_PERMISSION;
        } else if (C20934d0.m49034e(this.f48881b)) {
            protocolEnums$MVLocationState = ProtocolEnums$MVLocationState.LOCATION_AVAILABLE;
        } else {
            protocolEnums$MVLocationState = ProtocolEnums$MVLocationState.LOCATION_NOT_AVAILABLE;
        }
        int i = this.f48882c;
        if (i == 2) {
            protocolEnums$MVStartState = ProtocolEnums$MVStartState.RECOVERIBLE;
        } else if (i != 3) {
            protocolEnums$MVStartState = ProtocolEnums$MVStartState.f23111OK;
        } else {
            protocolEnums$MVStartState = ProtocolEnums$MVStartState.UNRECOVERIABLE;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("profilerType", this.f48885f);
            jSONObject.put("sequenceId", this.f48884e);
            jSONObject.put("timestamp", currentTimeMillis);
            jSONObject.put("startStateId", protocolEnums$MVStartState.getValue());
            jSONObject.put("stateDescription", this.f48883d);
            jSONObject.put("locationStateId", protocolEnums$MVLocationState.getValue());
            jSONObject.put("metroId", this.f48886g);
            jSONObject.put("expectedProfilerTimeInMinutes", -1);
            jSONObject.put("profilerConfigurationTimestamp", longValue);
        } catch (JSONException e) {
            e.toString();
        }
        return jSONObject;
    }
}
