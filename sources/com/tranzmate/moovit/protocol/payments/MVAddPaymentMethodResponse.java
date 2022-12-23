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

public class MVAddPaymentMethodResponse implements TBase<MVAddPaymentMethodResponse, _Fields>, Serializable, Cloneable, Comparable<MVAddPaymentMethodResponse> {

    /* renamed from: b */
    public static final C25113c f27047b = new C25113c("paymentMethodInfo", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27048c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27049d;
    public MVPaymentMethodInfo paymentMethodInfo;

    public enum _Fields implements C25085c {
        PAYMENT_METHOD_INFO(1, "paymentMethodInfo");
        
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
            return PAYMENT_METHOD_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodResponse$a */
    public static class C9562a extends C25239c<MVAddPaymentMethodResponse> {
        public C9562a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddPaymentMethodResponse mVAddPaymentMethodResponse = (MVAddPaymentMethodResponse) tBase;
            mVAddPaymentMethodResponse.getClass();
            C25113c cVar = MVAddPaymentMethodResponse.f27047b;
            gVar.mo61687K();
            if (mVAddPaymentMethodResponse.paymentMethodInfo != null) {
                gVar.mo61711x(MVAddPaymentMethodResponse.f27047b);
                mVAddPaymentMethodResponse.paymentMethodInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddPaymentMethodResponse mVAddPaymentMethodResponse = (MVAddPaymentMethodResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAddPaymentMethodResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVPaymentMethodInfo mVPaymentMethodInfo = new MVPaymentMethodInfo();
                    mVAddPaymentMethodResponse.paymentMethodInfo = mVPaymentMethodInfo;
                    mVPaymentMethodInfo.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodResponse$b */
    public static class C9563b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9562a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodResponse$c */
    public static class C9564c extends C25240d<MVAddPaymentMethodResponse> {
        public C9564c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddPaymentMethodResponse mVAddPaymentMethodResponse = (MVAddPaymentMethodResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAddPaymentMethodResponse.mo29486f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVAddPaymentMethodResponse.mo29486f()) {
                mVAddPaymentMethodResponse.paymentMethodInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddPaymentMethodResponse mVAddPaymentMethodResponse = (MVAddPaymentMethodResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVPaymentMethodInfo mVPaymentMethodInfo = new MVPaymentMethodInfo();
                mVAddPaymentMethodResponse.paymentMethodInfo = mVPaymentMethodInfo;
                mVPaymentMethodInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodResponse$d */
    public static class C9565d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9564c(0);
        }
    }

    static {
        new C17394d0("MVAddPaymentMethodResponse");
        HashMap hashMap = new HashMap();
        f27048c = hashMap;
        hashMap.put(C25239c.class, new C9563b());
        hashMap.put(C25240d.class, new C9565d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_METHOD_INFO, new FieldMetaData("paymentMethodInfo", (byte) 3, new StructMetaData(MVPaymentMethodInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27049d = unmodifiableMap;
        FieldMetaData.m61947a(MVAddPaymentMethodResponse.class, unmodifiableMap);
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
        ((C25238b) f27048c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27048c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAddPaymentMethodResponse mVAddPaymentMethodResponse = (MVAddPaymentMethodResponse) obj;
        if (!getClass().equals(mVAddPaymentMethodResponse.getClass())) {
            return getClass().getName().compareTo(mVAddPaymentMethodResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29486f()).compareTo(Boolean.valueOf(mVAddPaymentMethodResponse.mo29486f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo29486f() || (compareTo = this.paymentMethodInfo.compareTo(mVAddPaymentMethodResponse.paymentMethodInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAddPaymentMethodResponse)) {
            return false;
        }
        MVAddPaymentMethodResponse mVAddPaymentMethodResponse = (MVAddPaymentMethodResponse) obj;
        boolean f = mo29486f();
        boolean f2 = mVAddPaymentMethodResponse.mo29486f();
        if ((f || f2) && (!f || !f2 || !this.paymentMethodInfo.mo30251a(mVAddPaymentMethodResponse.paymentMethodInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29486f() {
        return this.paymentMethodInfo != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAddPaymentMethodResponse(", "paymentMethodInfo:");
        MVPaymentMethodInfo mVPaymentMethodInfo = this.paymentMethodInfo;
        if (mVPaymentMethodInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentMethodInfo);
        }
        n.append(")");
        return n.toString();
    }
}
