package com.usebutton.sdk.internal.api.models;

import com.usebutton.sdk.internal.models.BrowserCardType;
import java.util.EnumMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class BrowserCardMapDTO {
    private final Map<BrowserCardType, InternalInstallCardDTO> internalInstallCardDTOMap;
    private final Map<BrowserCardType, InternalRewardCardDTO> internalRewardCardDTOMap;

    /* renamed from: com.usebutton.sdk.internal.api.models.BrowserCardMapDTO$1 */
    public static /* synthetic */ class C123051 {
        public static final /* synthetic */ int[] $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType;

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
                com.usebutton.sdk.internal.models.BrowserCardType[] r0 = com.usebutton.sdk.internal.models.BrowserCardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType = r0
                com.usebutton.sdk.internal.models.BrowserCardType r1 = com.usebutton.sdk.internal.models.BrowserCardType.INSTANT_REWARDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.usebutton.sdk.internal.models.BrowserCardType r1 = com.usebutton.sdk.internal.models.BrowserCardType.PREDICTABLE_REWARDS_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.usebutton.sdk.internal.models.BrowserCardType r1 = com.usebutton.sdk.internal.models.BrowserCardType.PREDICTABLE_REWARDS_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.usebutton.sdk.internal.models.BrowserCardType r1 = com.usebutton.sdk.internal.models.BrowserCardType.INSTALL_CARD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.usebutton.sdk.internal.models.BrowserCardType r1 = com.usebutton.sdk.internal.models.BrowserCardType.POST_PURCHASE_INSTALL_CARD     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.api.models.BrowserCardMapDTO.C123051.<clinit>():void");
        }
    }

    private BrowserCardMapDTO(Map<BrowserCardType, InternalRewardCardDTO> map, Map<BrowserCardType, InternalInstallCardDTO> map2) {
        this.internalRewardCardDTOMap = map;
        this.internalInstallCardDTOMap = map2;
    }

    public static BrowserCardMapDTO fromJson(JSONObject jSONObject) throws JSONException {
        Class<BrowserCardType> cls = BrowserCardType.class;
        if (jSONObject == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(cls);
        EnumMap enumMap2 = new EnumMap(cls);
        for (BrowserCardType browserCardType : BrowserCardType.values()) {
            String apiValue = browserCardType.getApiValue();
            if (jSONObject.has(apiValue)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(apiValue);
                int i = C123051.$SwitchMap$com$usebutton$sdk$internal$models$BrowserCardType[browserCardType.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    enumMap.put(browserCardType, InternalRewardCardDTO.fromJson(jSONObject2));
                } else if (i == 4 || i == 5) {
                    enumMap2.put(browserCardType, InternalInstallCardDTO.fromJson(jSONObject2));
                }
            }
        }
        return new BrowserCardMapDTO(enumMap, enumMap2);
    }

    public Map<BrowserCardType, InternalInstallCardDTO> getInternalInstallCardDTOMap() {
        return this.internalInstallCardDTOMap;
    }

    public Map<BrowserCardType, InternalRewardCardDTO> getInternalRewardCardDTOMap() {
        return this.internalRewardCardDTOMap;
    }
}
