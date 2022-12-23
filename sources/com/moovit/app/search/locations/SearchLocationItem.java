package com.moovit.app.search.locations;

import android.os.Parcel;
import android.os.Parcelable;
import c00.C13733n;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p583jk.C17884p;
import p762qz.C19206b;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import x00.C20440a;

public class SearchLocationItem implements Parcelable, C5384a, C19206b {
    public static final Parcelable.Creator<SearchLocationItem> CREATOR = new C15279a();

    /* renamed from: m */
    public static final C15280b f39452m = new C15280b();

    /* renamed from: n */
    public static final C15281c f39453n = new C15281c(SearchLocationItem.class);

    /* renamed from: o */
    public static final C19577c<Type> f39454o = new C19577c<>(Type.class, Type.STOP, Type.CITY, Type.STREET, Type.SITE, Type.GEOCODER, Type.EVENT);

    /* renamed from: p */
    public static final C19577c<Source> f39455p = new C19577c<>(Source.class, Source.DEFAULT, Source.LOCATION_FAVORITE, Source.LOCATION_FAVORITE_HOME, Source.LOCATION_FAVORITE_WORK);

    /* renamed from: q */
    public static final C15282d f39456q = new C15282d();

    /* renamed from: b */
    public final ServerId f39457b;

    /* renamed from: c */
    public final Type f39458c;

    /* renamed from: d */
    public final Image f39459d;

    /* renamed from: e */
    public final String f39460e;

    /* renamed from: f */
    public final List<C20440a> f39461f;

    /* renamed from: g */
    public final LatLonE6 f39462g;

    /* renamed from: h */
    public final boolean f39463h;

    /* renamed from: i */
    public final String f39464i;

    /* renamed from: j */
    public final int f39465j;

    /* renamed from: k */
    public final Source f39466k;

    /* renamed from: l */
    public transient int f39467l;

    public enum Source {
        DEFAULT,
        LOCATION_FAVORITE,
        LOCATION_FAVORITE_HOME,
        LOCATION_FAVORITE_WORK
    }

    public enum Type {
        STOP,
        CITY,
        STREET,
        SITE,
        GEOCODER,
        EVENT
    }

    /* renamed from: com.moovit.app.search.locations.SearchLocationItem$a */
    public class C15279a implements Parcelable.Creator<SearchLocationItem> {
        public final Object createFromParcel(Parcel parcel) {
            return (SearchLocationItem) C19612n.m46981v(parcel, SearchLocationItem.f39453n);
        }

        public final Object[] newArray(int i) {
            return new SearchLocationItem[i];
        }
    }

    /* renamed from: com.moovit.app.search.locations.SearchLocationItem$b */
    public class C15280b extends C19621u<SearchLocationItem> {
        public C15280b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            SearchLocationItem searchLocationItem = (SearchLocationItem) obj;
            ServerId serverId = searchLocationItem.f39457b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            SearchLocationItem.f39454o.write(searchLocationItem.f39458c, qVar);
            qVar.mo51967q(searchLocationItem.f39459d, C16019d.m40803a().f41718d);
            qVar.mo51955t(searchLocationItem.f39460e);
            qVar.mo51964g(searchLocationItem.f39461f, C20440a.f51780d);
            qVar.mo51967q(searchLocationItem.f39462g, LatLonE6.f40978f);
            qVar.mo51934b(searchLocationItem.f39463h);
            qVar.mo51955t(searchLocationItem.f39464i);
            qVar.mo51939l(searchLocationItem.f39465j);
            SearchLocationItem.f39455p.write(searchLocationItem.f39466k, qVar);
        }
    }

    /* renamed from: com.moovit.app.search.locations.SearchLocationItem$c */
    public class C15281c extends C19620t<SearchLocationItem> {
        public C15281c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i <= 2;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            int i2;
            Source source;
            pVar.getClass();
            ServerId serverId = new ServerId(pVar.mo51924l());
            Type type = (Type) C13555b.m33968g(SearchLocationItem.f39454o, pVar);
            Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            String t = pVar.mo51948t();
            ArrayList f = pVar.mo51958f(C20440a.f51780d);
            LatLonE6 latLonE6 = (LatLonE6) pVar.mo51962q(LatLonE6.f40979g);
            boolean b = pVar.mo51919b();
            String t2 = pVar.mo51948t();
            if (i >= 1) {
                i2 = pVar.mo51924l();
            } else {
                i2 = -1;
            }
            Source source2 = Source.DEFAULT;
            if (i >= 2) {
                source = (Source) C13555b.m33968g(SearchLocationItem.f39455p, pVar);
            } else {
                source = source2;
            }
            return new SearchLocationItem(serverId, type, image, t, f, latLonE6, b, t2, i2, source, -1);
        }
    }

    /* renamed from: com.moovit.app.search.locations.SearchLocationItem$d */
    public class C15282d implements C13733n<SearchLocationItem, String> {
        public final Object convert(Object obj) throws Exception {
            SearchLocationItem searchLocationItem = (SearchLocationItem) obj;
            StringBuilder sb = new StringBuilder();
            String str = searchLocationItem.f39460e;
            if (str != null) {
                sb.append(str);
                sb.append(' ');
            }
            List<C20440a> list = searchLocationItem.f39461f;
            if (list != null) {
                for (C20440a next : list) {
                    if (next.mo52636a()) {
                        sb.append(next.f51782b);
                        sb.append(' ');
                    }
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: com.moovit.app.search.locations.SearchLocationItem$e */
    public static /* synthetic */ class C15283e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39468a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39469b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f39470c;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|46) */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a8 */
        static {
            /*
                com.moovit.transit.LocationDescriptor$LocationType[] r0 = com.moovit.transit.LocationDescriptor.LocationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39470c = r0
                r1 = 1
                com.moovit.transit.LocationDescriptor$LocationType r2 = com.moovit.transit.LocationDescriptor.LocationType.CITY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f39470c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.transit.LocationDescriptor$LocationType r3 = com.moovit.transit.LocationDescriptor.LocationType.STREET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f39470c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.transit.LocationDescriptor$LocationType r4 = com.moovit.transit.LocationDescriptor.LocationType.STOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f39470c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.transit.LocationDescriptor$LocationType r5 = com.moovit.transit.LocationDescriptor.LocationType.POI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f39470c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.transit.LocationDescriptor$LocationType r6 = com.moovit.transit.LocationDescriptor.LocationType.EVENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f39470c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.transit.LocationDescriptor$LocationType r7 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r6 = f39470c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.transit.LocationDescriptor$LocationType r7 = com.moovit.transit.LocationDescriptor.LocationType.CURRENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r8 = 7
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.moovit.app.search.locations.SearchLocationItem$Type[] r6 = com.moovit.app.search.locations.SearchLocationItem.Type.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f39469b = r6
                com.moovit.app.search.locations.SearchLocationItem$Type r7 = com.moovit.app.search.locations.SearchLocationItem.Type.STOP     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r6 = f39469b     // Catch:{ NoSuchFieldError -> 0x006f }
                com.moovit.app.search.locations.SearchLocationItem$Type r7 = com.moovit.app.search.locations.SearchLocationItem.Type.CITY     // Catch:{ NoSuchFieldError -> 0x006f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r6 = f39469b     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.moovit.app.search.locations.SearchLocationItem$Type r7 = com.moovit.app.search.locations.SearchLocationItem.Type.STREET     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r2 = f39469b     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.moovit.app.search.locations.SearchLocationItem$Type r6 = com.moovit.app.search.locations.SearchLocationItem.Type.SITE     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r2 = f39469b     // Catch:{ NoSuchFieldError -> 0x008d }
                com.moovit.app.search.locations.SearchLocationItem$Type r3 = com.moovit.app.search.locations.SearchLocationItem.Type.EVENT     // Catch:{ NoSuchFieldError -> 0x008d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r2 = f39469b     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.moovit.app.search.locations.SearchLocationItem$Type r3 = com.moovit.app.search.locations.SearchLocationItem.Type.GEOCODER     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r2[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                com.moovit.app.useraccount.manager.favorites.LocationFavorite$FavoriteType[] r2 = com.moovit.app.useraccount.manager.favorites.LocationFavorite.FavoriteType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f39468a = r2
                com.moovit.app.useraccount.manager.favorites.LocationFavorite$FavoriteType r3 = com.moovit.app.useraccount.manager.favorites.LocationFavorite.FavoriteType.HOME     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r1 = f39468a     // Catch:{ NoSuchFieldError -> 0x00b2 }
                com.moovit.app.useraccount.manager.favorites.LocationFavorite$FavoriteType r2 = com.moovit.app.useraccount.manager.favorites.LocationFavorite.FavoriteType.WORK     // Catch:{ NoSuchFieldError -> 0x00b2 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b2 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x00b2 }
            L_0x00b2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.locations.SearchLocationItem.C15283e.<clinit>():void");
        }
    }

    public SearchLocationItem(ServerId serverId, Type type, Image image, String str, List<C20440a> list, LatLonE6 latLonE6, boolean z, String str2, int i, Source source, int i2) {
        C21100e.m49373x(serverId, "id");
        this.f39457b = serverId;
        C21100e.m49373x(type, "type");
        this.f39458c = type;
        this.f39459d = image;
        this.f39460e = str;
        this.f39461f = list;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f39462g = latLonE6;
        this.f39463h = z;
        this.f39464i = str2;
        this.f39465j = i;
        this.f39466k = source;
        this.f39467l = i2;
    }

    /* renamed from: b */
    public static Type m39100b(LocationDescriptor.LocationType locationType) {
        switch (C15283e.f39470c[locationType.ordinal()]) {
            case 1:
                return Type.CITY;
            case 2:
                return Type.STREET;
            case 3:
                return Type.STOP;
            case 4:
                return Type.SITE;
            case 5:
                return Type.EVENT;
            case 6:
            case 7:
                return Type.GEOCODER;
            default:
                throw new IllegalArgumentException("Unknown type for location descriptor " + locationType);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.app.search.locations.SearchLocationItem m39101c(com.moovit.app.useraccount.manager.favorites.LocationFavorite r16, com.moovit.app.useraccount.manager.favorites.LocationFavorite.FavoriteType r17) {
        /*
            r0 = r16
            T r1 = r0.f52687b
            com.moovit.transit.LocationDescriptor r1 = (com.moovit.transit.LocationDescriptor) r1
            com.moovit.network.model.ServerId r2 = r1.f23649d
            if (r2 != 0) goto L_0x0010
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r3 = -1
            r2.<init>(r3)
        L_0x0010:
            r5 = r2
            com.moovit.transit.LocationDescriptor$LocationType r2 = r1.f23647b
            com.moovit.app.search.locations.SearchLocationItem$Type r6 = m39100b(r2)
            com.moovit.image.model.ResourceImage r7 = new com.moovit.image.model.ResourceImage
            int r2 = r17.getIconResId()
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            r7.<init>(r2, r4)
            java.lang.String r0 = r0.f40599c
            boolean r2 = p977zz.C20964s0.m49090h(r0)
            r4 = 0
            if (r2 != 0) goto L_0x002d
            goto L_0x003f
        L_0x002d:
            int r0 = r17.getDefaultTitleResId()
            if (r0 == 0) goto L_0x0041
            com.moovit.app.MoovitAppApplication r0 = com.moovit.app.MoovitAppApplication.m37038x()
            int r2 = r17.getDefaultTitleResId()
            java.lang.String r0 = r0.getString(r2)
        L_0x003f:
            r8 = r0
            goto L_0x0042
        L_0x0041:
            r8 = r4
        L_0x0042:
            x00.a r0 = new x00.a
            java.lang.String r2 = r1.mo24313f()
            r0.<init>((java.lang.CharSequence) r2, (java.lang.String) r4)
            java.util.List r9 = java.util.Collections.singletonList(r0)
            com.moovit.commons.geo.LatLonE6 r10 = r1.mo24310d()
            com.moovit.commons.geo.LatLonE6 r0 = r1.f23654i
            r2 = 1
            if (r0 == 0) goto L_0x005e
            com.moovit.commons.geo.LatLonE6 r0 = r1.f23653h
            if (r0 != 0) goto L_0x005e
            r11 = 1
            goto L_0x005f
        L_0x005e:
            r11 = 0
        L_0x005f:
            java.lang.String r12 = r1.f23650e
            r13 = -1
            int[] r0 = com.moovit.app.search.locations.SearchLocationItem.C15283e.f39468a
            int r1 = r17.ordinal()
            r0 = r0[r1]
            if (r0 == r2) goto L_0x0075
            r1 = 2
            if (r0 == r1) goto L_0x0072
            com.moovit.app.search.locations.SearchLocationItem$Source r0 = com.moovit.app.search.locations.SearchLocationItem.Source.LOCATION_FAVORITE
            goto L_0x0077
        L_0x0072:
            com.moovit.app.search.locations.SearchLocationItem$Source r0 = com.moovit.app.search.locations.SearchLocationItem.Source.LOCATION_FAVORITE_WORK
            goto L_0x0077
        L_0x0075:
            com.moovit.app.search.locations.SearchLocationItem$Source r0 = com.moovit.app.search.locations.SearchLocationItem.Source.LOCATION_FAVORITE_HOME
        L_0x0077:
            r14 = r0
            com.moovit.app.search.locations.SearchLocationItem r0 = new com.moovit.app.search.locations.SearchLocationItem
            r15 = -1
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.search.locations.SearchLocationItem.m39101c(com.moovit.app.useraccount.manager.favorites.LocationFavorite, com.moovit.app.useraccount.manager.favorites.LocationFavorite$FavoriteType):com.moovit.app.search.locations.SearchLocationItem");
    }

    /* renamed from: d */
    public static SearchLocationItem m39102d(LocationDescriptor locationDescriptor) {
        LatLonE6 d = locationDescriptor.mo24310d();
        if (d == null) {
            return null;
        }
        ServerId serverId = locationDescriptor.f23649d;
        if (serverId == null) {
            serverId = new ServerId(-2);
        }
        return new SearchLocationItem(serverId, m39100b(locationDescriptor.f23647b), locationDescriptor.f23655j, locationDescriptor.f23651f, locationDescriptor.f23652g, d, false, locationDescriptor.f23650e, -1, Source.DEFAULT, -1);
    }

    /* renamed from: g */
    public static LocationDescriptor m39103g(SearchLocationItem searchLocationItem) {
        ServerId serverId;
        LocationDescriptor.SourceType sourceType;
        LocationDescriptor.LocationType locationType;
        LatLonE6 latLonE6;
        LocationDescriptor.LocationType locationType2;
        LocationDescriptor.SourceType sourceType2;
        ServerId serverId2;
        LatLonE6 latLonE62 = null;
        switch (C15283e.f39469b[searchLocationItem.f39458c.ordinal()]) {
            case 1:
                serverId2 = searchLocationItem.f39457b;
                sourceType2 = LocationDescriptor.SourceType.LOCATION_SEARCH;
                locationType2 = LocationDescriptor.LocationType.STOP;
                break;
            case 2:
                serverId2 = searchLocationItem.f39457b;
                sourceType2 = LocationDescriptor.SourceType.LOCATION_SEARCH;
                locationType2 = LocationDescriptor.LocationType.CITY;
                break;
            case 3:
                serverId2 = searchLocationItem.f39457b;
                sourceType2 = LocationDescriptor.SourceType.LOCATION_SEARCH;
                locationType2 = LocationDescriptor.LocationType.STREET;
                break;
            case 4:
                serverId2 = searchLocationItem.f39457b;
                sourceType2 = LocationDescriptor.SourceType.LOCATION_SEARCH;
                locationType2 = LocationDescriptor.LocationType.POI;
                break;
            case 5:
                serverId2 = searchLocationItem.f39457b;
                sourceType2 = LocationDescriptor.SourceType.LOCATION_SEARCH;
                locationType2 = LocationDescriptor.LocationType.EVENT;
                break;
            case 6:
                sourceType = LocationDescriptor.SourceType.GEOCODER;
                serverId = null;
                locationType = LocationDescriptor.LocationType.COORDINATE;
                break;
            default:
                StringBuilder k = C13555b.m33972k("Unknown type for location descriptor ");
                k.append(searchLocationItem.f39458c);
                throw new IllegalArgumentException(k.toString());
        }
        serverId = serverId2;
        sourceType = sourceType2;
        locationType = locationType2;
        String str = searchLocationItem.f39464i;
        String str2 = searchLocationItem.f39460e;
        List<C20440a> list = searchLocationItem.f39461f;
        boolean z = searchLocationItem.f39463h;
        if (z) {
            latLonE6 = null;
        } else {
            latLonE6 = searchLocationItem.f39462g;
        }
        if (z) {
            latLonE62 = searchLocationItem.f39462g;
        }
        return new LocationDescriptor(locationType, sourceType, serverId, str, str2, list, latLonE6, latLonE62, searchLocationItem.f39459d, (Image) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLocationItem)) {
            return false;
        }
        SearchLocationItem searchLocationItem = (SearchLocationItem) obj;
        if (this.f39463h != searchLocationItem.f39463h || this.f39465j != searchLocationItem.f39465j || !this.f39457b.equals(searchLocationItem.f39457b) || this.f39458c != searchLocationItem.f39458c || !this.f39462g.equals(searchLocationItem.f39462g)) {
            return false;
        }
        String str = this.f39464i;
        if (str != null) {
            return str.equals(searchLocationItem.f39464i);
        }
        if (searchLocationItem.f39464i == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo45821f() {
        if (this.f39466k.equals(Source.LOCATION_FAVORITE) || this.f39466k.equals(Source.LOCATION_FAVORITE_HOME) || this.f39466k.equals(Source.LOCATION_FAVORITE_WORK)) {
            return true;
        }
        return false;
    }

    public final LatLonE6 getLocation() {
        return this.f39462g;
    }

    public final ServerId getServerId() {
        return this.f39457b;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f39457b.f15142b, this.f39458c.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39452m);
    }
}
