package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVUserAddress;
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

public class MVPaymentRegistrationSetAddressRequest implements TBase<MVPaymentRegistrationSetAddressRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationSetAddressRequest> {

    /* renamed from: b */
    public static final C25113c f27558b = new C25113c("address", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27559c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27560d;
    public MVUserAddress address;

    public enum _Fields implements C25085c {
        ADDRESS(1, "address");
        
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
            return ADDRESS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetAddressRequest$a */
    public static class C9959a extends C25239c<MVPaymentRegistrationSetAddressRequest> {
        public C9959a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetAddressRequest mVPaymentRegistrationSetAddressRequest = (MVPaymentRegistrationSetAddressRequest) tBase;
            MVUserAddress mVUserAddress = mVPaymentRegistrationSetAddressRequest.address;
            C25113c cVar = MVPaymentRegistrationSetAddressRequest.f27558b;
            gVar.mo61687K();
            if (mVPaymentRegistrationSetAddressRequest.address != null) {
                gVar.mo61711x(MVPaymentRegistrationSetAddressRequest.f27558b);
                mVPaymentRegistrationSetAddressRequest.address.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetAddressRequest mVPaymentRegistrationSetAddressRequest = (MVPaymentRegistrationSetAddressRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVUserAddress mVUserAddress = mVPaymentRegistrationSetAddressRequest.address;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVUserAddress mVUserAddress2 = new MVUserAddress();
                    mVPaymentRegistrationSetAddressRequest.address = mVUserAddress2;
                    mVUserAddress2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetAddressRequest$b */
    public static class C9960b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9959a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetAddressRequest$c */
    public static class C9961c extends C25240d<MVPaymentRegistrationSetAddressRequest> {
        public C9961c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetAddressRequest mVPaymentRegistrationSetAddressRequest = (MVPaymentRegistrationSetAddressRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationSetAddressRequest.mo30346f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPaymentRegistrationSetAddressRequest.mo30346f()) {
                mVPaymentRegistrationSetAddressRequest.address.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetAddressRequest mVPaymentRegistrationSetAddressRequest = (MVPaymentRegistrationSetAddressRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVUserAddress mVUserAddress = new MVUserAddress();
                mVPaymentRegistrationSetAddressRequest.address = mVUserAddress;
                mVUserAddress.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetAddressRequest$d */
    public static class C9962d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9961c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationSetAddressRequest");
        HashMap hashMap = new HashMap();
        f27559c = hashMap;
        hashMap.put(C25239c.class, new C9960b());
        hashMap.put(C25240d.class, new C9962d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ADDRESS, new FieldMetaData("address", (byte) 3, new StructMetaData(MVUserAddress.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27560d = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationSetAddressRequest.class, unmodifiableMap);
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
        ((C25238b) f27559c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27559c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentRegistrationSetAddressRequest mVPaymentRegistrationSetAddressRequest = (MVPaymentRegistrationSetAddressRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationSetAddressRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationSetAddressRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30346f()).compareTo(Boolean.valueOf(mVPaymentRegistrationSetAddressRequest.mo30346f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo30346f() || (compareTo = this.address.compareTo(mVPaymentRegistrationSetAddressRequest.address)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationSetAddressRequest)) {
            return false;
        }
        MVPaymentRegistrationSetAddressRequest mVPaymentRegistrationSetAddressRequest = (MVPaymentRegistrationSetAddressRequest) obj;
        boolean f = mo30346f();
        boolean f2 = mVPaymentRegistrationSetAddressRequest.mo30346f();
        if ((f || f2) && (!f || !f2 || !this.address.mo26420a(mVPaymentRegistrationSetAddressRequest.address))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30346f() {
        return this.address != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRegistrationSetAddressRequest(", "address:");
        MVUserAddress mVUserAddress = this.address;
        if (mVUserAddress == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVUserAddress);
        }
        n.append(")");
        return n.toString();
    }
}
