package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVWalkPolylineRequest implements TBase<MVWalkPolylineRequest, _Fields>, Serializable, Cloneable, Comparable<MVWalkPolylineRequest> {

    /* renamed from: b */
    public static final C25113c f30279b = new C25113c("maxWalkingDistanceMeters", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f30280c = new C25113c("fromLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30281d = new C25113c("to", (byte) 12, 4);

    /* renamed from: e */
    public static final HashMap f30282e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30283f;
    private byte __isset_bitfield;
    public MVGpsLocation fromLocation;
    public short maxWalkingDistanceMeters;
    private _Fields[] optionals;

    /* renamed from: to */
    public MVStopIdLoaction f30284to;

    public enum _Fields implements C25085c {
        MAX_WALKING_DISTANCE_METERS(1, "maxWalkingDistanceMeters"),
        FROM_LOCATION(2, "fromLocation"),
        TO(4, "to");
        
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
                return MAX_WALKING_DISTANCE_METERS;
            }
            if (i == 2) {
                return FROM_LOCATION;
            }
            if (i != 4) {
                return null;
            }
            return TO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest$a */
    public static class C11730a extends C25239c<MVWalkPolylineRequest> {
        public C11730a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWalkPolylineRequest mVWalkPolylineRequest = (MVWalkPolylineRequest) tBase;
            MVGpsLocation mVGpsLocation = mVWalkPolylineRequest.fromLocation;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVWalkPolylineRequest.f30279b;
            gVar.mo61687K();
            if (mVWalkPolylineRequest.mo34919g()) {
                gVar.mo61711x(MVWalkPolylineRequest.f30279b);
                gVar.mo61677A(mVWalkPolylineRequest.maxWalkingDistanceMeters);
                gVar.mo61712y();
            }
            if (mVWalkPolylineRequest.fromLocation != null) {
                gVar.mo61711x(MVWalkPolylineRequest.f30280c);
                mVWalkPolylineRequest.fromLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWalkPolylineRequest.f30284to != null) {
                gVar.mo61711x(MVWalkPolylineRequest.f30281d);
                mVWalkPolylineRequest.f30284to.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWalkPolylineRequest mVWalkPolylineRequest = (MVWalkPolylineRequest) tBase;
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
                        if (s != 4) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVStopIdLoaction mVStopIdLoaction = new MVStopIdLoaction();
                            mVWalkPolylineRequest.f30284to = mVStopIdLoaction;
                            mVStopIdLoaction.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVGpsLocation mVGpsLocation = new MVGpsLocation();
                        mVWalkPolylineRequest.fromLocation = mVGpsLocation;
                        mVGpsLocation.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVWalkPolylineRequest.maxWalkingDistanceMeters = gVar.mo61695h();
                    mVWalkPolylineRequest.mo34922i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVGpsLocation mVGpsLocation2 = mVWalkPolylineRequest.fromLocation;
            if (mVGpsLocation2 != null) {
                mVGpsLocation2.mo26193r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest$b */
    public static class C11731b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11730a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest$c */
    public static class C11732c extends C25240d<MVWalkPolylineRequest> {
        public C11732c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWalkPolylineRequest mVWalkPolylineRequest = (MVWalkPolylineRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWalkPolylineRequest.mo34919g()) {
                bitSet.set(0);
            }
            if (mVWalkPolylineRequest.mo34918f()) {
                bitSet.set(1);
            }
            if (mVWalkPolylineRequest.mo34920h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVWalkPolylineRequest.mo34919g()) {
                jVar.mo61677A(mVWalkPolylineRequest.maxWalkingDistanceMeters);
            }
            if (mVWalkPolylineRequest.mo34918f()) {
                mVWalkPolylineRequest.fromLocation.mo25202X0(jVar);
            }
            if (mVWalkPolylineRequest.mo34920h()) {
                mVWalkPolylineRequest.f30284to.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWalkPolylineRequest mVWalkPolylineRequest = (MVWalkPolylineRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVWalkPolylineRequest.maxWalkingDistanceMeters = jVar.mo61695h();
                mVWalkPolylineRequest.mo34922i();
            }
            if (T.get(1)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVWalkPolylineRequest.fromLocation = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVStopIdLoaction mVStopIdLoaction = new MVStopIdLoaction();
                mVWalkPolylineRequest.f30284to = mVStopIdLoaction;
                mVStopIdLoaction.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest$d */
    public static class C11733d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11732c(0);
        }
    }

    static {
        new C17394d0("MVWalkPolylineRequest");
        HashMap hashMap = new HashMap();
        f30282e = hashMap;
        hashMap.put(C25239c.class, new C11731b());
        hashMap.put(C25240d.class, new C11733d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MAX_WALKING_DISTANCE_METERS, new FieldMetaData("maxWalkingDistanceMeters", (byte) 2, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.FROM_LOCATION, new FieldMetaData("fromLocation", (byte) 3, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.TO, new FieldMetaData("to", (byte) 3, new StructMetaData(MVStopIdLoaction.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30283f = unmodifiableMap;
        FieldMetaData.m61947a(MVWalkPolylineRequest.class, unmodifiableMap);
    }

    public MVWalkPolylineRequest() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.MAX_WALKING_DISTANCE_METERS};
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f30282e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30282e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWalkPolylineRequest mVWalkPolylineRequest = (MVWalkPolylineRequest) obj;
        if (!getClass().equals(mVWalkPolylineRequest.getClass())) {
            return getClass().getName().compareTo(mVWalkPolylineRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34919g()).compareTo(Boolean.valueOf(mVWalkPolylineRequest.mo34919g()));
        if (compareTo2 != 0 || ((mo34919g() && (compareTo2 = C25082a.m62847k(this.maxWalkingDistanceMeters, mVWalkPolylineRequest.maxWalkingDistanceMeters)) != 0) || (compareTo2 = Boolean.valueOf(mo34918f()).compareTo(Boolean.valueOf(mVWalkPolylineRequest.mo34918f()))) != 0 || ((mo34918f() && (compareTo2 = this.fromLocation.compareTo(mVWalkPolylineRequest.fromLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo34920h()).compareTo(Boolean.valueOf(mVWalkPolylineRequest.mo34920h()))) != 0))) {
            return compareTo2;
        }
        if (!mo34920h() || (compareTo = this.f30284to.compareTo(mVWalkPolylineRequest.f30284to)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest
            r2 = 1
            if (r1 == 0) goto L_0x0070
            com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest r6 = (com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest) r6
            boolean r1 = r5.mo34919g()
            boolean r3 = r6.mo34919g()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0023
        L_0x0017:
            if (r1 == 0) goto L_0x0070
            if (r3 != 0) goto L_0x001c
            goto L_0x0070
        L_0x001c:
            short r1 = r5.maxWalkingDistanceMeters
            short r3 = r6.maxWalkingDistanceMeters
            if (r1 == r3) goto L_0x0023
            goto L_0x0070
        L_0x0023:
            boolean r1 = r5.mo34918f()
            boolean r3 = r6.mo34918f()
            if (r1 != 0) goto L_0x002f
            if (r3 == 0) goto L_0x003f
        L_0x002f:
            if (r1 == 0) goto L_0x0070
            if (r3 != 0) goto L_0x0034
            goto L_0x0070
        L_0x0034:
            com.tranzmate.moovit.protocol.common.MVGpsLocation r1 = r5.fromLocation
            com.tranzmate.moovit.protocol.common.MVGpsLocation r3 = r6.fromLocation
            boolean r1 = r1.mo26178a(r3)
            if (r1 != 0) goto L_0x003f
            goto L_0x0070
        L_0x003f:
            boolean r1 = r5.mo34920h()
            boolean r3 = r6.mo34920h()
            if (r1 != 0) goto L_0x004b
            if (r3 == 0) goto L_0x006f
        L_0x004b:
            if (r1 == 0) goto L_0x0070
            if (r3 != 0) goto L_0x0050
            goto L_0x0070
        L_0x0050:
            com.tranzmate.moovit.protocol.tripplanner.MVStopIdLoaction r1 = r5.f30284to
            com.tranzmate.moovit.protocol.tripplanner.MVStopIdLoaction r6 = r6.f30284to
            if (r6 == 0) goto L_0x0068
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x006b
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x006b
            r6 = 1
            goto L_0x006c
        L_0x0068:
            r1.getClass()
        L_0x006b:
            r6 = 0
        L_0x006c:
            if (r6 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = 1
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo34918f() {
        return this.fromLocation != null;
    }

    /* renamed from: g */
    public final boolean mo34919g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34920h() {
        return this.f30284to != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo34922i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVWalkPolylineRequest(");
        if (mo34919g()) {
            sb.append("maxWalkingDistanceMeters:");
            sb.append(this.maxWalkingDistanceMeters);
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("fromLocation:");
        MVGpsLocation mVGpsLocation = this.fromLocation;
        if (mVGpsLocation == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVGpsLocation);
        }
        sb.append(", ");
        sb.append("to:");
        MVStopIdLoaction mVStopIdLoaction = this.f30284to;
        if (mVStopIdLoaction == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVStopIdLoaction);
        }
        sb.append(")");
        return sb.toString();
    }

    public MVWalkPolylineRequest(MVGpsLocation mVGpsLocation, MVStopIdLoaction mVStopIdLoaction) {
        this();
        this.fromLocation = mVGpsLocation;
        this.f30284to = mVStopIdLoaction;
    }
}
