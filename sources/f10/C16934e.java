package f10;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.gcm.popup.GcmPopup;
import com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadResponse;
import com.tranzmate.moovit.protocol.users.MVPushPresentationType;
import java.io.IOException;
import java.util.HashMap;
import org.apache.thrift.TBase;
import p810sz.C19617r;

/* renamed from: f10.e */
public final class C16934e extends C13780t<C16933d, C16934e, MVPushNotificationPayloadResponse> {

    /* renamed from: m */
    public GcmPopup f43948m = null;

    public C16934e() {
        super(MVPushNotificationPayloadResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16933d dVar = (C16933d) aVar;
        MVPushNotificationPayloadResponse mVPushNotificationPayloadResponse = (MVPushNotificationPayloadResponse) tBase;
        HashMap hashMap = new HashMap();
        C19617r rVar = C16936g.f43954a;
        C16936g.m42771g(mVPushNotificationPayloadResponse.notificationPayload, hashMap);
        if (mVPushNotificationPayloadResponse.mo35293p()) {
            hashMap.put("alert_id", mVPushNotificationPayloadResponse.serviceAlert.alertId);
        }
        if (mVPushNotificationPayloadResponse.mo35283f()) {
            hashMap.put("button_text", mVPushNotificationPayloadResponse.buttonText);
        }
        hashMap.put("isPushPopup", String.valueOf(mVPushNotificationPayloadResponse.isPushPopup));
        if (mVPushNotificationPayloadResponse.mo35291m()) {
            hashMap.put("popupNotificationText", mVPushNotificationPayloadResponse.popupNotificationText);
        }
        hashMap.toString();
        GcmPayload b = C16936g.m42766b(hashMap);
        if (MVPushPresentationType.Popup.equals(mVPushNotificationPayloadResponse.presentationType)) {
            this.f43948m = C16936g.m42769e(b, hashMap);
        } else {
            C16936g.m42768d(b, hashMap);
        }
    }
}
