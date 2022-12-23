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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVPaymentRegistrationGenerateVerificationCodeRequest implements TBase<MVPaymentRegistrationGenerateVerificationCodeRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationGenerateVerificationCodeRequest> {

    /* renamed from: b */
    public static final C25113c f27540b = new C25113c("phoneNumber", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27541c = new C25113c("callingCode", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27542d = new C25113c("paymentContext", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27543e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27544f;
    public String callingCode;
    private _Fields[] optionals = {_Fields.PAYMENT_CONTEXT};
    public String paymentContext;
    public String phoneNumber;

    public enum _Fields implements C25085c {
        PHONE_NUMBER(1, "phoneNumber"),
        CALLING_CODE(2, "callingCode"),
        PAYMENT_CONTEXT(3, "paymentContext");
        
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
                return PHONE_NUMBER;
            }
            if (i == 2) {
                return CALLING_CODE;
            }
            if (i != 3) {
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationGenerateVerificationCodeRequest$a */
    public static class C9943a extends C25239c<MVPaymentRegistrationGenerateVerificationCodeRequest> {
        public C9943a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationGenerateVerificationCodeRequest mVPaymentRegistrationGenerateVerificationCodeRequest = (MVPaymentRegistrationGenerateVerificationCodeRequest) tBase;
            mVPaymentRegistrationGenerateVerificationCodeRequest.getClass();
            C25113c cVar = MVPaymentRegistrationGenerateVerificationCodeRequest.f27540b;
            gVar.mo61687K();
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.phoneNumber != null) {
                gVar.mo61711x(MVPaymentRegistrationGenerateVerificationCodeRequest.f27540b);
                gVar.mo61686J(mVPaymentRegistrationGenerateVerificationCodeRequest.phoneNumber);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.callingCode != null) {
                gVar.mo61711x(MVPaymentRegistrationGenerateVerificationCodeRequest.f27541c);
                gVar.mo61686J(mVPaymentRegistrationGenerateVerificationCodeRequest.callingCode);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.paymentContext != null && mVPaymentRegistrationGenerateVerificationCodeRequest.mo30318g()) {
                gVar.mo61711x(MVPaymentRegistrationGenerateVerificationCodeRequest.f27542d);
                gVar.mo61686J(mVPaymentRegistrationGenerateVerificationCodeRequest.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationGenerateVerificationCodeRequest mVPaymentRegistrationGenerateVerificationCodeRequest = (MVPaymentRegistrationGenerateVerificationCodeRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRegistrationGenerateVerificationCodeRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPaymentRegistrationGenerateVerificationCodeRequest.paymentContext = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPaymentRegistrationGenerateVerificationCodeRequest.callingCode = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentRegistrationGenerateVerificationCodeRequest.phoneNumber = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationGenerateVerificationCodeRequest$b */
    public static class C9944b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9943a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationGenerateVerificationCodeRequest$c */
    public static class C9945c extends C25240d<MVPaymentRegistrationGenerateVerificationCodeRequest> {
        public C9945c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationGenerateVerificationCodeRequest mVPaymentRegistrationGenerateVerificationCodeRequest = (MVPaymentRegistrationGenerateVerificationCodeRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.mo30319h()) {
                bitSet.set(0);
            }
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.mo30317f()) {
                bitSet.set(1);
            }
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.mo30318g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.mo30319h()) {
                jVar.mo61686J(mVPaymentRegistrationGenerateVerificationCodeRequest.phoneNumber);
            }
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.mo30317f()) {
                jVar.mo61686J(mVPaymentRegistrationGenerateVerificationCodeRequest.callingCode);
            }
            if (mVPaymentRegistrationGenerateVerificationCodeRequest.mo30318g()) {
                jVar.mo61686J(mVPaymentRegistrationGenerateVerificationCodeRequest.paymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationGenerateVerificationCodeRequest mVPaymentRegistrationGenerateVerificationCodeRequest = (MVPaymentRegistrationGenerateVerificationCodeRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPaymentRegistrationGenerateVerificationCodeRequest.phoneNumber = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentRegistrationGenerateVerificationCodeRequest.callingCode = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPaymentRegistrationGenerateVerificationCodeRequest.paymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationGenerateVerificationCodeRequest$d */
    public static class C9946d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9945c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationGenerateVerificationCodeRequest");
        HashMap hashMap = new HashMap();
        f27543e = hashMap;
        hashMap.put(C25239c.class, new C9944b());
        hashMap.put(C25240d.class, new C9946d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PHONE_NUMBER, new FieldMetaData("phoneNumber", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CALLING_CODE, new FieldMetaData("callingCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27544f = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationGenerateVerificationCodeRequest.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f27543e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27543e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentRegistrationGenerateVerificationCodeRequest mVPaymentRegistrationGenerateVerificationCodeRequest = (MVPaymentRegistrationGenerateVerificationCodeRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationGenerateVerificationCodeRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationGenerateVerificationCodeRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30319h()).compareTo(Boolean.valueOf(mVPaymentRegistrationGenerateVerificationCodeRequest.mo30319h()));
        if (compareTo2 != 0 || ((mo30319h() && (compareTo2 = this.phoneNumber.compareTo(mVPaymentRegistrationGenerateVerificationCodeRequest.phoneNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo30317f()).compareTo(Boolean.valueOf(mVPaymentRegistrationGenerateVerificationCodeRequest.mo30317f()))) != 0 || ((mo30317f() && (compareTo2 = this.callingCode.compareTo(mVPaymentRegistrationGenerateVerificationCodeRequest.callingCode)) != 0) || (compareTo2 = Boolean.valueOf(mo30318g()).compareTo(Boolean.valueOf(mVPaymentRegistrationGenerateVerificationCodeRequest.mo30318g()))) != 0))) {
            return compareTo2;
        }
        if (!mo30318g() || (compareTo = this.paymentContext.compareTo(mVPaymentRegistrationGenerateVerificationCodeRequest.paymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationGenerateVerificationCodeRequest)) {
            return false;
        }
        MVPaymentRegistrationGenerateVerificationCodeRequest mVPaymentRegistrationGenerateVerificationCodeRequest = (MVPaymentRegistrationGenerateVerificationCodeRequest) obj;
        boolean h = mo30319h();
        boolean h2 = mVPaymentRegistrationGenerateVerificationCodeRequest.mo30319h();
        if ((h || h2) && (!h || !h2 || !this.phoneNumber.equals(mVPaymentRegistrationGenerateVerificationCodeRequest.phoneNumber))) {
            return false;
        }
        boolean f = mo30317f();
        boolean f2 = mVPaymentRegistrationGenerateVerificationCodeRequest.mo30317f();
        if ((f || f2) && (!f || !f2 || !this.callingCode.equals(mVPaymentRegistrationGenerateVerificationCodeRequest.callingCode))) {
            return false;
        }
        boolean g = mo30318g();
        boolean g2 = mVPaymentRegistrationGenerateVerificationCodeRequest.mo30318g();
        if ((g || g2) && (!g || !g2 || !this.paymentContext.equals(mVPaymentRegistrationGenerateVerificationCodeRequest.paymentContext))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30317f() {
        return this.callingCode != null;
    }

    /* renamed from: g */
    public final boolean mo30318g() {
        return this.paymentContext != null;
    }

    /* renamed from: h */
    public final boolean mo30319h() {
        return this.phoneNumber != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRegistrationGenerateVerificationCodeRequest(", "phoneNumber:");
        String str = this.phoneNumber;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("callingCode:");
        String str2 = this.callingCode;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo30318g()) {
            n.append(", ");
            n.append("paymentContext:");
            String str3 = this.paymentContext;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
