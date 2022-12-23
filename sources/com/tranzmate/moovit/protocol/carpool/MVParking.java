package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVParking implements TBase<MVParking, _Fields>, Serializable, Cloneable, Comparable<MVParking> {

    /* renamed from: b */
    public static final C25113c f24730b = new C25113c("parkingMetadata", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24731c = new C25113c("parkingState", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24732d = new C25113c("rideParkingStatus", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f24733e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24734f;
    public MVParkingMetaData parkingMetadata;
    public MVParkingState parkingState;
    public MVParkingStatus rideParkingStatus;

    public enum _Fields implements C25085c {
        PARKING_METADATA(1, "parkingMetadata"),
        PARKING_STATE(2, "parkingState"),
        RIDE_PARKING_STATUS(3, "rideParkingStatus");
        
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
                return PARKING_METADATA;
            }
            if (i == 2) {
                return PARKING_STATE;
            }
            if (i != 3) {
                return null;
            }
            return RIDE_PARKING_STATUS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParking$a */
    public static class C8226a extends C25239c<MVParking> {
        public C8226a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParking mVParking = (MVParking) tBase;
            MVParkingMetaData mVParkingMetaData = mVParking.parkingMetadata;
            if (mVParkingMetaData != null) {
                mVParkingMetaData.mo25667q();
            }
            C25113c cVar = MVParking.f24730b;
            gVar.mo61687K();
            if (mVParking.parkingMetadata != null) {
                gVar.mo61711x(MVParking.f24730b);
                mVParking.parkingMetadata.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParking.parkingState != null) {
                gVar.mo61711x(MVParking.f24731c);
                mVParking.parkingState.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParking.rideParkingStatus != null) {
                gVar.mo61711x(MVParking.f24732d);
                gVar.mo61678B(mVParking.rideParkingStatus.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParking mVParking = (MVParking) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVParking.rideParkingStatus = MVParkingStatus.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVParkingState mVParkingState = new MVParkingState();
                        mVParking.parkingState = mVParkingState;
                        mVParkingState.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVParkingMetaData mVParkingMetaData = new MVParkingMetaData();
                    mVParking.parkingMetadata = mVParkingMetaData;
                    mVParkingMetaData.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVParkingMetaData mVParkingMetaData2 = mVParking.parkingMetadata;
            if (mVParkingMetaData2 != null) {
                mVParkingMetaData2.mo25667q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParking$b */
    public static class C8227b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8226a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParking$c */
    public static class C8228c extends C25240d<MVParking> {
        public C8228c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParking mVParking = (MVParking) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVParking.mo25647f()) {
                bitSet.set(0);
            }
            if (mVParking.mo25648g()) {
                bitSet.set(1);
            }
            if (mVParking.mo25649h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVParking.mo25647f()) {
                mVParking.parkingMetadata.mo25202X0(jVar);
            }
            if (mVParking.mo25648g()) {
                mVParking.parkingState.mo25202X0(jVar);
            }
            if (mVParking.mo25649h()) {
                jVar.mo61678B(mVParking.rideParkingStatus.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParking mVParking = (MVParking) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVParkingMetaData mVParkingMetaData = new MVParkingMetaData();
                mVParking.parkingMetadata = mVParkingMetaData;
                mVParkingMetaData.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVParkingState mVParkingState = new MVParkingState();
                mVParking.parkingState = mVParkingState;
                mVParkingState.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVParking.rideParkingStatus = MVParkingStatus.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParking$d */
    public static class C8229d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8228c(0);
        }
    }

    static {
        new C17394d0("MVParking");
        HashMap hashMap = new HashMap();
        f24733e = hashMap;
        hashMap.put(C25239c.class, new C8227b());
        hashMap.put(C25240d.class, new C8229d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PARKING_METADATA, new FieldMetaData("parkingMetadata", (byte) 3, new StructMetaData(MVParkingMetaData.class)));
        enumMap.put(_Fields.PARKING_STATE, new FieldMetaData("parkingState", (byte) 3, new StructMetaData(MVParkingState.class)));
        enumMap.put(_Fields.RIDE_PARKING_STATUS, new FieldMetaData("rideParkingStatus", (byte) 3, new EnumMetaData(MVParkingStatus.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24734f = unmodifiableMap;
        FieldMetaData.m61947a(MVParking.class, unmodifiableMap);
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

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f24733e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24733e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25644a(com.tranzmate.moovit.protocol.carpool.MVParking r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4.mo25647f()
            boolean r2 = r5.mo25647f()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x0065
            if (r2 != 0) goto L_0x0015
            goto L_0x0065
        L_0x0015:
            com.tranzmate.moovit.protocol.carpool.MVParkingMetaData r1 = r4.parkingMetadata
            com.tranzmate.moovit.protocol.carpool.MVParkingMetaData r2 = r5.parkingMetadata
            boolean r1 = r1.mo25653a(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r4.mo25648g()
            boolean r2 = r5.mo25648g()
            r3 = 1
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0048
        L_0x002d:
            if (r1 == 0) goto L_0x0065
            if (r2 != 0) goto L_0x0032
            goto L_0x0065
        L_0x0032:
            com.tranzmate.moovit.protocol.carpool.MVParkingState r1 = r4.parkingState
            com.tranzmate.moovit.protocol.carpool.MVParkingState r2 = r5.parkingState
            if (r2 != 0) goto L_0x003d
            r1.getClass()
        L_0x003b:
            r1 = 0
            goto L_0x0045
        L_0x003d:
            int r1 = r1.acquiredPlaces
            int r2 = r2.acquiredPlaces
            if (r1 == r2) goto L_0x0044
            goto L_0x003b
        L_0x0044:
            r1 = 1
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            return r0
        L_0x0048:
            boolean r1 = r4.mo25649h()
            boolean r2 = r5.mo25649h()
            if (r1 != 0) goto L_0x0054
            if (r2 == 0) goto L_0x0064
        L_0x0054:
            if (r1 == 0) goto L_0x0065
            if (r2 != 0) goto L_0x0059
            goto L_0x0065
        L_0x0059:
            com.tranzmate.moovit.protocol.carpool.MVParkingStatus r1 = r4.rideParkingStatus
            com.tranzmate.moovit.protocol.carpool.MVParkingStatus r5 = r5.rideParkingStatus
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0064
            return r0
        L_0x0064:
            return r3
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.carpool.MVParking.mo25644a(com.tranzmate.moovit.protocol.carpool.MVParking):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVParking mVParking = (MVParking) obj;
        if (!getClass().equals(mVParking.getClass())) {
            return getClass().getName().compareTo(mVParking.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25647f()).compareTo(Boolean.valueOf(mVParking.mo25647f()));
        if (compareTo2 != 0 || ((mo25647f() && (compareTo2 = this.parkingMetadata.compareTo(mVParking.parkingMetadata)) != 0) || (compareTo2 = Boolean.valueOf(mo25648g()).compareTo(Boolean.valueOf(mVParking.mo25648g()))) != 0 || ((mo25648g() && (compareTo2 = this.parkingState.compareTo(mVParking.parkingState)) != 0) || (compareTo2 = Boolean.valueOf(mo25649h()).compareTo(Boolean.valueOf(mVParking.mo25649h()))) != 0))) {
            return compareTo2;
        }
        if (!mo25649h() || (compareTo = this.rideParkingStatus.compareTo(mVParking.rideParkingStatus)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVParking)) {
            return mo25644a((MVParking) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25647f() {
        return this.parkingMetadata != null;
    }

    /* renamed from: g */
    public final boolean mo25648g() {
        return this.parkingState != null;
    }

    /* renamed from: h */
    public final boolean mo25649h() {
        return this.rideParkingStatus != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVParking(", "parkingMetadata:");
        MVParkingMetaData mVParkingMetaData = this.parkingMetadata;
        if (mVParkingMetaData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVParkingMetaData);
        }
        n.append(", ");
        n.append("parkingState:");
        MVParkingState mVParkingState = this.parkingState;
        if (mVParkingState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVParkingState);
        }
        n.append(", ");
        n.append("rideParkingStatus:");
        MVParkingStatus mVParkingStatus = this.rideParkingStatus;
        if (mVParkingStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVParkingStatus);
        }
        n.append(")");
        return n.toString();
    }
}
