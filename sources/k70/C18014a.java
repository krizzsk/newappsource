package k70;

import com.moovit.sdk.datacollection.visibility.LocationStatusInfo;
import com.moovit.sdk.protocol.ProtocolEnums$MVLocationMode;
import com.moovit.sdk.protocol.ProtocolEnums$MVUpdateReason;
import org.json.JSONException;
import org.json.JSONObject;
import u70.C13136a;

/* renamed from: k70.a */
public final class C18014a extends C13136a {

    /* renamed from: b */
    public final LocationStatusInfo f46128b;

    /* renamed from: c */
    public long f46129c;

    /* renamed from: d */
    public boolean f46130d;

    /* renamed from: k70.a$a */
    public static /* synthetic */ class C18015a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46131a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.sdk.datacollection.visibility.LocationMode[] r0 = com.moovit.sdk.datacollection.visibility.LocationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46131a = r0
                com.moovit.sdk.datacollection.visibility.LocationMode r1 = com.moovit.sdk.datacollection.visibility.LocationMode.LOCATION_MODE_OFF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46131a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.sdk.datacollection.visibility.LocationMode r1 = com.moovit.sdk.datacollection.visibility.LocationMode.LOCATION_MODE_HIGH_ACCURACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46131a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.sdk.datacollection.visibility.LocationMode r1 = com.moovit.sdk.datacollection.visibility.LocationMode.LOCATION_MODE_SENSORS_ONLY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46131a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.sdk.datacollection.visibility.LocationMode r1 = com.moovit.sdk.datacollection.visibility.LocationMode.LOCATION_MODE_BATTERY_SAVING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46131a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.sdk.datacollection.visibility.LocationMode r1 = com.moovit.sdk.datacollection.visibility.LocationMode.LOCATION_MODE_KITKAT_NETWORK_ONLY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46131a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.sdk.datacollection.visibility.LocationMode r1 = com.moovit.sdk.datacollection.visibility.LocationMode.LOCATION_MODE_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k70.C18014a.C18015a.<clinit>():void");
        }
    }

    public C18014a(LocationStatusInfo locationStatusInfo, long j, boolean z) {
        super("locationStatus");
        this.f46128b = locationStatusInfo;
        this.f46129c = j;
        this.f46130d = z;
    }

    /* renamed from: e */
    public final JSONObject mo40045e() {
        ProtocolEnums$MVLocationMode protocolEnums$MVLocationMode;
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            int i2 = C18015a.f46131a[this.f46128b.f42995b.ordinal()];
            if (i2 == 1) {
                protocolEnums$MVLocationMode = ProtocolEnums$MVLocationMode.LOCATION_MODE_OFF;
            } else if (i2 == 2) {
                protocolEnums$MVLocationMode = ProtocolEnums$MVLocationMode.LOCATION_MODE_HIGH_ACCURACY;
            } else if (i2 == 3) {
                protocolEnums$MVLocationMode = ProtocolEnums$MVLocationMode.LOCATION_MODE_SENSORS_ONLY;
            } else if (i2 == 4) {
                protocolEnums$MVLocationMode = ProtocolEnums$MVLocationMode.LOCATION_MODE_BATTERY_SAVING;
            } else if (i2 != 5) {
                protocolEnums$MVLocationMode = ProtocolEnums$MVLocationMode.LOCATION_MODE_UNKNOWN;
            } else {
                protocolEnums$MVLocationMode = ProtocolEnums$MVLocationMode.LOCATION_MODE_KITKAT_NETWORK_ONLY;
            }
            jSONObject.put("locationMode", protocolEnums$MVLocationMode.getValue());
            jSONObject.put("accessFineLocation", this.f46128b.f42996c);
            jSONObject.put("accessCoarseLocation", this.f46128b.f42997d);
            jSONObject.put("timestamp", this.f46129c);
            if (this.f46130d) {
                i = ProtocolEnums$MVUpdateReason.PROPERTIES_CHANGED.getValue();
            } else {
                i = ProtocolEnums$MVUpdateReason.PERIODIC.getValue();
            }
            jSONObject.put("updateReason", i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
