package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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
import p001a0.C0016g;
import p358af.C13437d;
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

public class MVWalkingInstruction implements TBase<MVWalkingInstruction, _Fields>, Serializable, Cloneable, Comparable<MVWalkingInstruction> {

    /* renamed from: b */
    public static final C25113c f30291b = new C25113c("direction", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30292c = new C25113c("streetName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30293d = new C25113c("lengthInMeters", (byte) 4, 3);

    /* renamed from: e */
    public static final C25113c f30294e = new C25113c("travelTimeInMs", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30295f = new C25113c("startLocation", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f30296g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30297h;
    private byte __isset_bitfield = 0;
    public MVWalkingDirection direction;
    public double lengthInMeters;
    public MVLatLon startLocation;
    public String streetName;
    public int travelTimeInMs;

    public enum _Fields implements C25085c {
        DIRECTION(1, "direction"),
        STREET_NAME(2, "streetName"),
        LENGTH_IN_METERS(3, "lengthInMeters"),
        TRAVEL_TIME_IN_MS(4, "travelTimeInMs"),
        START_LOCATION(5, "startLocation");
        
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
                return DIRECTION;
            }
            if (i == 2) {
                return STREET_NAME;
            }
            if (i == 3) {
                return LENGTH_IN_METERS;
            }
            if (i == 4) {
                return TRAVEL_TIME_IN_MS;
            }
            if (i != 5) {
                return null;
            }
            return START_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction$a */
    public static class C11735a extends C25239c<MVWalkingInstruction> {
        public C11735a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWalkingInstruction mVWalkingInstruction = (MVWalkingInstruction) tBase;
            MVLatLon mVLatLon = mVWalkingInstruction.startLocation;
            C25113c cVar = MVWalkingInstruction.f30291b;
            gVar.mo61687K();
            if (mVWalkingInstruction.direction != null) {
                gVar.mo61711x(MVWalkingInstruction.f30291b);
                mVWalkingInstruction.direction.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWalkingInstruction.streetName != null) {
                gVar.mo61711x(MVWalkingInstruction.f30292c);
                gVar.mo61686J(mVWalkingInstruction.streetName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWalkingInstruction.f30293d);
            gVar.mo61710w(mVWalkingInstruction.lengthInMeters);
            gVar.mo61712y();
            gVar.mo61711x(MVWalkingInstruction.f30294e);
            gVar.mo61678B(mVWalkingInstruction.travelTimeInMs);
            gVar.mo61712y();
            if (mVWalkingInstruction.startLocation != null) {
                gVar.mo61711x(MVWalkingInstruction.f30295f);
                mVWalkingInstruction.startLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWalkingInstruction mVWalkingInstruction = (MVWalkingInstruction) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVWalkingInstruction.startLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVLatLon mVLatLon2 = new MVLatLon();
                                    mVWalkingInstruction.startLocation = mVLatLon2;
                                    mVLatLon2.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVWalkingInstruction.travelTimeInMs = gVar.mo61696i();
                                mVWalkingInstruction.mo34938l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 4) {
                            mVWalkingInstruction.lengthInMeters = gVar.mo61692e();
                            mVWalkingInstruction.mo34937k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVWalkingInstruction.streetName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVWalkingDirection mVWalkingDirection = new MVWalkingDirection();
                    mVWalkingInstruction.direction = mVWalkingDirection;
                    mVWalkingDirection.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction$b */
    public static class C11736b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11735a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction$c */
    public static class C11737c extends C25240d<MVWalkingInstruction> {
        public C11737c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWalkingInstruction mVWalkingInstruction = (MVWalkingInstruction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWalkingInstruction.mo34931f()) {
                bitSet.set(0);
            }
            if (mVWalkingInstruction.mo34935i()) {
                bitSet.set(1);
            }
            if (mVWalkingInstruction.mo34932g()) {
                bitSet.set(2);
            }
            if (mVWalkingInstruction.mo34936j()) {
                bitSet.set(3);
            }
            if (mVWalkingInstruction.mo34933h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVWalkingInstruction.mo34931f()) {
                mVWalkingInstruction.direction.mo25202X0(jVar);
            }
            if (mVWalkingInstruction.mo34935i()) {
                jVar.mo61686J(mVWalkingInstruction.streetName);
            }
            if (mVWalkingInstruction.mo34932g()) {
                jVar.mo61710w(mVWalkingInstruction.lengthInMeters);
            }
            if (mVWalkingInstruction.mo34936j()) {
                jVar.mo61678B(mVWalkingInstruction.travelTimeInMs);
            }
            if (mVWalkingInstruction.mo34933h()) {
                mVWalkingInstruction.startLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWalkingInstruction mVWalkingInstruction = (MVWalkingInstruction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVWalkingDirection mVWalkingDirection = new MVWalkingDirection();
                mVWalkingInstruction.direction = mVWalkingDirection;
                mVWalkingDirection.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVWalkingInstruction.streetName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWalkingInstruction.lengthInMeters = jVar.mo61692e();
                mVWalkingInstruction.mo34937k();
            }
            if (T.get(3)) {
                mVWalkingInstruction.travelTimeInMs = jVar.mo61696i();
                mVWalkingInstruction.mo34938l();
            }
            if (T.get(4)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVWalkingInstruction.startLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction$d */
    public static class C11738d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11737c(0);
        }
    }

    static {
        new C17394d0("MVWalkingInstruction");
        HashMap hashMap = new HashMap();
        f30296g = hashMap;
        hashMap.put(C25239c.class, new C11736b());
        hashMap.put(C25240d.class, new C11738d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DIRECTION, new FieldMetaData("direction", (byte) 3, new StructMetaData(MVWalkingDirection.class)));
        enumMap.put(_Fields.STREET_NAME, new FieldMetaData("streetName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LENGTH_IN_METERS, new FieldMetaData("lengthInMeters", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.TRAVEL_TIME_IN_MS, new FieldMetaData("travelTimeInMs", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.START_LOCATION, new FieldMetaData("startLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30297h = unmodifiableMap;
        FieldMetaData.m61947a(MVWalkingInstruction.class, unmodifiableMap);
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
        ((C25238b) f30296g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30296g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWalkingInstruction mVWalkingInstruction = (MVWalkingInstruction) obj;
        if (!getClass().equals(mVWalkingInstruction.getClass())) {
            return getClass().getName().compareTo(mVWalkingInstruction.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34931f()).compareTo(Boolean.valueOf(mVWalkingInstruction.mo34931f()));
        if (compareTo2 != 0 || ((mo34931f() && (compareTo2 = this.direction.compareTo(mVWalkingInstruction.direction)) != 0) || (compareTo2 = Boolean.valueOf(mo34935i()).compareTo(Boolean.valueOf(mVWalkingInstruction.mo34935i()))) != 0 || ((mo34935i() && (compareTo2 = this.streetName.compareTo(mVWalkingInstruction.streetName)) != 0) || (compareTo2 = Boolean.valueOf(mo34932g()).compareTo(Boolean.valueOf(mVWalkingInstruction.mo34932g()))) != 0 || ((mo34932g() && (compareTo2 = C25082a.m62838b(this.lengthInMeters, mVWalkingInstruction.lengthInMeters)) != 0) || (compareTo2 = Boolean.valueOf(mo34936j()).compareTo(Boolean.valueOf(mVWalkingInstruction.mo34936j()))) != 0 || ((mo34936j() && (compareTo2 = C25082a.m62839c(this.travelTimeInMs, mVWalkingInstruction.travelTimeInMs)) != 0) || (compareTo2 = Boolean.valueOf(mo34933h()).compareTo(Boolean.valueOf(mVWalkingInstruction.mo34933h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo34933h() || (compareTo = this.startLocation.compareTo(mVWalkingInstruction.startLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction
            r2 = 1
            if (r1 == 0) goto L_0x0085
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction r8 = (com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction) r8
            boolean r1 = r7.mo34931f()
            boolean r3 = r8.mo34931f()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x003c
        L_0x0017:
            if (r1 == 0) goto L_0x0085
            if (r3 != 0) goto L_0x001d
            goto L_0x0085
        L_0x001d:
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection r1 = r7.direction
            com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection r3 = r8.direction
            if (r3 == 0) goto L_0x0035
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x0038
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0035:
            r1.getClass()
        L_0x0038:
            r1 = 0
        L_0x0039:
            if (r1 != 0) goto L_0x003c
            goto L_0x0085
        L_0x003c:
            boolean r1 = r7.mo34935i()
            boolean r3 = r8.mo34935i()
            if (r1 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x0058
        L_0x0048:
            if (r1 == 0) goto L_0x0085
            if (r3 != 0) goto L_0x004d
            goto L_0x0085
        L_0x004d:
            java.lang.String r1 = r7.streetName
            java.lang.String r3 = r8.streetName
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
            goto L_0x0085
        L_0x0058:
            double r3 = r7.lengthInMeters
            double r5 = r8.lengthInMeters
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0061
            goto L_0x0085
        L_0x0061:
            int r1 = r7.travelTimeInMs
            int r3 = r8.travelTimeInMs
            if (r1 == r3) goto L_0x0068
            goto L_0x0085
        L_0x0068:
            boolean r1 = r7.mo34933h()
            boolean r3 = r8.mo34933h()
            if (r1 != 0) goto L_0x0074
            if (r3 == 0) goto L_0x0084
        L_0x0074:
            if (r1 == 0) goto L_0x0085
            if (r3 != 0) goto L_0x0079
            goto L_0x0085
        L_0x0079:
            com.tranzmate.moovit.protocol.common.MVLatLon r1 = r7.startLocation
            com.tranzmate.moovit.protocol.common.MVLatLon r8 = r8.startLocation
            boolean r8 = r1.mo26290a(r8)
            if (r8 != 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r0 = 1
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo34931f() {
        return this.direction != null;
    }

    /* renamed from: g */
    public final boolean mo34932g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34933h() {
        return this.startLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34935i() {
        return this.streetName != null;
    }

    /* renamed from: j */
    public final boolean mo34936j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final void mo34937k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo34938l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWalkingInstruction(", "direction:");
        MVWalkingDirection mVWalkingDirection = this.direction;
        if (mVWalkingDirection == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWalkingDirection);
        }
        n.append(", ");
        n.append("streetName:");
        String str = this.streetName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("lengthInMeters:");
        C16759e.m42355k(n, this.lengthInMeters, ", ", "travelTimeInMs:");
        C0016g.m42z(n, this.travelTimeInMs, ", ", "startLocation:");
        MVLatLon mVLatLon = this.startLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(")");
        return n.toString();
    }
}
