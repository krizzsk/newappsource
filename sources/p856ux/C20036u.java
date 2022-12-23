package p856ux;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import c00.C13717b;
import c70.C13746a;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.MoovitExecutors;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import com.tranzmate.moovit.protocol.users.MVFavoriteLineStopPair;
import com.tranzmate.moovit.protocol.users.MVFavoriteLocations;
import com.tranzmate.moovit.protocol.users.MVPhoneOsTypes;
import com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserFavoritesRequest;
import com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserFavoritesResponse;
import com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserRequest;
import com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserResponse;
import com.tranzmate.moovit.protocol.users.MVUserFavoriteLocation;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.apache.thrift.TBase;
import p389bl.C13641g;
import p435de.C16596f;
import p567iq.C17635b;
import p803ss.C19522a;
import p810sz.C19576b;
import p834tz.C19804c;
import p880vx.C20243a;
import p922xr.C20559a;
import p977zz.C20930c;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.u */
public final class C20036u implements C13242b {

    /* renamed from: a */
    public static final List<String> f50868a = Arrays.asList(new String[]{"server_env.data", "GlobalInfo.languages.json", "GlobalInfo.metros.json", "MetroInfo.agencies.json", "MetroInfo.forms.json", "MetroInfo.metroroutetypes.json", "MetroInfo.socialnetworklinks.json", "MetroInfo.externallinks.json", "MetroInfo.acknowledgments.json", "MetroInfo.currentMetroPolygon.json", "ClientUser.userSettings.json", "ClientUser.userTicketingInfo.json", "ClientUser.userSocialIdentities.json", "ClientUser.rateUS.json", "TicketingInfo.availableprofiletypes.json", "TicketingInfo.availablePaymentTypes.json", "com.tranzmate.services.tasks.data.PendingTasks.TasksFile", "trip_plan_search_favorites_file", "trip_plan_search_history_file"});

    /* renamed from: b */
    public static final List<String> f50869b = Arrays.asList(new String[]{"MoovitDB", "mapcache", "com.localytics"});

    /* renamed from: ux.u$a */
    public static class C20037a implements Runnable {

        /* renamed from: b */
        public final Context f50870b;

        /* renamed from: c */
        public final ServerId f50871c;

        /* renamed from: d */
        public final List<LocationFavorite> f50872d;

        public C20037a(Context context, ServerId serverId, ArrayList arrayList) {
            this.f50870b = context.getApplicationContext();
            this.f50871c = serverId;
            C21100e.m49373x(arrayList, "favorites");
            this.f50872d = arrayList;
        }

        public final void run() {
            Locale b = C20930c.m49020b(this.f50870b);
            boolean z = false;
            for (LocationFavorite locationFavorite : this.f50872d) {
                LocationDescriptor locationDescriptor = (LocationDescriptor) locationFavorite.f52687b;
                if (C20964s0.m49090h(locationDescriptor.f23651f)) {
                    Context context = this.f50870b;
                    LatLonE6 d = locationDescriptor.mo24310d();
                    String str = null;
                    if (Geocoder.isPresent()) {
                        try {
                            Address address = (Address) C13717b.m34256c(new Geocoder(context, b).getFromLocation(d.mo46922k(), d.mo46926o(), 1));
                            if (address != null) {
                                str = address.getAddressLine(0) + ", " + address.getAddressLine(1);
                            }
                        } catch (IOException unused) {
                        }
                    }
                    locationDescriptor.f23651f = str;
                    z = true;
                }
            }
            if (z) {
                C17635b.m43779f(this.f50870b).f50175e.mo52611d().mo52771o(this.f50870b, this.f50871c, this.f50872d);
            }
        }
    }

    /* renamed from: ux.u$b */
    public static class C20038b extends C13778r<C20038b, C20039c, MVUpgrade3To4UserFavoritesRequest> {
        public C20038b(C13752e eVar, int i) {
            super(eVar, R.string.api_path_migrate_favorites_3x_4_request_path, C20039c.class);
            RO mVUpgrade3To4UserFavoritesRequest = new MVUpgrade3To4UserFavoritesRequest();
            mVUpgrade3To4UserFavoritesRequest.userId = i;
            mVUpgrade3To4UserFavoritesRequest.mo35441g();
            this.f33922v = mVUpgrade3To4UserFavoritesRequest;
        }
    }

    /* renamed from: ux.u$c */
    public static class C20039c extends C13780t<C20038b, C20039c, MVUpgrade3To4UserFavoritesResponse> {

        /* renamed from: m */
        public ArrayList f50873m;

        /* renamed from: n */
        public LocationFavorite f50874n = null;

        /* renamed from: o */
        public LocationFavorite f50875o = null;

        /* renamed from: p */
        public ArrayList f50876p;

        public C20039c() {
            super(MVUpgrade3To4UserFavoritesResponse.class);
        }

        /* renamed from: l */
        public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
            C20038b bVar = (C20038b) aVar;
            MVUpgrade3To4UserFavoritesResponse mVUpgrade3To4UserFavoritesResponse = (MVUpgrade3To4UserFavoritesResponse) tBase;
            List<MVFavoriteLineStopPair> list = mVUpgrade3To4UserFavoritesResponse.lineStopPairList;
            if (!C13717b.m34258e(list)) {
                this.f50873m = new ArrayList(list.size());
                for (MVFavoriteLineStopPair next : list) {
                    this.f50873m.add(new C20944i0(new ServerId(next.lineId), new ServerId(next.stopId)));
                }
            }
            MVFavoriteLocations mVFavoriteLocations = mVUpgrade3To4UserFavoritesResponse.favoriteLocations;
            MVUserFavoriteLocation mVUserFavoriteLocation = mVFavoriteLocations.homeLocation;
            if (mVUserFavoriteLocation != null) {
                this.f50874n = new LocationFavorite(C13749c.m34324j(mVUserFavoriteLocation.descriptor, (MVLocationSourceType) null), mVUserFavoriteLocation.userDefinedName);
            }
            MVUserFavoriteLocation mVUserFavoriteLocation2 = mVFavoriteLocations.workLocaiton;
            if (mVUserFavoriteLocation2 != null) {
                this.f50875o = new LocationFavorite(C13749c.m34324j(mVUserFavoriteLocation2.descriptor, (MVLocationSourceType) null), mVUserFavoriteLocation2.userDefinedName);
            }
            List<MVUserFavoriteLocation> list2 = mVFavoriteLocations.regularLocationList;
            if (!C13717b.m34258e(list2)) {
                this.f50876p = new ArrayList(list2.size());
                for (MVUserFavoriteLocation next2 : list2) {
                    String str = next2.userDefinedName;
                    this.f50876p.add(new LocationFavorite(C13749c.m34324j(next2.descriptor, (MVLocationSourceType) null), str));
                }
            }
        }
    }

    /* renamed from: ux.u$d */
    public static class C20040d extends C13778r<C20040d, C20041e, MVUpgrade3To4UserRequest> {
        public C20040d(C13752e eVar, int i) {
            super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_migrate_user_3x_4_request_path, C20041e.class);
            RO mVUpgrade3To4UserRequest = new MVUpgrade3To4UserRequest();
            mVUpgrade3To4UserRequest.userId = i;
            mVUpgrade3To4UserRequest.mo35461l();
            mVUpgrade3To4UserRequest.clientResolution = C13749c.m34339y(eVar.f33852a);
            mVUpgrade3To4UserRequest.phoneOsType = MVPhoneOsTypes.Android;
            mVUpgrade3To4UserRequest.uniqueId = C20975x0.m49119f(eVar.f33852a);
            this.f33922v = mVUpgrade3To4UserRequest;
        }

        /* renamed from: L */
        public final boolean mo20305L() {
            return false;
        }
    }

    /* renamed from: ux.u$e */
    public static class C20041e extends C13780t<C20040d, C20041e, MVUpgrade3To4UserResponse> {

        /* renamed from: m */
        public String f50877m;

        public C20041e() {
            super(MVUpgrade3To4UserResponse.class);
        }

        /* renamed from: l */
        public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
            C20040d dVar = (C20040d) aVar;
            String str = ((MVUpgrade3To4UserResponse) tBase).userKey;
            this.f50877m = str;
            if (C20964s0.m49090h(str)) {
                throw new BadResponseException("User key may not be null or empty");
            }
        }
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        int i;
        Context context = eVar.f33852a;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("UserData", 0);
        int i2 = sharedPreferences.getInt("userid", -1);
        if (i2 != -1 && (i = sharedPreferences.getInt("metropolise_area_id", -1)) != -1) {
            C16596f a = C16596f.m42113a();
            a.mo49363b("Upgrading 3.x to 4.x using user id=" + i2 + ", metro id=" + i);
            C16596f.m42113a().mo49363b("Upgrading user id");
            String str = ((C20041e) new C20040d(eVar, i2).mo52626J()).f50877m;
            Context context2 = eVar.f33852a;
            int i3 = C20243a.f51349f;
            ServerId serverId = new ServerId(i);
            C21100e.m49373x(str, "userKey");
            C13641g.m34136y(context2, "user.dat", new C13272f(str, Math.abs(str.hashCode() % 100), serverId, "3.10.0.101", serverId), C13272f.f32924f);
            C16596f.m42113a().mo49363b("Upgrading user profile");
            String string = sharedPreferences.getString("Nickname", (String) null);
            String string2 = sharedPreferences.getString("Email", (String) null);
            int i4 = sharedPreferences.getInt("avatar_id", -1);
            C19522a a2 = C19522a.m46888a(context);
            if (string != null) {
                C19522a.f49616c.mo49545d(a2.f49620a, string);
            }
            if (string2 != null) {
                C19522a.f49617d.mo49545d(a2.f49620a, string2);
            }
            if (i4 != -1) {
                C19522a.f49618e.mo49545d(a2.f49620a, Integer.valueOf(i4));
            }
            C16596f.m42113a().mo49363b("Upgrading user favorites");
            Context context3 = eVar.f33852a;
            C20039c cVar = (C20039c) new C20038b(eVar, i2).mo52626J();
            ServerId serverId2 = new ServerId(i);
            C20559a d = C17635b.m43779f(context3).f50175e.mo52611d();
            ArrayList arrayList = cVar.f50873m;
            StringBuilder k = C13555b.m33972k("favorite_lines_");
            k.append(serverId2.mo19751c());
            k.append(".dat");
            String sb = k.toString();
            ServerId.C4254b bVar = ServerId.f15140e;
            C13641g.m34136y(context3, sb, arrayList, C19576b.m46958a(new C19804c(bVar, bVar)));
            d.mo52769m(context3, serverId2, cVar.f50874n);
            d.mo52773q(context3, serverId2, cVar.f50875o);
            ArrayList arrayList2 = cVar.f50876p;
            d.mo52771o(context3, serverId2, arrayList2);
            if (!C13717b.m34258e(arrayList2)) {
                MoovitExecutors.f37327IO.execute(new C20037a(context3, serverId2, arrayList2));
            }
            for (String deleteFile : f50868a) {
                context.deleteFile(deleteFile);
            }
            for (String next : f50869b) {
                if (!context.deleteDatabase(next)) {
                    String[] databaseList = context.databaseList();
                    int length = databaseList.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        String str2 = databaseList[i5];
                        if (str2.startsWith(next)) {
                            context.deleteDatabase(str2);
                            break;
                        }
                        i5++;
                    }
                }
            }
        }
    }

    public final String toString() {
        return "Upgrader3x_4";
    }
}
