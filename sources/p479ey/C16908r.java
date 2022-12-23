package p479ey;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.AccountAuthType;
import com.tranzmate.moovit.protocol.users.MVUserProfileResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;
import p527gy.C17259d;
import p977zz.C20964s0;
import w40.C25761d;

/* renamed from: ey.r */
public final class C16908r extends C13780t<C16907q, C16908r, MVUserProfileResponse> {

    /* renamed from: m */
    public C17259d f43922m;

    public C16908r() {
        super(MVUserProfileResponse.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ec  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p527gy.C17259d m42703q(com.tranzmate.moovit.protocol.users.MVUserProfileResponse r25) {
        /*
            r0 = r25
            com.tranzmate.moovit.protocol.users.MVUserProfileData r1 = r0.userProfile
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0049
            boolean r4 = r1.mo35517g()
            if (r4 == 0) goto L_0x0012
            java.lang.String r4 = r1.firstName
            goto L_0x0013
        L_0x0012:
            r4 = r3
        L_0x0013:
            boolean r5 = r1.mo35518h()
            if (r5 == 0) goto L_0x001c
            java.lang.String r5 = r1.lastName
            goto L_0x001d
        L_0x001c:
            r5 = r3
        L_0x001d:
            boolean r6 = r1.mo35516f()
            if (r6 == 0) goto L_0x0026
            java.lang.String r6 = r1.email
            goto L_0x0027
        L_0x0026:
            r6 = r3
        L_0x0027:
            boolean r7 = r1.mo35520i()
            if (r7 == 0) goto L_0x0030
            java.lang.String r7 = r1.nickname
            goto L_0x0031
        L_0x0030:
            r7 = r3
        L_0x0031:
            boolean r8 = r1.mo35521j()
            if (r8 == 0) goto L_0x003a
            java.lang.String r1 = r1.profilePhotoUrl
            goto L_0x003b
        L_0x003a:
            r1 = r2
        L_0x003b:
            if (r1 == 0) goto L_0x0042
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            r12 = r1
            r9 = r4
            r10 = r5
            r13 = r6
            r11 = r7
            goto L_0x004e
        L_0x0049:
            r12 = r2
            r9 = r3
            r10 = r9
            r11 = r10
            r13 = r11
        L_0x004e:
            boolean r1 = r25.mo35552p()
            if (r1 == 0) goto L_0x0056
            java.lang.String r3 = r0.phoneNumber
        L_0x0056:
            r14 = r3
            int r15 = r0.currentPoints
            int r1 = r0.pointsToNextLevel
            int r3 = r0.avatar
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.moovit.image.model.Image r17 = com.moovit.image.C16028g.m40823a(r3)
            int r3 = r0.avatarId
            com.moovit.network.model.ServerId r4 = new com.moovit.network.model.ServerId
            r4.<init>(r3)
            boolean r3 = r25.mo35548k()
            if (r3 == 0) goto L_0x007e
            com.tranzmate.moovit.protocol.users.MVUserProfileEditorData r3 = r0.editorData
            gy.b r5 = new gy.b
            int r3 = r3.moderationLevel
            r5.<init>(r3)
            r19 = r5
            goto L_0x0080
        L_0x007e:
            r19 = r2
        L_0x0080:
            boolean r3 = r0.isRegisteredToCarpool
            boolean r5 = r25.mo35551o()
            if (r5 == 0) goto L_0x0099
            com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails r5 = r0.passengerWorkData
            java.lang.String r6 = r5.workName
            java.lang.String r5 = r5.workEmail
            if (r6 != 0) goto L_0x0093
            if (r5 != 0) goto L_0x0093
            goto L_0x0099
        L_0x0093:
            com.moovit.carpool.CarpoolCompany r7 = new com.moovit.carpool.CarpoolCompany
            r7.<init>(r6, r5)
            goto L_0x009a
        L_0x0099:
            r7 = r2
        L_0x009a:
            com.moovit.app.useraccount.manager.profile.UserCarpoolData r5 = new com.moovit.app.useraccount.manager.profile.UserCarpoolData
            r5.<init>(r7, r3)
            boolean r3 = r0.registeredToRideSharing
            com.moovit.app.useraccount.manager.profile.UserRideSharingData r6 = new com.moovit.app.useraccount.manager.profile.UserRideSharingData
            r6.<init>(r3)
            boolean r3 = r0.registeredToTOD
            com.moovit.app.useraccount.manager.profile.UserTodData r7 = new com.moovit.app.useraccount.manager.profile.UserTodData
            r7.<init>(r3)
            boolean r3 = r25.mo35549l()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r0.isAcceptedMoovitWondoCobrandLegal
            if (r3 == 0) goto L_0x00b9
            r3 = 1
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            com.moovit.app.useraccount.manager.profile.UserWondoData r8 = new com.moovit.app.useraccount.manager.profile.UserWondoData
            r8.<init>(r3)
            boolean r3 = r25.mo35542f()
            if (r3 == 0) goto L_0x00ec
            com.tranzmate.moovit.protocol.users.MVUserProfileAdsTargetingData r0 = r0.adsTargeting
            boolean r3 = r0.mo35509f()
            if (r3 == 0) goto L_0x00e2
            java.util.List<com.tranzmate.moovit.protocol.users.MVUserTag> r0 = r0.userTags
            wt.e r2 = new wt.e
            r3 = 4
            r2.<init>(r3)
            tr.b r3 = new tr.b
            r16 = r8
            r8 = 7
            r3.<init>(r8)
            java.util.HashMap r2 = c00.C13720d.m34274d(r0, r2, r3)
            goto L_0x00e4
        L_0x00e2:
            r16 = r8
        L_0x00e4:
            com.moovit.app.useraccount.manager.profile.UserAdsTargetingData r0 = new com.moovit.app.useraccount.manager.profile.UserAdsTargetingData
            r0.<init>(r2)
            r24 = r0
            goto L_0x00f0
        L_0x00ec:
            r16 = r8
            r24 = r2
        L_0x00f0:
            gy.d r0 = new gy.d
            r2 = r16
            r8 = r0
            r16 = r1
            r18 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p479ey.C16908r.m42703q(com.tranzmate.moovit.protocol.users.MVUserProfileResponse):gy.d");
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16907q qVar = (C16907q) aVar;
        C17259d q = m42703q((MVUserProfileResponse) tBase);
        this.f43922m = q;
        String str = q.f44607f;
        if (!C20964s0.m49090h(str) && !C25761d.m64299a().mo83590e()) {
            C25761d.m64299a().mo83594j(AccountAuthType.PHONE, str);
        }
    }
}
