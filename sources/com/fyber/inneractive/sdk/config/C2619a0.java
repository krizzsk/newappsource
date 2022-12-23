package com.fyber.inneractive.sdk.config;

import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3712m0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a0 */
public class C2619a0 implements C2624b0, C3712m0.C3713a {

    /* renamed from: a */
    public Boolean f9247a;

    /* renamed from: b */
    public Integer f9248b = Integer.valueOf(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);

    /* renamed from: c */
    public Integer f9249c = 0;

    /* renamed from: d */
    public Boolean f9250d;

    /* renamed from: e */
    public Orientation f9251e;

    /* renamed from: f */
    public Integer f9252f;

    /* renamed from: g */
    public Integer f9253g;

    /* renamed from: h */
    public Skip f9254h;

    /* renamed from: i */
    public TapAction f9255i;

    /* renamed from: j */
    public UnitDisplayType f9256j;

    /* renamed from: k */
    public List<Integer> f9257k;

    public C2619a0() {
        Boolean bool = Boolean.TRUE;
        this.f9247a = bool;
        this.f9250d = bool;
        this.f9252f = 0;
        this.f9253g = 2048;
        this.f9254h = Skip.fromValue(0);
        this.f9257k = new ArrayList();
    }

    /* renamed from: a */
    public JSONObject mo13189a() {
        JSONObject jSONObject = new JSONObject();
        C3712m0.m9974a(jSONObject, "autoPlay", this.f9247a);
        C3712m0.m9974a(jSONObject, "maxBitrate", this.f9248b);
        C3712m0.m9974a(jSONObject, "minBitrate", this.f9249c);
        C3712m0.m9974a(jSONObject, "muted", this.f9250d);
        C3712m0.m9974a(jSONObject, "orientation", this.f9251e);
        C3712m0.m9974a(jSONObject, "padding", this.f9252f);
        C3712m0.m9974a(jSONObject, "pivotBitrate", this.f9253g);
        C3712m0.m9974a(jSONObject, "skip", this.f9254h);
        C3712m0.m9974a(jSONObject, "tapAction", this.f9255i);
        C3712m0.m9974a(jSONObject, "unitDisplayType", this.f9256j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f9257k;
        if (list != null) {
            for (Integer next : list) {
                if (next != null) {
                    jSONArray.put(next);
                }
            }
        }
        C3712m0.m9974a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }

    /* renamed from: b */
    public Boolean mo13190b() {
        return this.f9247a;
    }
}
