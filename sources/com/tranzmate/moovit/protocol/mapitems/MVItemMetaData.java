package com.tranzmate.moovit.protocol.mapitems;

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

public class MVItemMetaData extends TUnion<MVItemMetaData, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f26311c = new C17394d0("MVItemMetaData");

    /* renamed from: d */
    public static final C25113c f26312d = new C25113c("bikeStationMetaData", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f26313e = new C25113c("carMetaData", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f26314f = new C25113c("carPoolRideMetadata", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f26315g = new C25113c("commercialMetaData", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f26316h = new C25113c("docklessVehicle", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f26317i = new C25113c("docklessCar", (byte) 12, 6);

    /* renamed from: j */
    public static final C25113c f26318j = new C25113c("microMobilityItem", (byte) 12, 7);

    /* renamed from: k */
    public static final C25113c f26319k = new C25113c("directAdMetaData", (byte) 12, 8);

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f26320l;

    public enum _Fields implements C25085c {
        BIKE_STATION_META_DATA(1, "bikeStationMetaData"),
        CAR_META_DATA(2, "carMetaData"),
        CAR_POOL_RIDE_METADATA(3, "carPoolRideMetadata"),
        COMMERCIAL_META_DATA(4, "commercialMetaData"),
        DOCKLESS_VEHICLE(5, "docklessVehicle"),
        DOCKLESS_CAR(6, "docklessCar"),
        MICRO_MOBILITY_ITEM(7, "microMobilityItem"),
        DIRECT_AD_META_DATA(8, "directAdMetaData");
        
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
                    return BIKE_STATION_META_DATA;
                case 2:
                    return CAR_META_DATA;
                case 3:
                    return CAR_POOL_RIDE_METADATA;
                case 4:
                    return COMMERCIAL_META_DATA;
                case 5:
                    return DOCKLESS_VEHICLE;
                case 6:
                    return DOCKLESS_CAR;
                case 7:
                    return MICRO_MOBILITY_ITEM;
                case 8:
                    return DIRECT_AD_META_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$a */
    public static /* synthetic */ class C9101a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26321a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields[] r0 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26321a = r0
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.BIKE_STATION_META_DATA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26321a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.CAR_META_DATA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26321a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.CAR_POOL_RIDE_METADATA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26321a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.COMMERCIAL_META_DATA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26321a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DOCKLESS_VEHICLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26321a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DOCKLESS_CAR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26321a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.MICRO_MOBILITY_ITEM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f26321a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tranzmate.moovit.protocol.mapitems.MVItemMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVItemMetaData._Fields.DIRECT_AD_META_DATA     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.mapitems.MVItemMetaData.C9101a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BIKE_STATION_META_DATA, new FieldMetaData("bikeStationMetaData", (byte) 3, new StructMetaData(MVBikeStationMetaData.class)));
        enumMap.put(_Fields.CAR_META_DATA, new FieldMetaData("carMetaData", (byte) 3, new StructMetaData(MVCarMetaData.class)));
        enumMap.put(_Fields.CAR_POOL_RIDE_METADATA, new FieldMetaData("carPoolRideMetadata", (byte) 3, new StructMetaData(MVCarPoolRideMetaData.class)));
        enumMap.put(_Fields.COMMERCIAL_META_DATA, new FieldMetaData("commercialMetaData", (byte) 3, new StructMetaData(MVCommercialMetaData.class)));
        enumMap.put(_Fields.DOCKLESS_VEHICLE, new FieldMetaData("docklessVehicle", (byte) 3, new StructMetaData(MVDocklessVehicle.class)));
        enumMap.put(_Fields.DOCKLESS_CAR, new FieldMetaData("docklessCar", (byte) 3, new StructMetaData(MVDocklessCar.class)));
        enumMap.put(_Fields.MICRO_MOBILITY_ITEM, new FieldMetaData("microMobilityItem", (byte) 3, new StructMetaData(MVMicroMobilityItem.class)));
        enumMap.put(_Fields.DIRECT_AD_META_DATA, new FieldMetaData("directAdMetaData", (byte) 3, new StructMetaData(MVDirectAdMetaData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26320l = unmodifiableMap;
        FieldMetaData.m61947a(MVItemMetaData.class, unmodifiableMap);
    }

    /* renamed from: m */
    public static C25113c m22229m(_Fields _fields) {
        switch (C9101a.f26321a[_fields.ordinal()]) {
            case 1:
                return f26312d;
            case 2:
                return f26313e;
            case 3:
                return f26314f;
            case 4:
                return f26315g;
            case 5:
                return f26316h;
            case 6:
                return f26317i;
            case 7:
                return f26318j;
            case 8:
                return f26319k;
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
        return m22229m((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVItemMetaData mVItemMetaData = (MVItemMetaData) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVItemMetaData.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVItemMetaData.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVItemMetaData mVItemMetaData;
        if (!(obj instanceof MVItemMetaData) || (mVItemMetaData = (MVItemMetaData) obj) == null || this.setField_ != mVItemMetaData.setField_ || !this.value_.equals(mVItemMetaData.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f26311c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C9101a.f26321a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVBikeStationMetaData mVBikeStationMetaData = new MVBikeStationMetaData();
                        mVBikeStationMetaData.mo25201C1(gVar);
                        return mVBikeStationMetaData;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVCarMetaData mVCarMetaData = new MVCarMetaData();
                        mVCarMetaData.mo25201C1(gVar);
                        return mVCarMetaData;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVCarPoolRideMetaData mVCarPoolRideMetaData = new MVCarPoolRideMetaData();
                        mVCarPoolRideMetaData.mo25201C1(gVar);
                        return mVCarPoolRideMetaData;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVCommercialMetaData mVCommercialMetaData = new MVCommercialMetaData();
                        mVCommercialMetaData.mo25201C1(gVar);
                        return mVCommercialMetaData;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVDocklessVehicle mVDocklessVehicle = new MVDocklessVehicle();
                        mVDocklessVehicle.mo25201C1(gVar);
                        return mVDocklessVehicle;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVDocklessCar mVDocklessCar = new MVDocklessCar();
                        mVDocklessCar.mo25201C1(gVar);
                        return mVDocklessCar;
                    }
                    C25122h.m63098a(gVar, b6);
                    return null;
                case 7:
                    byte b7 = cVar.f63356b;
                    if (b7 == 12) {
                        MVMicroMobilityItem mVMicroMobilityItem = new MVMicroMobilityItem();
                        mVMicroMobilityItem.mo25201C1(gVar);
                        return mVMicroMobilityItem;
                    }
                    C25122h.m63098a(gVar, b7);
                    return null;
                case 8:
                    byte b8 = cVar.f63356b;
                    if (b8 == 12) {
                        MVDirectAdMetaData mVDirectAdMetaData = new MVDirectAdMetaData();
                        mVDirectAdMetaData.mo25201C1(gVar);
                        return mVDirectAdMetaData;
                    }
                    C25122h.m63098a(gVar, b8);
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
        switch (C9101a.f26321a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVBikeStationMetaData) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVCarMetaData) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVCarPoolRideMetaData) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVCommercialMetaData) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVDocklessVehicle) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVDocklessCar) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVMicroMobilityItem) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVDirectAdMetaData) this.value_).mo25202X0(gVar);
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
            switch (C9101a.f26321a[findByThriftId.ordinal()]) {
                case 1:
                    MVBikeStationMetaData mVBikeStationMetaData = new MVBikeStationMetaData();
                    mVBikeStationMetaData.mo25201C1(gVar);
                    return mVBikeStationMetaData;
                case 2:
                    MVCarMetaData mVCarMetaData = new MVCarMetaData();
                    mVCarMetaData.mo25201C1(gVar);
                    return mVCarMetaData;
                case 3:
                    MVCarPoolRideMetaData mVCarPoolRideMetaData = new MVCarPoolRideMetaData();
                    mVCarPoolRideMetaData.mo25201C1(gVar);
                    return mVCarPoolRideMetaData;
                case 4:
                    MVCommercialMetaData mVCommercialMetaData = new MVCommercialMetaData();
                    mVCommercialMetaData.mo25201C1(gVar);
                    return mVCommercialMetaData;
                case 5:
                    MVDocklessVehicle mVDocklessVehicle = new MVDocklessVehicle();
                    mVDocklessVehicle.mo25201C1(gVar);
                    return mVDocklessVehicle;
                case 6:
                    MVDocklessCar mVDocklessCar = new MVDocklessCar();
                    mVDocklessCar.mo25201C1(gVar);
                    return mVDocklessCar;
                case 7:
                    MVMicroMobilityItem mVMicroMobilityItem = new MVMicroMobilityItem();
                    mVMicroMobilityItem.mo25201C1(gVar);
                    return mVMicroMobilityItem;
                case 8:
                    MVDirectAdMetaData mVDirectAdMetaData = new MVDirectAdMetaData();
                    mVDirectAdMetaData.mo25201C1(gVar);
                    return mVDirectAdMetaData;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C9101a.f26321a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVBikeStationMetaData) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVCarMetaData) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVCarPoolRideMetaData) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVCommercialMetaData) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVDocklessVehicle) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVDocklessCar) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVMicroMobilityItem) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVDirectAdMetaData) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: k */
    public final MVBikeStationMetaData mo28323k() {
        if (this.setField_ == _Fields.BIKE_STATION_META_DATA) {
            return (MVBikeStationMetaData) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'bikeStationMetaData' because union is currently set to ");
        k.append(m22229m((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: l */
    public final MVDocklessVehicle mo28324l() {
        if (this.setField_ == _Fields.DOCKLESS_VEHICLE) {
            return (MVDocklessVehicle) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'docklessVehicle' because union is currently set to ");
        k.append(m22229m((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
