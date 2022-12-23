package f70;

import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import com.moovit.sdk.analytics.SdkAnalyticsAttributeKey;
import com.moovit.sdk.analytics.SdkAnalyticsEventKey;
import com.moovit.sdk.analytics.SdkAnalyticsFlowKey;
import com.moovit.sdk.protocol.ProtocolEnums$MVAnalyticsAttributeKey;
import com.moovit.sdk.protocol.ProtocolEnums$MVAnalyticsEventKey;
import com.moovit.sdk.protocol.ProtocolEnums$MVAnalyticsFlowKey;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f70.c */
public final class C4708c {

    /* renamed from: a */
    public static final C4709a f15989a = new C4709a();

    /* renamed from: b */
    public static final C4710b f15990b = new C4710b();

    /* renamed from: c */
    public static final EnumMap f15991c;

    /* renamed from: d */
    public static final EnumMap f15992d;

    /* renamed from: e */
    public static final EnumMap f15993e;

    /* renamed from: f70.c$a */
    public class C4709a implements C13721e<C4706a, JSONObject, RuntimeException> {
        public final Object convert(Object obj) throws Exception {
            C4706a aVar = (C4706a) obj;
            SdkAnalyticsEventKey sdkAnalyticsEventKey = aVar.f15982a;
            ProtocolEnums$MVAnalyticsEventKey protocolEnums$MVAnalyticsEventKey = (ProtocolEnums$MVAnalyticsEventKey) C4708c.f15992d.get(sdkAnalyticsEventKey);
            if (protocolEnums$MVAnalyticsEventKey != null) {
                long j = aVar.f15983b;
                ArrayList<O> c = C13720d.m34273c(aVar.f15984c.entrySet(), (C13722f) null, C4708c.f15990b);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventKey", protocolEnums$MVAnalyticsEventKey.getValue());
                    jSONObject.put("timestamp", j);
                    jSONObject.put("attributes", new JSONArray(c));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return jSONObject;
            }
            StringBuilder k = C13555b.m33972k("Unknown event key ");
            k.append(sdkAnalyticsEventKey.name());
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: f70.c$b */
    public class C4710b implements C13721e<Map.Entry<SdkAnalyticsAttributeKey, String>, JSONObject, RuntimeException> {
        public final Object convert(Object obj) throws Exception {
            Map.Entry entry = (Map.Entry) obj;
            SdkAnalyticsAttributeKey sdkAnalyticsAttributeKey = (SdkAnalyticsAttributeKey) entry.getKey();
            ProtocolEnums$MVAnalyticsAttributeKey protocolEnums$MVAnalyticsAttributeKey = (ProtocolEnums$MVAnalyticsAttributeKey) C4708c.f15993e.get(sdkAnalyticsAttributeKey);
            if (protocolEnums$MVAnalyticsAttributeKey != null) {
                String str = (String) entry.getValue();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("value", str);
                    jSONObject.put(LinksConfiguration.KEY_KEY, protocolEnums$MVAnalyticsAttributeKey.getValue());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return jSONObject;
            }
            StringBuilder k = C13555b.m33972k("Unknown attribute key ");
            k.append(sdkAnalyticsAttributeKey.name());
            throw new IllegalStateException(k.toString());
        }
    }

    static {
        EnumMap enumMap = new EnumMap(SdkAnalyticsFlowKey.class);
        f15991c = enumMap;
        enumMap.put(SdkAnalyticsFlowKey.DATA_COLLECTION, ProtocolEnums$MVAnalyticsFlowKey.DATA_COLLECTION);
        EnumMap enumMap2 = new EnumMap(SdkAnalyticsEventKey.class);
        f15992d = enumMap2;
        enumMap2.put(SdkAnalyticsEventKey.FILE_UPLOAD, ProtocolEnums$MVAnalyticsEventKey.FILE_UPLOAD);
        enumMap2.put(SdkAnalyticsEventKey.GOOGLE_ANALYTICS_REPORTED, ProtocolEnums$MVAnalyticsEventKey.GOOGLE_ANALYTICS_REPORTED);
        EnumMap enumMap3 = new EnumMap(SdkAnalyticsAttributeKey.class);
        f15993e = enumMap3;
        enumMap3.put(SdkAnalyticsAttributeKey.SUCCESS, ProtocolEnums$MVAnalyticsAttributeKey.SUCCESS);
        enumMap3.put(SdkAnalyticsAttributeKey.STATE, ProtocolEnums$MVAnalyticsAttributeKey.STATE);
        enumMap3.put(SdkAnalyticsAttributeKey.COUNT, ProtocolEnums$MVAnalyticsAttributeKey.COUNT);
        enumMap3.put(SdkAnalyticsAttributeKey.TYPE, ProtocolEnums$MVAnalyticsAttributeKey.TYPE);
        enumMap3.put(SdkAnalyticsAttributeKey.REASON, ProtocolEnums$MVAnalyticsAttributeKey.REASON);
        enumMap3.put(SdkAnalyticsAttributeKey.LOCATIONS_COUNT, ProtocolEnums$MVAnalyticsAttributeKey.LOCATIONS_COUNT);
        enumMap3.put(SdkAnalyticsAttributeKey.SCORE, ProtocolEnums$MVAnalyticsAttributeKey.SCORE);
        enumMap3.put(SdkAnalyticsAttributeKey.STATUS, ProtocolEnums$MVAnalyticsAttributeKey.STATUS);
        enumMap3.put(SdkAnalyticsAttributeKey.TIME, ProtocolEnums$MVAnalyticsAttributeKey.TIME);
        enumMap3.put(SdkAnalyticsAttributeKey.TRIGGER_TYPE_ID, ProtocolEnums$MVAnalyticsAttributeKey.TRIGGER_TYPE_ID);
        enumMap3.put(SdkAnalyticsAttributeKey.CUSTOM_DATA, ProtocolEnums$MVAnalyticsAttributeKey.CUSTOM_DATA);
    }
}
