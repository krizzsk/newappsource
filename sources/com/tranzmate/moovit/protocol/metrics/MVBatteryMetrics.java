package com.tranzmate.moovit.protocol.metrics;

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

public class MVBatteryMetrics implements TBase<MVBatteryMetrics, _Fields>, Serializable, Cloneable, Comparable<MVBatteryMetrics> {

    /* renamed from: b */
    public static final C25113c f26365b = new C25113c("isCharging", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f26366c = new C25113c("chargePlugType", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26367d = new C25113c("level", (byte) 4, 3);

    /* renamed from: e */
    public static final C25113c f26368e = new C25113c("voltage", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26369f = new C25113c("capacity", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f26370g = new C25113c("chargeCounter", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f26371h = new C25113c("currentAverage", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f26372i = new C25113c("currentNow", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f26373j = new C25113c("energyCounter", (byte) 8, 9);

    /* renamed from: k */
    public static final HashMap f26374k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f26375l;
    private byte __isset_bitfield = 0;
    public int capacity;
    public int chargeCounter;
    public String chargePlugType;
    public int currentAverage;
    public int currentNow;
    public int energyCounter;
    public boolean isCharging;
    public double level;
    private _Fields[] optionals = {_Fields.CAPACITY, _Fields.CHARGE_COUNTER, _Fields.CURRENT_AVERAGE, _Fields.CURRENT_NOW, _Fields.ENERGY_COUNTER};
    public int voltage;

    public enum _Fields implements C25085c {
        IS_CHARGING(1, "isCharging"),
        CHARGE_PLUG_TYPE(2, "chargePlugType"),
        LEVEL(3, "level"),
        VOLTAGE(4, "voltage"),
        CAPACITY(5, "capacity"),
        CHARGE_COUNTER(6, "chargeCounter"),
        CURRENT_AVERAGE(7, "currentAverage"),
        CURRENT_NOW(8, "currentNow"),
        ENERGY_COUNTER(9, "energyCounter");
        
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
                    return IS_CHARGING;
                case 2:
                    return CHARGE_PLUG_TYPE;
                case 3:
                    return LEVEL;
                case 4:
                    return VOLTAGE;
                case 5:
                    return CAPACITY;
                case 6:
                    return CHARGE_COUNTER;
                case 7:
                    return CURRENT_AVERAGE;
                case 8:
                    return CURRENT_NOW;
                case 9:
                    return ENERGY_COUNTER;
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVBatteryMetrics$a */
    public static class C9126a extends C25239c<MVBatteryMetrics> {
        public C9126a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBatteryMetrics mVBatteryMetrics = (MVBatteryMetrics) tBase;
            mVBatteryMetrics.getClass();
            C25113c cVar = MVBatteryMetrics.f26365b;
            gVar.mo61687K();
            gVar.mo61711x(MVBatteryMetrics.f26365b);
            gVar.mo61708u(mVBatteryMetrics.isCharging);
            gVar.mo61712y();
            if (mVBatteryMetrics.chargePlugType != null) {
                gVar.mo61711x(MVBatteryMetrics.f26366c);
                gVar.mo61686J(mVBatteryMetrics.chargePlugType);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVBatteryMetrics.f26367d);
            gVar.mo61710w(mVBatteryMetrics.level);
            gVar.mo61712y();
            gVar.mo61711x(MVBatteryMetrics.f26368e);
            gVar.mo61678B(mVBatteryMetrics.voltage);
            gVar.mo61712y();
            if (mVBatteryMetrics.mo28410f()) {
                gVar.mo61711x(MVBatteryMetrics.f26369f);
                gVar.mo61678B(mVBatteryMetrics.capacity);
                gVar.mo61712y();
            }
            if (mVBatteryMetrics.mo28411g()) {
                gVar.mo61711x(MVBatteryMetrics.f26370g);
                gVar.mo61678B(mVBatteryMetrics.chargeCounter);
                gVar.mo61712y();
            }
            if (mVBatteryMetrics.mo28414i()) {
                gVar.mo61711x(MVBatteryMetrics.f26371h);
                gVar.mo61678B(mVBatteryMetrics.currentAverage);
                gVar.mo61712y();
            }
            if (mVBatteryMetrics.mo28415j()) {
                gVar.mo61711x(MVBatteryMetrics.f26372i);
                gVar.mo61678B(mVBatteryMetrics.currentNow);
                gVar.mo61712y();
            }
            if (mVBatteryMetrics.mo28416k()) {
                gVar.mo61711x(MVBatteryMetrics.f26373j);
                gVar.mo61678B(mVBatteryMetrics.energyCounter);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBatteryMetrics mVBatteryMetrics = (MVBatteryMetrics) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBatteryMetrics.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.isCharging = gVar.mo61690c();
                            mVBatteryMetrics.mo28426u();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.chargePlugType = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.level = gVar.mo61692e();
                            mVBatteryMetrics.mo28427v();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.voltage = gVar.mo61696i();
                            mVBatteryMetrics.mo28428w();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.capacity = gVar.mo61696i();
                            mVBatteryMetrics.mo28420p();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.chargeCounter = gVar.mo61696i();
                            mVBatteryMetrics.mo28421q();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.currentAverage = gVar.mo61696i();
                            mVBatteryMetrics.mo28422r();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.currentNow = gVar.mo61696i();
                            mVBatteryMetrics.mo28423s();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBatteryMetrics.energyCounter = gVar.mo61696i();
                            mVBatteryMetrics.mo28424t();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVBatteryMetrics$b */
    public static class C9127b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9126a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVBatteryMetrics$c */
    public static class C9128c extends C25240d<MVBatteryMetrics> {
        public C9128c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBatteryMetrics mVBatteryMetrics = (MVBatteryMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBatteryMetrics.mo28417l()) {
                bitSet.set(0);
            }
            if (mVBatteryMetrics.mo28412h()) {
                bitSet.set(1);
            }
            if (mVBatteryMetrics.mo28418m()) {
                bitSet.set(2);
            }
            if (mVBatteryMetrics.mo28419o()) {
                bitSet.set(3);
            }
            if (mVBatteryMetrics.mo28410f()) {
                bitSet.set(4);
            }
            if (mVBatteryMetrics.mo28411g()) {
                bitSet.set(5);
            }
            if (mVBatteryMetrics.mo28414i()) {
                bitSet.set(6);
            }
            if (mVBatteryMetrics.mo28415j()) {
                bitSet.set(7);
            }
            if (mVBatteryMetrics.mo28416k()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVBatteryMetrics.mo28417l()) {
                jVar.mo61708u(mVBatteryMetrics.isCharging);
            }
            if (mVBatteryMetrics.mo28412h()) {
                jVar.mo61686J(mVBatteryMetrics.chargePlugType);
            }
            if (mVBatteryMetrics.mo28418m()) {
                jVar.mo61710w(mVBatteryMetrics.level);
            }
            if (mVBatteryMetrics.mo28419o()) {
                jVar.mo61678B(mVBatteryMetrics.voltage);
            }
            if (mVBatteryMetrics.mo28410f()) {
                jVar.mo61678B(mVBatteryMetrics.capacity);
            }
            if (mVBatteryMetrics.mo28411g()) {
                jVar.mo61678B(mVBatteryMetrics.chargeCounter);
            }
            if (mVBatteryMetrics.mo28414i()) {
                jVar.mo61678B(mVBatteryMetrics.currentAverage);
            }
            if (mVBatteryMetrics.mo28415j()) {
                jVar.mo61678B(mVBatteryMetrics.currentNow);
            }
            if (mVBatteryMetrics.mo28416k()) {
                jVar.mo61678B(mVBatteryMetrics.energyCounter);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBatteryMetrics mVBatteryMetrics = (MVBatteryMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVBatteryMetrics.isCharging = jVar.mo61690c();
                mVBatteryMetrics.mo28426u();
            }
            if (T.get(1)) {
                mVBatteryMetrics.chargePlugType = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVBatteryMetrics.level = jVar.mo61692e();
                mVBatteryMetrics.mo28427v();
            }
            if (T.get(3)) {
                mVBatteryMetrics.voltage = jVar.mo61696i();
                mVBatteryMetrics.mo28428w();
            }
            if (T.get(4)) {
                mVBatteryMetrics.capacity = jVar.mo61696i();
                mVBatteryMetrics.mo28420p();
            }
            if (T.get(5)) {
                mVBatteryMetrics.chargeCounter = jVar.mo61696i();
                mVBatteryMetrics.mo28421q();
            }
            if (T.get(6)) {
                mVBatteryMetrics.currentAverage = jVar.mo61696i();
                mVBatteryMetrics.mo28422r();
            }
            if (T.get(7)) {
                mVBatteryMetrics.currentNow = jVar.mo61696i();
                mVBatteryMetrics.mo28423s();
            }
            if (T.get(8)) {
                mVBatteryMetrics.energyCounter = jVar.mo61696i();
                mVBatteryMetrics.mo28424t();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVBatteryMetrics$d */
    public static class C9129d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9128c(0);
        }
    }

    static {
        new C17394d0("MVBatteryMetrics");
        HashMap hashMap = new HashMap();
        f26374k = hashMap;
        hashMap.put(C25239c.class, new C9127b());
        hashMap.put(C25240d.class, new C9129d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_CHARGING, new FieldMetaData("isCharging", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CHARGE_PLUG_TYPE, new FieldMetaData("chargePlugType", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEVEL, new FieldMetaData("level", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.VOLTAGE, new FieldMetaData("voltage", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CAPACITY, new FieldMetaData("capacity", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CHARGE_COUNTER, new FieldMetaData("chargeCounter", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CURRENT_AVERAGE, new FieldMetaData("currentAverage", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CURRENT_NOW, new FieldMetaData("currentNow", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ENERGY_COUNTER, new FieldMetaData("energyCounter", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26375l = unmodifiableMap;
        FieldMetaData.m61947a(MVBatteryMetrics.class, unmodifiableMap);
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
        ((C25238b) f26374k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26374k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28407a(MVBatteryMetrics mVBatteryMetrics) {
        if (mVBatteryMetrics == null || this.isCharging != mVBatteryMetrics.isCharging) {
            return false;
        }
        boolean h = mo28412h();
        boolean h2 = mVBatteryMetrics.mo28412h();
        if (((h || h2) && (!h || !h2 || !this.chargePlugType.equals(mVBatteryMetrics.chargePlugType))) || this.level != mVBatteryMetrics.level || this.voltage != mVBatteryMetrics.voltage) {
            return false;
        }
        boolean f = mo28410f();
        boolean f2 = mVBatteryMetrics.mo28410f();
        if ((f || f2) && (!f || !f2 || this.capacity != mVBatteryMetrics.capacity)) {
            return false;
        }
        boolean g = mo28411g();
        boolean g2 = mVBatteryMetrics.mo28411g();
        if ((g || g2) && (!g || !g2 || this.chargeCounter != mVBatteryMetrics.chargeCounter)) {
            return false;
        }
        boolean i = mo28414i();
        boolean i2 = mVBatteryMetrics.mo28414i();
        if ((i || i2) && (!i || !i2 || this.currentAverage != mVBatteryMetrics.currentAverage)) {
            return false;
        }
        boolean j = mo28415j();
        boolean j2 = mVBatteryMetrics.mo28415j();
        if ((j || j2) && (!j || !j2 || this.currentNow != mVBatteryMetrics.currentNow)) {
            return false;
        }
        boolean k = mo28416k();
        boolean k2 = mVBatteryMetrics.mo28416k();
        if (!k && !k2) {
            return true;
        }
        if (!k || !k2 || this.energyCounter != mVBatteryMetrics.energyCounter) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVBatteryMetrics mVBatteryMetrics = (MVBatteryMetrics) obj;
        if (!getClass().equals(mVBatteryMetrics.getClass())) {
            return getClass().getName().compareTo(mVBatteryMetrics.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28417l()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28417l()));
        if (compareTo != 0 || ((mo28417l() && (compareTo = C25082a.m62848l(this.isCharging, mVBatteryMetrics.isCharging)) != 0) || (compareTo = Boolean.valueOf(mo28412h()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28412h()))) != 0 || ((mo28412h() && (compareTo = this.chargePlugType.compareTo(mVBatteryMetrics.chargePlugType)) != 0) || (compareTo = Boolean.valueOf(mo28418m()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28418m()))) != 0 || ((mo28418m() && (compareTo = C25082a.m62838b(this.level, mVBatteryMetrics.level)) != 0) || (compareTo = Boolean.valueOf(mo28419o()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28419o()))) != 0 || ((mo28419o() && (compareTo = C25082a.m62839c(this.voltage, mVBatteryMetrics.voltage)) != 0) || (compareTo = Boolean.valueOf(mo28410f()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28410f()))) != 0 || ((mo28410f() && (compareTo = C25082a.m62839c(this.capacity, mVBatteryMetrics.capacity)) != 0) || (compareTo = Boolean.valueOf(mo28411g()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28411g()))) != 0 || ((mo28411g() && (compareTo = C25082a.m62839c(this.chargeCounter, mVBatteryMetrics.chargeCounter)) != 0) || (compareTo = Boolean.valueOf(mo28414i()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28414i()))) != 0 || ((mo28414i() && (compareTo = C25082a.m62839c(this.currentAverage, mVBatteryMetrics.currentAverage)) != 0) || (compareTo = Boolean.valueOf(mo28415j()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28415j()))) != 0 || ((mo28415j() && (compareTo = C25082a.m62839c(this.currentNow, mVBatteryMetrics.currentNow)) != 0) || (compareTo = Boolean.valueOf(mo28416k()).compareTo(Boolean.valueOf(mVBatteryMetrics.mo28416k()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo28416k() || (c = C25082a.m62839c(this.energyCounter, mVBatteryMetrics.energyCounter)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVBatteryMetrics)) {
            return mo28407a((MVBatteryMetrics) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28410f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo28411g() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: h */
    public final boolean mo28412h() {
        return this.chargePlugType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28414i() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: j */
    public final boolean mo28415j() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: k */
    public final boolean mo28416k() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: l */
    public final boolean mo28417l() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: m */
    public final boolean mo28418m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo28419o() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: p */
    public final void mo28420p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo28421q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: r */
    public final void mo28422r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: s */
    public final void mo28423s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: t */
    public final void mo28424t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBatteryMetrics(", "isCharging:");
        C13555b.m33977q(n, this.isCharging, ", ", "chargePlugType:");
        String str = this.chargePlugType;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("level:");
        C16759e.m42355k(n, this.level, ", ", "voltage:");
        n.append(this.voltage);
        if (mo28410f()) {
            n.append(", ");
            n.append("capacity:");
            n.append(this.capacity);
        }
        if (mo28411g()) {
            n.append(", ");
            n.append("chargeCounter:");
            n.append(this.chargeCounter);
        }
        if (mo28414i()) {
            n.append(", ");
            n.append("currentAverage:");
            n.append(this.currentAverage);
        }
        if (mo28415j()) {
            n.append(", ");
            n.append("currentNow:");
            n.append(this.currentNow);
        }
        if (mo28416k()) {
            n.append(", ");
            n.append("energyCounter:");
            n.append(this.energyCounter);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo28426u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: v */
    public final void mo28427v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: w */
    public final void mo28428w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }
}
