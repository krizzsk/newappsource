package p594jv;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.google.android.play.core.assetpacks.C14314s;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p828tt.C19759a;
import p875vs.C20228e;

/* renamed from: jv.f */
public final class C17935f extends C13780t<C17934e, C17935f, MVGetUserReportsAndAlertsResponse> {

    /* renamed from: m */
    public C14314s f45997m;

    /* renamed from: jv.f$a */
    public static /* synthetic */ class C17936a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45998a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.Reports4_0.MVReportUserFeedback[] r0 = com.tranzmate.moovit.protocol.Reports4_0.MVReportUserFeedback.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45998a = r0
                com.tranzmate.moovit.protocol.Reports4_0.MVReportUserFeedback r1 = com.tranzmate.moovit.protocol.Reports4_0.MVReportUserFeedback.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f45998a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.Reports4_0.MVReportUserFeedback r1 = com.tranzmate.moovit.protocol.Reports4_0.MVReportUserFeedback.Like     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f45998a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.Reports4_0.MVReportUserFeedback r1 = com.tranzmate.moovit.protocol.Reports4_0.MVReportUserFeedback.Notlike     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p594jv.C17935f.C17936a.<clinit>():void");
        }
    }

    public C17935f() {
        super(MVGetUserReportsAndAlertsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17934e eVar = (C17934e) aVar;
        MVGetUserReportsAndAlertsResponse mVGetUserReportsAndAlertsResponse = (MVGetUserReportsAndAlertsResponse) tBase;
        this.f45997m = new C14314s((Object) C13720d.m34273c(mVGetUserReportsAndAlertsResponse.reports, (C13722f) null, new C19759a(3)), (Object) C13720d.m34273c(mVGetUserReportsAndAlertsResponse.lineAlerts, (C13722f) null, new C20228e(4)), (Object) mVGetUserReportsAndAlertsResponse.nextPageId);
    }
}
