package com.tranzmate.moovit.protocol.crowd;

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

public class MVCrowdData extends TUnion<MVCrowdData, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f25365c = new C17394d0("MVCrowdData");

    /* renamed from: d */
    public static final C25113c f25366d = new C25113c("sensorData", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f25367e = new C25113c("rideEvent", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f25368f = new C25113c("wifiScan", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f25369g = new C25113c("beacon", (byte) 12, 4);

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25370h;

    public enum _Fields implements C25085c {
        SENSOR_DATA(1, "sensorData"),
        RIDE_EVENT(2, "rideEvent"),
        WIFI_SCAN(3, "wifiScan"),
        BEACON(4, "beacon");
        
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
            if (i == 1) {
                return SENSOR_DATA;
            }
            if (i == 2) {
                return RIDE_EVENT;
            }
            if (i == 3) {
                return WIFI_SCAN;
            }
            if (i != 4) {
                return null;
            }
            return BEACON;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVCrowdData$a */
    public static /* synthetic */ class C8569a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25371a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tranzmate.moovit.protocol.crowd.MVCrowdData$_Fields[] r0 = com.tranzmate.moovit.protocol.crowd.MVCrowdData._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25371a = r0
                com.tranzmate.moovit.protocol.crowd.MVCrowdData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVCrowdData._Fields.SENSOR_DATA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25371a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.crowd.MVCrowdData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVCrowdData._Fields.RIDE_EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25371a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.crowd.MVCrowdData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVCrowdData._Fields.WIFI_SCAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25371a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.crowd.MVCrowdData$_Fields r1 = com.tranzmate.moovit.protocol.crowd.MVCrowdData._Fields.BEACON     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.crowd.MVCrowdData.C8569a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SENSOR_DATA, new FieldMetaData("sensorData", (byte) 3, new StructMetaData(MVSensorData.class)));
        enumMap.put(_Fields.RIDE_EVENT, new FieldMetaData("rideEvent", (byte) 3, new StructMetaData(MVRideEvent.class)));
        enumMap.put(_Fields.WIFI_SCAN, new FieldMetaData("wifiScan", (byte) 3, new StructMetaData(MVWifiScan.class)));
        enumMap.put(_Fields.BEACON, new FieldMetaData("beacon", (byte) 3, new StructMetaData(MVBeaconDetected.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25370h = unmodifiableMap;
        FieldMetaData.m61947a(MVCrowdData.class, unmodifiableMap);
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
    public final C25113c mo25505b(C25085c cVar) {
        _Fields _fields = (_Fields) cVar;
        int i = C8569a.f25371a[_fields.ordinal()];
        if (i == 1) {
            return f25366d;
        }
        if (i == 2) {
            return f25367e;
        }
        if (i == 3) {
            return f25368f;
        }
        if (i == 4) {
            return f25369g;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
    }

    public final int compareTo(Object obj) {
        MVCrowdData mVCrowdData = (MVCrowdData) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVCrowdData.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVCrowdData.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVCrowdData mVCrowdData;
        if (!(obj instanceof MVCrowdData) || (mVCrowdData = (MVCrowdData) obj) == null || this.setField_ != mVCrowdData.setField_ || !this.value_.equals(mVCrowdData.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f25365c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C8569a.f25371a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVSensorData mVSensorData = new MVSensorData();
                    mVSensorData.mo25201C1(gVar);
                    return mVSensorData;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVRideEvent mVRideEvent = new MVRideEvent();
                    mVRideEvent.mo25201C1(gVar);
                    return mVRideEvent;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVWifiScan mVWifiScan = new MVWifiScan();
                    mVWifiScan.mo25201C1(gVar);
                    return mVWifiScan;
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else if (i == 4) {
                byte b4 = cVar.f63356b;
                if (b4 == 12) {
                    MVBeaconDetected mVBeaconDetected = new MVBeaconDetected();
                    mVBeaconDetected.mo25201C1(gVar);
                    return mVBeaconDetected;
                }
                C25122h.m63098a(gVar, b4);
                return null;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        int i = C8569a.f25371a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVSensorData) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVRideEvent) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVWifiScan) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVBeaconDetected) this.value_).mo25202X0(gVar);
        } else {
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
            int i = C8569a.f25371a[findByThriftId.ordinal()];
            if (i == 1) {
                MVSensorData mVSensorData = new MVSensorData();
                mVSensorData.mo25201C1(gVar);
                return mVSensorData;
            } else if (i == 2) {
                MVRideEvent mVRideEvent = new MVRideEvent();
                mVRideEvent.mo25201C1(gVar);
                return mVRideEvent;
            } else if (i == 3) {
                MVWifiScan mVWifiScan = new MVWifiScan();
                mVWifiScan.mo25201C1(gVar);
                return mVWifiScan;
            } else if (i == 4) {
                MVBeaconDetected mVBeaconDetected = new MVBeaconDetected();
                mVBeaconDetected.mo25201C1(gVar);
                return mVBeaconDetected;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C8569a.f25371a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVSensorData) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVRideEvent) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVWifiScan) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVBeaconDetected) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
