package f70;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import ce0.C21100e;
import com.moovit.sdk.analytics.SdkAnalyticsFlowKey;
import com.moovit.sdk.protocol.ProtocolEnums$MVAnalyticsFlowKey;
import f00.C16918f;
import f00.C16919g;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p081f3.C4669n;

/* renamed from: f70.b */
public final class C4707b extends C4669n {

    /* renamed from: d */
    public static C16918f<Integer> f15985d;

    /* renamed from: a */
    public final int f15986a;

    /* renamed from: b */
    public final SdkAnalyticsFlowKey f15987b;

    /* renamed from: c */
    public final List<C4706a> f15988c;

    public C4707b(Context context, SdkAnalyticsFlowKey sdkAnalyticsFlowKey, C4706a aVar) {
        int intValue;
        List<C4706a> singletonList = Collections.singletonList(aVar);
        synchronized (C4707b.class) {
            if (f15985d == null) {
                f15985d = new C16918f<>(context.getSharedPreferences("moovit_sdk_analytics_sequence", 0), new C16919g.C16924e("sequence_id", 0));
            }
            intValue = f15985d.mo49542a().intValue();
            f15985d.mo49544c(Integer.valueOf(intValue + 1));
        }
        this.f15986a = intValue;
        C21100e.m49373x(sdkAnalyticsFlowKey, "flowKey");
        this.f15987b = sdkAnalyticsFlowKey;
        C21100e.m49373x(singletonList, "events");
        this.f15988c = singletonList;
    }

    /* renamed from: c */
    public final JSONObject mo20187c() {
        JSONObject jSONObject = new JSONObject();
        try {
            SdkAnalyticsFlowKey sdkAnalyticsFlowKey = this.f15987b;
            ProtocolEnums$MVAnalyticsFlowKey protocolEnums$MVAnalyticsFlowKey = (ProtocolEnums$MVAnalyticsFlowKey) C4708c.f15991c.get(sdkAnalyticsFlowKey);
            if (protocolEnums$MVAnalyticsFlowKey != null) {
                jSONObject.put("flowKey", protocolEnums$MVAnalyticsFlowKey.getValue());
                jSONObject.put("flowSequenceId", this.f15986a);
                jSONObject.put("events", new JSONArray(C13720d.m34273c(this.f15988c, (C13722f) null, C4708c.f15989a)));
                return jSONObject;
            }
            throw new IllegalStateException("Unknown flow key " + sdkAnalyticsFlowKey.name());
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public final String mo20188d() {
        return "analyticsMessage";
    }
}
