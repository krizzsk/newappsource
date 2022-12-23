package com.tranzmate.moovit.protocol.ridesharing;

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

public class MVRSEventRideReceiptResponse implements TBase<MVRSEventRideReceiptResponse, _Fields>, Serializable, Cloneable, Comparable<MVRSEventRideReceiptResponse> {

    /* renamed from: b */
    public static final C25113c f28083b = new C25113c("receipt", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28084c = new C25113c("phoneNumber", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28085d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28086e;
    public String phoneNumber;
    public String receipt;

    public enum _Fields implements C25085c {
        RECEIPT(1, "receipt"),
        PHONE_NUMBER(2, "phoneNumber");
        
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
                return RECEIPT;
            }
            if (i != 2) {
                return null;
            }
            return PHONE_NUMBER;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideReceiptResponse$a */
    public static class C10366a extends C25239c<MVRSEventRideReceiptResponse> {
        public C10366a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideReceiptResponse mVRSEventRideReceiptResponse = (MVRSEventRideReceiptResponse) tBase;
            mVRSEventRideReceiptResponse.getClass();
            C25113c cVar = MVRSEventRideReceiptResponse.f28083b;
            gVar.mo61687K();
            if (mVRSEventRideReceiptResponse.receipt != null) {
                gVar.mo61711x(MVRSEventRideReceiptResponse.f28083b);
                gVar.mo61686J(mVRSEventRideReceiptResponse.receipt);
                gVar.mo61712y();
            }
            if (mVRSEventRideReceiptResponse.phoneNumber != null) {
                gVar.mo61711x(MVRSEventRideReceiptResponse.f28084c);
                gVar.mo61686J(mVRSEventRideReceiptResponse.phoneNumber);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideReceiptResponse mVRSEventRideReceiptResponse = (MVRSEventRideReceiptResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRSEventRideReceiptResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVRSEventRideReceiptResponse.phoneNumber = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVRSEventRideReceiptResponse.receipt = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideReceiptResponse$b */
    public static class C10367b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10366a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideReceiptResponse$c */
    public static class C10368c extends C25240d<MVRSEventRideReceiptResponse> {
        public C10368c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideReceiptResponse mVRSEventRideReceiptResponse = (MVRSEventRideReceiptResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventRideReceiptResponse.mo31314g()) {
                bitSet.set(0);
            }
            if (mVRSEventRideReceiptResponse.mo31313f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVRSEventRideReceiptResponse.mo31314g()) {
                jVar.mo61686J(mVRSEventRideReceiptResponse.receipt);
            }
            if (mVRSEventRideReceiptResponse.mo31313f()) {
                jVar.mo61686J(mVRSEventRideReceiptResponse.phoneNumber);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideReceiptResponse mVRSEventRideReceiptResponse = (MVRSEventRideReceiptResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVRSEventRideReceiptResponse.receipt = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVRSEventRideReceiptResponse.phoneNumber = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideReceiptResponse$d */
    public static class C10369d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10368c(0);
        }
    }

    static {
        new C17394d0("MVRSEventRideReceiptResponse");
        HashMap hashMap = new HashMap();
        f28085d = hashMap;
        hashMap.put(C25239c.class, new C10367b());
        hashMap.put(C25240d.class, new C10369d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RECEIPT, new FieldMetaData("receipt", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PHONE_NUMBER, new FieldMetaData("phoneNumber", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28086e = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventRideReceiptResponse.class, unmodifiableMap);
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
        ((C25238b) f28085d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28085d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRSEventRideReceiptResponse mVRSEventRideReceiptResponse = (MVRSEventRideReceiptResponse) obj;
        if (!getClass().equals(mVRSEventRideReceiptResponse.getClass())) {
            return getClass().getName().compareTo(mVRSEventRideReceiptResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31314g()).compareTo(Boolean.valueOf(mVRSEventRideReceiptResponse.mo31314g()));
        if (compareTo2 != 0 || ((mo31314g() && (compareTo2 = this.receipt.compareTo(mVRSEventRideReceiptResponse.receipt)) != 0) || (compareTo2 = Boolean.valueOf(mo31313f()).compareTo(Boolean.valueOf(mVRSEventRideReceiptResponse.mo31313f()))) != 0)) {
            return compareTo2;
        }
        if (!mo31313f() || (compareTo = this.phoneNumber.compareTo(mVRSEventRideReceiptResponse.phoneNumber)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSEventRideReceiptResponse)) {
            return false;
        }
        MVRSEventRideReceiptResponse mVRSEventRideReceiptResponse = (MVRSEventRideReceiptResponse) obj;
        boolean g = mo31314g();
        boolean g2 = mVRSEventRideReceiptResponse.mo31314g();
        if ((g || g2) && (!g || !g2 || !this.receipt.equals(mVRSEventRideReceiptResponse.receipt))) {
            return false;
        }
        boolean f = mo31313f();
        boolean f2 = mVRSEventRideReceiptResponse.mo31313f();
        if ((f || f2) && (!f || !f2 || !this.phoneNumber.equals(mVRSEventRideReceiptResponse.phoneNumber))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31313f() {
        return this.phoneNumber != null;
    }

    /* renamed from: g */
    public final boolean mo31314g() {
        return this.receipt != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventRideReceiptResponse(", "receipt:");
        String str = this.receipt;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("phoneNumber:");
        String str2 = this.phoneNumber;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
