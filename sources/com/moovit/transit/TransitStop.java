package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import c00.C13717b;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageRef;
import com.moovit.image.model.ImageSet;
import com.moovit.image.model.ResourceImage;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Amenities;
import com.moovit.util.ServerIdMap;
import j40.C5384a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p241s0.C6302b;
import p762qz.C19206b;
import p810sz.C19575a;
import p810sz.C19589j;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19739q;
import p977zz.C20944i0;

public final class TransitStop implements C5384a, Parcelable, C19206b {
    public static final Parcelable.Creator<TransitStop> CREATOR = new C7826a();

    /* renamed from: r */
    public static final C7827b f23728r = new C7827b();

    /* renamed from: s */
    public static final C7828c f23729s = new C7828c(TransitStop.class);

    /* renamed from: b */
    public final ServerId f23730b;

    /* renamed from: c */
    public final String f23731c;

    /* renamed from: d */
    public final LatLonE6 f23732d;

    /* renamed from: e */
    public final String f23733e;

    /* renamed from: f */
    public final Image f23734f;

    /* renamed from: g */
    public final List<DbEntityRef<TransitLine>> f23735g;

    /* renamed from: h */
    public final Map<ServerId, DbEntityRef<TransitLine>> f23736h;

    /* renamed from: i */
    public final List<DbEntityRef<TransitLine>> f23737i;

    /* renamed from: j */
    public final ImageSet f23738j;

    /* renamed from: k */
    public final List<TransitStopPathway> f23739k;

    /* renamed from: l */
    public final Map<ServerId, TransitStopPathway> f23740l;

    /* renamed from: m */
    public final List<TransitStopPlatform> f23741m;

    /* renamed from: n */
    public final Map<String, TransitStopPlatform> f23742n;

    /* renamed from: o */
    public final Map<ServerId, TransitStopPlatform> f23743o;

    /* renamed from: p */
    public final DbEntityRef<TransitType> f23744p;

    /* renamed from: q */
    public final Amenities f23745q;

    /* renamed from: com.moovit.transit.TransitStop$a */
    public class C7826a implements Parcelable.Creator<TransitStop> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitStop) C19612n.m46981v(parcel, TransitStop.f23729s);
        }

        public final Object[] newArray(int i) {
            return new TransitStop[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitStop$b */
    public class C7827b extends C19621u<TransitStop> {
        public C7827b() {
            super(6);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitStop transitStop = (TransitStop) obj;
            ServerId serverId = transitStop.f23730b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(transitStop.f23731c);
            LatLonE6.f40978f.write(transitStop.f23732d, qVar);
            qVar.mo51955t(transitStop.f23733e);
            qVar.mo51967q(transitStop.f23734f, C16019d.m40803a().f41718d);
            qVar.mo51965h(transitStop.f23735g, DbEntityRef.TRANSIT_LINE_REF_CODER);
            qVar.mo51965h(transitStop.f23737i, DbEntityRef.TRANSIT_LINE_REF_CODER);
            ImageSet imageSet = transitStop.f23738j;
            ImageSet.C16054b bVar = C16019d.m40803a().f41719e;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(imageSet, qVar);
            qVar.mo51965h(transitStop.f23739k, TransitStopPathway.f23746f);
            qVar.mo51965h(transitStop.f23741m, TransitStopPlatform.f23752d);
            DbEntityRef.TRANSIT_TYPE_REF_CODER.write(transitStop.f23744p, qVar);
            Amenities amenities = transitStop.f23745q;
            Amenities.C7785b bVar2 = Amenities.f23626c;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(amenities, qVar);
        }
    }

    /* renamed from: com.moovit.transit.TransitStop$c */
    public class C7828c extends C19620t<TransitStop> {
        public C7828c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 6;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            String str = "";
            switch (i) {
                case 1:
                    pVar.getClass();
                    ServerId serverId = new ServerId(pVar.mo51924l());
                    String p = pVar.mo51947p();
                    LatLonE6 latLonE6 = (LatLonE6) LatLonE6.f40979g.read(pVar2);
                    String t = pVar.mo51948t();
                    ImageRef imageRef = (ImageRef) pVar2.mo51962q(C16019d.m40803a().f41720f);
                    String[] strArr = new String[1];
                    if (t != null) {
                        str = t;
                    }
                    strArr[0] = str;
                    Image p2 = imageRef.mo48235p(strArr);
                    ArrayList<DbEntityRef<TransitLine>> g = pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER);
                    ArrayList<DbEntityRef<TransitLine>> g2 = pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER);
                    SparseArray<Image> sparseArray = ((ImageSet) C16019d.m40803a().f41719e.read(pVar2)).f41813b;
                    SparseArray sparseArray2 = new SparseArray();
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sparseArray2.put(sparseArray.keyAt(i2) * 100, sparseArray.valueAt(i2));
                    }
                    return new TransitStop(serverId, p, latLonE6, t, p2, g, g2, new ImageSet(sparseArray2, false), Collections.emptyList(), Collections.emptyList(), DbEntityRef.newTransitTypeRef(new ServerId(3)), Amenities.m17753b());
                case 2:
                    pVar.getClass();
                    ServerId serverId2 = new ServerId(pVar.mo51924l());
                    String p3 = pVar.mo51947p();
                    LatLonE6 latLonE62 = (LatLonE6) LatLonE6.f40979g.read(pVar2);
                    String t2 = pVar.mo51948t();
                    ImageRef imageRef2 = (ImageRef) pVar2.mo51962q(C16019d.m40803a().f41720f);
                    String[] strArr2 = new String[1];
                    if (t2 != null) {
                        str = t2;
                    }
                    strArr2[0] = str;
                    Image p4 = imageRef2.mo48235p(strArr2);
                    Map o = pVar2.mo51961o(C19589j.f49779k, C19575a.m46957a(DbEntityRef.TRANSIT_LINE_REF_CODER, false), new C6302b());
                    Collection values = o.values();
                    ArrayList arrayList = new ArrayList();
                    C13717b.m34255b(values, arrayList);
                    ArrayList arrayList2 = new ArrayList(o.size());
                    for (Map.Entry entry : o.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        if (str2 != null) {
                            arrayList2.add(new TransitStopPlatform(str2, list));
                        }
                    }
                    return new TransitStop(serverId2, p3, latLonE62, t2, p4, arrayList, pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), (ImageSet) C16019d.m40803a().f41719e.read(pVar2), pVar2.mo51959g(TransitStopPathway.f23747g), arrayList2, DbEntityRef.newTransitTypeRef(new ServerId(3)), Amenities.m17753b());
                case 3:
                    pVar.getClass();
                    ServerId serverId3 = new ServerId(pVar.mo51924l());
                    String p5 = pVar.mo51947p();
                    LatLonE6 latLonE63 = (LatLonE6) LatLonE6.f40979g.read(pVar2);
                    String t3 = pVar.mo51948t();
                    ImageRef imageRef3 = (ImageRef) pVar2.mo51962q(C16019d.m40803a().f41720f);
                    String[] strArr3 = new String[1];
                    if (t3 != null) {
                        str = t3;
                    }
                    strArr3[0] = str;
                    return new TransitStop(serverId3, p5, latLonE63, t3, imageRef3.mo48235p(strArr3), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), (ImageSet) C16019d.m40803a().f41719e.read(pVar2), pVar2.mo51959g(TransitStopPathway.f23747g), pVar2.mo51959g(TransitStopPlatform.f23753e), DbEntityRef.newTransitTypeRef(new ServerId(3)), Amenities.m17753b());
                case 4:
                    pVar.getClass();
                    ServerId serverId4 = new ServerId(pVar.mo51924l());
                    String p6 = pVar.mo51947p();
                    LatLonE6 latLonE64 = (LatLonE6) LatLonE6.f40979g.read(pVar2);
                    String t4 = pVar.mo51948t();
                    ImageRef imageRef4 = (ImageRef) pVar2.mo51962q(C16019d.m40803a().f41720f);
                    String[] strArr4 = new String[1];
                    if (t4 != null) {
                        str = t4;
                    }
                    strArr4[0] = str;
                    return new TransitStop(serverId4, p6, latLonE64, t4, imageRef4.mo48235p(strArr4), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), (ImageSet) C16019d.m40803a().f41719e.read(pVar2), pVar2.mo51959g(TransitStopPathway.f23747g), pVar2.mo51959g(TransitStopPlatform.f23753e), DbEntityRef.TRANSIT_TYPE_REF_CODER.read(pVar2), Amenities.m17753b());
                case 5:
                    pVar.getClass();
                    ServerId serverId5 = new ServerId(pVar.mo51924l());
                    String p7 = pVar.mo51947p();
                    LatLonE6 latLonE65 = (LatLonE6) LatLonE6.f40979g.read(pVar2);
                    String t5 = pVar.mo51948t();
                    ImageRef imageRef5 = (ImageRef) pVar2.mo51962q(C16019d.m40803a().f41720f);
                    String[] strArr5 = new String[1];
                    if (t5 != null) {
                        str = t5;
                    }
                    strArr5[0] = str;
                    return new TransitStop(serverId5, p7, latLonE65, t5, imageRef5.mo48235p(strArr5), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), (ImageSet) C16019d.m40803a().f41719e.read(pVar2), pVar2.mo51959g(TransitStopPathway.f23747g), pVar2.mo51959g(TransitStopPlatform.f23753e), DbEntityRef.TRANSIT_TYPE_REF_CODER.read(pVar2), (Amenities) Amenities.f23626c.read(pVar2));
                case 6:
                    pVar.getClass();
                    return new TransitStop(new ServerId(pVar.mo51924l()), pVar.mo51947p(), (LatLonE6) LatLonE6.f40979g.read(pVar2), pVar.mo51948t(), (Image) pVar2.mo51962q(C16019d.m40803a().f41718d), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), (ImageSet) C16019d.m40803a().f41719e.read(pVar2), pVar2.mo51959g(TransitStopPathway.f23747g), pVar2.mo51959g(TransitStopPlatform.f23753e), DbEntityRef.TRANSIT_TYPE_REF_CODER.read(pVar2), (Amenities) Amenities.f23626c.read(pVar2));
                default:
                    pVar.getClass();
                    ServerId serverId6 = new ServerId(pVar.mo51924l());
                    String p8 = pVar.mo51947p();
                    LatLonE6 latLonE66 = (LatLonE6) LatLonE6.f40979g.read(pVar2);
                    String t6 = pVar.mo51948t();
                    ImageRef imageRef6 = (ImageRef) pVar2.mo51962q(C16019d.m40803a().f41720f);
                    String[] strArr6 = new String[1];
                    if (t6 != null) {
                        str = t6;
                    }
                    strArr6[0] = str;
                    return new TransitStop(serverId6, p8, latLonE66, t6, imageRef6.mo48235p(strArr6), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), pVar2.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER), new ImageSet((C20944i0<Integer, Image>[]) new C20944i0[]{new C20944i0(1700, new ResourceImage(C19739q.img_map_station_blank, new String[0]))}), Collections.emptyList(), Collections.emptyList(), DbEntityRef.newTransitTypeRef(new ServerId(3)), Amenities.m17753b());
            }
        }
    }

    public TransitStop(ServerId serverId, String str, LatLonE6 latLonE6, String str2, Image image, List<DbEntityRef<TransitLine>> list, List<DbEntityRef<TransitLine>> list2, ImageSet imageSet, List<TransitStopPathway> list3, List<TransitStopPlatform> list4, DbEntityRef<TransitType> dbEntityRef, Amenities amenities) {
        this.f23730b = serverId;
        C21100e.m49373x(str, "name");
        this.f23731c = str;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f23732d = latLonE6;
        this.f23733e = str2;
        this.f23734f = image;
        C21100e.m49373x(list, "lineRefs");
        this.f23735g = Collections.unmodifiableList(new ArrayList(list));
        this.f23736h = Collections.unmodifiableMap(ServerIdMap.m17949a(list));
        C21100e.m49373x(list2, "nearByLinesRefs");
        this.f23737i = Collections.unmodifiableList(new ArrayList(list2));
        C21100e.m49373x(imageSet, "mapImages");
        this.f23738j = imageSet;
        C21100e.m49373x(list3, "pathways");
        this.f23739k = Collections.unmodifiableList(new ArrayList(list3));
        this.f23740l = Collections.unmodifiableMap(ServerIdMap.m17949a(list3));
        C21100e.m49373x(list4, "platforms");
        this.f23741m = Collections.unmodifiableList(new ArrayList(list4));
        C6302b bVar = new C6302b();
        C6302b bVar2 = new C6302b();
        for (TransitStopPlatform next : list4) {
            bVar.put(next.f23754b, next);
            for (DbEntityRef<TransitLine> serverId2 : next.f23755c) {
                bVar2.put(serverId2.getServerId(), next);
            }
        }
        this.f23742n = Collections.unmodifiableMap(bVar);
        this.f23743o = Collections.unmodifiableMap(bVar2);
        C21100e.m49373x(dbEntityRef, "mainTransitTypeRef");
        this.f23744p = dbEntityRef;
        C21100e.m49373x(amenities, "amenities");
        this.f23745q = amenities;
    }

    /* renamed from: b */
    public final DbEntityRef<TransitLine> mo24410b(ServerId serverId) {
        return this.f23736h.get(serverId);
    }

    /* renamed from: c */
    public final TransitStopPlatform mo24411c(ServerId serverId) {
        return this.f23743o.get(serverId);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitStop)) {
            return false;
        }
        return this.f23730b.equals(((TransitStop) obj).f23730b);
    }

    public final LatLonE6 getLocation() {
        return this.f23732d;
    }

    public final ServerId getServerId() {
        return this.f23730b;
    }

    public final int hashCode() {
        return this.f23730b.f15142b;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TransitStop{id=");
        k.append(this.f23730b);
        k.append(", name='");
        k.append(this.f23731c);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23728r);
    }
}
