package p591js;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ce0.C21100e;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.gcm.popup.rate.C14888e;
import com.moovit.app.general.SpreadTheLoveActivity;
import com.moovit.app.general.transportationmaps.TransportationMapsActivity;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.useraccount.ConnectActivity;
import com.moovit.commons.utils.ApplicationBugException;
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
import com.moovit.network.model.ServerId;
import com.moovit.util.time.Time;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p001a0.C0017h;
import p269u2.C6677a;
import p435de.C16596f;
import p543hq.C17474b;
import p567iq.C17635b;
import p661mr.C18427d;
import p824tp.C19722a0;
import p977zz.C20927a0;

/* renamed from: js.a */
public final class C17920a implements GcmPayload.C15923a<Void> {

    /* renamed from: a */
    public final MoovitActivity f45975a;

    public C17920a(MoovitActivity moovitActivity) {
        C21100e.m49373x(moovitActivity, "activity");
        this.f45975a = moovitActivity;
    }

    /* renamed from: A */
    public final /* synthetic */ void mo48008A(CarpoolRidePayload carpoolRidePayload) {
        C0017h.m83s(this);
    }

    /* renamed from: a */
    public final void mo48009a(LinePayload linePayload) {
        MoovitActivity moovitActivity = this.f45975a;
        moovitActivity.startActivity(LineDetailActivity.m38386y2(moovitActivity, linePayload.f41556c, linePayload.f41557d, linePayload.f41558e, (Time) null));
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
        MoovitActivity moovitActivity = this.f45975a;
        moovitActivity.startActivity(SuggestRoutesActivity.m39325M2(moovitActivity, tripPlanPayload.f41596c, tripPlanPayload.f41597d));
        return null;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo48015g() {
    }

    public final String getTag() {
        return "GcmPopupClickVisitor";
    }

    /* renamed from: h */
    public final Object mo48017h(UrlPayload urlPayload) {
        Intent d = urlPayload.mo48105d(this.f45975a);
        if (d != null) {
            d.addFlags(603979776);
            this.f45975a.startActivity(d);
            return null;
        } else if (urlPayload.f41602e) {
            MoovitActivity moovitActivity = this.f45975a;
            moovitActivity.startActivity(WebViewActivity.m18168y2(moovitActivity, urlPayload.f41600c, urlPayload.f41601d));
            return null;
        } else {
            Intent createChooser = Intent.createChooser(C20927a0.m49014i(Uri.parse(urlPayload.f41600c)), this.f45975a.getText(R.string.open_file_chooser));
            createChooser.addFlags(268435456);
            this.f45975a.startActivity(createChooser);
            return null;
        }
    }

    /* renamed from: i */
    public final /* synthetic */ void mo48018i(PopupLinkPayload popupLinkPayload) {
        C0017h.m75j(this);
    }

    /* renamed from: j */
    public final void mo48019j(SurveyPayload surveyPayload) {
        String str;
        try {
            str = ((C19722a0) this.f45975a.getSystemService("user_context")).f50160a.f32925a;
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("Survey popup message failed to get user context", e));
            str = "";
        }
        Uri d = surveyPayload.mo48084d(str);
        if (surveyPayload.f41584e) {
            MoovitActivity moovitActivity = this.f45975a;
            moovitActivity.startActivity(WebViewActivity.m18168y2(moovitActivity, d.toString(), surveyPayload.f41583d));
            return;
        }
        Intent createChooser = Intent.createChooser(C20927a0.m49014i(d), this.f45975a.getText(R.string.open_file_chooser));
        createChooser.addFlags(268435456);
        this.f45975a.startActivity(createChooser);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo48020k(SendFeedbackPayload sendFeedbackPayload) {
        C0017h.m77l(this);
    }

    /* renamed from: l */
    public final void mo48021l(FacebookInvitePayload facebookInvitePayload) {
        C6677a aVar = C17635b.m43779f(this.f45975a).f50173c;
        MoovitActivity moovitActivity = this.f45975a;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.PUSH;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.PUSH_REJECTED);
        aVar2.mo49939g(AnalyticsAttributeKey.PUSH_ID, facebookInvitePayload.f41546b);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "popup_facebook_invite_type");
        aVar2.mo49939g(AnalyticsAttributeKey.REASON, "popup_facebook_invite_rejected");
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitActivity, analyticsFlowKey, false, bVarArr);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo48022m(EventInstancePayload eventInstancePayload) {
        C0017h.m86v(this);
    }

    /* renamed from: n */
    public final Object mo48023n(TransitStopPayload transitStopPayload) {
        MoovitActivity moovitActivity = this.f45975a;
        moovitActivity.startActivity(StopDetailActivity.m39206A2(moovitActivity, transitStopPayload.f41591c));
        return null;
    }

    /* renamed from: o */
    public final void mo48024o(ShareDriverReferralPayload shareDriverReferralPayload) {
        new C18427d().show(this.f45975a.getSupportFragmentManager(), "popup_fragment_tag");
    }

    /* renamed from: p */
    public final /* synthetic */ void mo48025p(CarpoolCenterPayload carpoolCenterPayload) {
        C0017h.m71f(this);
    }

    /* renamed from: q */
    public final void mo48026q(TransportationMapsPayload transportationMapsPayload) {
        MoovitActivity moovitActivity = this.f45975a;
        int i = TransportationMapsActivity.f38085Y;
        moovitActivity.startActivity(new Intent(moovitActivity, TransportationMapsActivity.class));
    }

    /* renamed from: r */
    public final void mo48027r(LoginPayload loginPayload) {
        MoovitActivity moovitActivity = this.f45975a;
        int i = ConnectActivity.f40549l0;
        moovitActivity.startActivity(new Intent(moovitActivity, ConnectActivity.class));
        this.f45975a.overridePendingTransition(R.anim.slide_in_up, R.anim.no_change);
    }

    /* renamed from: s */
    public final void mo48028s(RateUsPayload rateUsPayload) {
        int i = C14888e.f38039j;
        Bundle bundle = new Bundle();
        if (rateUsPayload != null) {
            bundle.putParcelable("payload", rateUsPayload);
        }
        C14888e eVar = new C14888e();
        eVar.setArguments(bundle);
        eVar.show(this.f45975a.getSupportFragmentManager(), "popup_fragment_tag");
    }

    /* renamed from: t */
    public final /* synthetic */ void mo48029t(NearbyPayload nearbyPayload) {
        C0017h.m74i(this);
    }

    /* renamed from: u */
    public final void mo48030u(SpreadTheLovePayload spreadTheLovePayload) {
        MoovitActivity moovitActivity = this.f45975a;
        int i = SpreadTheLoveActivity.f38042U;
        moovitActivity.startActivity(new Intent(moovitActivity, SpreadTheLoveActivity.class));
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
    public final void mo48033x(UserReinstallPayload userReinstallPayload) {
        new C17923d().show(this.f45975a.getSupportFragmentManager(), "popup_fragment_tag");
    }

    /* renamed from: y */
    public final Object mo48034y(ServiceAlertPayload serviceAlertPayload) {
        MoovitActivity moovitActivity = this.f45975a;
        moovitActivity.startActivity(ServiceAlertDetailsActivity.m39148z2(moovitActivity, (ServerId) null, serviceAlertPayload.f41575c));
        return null;
    }

    /* renamed from: z */
    public final void mo48035z(FacebookLikePayload facebookLikePayload) {
        C6677a aVar = C17635b.m43779f(this.f45975a).f50173c;
        MoovitActivity moovitActivity = this.f45975a;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.PUSH;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.PUSH_REJECTED);
        aVar2.mo49939g(AnalyticsAttributeKey.PUSH_ID, facebookLikePayload.f41546b);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "popup_facebook_like_type");
        aVar2.mo49939g(AnalyticsAttributeKey.REASON, "popup_facebook_like_unsupported");
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitActivity, analyticsFlowKey, false, bVarArr);
    }
}
