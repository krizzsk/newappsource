package p618kv;

import android.content.Context;
import c70.C13752e;
import c70.C13756i;
import ce0.C21100e;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.commons.utils.SafeRunnable;
import com.moovit.metro.ReportCategoryType;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.usebutton.sdk.internal.api.AppActionRequest;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import java.util.EnumSet;
import p548hv.C17499b;
import p824tp.C19728f;
import p977zz.C20956o0;
import z20.C20806a;

/* renamed from: kv.h */
public final class C18150h implements SafeRunnable {

    /* renamed from: f */
    public static final EnumSet f46376f = EnumSet.of(ReportCategoryType.LINE_CROWDEDNESS, ReportCategoryType.STOP_CROWDEDNESS);

    /* renamed from: b */
    public final Context f46377b;

    /* renamed from: c */
    public final ReportCategoryType f46378c;

    /* renamed from: d */
    public final ReportEntityType f46379d;

    /* renamed from: e */
    public final ServerId f46380e;

    /* renamed from: kv.h$a */
    public static /* synthetic */ class C18151a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46381a;

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
                f46381a = r0
                com.moovit.app.reports.service.ReportEntityType r1 = com.moovit.app.reports.service.ReportEntityType.STOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46381a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.reports.service.ReportEntityType r1 = com.moovit.app.reports.service.ReportEntityType.LINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p618kv.C18150h.C18151a.<clinit>():void");
        }
    }

    public C18150h(Context context, ReportCategoryType reportCategoryType, ReportEntityType reportEntityType, ServerId serverId) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f46377b = context.getApplicationContext();
        C21100e.m49373x(reportCategoryType, "categoryType");
        this.f46378c = reportCategoryType;
        C21100e.m49373x(reportEntityType, "entityType");
        this.f46379d = reportEntityType;
        C21100e.m49373x(serverId, "entityId");
        this.f46380e = serverId;
    }

    public final /* synthetic */ void onError(Throwable th) {
        C20956o0.m49073a(this, th);
    }

    public final /* synthetic */ void run() {
        C20956o0.m49074b(this);
    }

    public final void safeRun() throws Throwable {
        String str;
        C13756i a = C13756i.m34349a(this.f46377b);
        int i = C18151a.f46381a[this.f46379d.ordinal()];
        if (i == 1) {
            C13752e b = a.mo40679b();
            C4776h hVar = C19728f.m47195a(b.f33852a).f50165a;
            C5269e d = C16759e.m42348d(hVar, "metroInfo");
            d.mo21066a(MetroEntityType.TRANSIT_STOP, this.f46380e);
            str = new C5267c(b, "ReportMarketingDispatcher.stationName", hVar, d).mo21062P().mo21064c(this.f46380e).f23731c;
        } else if (i == 2) {
            C13752e b2 = a.mo40679b();
            C4776h hVar2 = C19728f.m47195a(b2.f33852a).f50165a;
            C5269e d2 = C16759e.m42348d(hVar2, "metroInfo");
            d2.mo21066a(MetroEntityType.TRANSIT_LINE, this.f46380e);
            str = new C5267c(b2, "ReportMarketingDispatcher.lineNumber", hVar2, d2).mo21062P().mo21063b(this.f46380e).mo24369b().f23697e;
        } else {
            StringBuilder k = C13555b.m33972k("Unknown entity type: ");
            k.append(this.f46379d);
            throw new IllegalStateException(k.toString());
        }
        C20806a.C20807a aVar = new C20806a.C20807a("report_send_tap");
        aVar.mo52934b(C7841a.m17871i(this.f46378c).toString(), "type");
        aVar.mo52934b(C17499b.m43613a(this.f46379d).toString(), "item_type");
        aVar.mo52936d("item_id", this.f46380e);
        aVar.mo52934b(str, "item_name");
        aVar.mo52935c();
    }
}
