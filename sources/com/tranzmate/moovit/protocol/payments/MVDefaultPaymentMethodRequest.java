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

public class MVDefaultPaymentMethodRequest implements TBase<MVDefaultPaymentMethodRequest, _Fields>, Serializable, Cloneable, Comparable<MVDefaultPaymentMethodRequest> {

    /* renamed from: b */
    public static final C25113c f27223b = new C25113c("paymentMethodId", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27224c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27225d;
    public MVPaymentMethodId paymentMethodId;

    public enum _Fields implements C25085c {
        PAYMENT_METHOD_ID(1, "paymentMethodId");
        
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
            return PAYMENT_METHOD_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVDefaultPaymentMethodRequest$a */
    public static class C9704a extends C25239c<MVDefaultPaymentMethodRequest> {
        public C9704a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDefaultPaymentMethodRequest mVDefaultPaymentMethodRequest = (MVDefaultPaymentMethodRequest) tBase;
            MVPaymentMethodId mVPaymentMethodId = mVDefaultPaymentMethodRequest.paymentMethodId;
            C25113c cVar = MVDefaultPaymentMethodRequest.f27223b;
            gVar.mo61687K();
            if (mVDefaultPaymentMethodRequest.paymentMethodId != null) {
                gVar.mo61711x(MVDefaultPaymentMethodRequest.f27223b);
                mVDefaultPaymentMethodRequest.paymentMethodId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDefaultPaymentMethodRequest mVDefaultPaymentMethodRequest = (MVDefaultPaymentMethodRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPaymentMethodId mVPaymentMethodId = mVDefaultPaymentMethodRequest.paymentMethodId;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVPaymentMethodId mVPaymentMethodId2 = new MVPaymentMethodId();
                    mVDefaultPaymentMethodRequest.paymentMethodId = mVPaymentMethodId2;
                    mVPaymentMethodId2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVDefaultPaymentMethodRequest$b */
    public static class C9705b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9704a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVDefaultPaymentMethodRequest$c */
    public static class C9706c extends C25240d<MVDefaultPaymentMethodRequest> {
        public C9706c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDefaultPaymentMethodRequest mVDefaultPaymentMethodRequest = (MVDefaultPaymentMethodRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDefaultPaymentMethodRequest.mo29789f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVDefaultPaymentMethodRequest.mo29789f()) {
                mVDefaultPaymentMethodRequest.paymentMethodId.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDefaultPaymentMethodRequest mVDefaultPaymentMethodRequest = (MVDefaultPaymentMethodRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                mVDefaultPaymentMethodRequest.paymentMethodId = mVPaymentMethodId;
                mVPaymentMethodId.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVDefaultPaymentMethodRequest$d */
    public static class C9707d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9706c(0);
        }
    }

    static {
        new C17394d0("MVDefaultPaymentMethodRequest");
        HashMap hashMap = new HashMap();
        f27224c = hashMap;
        hashMap.put(C25239c.class, new C9705b());
        hashMap.put(C25240d.class, new C9707d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_METHOD_ID, new FieldMetaData("paymentMethodId", (byte) 3, new StructMetaData(MVPaymentMethodId.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27225d = unmodifiableMap;
        FieldMetaData.m61947a(MVDefaultPaymentMethodRequest.class, unmodifiableMap);
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
        ((C25238b) f27224c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27224c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDefaultPaymentMethodRequest mVDefaultPaymentMethodRequest = (MVDefaultPaymentMethodRequest) obj;
        if (!getClass().equals(mVDefaultPaymentMethodRequest.getClass())) {
            return getClass().getName().compareTo(mVDefaultPaymentMethodRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29789f()).compareTo(Boolean.valueOf(mVDefaultPaymentMethodRequest.mo29789f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo29789f() || (compareTo = this.paymentMethodId.compareTo(mVDefaultPaymentMethodRequest.paymentMethodId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDefaultPaymentMethodRequest)) {
            return false;
        }
        MVDefaultPaymentMethodRequest mVDefaultPaymentMethodRequest = (MVDefaultPaymentMethodRequest) obj;
        boolean f = mo29789f();
        boolean f2 = mVDefaultPaymentMethodRequest.mo29789f();
        if ((f || f2) && (!f || !f2 || !this.paymentMethodId.mo30243a(mVDefaultPaymentMethodRequest.paymentMethodId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29789f() {
        return this.paymentMethodId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDefaultPaymentMethodRequest(", "paymentMethodId:");
        MVPaymentMethodId mVPaymentMethodId = this.paymentMethodId;
        if (mVPaymentMethodId == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentMethodId);
        }
        n.append(")");
        return n.toString();
    }
}
