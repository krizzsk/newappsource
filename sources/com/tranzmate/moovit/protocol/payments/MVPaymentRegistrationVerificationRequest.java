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
import p001a0.C0017h;
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

public class MVPaymentRegistrationVerificationRequest implements TBase<MVPaymentRegistrationVerificationRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationVerificationRequest> {

    /* renamed from: b */
    public static final C25113c f27581b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27582c = new C25113c("code", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27583d = new C25113c("leaveIfExist", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f27584e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27585f;
    private byte __isset_bitfield = 0;
    public String code;
    public boolean leaveIfExist;
    public String paymentContext;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        CODE(2, "code"),
        LEAVE_IF_EXIST(3, "leaveIfExist");
        
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
                return CODE;
            }
            if (i != 3) {
                return null;
            }
            return LEAVE_IF_EXIST;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationRequest$a */
    public static class C9983a extends C25239c<MVPaymentRegistrationVerificationRequest> {
        public C9983a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationVerificationRequest mVPaymentRegistrationVerificationRequest = (MVPaymentRegistrationVerificationRequest) tBase;
            mVPaymentRegistrationVerificationRequest.getClass();
            C25113c cVar = MVPaymentRegistrationVerificationRequest.f27581b;
            gVar.mo61687K();
            if (mVPaymentRegistrationVerificationRequest.paymentContext != null) {
                gVar.mo61711x(MVPaymentRegistrationVerificationRequest.f27581b);
                gVar.mo61686J(mVPaymentRegistrationVerificationRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationVerificationRequest.code != null) {
                gVar.mo61711x(MVPaymentRegistrationVerificationRequest.f27582c);
                gVar.mo61686J(mVPaymentRegistrationVerificationRequest.code);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPaymentRegistrationVerificationRequest.f27583d);
            C0017h.m62S(gVar, mVPaymentRegistrationVerificationRequest.leaveIfExist);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationVerificationRequest mVPaymentRegistrationVerificationRequest = (MVPaymentRegistrationVerificationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRegistrationVerificationRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVPaymentRegistrationVerificationRequest.leaveIfExist = gVar.mo61690c();
                            mVPaymentRegistrationVerificationRequest.mo30392i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPaymentRegistrationVerificationRequest.code = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentRegistrationVerificationRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationRequest$b */
    public static class C9984b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9983a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationRequest$c */
    public static class C9985c extends C25240d<MVPaymentRegistrationVerificationRequest> {
        public C9985c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationVerificationRequest mVPaymentRegistrationVerificationRequest = (MVPaymentRegistrationVerificationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationVerificationRequest.mo30390h()) {
                bitSet.set(0);
            }
            if (mVPaymentRegistrationVerificationRequest.mo30388f()) {
                bitSet.set(1);
            }
            if (mVPaymentRegistrationVerificationRequest.mo30389g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPaymentRegistrationVerificationRequest.mo30390h()) {
                jVar.mo61686J(mVPaymentRegistrationVerificationRequest.paymentContext);
            }
            if (mVPaymentRegistrationVerificationRequest.mo30388f()) {
                jVar.mo61686J(mVPaymentRegistrationVerificationRequest.code);
            }
            if (mVPaymentRegistrationVerificationRequest.mo30389g()) {
                jVar.mo61708u(mVPaymentRegistrationVerificationRequest.leaveIfExist);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationVerificationRequest mVPaymentRegistrationVerificationRequest = (MVPaymentRegistrationVerificationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPaymentRegistrationVerificationRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentRegistrationVerificationRequest.code = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPaymentRegistrationVerificationRequest.leaveIfExist = jVar.mo61690c();
                mVPaymentRegistrationVerificationRequest.mo30392i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationRequest$d */
    public static class C9986d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9985c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationVerificationRequest");
        HashMap hashMap = new HashMap();
        f27584e = hashMap;
        hashMap.put(C25239c.class, new C9984b());
        hashMap.put(C25240d.class, new C9986d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CODE, new FieldMetaData("code", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEAVE_IF_EXIST, new FieldMetaData("leaveIfExist", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27585f = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationVerificationRequest.class, unmodifiableMap);
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
        ((C25238b) f27584e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27584e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVPaymentRegistrationVerificationRequest mVPaymentRegistrationVerificationRequest = (MVPaymentRegistrationVerificationRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationVerificationRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationVerificationRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30390h()).compareTo(Boolean.valueOf(mVPaymentRegistrationVerificationRequest.mo30390h()));
        if (compareTo != 0 || ((mo30390h() && (compareTo = this.paymentContext.compareTo(mVPaymentRegistrationVerificationRequest.paymentContext)) != 0) || (compareTo = Boolean.valueOf(mo30388f()).compareTo(Boolean.valueOf(mVPaymentRegistrationVerificationRequest.mo30388f()))) != 0 || ((mo30388f() && (compareTo = this.code.compareTo(mVPaymentRegistrationVerificationRequest.code)) != 0) || (compareTo = Boolean.valueOf(mo30389g()).compareTo(Boolean.valueOf(mVPaymentRegistrationVerificationRequest.mo30389g()))) != 0))) {
            return compareTo;
        }
        if (!mo30389g() || (l = C25082a.m62848l(this.leaveIfExist, mVPaymentRegistrationVerificationRequest.leaveIfExist)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationVerificationRequest)) {
            return false;
        }
        MVPaymentRegistrationVerificationRequest mVPaymentRegistrationVerificationRequest = (MVPaymentRegistrationVerificationRequest) obj;
        boolean h = mo30390h();
        boolean h2 = mVPaymentRegistrationVerificationRequest.mo30390h();
        if ((h || h2) && (!h || !h2 || !this.paymentContext.equals(mVPaymentRegistrationVerificationRequest.paymentContext))) {
            return false;
        }
        boolean f = mo30388f();
        boolean f2 = mVPaymentRegistrationVerificationRequest.mo30388f();
        if (((f || f2) && (!f || !f2 || !this.code.equals(mVPaymentRegistrationVerificationRequest.code))) || this.leaveIfExist != mVPaymentRegistrationVerificationRequest.leaveIfExist) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30388f() {
        return this.code != null;
    }

    /* renamed from: g */
    public final boolean mo30389g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo30390h() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30392i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRegistrationVerificationRequest(", "paymentContext:");
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
        n.append(", ");
        n.append("leaveIfExist:");
        return C25541a.m63885p(n, this.leaveIfExist, ")");
    }
}
