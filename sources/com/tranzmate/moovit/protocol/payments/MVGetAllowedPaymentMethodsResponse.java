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

public class MVGetAllowedPaymentMethodsResponse implements TBase<MVGetAllowedPaymentMethodsResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetAllowedPaymentMethodsResponse> {

    /* renamed from: b */
    public static final C25113c f27275b = new C25113c("paymentSummary", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27276c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27277d;
    public MVPaymentSummary paymentSummary;

    public enum _Fields implements C25085c {
        PAYMENT_SUMMARY(1, "paymentSummary");
        
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
            return PAYMENT_SUMMARY;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetAllowedPaymentMethodsResponse$a */
    public static class C9753a extends C25239c<MVGetAllowedPaymentMethodsResponse> {
        public C9753a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetAllowedPaymentMethodsResponse mVGetAllowedPaymentMethodsResponse = (MVGetAllowedPaymentMethodsResponse) tBase;
            MVPaymentSummary mVPaymentSummary = mVGetAllowedPaymentMethodsResponse.paymentSummary;
            if (mVPaymentSummary != null) {
                mVPaymentSummary.mo30444p();
            }
            C25113c cVar = MVGetAllowedPaymentMethodsResponse.f27275b;
            gVar.mo61687K();
            if (mVGetAllowedPaymentMethodsResponse.paymentSummary != null) {
                gVar.mo61711x(MVGetAllowedPaymentMethodsResponse.f27275b);
                mVGetAllowedPaymentMethodsResponse.paymentSummary.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetAllowedPaymentMethodsResponse mVGetAllowedPaymentMethodsResponse = (MVGetAllowedPaymentMethodsResponse) tBase;
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
                    MVPaymentSummary mVPaymentSummary = new MVPaymentSummary();
                    mVGetAllowedPaymentMethodsResponse.paymentSummary = mVPaymentSummary;
                    mVPaymentSummary.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPaymentSummary mVPaymentSummary2 = mVGetAllowedPaymentMethodsResponse.paymentSummary;
            if (mVPaymentSummary2 != null) {
                mVPaymentSummary2.mo30444p();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetAllowedPaymentMethodsResponse$b */
    public static class C9754b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9753a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetAllowedPaymentMethodsResponse$c */
    public static class C9755c extends C25240d<MVGetAllowedPaymentMethodsResponse> {
        public C9755c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetAllowedPaymentMethodsResponse mVGetAllowedPaymentMethodsResponse = (MVGetAllowedPaymentMethodsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetAllowedPaymentMethodsResponse.mo29881f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVGetAllowedPaymentMethodsResponse.mo29881f()) {
                mVGetAllowedPaymentMethodsResponse.paymentSummary.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetAllowedPaymentMethodsResponse mVGetAllowedPaymentMethodsResponse = (MVGetAllowedPaymentMethodsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVPaymentSummary mVPaymentSummary = new MVPaymentSummary();
                mVGetAllowedPaymentMethodsResponse.paymentSummary = mVPaymentSummary;
                mVPaymentSummary.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetAllowedPaymentMethodsResponse$d */
    public static class C9756d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9755c(0);
        }
    }

    static {
        new C17394d0("MVGetAllowedPaymentMethodsResponse");
        HashMap hashMap = new HashMap();
        f27276c = hashMap;
        hashMap.put(C25239c.class, new C9754b());
        hashMap.put(C25240d.class, new C9756d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_SUMMARY, new FieldMetaData("paymentSummary", (byte) 3, new StructMetaData(MVPaymentSummary.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27277d = unmodifiableMap;
        FieldMetaData.m61947a(MVGetAllowedPaymentMethodsResponse.class, unmodifiableMap);
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
        ((C25238b) f27276c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27276c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetAllowedPaymentMethodsResponse mVGetAllowedPaymentMethodsResponse = (MVGetAllowedPaymentMethodsResponse) obj;
        if (!getClass().equals(mVGetAllowedPaymentMethodsResponse.getClass())) {
            return getClass().getName().compareTo(mVGetAllowedPaymentMethodsResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29881f()).compareTo(Boolean.valueOf(mVGetAllowedPaymentMethodsResponse.mo29881f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo29881f() || (compareTo = this.paymentSummary.compareTo(mVGetAllowedPaymentMethodsResponse.paymentSummary)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetAllowedPaymentMethodsResponse)) {
            return false;
        }
        MVGetAllowedPaymentMethodsResponse mVGetAllowedPaymentMethodsResponse = (MVGetAllowedPaymentMethodsResponse) obj;
        boolean f = mo29881f();
        boolean f2 = mVGetAllowedPaymentMethodsResponse.mo29881f();
        if ((f || f2) && (!f || !f2 || !this.paymentSummary.mo30431a(mVGetAllowedPaymentMethodsResponse.paymentSummary))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29881f() {
        return this.paymentSummary != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetAllowedPaymentMethodsResponse(", "paymentSummary:");
        MVPaymentSummary mVPaymentSummary = this.paymentSummary;
        if (mVPaymentSummary == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentSummary);
        }
        n.append(")");
        return n.toString();
    }
}
