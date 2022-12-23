package com.tranzmate.moovit.protocol.driverconnection;

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

public class MVNotifyDriverRequest implements TBase<MVNotifyDriverRequest, _Fields>, Serializable, Cloneable, Comparable<MVNotifyDriverRequest> {

    /* renamed from: b */
    public static final C25113c f25593b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25594c = new C25113c("lineId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25595d = new C25113c("stopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25596e = new C25113c("tripId", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f25597f = new C25113c("operation", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f25598g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25599h;
    private byte __isset_bitfield = 0;
    public int lineId;
    public MVOperation operation;
    public String paymentContext;
    public int stopId;
    public long tripId;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        LINE_ID(2, "lineId"),
        STOP_ID(3, "stopId"),
        TRIP_ID(4, "tripId"),
        OPERATION(5, "operation");
        
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
                return PAYMENT_CONTEXT;
            }
            if (i == 2) {
                return LINE_ID;
            }
            if (i == 3) {
                return STOP_ID;
            }
            if (i == 4) {
                return TRIP_ID;
            }
            if (i != 5) {
                return null;
            }
            return OPERATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.driverconnection.MVNotifyDriverRequest$a */
    public static class C8703a extends C25239c<MVNotifyDriverRequest> {
        public C8703a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNotifyDriverRequest mVNotifyDriverRequest = (MVNotifyDriverRequest) tBase;
            mVNotifyDriverRequest.getClass();
            C25113c cVar = MVNotifyDriverRequest.f25593b;
            gVar.mo61687K();
            if (mVNotifyDriverRequest.paymentContext != null) {
                gVar.mo61711x(MVNotifyDriverRequest.f25593b);
                gVar.mo61686J(mVNotifyDriverRequest.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVNotifyDriverRequest.f25594c);
            gVar.mo61678B(mVNotifyDriverRequest.lineId);
            gVar.mo61712y();
            gVar.mo61711x(MVNotifyDriverRequest.f25595d);
            gVar.mo61678B(mVNotifyDriverRequest.stopId);
            gVar.mo61712y();
            gVar.mo61711x(MVNotifyDriverRequest.f25596e);
            gVar.mo61679C(mVNotifyDriverRequest.tripId);
            gVar.mo61712y();
            if (mVNotifyDriverRequest.operation != null) {
                gVar.mo61711x(MVNotifyDriverRequest.f25597f);
                gVar.mo61678B(mVNotifyDriverRequest.operation.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNotifyDriverRequest mVNotifyDriverRequest = (MVNotifyDriverRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVNotifyDriverRequest.getClass();
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
                                    mVNotifyDriverRequest.operation = MVOperation.findByValue(gVar.mo61696i());
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 10) {
                                mVNotifyDriverRequest.tripId = gVar.mo61697j();
                                mVNotifyDriverRequest.mo27151m();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVNotifyDriverRequest.stopId = gVar.mo61696i();
                            mVNotifyDriverRequest.mo27150l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVNotifyDriverRequest.lineId = gVar.mo61696i();
                        mVNotifyDriverRequest.mo27149k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVNotifyDriverRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.driverconnection.MVNotifyDriverRequest$b */
    public static class C8704b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8703a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.driverconnection.MVNotifyDriverRequest$c */
    public static class C8705c extends C25240d<MVNotifyDriverRequest> {
        public C8705c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNotifyDriverRequest mVNotifyDriverRequest = (MVNotifyDriverRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNotifyDriverRequest.mo27145h()) {
                bitSet.set(0);
            }
            if (mVNotifyDriverRequest.mo27143f()) {
                bitSet.set(1);
            }
            if (mVNotifyDriverRequest.mo27147i()) {
                bitSet.set(2);
            }
            if (mVNotifyDriverRequest.mo27148j()) {
                bitSet.set(3);
            }
            if (mVNotifyDriverRequest.mo27144g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVNotifyDriverRequest.mo27145h()) {
                jVar.mo61686J(mVNotifyDriverRequest.paymentContext);
            }
            if (mVNotifyDriverRequest.mo27143f()) {
                jVar.mo61678B(mVNotifyDriverRequest.lineId);
            }
            if (mVNotifyDriverRequest.mo27147i()) {
                jVar.mo61678B(mVNotifyDriverRequest.stopId);
            }
            if (mVNotifyDriverRequest.mo27148j()) {
                jVar.mo61679C(mVNotifyDriverRequest.tripId);
            }
            if (mVNotifyDriverRequest.mo27144g()) {
                jVar.mo61678B(mVNotifyDriverRequest.operation.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNotifyDriverRequest mVNotifyDriverRequest = (MVNotifyDriverRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVNotifyDriverRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVNotifyDriverRequest.lineId = jVar.mo61696i();
                mVNotifyDriverRequest.mo27149k();
            }
            if (T.get(2)) {
                mVNotifyDriverRequest.stopId = jVar.mo61696i();
                mVNotifyDriverRequest.mo27150l();
            }
            if (T.get(3)) {
                mVNotifyDriverRequest.tripId = jVar.mo61697j();
                mVNotifyDriverRequest.mo27151m();
            }
            if (T.get(4)) {
                mVNotifyDriverRequest.operation = MVOperation.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.driverconnection.MVNotifyDriverRequest$d */
    public static class C8706d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8705c(0);
        }
    }

    static {
        new C17394d0("MVNotifyDriverRequest");
        HashMap hashMap = new HashMap();
        f25598g = hashMap;
        hashMap.put(C25239c.class, new C8704b());
        hashMap.put(C25240d.class, new C8706d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRIP_ID, new FieldMetaData("tripId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.OPERATION, new FieldMetaData("operation", (byte) 3, new EnumMetaData(MVOperation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25599h = unmodifiableMap;
        FieldMetaData.m61947a(MVNotifyDriverRequest.class, unmodifiableMap);
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
        ((C25238b) f25598g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25598g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVNotifyDriverRequest mVNotifyDriverRequest = (MVNotifyDriverRequest) obj;
        if (!getClass().equals(mVNotifyDriverRequest.getClass())) {
            return getClass().getName().compareTo(mVNotifyDriverRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27145h()).compareTo(Boolean.valueOf(mVNotifyDriverRequest.mo27145h()));
        if (compareTo2 != 0 || ((mo27145h() && (compareTo2 = this.paymentContext.compareTo(mVNotifyDriverRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo27143f()).compareTo(Boolean.valueOf(mVNotifyDriverRequest.mo27143f()))) != 0 || ((mo27143f() && (compareTo2 = C25082a.m62839c(this.lineId, mVNotifyDriverRequest.lineId)) != 0) || (compareTo2 = Boolean.valueOf(mo27147i()).compareTo(Boolean.valueOf(mVNotifyDriverRequest.mo27147i()))) != 0 || ((mo27147i() && (compareTo2 = C25082a.m62839c(this.stopId, mVNotifyDriverRequest.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo27148j()).compareTo(Boolean.valueOf(mVNotifyDriverRequest.mo27148j()))) != 0 || ((mo27148j() && (compareTo2 = C25082a.m62840d(this.tripId, mVNotifyDriverRequest.tripId)) != 0) || (compareTo2 = Boolean.valueOf(mo27144g()).compareTo(Boolean.valueOf(mVNotifyDriverRequest.mo27144g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo27144g() || (compareTo = this.operation.compareTo(mVNotifyDriverRequest.operation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVNotifyDriverRequest)) {
            return false;
        }
        MVNotifyDriverRequest mVNotifyDriverRequest = (MVNotifyDriverRequest) obj;
        boolean h = mo27145h();
        boolean h2 = mVNotifyDriverRequest.mo27145h();
        if (((h || h2) && (!h || !h2 || !this.paymentContext.equals(mVNotifyDriverRequest.paymentContext))) || this.lineId != mVNotifyDriverRequest.lineId || this.stopId != mVNotifyDriverRequest.stopId || this.tripId != mVNotifyDriverRequest.tripId) {
            return false;
        }
        boolean g = mo27144g();
        boolean g2 = mVNotifyDriverRequest.mo27144g();
        if ((g || g2) && (!g || !g2 || !this.operation.equals(mVNotifyDriverRequest.operation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27143f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27144g() {
        return this.operation != null;
    }

    /* renamed from: h */
    public final boolean mo27145h() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27147i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo27148j() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: k */
    public final void mo27149k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo27150l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo27151m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVNotifyDriverRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("lineId:");
        C0016g.m42z(n, this.lineId, ", ", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "tripId:");
        C25541a.m63889t(n, this.tripId, ", ", "operation:");
        MVOperation mVOperation = this.operation;
        if (mVOperation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVOperation);
        }
        n.append(")");
        return n.toString();
    }
}
