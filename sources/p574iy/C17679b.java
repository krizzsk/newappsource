package p574iy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ce0.C21100e;
import com.moovit.app.ridesharing.EventDetailActivity;
import com.moovit.gcm.payload.CarpoolCenterPayload;
import com.moovit.gcm.payload.CarpoolInvitationToRidePayload;
import com.moovit.gcm.payload.CarpoolRidePayload;
import com.moovit.gcm.payload.EventInstancePayload;
import com.moovit.gcm.payload.FacebookInvitePayload;
import com.moovit.gcm.payload.FacebookLikePayload;
import com.moovit.gcm.payload.FavoritesPayload;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.gcm.payload.ItineraryPayload;
import com.moovit.gcm.payload.LinePayload;
import com.moovit.gcm.payload.LinesPayload;
import com.moovit.gcm.payload.LoginPayload;
import com.moovit.gcm.payload.NearbyPayload;
import com.moovit.gcm.payload.PopupLinkPayload;
import com.moovit.gcm.payload.RateUsPayload;
import com.moovit.gcm.payload.SendFeedbackPayload;
import com.moovit.gcm.payload.ServiceAlertPayload;
import com.moovit.gcm.payload.ShareDriverReferralPayload;
import com.moovit.gcm.payload.SpreadTheLovePayload;
import com.moovit.gcm.payload.SurveyPayload;
import com.moovit.gcm.payload.TodRidePayload;
import com.moovit.gcm.payload.TransitStopPayload;
import com.moovit.gcm.payload.TransportationMapsPayload;
import com.moovit.gcm.payload.TripPlanPayload;
import com.moovit.gcm.payload.UrlPayload;
import com.moovit.gcm.payload.UserMessagePayload;
import com.moovit.gcm.payload.UserReinstallPayload;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p001a0.C0017h;
import p435de.C16596f;
import p977zz.C20927a0;

/* renamed from: iy.b */
public final class C17679b implements GcmPayload.C15923a<Void> {

    /* renamed from: a */
    public final Context f45432a;

    public C17679b(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f45432a = context;
    }

    /* renamed from: A */
    public final /* synthetic */ void mo48008A(CarpoolRidePayload carpoolRidePayload) {
        C0017h.m83s(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo48009a(LinePayload linePayload) {
        C0017h.m44A(this);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo48010b(CarpoolInvitationToRidePayload carpoolInvitationToRidePayload) {
        C0017h.m72g(this);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo48011c(UserMessagePayload userMessagePayload) {
        C0017h.m84t(this);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo48012d(TodRidePayload todRidePayload) {
        C0017h.m81q(this);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo48013e(ItineraryPayload itineraryPayload) {
        C0017h.m90z(this);
    }

    /* renamed from: f */
    public final Object mo48014f(TripPlanPayload tripPlanPayload) {
        C16596f.m42113a().mo49364c(new UnsupportedOperationException("GcmNotificationsCenterVisitor does not support trip plan payload"));
        return null;
    }

    /* renamed from: g */
    public final void mo48015g() {
        C16596f.m42113a().mo49364c(new UnsupportedOperationException("GcmNotificationsCenterVisitor does not support info payload"));
    }

    public final String getTag() {
        return "GcmNotificationsCenterVisitor";
    }

    /* renamed from: h */
    public final Object mo48017h(UrlPayload urlPayload) {
        Intent d = urlPayload.mo48105d(this.f45432a);
        if (d != null) {
            d.addFlags(603979776);
            this.f45432a.startActivity(d);
            return null;
        } else if (urlPayload.f41602e) {
            Context context = this.f45432a;
            context.startActivity(WebViewActivity.m18168y2(context, urlPayload.f41600c, urlPayload.f41601d));
            return null;
        } else {
            Intent createChooser = Intent.createChooser(C20927a0.m49014i(Uri.parse(urlPayload.f41600c)), this.f45432a.getText(R.string.open_file_chooser));
            createChooser.addFlags(268435456);
            this.f45432a.startActivity(createChooser);
            return null;
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void mo48018i(PopupLinkPayload popupLinkPayload) {
        C0017h.m75j(this);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo48019j(SurveyPayload surveyPayload) {
        C0017h.m80p(this);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo48020k(SendFeedbackPayload sendFeedbackPayload) {
        C0017h.m77l(this);
    }

    /* renamed from: l */
    public final /* synthetic */ void mo48021l(FacebookInvitePayload facebookInvitePayload) {
        C0017h.m87w(this);
    }

    /* renamed from: m */
    public final void mo48022m(EventInstancePayload eventInstancePayload) {
        Context context = this.f45432a;
        context.startActivity(EventDetailActivity.m38909y2(context, eventInstancePayload.f41538c, eventInstancePayload.f41539d));
    }

    /* renamed from: n */
    public final Object mo48023n(TransitStopPayload transitStopPayload) {
        C16596f.m42113a().mo49364c(new UnsupportedOperationException("GcmNotificationsCenterVisitor does not support transit stop payload"));
        return null;
    }

    /* renamed from: o */
    public final /* synthetic */ void mo48024o(ShareDriverReferralPayload shareDriverReferralPayload) {
        C0017h.m78n(this);
    }

    /* renamed from: p */
    public final /* synthetic */ void mo48025p(CarpoolCenterPayload carpoolCenterPayload) {
        C0017h.m71f(this);
    }

    /* renamed from: q */
    public final /* synthetic */ void mo48026q(TransportationMapsPayload transportationMapsPayload) {
        C0017h.m82r(this);
    }

    /* renamed from: r */
    public final /* synthetic */ void mo48027r(LoginPayload loginPayload) {
        C0017h.m73h(this);
    }

    /* renamed from: s */
    public final /* synthetic */ void mo48028s(RateUsPayload rateUsPayload) {
        C0017h.m76k(this);
    }

    /* renamed from: t */
    public final /* synthetic */ void mo48029t(NearbyPayload nearbyPayload) {
        C0017h.m74i(this);
    }

    /* renamed from: u */
    public final /* synthetic */ void mo48030u(SpreadTheLovePayload spreadTheLovePayload) {
        C0017h.m79o(this);
    }

    /* renamed from: v */
    public final /* synthetic */ void mo48031v(FavoritesPayload favoritesPayload) {
        C0017h.m89y(this);
    }

    /* renamed from: w */
    public final /* synthetic */ void mo48032w(LinesPayload linesPayload) {
        C0017h.m45B(this);
    }

    /* renamed from: x */
    public final /* synthetic */ void mo48033x(UserReinstallPayload userReinstallPayload) {
        C0017h.m85u(this);
    }

    /* renamed from: y */
    public final Object mo48034y(ServiceAlertPayload serviceAlertPayload) {
        C16596f.m42113a().mo49364c(new UnsupportedOperationException("GcmNotificationsCenterVisitor does not support service alert payload"));
        return null;
    }

    /* renamed from: z */
    public final /* synthetic */ void mo48035z(FacebookLikePayload facebookLikePayload) {
        C0017h.m88x(this);
    }
}
