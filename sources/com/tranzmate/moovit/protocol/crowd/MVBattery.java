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

public class MVBattery implements TBase<MVBattery, _Fields>, Serializable, Cloneable, Comparable<MVBattery> {

    /* renamed from: b */
    public static final C25113c f25321b = new C25113c("level", (byte) 4, 1);

    /* renamed from: c */
    public static final C25113c f25322c = new C25113c("state", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f25323d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25324e;
    private byte __isset_bitfield = 0;
    public double level;
    public MVBatteryState state;

    public enum _Fields implements C25085c {
        LEVEL(1, "level"),
        STATE(2, "state");
        
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
            if (i != 2) {
                return null;
            }
            return STATE;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBattery$a */
    public static class C8537a extends C25239c<MVBattery> {
        public C8537a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBattery mVBattery = (MVBattery) tBase;
            mVBattery.getClass();
            C25113c cVar = MVBattery.f25321b;
            gVar.mo61687K();
            gVar.mo61711x(MVBattery.f25321b);
            gVar.mo61710w(mVBattery.level);
            gVar.mo61712y();
            if (mVBattery.state != null) {
                gVar.mo61711x(MVBattery.f25322c);
                gVar.mo61678B(mVBattery.state.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBattery mVBattery = (MVBattery) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBattery.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVBattery.state = MVBatteryState.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 4) {
                    mVBattery.level = gVar.mo61692e();
                    mVBattery.mo26715h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBattery$b */
    public static class C8538b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8537a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBattery$c */
    public static class C8539c extends C25240d<MVBattery> {
        public C8539c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBattery mVBattery = (MVBattery) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBattery.mo26713f()) {
                bitSet.set(0);
            }
            if (mVBattery.mo26714g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVBattery.mo26713f()) {
                jVar.mo61710w(mVBattery.level);
            }
            if (mVBattery.mo26714g()) {
                jVar.mo61678B(mVBattery.state.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBattery mVBattery = (MVBattery) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVBattery.level = jVar.mo61692e();
                mVBattery.mo26715h();
            }
            if (T.get(1)) {
                mVBattery.state = MVBatteryState.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBattery$d */
    public static class C8540d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8539c(0);
        }
    }

    static {
        new C17394d0("MVBattery");
        HashMap hashMap = new HashMap();
        f25323d = hashMap;
        hashMap.put(C25239c.class, new C8538b());
        hashMap.put(C25240d.class, new C8540d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LEVEL, new FieldMetaData("level", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.STATE, new FieldMetaData("state", (byte) 3, new EnumMetaData(MVBatteryState.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25324e = unmodifiableMap;
        FieldMetaData.m61947a(MVBattery.class, unmodifiableMap);
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
        ((C25238b) f25323d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25323d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBattery mVBattery = (MVBattery) obj;
        if (!getClass().equals(mVBattery.getClass())) {
            return getClass().getName().compareTo(mVBattery.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26713f()).compareTo(Boolean.valueOf(mVBattery.mo26713f()));
        if (compareTo2 != 0 || ((mo26713f() && (compareTo2 = C25082a.m62838b(this.level, mVBattery.level)) != 0) || (compareTo2 = Boolean.valueOf(mo26714g()).compareTo(Boolean.valueOf(mVBattery.mo26714g()))) != 0)) {
            return compareTo2;
        }
        if (!mo26714g() || (compareTo = this.state.compareTo(mVBattery.state)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBattery)) {
            return false;
        }
        MVBattery mVBattery = (MVBattery) obj;
        if (this.level != mVBattery.level) {
            return false;
        }
        boolean g = mo26714g();
        boolean g2 = mVBattery.mo26714g();
        if ((g || g2) && (!g || !g2 || !this.state.equals(mVBattery.state))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26713f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26714g() {
        return this.state != null;
    }

    /* renamed from: h */
    public final void mo26715h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBattery(", "level:");
        C16759e.m42355k(n, this.level, ", ", "state:");
        MVBatteryState mVBatteryState = this.state;
        if (mVBatteryState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVBatteryState);
        }
        n.append(")");
        return n.toString();
    }
}
