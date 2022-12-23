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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPaymentRegistrationExternalAccountLoginResponse implements TBase<MVPaymentRegistrationExternalAccountLoginResponse, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationExternalAccountLoginResponse> {

    /* renamed from: b */
    public static final C25113c f27537b = new C25113c("accountInfo", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27538c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27539d;
    public MVLoginAccountInfo accountInfo;
    private _Fields[] optionals = {_Fields.ACCOUNT_INFO};

    public enum _Fields implements C25085c {
        ACCOUNT_INFO(1, "accountInfo");
        
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
            if (i != 1) {
                return null;
            }
            return ACCOUNT_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginResponse$a */
    public static class C9939a extends C25239c<MVPaymentRegistrationExternalAccountLoginResponse> {
        public C9939a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps;
            MVPaymentRegistrationExternalAccountLoginResponse mVPaymentRegistrationExternalAccountLoginResponse = (MVPaymentRegistrationExternalAccountLoginResponse) tBase;
            MVLoginAccountInfo mVLoginAccountInfo = mVPaymentRegistrationExternalAccountLoginResponse.accountInfo;
            if (!(mVLoginAccountInfo == null || (mVMissingPaymentRegistrationSteps = mVLoginAccountInfo.missingSteps) == null)) {
                mVMissingPaymentRegistrationSteps.mo30045s();
            }
            C25113c cVar = MVPaymentRegistrationExternalAccountLoginResponse.f27537b;
            gVar.mo61687K();
            if (mVPaymentRegistrationExternalAccountLoginResponse.accountInfo != null && mVPaymentRegistrationExternalAccountLoginResponse.mo30311f()) {
                gVar.mo61711x(MVPaymentRegistrationExternalAccountLoginResponse.f27537b);
                mVPaymentRegistrationExternalAccountLoginResponse.accountInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps;
            MVPaymentRegistrationExternalAccountLoginResponse mVPaymentRegistrationExternalAccountLoginResponse = (MVPaymentRegistrationExternalAccountLoginResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVLoginAccountInfo mVLoginAccountInfo = new MVLoginAccountInfo();
                    mVPaymentRegistrationExternalAccountLoginResponse.accountInfo = mVLoginAccountInfo;
                    mVLoginAccountInfo.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVLoginAccountInfo mVLoginAccountInfo2 = mVPaymentRegistrationExternalAccountLoginResponse.accountInfo;
            if (mVLoginAccountInfo2 != null && (mVMissingPaymentRegistrationSteps = mVLoginAccountInfo2.missingSteps) != null) {
                mVMissingPaymentRegistrationSteps.mo30045s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginResponse$b */
    public static class C9940b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9939a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginResponse$c */
    public static class C9941c extends C25240d<MVPaymentRegistrationExternalAccountLoginResponse> {
        public C9941c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationExternalAccountLoginResponse mVPaymentRegistrationExternalAccountLoginResponse = (MVPaymentRegistrationExternalAccountLoginResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationExternalAccountLoginResponse.mo30311f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPaymentRegistrationExternalAccountLoginResponse.mo30311f()) {
                mVPaymentRegistrationExternalAccountLoginResponse.accountInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationExternalAccountLoginResponse mVPaymentRegistrationExternalAccountLoginResponse = (MVPaymentRegistrationExternalAccountLoginResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVLoginAccountInfo mVLoginAccountInfo = new MVLoginAccountInfo();
                mVPaymentRegistrationExternalAccountLoginResponse.accountInfo = mVLoginAccountInfo;
                mVLoginAccountInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginResponse$d */
    public static class C9942d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9941c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationExternalAccountLoginResponse");
        HashMap hashMap = new HashMap();
        f27538c = hashMap;
        hashMap.put(C25239c.class, new C9940b());
        hashMap.put(C25240d.class, new C9942d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACCOUNT_INFO, new FieldMetaData("accountInfo", (byte) 2, new StructMetaData(MVLoginAccountInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27539d = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationExternalAccountLoginResponse.class, unmodifiableMap);
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
        ((C25238b) f27538c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27538c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentRegistrationExternalAccountLoginResponse mVPaymentRegistrationExternalAccountLoginResponse = (MVPaymentRegistrationExternalAccountLoginResponse) obj;
        if (!getClass().equals(mVPaymentRegistrationExternalAccountLoginResponse.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationExternalAccountLoginResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30311f()).compareTo(Boolean.valueOf(mVPaymentRegistrationExternalAccountLoginResponse.mo30311f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo30311f() || (compareTo = this.accountInfo.compareTo(mVPaymentRegistrationExternalAccountLoginResponse.accountInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationExternalAccountLoginResponse)) {
            return false;
        }
        MVPaymentRegistrationExternalAccountLoginResponse mVPaymentRegistrationExternalAccountLoginResponse = (MVPaymentRegistrationExternalAccountLoginResponse) obj;
        boolean f = mo30311f();
        boolean f2 = mVPaymentRegistrationExternalAccountLoginResponse.mo30311f();
        if ((f || f2) && (!f || !f2 || !this.accountInfo.mo30005a(mVPaymentRegistrationExternalAccountLoginResponse.accountInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30311f() {
        return this.accountInfo != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVPaymentRegistrationExternalAccountLoginResponse(");
        if (mo30311f()) {
            sb.append("accountInfo:");
            MVLoginAccountInfo mVLoginAccountInfo = this.accountInfo;
            if (mVLoginAccountInfo == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVLoginAccountInfo);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
