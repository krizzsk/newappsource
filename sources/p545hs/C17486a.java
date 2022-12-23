package p545hs;

import android.content.Context;
import ce0.C21100e;
import com.moovit.MoovitActivity;
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
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p001a0.C0017h;

/* renamed from: hs.a */
public final class C17486a implements GcmPayload.C15923a<CharSequence> {

    /* renamed from: a */
    public final Context f45023a;

    public C17486a(MoovitActivity moovitActivity) {
        C21100e.m49373x(moovitActivity, AppActionRequest.KEY_CONTEXT);
        this.f45023a = moovitActivity;
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
        return this.f45023a.getText(R.string.action_open);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo48015g() {
    }

    public final String getTag() {
        return "GcmMessageVisitor";
    }

    /* renamed from: h */
    public final Object mo48017h(UrlPayload urlPayload) {
        return this.f45023a.getText(R.string.action_more_gmb_special_use);
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
    public final /* synthetic */ void mo48022m(EventInstancePayload eventInstancePayload) {
        C0017h.m86v(this);
    }

    /* renamed from: n */
    public final Object mo48023n(TransitStopPayload transitStopPayload) {
        return this.f45023a.getText(R.string.action_open);
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
        return this.f45023a.getText(R.string.action_more_gmb_special_use);
    }

    /* renamed from: z */
    public final /* synthetic */ void mo48035z(FacebookLikePayload facebookLikePayload) {
        C0017h.m88x(this);
    }
}
