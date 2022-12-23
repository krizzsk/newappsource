package p527gy;

import android.net.Uri;
import ce0.C21100e;
import com.moovit.app.useraccount.manager.profile.UserAdsTargetingData;
import com.moovit.app.useraccount.manager.profile.UserCarpoolData;
import com.moovit.app.useraccount.manager.profile.UserRideSharingData;
import com.moovit.app.useraccount.manager.profile.UserTodData;
import com.moovit.app.useraccount.manager.profile.UserWondoData;
import com.moovit.carpool.CarpoolCompany;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;
import p977zz.C20964s0;

/* renamed from: gy.d */
public final class C17259d implements C17258c {

    /* renamed from: q */
    public static final C17260a f44601q = new C17260a();

    /* renamed from: a */
    public final String f44602a;

    /* renamed from: b */
    public final String f44603b;

    /* renamed from: c */
    public final String f44604c;

    /* renamed from: d */
    public final Uri f44605d;

    /* renamed from: e */
    public final String f44606e;

    /* renamed from: f */
    public final String f44607f;

    /* renamed from: g */
    public final int f44608g;

    /* renamed from: h */
    public final int f44609h;

    /* renamed from: i */
    public final Image f44610i;

    /* renamed from: j */
    public final ServerId f44611j;

    /* renamed from: k */
    public final C17256b f44612k;

    /* renamed from: l */
    public final UserCarpoolData f44613l;

    /* renamed from: m */
    public final UserRideSharingData f44614m;

    /* renamed from: n */
    public final UserTodData f44615n;

    /* renamed from: o */
    public final UserWondoData f44616o;

    /* renamed from: p */
    public final UserAdsTargetingData f44617p;

    /* renamed from: gy.d$a */
    public class C17260a extends C19619s<C17259d> {
        public C17260a() {
            super(8, C17259d.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 8;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            C17256b bVar;
            UserCarpoolData userCarpoolData;
            UserRideSharingData userRideSharingData;
            String str;
            UserTodData userTodData;
            UserWondoData userWondoData;
            UserAdsTargetingData userAdsTargetingData;
            C19615p pVar2 = pVar;
            int i2 = i;
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            int l = pVar.mo51924l();
            int l2 = pVar.mo51924l();
            String t3 = pVar.mo51948t();
            String t4 = pVar.mo51948t();
            Uri uri = (Uri) pVar2.mo51962q(C19794a.f50326d);
            boolean z = true;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            if (i2 >= 1) {
                bVar = (C17256b) pVar2.mo51962q(C17256b.f44599b);
            } else {
                bVar = null;
            }
            if (i2 != 2 || !pVar.mo51919b()) {
                z = false;
            }
            if (i2 >= 3) {
                userCarpoolData = (UserCarpoolData) UserCarpoolData.f40607d.read(pVar2);
            } else {
                userCarpoolData = new UserCarpoolData((CarpoolCompany) null, z);
            }
            UserCarpoolData userCarpoolData2 = userCarpoolData;
            if (i2 >= 4) {
                userRideSharingData = (UserRideSharingData) UserRideSharingData.f40610c.read(pVar2);
            } else {
                userRideSharingData = new UserRideSharingData(false);
            }
            UserRideSharingData userRideSharingData2 = userRideSharingData;
            if (i2 >= 5) {
                str = pVar.mo51948t();
            } else {
                str = "";
            }
            String str2 = str;
            if (i2 >= 6) {
                userTodData = (UserTodData) UserTodData.f40612c.read(pVar2);
            } else {
                userTodData = new UserTodData(false);
            }
            UserTodData userTodData2 = userTodData;
            if (i2 >= 7) {
                userWondoData = (UserWondoData) UserWondoData.f40614c.read(pVar2);
            } else {
                userWondoData = new UserWondoData(false);
            }
            UserWondoData userWondoData2 = userWondoData;
            if (i2 >= 8) {
                userAdsTargetingData = (UserAdsTargetingData) pVar2.mo51962q(UserAdsTargetingData.f40605c);
            } else {
                userAdsTargetingData = null;
            }
            return new C17259d(t3, t4, t2, uri, t, str2, l, l2, (Image) null, serverId, bVar, userCarpoolData2, userRideSharingData2, userTodData2, userWondoData2, userAdsTargetingData);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C17259d dVar = (C17259d) obj;
            qVar.mo51955t(dVar.f44606e);
            qVar.mo51955t(dVar.f44604c);
            qVar.mo51939l(dVar.f44608g);
            qVar.mo51939l(dVar.f44609h);
            qVar.mo51955t(dVar.f44602a);
            qVar.mo51955t(dVar.f44603b);
            qVar.mo51967q(dVar.f44605d, C19794a.f50326d);
            ServerId serverId = dVar.f44611j;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51967q(dVar.f44612k, C17256b.f44599b);
            UserCarpoolData userCarpoolData = dVar.f44613l;
            UserCarpoolData.C15619b bVar = UserCarpoolData.f40607d;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(userCarpoolData, qVar);
            UserRideSharingData userRideSharingData = dVar.f44614m;
            UserRideSharingData.C15621b bVar2 = UserRideSharingData.f40610c;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(userRideSharingData, qVar);
            qVar.mo51955t(dVar.f44607f);
            UserTodData userTodData = dVar.f44615n;
            UserTodData.C15623b bVar3 = UserTodData.f40612c;
            qVar.mo51939l(bVar3.f49802v);
            bVar3.mo179c(userTodData, qVar);
            UserWondoData userWondoData = dVar.f44616o;
            UserWondoData.C15625b bVar4 = UserWondoData.f40614c;
            qVar.mo51939l(bVar4.f49802v);
            bVar4.mo179c(userWondoData, qVar);
            qVar.mo51967q(dVar.f44617p, UserAdsTargetingData.f40605c);
        }
    }

    public C17259d(String str, String str2, String str3, Uri uri, String str4, String str5, int i, int i2, Image image, ServerId serverId, C17256b bVar, UserCarpoolData userCarpoolData, UserRideSharingData userRideSharingData, UserTodData userTodData, UserWondoData userWondoData, UserAdsTargetingData userAdsTargetingData) {
        UserCarpoolData userCarpoolData2 = userCarpoolData;
        UserRideSharingData userRideSharingData2 = userRideSharingData;
        UserTodData userTodData2 = userTodData;
        UserWondoData userWondoData2 = userWondoData;
        this.f44602a = str;
        this.f44603b = str2;
        this.f44604c = str3;
        this.f44605d = uri;
        this.f44606e = str4;
        this.f44607f = str5;
        this.f44608g = i;
        this.f44609h = i2;
        this.f44610i = image;
        this.f44611j = serverId;
        this.f44612k = bVar;
        C21100e.m49373x(userCarpoolData2, "carpoolData");
        this.f44613l = userCarpoolData2;
        C21100e.m49373x(userRideSharingData2, "rideSharingData");
        this.f44614m = userRideSharingData2;
        C21100e.m49373x(userTodData2, "todData");
        this.f44615n = userTodData2;
        C21100e.m49373x(userWondoData2, "wondoData");
        this.f44616o = userWondoData2;
        this.f44617p = userAdsTargetingData;
    }

    /* renamed from: a */
    public final String mo49804a() {
        return C20964s0.m49102t(" ", this.f44602a, this.f44603b);
    }

    public C17259d() {
        this.f44602a = "";
        this.f44603b = "";
        this.f44604c = "";
        this.f44605d = null;
        this.f44606e = "";
        this.f44607f = "";
        this.f44608g = 0;
        this.f44609h = 0;
        this.f44610i = null;
        this.f44611j = null;
        this.f44612k = null;
        this.f44613l = new UserCarpoolData((CarpoolCompany) null, false);
        this.f44614m = new UserRideSharingData(false);
        this.f44615n = new UserTodData(false);
        this.f44616o = new UserWondoData(false);
        this.f44617p = null;
    }
}
