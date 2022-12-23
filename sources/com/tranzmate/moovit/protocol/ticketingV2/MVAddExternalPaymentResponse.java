package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVAddExternalPaymentResponse implements TBase<MVAddExternalPaymentResponse, _Fields>, Serializable, Cloneable, Comparable<MVAddExternalPaymentResponse> {

    /* renamed from: b */
    public static final C25113c f28674b = new C25113c("paymentData", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f28675c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28676d;
    public String paymentData;

    public enum _Fields implements C25085c {
        PAYMENT_DATA(1, "paymentData");
        
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
            return PAYMENT_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentResponse$a */
    public static class C10773a extends C25239c<MVAddExternalPaymentResponse> {
        public C10773a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddExternalPaymentResponse mVAddExternalPaymentResponse = (MVAddExternalPaymentResponse) tBase;
            mVAddExternalPaymentResponse.getClass();
            C25113c cVar = MVAddExternalPaymentResponse.f28674b;
            gVar.mo61687K();
            if (mVAddExternalPaymentResponse.paymentData != null) {
                gVar.mo61711x(MVAddExternalPaymentResponse.f28674b);
                gVar.mo61686J(mVAddExternalPaymentResponse.paymentData);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddExternalPaymentResponse mVAddExternalPaymentResponse = (MVAddExternalPaymentResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAddExternalPaymentResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVAddExternalPaymentResponse.paymentData = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentResponse$b */
    public static class C10774b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10773a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentResponse$c */
    public static class C10775c extends C25240d<MVAddExternalPaymentResponse> {
        public C10775c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddExternalPaymentResponse mVAddExternalPaymentResponse = (MVAddExternalPaymentResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAddExternalPaymentResponse.mo32325f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVAddExternalPaymentResponse.mo32325f()) {
                jVar.mo61686J(mVAddExternalPaymentResponse.paymentData);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddExternalPaymentResponse mVAddExternalPaymentResponse = (MVAddExternalPaymentResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVAddExternalPaymentResponse.paymentData = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentResponse$d */
    public static class C10776d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10775c(0);
        }
    }

    static {
        new C17394d0("MVAddExternalPaymentResponse");
        HashMap hashMap = new HashMap();
        f28675c = hashMap;
        hashMap.put(C25239c.class, new C10774b());
        hashMap.put(C25240d.class, new C10776d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_DATA, new FieldMetaData("paymentData", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28676d = unmodifiableMap;
        FieldMetaData.m61947a(MVAddExternalPaymentResponse.class, unmodifiableMap);
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
        ((C25238b) f28675c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28675c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAddExternalPaymentResponse mVAddExternalPaymentResponse = (MVAddExternalPaymentResponse) obj;
        if (!getClass().equals(mVAddExternalPaymentResponse.getClass())) {
            return getClass().getName().compareTo(mVAddExternalPaymentResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32325f()).compareTo(Boolean.valueOf(mVAddExternalPaymentResponse.mo32325f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo32325f() || (compareTo = this.paymentData.compareTo(mVAddExternalPaymentResponse.paymentData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAddExternalPaymentResponse)) {
            return false;
        }
        MVAddExternalPaymentResponse mVAddExternalPaymentResponse = (MVAddExternalPaymentResponse) obj;
        boolean f = mo32325f();
        boolean f2 = mVAddExternalPaymentResponse.mo32325f();
        if ((f || f2) && (!f || !f2 || !this.paymentData.equals(mVAddExternalPaymentResponse.paymentData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32325f() {
        return this.paymentData != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAddExternalPaymentResponse(", "paymentData:");
        String str = this.paymentData;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
