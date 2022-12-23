package z70;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.network.model.ServerId;
import com.moovit.search.SearchAction;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVSiteSource;
import com.tranzmate.moovit.protocol.search.MVSearchResponseItem;
import com.tranzmate.moovit.protocol.search.MVSearchResultType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import p824tp.C19739q;
import p875vs.C20228e;
import x00.C20440a;

/* renamed from: z70.l */
public final class C13335l {

    /* renamed from: z70.l$a */
    public static /* synthetic */ class C13336a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33106a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.search.MVSearchResultType[] r0 = com.tranzmate.moovit.protocol.search.MVSearchResultType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33106a = r0
                com.tranzmate.moovit.protocol.search.MVSearchResultType r1 = com.tranzmate.moovit.protocol.search.MVSearchResultType.STOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33106a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.search.MVSearchResultType r1 = com.tranzmate.moovit.protocol.search.MVSearchResultType.CITY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33106a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.search.MVSearchResultType r1 = com.tranzmate.moovit.protocol.search.MVSearchResultType.STREET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33106a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.search.MVSearchResultType r1 = com.tranzmate.moovit.protocol.search.MVSearchResultType.SITE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33106a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.search.MVSearchResultType r1 = com.tranzmate.moovit.protocol.search.MVSearchResultType.GEOCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z70.C13335l.C13336a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C13321a m33605a(String str, String str2, LocationDescriptor locationDescriptor, SearchAction searchAction, int i) {
        String str3;
        ArrayList arrayList;
        ServerId serverId = locationDescriptor.f23649d;
        if (serverId != null) {
            str3 = serverId.mo19751c();
        } else {
            str3 = locationDescriptor.f23650e;
            if (str3 == null) {
                str3 = UUID.randomUUID().toString();
            }
        }
        String str4 = str3;
        String name = locationDescriptor.f23647b.name();
        Image image = locationDescriptor.f23655j;
        CharSequence c = C13329g.m33604c(locationDescriptor.f23651f, str2);
        List<C20440a> list = locationDescriptor.f23652g;
        if (C13717b.m34258e(list)) {
            arrayList = list;
        } else {
            ArrayList arrayList2 = new ArrayList(list.size());
            for (C20440a next : list) {
                if (!next.mo52636a()) {
                    arrayList2.add(next);
                } else {
                    CharSequence charSequence = next.f51782b;
                    CharSequence c2 = C13329g.m33604c(charSequence, str2);
                    if (charSequence == c2) {
                        arrayList2.add(next);
                    } else {
                        arrayList2.add(new C20440a(c2, (String) null));
                    }
                }
            }
            arrayList = arrayList2;
        }
        return new C13321a(str, str4, name, image, c, arrayList, searchAction, i);
    }

    /* renamed from: b */
    public static LocationDescriptor m33606b(MVSearchResponseItem mVSearchResponseItem) {
        LocationDescriptor.LocationType locationType;
        LatLonE6 latLonE6;
        LatLonE6 latLonE62;
        MVSearchResultType mVSearchResultType = mVSearchResponseItem.type;
        MVSiteSource mVSiteSource = mVSearchResponseItem.source;
        int i = C13336a.f33106a[mVSearchResultType.ordinal()];
        boolean z = true;
        if (i == 1) {
            locationType = LocationDescriptor.LocationType.STOP;
        } else if (i == 2) {
            locationType = LocationDescriptor.LocationType.CITY;
        } else if (i == 3) {
            locationType = LocationDescriptor.LocationType.STREET;
        } else if (i != 4) {
            if (i == 5) {
                locationType = LocationDescriptor.LocationType.COORDINATE;
            } else {
                throw new IllegalArgumentException("Unknown type for location descriptor " + mVSearchResultType);
            }
        } else if (MVSiteSource.EVENT.equals(mVSiteSource)) {
            locationType = LocationDescriptor.LocationType.EVENT;
        } else {
            locationType = LocationDescriptor.LocationType.POI;
        }
        LocationDescriptor.LocationType locationType2 = locationType;
        LocationDescriptor.SourceType sourceType = LocationDescriptor.SourceType.LOCATION_SEARCH;
        ServerId serverId = new ServerId(mVSearchResponseItem.f28218id);
        LatLonE6 h = C13749c.m34322h(mVSearchResponseItem.latLon);
        if (!mVSearchResponseItem.mo31526j() || !mVSearchResponseItem.inaccurateLatLon) {
            z = false;
        }
        String str = mVSearchResponseItem.title;
        ArrayList<O> c = C13720d.m34273c(mVSearchResponseItem.subTitle, (C13722f) null, new C20228e(22));
        Image g = C16028g.m40829g(mVSearchResponseItem.image);
        if (z) {
            latLonE6 = null;
        } else {
            latLonE6 = h;
        }
        if (z) {
            latLonE62 = h;
        } else {
            latLonE62 = null;
        }
        return new LocationDescriptor(locationType2, sourceType, serverId, (String) null, str, c, latLonE6, latLonE62, g, (Image) null);
    }

    /* renamed from: c */
    public static ResourceImage m33607c(JSONArray jSONArray) throws JSONException {
        int i;
        if (jSONArray == null || jSONArray.length() == 0) {
            i = C19739q.ic_poi_location_24_on_surface_emphasis_high;
        } else {
            int i2 = 0;
            while (true) {
                if (i2 < jSONArray.length()) {
                    String string = jSONArray.getString(i2);
                    string.getClass();
                    char c = 65535;
                    switch (string.hashCode()) {
                        case -2050684885:
                            if (string.equals("fire_station")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1964369267:
                            if (string.equals("shoe_store")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1912447312:
                            if (string.equals("amusement_park")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1897612291:
                            if (string.equals("stadium")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1772467395:
                            if (string.equals("restaurant")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -1700587098:
                            if (string.equals("place_of_worship")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -1676983117:
                            if (string.equals("pharmacy")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1655831541:
                            if (string.equals("book_store")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -1648595317:
                            if (string.equals("shopping_mall")) {
                                c = 8;
                                break;
                            }
                            break;
                        case -1367569419:
                            if (string.equals("casino")) {
                                c = 9;
                                break;
                            }
                            break;
                        case -1361036889:
                            if (string.equals("church")) {
                                c = 10;
                                break;
                            }
                            break;
                        case -1347754927:
                            if (string.equals("primary_school")) {
                                c = 11;
                                break;
                            }
                            break;
                        case -1326477025:
                            if (string.equals("doctor")) {
                                c = 12;
                                break;
                            }
                            break;
                        case -1221262756:
                            if (string.equals("health")) {
                                c = 13;
                                break;
                            }
                            break;
                        case -1209617772:
                            if (string.equals("tourist_attraction")) {
                                c = 14;
                                break;
                            }
                            break;
                        case -1068340720:
                            if (string.equals("mosque")) {
                                c = 15;
                                break;
                            }
                            break;
                        case -1062811118:
                            if (string.equals("museum")) {
                                c = 16;
                                break;
                            }
                            break;
                        case -991666997:
                            if (string.equals("airport")) {
                                c = 17;
                                break;
                            }
                            break;
                        case -982670050:
                            if (string.equals("police")) {
                                c = 18;
                                break;
                            }
                            break;
                        case -907977868:
                            if (string.equals("school")) {
                                c = 19;
                                break;
                            }
                            break;
                        case -793201736:
                            if (string.equals("parking")) {
                                c = 20;
                                break;
                            }
                            break;
                        case -338178443:
                            if (string.equals("taxi_stand")) {
                                c = 21;
                                break;
                            }
                            break;
                        case -303628742:
                            if (string.equals("hospital")) {
                                c = 22;
                                break;
                            }
                            break;
                        case -299560451:
                            if (string.equals("train_station")) {
                                c = 23;
                                break;
                            }
                            break;
                        case -78601522:
                            if (string.equals("hindu_temple")) {
                                c = 24;
                                break;
                            }
                            break;
                        case 97299:
                            if (string.equals("bar")) {
                                c = 25;
                                break;
                            }
                            break;
                        case 120794:
                            if (string.equals("zoo")) {
                                c = 26;
                                break;
                            }
                            break;
                        case 3016252:
                            if (string.equals("bank")) {
                                c = 27;
                                break;
                            }
                            break;
                        case 3045789:
                            if (string.equals("cafe")) {
                                c = 28;
                                break;
                            }
                            break;
                        case 3433450:
                            if (string.equals("park")) {
                                c = 29;
                                break;
                            }
                            break;
                        case 109770977:
                            if (string.equals(Payload.TYPE_STORE)) {
                                c = 30;
                                break;
                            }
                            break;
                        case 166208699:
                            if (string.equals("library")) {
                                c = 31;
                                break;
                            }
                            break;
                        case 169749129:
                            if (string.equals("intersection")) {
                                c = ' ';
                                break;
                            }
                            break;
                        case 189328014:
                            if (string.equals("university")) {
                                c = '!';
                                break;
                            }
                            break;
                        case 277384513:
                            if (string.equals("drugstore")) {
                                c = '\"';
                                break;
                            }
                            break;
                        case 444536918:
                            if (string.equals("synagogue")) {
                                c = '#';
                                break;
                            }
                            break;
                        case 498460430:
                            if (string.equals("neighborhood")) {
                                c = '$';
                                break;
                            }
                            break;
                        case 509877407:
                            if (string.equals("secondary_school")) {
                                c = '%';
                                break;
                            }
                            break;
                        case 559132475:
                            if (string.equals("post_office")) {
                                c = '&';
                                break;
                            }
                            break;
                        case 772885966:
                            if (string.equals("gas_station")) {
                                c = '\'';
                                break;
                            }
                            break;
                        case 840925601:
                            if (string.equals("bicycle_store")) {
                                c = '(';
                                break;
                            }
                            break;
                        case 1002431734:
                            if (string.equals("local_government_office")) {
                                c = ')';
                                break;
                            }
                            break;
                        case 1532405365:
                            if (string.equals("bus_station")) {
                                c = '*';
                                break;
                            }
                            break;
                        case 1579565930:
                            if (string.equals("town_square")) {
                                c = '+';
                                break;
                            }
                            break;
                        case 1738891626:
                            if (string.equals("clothing_store")) {
                                c = ',';
                                break;
                            }
                            break;
                        case 1811306932:
                            if (string.equals("department_store")) {
                                c = '-';
                                break;
                            }
                            break;
                        case 1920052738:
                            if (string.equals("movie_theater")) {
                                c = '.';
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            i = C19739q.ic_poi_firestation_24_on_surface_emphasis_high;
                            break;
                        case 1:
                        case 8:
                        case ',':
                        case '-':
                            i = C19739q.ic_poi_shopping_24_on_surface_emphasis_high;
                            break;
                        case 2:
                            i = C19739q.ic_poi_amusement_park_24_on_surface_emphasis_high;
                            break;
                        case 3:
                            i = C19739q.ic_poi_stadium_24_on_surface_emphasis_high;
                            break;
                        case 4:
                            i = C19739q.ic_poi_food_24_on_surface_emphasis_high;
                            break;
                        case 5:
                            i = C19739q.ic_poi_place_of_worship_24_on_surface_emphasis_high;
                            break;
                        case 6:
                        case 12:
                        case 13:
                        case '\"':
                            i = C19739q.ic_poi_pharm_24_on_surface_emphasis_high;
                            break;
                        case 7:
                        case 30:
                        case '(':
                            i = C19739q.ic_poi_business_24_on_surface_emphasis_high;
                            break;
                        case 9:
                            i = C19739q.ic_poi_casino_24_on_surface_emphasis_high;
                            break;
                        case 10:
                            i = C19739q.ic_poi_church_24_on_surface_emphasis_high;
                            break;
                        case 11:
                        case 19:
                        case '!':
                        case '%':
                            i = C19739q.ic_poi_education_24_on_surface_emphasis_high;
                            break;
                        case 14:
                            i = C19739q.ic_poi_tourism_24_on_surface_emphasis_high;
                            break;
                        case 15:
                            i = C19739q.ic_poi_mosque_24_on_surface_emphasis_high;
                            break;
                        case 16:
                            i = C19739q.ic_poi_museum_24_on_surface_emphasis_high;
                            break;
                        case 17:
                            i = C19739q.ic_poi_airport_24_on_surface_emphasis_high;
                            break;
                        case 18:
                            i = C19739q.ic_poi_police_24_on_surface_emphasis_high;
                            break;
                        case 20:
                            i = C19739q.ic_poi_parking_24_on_surface_emphasis_high;
                            break;
                        case 21:
                            i = C19739q.ic_poi_taxi_24_on_surface_emphasis_high;
                            break;
                        case 22:
                            i = C19739q.ic_poi_hospital_24_on_surface_emphasis_high;
                            break;
                        case 23:
                            i = C19739q.ic_poi_train_station_24_on_surface_emphasis_high;
                            break;
                        case 24:
                            i = C19739q.ic_poi_hindu_temple_24_on_surface_emphasis_high;
                            break;
                        case 25:
                            i = C19739q.ic_poi_pub_24_on_surface_emphasis_high;
                            break;
                        case 26:
                            i = C19739q.ic_poi_zoo_24_on_surface_emphasis_high;
                            break;
                        case 27:
                            i = C19739q.ic_poi_bank_24_on_surface_emphasis_high;
                            break;
                        case 28:
                            i = C19739q.ic_poi_cafe_24_on_surface_emphasis_high;
                            break;
                        case 29:
                            i = C19739q.ic_poi_park_24_on_surface_emphasis_high;
                            break;
                        case 31:
                            i = C19739q.ic_poi_library_24_on_surface_emphasis_high;
                            break;
                        case ' ':
                            i = C19739q.ic_poi_intersection_24_on_surface_emphasis_high;
                            break;
                        case '#':
                            i = C19739q.ic_poi_synagogue_24_on_surface_emphasis_high;
                            break;
                        case '$':
                            i = C19739q.ic_poi_neighborhood_24_on_surface_emphasis_high;
                            break;
                        case '&':
                            i = C19739q.ic_poi_post_office_24_on_surface_emphasis_high;
                            break;
                        case '\'':
                            i = C19739q.ic_poi_gas_station_24_on_surface_emphasis_high;
                            break;
                        case ')':
                            i = C19739q.ic_poi_government_office_24_on_surface_emphasis_high;
                            break;
                        case '*':
                            i = C19739q.ic_poi_bus_station_24_on_surface_emphasis_high;
                            break;
                        case '+':
                            i = C19739q.ic_poi_plaza_24_on_surface_emphasis_high;
                            break;
                        case '.':
                            i = C19739q.ic_poi_movie_theatre_24_on_surface_emphasis_high;
                            break;
                        default:
                            i2++;
                    }
                } else {
                    i = C19739q.ic_poi_location_24_on_surface_emphasis_high;
                }
            }
        }
        return new ResourceImage(i, new String[0]);
    }
}
