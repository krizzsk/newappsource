package s70;

import com.moovit.sdk.profilers.config.BaseConfig;
import com.moovit.sdk.profilers.places.config.PlacesConfig;
import com.moovit.sdk.profilers.places.config.PlacesProfilerType;
import com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType;
import org.json.JSONException;
import org.json.JSONObject;
import q70.C19094a;

/* renamed from: s70.a */
public final class C19442a extends C19094a<PlacesConfig> {

    /* renamed from: s70.a$a */
    public static /* synthetic */ class C19443a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49453a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType[] r0 = com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f49453a = r0
                com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType.PRIORITY_HIGH_ACCURACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f49453a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType.PRIORITY_BALANCED_POWER_ACCURACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f49453a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType.PRIORITY_LOW_POWER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f49453a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType r1 = com.moovit.sdk.protocol.ProtocolEnums$MVDCLocationsProfilerType.PRIORITY_NO_POWER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s70.C19442a.C19443a.<clinit>():void");
        }
    }

    public C19442a(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: b */
    public final BaseConfig mo51353b(JSONObject jSONObject, long j, int i) throws JSONException {
        PlacesProfilerType placesProfilerType;
        JSONObject jSONObject2 = jSONObject.getJSONObject("locations");
        jSONObject2.toString();
        ProtocolEnums$MVDCLocationsProfilerType findByValue = ProtocolEnums$MVDCLocationsProfilerType.findByValue(jSONObject2.getInt("type"));
        if (findByValue != null) {
            int i2 = C19443a.f49453a[findByValue.ordinal()];
            if (i2 == 1) {
                placesProfilerType = PlacesProfilerType.PRIORITY_HIGH_ACCURACY;
            } else if (i2 == 2) {
                placesProfilerType = PlacesProfilerType.PRIORITY_BALANCED_POWER_ACCURACY;
            } else if (i2 == 3) {
                placesProfilerType = PlacesProfilerType.PRIORITY_LOW_POWER;
            } else if (i2 == 4) {
                placesProfilerType = PlacesProfilerType.PRIORITY_NO_POWER;
            } else {
                throw new IllegalStateException("MVDCLocationsProfilerType is not supported");
            }
            return new PlacesConfig(j, i, placesProfilerType, jSONObject2.getInt("maxInterval"), jSONObject2.getInt("minInterval"), jSONObject2.getInt("smallestDisplacement"), jSONObject2.getInt("bulkTime"));
        }
        throw new IllegalStateException("unknown MVDCLocationsProfilerType value");
    }
}
