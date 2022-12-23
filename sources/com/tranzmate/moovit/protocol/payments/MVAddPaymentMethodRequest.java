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

public class MVAddPaymentMethodRequest implements TBase<MVAddPaymentMethodRequest, _Fields>, Serializable, Cloneable, Comparable<MVAddPaymentMethodRequest> {

    /* renamed from: b */
    public static final C25113c f27040b = new C25113c("provider", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27041c = new C25113c("paymentMethodToken", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27042d = new C25113c("paymentMethod", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27043e = new C25113c("makeDefaultPaymentMethod", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f27044f = new C25113c("paymentContext", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f27045g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27046h;
    private byte __isset_bitfield = 0;
    public boolean makeDefaultPaymentMethod;
    private _Fields[] optionals = {_Fields.PAYMENT_CONTEXT};
    public String paymentContext;
    public MVAddPaymentMethodInfo paymentMethod;
    public String paymentMethodToken;
    public MVClearanceProviderType provider;

    public enum _Fields implements C25085c {
        PROVIDER(1, "provider"),
        PAYMENT_METHOD_TOKEN(2, "paymentMethodToken"),
        PAYMENT_METHOD(3, "paymentMethod"),
        MAKE_DEFAULT_PAYMENT_METHOD(4, "makeDefaultPaymentMethod"),
        PAYMENT_CONTEXT(5, "paymentContext");
        
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
                return PROVIDER;
            }
            if (i == 2) {
                return PAYMENT_METHOD_TOKEN;
            }
            if (i == 3) {
                return PAYMENT_METHOD;
            }
            if (i == 4) {
                return MAKE_DEFAULT_PAYMENT_METHOD;
            }
            if (i != 5) {
                return null;
            }
            return PAYMENT_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest$a */
    public static class C9558a extends C25239c<MVAddPaymentMethodRequest> {
        public C9558a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddPaymentMethodRequest mVAddPaymentMethodRequest = (MVAddPaymentMethodRequest) tBase;
            mVAddPaymentMethodRequest.getClass();
            C25113c cVar = MVAddPaymentMethodRequest.f27040b;
            gVar.mo61687K();
            if (mVAddPaymentMethodRequest.provider != null) {
                gVar.mo61711x(MVAddPaymentMethodRequest.f27040b);
                gVar.mo61678B(mVAddPaymentMethodRequest.provider.getValue());
                gVar.mo61712y();
            }
            if (mVAddPaymentMethodRequest.paymentMethodToken != null) {
                gVar.mo61711x(MVAddPaymentMethodRequest.f27041c);
                gVar.mo61686J(mVAddPaymentMethodRequest.paymentMethodToken);
                gVar.mo61712y();
            }
            if (mVAddPaymentMethodRequest.paymentMethod != null) {
                gVar.mo61711x(MVAddPaymentMethodRequest.f27042d);
                mVAddPaymentMethodRequest.paymentMethod.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAddPaymentMethodRequest.f27043e);
            gVar.mo61708u(mVAddPaymentMethodRequest.makeDefaultPaymentMethod);
            gVar.mo61712y();
            if (mVAddPaymentMethodRequest.paymentContext != null && mVAddPaymentMethodRequest.mo29476g()) {
                gVar.mo61711x(MVAddPaymentMethodRequest.f27044f);
                gVar.mo61686J(mVAddPaymentMethodRequest.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddPaymentMethodRequest mVAddPaymentMethodRequest = (MVAddPaymentMethodRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAddPaymentMethodRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVAddPaymentMethodRequest.paymentContext = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 2) {
                                mVAddPaymentMethodRequest.makeDefaultPaymentMethod = gVar.mo61690c();
                                mVAddPaymentMethodRequest.mo29481k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVAddPaymentMethodInfo mVAddPaymentMethodInfo = new MVAddPaymentMethodInfo();
                            mVAddPaymentMethodRequest.paymentMethod = mVAddPaymentMethodInfo;
                            mVAddPaymentMethodInfo.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAddPaymentMethodRequest.paymentMethodToken = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAddPaymentMethodRequest.provider = MVClearanceProviderType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest$b */
    public static class C9559b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9558a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest$c */
    public static class C9560c extends C25240d<MVAddPaymentMethodRequest> {
        public C9560c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddPaymentMethodRequest mVAddPaymentMethodRequest = (MVAddPaymentMethodRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAddPaymentMethodRequest.mo29480j()) {
                bitSet.set(0);
            }
            if (mVAddPaymentMethodRequest.mo29479i()) {
                bitSet.set(1);
            }
            if (mVAddPaymentMethodRequest.mo29477h()) {
                bitSet.set(2);
            }
            if (mVAddPaymentMethodRequest.mo29475f()) {
                bitSet.set(3);
            }
            if (mVAddPaymentMethodRequest.mo29476g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVAddPaymentMethodRequest.mo29480j()) {
                jVar.mo61678B(mVAddPaymentMethodRequest.provider.getValue());
            }
            if (mVAddPaymentMethodRequest.mo29479i()) {
                jVar.mo61686J(mVAddPaymentMethodRequest.paymentMethodToken);
            }
            if (mVAddPaymentMethodRequest.mo29477h()) {
                mVAddPaymentMethodRequest.paymentMethod.mo25202X0(jVar);
            }
            if (mVAddPaymentMethodRequest.mo29475f()) {
                jVar.mo61708u(mVAddPaymentMethodRequest.makeDefaultPaymentMethod);
            }
            if (mVAddPaymentMethodRequest.mo29476g()) {
                jVar.mo61686J(mVAddPaymentMethodRequest.paymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddPaymentMethodRequest mVAddPaymentMethodRequest = (MVAddPaymentMethodRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVAddPaymentMethodRequest.provider = MVClearanceProviderType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVAddPaymentMethodRequest.paymentMethodToken = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVAddPaymentMethodInfo mVAddPaymentMethodInfo = new MVAddPaymentMethodInfo();
                mVAddPaymentMethodRequest.paymentMethod = mVAddPaymentMethodInfo;
                mVAddPaymentMethodInfo.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVAddPaymentMethodRequest.makeDefaultPaymentMethod = jVar.mo61690c();
                mVAddPaymentMethodRequest.mo29481k();
            }
            if (T.get(4)) {
                mVAddPaymentMethodRequest.paymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest$d */
    public static class C9561d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9560c(0);
        }
    }

    static {
        new C17394d0("MVAddPaymentMethodRequest");
        HashMap hashMap = new HashMap();
        f27045g = hashMap;
        hashMap.put(C25239c.class, new C9559b());
        hashMap.put(C25240d.class, new C9561d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER, new FieldMetaData("provider", (byte) 3, new EnumMetaData(MVClearanceProviderType.class)));
        enumMap.put(_Fields.PAYMENT_METHOD_TOKEN, new FieldMetaData("paymentMethodToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_METHOD, new FieldMetaData("paymentMethod", (byte) 3, new StructMetaData(MVAddPaymentMethodInfo.class)));
        enumMap.put(_Fields.MAKE_DEFAULT_PAYMENT_METHOD, new FieldMetaData("makeDefaultPaymentMethod", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27046h = unmodifiableMap;
        FieldMetaData.m61947a(MVAddPaymentMethodRequest.class, unmodifiableMap);
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
        ((C25238b) f27045g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27045g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAddPaymentMethodRequest mVAddPaymentMethodRequest = (MVAddPaymentMethodRequest) obj;
        if (!getClass().equals(mVAddPaymentMethodRequest.getClass())) {
            return getClass().getName().compareTo(mVAddPaymentMethodRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29480j()).compareTo(Boolean.valueOf(mVAddPaymentMethodRequest.mo29480j()));
        if (compareTo2 != 0 || ((mo29480j() && (compareTo2 = this.provider.compareTo(mVAddPaymentMethodRequest.provider)) != 0) || (compareTo2 = Boolean.valueOf(mo29479i()).compareTo(Boolean.valueOf(mVAddPaymentMethodRequest.mo29479i()))) != 0 || ((mo29479i() && (compareTo2 = this.paymentMethodToken.compareTo(mVAddPaymentMethodRequest.paymentMethodToken)) != 0) || (compareTo2 = Boolean.valueOf(mo29477h()).compareTo(Boolean.valueOf(mVAddPaymentMethodRequest.mo29477h()))) != 0 || ((mo29477h() && (compareTo2 = this.paymentMethod.compareTo(mVAddPaymentMethodRequest.paymentMethod)) != 0) || (compareTo2 = Boolean.valueOf(mo29475f()).compareTo(Boolean.valueOf(mVAddPaymentMethodRequest.mo29475f()))) != 0 || ((mo29475f() && (compareTo2 = C25082a.m62848l(this.makeDefaultPaymentMethod, mVAddPaymentMethodRequest.makeDefaultPaymentMethod)) != 0) || (compareTo2 = Boolean.valueOf(mo29476g()).compareTo(Boolean.valueOf(mVAddPaymentMethodRequest.mo29476g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29476g() || (compareTo = this.paymentContext.compareTo(mVAddPaymentMethodRequest.paymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest
            r2 = 1
            if (r1 == 0) goto L_0x0099
            com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest r7 = (com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest) r7
            boolean r1 = r6.mo29480j()
            boolean r3 = r7.mo29480j()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0029
        L_0x0017:
            if (r1 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x001d
            goto L_0x0099
        L_0x001d:
            com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r1 = r6.provider
            com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r3 = r7.provider
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0099
        L_0x0029:
            boolean r1 = r6.mo29479i()
            boolean r3 = r7.mo29479i()
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0045
        L_0x0035:
            if (r1 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x003a
            goto L_0x0099
        L_0x003a:
            java.lang.String r1 = r6.paymentMethodToken
            java.lang.String r3 = r7.paymentMethodToken
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x0099
        L_0x0045:
            boolean r1 = r6.mo29477h()
            boolean r3 = r7.mo29477h()
            if (r1 != 0) goto L_0x0051
            if (r3 == 0) goto L_0x0075
        L_0x0051:
            if (r1 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x0056
            goto L_0x0099
        L_0x0056:
            com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodInfo r1 = r6.paymentMethod
            com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodInfo r3 = r7.paymentMethod
            if (r3 == 0) goto L_0x006e
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x0071
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0071
            r1 = 1
            goto L_0x0072
        L_0x006e:
            r1.getClass()
        L_0x0071:
            r1 = 0
        L_0x0072:
            if (r1 != 0) goto L_0x0075
            goto L_0x0099
        L_0x0075:
            boolean r1 = r6.makeDefaultPaymentMethod
            boolean r3 = r7.makeDefaultPaymentMethod
            if (r1 == r3) goto L_0x007c
            goto L_0x0099
        L_0x007c:
            boolean r1 = r6.mo29476g()
            boolean r3 = r7.mo29476g()
            if (r1 != 0) goto L_0x0088
            if (r3 == 0) goto L_0x0098
        L_0x0088:
            if (r1 == 0) goto L_0x0099
            if (r3 != 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            java.lang.String r1 = r6.paymentContext
            java.lang.String r7 = r7.paymentContext
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r0 = 1
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo29475f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29476g() {
        return this.paymentContext != null;
    }

    /* renamed from: h */
    public final boolean mo29477h() {
        return this.paymentMethod != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29479i() {
        return this.paymentMethodToken != null;
    }

    /* renamed from: j */
    public final boolean mo29480j() {
        return this.provider != null;
    }

    /* renamed from: k */
    public final void mo29481k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAddPaymentMethodRequest(", "provider:");
        MVClearanceProviderType mVClearanceProviderType = this.provider;
        if (mVClearanceProviderType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClearanceProviderType);
        }
        n.append(", ");
        n.append("paymentMethodToken:");
        String str = this.paymentMethodToken;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("paymentMethod:");
        MVAddPaymentMethodInfo mVAddPaymentMethodInfo = this.paymentMethod;
        if (mVAddPaymentMethodInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAddPaymentMethodInfo);
        }
        n.append(", ");
        n.append("makeDefaultPaymentMethod:");
        n.append(this.makeDefaultPaymentMethod);
        if (mo29476g()) {
            n.append(", ");
            n.append("paymentContext:");
            String str2 = this.paymentContext;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
