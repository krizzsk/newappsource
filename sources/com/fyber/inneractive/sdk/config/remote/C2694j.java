package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.j */
public class C2694j {

    /* renamed from: a */
    public Boolean f9402a;

    /* renamed from: b */
    public Integer f9403b;

    /* renamed from: c */
    public Integer f9404c;

    /* renamed from: d */
    public Skip f9405d;

    /* renamed from: e */
    public Boolean f9406e;

    /* renamed from: f */
    public TapAction f9407f;

    /* renamed from: g */
    public Orientation f9408g;

    /* renamed from: h */
    public Integer f9409h;

    /* renamed from: i */
    public Integer f9410i;

    /* renamed from: j */
    public UnitDisplayType f9411j;

    /* renamed from: k */
    public List<Integer> f9412k = new ArrayList();

    /* renamed from: a */
    public static C2694j m6767a(JSONObject jSONObject) {
        Boolean bool;
        Boolean bool2;
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C2694j jVar = new C2694j();
        Integer valueOf = Integer.valueOf(jSONObject.optInt("maxBitrate", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("minBitrate", Integer.MIN_VALUE));
        Integer valueOf3 = Integer.valueOf(jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE));
        Integer valueOf4 = Integer.valueOf(jSONObject.optInt("padding", Integer.MIN_VALUE));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        jVar.f9403b = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        jVar.f9404c = valueOf2;
        jVar.f9405d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        if (jSONObject.has("muted")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("muted", true));
        } else {
            bool = null;
        }
        jVar.f9406e = bool;
        if (jSONObject.has("autoPlay")) {
            bool2 = Boolean.valueOf(jSONObject.optBoolean("autoPlay", true));
        } else {
            bool2 = null;
        }
        jVar.f9402a = bool2;
        jVar.f9408g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f9407f = TapAction.fromValue(jSONObject.optString("tap"));
        if (valueOf3.intValue() == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        jVar.f9409h = valueOf3;
        if (valueOf4.intValue() != Integer.MIN_VALUE) {
            num = valueOf4;
        }
        jVar.f9410i = num;
        jVar.f9411j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt = optJSONArray.optInt(i, Integer.MIN_VALUE);
                if (optInt != Integer.MIN_VALUE) {
                    jVar.f9412k.add(Integer.valueOf(optInt));
                }
            }
        }
        return jVar;
    }
}
