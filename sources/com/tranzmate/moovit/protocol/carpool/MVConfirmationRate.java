package com.tranzmate.moovit.protocol.carpool;

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

public class MVConfirmationRate implements TBase<MVConfirmationRate, _Fields>, Serializable, Cloneable, Comparable<MVConfirmationRate> {

    /* renamed from: b */
    public static final C25113c f24689b = new C25113c("responseRate", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24690c = new C25113c("approvalRate", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24691d = new C25113c("responseTime", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f24692e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24693f;
    private byte __isset_bitfield = 0;
    public int approvalRate;
    public int responseRate;
    public int responseTime;

    public enum _Fields implements C25085c {
        RESPONSE_RATE(1, "responseRate"),
        APPROVAL_RATE(2, "approvalRate"),
        RESPONSE_TIME(3, "responseTime");
        
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
                return RESPONSE_RATE;
            }
            if (i == 2) {
                return APPROVAL_RATE;
            }
            if (i != 3) {
                return null;
            }
            return RESPONSE_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVConfirmationRate$a */
    public static class C8194a extends C25239c<MVConfirmationRate> {
        public C8194a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConfirmationRate mVConfirmationRate = (MVConfirmationRate) tBase;
            mVConfirmationRate.getClass();
            C25113c cVar = MVConfirmationRate.f24689b;
            gVar.mo61687K();
            gVar.mo61711x(MVConfirmationRate.f24689b);
            gVar.mo61678B(mVConfirmationRate.responseRate);
            gVar.mo61712y();
            gVar.mo61711x(MVConfirmationRate.f24690c);
            gVar.mo61678B(mVConfirmationRate.approvalRate);
            gVar.mo61712y();
            gVar.mo61711x(MVConfirmationRate.f24691d);
            C16530d.m42020n(gVar, mVConfirmationRate.responseTime);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConfirmationRate mVConfirmationRate = (MVConfirmationRate) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVConfirmationRate.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVConfirmationRate.responseTime = gVar.mo61696i();
                            mVConfirmationRate.mo25569k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVConfirmationRate.approvalRate = gVar.mo61696i();
                        mVConfirmationRate.mo25567i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVConfirmationRate.responseRate = gVar.mo61696i();
                    mVConfirmationRate.mo25568j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVConfirmationRate$b */
    public static class C8195b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8194a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVConfirmationRate$c */
    public static class C8196c extends C25240d<MVConfirmationRate> {
        public C8196c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConfirmationRate mVConfirmationRate = (MVConfirmationRate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVConfirmationRate.mo25564g()) {
                bitSet.set(0);
            }
            if (mVConfirmationRate.mo25563f()) {
                bitSet.set(1);
            }
            if (mVConfirmationRate.mo25565h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVConfirmationRate.mo25564g()) {
                jVar.mo61678B(mVConfirmationRate.responseRate);
            }
            if (mVConfirmationRate.mo25563f()) {
                jVar.mo61678B(mVConfirmationRate.approvalRate);
            }
            if (mVConfirmationRate.mo25565h()) {
                jVar.mo61678B(mVConfirmationRate.responseTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConfirmationRate mVConfirmationRate = (MVConfirmationRate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVConfirmationRate.responseRate = jVar.mo61696i();
                mVConfirmationRate.mo25568j();
            }
            if (T.get(1)) {
                mVConfirmationRate.approvalRate = jVar.mo61696i();
                mVConfirmationRate.mo25567i();
            }
            if (T.get(2)) {
                mVConfirmationRate.responseTime = jVar.mo61696i();
                mVConfirmationRate.mo25569k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVConfirmationRate$d */
    public static class C8197d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8196c(0);
        }
    }

    static {
        new C17394d0("MVConfirmationRate");
        HashMap hashMap = new HashMap();
        f24692e = hashMap;
        hashMap.put(C25239c.class, new C8195b());
        hashMap.put(C25240d.class, new C8197d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RESPONSE_RATE, new FieldMetaData("responseRate", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.APPROVAL_RATE, new FieldMetaData("approvalRate", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RESPONSE_TIME, new FieldMetaData("responseTime", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24693f = unmodifiableMap;
        FieldMetaData.m61947a(MVConfirmationRate.class, unmodifiableMap);
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
        ((C25238b) f24692e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24692e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVConfirmationRate mVConfirmationRate = (MVConfirmationRate) obj;
        if (!getClass().equals(mVConfirmationRate.getClass())) {
            return getClass().getName().compareTo(mVConfirmationRate.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25564g()).compareTo(Boolean.valueOf(mVConfirmationRate.mo25564g()));
        if (compareTo != 0 || ((mo25564g() && (compareTo = C25082a.m62839c(this.responseRate, mVConfirmationRate.responseRate)) != 0) || (compareTo = Boolean.valueOf(mo25563f()).compareTo(Boolean.valueOf(mVConfirmationRate.mo25563f()))) != 0 || ((mo25563f() && (compareTo = C25082a.m62839c(this.approvalRate, mVConfirmationRate.approvalRate)) != 0) || (compareTo = Boolean.valueOf(mo25565h()).compareTo(Boolean.valueOf(mVConfirmationRate.mo25565h()))) != 0))) {
            return compareTo;
        }
        if (!mo25565h() || (c = C25082a.m62839c(this.responseTime, mVConfirmationRate.responseTime)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVConfirmationRate)) {
            return false;
        }
        MVConfirmationRate mVConfirmationRate = (MVConfirmationRate) obj;
        if (this.responseRate == mVConfirmationRate.responseRate && this.approvalRate == mVConfirmationRate.approvalRate && this.responseTime == mVConfirmationRate.responseTime) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25563f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo25564g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo25565h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25567i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: j */
    public final void mo25568j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo25569k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVConfirmationRate(", "responseRate:");
        C0016g.m42z(n, this.responseRate, ", ", "approvalRate:");
        C0016g.m42z(n, this.approvalRate, ", ", "responseTime:");
        return C13437d.m33707l(n, this.responseTime, ")");
    }
}
