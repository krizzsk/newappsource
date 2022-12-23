package com.tranzmate.moovit.protocol.payments;

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

public class MVPaymentRegistrationSetBirthDateRequest implements TBase<MVPaymentRegistrationSetBirthDateRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationSetBirthDateRequest> {

    /* renamed from: b */
    public static final C25113c f27561b = new C25113c("birthDate", (byte) 10, 1);

    /* renamed from: c */
    public static final HashMap f27562c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27563d;
    private byte __isset_bitfield = 0;
    public long birthDate;

    public enum _Fields implements C25085c {
        BIRTH_DATE(1, "birthDate");
        
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
            return BIRTH_DATE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetBirthDateRequest$a */
    public static class C9963a extends C25239c<MVPaymentRegistrationSetBirthDateRequest> {
        public C9963a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetBirthDateRequest mVPaymentRegistrationSetBirthDateRequest = (MVPaymentRegistrationSetBirthDateRequest) tBase;
            mVPaymentRegistrationSetBirthDateRequest.getClass();
            C25113c cVar = MVPaymentRegistrationSetBirthDateRequest.f27561b;
            gVar.mo61687K();
            gVar.mo61711x(MVPaymentRegistrationSetBirthDateRequest.f27561b);
            C25541a.m63891v(gVar, mVPaymentRegistrationSetBirthDateRequest.birthDate);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetBirthDateRequest mVPaymentRegistrationSetBirthDateRequest = (MVPaymentRegistrationSetBirthDateRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRegistrationSetBirthDateRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 10) {
                    mVPaymentRegistrationSetBirthDateRequest.birthDate = gVar.mo61697j();
                    mVPaymentRegistrationSetBirthDateRequest.mo30353g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetBirthDateRequest$b */
    public static class C9964b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9963a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetBirthDateRequest$c */
    public static class C9965c extends C25240d<MVPaymentRegistrationSetBirthDateRequest> {
        public C9965c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetBirthDateRequest mVPaymentRegistrationSetBirthDateRequest = (MVPaymentRegistrationSetBirthDateRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationSetBirthDateRequest.mo30352f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPaymentRegistrationSetBirthDateRequest.mo30352f()) {
                jVar.mo61679C(mVPaymentRegistrationSetBirthDateRequest.birthDate);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetBirthDateRequest mVPaymentRegistrationSetBirthDateRequest = (MVPaymentRegistrationSetBirthDateRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVPaymentRegistrationSetBirthDateRequest.birthDate = jVar.mo61697j();
                mVPaymentRegistrationSetBirthDateRequest.mo30353g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetBirthDateRequest$d */
    public static class C9966d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9965c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationSetBirthDateRequest");
        HashMap hashMap = new HashMap();
        f27562c = hashMap;
        hashMap.put(C25239c.class, new C9964b());
        hashMap.put(C25240d.class, new C9966d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BIRTH_DATE, new FieldMetaData("birthDate", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27563d = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationSetBirthDateRequest.class, unmodifiableMap);
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
        ((C25238b) f27562c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27562c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVPaymentRegistrationSetBirthDateRequest mVPaymentRegistrationSetBirthDateRequest = (MVPaymentRegistrationSetBirthDateRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationSetBirthDateRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationSetBirthDateRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30352f()).compareTo(Boolean.valueOf(mVPaymentRegistrationSetBirthDateRequest.mo30352f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo30352f() || (d = C25082a.m62840d(this.birthDate, mVPaymentRegistrationSetBirthDateRequest.birthDate)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentRegistrationSetBirthDateRequest) && this.birthDate == ((MVPaymentRegistrationSetBirthDateRequest) obj).birthDate) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30352f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo30353g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C25541a.m63884o(C13437d.m33708n("MVPaymentRegistrationSetBirthDateRequest(", "birthDate:"), this.birthDate, ")");
    }
}
