package p736pu;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivation;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationPrice;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationsGroup;
import i30.C5268d;
import i30.C5269e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p824tp.C19728f;

/* renamed from: pu.i */
public final class C19000i {

    /* renamed from: pu.i$a */
    public static /* synthetic */ class C19001a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48349a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f48350b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0087 */
        static {
            /*
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType[] r0 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48350b = r0
                r1 = 1
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r2 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.InterBus     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f48350b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r3 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.CityBus     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f48350b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r4 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.InterShuttleBus     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f48350b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r4 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.CityShuttleBus     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f48350b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r4 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.CarmelitLightRail     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f48350b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r4 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.CityLightRail     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = f48350b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r4 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.CityLightRailStation     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f48350b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r4 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.ExpressCableCar     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r3 = f48350b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType r4 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBTransitType.TrainStation     // Catch:{ NoSuchFieldError -> 0x006c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r5 = 9
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus[] r3 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f48349a = r3
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus r4 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r1 = f48349a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus r3 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f48349a     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus r1 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationStatus.HISTORICAL     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p736pu.C19000i.C19001a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m46110a(C19728f fVar, MVPTBActivationsGroup mVPTBActivationsGroup, ArrayList arrayList, C5268d dVar) {
        C13720d.m34276f(mVPTBActivationsGroup.activations, (C13722f) null, new C18999h(fVar, mVPTBActivationsGroup.priceReference, dVar), arrayList);
    }

    /* renamed from: b */
    public static MotActivationPrice m46111b(MVPTBActivationPrice mVPTBActivationPrice) {
        CurrencyAmount currencyAmount;
        List<String> list;
        CurrencyAmount d = C13749c.m34318d(mVPTBActivationPrice.price);
        if (mVPTBActivationPrice.mo30833g()) {
            currencyAmount = C13749c.m34318d(mVPTBActivationPrice.fullPrice);
        } else {
            currencyAmount = d;
        }
        if (mVPTBActivationPrice.mo30832f()) {
            list = mVPTBActivationPrice.discountReasons;
        } else {
            list = Collections.emptyList();
        }
        return new MotActivationPrice(d, currencyAmount, list);
    }

    /* renamed from: c */
    public static void m46112c(C5269e.C5270a aVar, List<MVPTBActivation> list) {
        if (!C13717b.m34258e(list)) {
            for (MVPTBActivation next : list) {
                if (next.mo30818p()) {
                    aVar.mo21076c(next.fromStopId);
                }
                if (next.mo30824u()) {
                    aVar.mo21076c(next.toStopId);
                }
            }
        }
    }
}
