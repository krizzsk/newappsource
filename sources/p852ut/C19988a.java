package p852ut;

import com.tranzmate.moovit.protocol.conf.MVDirectToItineraryABTestGroup;
import r00.C19215g;

/* renamed from: ut.a */
public interface C19988a {

    /* renamed from: a */
    public static final C19989a f50825a = new C19989a();

    /* renamed from: ut.a$a */
    public class C19989a extends C19215g<String> {
        public C19989a() {
            super("DIRECT_TO_ITINERARY", "direct_to_itinerary_type_control");
        }

        /* renamed from: b */
        public final Object mo49672b(String str) throws Exception {
            if (C19990b.f50826a[MVDirectToItineraryABTestGroup.valueOf(str).ordinal()] != 1) {
                return "direct_to_itinerary_type_control";
            }
            return "direct_to_itinerary_type_test";
        }
    }

    /* renamed from: ut.a$b */
    public static /* synthetic */ class C19990b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50826a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.conf.MVDirectToItineraryABTestGroup[] r0 = com.tranzmate.moovit.protocol.conf.MVDirectToItineraryABTestGroup.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f50826a = r0
                com.tranzmate.moovit.protocol.conf.MVDirectToItineraryABTestGroup r1 = com.tranzmate.moovit.protocol.conf.MVDirectToItineraryABTestGroup.TEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f50826a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.conf.MVDirectToItineraryABTestGroup r1 = com.tranzmate.moovit.protocol.conf.MVDirectToItineraryABTestGroup.CONTROL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p852ut.C19988a.C19990b.<clinit>():void");
        }
    }
}
