package p569is;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.carpool.center.CarpoolCenterActivity;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsActivity;
import com.moovit.app.general.SpreadTheLoveActivity;
import com.moovit.app.general.transportationmaps.TransportationMapsActivity;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import com.moovit.app.home.HomeActivity;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.app.itinerary.external.ExternalItineraryActivity;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.ridesharing.EventDetailActivity;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.tod.center.rides.TodRideDetailsActivity;
import com.moovit.app.useraccount.ConnectActivity;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.gcm.GcmNotificationActivity;
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
import com.moovit.itinerary.model.Itinerary;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.time.Time;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.List;
import k10.C17993a;
import p001a0.C0017h;
import p067e1.C4503l0;
import p090g1.C4732a;
import p435de.C16596f;
import p824tp.C19722a0;
import p977zz.C20927a0;
import p977zz.C20975x0;

/* renamed from: is.a */
public final class C17651a implements GcmPayload.C15923a<Void> {

    /* renamed from: a */
    public final Context f45373a;

    public C17651a(GcmNotificationActivity gcmNotificationActivity) {
        this.f45373a = gcmNotificationActivity;
    }

    /* renamed from: A */
    public final void mo48008A(CarpoolRidePayload carpoolRidePayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a));
        Context context = this.f45373a;
        ServerId serverId = carpoolRidePayload.f41535c;
        int i = CarpoolRideDetailsActivity.f37829A0;
        l0Var.mo20022b(CarpoolRideDetailsActivity.m37357A2(context, serverId, PassengerRideStops.m40150b(), (TripPlannerLocations) null, (Itinerary) null, false));
        l0Var.mo20024e();
    }

    /* renamed from: a */
    public final void mo48009a(LinePayload linePayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        l0Var.mo20022b(LineDetailActivity.m38386y2(this.f45373a, linePayload.f41556c, linePayload.f41557d, linePayload.f41558e, (Time) null));
        l0Var.mo20024e();
    }

    /* renamed from: b */
    public final void mo48010b(CarpoolInvitationToRidePayload carpoolInvitationToRidePayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a));
        Context context = this.f45373a;
        ServerId serverId = carpoolInvitationToRidePayload.f41532c;
        int i = CarpoolRideDetailsActivity.f37829A0;
        l0Var.mo20022b(CarpoolRideDetailsActivity.m37357A2(context, serverId, PassengerRideStops.m40150b(), (TripPlannerLocations) null, (Itinerary) null, false));
        l0Var.mo20024e();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo48011c(UserMessagePayload userMessagePayload) {
        C0017h.m84t(this);
    }

    /* renamed from: d */
    public final void mo48012d(TodRidePayload todRidePayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a));
        Context context = this.f45373a;
        String str = todRidePayload.f41588c;
        int i = TodRideDetailsActivity.f40215X;
        Intent intent = new Intent(context, TodRideDetailsActivity.class);
        C21100e.m49373x(str, "rideId");
        intent.putExtra("ride_id", str);
        l0Var.mo20022b(intent);
        l0Var.mo20024e();
    }

    /* renamed from: e */
    public final void mo48013e(ItineraryPayload itineraryPayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        Context context = this.f45373a;
        String str = itineraryPayload.f41551c;
        ServerId serverId = itineraryPayload.f41552d;
        int i = itineraryPayload.f41553e;
        int i2 = ExternalItineraryActivity.f38542m0;
        Intent intent = new Intent(context, ExternalItineraryActivity.class);
        intent.putExtra("extra_guid", str);
        intent.putExtra("guid_metro_id", serverId);
        intent.putExtra("initial_index", i);
        l0Var.mo20022b(intent);
        l0Var.mo20024e();
    }

    /* renamed from: f */
    public final Object mo48014f(TripPlanPayload tripPlanPayload) {
        Context context = this.f45373a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        arrayList.add(SuggestRoutesActivity.m39325M2(this.f45373a, tripPlanPayload.f41596c, tripPlanPayload.f41597d));
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(context, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
            return null;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: g */
    public final void mo48015g() {
        Context context = this.f45373a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(context, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public final String getTag() {
        return "GcmNotificationVisitor";
    }

    /* renamed from: h */
    public final Object mo48017h(UrlPayload urlPayload) {
        Intent d = urlPayload.mo48105d(this.f45373a);
        if (d != null) {
            C4503l0 l0Var = new C4503l0(this.f45373a);
            Intent putExtra = C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups");
            if (!C20975x0.m49118e(putExtra.getComponent(), d.getComponent())) {
                l0Var.mo20021a(putExtra);
            }
            l0Var.f15585b.add(d);
            l0Var.mo20024e();
        } else if (urlPayload.f41602e) {
            Context context = this.f45373a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
            arrayList.add(WebViewActivity.m18168y2(this.f45373a, urlPayload.f41600c, urlPayload.f41601d));
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!C4732a.startActivities(context, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            Intent createChooser = Intent.createChooser(C20927a0.m49014i(Uri.parse(urlPayload.f41600c)), this.f45373a.getText(R.string.open_file_chooser));
            createChooser.addFlags(268435456);
            this.f45373a.startActivity(createChooser);
        }
        return null;
    }

    /* renamed from: i */
    public final void mo48018i(PopupLinkPayload popupLinkPayload) {
        Context context = this.f45373a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, popupLinkPayload.f41546b));
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(context, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: j */
    public final void mo48019j(SurveyPayload surveyPayload) {
        String str;
        try {
            str = ((C19722a0) MoovitAppApplication.m37038x().f37321e.mo50695h("USER_CONTEXT", false)).f50160a.f32925a;
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("Survey notification message failed to load user context", e));
            str = "";
        }
        Uri d = surveyPayload.mo48084d(str);
        if (surveyPayload.f41584e) {
            Context context = this.f45373a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
            arrayList.add(WebViewActivity.m18168y2(this.f45373a, d.toString(), surveyPayload.f41583d));
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!C4732a.startActivities(context, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                return;
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent createChooser = Intent.createChooser(C20927a0.m49014i(d), this.f45373a.getText(R.string.open_file_chooser));
        createChooser.addFlags(268435456);
        this.f45373a.startActivity(createChooser);
    }

    /* renamed from: k */
    public final void mo48020k(SendFeedbackPayload sendFeedbackPayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        l0Var.mo20022b(FeedbackFormActivity.m37597y2(this.f45373a, "GcmNotification"));
        l0Var.mo20024e();
    }

    /* renamed from: l */
    public final /* synthetic */ void mo48021l(FacebookInvitePayload facebookInvitePayload) {
        C0017h.m87w(this);
    }

    /* renamed from: m */
    public final void mo48022m(EventInstancePayload eventInstancePayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        l0Var.mo20022b(EventDetailActivity.m38909y2(this.f45373a, eventInstancePayload.f41538c, eventInstancePayload.f41539d));
        l0Var.mo20024e();
    }

    /* renamed from: n */
    public final Object mo48023n(TransitStopPayload transitStopPayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        l0Var.mo20022b(StopDetailActivity.m39207B2(this.f45373a, transitStopPayload.f41591c, (ServerId) null, (TransitStop) null, (List) null));
        l0Var.mo20024e();
        return null;
    }

    /* renamed from: o */
    public final /* synthetic */ void mo48024o(ShareDriverReferralPayload shareDriverReferralPayload) {
        C0017h.m78n(this);
    }

    /* renamed from: p */
    public final void mo48025p(CarpoolCenterPayload carpoolCenterPayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(CarpoolCenterActivity.m37255y2(this.f45373a));
        l0Var.mo20024e();
    }

    /* renamed from: q */
    public final void mo48026q(TransportationMapsPayload transportationMapsPayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        Context context = this.f45373a;
        int i = TransportationMapsActivity.f38085Y;
        l0Var.mo20022b(new Intent(context, TransportationMapsActivity.class));
        l0Var.mo20024e();
    }

    /* renamed from: r */
    public final void mo48027r(LoginPayload loginPayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        Context context = this.f45373a;
        int i = ConnectActivity.f40549l0;
        l0Var.mo20022b(new Intent(context, ConnectActivity.class));
        l0Var.mo20024e();
    }

    /* renamed from: s */
    public final /* synthetic */ void mo48028s(RateUsPayload rateUsPayload) {
        C0017h.m76k(this);
    }

    /* renamed from: t */
    public final void mo48029t(NearbyPayload nearbyPayload) {
        Context context = this.f45373a;
        nearbyPayload.getClass();
        Uri parse = Uri.parse("moovit://nearby");
        if (nearbyPayload.f41566c != null) {
            parse = parse.buildUpon().appendQueryParameter(ServerParameters.LAT_KEY, String.valueOf(nearbyPayload.f41566c.mo46922k())).appendQueryParameter(ServerParameters.LON_KEY, String.valueOf(nearbyPayload.f41566c.mo46922k())).build();
        }
        Intent y2 = HomeActivity.m37644y2(context, parse, (HomeTab) null, 0);
        y2.putExtra(C17993a.f46076b, "suppress_popups");
        Context context2 = this.f45373a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(y2);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(context2, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                context2.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: u */
    public final void mo48030u(SpreadTheLovePayload spreadTheLovePayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        Context context = this.f45373a;
        int i = SpreadTheLoveActivity.f38042U;
        l0Var.mo20022b(new Intent(context, SpreadTheLoveActivity.class));
        l0Var.mo20024e();
    }

    /* renamed from: v */
    public final void mo48031v(FavoritesPayload favoritesPayload) {
        C4503l0 l0Var = new C4503l0(this.f45373a);
        l0Var.mo20022b(HomeActivity.m37644y2(this.f45373a, (Uri) null, (HomeTab) null, 0));
        l0Var.mo20024e();
    }

    /* renamed from: w */
    public final void mo48032w(LinesPayload linesPayload) {
        Context context = this.f45373a;
        linesPayload.getClass();
        Uri parse = Uri.parse("moovit://lines");
        if (linesPayload.f41561c != null) {
            parse = parse.buildUpon().appendQueryParameter("innerTab", linesPayload.f41561c).build();
        }
        Intent y2 = HomeActivity.m37644y2(context, parse, (HomeTab) null, 0);
        y2.putExtra(C17993a.f46076b, "suppress_popups");
        Context context2 = this.f45373a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(y2);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(context2, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                context2.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: x */
    public final /* synthetic */ void mo48033x(UserReinstallPayload userReinstallPayload) {
        C0017h.m85u(this);
    }

    /* renamed from: y */
    public final Object mo48034y(ServiceAlertPayload serviceAlertPayload) {
        Context context = this.f45373a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C14226d.m35335A0(this.f45373a).putExtra(C17993a.f46076b, "suppress_popups"));
        arrayList.add(ServiceAlertDetailsActivity.m39148z2(this.f45373a, (ServerId) null, serviceAlertPayload.f41575c));
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(context, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
            return null;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: z */
    public final /* synthetic */ void mo48035z(FacebookLikePayload facebookLikePayload) {
        C0017h.m88x(this);
    }
}
