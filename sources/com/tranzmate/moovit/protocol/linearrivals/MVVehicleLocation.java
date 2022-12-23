package com.tranzmate.moovit.protocol.linearrivals;

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

public class MVVehicleLocation implements TBase<MVVehicleLocation, _Fields>, Serializable, Cloneable, Comparable<MVVehicleLocation> {

    /* renamed from: b */
    public static final C25113c f26185b = new C25113c("latlon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26186c = new C25113c("progress", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26187d = new C25113c("vehicleId", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26188e = new C25113c("vehicleSampleTimeUtc", (byte) 10, 4);

    /* renamed from: f */
    public static final HashMap f26189f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26190g;
    private byte __isset_bitfield = 0;
    public MVLatLon latlon;
    private _Fields[] optionals = {_Fields.PROGRESS};
    public MVVehicleProgress progress;
    public String vehicleId;
    public long vehicleSampleTimeUtc;

    public enum _Fields implements C25085c {
        LATLON(1, "latlon"),
        PROGRESS(2, "progress"),
        VEHICLE_ID(3, "vehicleId"),
        VEHICLE_SAMPLE_TIME_UTC(4, "vehicleSampleTimeUtc");
        
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
                return LATLON;
            }
            if (i == 2) {
                return PROGRESS;
            }
            if (i == 3) {
                return VEHICLE_ID;
            }
            if (i != 4) {
                return null;
            }
            return VEHICLE_SAMPLE_TIME_UTC;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVVehicleLocation$a */
    public static class C9016a extends C25239c<MVVehicleLocation> {
        public C9016a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVehicleLocation mVVehicleLocation = (MVVehicleLocation) tBase;
            MVLatLon mVLatLon = mVVehicleLocation.latlon;
            C25113c cVar = MVVehicleLocation.f26185b;
            gVar.mo61687K();
            if (mVVehicleLocation.latlon != null) {
                gVar.mo61711x(MVVehicleLocation.f26185b);
                mVVehicleLocation.latlon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVVehicleLocation.progress != null && mVVehicleLocation.mo28120g()) {
                gVar.mo61711x(MVVehicleLocation.f26186c);
                mVVehicleLocation.progress.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVVehicleLocation.vehicleId != null) {
                gVar.mo61711x(MVVehicleLocation.f26187d);
                gVar.mo61686J(mVVehicleLocation.vehicleId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVVehicleLocation.f26188e);
            C25541a.m63891v(gVar, mVVehicleLocation.vehicleSampleTimeUtc);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVehicleLocation mVVehicleLocation = (MVVehicleLocation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVVehicleLocation.latlon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 10) {
                                mVVehicleLocation.vehicleSampleTimeUtc = gVar.mo61697j();
                                mVVehicleLocation.mo28124j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVVehicleLocation.vehicleId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVVehicleProgress mVVehicleProgress = new MVVehicleProgress();
                        mVVehicleLocation.progress = mVVehicleProgress;
                        mVVehicleProgress.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLatLon mVLatLon2 = new MVLatLon();
                    mVVehicleLocation.latlon = mVLatLon2;
                    mVLatLon2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVVehicleLocation$b */
    public static class C9017b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9016a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVVehicleLocation$c */
    public static class C9018c extends C25240d<MVVehicleLocation> {
        public C9018c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVehicleLocation mVVehicleLocation = (MVVehicleLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVehicleLocation.mo28119f()) {
                bitSet.set(0);
            }
            if (mVVehicleLocation.mo28120g()) {
                bitSet.set(1);
            }
            if (mVVehicleLocation.mo28121h()) {
                bitSet.set(2);
            }
            if (mVVehicleLocation.mo28123i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVVehicleLocation.mo28119f()) {
                mVVehicleLocation.latlon.mo25202X0(jVar);
            }
            if (mVVehicleLocation.mo28120g()) {
                mVVehicleLocation.progress.mo25202X0(jVar);
            }
            if (mVVehicleLocation.mo28121h()) {
                jVar.mo61686J(mVVehicleLocation.vehicleId);
            }
            if (mVVehicleLocation.mo28123i()) {
                jVar.mo61679C(mVVehicleLocation.vehicleSampleTimeUtc);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVehicleLocation mVVehicleLocation = (MVVehicleLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVVehicleLocation.latlon = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVVehicleProgress mVVehicleProgress = new MVVehicleProgress();
                mVVehicleLocation.progress = mVVehicleProgress;
                mVVehicleProgress.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVVehicleLocation.vehicleId = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVVehicleLocation.vehicleSampleTimeUtc = jVar.mo61697j();
                mVVehicleLocation.mo28124j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVVehicleLocation$d */
    public static class C9019d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9018c(0);
        }
    }

    static {
        new C17394d0("MVVehicleLocation");
        HashMap hashMap = new HashMap();
        f26189f = hashMap;
        hashMap.put(C25239c.class, new C9017b());
        hashMap.put(C25240d.class, new C9019d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LATLON, new FieldMetaData("latlon", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.PROGRESS, new FieldMetaData("progress", (byte) 2, new StructMetaData(MVVehicleProgress.class)));
        enumMap.put(_Fields.VEHICLE_ID, new FieldMetaData("vehicleId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VEHICLE_SAMPLE_TIME_UTC, new FieldMetaData("vehicleSampleTimeUtc", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26190g = unmodifiableMap;
        FieldMetaData.m61947a(MVVehicleLocation.class, unmodifiableMap);
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
        ((C25238b) f26189f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26189f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28116a(com.tranzmate.moovit.protocol.linearrivals.MVVehicleLocation r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6.mo28119f()
            boolean r2 = r7.mo28119f()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x0075
            if (r2 != 0) goto L_0x0015
            goto L_0x0075
        L_0x0015:
            com.tranzmate.moovit.protocol.common.MVLatLon r1 = r6.latlon
            com.tranzmate.moovit.protocol.common.MVLatLon r2 = r7.latlon
            boolean r1 = r1.mo26290a(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r6.mo28120g()
            boolean r2 = r7.mo28120g()
            r3 = 1
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x004f
        L_0x002d:
            if (r1 == 0) goto L_0x0075
            if (r2 != 0) goto L_0x0032
            goto L_0x0075
        L_0x0032:
            com.tranzmate.moovit.protocol.linearrivals.MVVehicleProgress r1 = r6.progress
            com.tranzmate.moovit.protocol.linearrivals.MVVehicleProgress r2 = r7.progress
            if (r2 != 0) goto L_0x003d
            r1.getClass()
        L_0x003b:
            r1 = 0
            goto L_0x004c
        L_0x003d:
            int r4 = r1.nextStopIndex
            int r5 = r2.nextStopIndex
            if (r4 == r5) goto L_0x0044
            goto L_0x003b
        L_0x0044:
            byte r1 = r1.progress
            byte r2 = r2.progress
            if (r1 == r2) goto L_0x004b
            goto L_0x003b
        L_0x004b:
            r1 = 1
        L_0x004c:
            if (r1 != 0) goto L_0x004f
            return r0
        L_0x004f:
            boolean r1 = r6.mo28121h()
            boolean r2 = r7.mo28121h()
            if (r1 != 0) goto L_0x005b
            if (r2 == 0) goto L_0x006b
        L_0x005b:
            if (r1 == 0) goto L_0x0075
            if (r2 != 0) goto L_0x0060
            goto L_0x0075
        L_0x0060:
            java.lang.String r1 = r6.vehicleId
            java.lang.String r2 = r7.vehicleId
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006b
            return r0
        L_0x006b:
            long r1 = r6.vehicleSampleTimeUtc
            long r4 = r7.vehicleSampleTimeUtc
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0074
            return r0
        L_0x0074:
            return r3
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.linearrivals.MVVehicleLocation.mo28116a(com.tranzmate.moovit.protocol.linearrivals.MVVehicleLocation):boolean");
    }

    public final int compareTo(Object obj) {
        int d;
        MVVehicleLocation mVVehicleLocation = (MVVehicleLocation) obj;
        if (!getClass().equals(mVVehicleLocation.getClass())) {
            return getClass().getName().compareTo(mVVehicleLocation.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28119f()).compareTo(Boolean.valueOf(mVVehicleLocation.mo28119f()));
        if (compareTo != 0 || ((mo28119f() && (compareTo = this.latlon.compareTo(mVVehicleLocation.latlon)) != 0) || (compareTo = Boolean.valueOf(mo28120g()).compareTo(Boolean.valueOf(mVVehicleLocation.mo28120g()))) != 0 || ((mo28120g() && (compareTo = this.progress.compareTo(mVVehicleLocation.progress)) != 0) || (compareTo = Boolean.valueOf(mo28121h()).compareTo(Boolean.valueOf(mVVehicleLocation.mo28121h()))) != 0 || ((mo28121h() && (compareTo = this.vehicleId.compareTo(mVVehicleLocation.vehicleId)) != 0) || (compareTo = Boolean.valueOf(mo28123i()).compareTo(Boolean.valueOf(mVVehicleLocation.mo28123i()))) != 0)))) {
            return compareTo;
        }
        if (!mo28123i() || (d = C25082a.m62840d(this.vehicleSampleTimeUtc, mVVehicleLocation.vehicleSampleTimeUtc)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVVehicleLocation)) {
            return mo28116a((MVVehicleLocation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28119f() {
        return this.latlon != null;
    }

    /* renamed from: g */
    public final boolean mo28120g() {
        return this.progress != null;
    }

    /* renamed from: h */
    public final boolean mo28121h() {
        return this.vehicleId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28123i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo28124j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVVehicleLocation(", "latlon:");
        MVLatLon mVLatLon = this.latlon;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        if (mo28120g()) {
            n.append(", ");
            n.append("progress:");
            MVVehicleProgress mVVehicleProgress = this.progress;
            if (mVVehicleProgress == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVVehicleProgress);
            }
        }
        n.append(", ");
        n.append("vehicleId:");
        String str = this.vehicleId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("vehicleSampleTimeUtc:");
        return C25541a.m63884o(n, this.vehicleSampleTimeUtc, ")");
    }
}
