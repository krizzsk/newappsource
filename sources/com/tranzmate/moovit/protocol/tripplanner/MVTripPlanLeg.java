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

public class MVTripPlanLeg extends TUnion<MVTripPlanLeg, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f30115c = new C17394d0("MVTripPlanLeg");

    /* renamed from: d */
    public static final C25113c f30116d = new C25113c("walkLeg", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f30117e = new C25113c("waitToLineLeg", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f30118f = new C25113c("lineLeg", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f30119g = new C25113c("waitToTaxiLeg", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f30120h = new C25113c("taxiLeg", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f30121i = new C25113c("multiLineLeg", (byte) 12, 6);

    /* renamed from: j */
    public static final C25113c f30122j = new C25113c("carpoolRideLeg", (byte) 12, 7);

    /* renamed from: k */
    public static final C25113c f30123k = new C25113c("pathwayWalkLeg", (byte) 12, 8);

    /* renamed from: l */
    public static final C25113c f30124l = new C25113c("waitToMultiLineLeg", (byte) 12, 9);

    /* renamed from: m */
    public static final C25113c f30125m = new C25113c("lineWithAlternarivesLeg", (byte) 12, 10);

    /* renamed from: n */
    public static final C25113c f30126n = new C25113c("bicycleLeg", (byte) 12, 11);

    /* renamed from: o */
    public static final C25113c f30127o = new C25113c("bicycleRentalLeg", (byte) 12, 12);

    /* renamed from: p */
    public static final C25113c f30128p = new C25113c("eventLeg", (byte) 12, 13);

    /* renamed from: q */
    public static final C25113c f30129q = new C25113c("parkingLeg", (byte) 12, 14);

    /* renamed from: r */
    public static final C25113c f30130r = new C25113c("docklessLeg", (byte) 12, 15);

    /* renamed from: s */
    public static final C25113c f30131s = new C25113c("carLeg", (byte) 12, 16);

    /* renamed from: t */
    public static final Map<_Fields, FieldMetaData> f30132t;

    public enum _Fields implements C25085c {
        WALK_LEG(1, "walkLeg"),
        WAIT_TO_LINE_LEG(2, "waitToLineLeg"),
        LINE_LEG(3, "lineLeg"),
        WAIT_TO_TAXI_LEG(4, "waitToTaxiLeg"),
        TAXI_LEG(5, "taxiLeg"),
        MULTI_LINE_LEG(6, "multiLineLeg"),
        CARPOOL_RIDE_LEG(7, "carpoolRideLeg"),
        PATHWAY_WALK_LEG(8, "pathwayWalkLeg"),
        WAIT_TO_MULTI_LINE_LEG(9, "waitToMultiLineLeg"),
        LINE_WITH_ALTERNARIVES_LEG(10, "lineWithAlternarivesLeg"),
        BICYCLE_LEG(11, "bicycleLeg"),
        BICYCLE_RENTAL_LEG(12, "bicycleRentalLeg"),
        EVENT_LEG(13, "eventLeg"),
        PARKING_LEG(14, "parkingLeg"),
        DOCKLESS_LEG(15, "docklessLeg"),
        CAR_LEG(16, "carLeg");
        
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
                    return WALK_LEG;
                case 2:
                    return WAIT_TO_LINE_LEG;
                case 3:
                    return LINE_LEG;
                case 4:
                    return WAIT_TO_TAXI_LEG;
                case 5:
                    return TAXI_LEG;
                case 6:
                    return MULTI_LINE_LEG;
                case 7:
                    return CARPOOL_RIDE_LEG;
                case 8:
                    return PATHWAY_WALK_LEG;
                case 9:
                    return WAIT_TO_MULTI_LINE_LEG;
                case 10:
                    return LINE_WITH_ALTERNARIVES_LEG;
                case 11:
                    return BICYCLE_LEG;
                case 12:
                    return BICYCLE_RENTAL_LEG;
                case 13:
                    return EVENT_LEG;
                case 14:
                    return PARKING_LEG;
                case 15:
                    return DOCKLESS_LEG;
                case 16:
                    return CAR_LEG;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$a */
    public static /* synthetic */ class C11659a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30133a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields[] r0 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30133a = r0
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.WALK_LEG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.WAIT_TO_LINE_LEG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.LINE_LEG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.WAIT_TO_TAXI_LEG     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.TAXI_LEG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.MULTI_LINE_LEG     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.CARPOOL_RIDE_LEG     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.PATHWAY_WALK_LEG     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.WAIT_TO_MULTI_LINE_LEG     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.LINE_WITH_ALTERNARIVES_LEG     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.BICYCLE_LEG     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.BICYCLE_RENTAL_LEG     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.EVENT_LEG     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.PARKING_LEG     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.DOCKLESS_LEG     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f30133a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg._Fields.CAR_LEG     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanLeg.C11659a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.WALK_LEG, new FieldMetaData("walkLeg", (byte) 3, new StructMetaData(MVWalkLeg.class)));
        enumMap.put(_Fields.WAIT_TO_LINE_LEG, new FieldMetaData("waitToLineLeg", (byte) 3, new StructMetaData(MVWaitToLineLeg.class)));
        enumMap.put(_Fields.LINE_LEG, new FieldMetaData("lineLeg", (byte) 3, new StructMetaData(MVLineLeg.class)));
        enumMap.put(_Fields.WAIT_TO_TAXI_LEG, new FieldMetaData("waitToTaxiLeg", (byte) 3, new StructMetaData(MVWaitToTaxiLeg.class)));
        enumMap.put(_Fields.TAXI_LEG, new FieldMetaData("taxiLeg", (byte) 3, new StructMetaData(MVTaxiLeg.class)));
        enumMap.put(_Fields.MULTI_LINE_LEG, new FieldMetaData("multiLineLeg", (byte) 3, new StructMetaData(MVMultiLineLeg.class)));
        enumMap.put(_Fields.CARPOOL_RIDE_LEG, new FieldMetaData("carpoolRideLeg", (byte) 3, new StructMetaData(MVCarpoolRideLeg.class)));
        enumMap.put(_Fields.PATHWAY_WALK_LEG, new FieldMetaData("pathwayWalkLeg", (byte) 3, new StructMetaData(MVPathwayWalkLeg.class)));
        enumMap.put(_Fields.WAIT_TO_MULTI_LINE_LEG, new FieldMetaData("waitToMultiLineLeg", (byte) 3, new StructMetaData(MVWaitToMultiLineLeg.class)));
        enumMap.put(_Fields.LINE_WITH_ALTERNARIVES_LEG, new FieldMetaData("lineWithAlternarivesLeg", (byte) 3, new StructMetaData(MVLineWithAlternativesLeg.class)));
        enumMap.put(_Fields.BICYCLE_LEG, new FieldMetaData("bicycleLeg", (byte) 3, new StructMetaData(MVBicycleLeg.class)));
        enumMap.put(_Fields.BICYCLE_RENTAL_LEG, new FieldMetaData("bicycleRentalLeg", (byte) 3, new StructMetaData(MVBicycleRentalLeg.class)));
        enumMap.put(_Fields.EVENT_LEG, new FieldMetaData("eventLeg", (byte) 3, new StructMetaData(MVEventLeg.class)));
        enumMap.put(_Fields.PARKING_LEG, new FieldMetaData("parkingLeg", (byte) 3, new StructMetaData(MVParkingLeg.class)));
        enumMap.put(_Fields.DOCKLESS_LEG, new FieldMetaData("docklessLeg", (byte) 3, new StructMetaData(MVDocklessLeg.class)));
        enumMap.put(_Fields.CAR_LEG, new FieldMetaData("carLeg", (byte) 3, new StructMetaData(MVCarLeg.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30132t = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanLeg.class, unmodifiableMap);
    }

    /* renamed from: n */
    public static C25113c m30584n(_Fields _fields) {
        switch (C11659a.f30133a[_fields.ordinal()]) {
            case 1:
                return f30116d;
            case 2:
                return f30117e;
            case 3:
                return f30118f;
            case 4:
                return f30119g;
            case 5:
                return f30120h;
            case 6:
                return f30121i;
            case 7:
                return f30122j;
            case 8:
                return f30123k;
            case 9:
                return f30124l;
            case 10:
                return f30125m;
            case 11:
                return f30126n;
            case 12:
                return f30127o;
            case 13:
                return f30128p;
            case 14:
                return f30129q;
            case 15:
                return f30130r;
            case 16:
                return f30131s;
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
        return m30584n((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVTripPlanLeg mVTripPlanLeg = (MVTripPlanLeg) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVTripPlanLeg.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVTripPlanLeg.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVTripPlanLeg mVTripPlanLeg;
        if (!(obj instanceof MVTripPlanLeg) || (mVTripPlanLeg = (MVTripPlanLeg) obj) == null || this.setField_ != mVTripPlanLeg.setField_ || !this.value_.equals(mVTripPlanLeg.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f30115c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C11659a.f30133a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVWalkLeg mVWalkLeg = new MVWalkLeg();
                        mVWalkLeg.mo25201C1(gVar);
                        return mVWalkLeg;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVWaitToLineLeg mVWaitToLineLeg = new MVWaitToLineLeg();
                        mVWaitToLineLeg.mo25201C1(gVar);
                        return mVWaitToLineLeg;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVLineLeg mVLineLeg = new MVLineLeg();
                        mVLineLeg.mo25201C1(gVar);
                        return mVLineLeg;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVWaitToTaxiLeg mVWaitToTaxiLeg = new MVWaitToTaxiLeg();
                        mVWaitToTaxiLeg.mo25201C1(gVar);
                        return mVWaitToTaxiLeg;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVTaxiLeg mVTaxiLeg = new MVTaxiLeg();
                        mVTaxiLeg.mo25201C1(gVar);
                        return mVTaxiLeg;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVMultiLineLeg mVMultiLineLeg = new MVMultiLineLeg();
                        mVMultiLineLeg.mo25201C1(gVar);
                        return mVMultiLineLeg;
                    }
                    C25122h.m63098a(gVar, b6);
                    return null;
                case 7:
                    byte b7 = cVar.f63356b;
                    if (b7 == 12) {
                        MVCarpoolRideLeg mVCarpoolRideLeg = new MVCarpoolRideLeg();
                        mVCarpoolRideLeg.mo25201C1(gVar);
                        return mVCarpoolRideLeg;
                    }
                    C25122h.m63098a(gVar, b7);
                    return null;
                case 8:
                    byte b8 = cVar.f63356b;
                    if (b8 == 12) {
                        MVPathwayWalkLeg mVPathwayWalkLeg = new MVPathwayWalkLeg();
                        mVPathwayWalkLeg.mo25201C1(gVar);
                        return mVPathwayWalkLeg;
                    }
                    C25122h.m63098a(gVar, b8);
                    return null;
                case 9:
                    byte b9 = cVar.f63356b;
                    if (b9 == 12) {
                        MVWaitToMultiLineLeg mVWaitToMultiLineLeg = new MVWaitToMultiLineLeg();
                        mVWaitToMultiLineLeg.mo25201C1(gVar);
                        return mVWaitToMultiLineLeg;
                    }
                    C25122h.m63098a(gVar, b9);
                    return null;
                case 10:
                    byte b11 = cVar.f63356b;
                    if (b11 == 12) {
                        MVLineWithAlternativesLeg mVLineWithAlternativesLeg = new MVLineWithAlternativesLeg();
                        mVLineWithAlternativesLeg.mo25201C1(gVar);
                        return mVLineWithAlternativesLeg;
                    }
                    C25122h.m63098a(gVar, b11);
                    return null;
                case 11:
                    byte b12 = cVar.f63356b;
                    if (b12 == 12) {
                        MVBicycleLeg mVBicycleLeg = new MVBicycleLeg();
                        mVBicycleLeg.mo25201C1(gVar);
                        return mVBicycleLeg;
                    }
                    C25122h.m63098a(gVar, b12);
                    return null;
                case 12:
                    byte b13 = cVar.f63356b;
                    if (b13 == 12) {
                        MVBicycleRentalLeg mVBicycleRentalLeg = new MVBicycleRentalLeg();
                        mVBicycleRentalLeg.mo25201C1(gVar);
                        return mVBicycleRentalLeg;
                    }
                    C25122h.m63098a(gVar, b13);
                    return null;
                case 13:
                    byte b14 = cVar.f63356b;
                    if (b14 == 12) {
                        MVEventLeg mVEventLeg = new MVEventLeg();
                        mVEventLeg.mo25201C1(gVar);
                        return mVEventLeg;
                    }
                    C25122h.m63098a(gVar, b14);
                    return null;
                case 14:
                    byte b15 = cVar.f63356b;
                    if (b15 == 12) {
                        MVParkingLeg mVParkingLeg = new MVParkingLeg();
                        mVParkingLeg.mo25201C1(gVar);
                        return mVParkingLeg;
                    }
                    C25122h.m63098a(gVar, b15);
                    return null;
                case 15:
                    byte b16 = cVar.f63356b;
                    if (b16 == 12) {
                        MVDocklessLeg mVDocklessLeg = new MVDocklessLeg();
                        mVDocklessLeg.mo25201C1(gVar);
                        return mVDocklessLeg;
                    }
                    C25122h.m63098a(gVar, b16);
                    return null;
                case 16:
                    byte b17 = cVar.f63356b;
                    if (b17 == 12) {
                        MVCarLeg mVCarLeg = new MVCarLeg();
                        mVCarLeg.mo25201C1(gVar);
                        return mVCarLeg;
                    }
                    C25122h.m63098a(gVar, b17);
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
        switch (C11659a.f30133a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVWalkLeg) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVWaitToLineLeg) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVLineLeg) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVWaitToTaxiLeg) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVTaxiLeg) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVMultiLineLeg) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVCarpoolRideLeg) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVPathwayWalkLeg) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVWaitToMultiLineLeg) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVLineWithAlternativesLeg) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVBicycleLeg) this.value_).mo25202X0(gVar);
                return;
            case 12:
                ((MVBicycleRentalLeg) this.value_).mo25202X0(gVar);
                return;
            case 13:
                ((MVEventLeg) this.value_).mo25202X0(gVar);
                return;
            case 14:
                ((MVParkingLeg) this.value_).mo25202X0(gVar);
                return;
            case 15:
                ((MVDocklessLeg) this.value_).mo25202X0(gVar);
                return;
            case 16:
                ((MVCarLeg) this.value_).mo25202X0(gVar);
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
            switch (C11659a.f30133a[findByThriftId.ordinal()]) {
                case 1:
                    MVWalkLeg mVWalkLeg = new MVWalkLeg();
                    mVWalkLeg.mo25201C1(gVar);
                    return mVWalkLeg;
                case 2:
                    MVWaitToLineLeg mVWaitToLineLeg = new MVWaitToLineLeg();
                    mVWaitToLineLeg.mo25201C1(gVar);
                    return mVWaitToLineLeg;
                case 3:
                    MVLineLeg mVLineLeg = new MVLineLeg();
                    mVLineLeg.mo25201C1(gVar);
                    return mVLineLeg;
                case 4:
                    MVWaitToTaxiLeg mVWaitToTaxiLeg = new MVWaitToTaxiLeg();
                    mVWaitToTaxiLeg.mo25201C1(gVar);
                    return mVWaitToTaxiLeg;
                case 5:
                    MVTaxiLeg mVTaxiLeg = new MVTaxiLeg();
                    mVTaxiLeg.mo25201C1(gVar);
                    return mVTaxiLeg;
                case 6:
                    MVMultiLineLeg mVMultiLineLeg = new MVMultiLineLeg();
                    mVMultiLineLeg.mo25201C1(gVar);
                    return mVMultiLineLeg;
                case 7:
                    MVCarpoolRideLeg mVCarpoolRideLeg = new MVCarpoolRideLeg();
                    mVCarpoolRideLeg.mo25201C1(gVar);
                    return mVCarpoolRideLeg;
                case 8:
                    MVPathwayWalkLeg mVPathwayWalkLeg = new MVPathwayWalkLeg();
                    mVPathwayWalkLeg.mo25201C1(gVar);
                    return mVPathwayWalkLeg;
                case 9:
                    MVWaitToMultiLineLeg mVWaitToMultiLineLeg = new MVWaitToMultiLineLeg();
                    mVWaitToMultiLineLeg.mo25201C1(gVar);
                    return mVWaitToMultiLineLeg;
                case 10:
                    MVLineWithAlternativesLeg mVLineWithAlternativesLeg = new MVLineWithAlternativesLeg();
                    mVLineWithAlternativesLeg.mo25201C1(gVar);
                    return mVLineWithAlternativesLeg;
                case 11:
                    MVBicycleLeg mVBicycleLeg = new MVBicycleLeg();
                    mVBicycleLeg.mo25201C1(gVar);
                    return mVBicycleLeg;
                case 12:
                    MVBicycleRentalLeg mVBicycleRentalLeg = new MVBicycleRentalLeg();
                    mVBicycleRentalLeg.mo25201C1(gVar);
                    return mVBicycleRentalLeg;
                case 13:
                    MVEventLeg mVEventLeg = new MVEventLeg();
                    mVEventLeg.mo25201C1(gVar);
                    return mVEventLeg;
                case 14:
                    MVParkingLeg mVParkingLeg = new MVParkingLeg();
                    mVParkingLeg.mo25201C1(gVar);
                    return mVParkingLeg;
                case 15:
                    MVDocklessLeg mVDocklessLeg = new MVDocklessLeg();
                    mVDocklessLeg.mo25201C1(gVar);
                    return mVDocklessLeg;
                case 16:
                    MVCarLeg mVCarLeg = new MVCarLeg();
                    mVCarLeg.mo25201C1(gVar);
                    return mVCarLeg;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C11659a.f30133a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVWalkLeg) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVWaitToLineLeg) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVLineLeg) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVWaitToTaxiLeg) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVTaxiLeg) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVMultiLineLeg) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVCarpoolRideLeg) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVPathwayWalkLeg) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVWaitToMultiLineLeg) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVLineWithAlternativesLeg) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVBicycleLeg) this.value_).mo25202X0(gVar);
                return;
            case 12:
                ((MVBicycleRentalLeg) this.value_).mo25202X0(gVar);
                return;
            case 13:
                ((MVEventLeg) this.value_).mo25202X0(gVar);
                return;
            case 14:
                ((MVParkingLeg) this.value_).mo25202X0(gVar);
                return;
            case 15:
                ((MVDocklessLeg) this.value_).mo25202X0(gVar);
                return;
            case 16:
                ((MVCarLeg) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: k */
    public final MVBicycleLeg mo34657k() {
        if (this.setField_ == _Fields.BICYCLE_LEG) {
            return (MVBicycleLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'bicycleLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: l */
    public final MVBicycleRentalLeg mo34658l() {
        if (this.setField_ == _Fields.BICYCLE_RENTAL_LEG) {
            return (MVBicycleRentalLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'bicycleRentalLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: m */
    public final MVDocklessLeg mo34659m() {
        if (this.setField_ == _Fields.DOCKLESS_LEG) {
            return (MVDocklessLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'docklessLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: o */
    public final MVLineLeg mo34660o() {
        if (this.setField_ == _Fields.LINE_LEG) {
            return (MVLineLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'lineLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: p */
    public final MVLineWithAlternativesLeg mo34661p() {
        if (this.setField_ == _Fields.LINE_WITH_ALTERNARIVES_LEG) {
            return (MVLineWithAlternativesLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'lineWithAlternarivesLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: q */
    public final MVPathwayWalkLeg mo34662q() {
        if (this.setField_ == _Fields.PATHWAY_WALK_LEG) {
            return (MVPathwayWalkLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'pathwayWalkLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: r */
    public final MVTaxiLeg mo34663r() {
        if (this.setField_ == _Fields.TAXI_LEG) {
            return (MVTaxiLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'taxiLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: s */
    public final MVWaitToLineLeg mo34664s() {
        if (this.setField_ == _Fields.WAIT_TO_LINE_LEG) {
            return (MVWaitToLineLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'waitToLineLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: t */
    public final MVWaitToMultiLineLeg mo34665t() {
        if (this.setField_ == _Fields.WAIT_TO_MULTI_LINE_LEG) {
            return (MVWaitToMultiLineLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'waitToMultiLineLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: u */
    public final MVWaitToTaxiLeg mo34666u() {
        if (this.setField_ == _Fields.WAIT_TO_TAXI_LEG) {
            return (MVWaitToTaxiLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'waitToTaxiLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: v */
    public final MVWalkLeg mo34667v() {
        if (this.setField_ == _Fields.WALK_LEG) {
            return (MVWalkLeg) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'walkLeg' because union is currently set to ");
        k.append(m30584n((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
