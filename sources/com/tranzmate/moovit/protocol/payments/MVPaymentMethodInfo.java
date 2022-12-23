package com.tranzmate.moovit.protocol.payments;

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

public class MVPaymentMethodInfo implements TBase<MVPaymentMethodInfo, _Fields>, Serializable, Cloneable, Comparable<MVPaymentMethodInfo> {

    /* renamed from: b */
    public static final C25113c f27499b = new C25113c("paymentMethodId", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27500c = new C25113c("isDefault", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f27501d = new C25113c("paymentMethodStatus", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f27502e = new C25113c("paymentMethod", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f27503f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27504g;
    private byte __isset_bitfield = 0;
    public boolean isDefault;
    private _Fields[] optionals = {_Fields.PAYMENT_METHOD_STATUS};
    public MVPaymentMethod paymentMethod;
    public MVPaymentMethodId paymentMethodId;
    public MVPaymentMethodStatus paymentMethodStatus;

    public enum _Fields implements C25085c {
        PAYMENT_METHOD_ID(1, "paymentMethodId"),
        IS_DEFAULT(2, "isDefault"),
        PAYMENT_METHOD_STATUS(3, "paymentMethodStatus"),
        PAYMENT_METHOD(4, "paymentMethod");
        
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
                return PAYMENT_METHOD_ID;
            }
            if (i == 2) {
                return IS_DEFAULT;
            }
            if (i == 3) {
                return PAYMENT_METHOD_STATUS;
            }
            if (i != 4) {
                return null;
            }
            return PAYMENT_METHOD;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo$a */
    public static class C9914a extends C25239c<MVPaymentMethodInfo> {
        public C9914a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodInfo mVPaymentMethodInfo = (MVPaymentMethodInfo) tBase;
            MVPaymentMethodId mVPaymentMethodId = mVPaymentMethodInfo.paymentMethodId;
            C25113c cVar = MVPaymentMethodInfo.f27499b;
            gVar.mo61687K();
            if (mVPaymentMethodInfo.paymentMethodId != null) {
                gVar.mo61711x(MVPaymentMethodInfo.f27499b);
                mVPaymentMethodInfo.paymentMethodId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPaymentMethodInfo.f27500c);
            gVar.mo61708u(mVPaymentMethodInfo.isDefault);
            gVar.mo61712y();
            if (mVPaymentMethodInfo.paymentMethodStatus != null && mVPaymentMethodInfo.mo30258i()) {
                gVar.mo61711x(MVPaymentMethodInfo.f27501d);
                gVar.mo61678B(mVPaymentMethodInfo.paymentMethodStatus.getValue());
                gVar.mo61712y();
            }
            if (mVPaymentMethodInfo.paymentMethod != null) {
                gVar.mo61711x(MVPaymentMethodInfo.f27502e);
                mVPaymentMethodInfo.paymentMethod.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodInfo mVPaymentMethodInfo = (MVPaymentMethodInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPaymentMethodId mVPaymentMethodId = mVPaymentMethodInfo.paymentMethodId;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVPaymentMethod mVPaymentMethod = new MVPaymentMethod();
                                mVPaymentMethodInfo.paymentMethod = mVPaymentMethod;
                                mVPaymentMethod.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPaymentMethodInfo.paymentMethodStatus = MVPaymentMethodStatus.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVPaymentMethodInfo.isDefault = gVar.mo61690c();
                        mVPaymentMethodInfo.mo30259j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPaymentMethodId mVPaymentMethodId2 = new MVPaymentMethodId();
                    mVPaymentMethodInfo.paymentMethodId = mVPaymentMethodId2;
                    mVPaymentMethodId2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo$b */
    public static class C9915b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9914a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo$c */
    public static class C9916c extends C25240d<MVPaymentMethodInfo> {
        public C9916c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodInfo mVPaymentMethodInfo = (MVPaymentMethodInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentMethodInfo.mo30256h()) {
                bitSet.set(0);
            }
            if (mVPaymentMethodInfo.mo30254f()) {
                bitSet.set(1);
            }
            if (mVPaymentMethodInfo.mo30258i()) {
                bitSet.set(2);
            }
            if (mVPaymentMethodInfo.mo30255g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPaymentMethodInfo.mo30256h()) {
                mVPaymentMethodInfo.paymentMethodId.mo25202X0(jVar);
            }
            if (mVPaymentMethodInfo.mo30254f()) {
                jVar.mo61708u(mVPaymentMethodInfo.isDefault);
            }
            if (mVPaymentMethodInfo.mo30258i()) {
                jVar.mo61678B(mVPaymentMethodInfo.paymentMethodStatus.getValue());
            }
            if (mVPaymentMethodInfo.mo30255g()) {
                mVPaymentMethodInfo.paymentMethod.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodInfo mVPaymentMethodInfo = (MVPaymentMethodInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                mVPaymentMethodInfo.paymentMethodId = mVPaymentMethodId;
                mVPaymentMethodId.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVPaymentMethodInfo.isDefault = jVar.mo61690c();
                mVPaymentMethodInfo.mo30259j();
            }
            if (T.get(2)) {
                mVPaymentMethodInfo.paymentMethodStatus = MVPaymentMethodStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                MVPaymentMethod mVPaymentMethod = new MVPaymentMethod();
                mVPaymentMethodInfo.paymentMethod = mVPaymentMethod;
                mVPaymentMethod.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo$d */
    public static class C9917d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9916c(0);
        }
    }

    static {
        new C17394d0("MVPaymentMethodInfo");
        HashMap hashMap = new HashMap();
        f27503f = hashMap;
        hashMap.put(C25239c.class, new C9915b());
        hashMap.put(C25240d.class, new C9917d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_METHOD_ID, new FieldMetaData("paymentMethodId", (byte) 3, new StructMetaData(MVPaymentMethodId.class)));
        enumMap.put(_Fields.IS_DEFAULT, new FieldMetaData("isDefault", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PAYMENT_METHOD_STATUS, new FieldMetaData("paymentMethodStatus", (byte) 2, new EnumMetaData(MVPaymentMethodStatus.class)));
        enumMap.put(_Fields.PAYMENT_METHOD, new FieldMetaData("paymentMethod", (byte) 3, new StructMetaData(MVPaymentMethod.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27504g = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentMethodInfo.class, unmodifiableMap);
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
        ((C25238b) f27503f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27503f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30251a(com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5.mo30256h()
            boolean r2 = r6.mo30256h()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x0075
            if (r2 != 0) goto L_0x0015
            goto L_0x0075
        L_0x0015:
            com.tranzmate.moovit.protocol.payments.MVPaymentMethodId r1 = r5.paymentMethodId
            com.tranzmate.moovit.protocol.payments.MVPaymentMethodId r2 = r6.paymentMethodId
            boolean r1 = r1.mo30243a(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r5.isDefault
            boolean r2 = r6.isDefault
            if (r1 == r2) goto L_0x0027
            return r0
        L_0x0027:
            boolean r1 = r5.mo30258i()
            boolean r2 = r6.mo30258i()
            if (r1 != 0) goto L_0x0033
            if (r2 == 0) goto L_0x0043
        L_0x0033:
            if (r1 == 0) goto L_0x0075
            if (r2 != 0) goto L_0x0038
            goto L_0x0075
        L_0x0038:
            com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus r1 = r5.paymentMethodStatus
            com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus r2 = r6.paymentMethodStatus
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0043
            return r0
        L_0x0043:
            boolean r1 = r5.mo30255g()
            boolean r2 = r6.mo30255g()
            r3 = 1
            if (r1 != 0) goto L_0x0050
            if (r2 == 0) goto L_0x0074
        L_0x0050:
            if (r1 == 0) goto L_0x0075
            if (r2 != 0) goto L_0x0055
            goto L_0x0075
        L_0x0055:
            com.tranzmate.moovit.protocol.payments.MVPaymentMethod r1 = r5.paymentMethod
            com.tranzmate.moovit.protocol.payments.MVPaymentMethod r6 = r6.paymentMethod
            if (r6 == 0) goto L_0x006d
            F r2 = r1.setField_
            F r4 = r6.setField_
            if (r2 != r4) goto L_0x0070
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0070
            r6 = 1
            goto L_0x0071
        L_0x006d:
            r1.getClass()
        L_0x0070:
            r6 = 0
        L_0x0071:
            if (r6 != 0) goto L_0x0074
            return r0
        L_0x0074:
            return r3
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo.mo30251a(com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentMethodInfo mVPaymentMethodInfo = (MVPaymentMethodInfo) obj;
        if (!getClass().equals(mVPaymentMethodInfo.getClass())) {
            return getClass().getName().compareTo(mVPaymentMethodInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30256h()).compareTo(Boolean.valueOf(mVPaymentMethodInfo.mo30256h()));
        if (compareTo2 != 0 || ((mo30256h() && (compareTo2 = this.paymentMethodId.compareTo(mVPaymentMethodInfo.paymentMethodId)) != 0) || (compareTo2 = Boolean.valueOf(mo30254f()).compareTo(Boolean.valueOf(mVPaymentMethodInfo.mo30254f()))) != 0 || ((mo30254f() && (compareTo2 = C25082a.m62848l(this.isDefault, mVPaymentMethodInfo.isDefault)) != 0) || (compareTo2 = Boolean.valueOf(mo30258i()).compareTo(Boolean.valueOf(mVPaymentMethodInfo.mo30258i()))) != 0 || ((mo30258i() && (compareTo2 = this.paymentMethodStatus.compareTo(mVPaymentMethodInfo.paymentMethodStatus)) != 0) || (compareTo2 = Boolean.valueOf(mo30255g()).compareTo(Boolean.valueOf(mVPaymentMethodInfo.mo30255g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30255g() || (compareTo = this.paymentMethod.compareTo(mVPaymentMethodInfo.paymentMethod)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentMethodInfo)) {
            return mo30251a((MVPaymentMethodInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30254f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30255g() {
        return this.paymentMethod != null;
    }

    /* renamed from: h */
    public final boolean mo30256h() {
        return this.paymentMethodId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30258i() {
        return this.paymentMethodStatus != null;
    }

    /* renamed from: j */
    public final void mo30259j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentMethodInfo(", "paymentMethodId:");
        MVPaymentMethodId mVPaymentMethodId = this.paymentMethodId;
        if (mVPaymentMethodId == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentMethodId);
        }
        n.append(", ");
        n.append("isDefault:");
        n.append(this.isDefault);
        if (mo30258i()) {
            n.append(", ");
            n.append("paymentMethodStatus:");
            MVPaymentMethodStatus mVPaymentMethodStatus = this.paymentMethodStatus;
            if (mVPaymentMethodStatus == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentMethodStatus);
            }
        }
        n.append(", ");
        n.append("paymentMethod:");
        MVPaymentMethod mVPaymentMethod = this.paymentMethod;
        if (mVPaymentMethod == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentMethod);
        }
        n.append(")");
        return n.toString();
    }
}
