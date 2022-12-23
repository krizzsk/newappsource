package com.tranzmate.moovit.protocol.sync;

import com.tranzmate.moovit.protocol.common.MVImage;
import com.tranzmate.moovit.protocol.conf.MVConfiguration;
import com.tranzmate.moovit.protocol.gtfs.MVAgency;
import com.tranzmate.moovit.protocol.gtfs.MVBicycleStop;
import com.tranzmate.moovit.protocol.gtfs.MVLineGroupSummary;
import com.tranzmate.moovit.protocol.gtfs.MVLineShapeSegment;
import com.tranzmate.moovit.protocol.gtfs.MVLineStaticArrivals;
import com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData;
import com.tranzmate.moovit.protocol.gtfs.MVStopMetaData;
import com.tranzmate.moovit.protocol.gtfs.MVStopSchedule;
import com.tranzmate.moovit.protocol.gtfs.MVTripFrequency;
import com.tranzmate.moovit.protocol.gtfs.MVTripPattern;
import com.tranzmate.moovit.protocol.gtfs.MVTripShape;
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

public class MVSyncedEntity extends TUnion<MVSyncedEntity, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f28509c = new C17394d0("MVSyncedEntity");

    /* renamed from: d */
    public static final C25113c f28510d = new C25113c("agency", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f28511e = new C25113c("image", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f28512f = new C25113c("lineArrivals", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f28513g = new C25113c("metroArea", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f28514h = new C25113c("stopMetadata", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f28515i = new C25113c("stopSchedule", (byte) 12, 6);

    /* renamed from: j */
    public static final C25113c f28516j = new C25113c("config", (byte) 12, 7);

    /* renamed from: k */
    public static final C25113c f28517k = new C25113c("lineGroupSummary", (byte) 12, 8);

    /* renamed from: l */
    public static final C25113c f28518l = new C25113c("tripPattern", (byte) 12, 9);

    /* renamed from: m */
    public static final C25113c f28519m = new C25113c("bicycleStop", (byte) 12, 10);

    /* renamed from: n */
    public static final C25113c f28520n = new C25113c("mvTripShape", (byte) 12, 11);

    /* renamed from: o */
    public static final C25113c f28521o = new C25113c("tripFrequency", (byte) 12, 12);

    /* renamed from: p */
    public static final C25113c f28522p = new C25113c("lineShapeSegment", (byte) 12, 13);

    /* renamed from: q */
    public static final Map<_Fields, FieldMetaData> f28523q;

    public enum _Fields implements C25085c {
        AGENCY(1, "agency"),
        IMAGE(2, "image"),
        LINE_ARRIVALS(3, "lineArrivals"),
        METRO_AREA(4, "metroArea"),
        STOP_METADATA(5, "stopMetadata"),
        STOP_SCHEDULE(6, "stopSchedule"),
        CONFIG(7, "config"),
        LINE_GROUP_SUMMARY(8, "lineGroupSummary"),
        TRIP_PATTERN(9, "tripPattern"),
        BICYCLE_STOP(10, "bicycleStop"),
        MV_TRIP_SHAPE(11, "mvTripShape"),
        TRIP_FREQUENCY(12, "tripFrequency"),
        LINE_SHAPE_SEGMENT(13, "lineShapeSegment");
        
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
                    return AGENCY;
                case 2:
                    return IMAGE;
                case 3:
                    return LINE_ARRIVALS;
                case 4:
                    return METRO_AREA;
                case 5:
                    return STOP_METADATA;
                case 6:
                    return STOP_SCHEDULE;
                case 7:
                    return CONFIG;
                case 8:
                    return LINE_GROUP_SUMMARY;
                case 9:
                    return TRIP_PATTERN;
                case 10:
                    return BICYCLE_STOP;
                case 11:
                    return MV_TRIP_SHAPE;
                case 12:
                    return TRIP_FREQUENCY;
                case 13:
                    return LINE_SHAPE_SEGMENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncedEntity$a */
    public static /* synthetic */ class C10679a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28524a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields[] r0 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28524a = r0
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.AGENCY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.IMAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.LINE_ARRIVALS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.METRO_AREA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.STOP_METADATA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.STOP_SCHEDULE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.CONFIG     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.LINE_GROUP_SUMMARY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.TRIP_PATTERN     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.BICYCLE_STOP     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.MV_TRIP_SHAPE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.TRIP_FREQUENCY     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f28524a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.tranzmate.moovit.protocol.sync.MVSyncedEntity$_Fields r1 = com.tranzmate.moovit.protocol.sync.MVSyncedEntity._Fields.LINE_SHAPE_SEGMENT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.sync.MVSyncedEntity.C10679a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AGENCY, new FieldMetaData("agency", (byte) 3, new StructMetaData(MVAgency.class)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImage.class)));
        enumMap.put(_Fields.LINE_ARRIVALS, new FieldMetaData("lineArrivals", (byte) 3, new StructMetaData(MVLineStaticArrivals.class)));
        enumMap.put(_Fields.METRO_AREA, new FieldMetaData("metroArea", (byte) 3, new StructMetaData(MVMetroAreaData.class)));
        enumMap.put(_Fields.STOP_METADATA, new FieldMetaData("stopMetadata", (byte) 3, new StructMetaData(MVStopMetaData.class)));
        enumMap.put(_Fields.STOP_SCHEDULE, new FieldMetaData("stopSchedule", (byte) 3, new StructMetaData(MVStopSchedule.class)));
        enumMap.put(_Fields.CONFIG, new FieldMetaData("config", (byte) 3, new StructMetaData(MVConfiguration.class)));
        enumMap.put(_Fields.LINE_GROUP_SUMMARY, new FieldMetaData("lineGroupSummary", (byte) 3, new StructMetaData(MVLineGroupSummary.class)));
        enumMap.put(_Fields.TRIP_PATTERN, new FieldMetaData("tripPattern", (byte) 3, new StructMetaData(MVTripPattern.class)));
        enumMap.put(_Fields.BICYCLE_STOP, new FieldMetaData("bicycleStop", (byte) 3, new StructMetaData(MVBicycleStop.class)));
        enumMap.put(_Fields.MV_TRIP_SHAPE, new FieldMetaData("mvTripShape", (byte) 3, new StructMetaData(MVTripShape.class)));
        enumMap.put(_Fields.TRIP_FREQUENCY, new FieldMetaData("tripFrequency", (byte) 3, new StructMetaData(MVTripFrequency.class)));
        enumMap.put(_Fields.LINE_SHAPE_SEGMENT, new FieldMetaData("lineShapeSegment", (byte) 3, new StructMetaData(MVLineShapeSegment.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28523q = unmodifiableMap;
        FieldMetaData.m61947a(MVSyncedEntity.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m27202k(_Fields _fields) {
        switch (C10679a.f28524a[_fields.ordinal()]) {
            case 1:
                return f28510d;
            case 2:
                return f28511e;
            case 3:
                return f28512f;
            case 4:
                return f28513g;
            case 5:
                return f28514h;
            case 6:
                return f28515i;
            case 7:
                return f28516j;
            case 8:
                return f28517k;
            case 9:
                return f28518l;
            case 10:
                return f28519m;
            case 11:
                return f28520n;
            case 12:
                return f28521o;
            case 13:
                return f28522p;
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
        return m27202k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVSyncedEntity mVSyncedEntity = (MVSyncedEntity) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVSyncedEntity.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVSyncedEntity.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVSyncedEntity mVSyncedEntity;
        if (!(obj instanceof MVSyncedEntity) || (mVSyncedEntity = (MVSyncedEntity) obj) == null || this.setField_ != mVSyncedEntity.setField_ || !this.value_.equals(mVSyncedEntity.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f28509c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C10679a.f28524a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVAgency mVAgency = new MVAgency();
                        mVAgency.mo25201C1(gVar);
                        return mVAgency;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVImage mVImage = new MVImage();
                        mVImage.mo25201C1(gVar);
                        return mVImage;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVLineStaticArrivals mVLineStaticArrivals = new MVLineStaticArrivals();
                        mVLineStaticArrivals.mo25201C1(gVar);
                        return mVLineStaticArrivals;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVMetroAreaData mVMetroAreaData = new MVMetroAreaData();
                        mVMetroAreaData.mo25201C1(gVar);
                        return mVMetroAreaData;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVStopMetaData mVStopMetaData = new MVStopMetaData();
                        mVStopMetaData.mo25201C1(gVar);
                        return mVStopMetaData;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVStopSchedule mVStopSchedule = new MVStopSchedule();
                        mVStopSchedule.mo25201C1(gVar);
                        return mVStopSchedule;
                    }
                    C25122h.m63098a(gVar, b6);
                    return null;
                case 7:
                    byte b7 = cVar.f63356b;
                    if (b7 == 12) {
                        MVConfiguration mVConfiguration = new MVConfiguration();
                        mVConfiguration.mo25201C1(gVar);
                        return mVConfiguration;
                    }
                    C25122h.m63098a(gVar, b7);
                    return null;
                case 8:
                    byte b8 = cVar.f63356b;
                    if (b8 == 12) {
                        MVLineGroupSummary mVLineGroupSummary = new MVLineGroupSummary();
                        mVLineGroupSummary.mo25201C1(gVar);
                        return mVLineGroupSummary;
                    }
                    C25122h.m63098a(gVar, b8);
                    return null;
                case 9:
                    byte b9 = cVar.f63356b;
                    if (b9 == 12) {
                        MVTripPattern mVTripPattern = new MVTripPattern();
                        mVTripPattern.mo25201C1(gVar);
                        return mVTripPattern;
                    }
                    C25122h.m63098a(gVar, b9);
                    return null;
                case 10:
                    byte b11 = cVar.f63356b;
                    if (b11 == 12) {
                        MVBicycleStop mVBicycleStop = new MVBicycleStop();
                        mVBicycleStop.mo25201C1(gVar);
                        return mVBicycleStop;
                    }
                    C25122h.m63098a(gVar, b11);
                    return null;
                case 11:
                    byte b12 = cVar.f63356b;
                    if (b12 == 12) {
                        MVTripShape mVTripShape = new MVTripShape();
                        mVTripShape.mo25201C1(gVar);
                        return mVTripShape;
                    }
                    C25122h.m63098a(gVar, b12);
                    return null;
                case 12:
                    byte b13 = cVar.f63356b;
                    if (b13 == 12) {
                        MVTripFrequency mVTripFrequency = new MVTripFrequency();
                        mVTripFrequency.mo25201C1(gVar);
                        return mVTripFrequency;
                    }
                    C25122h.m63098a(gVar, b13);
                    return null;
                case 13:
                    byte b14 = cVar.f63356b;
                    if (b14 == 12) {
                        MVLineShapeSegment mVLineShapeSegment = new MVLineShapeSegment();
                        mVLineShapeSegment.mo25201C1(gVar);
                        return mVLineShapeSegment;
                    }
                    C25122h.m63098a(gVar, b14);
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
        switch (C10679a.f28524a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVAgency) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVImage) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVLineStaticArrivals) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVMetroAreaData) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVStopMetaData) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVStopSchedule) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVConfiguration) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVLineGroupSummary) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVTripPattern) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVBicycleStop) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVTripShape) this.value_).mo25202X0(gVar);
                return;
            case 12:
                ((MVTripFrequency) this.value_).mo25202X0(gVar);
                return;
            case 13:
                ((MVLineShapeSegment) this.value_).mo25202X0(gVar);
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
            switch (C10679a.f28524a[findByThriftId.ordinal()]) {
                case 1:
                    MVAgency mVAgency = new MVAgency();
                    mVAgency.mo25201C1(gVar);
                    return mVAgency;
                case 2:
                    MVImage mVImage = new MVImage();
                    mVImage.mo25201C1(gVar);
                    return mVImage;
                case 3:
                    MVLineStaticArrivals mVLineStaticArrivals = new MVLineStaticArrivals();
                    mVLineStaticArrivals.mo25201C1(gVar);
                    return mVLineStaticArrivals;
                case 4:
                    MVMetroAreaData mVMetroAreaData = new MVMetroAreaData();
                    mVMetroAreaData.mo25201C1(gVar);
                    return mVMetroAreaData;
                case 5:
                    MVStopMetaData mVStopMetaData = new MVStopMetaData();
                    mVStopMetaData.mo25201C1(gVar);
                    return mVStopMetaData;
                case 6:
                    MVStopSchedule mVStopSchedule = new MVStopSchedule();
                    mVStopSchedule.mo25201C1(gVar);
                    return mVStopSchedule;
                case 7:
                    MVConfiguration mVConfiguration = new MVConfiguration();
                    mVConfiguration.mo25201C1(gVar);
                    return mVConfiguration;
                case 8:
                    MVLineGroupSummary mVLineGroupSummary = new MVLineGroupSummary();
                    mVLineGroupSummary.mo25201C1(gVar);
                    return mVLineGroupSummary;
                case 9:
                    MVTripPattern mVTripPattern = new MVTripPattern();
                    mVTripPattern.mo25201C1(gVar);
                    return mVTripPattern;
                case 10:
                    MVBicycleStop mVBicycleStop = new MVBicycleStop();
                    mVBicycleStop.mo25201C1(gVar);
                    return mVBicycleStop;
                case 11:
                    MVTripShape mVTripShape = new MVTripShape();
                    mVTripShape.mo25201C1(gVar);
                    return mVTripShape;
                case 12:
                    MVTripFrequency mVTripFrequency = new MVTripFrequency();
                    mVTripFrequency.mo25201C1(gVar);
                    return mVTripFrequency;
                case 13:
                    MVLineShapeSegment mVLineShapeSegment = new MVLineShapeSegment();
                    mVLineShapeSegment.mo25201C1(gVar);
                    return mVLineShapeSegment;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C10679a.f28524a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVAgency) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVImage) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVLineStaticArrivals) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVMetroAreaData) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVStopMetaData) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVStopSchedule) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVConfiguration) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVLineGroupSummary) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVTripPattern) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVBicycleStop) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVTripShape) this.value_).mo25202X0(gVar);
                return;
            case 12:
                ((MVTripFrequency) this.value_).mo25202X0(gVar);
                return;
            case 13:
                ((MVLineShapeSegment) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }
}
