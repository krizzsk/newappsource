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

public class MVClockOffset implements TBase<MVClockOffset, _Fields>, Serializable, Cloneable, Comparable<MVClockOffset> {

    /* renamed from: b */
    public static final C25113c f25355b = new C25113c("offset", (byte) 4, 1);

    /* renamed from: c */
    public static final C25113c f25356c = new C25113c("roundTrip", (byte) 4, 2);

    /* renamed from: d */
    public static final C25113c f25357d = new C25113c("serverIp", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25358e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25359f;
    private byte __isset_bitfield = 0;
    public double offset;
    private _Fields[] optionals = {_Fields.ROUND_TRIP};
    public double roundTrip;
    public String serverIp;

    public enum _Fields implements C25085c {
        OFFSET(1, "offset"),
        ROUND_TRIP(2, "roundTrip"),
        SERVER_IP(3, "serverIp");
        
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
                return OFFSET;
            }
            if (i == 2) {
                return ROUND_TRIP;
            }
            if (i != 3) {
                return null;
            }
            return SERVER_IP;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVClockOffset$a */
    public static class C8561a extends C25239c<MVClockOffset> {
        public C8561a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClockOffset mVClockOffset = (MVClockOffset) tBase;
            mVClockOffset.getClass();
            C25113c cVar = MVClockOffset.f25355b;
            gVar.mo61687K();
            gVar.mo61711x(MVClockOffset.f25355b);
            gVar.mo61710w(mVClockOffset.offset);
            gVar.mo61712y();
            if (mVClockOffset.mo26777g()) {
                gVar.mo61711x(MVClockOffset.f25356c);
                gVar.mo61710w(mVClockOffset.roundTrip);
                gVar.mo61712y();
            }
            if (mVClockOffset.serverIp != null) {
                gVar.mo61711x(MVClockOffset.f25357d);
                gVar.mo61686J(mVClockOffset.serverIp);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClockOffset mVClockOffset = (MVClockOffset) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVClockOffset.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVClockOffset.serverIp = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 4) {
                        mVClockOffset.roundTrip = gVar.mo61692e();
                        mVClockOffset.mo26781j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 4) {
                    mVClockOffset.offset = gVar.mo61692e();
                    mVClockOffset.mo26780i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVClockOffset$b */
    public static class C8562b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8561a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVClockOffset$c */
    public static class C8563c extends C25240d<MVClockOffset> {
        public C8563c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClockOffset mVClockOffset = (MVClockOffset) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVClockOffset.mo26776f()) {
                bitSet.set(0);
            }
            if (mVClockOffset.mo26777g()) {
                bitSet.set(1);
            }
            if (mVClockOffset.mo26778h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVClockOffset.mo26776f()) {
                jVar.mo61710w(mVClockOffset.offset);
            }
            if (mVClockOffset.mo26777g()) {
                jVar.mo61710w(mVClockOffset.roundTrip);
            }
            if (mVClockOffset.mo26778h()) {
                jVar.mo61686J(mVClockOffset.serverIp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClockOffset mVClockOffset = (MVClockOffset) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVClockOffset.offset = jVar.mo61692e();
                mVClockOffset.mo26780i();
            }
            if (T.get(1)) {
                mVClockOffset.roundTrip = jVar.mo61692e();
                mVClockOffset.mo26781j();
            }
            if (T.get(2)) {
                mVClockOffset.serverIp = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVClockOffset$d */
    public static class C8564d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8563c(0);
        }
    }

    static {
        new C17394d0("MVClockOffset");
        HashMap hashMap = new HashMap();
        f25358e = hashMap;
        hashMap.put(C25239c.class, new C8562b());
        hashMap.put(C25240d.class, new C8564d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OFFSET, new FieldMetaData("offset", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.ROUND_TRIP, new FieldMetaData("roundTrip", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.SERVER_IP, new FieldMetaData("serverIp", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25359f = unmodifiableMap;
        FieldMetaData.m61947a(MVClockOffset.class, unmodifiableMap);
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
        ((C25238b) f25358e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25358e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVClockOffset mVClockOffset = (MVClockOffset) obj;
        if (!getClass().equals(mVClockOffset.getClass())) {
            return getClass().getName().compareTo(mVClockOffset.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26776f()).compareTo(Boolean.valueOf(mVClockOffset.mo26776f()));
        if (compareTo2 != 0 || ((mo26776f() && (compareTo2 = C25082a.m62838b(this.offset, mVClockOffset.offset)) != 0) || (compareTo2 = Boolean.valueOf(mo26777g()).compareTo(Boolean.valueOf(mVClockOffset.mo26777g()))) != 0 || ((mo26777g() && (compareTo2 = C25082a.m62838b(this.roundTrip, mVClockOffset.roundTrip)) != 0) || (compareTo2 = Boolean.valueOf(mo26778h()).compareTo(Boolean.valueOf(mVClockOffset.mo26778h()))) != 0))) {
            return compareTo2;
        }
        if (!mo26778h() || (compareTo = this.serverIp.compareTo(mVClockOffset.serverIp)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVClockOffset)) {
            return false;
        }
        MVClockOffset mVClockOffset = (MVClockOffset) obj;
        if (this.offset != mVClockOffset.offset) {
            return false;
        }
        boolean g = mo26777g();
        boolean g2 = mVClockOffset.mo26777g();
        if ((g || g2) && (!g || !g2 || this.roundTrip != mVClockOffset.roundTrip)) {
            return false;
        }
        boolean h = mo26778h();
        boolean h2 = mVClockOffset.mo26778h();
        if ((h || h2) && (!h || !h2 || !this.serverIp.equals(mVClockOffset.serverIp))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26776f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26777g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo26778h() {
        return this.serverIp != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26780i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo26781j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVClockOffset(", "offset:");
        n.append(this.offset);
        if (mo26777g()) {
            n.append(", ");
            n.append("roundTrip:");
            n.append(this.roundTrip);
        }
        n.append(", ");
        n.append("serverIp:");
        String str = this.serverIp;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
