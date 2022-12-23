package com.appboy.enums.inappmessage;

import androidx.annotation.Keep;
import com.appboy.models.IPutIntoJson;

@Keep
public enum InAppMessageFailureType implements IPutIntoJson<String> {
    IMAGE_DOWNLOAD,
    TEMPLATE_REQUEST,
    ZIP_ASSET_DOWNLOAD,
    DISPLAY_VIEW_GENERATION,
    INTERNAL_TIMEOUT_EXCEEDED,
    UNKNOWN_MESSAGE_TYPE;

    /* renamed from: com.appboy.enums.inappmessage.InAppMessageFailureType$a */
    public static /* synthetic */ class C1977a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6835a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.appboy.enums.inappmessage.InAppMessageFailureType[] r0 = com.appboy.enums.inappmessage.InAppMessageFailureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6835a = r0
                com.appboy.enums.inappmessage.InAppMessageFailureType r1 = com.appboy.enums.inappmessage.InAppMessageFailureType.IMAGE_DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6835a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.enums.inappmessage.InAppMessageFailureType r1 = com.appboy.enums.inappmessage.InAppMessageFailureType.TEMPLATE_REQUEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6835a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.enums.inappmessage.InAppMessageFailureType r1 = com.appboy.enums.inappmessage.InAppMessageFailureType.ZIP_ASSET_DOWNLOAD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6835a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appboy.enums.inappmessage.InAppMessageFailureType r1 = com.appboy.enums.inappmessage.InAppMessageFailureType.DISPLAY_VIEW_GENERATION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6835a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.appboy.enums.inappmessage.InAppMessageFailureType r1 = com.appboy.enums.inappmessage.InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6835a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.appboy.enums.inappmessage.InAppMessageFailureType r1 = com.appboy.enums.inappmessage.InAppMessageFailureType.UNKNOWN_MESSAGE_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appboy.enums.inappmessage.InAppMessageFailureType.C1977a.<clinit>():void");
        }
    }

    public String forJsonPut() {
        switch (C1977a.f6835a[ordinal()]) {
            case 1:
                return "if";
            case 2:
                return "tf";
            case 3:
                return "zf";
            case 4:
                return "vf";
            case 5:
                return "te";
            case 6:
                return "umt";
            default:
                return null;
        }
    }
}
