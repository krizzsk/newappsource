package t30;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow;
import com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem;
import java.util.ArrayList;
import java.util.List;
import p066e0.C4454r0;
import p977zz.C20964s0;

/* renamed from: t30.g */
public final class C6565g {

    /* renamed from: t30.g$a */
    public static /* synthetic */ class C6566a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20378a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f20379b;

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
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow[] r0 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20379b = r0
                r1 = 1
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow r2 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow.DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f20379b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow r3 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow.RESERVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f20379b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow r4 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow.UNLOCK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.moovit.micromobility.MicroMobilityIntegrationFlow[] r3 = com.moovit.micromobility.MicroMobilityIntegrationFlow.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f20378a = r3
                com.moovit.micromobility.MicroMobilityIntegrationFlow r4 = com.moovit.micromobility.MicroMobilityIntegrationFlow.DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f20378a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r3 = com.moovit.micromobility.MicroMobilityIntegrationFlow.RESERVE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f20378a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.moovit.micromobility.MicroMobilityIntegrationFlow r1 = com.moovit.micromobility.MicroMobilityIntegrationFlow.UNLOCK     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t30.C6565g.C6566a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static MicroMobilityIntegrationFlow m15497a(MVMicroMobilityIntegrationFlow mVMicroMobilityIntegrationFlow) {
        int i = C6566a.f20379b[mVMicroMobilityIntegrationFlow.ordinal()];
        if (i == 1) {
            return MicroMobilityIntegrationFlow.DEEP_LINK;
        }
        if (i == 2) {
            return MicroMobilityIntegrationFlow.RESERVE;
        }
        if (i == 3) {
            return MicroMobilityIntegrationFlow.UNLOCK;
        }
        throw new IllegalStateException("failed to decode micro-mobility integration flow");
    }

    /* renamed from: b */
    public static MicroMobilityIntegrationItem m15498b(MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem) {
        String str = mVMicroMobilityIntegrationItem.serviceId;
        String str2 = mVMicroMobilityIntegrationItem.itemId;
        List<MVMicroMobilityIntegrationFlow> list = mVMicroMobilityIntegrationItem.flows;
        AppDeepLink appDeepLink = null;
        if (C20964s0.m49090h(str) || C20964s0.m49090h(str2) || C13717b.m34258e(list)) {
            return null;
        }
        ArrayList<O> c = C13720d.m34273c(list, (C13722f) null, new C4454r0(15));
        if (mVMicroMobilityIntegrationItem.mo34398f()) {
            appDeepLink = C13749c.m34315a(mVMicroMobilityIntegrationItem.deepLink);
        }
        return new MicroMobilityIntegrationItem(str, str2, c, appDeepLink);
    }
}
