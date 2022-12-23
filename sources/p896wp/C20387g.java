package p896wp;

import android.content.Context;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.ads.AdvertisingInfo;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.gcm.condition.GcmTimePeriodCondition;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.payload.UserReinstallPayload;
import com.moovit.gcm.popup.LocalPopup;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.concurrent.TimeUnit;
import k10.C17993a;
import p389bl.C13641g;
import p824tp.C19722a0;
import p824tp.C19731i;
import p977zz.C20975x0;

/* renamed from: wp.g */
public final class C20387g implements OnSuccessListener<AdvertisingInfo> {

    /* renamed from: b */
    public final Context f51690b;

    /* renamed from: c */
    public final C19722a0 f51691c;

    public C20387g(Context context, C19722a0 a0Var) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f51690b = context.getApplicationContext();
        C21100e.m49373x(a0Var, "userContext");
        this.f51691c = a0Var;
    }

    public final void onSuccess(Object obj) {
        C20385e eVar;
        AdvertisingInfo advertisingInfo = (AdvertisingInfo) obj;
        if (!C20975x0.m49118e((AdvertisingInfo) C13641g.m34133v(this.f51690b, "ADVERTISING_INFO_FILE_NAME", AdvertisingInfo.f37362g), advertisingInfo)) {
            try {
                eVar = (C20385e) new C20384d(new C13752e(this.f51690b, this.f51691c, (AnalyticsFlowKey) null), advertisingInfo).mo52626J();
            } catch (Exception unused) {
                C19731i.m47197a(this.f51690b).f50172b.mo42913b(new C20383c(this.f51690b, advertisingInfo), true);
                eVar = null;
            }
            C13641g.m34136y(this.f51690b, "ADVERTISING_INFO_FILE_NAME", advertisingInfo, AdvertisingInfo.f37361f);
            if (eVar != null && eVar.f51686m) {
                C17993a aVar = C17993a.f46075a;
                Context context = this.f51690b;
                long currentTimeMillis = System.currentTimeMillis();
                aVar.mo50494j(context, new LocalPopup(new GcmTimePeriodCondition(currentTimeMillis, TimeUnit.DAYS.toMillis(7) + currentTimeMillis), new UserReinstallPayload("-8469"), (GcmNotification) null));
            }
        }
    }
}
