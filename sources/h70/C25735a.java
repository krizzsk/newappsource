package h70;

import com.moovit.commons.request.BadResponseException;
import com.moovit.sdk.profilers.activity.config.ActivityConfig;
import com.moovit.sdk.profilers.steps.config.StepsCounterConfig;
import com.moovit.sdk.profilers.wifiscan.config.WifiScansConfig;
import com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p70.C18886a;
import q70.C19095b;
import s70.C19442a;
import t70.C19641b;
import v70.C13175k;

/* renamed from: h70.a */
public final class C25735a implements Callable<C19095b> {

    /* renamed from: h70.a$a */
    public static /* synthetic */ class C25736a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64172a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType[] r0 = com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f64172a = r0
                com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType.ANDROID_LOCATIONS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f64172a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType.ANDROID_ACTIVITY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f64172a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType.ANDROID_ACTIVITY_TRANSITION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f64172a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType.ANDROID_WIFI_SCANS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f64172a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCProfilerType.ANDROID_STEPS_COUNTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h70.C25735a.C25736a.<clinit>():void");
        }
    }

    /* renamed from: h70.a$b */
    public static class C25737b extends C13175k<C25737b, C19095b> {
        /* renamed from: e */
        public final Object mo40054e(JSONObject jSONObject) throws BadResponseException {
            try {
                return C25735a.m64286a(jSONObject);
            } catch (JSONException e) {
                throw new BadResponseException((Exception) e);
            }
        }
    }

    /* renamed from: a */
    public static C19095b m64286a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        Objects.toString(jSONObject);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject2.getJSONArray("profilers");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            ProtocolEnums$MVDCProfilerType findByValue = ProtocolEnums$MVDCProfilerType.findByValue(jSONObject3.getInt("type"));
            if (findByValue != null) {
                findByValue.name();
                jSONObject3.toString();
                int i2 = C25736a.f64172a[findByValue.ordinal()];
                if (i2 == 1) {
                    arrayList.add(new C19442a(jSONObject3).mo51526a());
                } else if (i2 == 2) {
                    jSONObject3.getString("name");
                    arrayList.add(new ActivityConfig(jSONObject3.getLong("ttl") * 1000, jSONObject3.getInt("profilerId"), jSONObject3.getJSONObject("details").getJSONObject("activity").getLong("detectionInterval")));
                } else if (i2 == 3) {
                    arrayList.add(new C18886a(jSONObject3).mo51526a());
                } else if (i2 == 4) {
                    jSONObject3.getString("name");
                    int i3 = jSONObject3.getInt("profilerId");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("details").getJSONObject("wifiScanConfig");
                    arrayList.add(new WifiScansConfig(jSONObject3.getLong("ttl") * 1000, i3, jSONObject4.getInt("sampleRateInMin"), C19641b.m47089c(jSONObject4)));
                } else if (i2 == 5) {
                    jSONObject3.getString("name");
                    int i4 = jSONObject3.getInt("profilerId");
                    JSONObject jSONObject5 = jSONObject3.getJSONObject("details").getJSONObject("stepCounterConfig");
                    arrayList.add(new StepsCounterConfig(jSONObject3.getLong("ttl") * 1000, i4, jSONObject5.getInt("sampleRateInMin"), C19641b.m47089c(jSONObject5)));
                }
            }
        }
        return new C19095b(jSONObject2.getLong("timestamp"), arrayList);
    }
}
