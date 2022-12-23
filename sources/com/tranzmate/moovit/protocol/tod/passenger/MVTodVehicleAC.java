package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodVehicleAC implements TBase<MVTodVehicleAC, _Fields>, Serializable, Cloneable, Comparable<MVTodVehicleAC> {

    /* renamed from: b */
    public static final C25113c f29653b = new C25113c("enabled", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f29654c = new C25113c("fanLevel", (byte) 3, 2);

    /* renamed from: d */
    public static final C25113c f29655d = new C25113c("temperature", (byte) 4, 3);

    /* renamed from: e */
    public static final HashMap f29656e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29657f;
    private byte __isset_bitfield = 0;
    public boolean enabled;
    public byte fanLevel;
    public double temperature;

    public enum _Fields implements C25085c {
        ENABLED(1, "enabled"),
        FAN_LEVEL(2, "fanLevel"),
        TEMPERATURE(3, "temperature");
        
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
                return ENABLED;
            }
            if (i == 2) {
                return FAN_LEVEL;
            }
            if (i != 3) {
                return null;
            }
            return TEMPERATURE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAC$a */
    public static class C11365a extends C25239c<MVTodVehicleAC> {
        public C11365a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleAC mVTodVehicleAC = (MVTodVehicleAC) tBase;
            mVTodVehicleAC.getClass();
            C25113c cVar = MVTodVehicleAC.f29653b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodVehicleAC.f29653b);
            gVar.mo61708u(mVTodVehicleAC.enabled);
            gVar.mo61712y();
            gVar.mo61711x(MVTodVehicleAC.f29654c);
            gVar.mo61709v(mVTodVehicleAC.fanLevel);
            gVar.mo61712y();
            gVar.mo61711x(MVTodVehicleAC.f29655d);
            gVar.mo61710w(mVTodVehicleAC.temperature);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleAC mVTodVehicleAC = (MVTodVehicleAC) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodVehicleAC.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 4) {
                            mVTodVehicleAC.temperature = gVar.mo61692e();
                            mVTodVehicleAC.mo33869k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 3) {
                        mVTodVehicleAC.fanLevel = gVar.mo61691d();
                        mVTodVehicleAC.mo33868j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVTodVehicleAC.enabled = gVar.mo61690c();
                    mVTodVehicleAC.mo33867i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAC$b */
    public static class C11366b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11365a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAC$c */
    public static class C11367c extends C25240d<MVTodVehicleAC> {
        public C11367c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleAC mVTodVehicleAC = (MVTodVehicleAC) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodVehicleAC.mo33863f()) {
                bitSet.set(0);
            }
            if (mVTodVehicleAC.mo33864g()) {
                bitSet.set(1);
            }
            if (mVTodVehicleAC.mo33865h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodVehicleAC.mo33863f()) {
                jVar.mo61708u(mVTodVehicleAC.enabled);
            }
            if (mVTodVehicleAC.mo33864g()) {
                jVar.mo61716P(mVTodVehicleAC.fanLevel);
            }
            if (mVTodVehicleAC.mo33865h()) {
                jVar.mo61710w(mVTodVehicleAC.temperature);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodVehicleAC mVTodVehicleAC = (MVTodVehicleAC) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodVehicleAC.enabled = jVar.mo61690c();
                mVTodVehicleAC.mo33867i();
            }
            if (T.get(1)) {
                mVTodVehicleAC.fanLevel = jVar.mo61691d();
                mVTodVehicleAC.mo33868j();
            }
            if (T.get(2)) {
                mVTodVehicleAC.temperature = jVar.mo61692e();
                mVTodVehicleAC.mo33869k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAC$d */
    public static class C11368d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11367c(0);
        }
    }

    static {
        new C17394d0("MVTodVehicleAC");
        HashMap hashMap = new HashMap();
        f29656e = hashMap;
        hashMap.put(C25239c.class, new C11366b());
        hashMap.put(C25240d.class, new C11368d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENABLED, new FieldMetaData("enabled", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.FAN_LEVEL, new FieldMetaData("fanLevel", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.TEMPERATURE, new FieldMetaData("temperature", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29657f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodVehicleAC.class, unmodifiableMap);
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
        ((C25238b) f29656e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29656e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33860a(MVTodVehicleAC mVTodVehicleAC) {
        if (mVTodVehicleAC != null && this.enabled == mVTodVehicleAC.enabled && this.fanLevel == mVTodVehicleAC.fanLevel && this.temperature == mVTodVehicleAC.temperature) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int b;
        MVTodVehicleAC mVTodVehicleAC = (MVTodVehicleAC) obj;
        if (!getClass().equals(mVTodVehicleAC.getClass())) {
            return getClass().getName().compareTo(mVTodVehicleAC.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33863f()).compareTo(Boolean.valueOf(mVTodVehicleAC.mo33863f()));
        if (compareTo != 0 || ((mo33863f() && (compareTo = C25082a.m62848l(this.enabled, mVTodVehicleAC.enabled)) != 0) || (compareTo = Boolean.valueOf(mo33864g()).compareTo(Boolean.valueOf(mVTodVehicleAC.mo33864g()))) != 0 || ((mo33864g() && (compareTo = C25082a.m62837a(this.fanLevel, mVTodVehicleAC.fanLevel)) != 0) || (compareTo = Boolean.valueOf(mo33865h()).compareTo(Boolean.valueOf(mVTodVehicleAC.mo33865h()))) != 0))) {
            return compareTo;
        }
        if (!mo33865h() || (b = C25082a.m62838b(this.temperature, mVTodVehicleAC.temperature)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodVehicleAC)) {
            return mo33860a((MVTodVehicleAC) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33863f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33864g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo33865h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33867i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo33868j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo33869k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodVehicleAC(", "enabled:");
        C13555b.m33977q(n, this.enabled, ", ", "fanLevel:");
        C0016g.m42z(n, this.fanLevel, ", ", "temperature:");
        n.append(this.temperature);
        n.append(")");
        return n.toString();
    }
}
