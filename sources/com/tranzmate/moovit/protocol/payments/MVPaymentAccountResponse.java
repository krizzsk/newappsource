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

public class MVPaymentAccountResponse implements TBase<MVPaymentAccountResponse, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountResponse> {

    /* renamed from: b */
    public static final C25113c f27447b = new C25113c("account", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27448c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27449d;
    public MVPaymentAccount account;

    public enum _Fields implements C25085c {
        ACCOUNT(1, "account");
        
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
            return ACCOUNT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountResponse$a */
    public static class C9873a extends C25239c<MVPaymentAccountResponse> {
        public C9873a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountResponse mVPaymentAccountResponse = (MVPaymentAccountResponse) tBase;
            mVPaymentAccountResponse.getClass();
            C25113c cVar = MVPaymentAccountResponse.f27447b;
            gVar.mo61687K();
            if (mVPaymentAccountResponse.account != null) {
                gVar.mo61711x(MVPaymentAccountResponse.f27447b);
                mVPaymentAccountResponse.account.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountResponse mVPaymentAccountResponse = (MVPaymentAccountResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentAccountResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVPaymentAccount mVPaymentAccount = new MVPaymentAccount();
                    mVPaymentAccountResponse.account = mVPaymentAccount;
                    mVPaymentAccount.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountResponse$b */
    public static class C9874b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9873a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountResponse$c */
    public static class C9875c extends C25240d<MVPaymentAccountResponse> {
        public C9875c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountResponse mVPaymentAccountResponse = (MVPaymentAccountResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountResponse.mo30167f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPaymentAccountResponse.mo30167f()) {
                mVPaymentAccountResponse.account.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountResponse mVPaymentAccountResponse = (MVPaymentAccountResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVPaymentAccount mVPaymentAccount = new MVPaymentAccount();
                mVPaymentAccountResponse.account = mVPaymentAccount;
                mVPaymentAccount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountResponse$d */
    public static class C9876d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9875c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountResponse");
        HashMap hashMap = new HashMap();
        f27448c = hashMap;
        hashMap.put(C25239c.class, new C9874b());
        hashMap.put(C25240d.class, new C9876d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACCOUNT, new FieldMetaData("account", (byte) 3, new StructMetaData(MVPaymentAccount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27449d = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountResponse.class, unmodifiableMap);
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
        ((C25238b) f27448c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27448c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentAccountResponse mVPaymentAccountResponse = (MVPaymentAccountResponse) obj;
        if (!getClass().equals(mVPaymentAccountResponse.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30167f()).compareTo(Boolean.valueOf(mVPaymentAccountResponse.mo30167f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo30167f() || (compareTo = this.account.compareTo(mVPaymentAccountResponse.account)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentAccountResponse)) {
            return false;
        }
        MVPaymentAccountResponse mVPaymentAccountResponse = (MVPaymentAccountResponse) obj;
        boolean f = mo30167f();
        boolean f2 = mVPaymentAccountResponse.mo30167f();
        if ((f || f2) && (!f || !f2 || !this.account.mo30085a(mVPaymentAccountResponse.account))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30167f() {
        return this.account != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccountResponse(", "account:");
        MVPaymentAccount mVPaymentAccount = this.account;
        if (mVPaymentAccount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentAccount);
        }
        n.append(")");
        return n.toString();
    }
}
