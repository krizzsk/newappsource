package p479ey;

import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import c70.C13779s;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.request.BadResponseException;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVLocationType;
import com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import com.tranzmate.moovit.protocol.users.MVUserAccountDataNew;
import java.util.List;
import org.apache.thrift.TBase;
import p435de.C16596f;
import p455dy.C16749b;
import p875vs.C20228e;

/* renamed from: ey.h */
public final class C16896h extends C13779s<C16896h, MVUserAccountDataNew, List<C16749b>> {

    /* renamed from: ey.h$a */
    public static /* synthetic */ class C16897a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43915a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType[] r0 = com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43915a = r0
                com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType r1 = com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType.HOME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43915a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType r1 = com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType.WORK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43915a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType r1 = com.tranzmate.moovit.protocol.favorites.MVFavoriteLocationType.ADDRESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p479ey.C16896h.C16897a.<clinit>():void");
        }
    }

    public C16896h() {
        super(MVUserAccountDataNew.class);
    }

    /* renamed from: f */
    public static LocationFavorite m42699f(MVFavoriteLocation mVFavoriteLocation) {
        try {
            MVLocationDescriptor mVLocationDescriptor = mVFavoriteLocation.address;
            if (mVLocationDescriptor != null) {
                if (mVLocationDescriptor.type == null && mVLocationDescriptor.latlon != null) {
                    mVLocationDescriptor.type = MVLocationType.LatLon;
                    mVLocationDescriptor.inaccurateLatLon = false;
                    mVLocationDescriptor.mo26332r();
                    mVLocationDescriptor.mo26331q(false);
                }
            }
            return new LocationFavorite(C13749c.m34324j(mVFavoriteLocation.address, (MVLocationSourceType) null), mVFavoriteLocation.name);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
            return null;
        }
    }

    /* renamed from: e */
    public final Object mo23773e(TBase tBase) throws BadResponseException {
        return C13720d.m34273c(((MVUserAccountDataNew) tBase).favoriteLineGroupsAndStops, (C13722f) null, new C20228e(10));
    }
}
