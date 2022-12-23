package com.moovit.gcm.payload;

import android.os.Parcelable;
import ce0.C21100e;
import p583jk.C17884p;
import p977zz.C20975x0;

public abstract class GcmPayload implements Parcelable {

    /* renamed from: b */
    public final String f41546b;

    /* renamed from: com.moovit.gcm.payload.GcmPayload$a */
    public interface C15923a<T> {
        /* renamed from: A */
        void mo48008A(CarpoolRidePayload carpoolRidePayload);

        /* renamed from: a */
        void mo48009a(LinePayload linePayload);

        /* renamed from: b */
        void mo48010b(CarpoolInvitationToRidePayload carpoolInvitationToRidePayload);

        /* renamed from: c */
        void mo48011c(UserMessagePayload userMessagePayload);

        /* renamed from: d */
        void mo48012d(TodRidePayload todRidePayload);

        /* renamed from: e */
        void mo48013e(ItineraryPayload itineraryPayload);

        /* renamed from: f */
        T mo48014f(TripPlanPayload tripPlanPayload);

        /* renamed from: g */
        void mo48015g();

        String getTag();

        /* renamed from: h */
        T mo48017h(UrlPayload urlPayload);

        /* renamed from: i */
        void mo48018i(PopupLinkPayload popupLinkPayload);

        /* renamed from: j */
        void mo48019j(SurveyPayload surveyPayload);

        /* renamed from: k */
        void mo48020k(SendFeedbackPayload sendFeedbackPayload);

        /* renamed from: l */
        void mo48021l(FacebookInvitePayload facebookInvitePayload);

        /* renamed from: m */
        void mo48022m(EventInstancePayload eventInstancePayload);

        /* renamed from: n */
        T mo48023n(TransitStopPayload transitStopPayload);

        /* renamed from: o */
        void mo48024o(ShareDriverReferralPayload shareDriverReferralPayload);

        /* renamed from: p */
        void mo48025p(CarpoolCenterPayload carpoolCenterPayload);

        /* renamed from: q */
        void mo48026q(TransportationMapsPayload transportationMapsPayload);

        /* renamed from: r */
        void mo48027r(LoginPayload loginPayload);

        /* renamed from: s */
        void mo48028s(RateUsPayload rateUsPayload);

        /* renamed from: t */
        void mo48029t(NearbyPayload nearbyPayload);

        /* renamed from: u */
        void mo48030u(SpreadTheLovePayload spreadTheLovePayload);

        /* renamed from: v */
        void mo48031v(FavoritesPayload favoritesPayload);

        /* renamed from: w */
        void mo48032w(LinesPayload linesPayload);

        /* renamed from: x */
        void mo48033x(UserReinstallPayload userReinstallPayload);

        /* renamed from: y */
        T mo48034y(ServiceAlertPayload serviceAlertPayload);

        /* renamed from: z */
        void mo48035z(FacebookLikePayload facebookLikePayload);
    }

    public GcmPayload(String str) {
        C21100e.m49373x(str, "gcmId");
        this.f41546b = str;
    }

    /* renamed from: b */
    public abstract <T> T mo47976b(C15923a<T> aVar);

    /* renamed from: c */
    public abstract String mo47977c();

    public final boolean equals(Object obj) {
        if (!(obj instanceof GcmPayload)) {
            return false;
        }
        GcmPayload gcmPayload = (GcmPayload) obj;
        if (!this.f41546b.equals(gcmPayload.f41546b) || !C20975x0.m49118e(mo47977c(), gcmPayload.mo47977c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f41546b), C17884p.m44335F(mo47977c()));
    }
}
