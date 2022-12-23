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

public class MVEmailCodeVerificationRequest implements TBase<MVEmailCodeVerificationRequest, _Fields>, Serializable, Cloneable, Comparable<MVEmailCodeVerificationRequest> {

    /* renamed from: b */
    public static final C25113c f27236b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27237c = new C25113c("code", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27238d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27239e;
    public String code;
    public String paymentContext;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        CODE(2, "code");
        
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
            if (i != 2) {
                return null;
            }
            return CODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVEmailCodeVerificationRequest$a */
    public static class C9716a extends C25239c<MVEmailCodeVerificationRequest> {
        public C9716a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmailCodeVerificationRequest mVEmailCodeVerificationRequest = (MVEmailCodeVerificationRequest) tBase;
            mVEmailCodeVerificationRequest.getClass();
            C25113c cVar = MVEmailCodeVerificationRequest.f27236b;
            gVar.mo61687K();
            if (mVEmailCodeVerificationRequest.paymentContext != null) {
                gVar.mo61711x(MVEmailCodeVerificationRequest.f27236b);
                gVar.mo61686J(mVEmailCodeVerificationRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVEmailCodeVerificationRequest.code != null) {
                gVar.mo61711x(MVEmailCodeVerificationRequest.f27237c);
                gVar.mo61686J(mVEmailCodeVerificationRequest.code);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmailCodeVerificationRequest mVEmailCodeVerificationRequest = (MVEmailCodeVerificationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEmailCodeVerificationRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVEmailCodeVerificationRequest.code = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVEmailCodeVerificationRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVEmailCodeVerificationRequest$b */
    public static class C9717b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9716a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVEmailCodeVerificationRequest$c */
    public static class C9718c extends C25240d<MVEmailCodeVerificationRequest> {
        public C9718c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmailCodeVerificationRequest mVEmailCodeVerificationRequest = (MVEmailCodeVerificationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEmailCodeVerificationRequest.mo29814g()) {
                bitSet.set(0);
            }
            if (mVEmailCodeVerificationRequest.mo29813f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVEmailCodeVerificationRequest.mo29814g()) {
                jVar.mo61686J(mVEmailCodeVerificationRequest.paymentContext);
            }
            if (mVEmailCodeVerificationRequest.mo29813f()) {
                jVar.mo61686J(mVEmailCodeVerificationRequest.code);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmailCodeVerificationRequest mVEmailCodeVerificationRequest = (MVEmailCodeVerificationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVEmailCodeVerificationRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVEmailCodeVerificationRequest.code = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVEmailCodeVerificationRequest$d */
    public static class C9719d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9718c(0);
        }
    }

    static {
        new C17394d0("MVEmailCodeVerificationRequest");
        HashMap hashMap = new HashMap();
        f27238d = hashMap;
        hashMap.put(C25239c.class, new C9717b());
        hashMap.put(C25240d.class, new C9719d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CODE, new FieldMetaData("code", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27239e = unmodifiableMap;
        FieldMetaData.m61947a(MVEmailCodeVerificationRequest.class, unmodifiableMap);
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
        ((C25238b) f27238d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27238d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVEmailCodeVerificationRequest mVEmailCodeVerificationRequest = (MVEmailCodeVerificationRequest) obj;
        if (!getClass().equals(mVEmailCodeVerificationRequest.getClass())) {
            return getClass().getName().compareTo(mVEmailCodeVerificationRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29814g()).compareTo(Boolean.valueOf(mVEmailCodeVerificationRequest.mo29814g()));
        if (compareTo2 != 0 || ((mo29814g() && (compareTo2 = this.paymentContext.compareTo(mVEmailCodeVerificationRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo29813f()).compareTo(Boolean.valueOf(mVEmailCodeVerificationRequest.mo29813f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29813f() || (compareTo = this.code.compareTo(mVEmailCodeVerificationRequest.code)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVEmailCodeVerificationRequest)) {
            return false;
        }
        MVEmailCodeVerificationRequest mVEmailCodeVerificationRequest = (MVEmailCodeVerificationRequest) obj;
        boolean g = mo29814g();
        boolean g2 = mVEmailCodeVerificationRequest.mo29814g();
        if ((g || g2) && (!g || !g2 || !this.paymentContext.equals(mVEmailCodeVerificationRequest.paymentContext))) {
            return false;
        }
        boolean f = mo29813f();
        boolean f2 = mVEmailCodeVerificationRequest.mo29813f();
        if ((f || f2) && (!f || !f2 || !this.code.equals(mVEmailCodeVerificationRequest.code))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29813f() {
        return this.code != null;
    }

    /* renamed from: g */
    public final boolean mo29814g() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEmailCodeVerificationRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("code:");
        String str2 = this.code;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
