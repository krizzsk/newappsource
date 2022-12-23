package com.tranzmate.moovit.protocol.crowd;

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

public class MVPowerSource implements TBase<MVPowerSource, _Fields>, Serializable, Cloneable, Comparable<MVPowerSource> {

    /* renamed from: b */
    public static final C25113c f25398b = new C25113c("level", (byte) 4, 1);

    /* renamed from: c */
    public static final C25113c f25399c = new C25113c("state", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25400d = new C25113c("powerSourceType", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25401e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25402f;
    private byte __isset_bitfield = 0;
    public double level;
    public MVPowerSourceType powerSourceType;
    public MVBatteryState state;

    public enum _Fields implements C25085c {
        LEVEL(1, "level"),
        STATE(2, "state"),
        POWER_SOURCE_TYPE(3, "powerSourceType");
        
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
                return LEVEL;
            }
            if (i == 2) {
                return STATE;
            }
            if (i != 3) {
                return null;
            }
            return POWER_SOURCE_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVPowerSource$a */
    public static class C8586a extends C25239c<MVPowerSource> {
        public C8586a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPowerSource mVPowerSource = (MVPowerSource) tBase;
            mVPowerSource.getClass();
            C25113c cVar = MVPowerSource.f25398b;
            gVar.mo61687K();
            gVar.mo61711x(MVPowerSource.f25398b);
            gVar.mo61710w(mVPowerSource.level);
            gVar.mo61712y();
            if (mVPowerSource.state != null) {
                gVar.mo61711x(MVPowerSource.f25399c);
                gVar.mo61678B(mVPowerSource.state.getValue());
                gVar.mo61712y();
            }
            if (mVPowerSource.powerSourceType != null) {
                gVar.mo61711x(MVPowerSource.f25400d);
                gVar.mo61678B(mVPowerSource.powerSourceType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPowerSource mVPowerSource = (MVPowerSource) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPowerSource.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVPowerSource.powerSourceType = MVPowerSourceType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVPowerSource.state = MVBatteryState.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 4) {
                    mVPowerSource.level = gVar.mo61692e();
                    mVPowerSource.mo26854i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVPowerSource$b */
    public static class C8587b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8586a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVPowerSource$c */
    public static class C8588c extends C25240d<MVPowerSource> {
        public C8588c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPowerSource mVPowerSource = (MVPowerSource) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPowerSource.mo26850f()) {
                bitSet.set(0);
            }
            if (mVPowerSource.mo26852h()) {
                bitSet.set(1);
            }
            if (mVPowerSource.mo26851g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPowerSource.mo26850f()) {
                jVar.mo61710w(mVPowerSource.level);
            }
            if (mVPowerSource.mo26852h()) {
                jVar.mo61678B(mVPowerSource.state.getValue());
            }
            if (mVPowerSource.mo26851g()) {
                jVar.mo61678B(mVPowerSource.powerSourceType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPowerSource mVPowerSource = (MVPowerSource) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPowerSource.level = jVar.mo61692e();
                mVPowerSource.mo26854i();
            }
            if (T.get(1)) {
                mVPowerSource.state = MVBatteryState.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVPowerSource.powerSourceType = MVPowerSourceType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVPowerSource$d */
    public static class C8589d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8588c(0);
        }
    }

    static {
        new C17394d0("MVPowerSource");
        HashMap hashMap = new HashMap();
        f25401e = hashMap;
        hashMap.put(C25239c.class, new C8587b());
        hashMap.put(C25240d.class, new C8589d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LEVEL, new FieldMetaData("level", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.STATE, new FieldMetaData("state", (byte) 3, new EnumMetaData(MVBatteryState.class)));
        enumMap.put(_Fields.POWER_SOURCE_TYPE, new FieldMetaData("powerSourceType", (byte) 3, new EnumMetaData(MVPowerSourceType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25402f = unmodifiableMap;
        FieldMetaData.m61947a(MVPowerSource.class, unmodifiableMap);
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
        ((C25238b) f25401e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25401e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPowerSource mVPowerSource = (MVPowerSource) obj;
        if (!getClass().equals(mVPowerSource.getClass())) {
            return getClass().getName().compareTo(mVPowerSource.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26850f()).compareTo(Boolean.valueOf(mVPowerSource.mo26850f()));
        if (compareTo2 != 0 || ((mo26850f() && (compareTo2 = C25082a.m62838b(this.level, mVPowerSource.level)) != 0) || (compareTo2 = Boolean.valueOf(mo26852h()).compareTo(Boolean.valueOf(mVPowerSource.mo26852h()))) != 0 || ((mo26852h() && (compareTo2 = this.state.compareTo(mVPowerSource.state)) != 0) || (compareTo2 = Boolean.valueOf(mo26851g()).compareTo(Boolean.valueOf(mVPowerSource.mo26851g()))) != 0))) {
            return compareTo2;
        }
        if (!mo26851g() || (compareTo = this.powerSourceType.compareTo(mVPowerSource.powerSourceType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPowerSource)) {
            return false;
        }
        MVPowerSource mVPowerSource = (MVPowerSource) obj;
        if (this.level != mVPowerSource.level) {
            return false;
        }
        boolean h = mo26852h();
        boolean h2 = mVPowerSource.mo26852h();
        if ((h || h2) && (!h || !h2 || !this.state.equals(mVPowerSource.state))) {
            return false;
        }
        boolean g = mo26851g();
        boolean g2 = mVPowerSource.mo26851g();
        if ((g || g2) && (!g || !g2 || !this.powerSourceType.equals(mVPowerSource.powerSourceType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26850f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26851g() {
        return this.powerSourceType != null;
    }

    /* renamed from: h */
    public final boolean mo26852h() {
        return this.state != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26854i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPowerSource(", "level:");
        C16759e.m42355k(n, this.level, ", ", "state:");
        MVBatteryState mVBatteryState = this.state;
        if (mVBatteryState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVBatteryState);
        }
        n.append(", ");
        n.append("powerSourceType:");
        MVPowerSourceType mVPowerSourceType = this.powerSourceType;
        if (mVPowerSourceType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPowerSourceType);
        }
        n.append(")");
        return n.toString();
    }
}
