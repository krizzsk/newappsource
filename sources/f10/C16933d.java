package f10;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.user.LocaleInfo;
import com.tranzmate.moovit.protocol.users.MVLocale;
import com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadRequest;
import java.util.Locale;
import p824tp.C19746x;
import p977zz.C20952m0;

/* renamed from: f10.d */
public final class C16933d extends C13778r<C16933d, C16934e, MVPushNotificationPayloadRequest> {
    public C16933d(C13752e eVar, GcmPayload gcmPayload, Locale locale) {
        super(eVar, C19746x.api_path_push_payload_service, C16934e.class);
        MVLocale mVLocale;
        int parseInt = Integer.parseInt(gcmPayload.f41546b);
        RO mVPushNotificationPayloadRequest = new MVPushNotificationPayloadRequest();
        mVPushNotificationPayloadRequest.pushId = parseInt;
        mVPushNotificationPayloadRequest.mo35277h();
        C20952m0<Integer> m0Var = C13749c.f33838a;
        if (locale == null) {
            mVLocale = null;
        } else {
            mVLocale = C13749c.m34333s(new LocaleInfo(locale));
        }
        mVPushNotificationPayloadRequest.locale = mVLocale;
        this.f33922v = mVPushNotificationPayloadRequest;
    }
}
