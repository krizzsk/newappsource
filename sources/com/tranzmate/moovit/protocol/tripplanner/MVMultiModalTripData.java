package com.tranzmate.moovit.protocol.tripplanner;

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
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVMultiModalTripData implements TBase<MVMultiModalTripData, _Fields>, Serializable, Cloneable, Comparable<MVMultiModalTripData> {

    /* renamed from: b */
    public static final C25113c f29984b = new C25113c("carLeg", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29985c = new C25113c("isParkingRequired", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f29986d = new C25113c("maxRadiusMeters", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29987e = new C25113c("maxStops", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f29988f = new C25113c("minRadiusMeters", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f29989g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f29990h;
    private byte __isset_bitfield = 0;
    public MVMultiModalCarLeg carLeg;
    public boolean isParkingRequired;
    public int maxRadiusMeters;
    public int maxStops;
    public int minRadiusMeters;
    private _Fields[] optionals = {_Fields.MAX_RADIUS_METERS, _Fields.MAX_STOPS, _Fields.MIN_RADIUS_METERS};

    public enum _Fields implements C25085c {
        CAR_LEG(1, "carLeg"),
        IS_PARKING_REQUIRED(2, "isParkingRequired"),
        MAX_RADIUS_METERS(3, "maxRadiusMeters"),
        MAX_STOPS(4, "maxStops"),
        MIN_RADIUS_METERS(5, "minRadiusMeters");
        
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
                return CAR_LEG;
            }
            if (i == 2) {
                return IS_PARKING_REQUIRED;
            }
            if (i == 3) {
                return MAX_RADIUS_METERS;
            }
            if (i == 4) {
                return MAX_STOPS;
            }
            if (i != 5) {
                return null;
            }
            return MIN_RADIUS_METERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMultiModalTripData$a */
    public static class C11582a extends C25239c<MVMultiModalTripData> {
        public C11582a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMultiModalTripData mVMultiModalTripData = (MVMultiModalTripData) tBase;
            mVMultiModalTripData.getClass();
            C25113c cVar = MVMultiModalTripData.f29984b;
            gVar.mo61687K();
            if (mVMultiModalTripData.carLeg != null) {
                gVar.mo61711x(MVMultiModalTripData.f29984b);
                gVar.mo61678B(mVMultiModalTripData.carLeg.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMultiModalTripData.f29985c);
            gVar.mo61708u(mVMultiModalTripData.isParkingRequired);
            gVar.mo61712y();
            if (mVMultiModalTripData.mo34418h()) {
                gVar.mo61711x(MVMultiModalTripData.f29986d);
                gVar.mo61678B(mVMultiModalTripData.maxRadiusMeters);
                gVar.mo61712y();
            }
            if (mVMultiModalTripData.mo34420i()) {
                gVar.mo61711x(MVMultiModalTripData.f29987e);
                gVar.mo61678B(mVMultiModalTripData.maxStops);
                gVar.mo61712y();
            }
            if (mVMultiModalTripData.mo34421j()) {
                gVar.mo61711x(MVMultiModalTripData.f29988f);
                gVar.mo61678B(mVMultiModalTripData.minRadiusMeters);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMultiModalTripData mVMultiModalTripData = (MVMultiModalTripData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMultiModalTripData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVMultiModalTripData.minRadiusMeters = gVar.mo61696i();
                                    mVMultiModalTripData.mo34425o();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVMultiModalTripData.maxStops = gVar.mo61696i();
                                mVMultiModalTripData.mo34424m();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVMultiModalTripData.maxRadiusMeters = gVar.mo61696i();
                            mVMultiModalTripData.mo34423l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVMultiModalTripData.isParkingRequired = gVar.mo61690c();
                        mVMultiModalTripData.mo34422k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVMultiModalTripData.carLeg = MVMultiModalCarLeg.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMultiModalTripData$b */
    public static class C11583b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11582a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMultiModalTripData$c */
    public static class C11584c extends C25240d<MVMultiModalTripData> {
        public C11584c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMultiModalTripData mVMultiModalTripData = (MVMultiModalTripData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMultiModalTripData.mo34416f()) {
                bitSet.set(0);
            }
            if (mVMultiModalTripData.mo34417g()) {
                bitSet.set(1);
            }
            if (mVMultiModalTripData.mo34418h()) {
                bitSet.set(2);
            }
            if (mVMultiModalTripData.mo34420i()) {
                bitSet.set(3);
            }
            if (mVMultiModalTripData.mo34421j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMultiModalTripData.mo34416f()) {
                jVar.mo61678B(mVMultiModalTripData.carLeg.getValue());
            }
            if (mVMultiModalTripData.mo34417g()) {
                jVar.mo61708u(mVMultiModalTripData.isParkingRequired);
            }
            if (mVMultiModalTripData.mo34418h()) {
                jVar.mo61678B(mVMultiModalTripData.maxRadiusMeters);
            }
            if (mVMultiModalTripData.mo34420i()) {
                jVar.mo61678B(mVMultiModalTripData.maxStops);
            }
            if (mVMultiModalTripData.mo34421j()) {
                jVar.mo61678B(mVMultiModalTripData.minRadiusMeters);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMultiModalTripData mVMultiModalTripData = (MVMultiModalTripData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMultiModalTripData.carLeg = MVMultiModalCarLeg.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVMultiModalTripData.isParkingRequired = jVar.mo61690c();
                mVMultiModalTripData.mo34422k();
            }
            if (T.get(2)) {
                mVMultiModalTripData.maxRadiusMeters = jVar.mo61696i();
                mVMultiModalTripData.mo34423l();
            }
            if (T.get(3)) {
                mVMultiModalTripData.maxStops = jVar.mo61696i();
                mVMultiModalTripData.mo34424m();
            }
            if (T.get(4)) {
                mVMultiModalTripData.minRadiusMeters = jVar.mo61696i();
                mVMultiModalTripData.mo34425o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMultiModalTripData$d */
    public static class C11585d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11584c(0);
        }
    }

    static {
        new C17394d0("MVMultiModalTripData");
        HashMap hashMap = new HashMap();
        f29989g = hashMap;
        hashMap.put(C25239c.class, new C11583b());
        hashMap.put(C25240d.class, new C11585d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CAR_LEG, new FieldMetaData("carLeg", (byte) 3, new EnumMetaData(MVMultiModalCarLeg.class)));
        enumMap.put(_Fields.IS_PARKING_REQUIRED, new FieldMetaData("isParkingRequired", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MAX_RADIUS_METERS, new FieldMetaData("maxRadiusMeters", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MAX_STOPS, new FieldMetaData("maxStops", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MIN_RADIUS_METERS, new FieldMetaData("minRadiusMeters", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29990h = unmodifiableMap;
        FieldMetaData.m61947a(MVMultiModalTripData.class, unmodifiableMap);
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
        ((C25238b) f29989g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29989g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34413a(MVMultiModalTripData mVMultiModalTripData) {
        if (mVMultiModalTripData == null) {
            return false;
        }
        boolean f = mo34416f();
        boolean f2 = mVMultiModalTripData.mo34416f();
        if (((f || f2) && (!f || !f2 || !this.carLeg.equals(mVMultiModalTripData.carLeg))) || this.isParkingRequired != mVMultiModalTripData.isParkingRequired) {
            return false;
        }
        boolean h = mo34418h();
        boolean h2 = mVMultiModalTripData.mo34418h();
        if ((h || h2) && (!h || !h2 || this.maxRadiusMeters != mVMultiModalTripData.maxRadiusMeters)) {
            return false;
        }
        boolean i = mo34420i();
        boolean i2 = mVMultiModalTripData.mo34420i();
        if ((i || i2) && (!i || !i2 || this.maxStops != mVMultiModalTripData.maxStops)) {
            return false;
        }
        boolean j = mo34421j();
        boolean j2 = mVMultiModalTripData.mo34421j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || this.minRadiusMeters != mVMultiModalTripData.minRadiusMeters) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVMultiModalTripData mVMultiModalTripData = (MVMultiModalTripData) obj;
        if (!getClass().equals(mVMultiModalTripData.getClass())) {
            return getClass().getName().compareTo(mVMultiModalTripData.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34416f()).compareTo(Boolean.valueOf(mVMultiModalTripData.mo34416f()));
        if (compareTo != 0 || ((mo34416f() && (compareTo = this.carLeg.compareTo(mVMultiModalTripData.carLeg)) != 0) || (compareTo = Boolean.valueOf(mo34417g()).compareTo(Boolean.valueOf(mVMultiModalTripData.mo34417g()))) != 0 || ((mo34417g() && (compareTo = C25082a.m62848l(this.isParkingRequired, mVMultiModalTripData.isParkingRequired)) != 0) || (compareTo = Boolean.valueOf(mo34418h()).compareTo(Boolean.valueOf(mVMultiModalTripData.mo34418h()))) != 0 || ((mo34418h() && (compareTo = C25082a.m62839c(this.maxRadiusMeters, mVMultiModalTripData.maxRadiusMeters)) != 0) || (compareTo = Boolean.valueOf(mo34420i()).compareTo(Boolean.valueOf(mVMultiModalTripData.mo34420i()))) != 0 || ((mo34420i() && (compareTo = C25082a.m62839c(this.maxStops, mVMultiModalTripData.maxStops)) != 0) || (compareTo = Boolean.valueOf(mo34421j()).compareTo(Boolean.valueOf(mVMultiModalTripData.mo34421j()))) != 0))))) {
            return compareTo;
        }
        if (!mo34421j() || (c = C25082a.m62839c(this.minRadiusMeters, mVMultiModalTripData.minRadiusMeters)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMultiModalTripData)) {
            return mo34413a((MVMultiModalTripData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34416f() {
        return this.carLeg != null;
    }

    /* renamed from: g */
    public final boolean mo34417g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34418h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34420i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo34421j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final void mo34422k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo34423l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo34424m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo34425o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMultiModalTripData(", "carLeg:");
        MVMultiModalCarLeg mVMultiModalCarLeg = this.carLeg;
        if (mVMultiModalCarLeg == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMultiModalCarLeg);
        }
        n.append(", ");
        n.append("isParkingRequired:");
        n.append(this.isParkingRequired);
        if (mo34418h()) {
            n.append(", ");
            n.append("maxRadiusMeters:");
            n.append(this.maxRadiusMeters);
        }
        if (mo34420i()) {
            n.append(", ");
            n.append("maxStops:");
            n.append(this.maxStops);
        }
        if (mo34421j()) {
            n.append(", ");
            n.append("minRadiusMeters:");
            n.append(this.minRadiusMeters);
        }
        n.append(")");
        return n.toString();
    }
}
