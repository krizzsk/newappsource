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

public class MVPaymentRegistrationSetPangoRequest implements TBase<MVPaymentRegistrationSetPangoRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationSetPangoRequest> {

    /* renamed from: b */
    public static final C25113c f27568b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27569c = new C25113c("cvv", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27570d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27571e;
    public String cvv;
    private _Fields[] optionals = {_Fields.CVV};
    public String paymentContext;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        CVV(2, "cvv");
        
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
            return CVV;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetPangoRequest$a */
    public static class C9971a extends C25239c<MVPaymentRegistrationSetPangoRequest> {
        public C9971a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetPangoRequest mVPaymentRegistrationSetPangoRequest = (MVPaymentRegistrationSetPangoRequest) tBase;
            mVPaymentRegistrationSetPangoRequest.getClass();
            C25113c cVar = MVPaymentRegistrationSetPangoRequest.f27568b;
            gVar.mo61687K();
            if (mVPaymentRegistrationSetPangoRequest.paymentContext != null) {
                gVar.mo61711x(MVPaymentRegistrationSetPangoRequest.f27568b);
                gVar.mo61686J(mVPaymentRegistrationSetPangoRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationSetPangoRequest.cvv != null && mVPaymentRegistrationSetPangoRequest.mo30366f()) {
                gVar.mo61711x(MVPaymentRegistrationSetPangoRequest.f27569c);
                gVar.mo61686J(mVPaymentRegistrationSetPangoRequest.cvv);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetPangoRequest mVPaymentRegistrationSetPangoRequest = (MVPaymentRegistrationSetPangoRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRegistrationSetPangoRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVPaymentRegistrationSetPangoRequest.cvv = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentRegistrationSetPangoRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetPangoRequest$b */
    public static class C9972b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9971a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetPangoRequest$c */
    public static class C9973c extends C25240d<MVPaymentRegistrationSetPangoRequest> {
        public C9973c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetPangoRequest mVPaymentRegistrationSetPangoRequest = (MVPaymentRegistrationSetPangoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationSetPangoRequest.mo30367g()) {
                bitSet.set(0);
            }
            if (mVPaymentRegistrationSetPangoRequest.mo30366f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentRegistrationSetPangoRequest.mo30367g()) {
                jVar.mo61686J(mVPaymentRegistrationSetPangoRequest.paymentContext);
            }
            if (mVPaymentRegistrationSetPangoRequest.mo30366f()) {
                jVar.mo61686J(mVPaymentRegistrationSetPangoRequest.cvv);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetPangoRequest mVPaymentRegistrationSetPangoRequest = (MVPaymentRegistrationSetPangoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPaymentRegistrationSetPangoRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentRegistrationSetPangoRequest.cvv = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetPangoRequest$d */
    public static class C9974d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9973c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationSetPangoRequest");
        HashMap hashMap = new HashMap();
        f27570d = hashMap;
        hashMap.put(C25239c.class, new C9972b());
        hashMap.put(C25240d.class, new C9974d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CVV, new FieldMetaData("cvv", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27571e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationSetPangoRequest.class, unmodifiableMap);
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
        ((C25238b) f27570d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27570d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentRegistrationSetPangoRequest mVPaymentRegistrationSetPangoRequest = (MVPaymentRegistrationSetPangoRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationSetPangoRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationSetPangoRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30367g()).compareTo(Boolean.valueOf(mVPaymentRegistrationSetPangoRequest.mo30367g()));
        if (compareTo2 != 0 || ((mo30367g() && (compareTo2 = this.paymentContext.compareTo(mVPaymentRegistrationSetPangoRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo30366f()).compareTo(Boolean.valueOf(mVPaymentRegistrationSetPangoRequest.mo30366f()))) != 0)) {
            return compareTo2;
        }
        if (!mo30366f() || (compareTo = this.cvv.compareTo(mVPaymentRegistrationSetPangoRequest.cvv)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationSetPangoRequest)) {
            return false;
        }
        MVPaymentRegistrationSetPangoRequest mVPaymentRegistrationSetPangoRequest = (MVPaymentRegistrationSetPangoRequest) obj;
        boolean g = mo30367g();
        boolean g2 = mVPaymentRegistrationSetPangoRequest.mo30367g();
        if ((g || g2) && (!g || !g2 || !this.paymentContext.equals(mVPaymentRegistrationSetPangoRequest.paymentContext))) {
            return false;
        }
        boolean f = mo30366f();
        boolean f2 = mVPaymentRegistrationSetPangoRequest.mo30366f();
        if ((f || f2) && (!f || !f2 || !this.cvv.equals(mVPaymentRegistrationSetPangoRequest.cvv))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30366f() {
        return this.cvv != null;
    }

    /* renamed from: g */
    public final boolean mo30367g() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRegistrationSetPangoRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30366f()) {
            n.append(", ");
            n.append("cvv:");
            String str2 = this.cvv;
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
