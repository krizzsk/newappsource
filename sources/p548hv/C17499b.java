package p548hv;

import com.moovit.app.reports.service.ReportEntityType;
import com.tranzmate.moovit.protocol.common.MVEntityType;

/* renamed from: hv.b */
public final class C17499b {

    /* renamed from: hv.b$a */
    public static /* synthetic */ class C17500a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45061a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.app.reports.service.ReportEntityType[] r0 = com.moovit.app.reports.service.ReportEntityType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45061a = r0
                com.moovit.app.reports.service.ReportEntityType r1 = com.moovit.app.reports.service.ReportEntityType.STOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f45061a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.reports.service.ReportEntityType r1 = com.moovit.app.reports.service.ReportEntityType.LINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p548hv.C17499b.C17500a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static MVEntityType m43613a(ReportEntityType reportEntityType) {
        int i = C17500a.f45061a[reportEntityType.ordinal()];
        if (i == 1) {
            return MVEntityType.Stop;
        }
        if (i == 2) {
            return MVEntityType.Line;
        }
        throw new IllegalStateException("ReportEntityType should match either Line or Stop");
    }
}
