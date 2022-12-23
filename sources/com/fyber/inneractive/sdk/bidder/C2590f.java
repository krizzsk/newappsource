package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.bidder.f */
public class C2590f {

    /* renamed from: com.fyber.inneractive.sdk.bidder.f$a */
    public static /* synthetic */ class C2591a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9155a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9155a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9155a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9155a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9155a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.C2590f.C2591a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableBool m6593a(Boolean bool) {
        TokenParametersOuterClass$TokenParameters.NullableBool.C2544a newBuilder = TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            newBuilder.mo14761c();
            ((TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.f12365b).setData(booleanValue);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.mo14758a();
    }

    /* renamed from: b */
    public static TokenParametersOuterClass$TokenParameters.C2555d m6597b(String str) {
        if (str.equals("native")) {
            return TokenParametersOuterClass$TokenParameters.C2555d.NATIVE;
        }
        if (!str.equals("unity3d")) {
            return TokenParametersOuterClass$TokenParameters.C2555d.UNRECOGNIZED;
        }
        return TokenParametersOuterClass$TokenParameters.C2555d.UNITY3D;
    }

    /* renamed from: c */
    public static TokenParametersOuterClass$TokenParameters.NullableString m6598c(String str) {
        TokenParametersOuterClass$TokenParameters.NullableString.C2547a newBuilder = TokenParametersOuterClass$TokenParameters.NullableString.newBuilder();
        if (!TextUtils.isEmpty(str)) {
            newBuilder.mo14761c();
            ((TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.f12365b).setData(str);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.mo14758a();
    }

    /* renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableUInt32 m6595a(int i) {
        TokenParametersOuterClass$TokenParameters.NullableUInt32.C2548a newBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i > 0) {
            newBuilder.mo14761c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.f12365b).setData(i);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.mo14758a();
    }

    /* renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableFloat m6594a(String str) {
        TokenParametersOuterClass$TokenParameters.NullableFloat.C2545a newBuilder = TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder();
        if (str != null) {
            float parseFloat = Float.parseFloat(str);
            newBuilder.mo14761c();
            ((TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.f12365b).setData(parseFloat);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.mo14758a();
    }

    /* renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.C2562k m6596a(UnitDisplayType unitDisplayType) {
        int i = C2591a.f9155a[unitDisplayType.ordinal()];
        if (i == 1) {
            return TokenParametersOuterClass$TokenParameters.C2562k.BANNER;
        }
        if (i == 2) {
            return TokenParametersOuterClass$TokenParameters.C2562k.INTERSTITIAL;
        }
        if (i == 3) {
            return TokenParametersOuterClass$TokenParameters.C2562k.REWARDED;
        }
        if (i != 4) {
            return TokenParametersOuterClass$TokenParameters.C2562k.UNITDISPLAYTYPEUNKNOWN;
        }
        return TokenParametersOuterClass$TokenParameters.C2562k.MRECT;
    }
}
