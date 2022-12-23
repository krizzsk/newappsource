package p455dy;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c00.C13733n;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation;
import com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType;
import com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import java.util.ArrayList;
import java.util.List;
import org.apache.thrift.TBase;
import p401bz.C13709c;
import p401bz.C13712f;
import p567iq.C17635b;
import p638lr.C18262i;
import p638lr.C18267n;
import p922xr.C20559a;

/* renamed from: dy.c */
public final class C16750c extends C13712f {

    /* renamed from: d */
    public static final C16751a f43613d = new C16751a();

    /* renamed from: c */
    public final ServerId f43614c;

    /* renamed from: dy.c$a */
    public class C16751a implements C13733n<LocationFavorite, MVFavoriteLocation> {
        public final Object convert(Object obj) throws Exception {
            return C16750c.m42308e(MVFavoriteLocationType.ADDRESS, (LocationFavorite) obj);
        }
    }

    public C16750c(Context context, ServerId serverId) {
        super(context);
        C21100e.m49373x(serverId, "metroId");
        this.f43614c = serverId;
    }

    /* renamed from: e */
    public static MVFavoriteLocation m42308e(MVFavoriteLocationType mVFavoriteLocationType, LocationFavorite locationFavorite) {
        String str = locationFavorite.f40599c;
        MVLocationDescriptor u = C13749c.m34335u((LocationDescriptor) locationFavorite.f52687b);
        MVFavoriteLocation mVFavoriteLocation = new MVFavoriteLocation();
        mVFavoriteLocation.type = mVFavoriteLocationType;
        mVFavoriteLocation.name = str;
        mVFavoriteLocation.address = u;
        return mVFavoriteLocation;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        Context context = this.f33791b;
        C20559a d = C17635b.m43779f(context).f50175e.mo52611d();
        ArrayList arrayList = new ArrayList();
        LocationFavorite e = d.mo52762e(context, this.f43614c);
        if (e != null) {
            arrayList.add(m42308e(MVFavoriteLocationType.HOME, e));
        }
        LocationFavorite i = d.mo52766i(context, this.f43614c);
        if (i != null) {
            arrayList.add(m42308e(MVFavoriteLocationType.WORK, i));
        }
        C13720d.m34276f(d.mo52764g(context, this.f43614c), (C13722f) null, f43613d, arrayList);
        List<ServerId> f = d.mo52763f(context, this.f43614c);
        List<ServerId> h = d.mo52765h(context, this.f43614c);
        int i2 = this.f43614c.f15142b;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<O> c = C13720d.m34273c(f, (C13722f) null, new C18262i(11));
        ArrayList<O> c2 = C13720d.m34273c(h, (C13722f) null, new C18267n(8));
        MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = new MVSetFavoriteLineGroupsAndStops();
        mVSetFavoriteLineGroupsAndStops.metroId = i2;
        mVSetFavoriteLineGroupsAndStops.mo27282l();
        mVSetFavoriteLineGroupsAndStops.timestamp = currentTimeMillis;
        mVSetFavoriteLineGroupsAndStops.mo27283m();
        mVSetFavoriteLineGroupsAndStops.favoriteLineGroupIds = c;
        mVSetFavoriteLineGroupsAndStops.favoriteStopIds = c2;
        mVSetFavoriteLineGroupsAndStops.favoriteLocations = arrayList;
        String b = C13709c.m34226b(context);
        if (b != null) {
            mVSetFavoriteLineGroupsAndStops.userKey = b;
        }
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.SET_FAVORITE_LINE_GROUPS_AND_STOPS;
        mVServerMessage.value_ = mVSetFavoriteLineGroupsAndStops;
        return mVServerMessage;
    }
}
