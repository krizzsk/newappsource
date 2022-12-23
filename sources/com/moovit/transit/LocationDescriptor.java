package com.moovit.transit;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.MoovitApplication;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p358af.C13437d;
import p583jk.C17884p;
import p762qz.C19206b;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19739q;
import p824tp.C19746x;
import p977zz.C20964s0;
import x00.C20440a;

public class LocationDescriptor implements Parcelable, C19206b {
    public static final Parcelable.Creator<LocationDescriptor> CREATOR = new C7793a();

    /* renamed from: l */
    public static final C7794b f23645l = new C7794b();

    /* renamed from: m */
    public static final C7795c f23646m = new C7795c(LocationDescriptor.class);

    /* renamed from: b */
    public final LocationType f23647b;

    /* renamed from: c */
    public final SourceType f23648c;

    /* renamed from: d */
    public final ServerId f23649d;

    /* renamed from: e */
    public final String f23650e;

    /* renamed from: f */
    public String f23651f;

    /* renamed from: g */
    public List<C20440a> f23652g;

    /* renamed from: h */
    public LatLonE6 f23653h;

    /* renamed from: i */
    public LatLonE6 f23654i;

    /* renamed from: j */
    public Image f23655j;

    /* renamed from: k */
    public Image f23656k;

    public enum LocationType {
        CITY,
        STREET,
        POI,
        STOP,
        COORDINATE,
        CURRENT,
        BICYCLE_STOP,
        EVENT;
        
        public static C19584i<LocationType> CODER;

        /* access modifiers changed from: public */
        static {
            LocationType locationType;
            LocationType locationType2;
            LocationType locationType3;
            LocationType locationType4;
            LocationType locationType5;
            LocationType locationType6;
            LocationType locationType7;
            LocationType locationType8;
            CODER = new C19577c(LocationType.class, locationType, locationType2, locationType3, locationType4, locationType5, locationType6, locationType7, locationType8);
        }
    }

    public enum SourceType {
        LOCATION_SEARCH,
        DID_YOU_MEAN,
        TAP_ON_MAP,
        EXTERNAL,
        GEOCODER,
        USER_LOCATION;
        
        public static C19584i<SourceType> CODER;

        /* access modifiers changed from: public */
        static {
            SourceType sourceType;
            SourceType sourceType2;
            SourceType sourceType3;
            SourceType sourceType4;
            SourceType sourceType5;
            SourceType sourceType6;
            CODER = new C19577c(SourceType.class, sourceType, sourceType2, sourceType3, sourceType4, sourceType5, sourceType6);
        }
    }

    /* renamed from: com.moovit.transit.LocationDescriptor$a */
    public class C7793a implements Parcelable.Creator<LocationDescriptor> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocationDescriptor) C19612n.m46981v(parcel, LocationDescriptor.f23646m);
        }

        public final Object[] newArray(int i) {
            return new LocationDescriptor[i];
        }
    }

    /* renamed from: com.moovit.transit.LocationDescriptor$b */
    public class C7794b extends C19621u<LocationDescriptor> {
        public C7794b() {
            super(3);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            LocationDescriptor locationDescriptor = (LocationDescriptor) obj;
            LocationType locationType = locationDescriptor.f23647b;
            C19584i<LocationType> iVar = LocationType.CODER;
            qVar.getClass();
            iVar.write(locationType, qVar);
            qVar.mo51967q(locationDescriptor.f23648c, SourceType.CODER);
            ServerId serverId = locationDescriptor.f23649d;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51955t(locationDescriptor.f23650e);
            qVar.mo51955t(locationDescriptor.f23651f);
            qVar.mo51964g(locationDescriptor.f23652g, C20440a.f51780d);
            LatLonE6 latLonE6 = locationDescriptor.f23653h;
            LatLonE6.C15742b bVar = LatLonE6.f40978f;
            qVar.mo51967q(latLonE6, bVar);
            qVar.mo51967q(locationDescriptor.f23654i, bVar);
            qVar.mo51967q(locationDescriptor.f23655j, C16019d.m40803a().f41718d);
            qVar.mo51967q(locationDescriptor.f23656k, C16019d.m40803a().f41718d);
        }
    }

    /* renamed from: com.moovit.transit.LocationDescriptor$c */
    public class C7795c extends C19620t<LocationDescriptor> {
        public C7795c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 3;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            LatLonE6 latLonE6;
            LatLonE6 latLonE62;
            ServerId serverId2 = null;
            if (i == 3) {
                C19584i<LocationType> iVar = LocationType.CODER;
                pVar.getClass();
                LocationType read = iVar.read(pVar);
                SourceType sourceType = (SourceType) pVar.mo51962q(SourceType.CODER);
                if (!(!pVar.mo51919b())) {
                    serverId2 = new ServerId(pVar.mo51924l());
                }
                String t = pVar.mo51948t();
                String t2 = pVar.mo51948t();
                ArrayList f = pVar.mo51958f(C20440a.f51780d);
                LatLonE6.C15743c cVar = LatLonE6.f40979g;
                return new LocationDescriptor(read, sourceType, serverId2, t, t2, f, (LatLonE6) pVar.mo51962q(cVar), (LatLonE6) pVar.mo51962q(cVar), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), (Image) pVar.mo51962q(C16019d.m40803a().f41718d));
            } else if (i == 2) {
                C19584i<LocationType> iVar2 = LocationType.CODER;
                pVar.getClass();
                LocationType read2 = iVar2.read(pVar);
                SourceType sourceType2 = (SourceType) pVar.mo51962q(SourceType.CODER);
                if (!(!pVar.mo51919b())) {
                    serverId2 = new ServerId(pVar.mo51924l());
                }
                String t3 = pVar.mo51948t();
                String t4 = pVar.mo51948t();
                ArrayList f2 = pVar.mo51958f(C20440a.f51780d);
                LatLonE6.C15743c cVar2 = LatLonE6.f40979g;
                return new LocationDescriptor(read2, sourceType2, serverId2, t3, t4, f2, (LatLonE6) pVar.mo51962q(cVar2), (LatLonE6) pVar.mo51962q(cVar2), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), (Image) null);
            } else if (i == 1) {
                C19584i<LocationType> iVar3 = LocationType.CODER;
                pVar.getClass();
                LocationType read3 = iVar3.read(pVar);
                SourceType sourceType3 = (SourceType) pVar.mo51962q(SourceType.CODER);
                if (!(!pVar.mo51919b())) {
                    serverId2 = new ServerId(pVar.mo51924l());
                }
                String t5 = pVar.mo51948t();
                String t6 = pVar.mo51948t();
                LatLonE6.C15743c cVar3 = LatLonE6.f40979g;
                return new LocationDescriptor(read3, sourceType3, serverId2, t5, t6, (List<C20440a>) null, (LatLonE6) pVar.mo51962q(cVar3), (LatLonE6) pVar.mo51962q(cVar3), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), (Image) null);
            } else {
                C19584i<LocationType> iVar4 = LocationType.CODER;
                pVar.getClass();
                LocationType read4 = iVar4.read(pVar);
                SourceType sourceType4 = (SourceType) pVar.mo51962q(SourceType.CODER);
                if (!pVar.mo51919b()) {
                    serverId = null;
                } else {
                    serverId = new ServerId(pVar.mo51924l());
                }
                String t7 = pVar.mo51948t();
                String t8 = pVar.mo51948t();
                LatLonE6 latLonE63 = (LatLonE6) pVar.mo51962q(LatLonE6.f40979g);
                boolean b = pVar.mo51919b();
                Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
                if (b) {
                    latLonE6 = null;
                } else {
                    latLonE6 = latLonE63;
                }
                if (b) {
                    latLonE62 = latLonE63;
                } else {
                    latLonE62 = null;
                }
                return new LocationDescriptor(read4, sourceType4, serverId, t7, t8, (List<C20440a>) null, latLonE6, latLonE62, image, (Image) null);
            }
        }
    }

    public LocationDescriptor(LocationType locationType, SourceType sourceType, ServerId serverId, String str, String str2, List<C20440a> list, LatLonE6 latLonE6, LatLonE6 latLonE62, Image image, Image image2) {
        C21100e.m49373x(locationType, "type");
        this.f23647b = locationType;
        this.f23648c = sourceType;
        this.f23649d = serverId;
        this.f23650e = str;
        this.f23651f = str2;
        this.f23652g = list;
        mo24317n(latLonE6);
        this.f23654i = latLonE62;
        this.f23655j = image;
        this.f23656k = image2;
    }

    /* renamed from: b */
    public static LocationDescriptor m17768b(BicycleStop bicycleStop) {
        List list;
        LocationType locationType = LocationType.BICYCLE_STOP;
        SourceType sourceType = SourceType.EXTERNAL;
        ServerId serverId = bicycleStop.f23637c;
        String str = bicycleStop.f23638d;
        if (C20964s0.m49090h(bicycleStop.f23639e)) {
            list = null;
        } else {
            list = Collections.singletonList(new C20440a((CharSequence) bicycleStop.f23639e, (String) null));
        }
        return new LocationDescriptor(locationType, sourceType, serverId, (String) null, str, list, bicycleStop.f23640f, (LatLonE6) null, bicycleStop.mo24299b(), (Image) null);
    }

    /* renamed from: c */
    public static LocationDescriptor m17769c(TransitStop transitStop) {
        boolean z;
        List list;
        List list2;
        LocationType locationType = LocationType.STOP;
        SourceType sourceType = SourceType.EXTERNAL;
        ServerId serverId = transitStop.f23730b;
        String str = transitStop.f23731c;
        MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
        int i = C7843b.f23777a;
        String str2 = transitStop.f23733e;
        boolean z2 = !C20964s0.m49090h(str2);
        if ((transitStop.f23745q.f23627b & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && z) {
            list2 = Arrays.asList(new C20440a[]{new C20440a((CharSequence) moovitApplication.getString(C19746x.android_stop_id, new Object[]{str2}), (String) null), new C20440a((CharSequence) moovitApplication.getString(C19746x.string_list_delimiter_dot), (String) null), new C20440a((Image) new ResourceImage(C7843b.f23777a, new String[0]), (String) null)});
        } else if (z2) {
            list2 = Collections.singletonList(new C20440a((CharSequence) moovitApplication.getString(C19746x.android_stop_id, new Object[]{str2}), (String) null));
        } else if (z) {
            list2 = Collections.singletonList(new C20440a((Image) new ResourceImage(C7843b.f23777a, new String[0]), (String) null));
        } else {
            list = null;
            return new LocationDescriptor(locationType, sourceType, serverId, (String) null, str, list, transitStop.f23732d, (LatLonE6) null, transitStop.f23734f, (Image) null);
        }
        list = list2;
        return new LocationDescriptor(locationType, sourceType, serverId, (String) null, str, list, transitStop.f23732d, (LatLonE6) null, transitStop.f23734f, (Image) null);
    }

    /* renamed from: k */
    public static LocationDescriptor m17770k(LatLonE6 latLonE6) {
        return new LocationDescriptor(LocationType.COORDINATE, SourceType.USER_LOCATION, (ServerId) null, (String) null, (String) null, (List<C20440a>) null, latLonE6, (LatLonE6) null, new ResourceImage(C19739q.ic_poi_location_24_on_surface_emphasis_high, new String[0]), (Image) null);
    }

    /* renamed from: l */
    public static LocationDescriptor m17771l(LatLonE6 latLonE6) {
        return new LocationDescriptor(LocationType.COORDINATE, SourceType.TAP_ON_MAP, (ServerId) null, (String) null, (String) null, (List<C20440a>) null, latLonE6, (LatLonE6) null, new ResourceImage(C19739q.ic_poi_location_24_on_surface_emphasis_high, new String[0]), (Image) null);
    }

    /* renamed from: m */
    public static LocationDescriptor m17772m(Context context) {
        return new LocationDescriptor(LocationType.CURRENT, SourceType.USER_LOCATION, (ServerId) null, (String) null, context.getString(C19746x.current_location), (List<C20440a>) null, (LatLonE6) null, (LatLonE6) null, new ResourceImage(C19739q.ic_poi_location_24_on_surface_emphasis_high, new String[0]), (Image) null);
    }

    /* renamed from: d */
    public final LatLonE6 mo24310d() {
        LatLonE6 latLonE6 = this.f23653h;
        return latLonE6 != null ? latLonE6 : this.f23654i;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0093 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.moovit.transit.LocationDescriptor
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.moovit.transit.LocationDescriptor r7 = (com.moovit.transit.LocationDescriptor) r7
            com.moovit.transit.LocationDescriptor$LocationType r0 = r6.f23647b
            com.moovit.transit.LocationDescriptor$LocationType r2 = r7.f23647b
            boolean r0 = p977zz.C20975x0.m49118e(r0, r2)
            if (r0 != 0) goto L_0x0013
            return r1
        L_0x0013:
            com.moovit.transit.LocationDescriptor$LocationType r0 = r6.f23647b
            com.moovit.transit.LocationDescriptor$LocationType r2 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT
            r3 = 1
            if (r0 != r2) goto L_0x001b
            return r3
        L_0x001b:
            com.moovit.network.model.ServerId r0 = r6.f23649d
            if (r0 == 0) goto L_0x0028
            com.moovit.network.model.ServerId r2 = r7.f23649d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.moovit.network.model.ServerId r0 = r6.f23649d
            com.moovit.network.model.ServerId r2 = r7.f23649d
            boolean r0 = p977zz.C20975x0.m49118e(r0, r2)
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r6.f23651f
            java.lang.String r2 = r7.f23651f
            boolean r0 = p977zz.C20975x0.m49118e(r0, r2)
            if (r0 == 0) goto L_0x0094
            java.util.List<x00.a> r0 = r6.f23652g
            java.util.List<x00.a> r2 = r7.f23652g
            if (r0 != 0) goto L_0x0048
            if (r2 != 0) goto L_0x0046
        L_0x0044:
            r0 = 1
            goto L_0x0073
        L_0x0046:
            r0 = 0
            goto L_0x0073
        L_0x0048:
            if (r2 != 0) goto L_0x004b
            goto L_0x0046
        L_0x004b:
            int r4 = r0.size()
            int r5 = r2.size()
            if (r4 == r5) goto L_0x0056
            goto L_0x0046
        L_0x0056:
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r2 = r2.iterator()
        L_0x005e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r0.next()
            java.lang.Object r5 = r2.next()
            boolean r4 = p977zz.C20975x0.m49118e(r4, r5)
            if (r4 != 0) goto L_0x005e
            goto L_0x0046
        L_0x0073:
            if (r0 == 0) goto L_0x0094
            com.moovit.commons.geo.LatLonE6 r0 = r6.f23653h
            com.moovit.commons.geo.LatLonE6 r2 = r7.f23653h
            boolean r0 = p977zz.C20975x0.m49118e(r0, r2)
            if (r0 == 0) goto L_0x0094
            com.moovit.commons.geo.LatLonE6 r0 = r6.f23654i
            com.moovit.commons.geo.LatLonE6 r2 = r7.f23654i
            boolean r0 = p977zz.C20975x0.m49118e(r0, r2)
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r6.f23650e
            java.lang.String r7 = r7.f23650e
            boolean r7 = p977zz.C20975x0.m49118e(r0, r7)
            if (r7 == 0) goto L_0x0094
            r1 = 1
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.transit.LocationDescriptor.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo24313f() {
        if (LocationType.STOP.equals(this.f23647b)) {
            return this.f23651f;
        }
        String str = this.f23651f;
        String g = mo24314g();
        if (str == null) {
            return g;
        }
        if (g == null) {
            return str;
        }
        return C20964s0.m49102t(", ", str, g);
    }

    /* renamed from: g */
    public final String mo24314g() {
        if (this.f23652g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (C20440a next : this.f23652g) {
            if (next.mo52636a()) {
                sb.append(next.f51782b);
                sb.append(' ');
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString().trim();
    }

    public final LatLonE6 getLocation() {
        return mo24310d();
    }

    public final int hashCode() {
        int c = C17884p.m44360c(17, this.f23647b);
        if (this.f23647b == LocationType.CURRENT) {
            return c;
        }
        int c2 = C17884p.m44360c(c, this.f23649d);
        if (this.f23649d != null) {
            return c2;
        }
        return C17884p.m44360c(C17884p.m44360c(C17884p.m44360c(C17884p.m44360c(C17884p.m44360c(c2, this.f23651f), this.f23652g), this.f23653h), this.f23654i), this.f23650e);
    }

    /* renamed from: j */
    public final boolean mo24316j(LocationType locationType) {
        return this.f23647b == locationType;
    }

    /* renamed from: n */
    public final void mo24317n(LatLonE6 latLonE6) {
        LocationType locationType = this.f23647b;
        LocationType locationType2 = LocationType.COORDINATE;
        if (locationType == locationType2 && latLonE6 == null) {
            throw new IllegalArgumentException("Unable to set null coordinates when location type is " + locationType2);
        }
        this.f23653h = latLonE6;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("LocationDescriptor[", "type=");
        n.append(this.f23647b.name());
        n.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        if (this.f23649d != null) {
            n.append("id=");
            n.append(this.f23649d);
            n.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        }
        String str = this.f23651f;
        if (str != null) {
            n.append(str);
            n.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        }
        LatLonE6 latLonE6 = this.f23653h;
        if (latLonE6 != null) {
            n.append(latLonE6);
            n.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        }
        LatLonE6 latLonE62 = this.f23654i;
        if (latLonE62 != null) {
            n.append(latLonE62);
            n.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        }
        n.append("]");
        return n.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23645l);
    }

    public LocationDescriptor(LocationDescriptor locationDescriptor) {
        this(locationDescriptor.f23647b, locationDescriptor.f23648c, locationDescriptor.f23649d, locationDescriptor.f23650e, locationDescriptor.f23651f, locationDescriptor.f23652g, locationDescriptor.f23653h, locationDescriptor.f23654i, locationDescriptor.f23655j, locationDescriptor.f23656k);
    }
}
