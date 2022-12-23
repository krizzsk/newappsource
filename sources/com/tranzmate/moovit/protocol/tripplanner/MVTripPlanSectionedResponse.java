package com.tranzmate.moovit.protocol.tripplanner;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TException;
import org.apache.thrift.TUnion;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TProtocolException;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVTripPlanSectionedResponse extends TUnion<MVTripPlanSectionedResponse, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f30171c = new C17394d0("MVTripPlanSectionedResponse");

    /* renamed from: d */
    public static final C25113c f30172d = new C25113c("itinerary", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f30173e = new C25113c("tripPlanSections", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f30174f = new C25113c("advertisment", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f30175g = new C25113c("sectionMatchCount", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f30176h = new C25113c("todBanner", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f30177i = new C25113c("flexTimeBanner", (byte) 12, 6);

    /* renamed from: j */
    public static final C25113c f30178j = new C25113c("itineraryUpdate", (byte) 12, 7);

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f30179k;

    public enum _Fields implements C25085c {
        ITINERARY(1, "itinerary"),
        TRIP_PLAN_SECTIONS(2, "tripPlanSections"),
        ADVERTISMENT(3, "advertisment"),
        SECTION_MATCH_COUNT(4, "sectionMatchCount"),
        TOD_BANNER(5, "todBanner"),
        FLEX_TIME_BANNER(6, "flexTimeBanner"),
        ITINERARY_UPDATE(7, "itineraryUpdate");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            switch (i) {
                case 1:
                    return ITINERARY;
                case 2:
                    return TRIP_PLAN_SECTIONS;
                case 3:
                    return ADVERTISMENT;
                case 4:
                    return SECTION_MATCH_COUNT;
                case 5:
                    return TOD_BANNER;
                case 6:
                    return FLEX_TIME_BANNER;
                case 7:
                    return ITINERARY_UPDATE;
                default:
                    return null;
            }
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$a */
    public static /* synthetic */ class C11676a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30180a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$_Fields[] r0 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30180a = r0
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse._Fields.ITINERARY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30180a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse._Fields.TRIP_PLAN_SECTIONS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30180a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse._Fields.ADVERTISMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30180a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse._Fields.SECTION_MATCH_COUNT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30180a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse._Fields.TOD_BANNER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30180a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse._Fields.FLEX_TIME_BANNER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30180a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse._Fields.ITINERARY_UPDATE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionedResponse.C11676a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ITINERARY, new FieldMetaData("itinerary", (byte) 3, new StructMetaData(MVTripPlanItinerary.class)));
        enumMap.put(_Fields.TRIP_PLAN_SECTIONS, new FieldMetaData("tripPlanSections", (byte) 3, new StructMetaData(MVTripPlanSections.class)));
        enumMap.put(_Fields.ADVERTISMENT, new FieldMetaData("advertisment", (byte) 3, new StructMetaData(MVTripPlanAdvertisment.class)));
        enumMap.put(_Fields.SECTION_MATCH_COUNT, new FieldMetaData("sectionMatchCount", (byte) 3, new StructMetaData(MVTripPlanSectionMatchCount.class)));
        enumMap.put(_Fields.TOD_BANNER, new FieldMetaData("todBanner", (byte) 3, new StructMetaData(MVTripPlanTodBanner.class)));
        enumMap.put(_Fields.FLEX_TIME_BANNER, new FieldMetaData("flexTimeBanner", (byte) 3, new StructMetaData(MVTripPlanFlexTimeBanner.class)));
        enumMap.put(_Fields.ITINERARY_UPDATE, new FieldMetaData("itineraryUpdate", (byte) 3, new StructMetaData(MVTripPlanItineraryUpdate.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30179k = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanSectionedResponse.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m30679k(_Fields _fields) {
        switch (C11676a.f30180a[_fields.ordinal()]) {
            case 1:
                return f30172d;
            case 2:
                return f30173e;
            case 3:
                return f30174f;
            case 4:
                return f30175g;
            case 5:
                return f30176h;
            case 6:
                return f30177i;
            case 7:
                return f30178j;
            default:
                throw new IllegalArgumentException("Unknown field id " + _fields);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    public final C25085c mo25504a(short s) {
        return _Fields.findByThriftIdOrThrow(s);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C25113c mo25505b(C25085c cVar) {
        return m30679k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVTripPlanSectionedResponse mVTripPlanSectionedResponse = (MVTripPlanSectionedResponse) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVTripPlanSectionedResponse.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVTripPlanSectionedResponse.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVTripPlanSectionedResponse mVTripPlanSectionedResponse;
        if (!(obj instanceof MVTripPlanSectionedResponse) || (mVTripPlanSectionedResponse = (MVTripPlanSectionedResponse) obj) == null || this.setField_ != mVTripPlanSectionedResponse.setField_ || !this.value_.equals(mVTripPlanSectionedResponse.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f30171c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C11676a.f30180a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                        mVTripPlanItinerary.mo25201C1(gVar);
                        return mVTripPlanItinerary;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVTripPlanSections mVTripPlanSections = new MVTripPlanSections();
                        mVTripPlanSections.mo25201C1(gVar);
                        return mVTripPlanSections;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVTripPlanAdvertisment mVTripPlanAdvertisment = new MVTripPlanAdvertisment();
                        mVTripPlanAdvertisment.mo25201C1(gVar);
                        return mVTripPlanAdvertisment;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVTripPlanSectionMatchCount mVTripPlanSectionMatchCount = new MVTripPlanSectionMatchCount();
                        mVTripPlanSectionMatchCount.mo25201C1(gVar);
                        return mVTripPlanSectionMatchCount;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVTripPlanTodBanner mVTripPlanTodBanner = new MVTripPlanTodBanner();
                        mVTripPlanTodBanner.mo25201C1(gVar);
                        return mVTripPlanTodBanner;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVTripPlanFlexTimeBanner mVTripPlanFlexTimeBanner = new MVTripPlanFlexTimeBanner();
                        mVTripPlanFlexTimeBanner.mo25201C1(gVar);
                        return mVTripPlanFlexTimeBanner;
                    }
                    C25122h.m63098a(gVar, b6);
                    return null;
                case 7:
                    byte b7 = cVar.f63356b;
                    if (b7 == 12) {
                        MVTripPlanItineraryUpdate mVTripPlanItineraryUpdate = new MVTripPlanItineraryUpdate();
                        mVTripPlanItineraryUpdate.mo25201C1(gVar);
                        return mVTripPlanItineraryUpdate;
                    }
                    C25122h.m63098a(gVar, b7);
                    return null;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        switch (C11676a.f30180a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVTripPlanItinerary) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVTripPlanSections) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVTripPlanAdvertisment) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVTripPlanSectionMatchCount) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVTripPlanTodBanner) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVTripPlanFlexTimeBanner) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVTripPlanItineraryUpdate) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo25512i(C25121g gVar, short s) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(s);
        if (findByThriftId != null) {
            switch (C11676a.f30180a[findByThriftId.ordinal()]) {
                case 1:
                    MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                    mVTripPlanItinerary.mo25201C1(gVar);
                    return mVTripPlanItinerary;
                case 2:
                    MVTripPlanSections mVTripPlanSections = new MVTripPlanSections();
                    mVTripPlanSections.mo25201C1(gVar);
                    return mVTripPlanSections;
                case 3:
                    MVTripPlanAdvertisment mVTripPlanAdvertisment = new MVTripPlanAdvertisment();
                    mVTripPlanAdvertisment.mo25201C1(gVar);
                    return mVTripPlanAdvertisment;
                case 4:
                    MVTripPlanSectionMatchCount mVTripPlanSectionMatchCount = new MVTripPlanSectionMatchCount();
                    mVTripPlanSectionMatchCount.mo25201C1(gVar);
                    return mVTripPlanSectionMatchCount;
                case 5:
                    MVTripPlanTodBanner mVTripPlanTodBanner = new MVTripPlanTodBanner();
                    mVTripPlanTodBanner.mo25201C1(gVar);
                    return mVTripPlanTodBanner;
                case 6:
                    MVTripPlanFlexTimeBanner mVTripPlanFlexTimeBanner = new MVTripPlanFlexTimeBanner();
                    mVTripPlanFlexTimeBanner.mo25201C1(gVar);
                    return mVTripPlanFlexTimeBanner;
                case 7:
                    MVTripPlanItineraryUpdate mVTripPlanItineraryUpdate = new MVTripPlanItineraryUpdate();
                    mVTripPlanItineraryUpdate.mo25201C1(gVar);
                    return mVTripPlanItineraryUpdate;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C11676a.f30180a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVTripPlanItinerary) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVTripPlanSections) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVTripPlanAdvertisment) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVTripPlanSectionMatchCount) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVTripPlanTodBanner) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVTripPlanFlexTimeBanner) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVTripPlanItineraryUpdate) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: l */
    public final MVTripPlanItinerary mo34737l() {
        if (this.setField_ == _Fields.ITINERARY) {
            return (MVTripPlanItinerary) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'itinerary' because union is currently set to ");
        k.append(m30679k((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: m */
    public final MVTripPlanItineraryUpdate mo34738m() {
        if (this.setField_ == _Fields.ITINERARY_UPDATE) {
            return (MVTripPlanItineraryUpdate) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'itineraryUpdate' because union is currently set to ");
        k.append(m30679k((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
