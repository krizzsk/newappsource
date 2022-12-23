package com.moovit.taxi;

import com.moovit.taxi.TaxiPrice;
import com.tranzmate.moovit.protocol.taxi.MVTaxiPrice;
import com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType;

/* renamed from: com.moovit.taxi.a */
public final class C7630a {

    /* renamed from: com.moovit.taxi.a$a */
    public static /* synthetic */ class C7631a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23233a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f23234b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.moovit.taxi.TaxiPrice$TaxiPriceType[] r0 = com.moovit.taxi.TaxiPrice.TaxiPriceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23234b = r0
                r1 = 1
                com.moovit.taxi.TaxiPrice$TaxiPriceType r2 = com.moovit.taxi.TaxiPrice.TaxiPriceType.RANGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f23234b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.taxi.TaxiPrice$TaxiPriceType r3 = com.moovit.taxi.TaxiPrice.TaxiPriceType.FIX     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f23234b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.taxi.TaxiPrice$TaxiPriceType r4 = com.moovit.taxi.TaxiPrice.TaxiPriceType.METERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType[] r3 = com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f23233a = r3
                com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType r4 = com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType.Range     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f23233a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType r3 = com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType.Fix     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f23233a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType r1 = com.tranzmate.moovit.protocol.taxi.MVTaxiPriceType.Metered     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.taxi.C7630a.C7631a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static TaxiPrice m17423a(MVTaxiPrice mVTaxiPrice) {
        TaxiPrice.TaxiPriceType taxiPriceType;
        String str = mVTaxiPrice.price;
        boolean z = mVTaxiPrice.isPromotion;
        MVTaxiPriceType mVTaxiPriceType = mVTaxiPrice.priceType;
        int i = C7631a.f23233a[mVTaxiPriceType.ordinal()];
        if (i == 1) {
            taxiPriceType = TaxiPrice.TaxiPriceType.RANGE;
        } else if (i == 2) {
            taxiPriceType = TaxiPrice.TaxiPriceType.FIX;
        } else if (i == 3) {
            taxiPriceType = TaxiPrice.TaxiPriceType.METERED;
        } else {
            throw new IllegalStateException("Unknown server price type: " + mVTaxiPriceType);
        }
        return new TaxiPrice(str, z, taxiPriceType, mVTaxiPrice.isSurge, mVTaxiPrice.surgeUrl);
    }

    /* renamed from: b */
    public static MVTaxiPrice m17424b(TaxiPrice taxiPrice) {
        MVTaxiPriceType mVTaxiPriceType;
        String str = taxiPrice.f23228b;
        boolean equals = TaxiPrice.TaxiPriceType.RANGE.equals(taxiPrice.f23230d);
        boolean z = taxiPrice.f23229c;
        TaxiPrice.TaxiPriceType taxiPriceType = taxiPrice.f23230d;
        int i = C7631a.f23234b[taxiPriceType.ordinal()];
        if (i == 1) {
            mVTaxiPriceType = MVTaxiPriceType.Range;
        } else if (i == 2) {
            mVTaxiPriceType = MVTaxiPriceType.Fix;
        } else if (i == 3) {
            mVTaxiPriceType = MVTaxiPriceType.Metered;
        } else {
            throw new IllegalStateException("Unknown price type: " + taxiPriceType);
        }
        boolean z2 = taxiPrice.f23231e;
        MVTaxiPrice mVTaxiPrice = new MVTaxiPrice();
        mVTaxiPrice.price = str;
        mVTaxiPrice.isRange = equals;
        mVTaxiPrice.mo32256o();
        mVTaxiPrice.isPromotion = z;
        mVTaxiPrice.mo32255m();
        mVTaxiPrice.priceType = mVTaxiPriceType;
        mVTaxiPrice.isSurge = z2;
        mVTaxiPrice.mo32257p();
        if (taxiPrice.f23231e) {
            mVTaxiPrice.surgeUrl = taxiPrice.f23232f;
        }
        return mVTaxiPrice;
    }
}
