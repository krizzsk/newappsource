package aa0;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import c00.C13717b;
import c00.C13722f;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.Geofence;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polylon;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.usebutton.sdk.internal.api.AppActionRequest;
import j20.C17706c;
import j20.C17708e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p102h0.C5021e;
import p584jl.C17885a;
import p762qz.C19206b;
import p824tp.C19728f;
import p824tp.C19739q;
import p977zz.C20930c;
import p977zz.C20964s0;
import x00.C20440a;

/* renamed from: aa0.f */
public final class C7530f {

    /* renamed from: aa0.f$a */
    public static abstract class C7531a<L> implements Comparator<L> {

        /* renamed from: b */
        public final Location f23009b;

        /* renamed from: c */
        public final C7532a f23010c = new C7532a();

        /* renamed from: aa0.f$a$a */
        public class C7532a extends ThreadLocal<Location> {
            public final Object initialValue() {
                return new Location((String) null);
            }
        }

        public C7531a(Location location) {
            this.f23009b = location;
        }

        public final int compare(L l, L l2) {
            return Float.compare(this.f23009b.distanceTo(((C19206b) l).getLocation().mo46929u((Location) this.f23010c.get())), this.f23009b.distanceTo(((C19206b) l2).getLocation().mo46929u((Location) this.f23010c.get())));
        }
    }

    /* renamed from: aa0.f$b */
    public static class C7533b implements Callable<String> {

        /* renamed from: b */
        public final Context f23011b;

        /* renamed from: c */
        public final LatLonE6 f23012c;

        public C7533b(MoovitActivity moovitActivity, LatLonE6 latLonE6) {
            C21100e.m49373x(moovitActivity, AppActionRequest.KEY_CONTEXT);
            this.f23011b = moovitActivity.getApplicationContext();
            C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            this.f23012c = latLonE6;
        }

        public final Object call() throws Exception {
            if (!Geocoder.isPresent()) {
                return null;
            }
            Address address = (Address) C13717b.m34256c(new Geocoder(this.f23011b, C20930c.m49020b(this.f23011b)).getFromLocation(this.f23012c.mo46922k(), this.f23012c.mo46926o(), 1));
            if (address != null) {
                return address.getCountryName();
            }
            return null;
        }
    }

    /* renamed from: aa0.f$c */
    public static class C7534c implements C13722f<Address> {
        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            Address address = (Address) obj;
            if (!address.hasLatitude() || !address.hasLongitude()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static Polylon m17268a(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        double d;
        LatLonE6 latLonE63;
        LatLonE6 latLonE64 = latLonE6;
        LatLonE6 latLonE65 = latLonE62;
        double w = C17885a.m44468w(latLonE6, latLonE62);
        double y = C17885a.m44472y(latLonE6, latLonE62);
        LatLonE6 B = C17885a.m44390B(latLonE64, w * 0.5d, y);
        double d2 = ((0.75d * w) * 0.5d) / 1.0d;
        double d3 = ((w * 1.25d) * 0.5d) / 1.0d;
        LatLonE6 B2 = C17885a.m44390B(B, d2, y + 90.0d);
        double y2 = C17885a.m44472y(B2, latLonE64);
        LatLonE6 latLonE66 = B2;
        double d4 = y2;
        double d5 = (double) 100;
        double y3 = (C17885a.m44472y(B2, latLonE65) - y2) / d5;
        double abs = Math.abs(y3);
        LatLonE6 B3 = C17885a.m44390B(B, d2, y - 90.0d);
        double y4 = C17885a.m44472y(B3, latLonE64);
        double y5 = (C17885a.m44472y(B3, latLonE65) - y4) / d5;
        if (abs <= Math.abs(y5)) {
            latLonE63 = latLonE66;
            d = d4;
        } else {
            latLonE63 = B3;
            d = y4;
            y3 = y5;
        }
        ArrayList arrayList = new ArrayList(102);
        for (int i = 0; i < 100; i++) {
            arrayList.add(C17885a.m44390B(latLonE63, d3, (((double) i) * y3) + d));
        }
        arrayList.add(0, latLonE64);
        arrayList.add(latLonE65);
        return new Polylon(arrayList, true);
    }

    /* renamed from: b */
    public static Polylon m17269b(Geofence geofence, int i) {
        Geofence geofence2 = geofence;
        LatLonE6 latLonE6 = geofence2.f40974b;
        double d = ((double) geofence2.f40975c) / 111701.07212763708d;
        double d2 = 3.141592653589793d / ((double) i);
        double cos = Math.cos(latLonE6.mo46924m());
        ArrayList arrayList = new ArrayList((int) Math.ceil(6.283185307179586d / d2));
        for (double d3 = 0.0d; d3 < 6.283185307179586d; d3 += d2) {
            arrayList.add(LatLonE6.m40176g((Math.sin(d3) * d) + latLonE6.mo46922k(), ((Math.cos(d3) * d) / cos) + latLonE6.mo46926o()));
        }
        return new Polylon(arrayList, false);
    }

    /* renamed from: c */
    public static C7529e m17270c(LatLonE6 latLonE6) {
        latLonE6.getClass();
        return new C7529e(latLonE6.mo46929u((Location) null));
    }

    /* renamed from: d */
    public static float m17271d(Context context, LatLonE6 latLonE6) {
        Location i = C16202a.get(context).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i();
        if (i == null) {
            return -1.0f;
        }
        return latLonE6.mo46918d(i);
    }

    /* renamed from: e */
    public static Task<LocationDescriptor> m17272e(Context context, C19728f fVar, LocationDescriptor locationDescriptor) {
        Task call = Tasks.call(MoovitExecutors.f37327IO, new C17708e(context, fVar, locationDescriptor, true));
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        return call.continueWith(executorService, new C17706c()).continueWith(executorService, new C5021e(locationDescriptor, 3));
    }

    /* renamed from: f */
    public static Uri m17273f(LocationDescriptor locationDescriptor) {
        LatLonE6 d = locationDescriptor.mo24310d();
        String f = locationDescriptor.mo24313f();
        if (d != null && C20964s0.m49090h(f)) {
            return Uri.parse(String.format((Locale) null, "geo:%1$f,%2$f", new Object[]{Double.valueOf(d.mo46922k()), Double.valueOf(d.mo46926o())}));
        } else if (d != null && !C20964s0.m49090h(f)) {
            return Uri.parse(String.format((Locale) null, "geo:0,0?q=%1$f,%2$f(%3$s)", new Object[]{Double.valueOf(d.mo46922k()), Double.valueOf(d.mo46926o()), f}));
        } else if (d != null || C20964s0.m49090h(f)) {
            return null;
        } else {
            return Uri.parse(String.format((Locale) null, "geo:0,0?q=%1$s", new Object[]{f}));
        }
    }

    /* renamed from: g */
    public static LocationDescriptor m17274g(Address address) {
        int maxAddressLineIndex;
        String str;
        Address address2 = address;
        List list = null;
        if (address2 == null || !address.hasLongitude() || !address.hasLatitude() || (maxAddressLineIndex = address.getMaxAddressLineIndex()) == -1) {
            return null;
        }
        String addressLine = address2.getAddressLine(0);
        ArrayList arrayList = new ArrayList(maxAddressLineIndex);
        for (int i = 1; i <= maxAddressLineIndex; i++) {
            arrayList.add(address2.getAddressLine(i));
        }
        String r = C20964s0.m49100r(", ", arrayList);
        LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.COORDINATE;
        LocationDescriptor.SourceType sourceType = LocationDescriptor.SourceType.GEOCODER;
        if (C20964s0.m49090h(addressLine)) {
            str = null;
        } else {
            str = addressLine;
        }
        if (!C20964s0.m49090h(r)) {
            list = Collections.singletonList(new C20440a((CharSequence) r, (String) null));
        }
        return new LocationDescriptor(locationType, sourceType, (ServerId) null, (String) null, str, list, LatLonE6.m40176g(address.getLatitude(), address.getLongitude()), (LatLonE6) null, new ResourceImage(C19739q.ic_poi_location_24_on_surface_emphasis_high, new String[0]), (Image) null);
    }
}
