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

public class MVTokenizeStatusRequest implements TBase<MVTokenizeStatusRequest, _Fields>, Serializable, Cloneable, Comparable<MVTokenizeStatusRequest> {

    /* renamed from: b */
    public static final C25113c f27768b = new C25113c("paymentToken", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f27769c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27770d;
    public String paymentToken;

    public enum _Fields implements C25085c {
        PAYMENT_TOKEN(1, "paymentToken");
        
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
            return PAYMENT_TOKEN;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeStatusRequest$a */
    public static class C10113a extends C25239c<MVTokenizeStatusRequest> {
        public C10113a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeStatusRequest mVTokenizeStatusRequest = (MVTokenizeStatusRequest) tBase;
            mVTokenizeStatusRequest.getClass();
            C25113c cVar = MVTokenizeStatusRequest.f27768b;
            gVar.mo61687K();
            if (mVTokenizeStatusRequest.paymentToken != null) {
                gVar.mo61711x(MVTokenizeStatusRequest.f27768b);
                gVar.mo61686J(mVTokenizeStatusRequest.paymentToken);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeStatusRequest mVTokenizeStatusRequest = (MVTokenizeStatusRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTokenizeStatusRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVTokenizeStatusRequest.paymentToken = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeStatusRequest$b */
    public static class C10114b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10113a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeStatusRequest$c */
    public static class C10115c extends C25240d<MVTokenizeStatusRequest> {
        public C10115c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeStatusRequest mVTokenizeStatusRequest = (MVTokenizeStatusRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTokenizeStatusRequest.mo30708f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVTokenizeStatusRequest.mo30708f()) {
                jVar.mo61686J(mVTokenizeStatusRequest.paymentToken);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeStatusRequest mVTokenizeStatusRequest = (MVTokenizeStatusRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVTokenizeStatusRequest.paymentToken = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeStatusRequest$d */
    public static class C10116d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10115c(0);
        }
    }

    static {
        new C17394d0("MVTokenizeStatusRequest");
        HashMap hashMap = new HashMap();
        f27769c = hashMap;
        hashMap.put(C25239c.class, new C10114b());
        hashMap.put(C25240d.class, new C10116d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_TOKEN, new FieldMetaData("paymentToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27770d = unmodifiableMap;
        FieldMetaData.m61947a(MVTokenizeStatusRequest.class, unmodifiableMap);
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
        ((C25238b) f27769c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27769c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTokenizeStatusRequest mVTokenizeStatusRequest = (MVTokenizeStatusRequest) obj;
        if (!getClass().equals(mVTokenizeStatusRequest.getClass())) {
            return getClass().getName().compareTo(mVTokenizeStatusRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30708f()).compareTo(Boolean.valueOf(mVTokenizeStatusRequest.mo30708f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo30708f() || (compareTo = this.paymentToken.compareTo(mVTokenizeStatusRequest.paymentToken)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTokenizeStatusRequest)) {
            return false;
        }
        MVTokenizeStatusRequest mVTokenizeStatusRequest = (MVTokenizeStatusRequest) obj;
        boolean f = mo30708f();
        boolean f2 = mVTokenizeStatusRequest.mo30708f();
        if ((f || f2) && (!f || !f2 || !this.paymentToken.equals(mVTokenizeStatusRequest.paymentToken))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30708f() {
        return this.paymentToken != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTokenizeStatusRequest(", "paymentToken:");
        String str = this.paymentToken;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
