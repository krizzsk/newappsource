package com.tranzmate.moovit.protocol.users;

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

public class MVUserRegistrationStateResponse implements TBase<MVUserRegistrationStateResponse, _Fields>, Serializable, Cloneable, Comparable<MVUserRegistrationStateResponse> {

    /* renamed from: b */
    public static final C25113c f30654b = new C25113c("isPhoneRegistered", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f30655c = new C25113c("isFBRegistered", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f30656d = new C25113c("isCreditCardRegistered", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f30657e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30658f;
    private byte __isset_bitfield = 0;
    public boolean isCreditCardRegistered;
    public boolean isFBRegistered;
    public boolean isPhoneRegistered;

    public enum _Fields implements C25085c {
        IS_PHONE_REGISTERED(1, "isPhoneRegistered"),
        IS_FBREGISTERED(2, "isFBRegistered"),
        IS_CREDIT_CARD_REGISTERED(3, "isCreditCardRegistered");
        
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
                return IS_PHONE_REGISTERED;
            }
            if (i == 2) {
                return IS_FBREGISTERED;
            }
            if (i != 3) {
                return null;
            }
            return IS_CREDIT_CARD_REGISTERED;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserRegistrationStateResponse$a */
    public static class C11993a extends C25239c<MVUserRegistrationStateResponse> {
        public C11993a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserRegistrationStateResponse mVUserRegistrationStateResponse = (MVUserRegistrationStateResponse) tBase;
            mVUserRegistrationStateResponse.getClass();
            C25113c cVar = MVUserRegistrationStateResponse.f30654b;
            gVar.mo61687K();
            gVar.mo61711x(MVUserRegistrationStateResponse.f30654b);
            gVar.mo61708u(mVUserRegistrationStateResponse.isPhoneRegistered);
            gVar.mo61712y();
            gVar.mo61711x(MVUserRegistrationStateResponse.f30655c);
            gVar.mo61708u(mVUserRegistrationStateResponse.isFBRegistered);
            gVar.mo61712y();
            gVar.mo61711x(MVUserRegistrationStateResponse.f30656d);
            C0017h.m62S(gVar, mVUserRegistrationStateResponse.isCreditCardRegistered);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserRegistrationStateResponse mVUserRegistrationStateResponse = (MVUserRegistrationStateResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserRegistrationStateResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVUserRegistrationStateResponse.isCreditCardRegistered = gVar.mo61690c();
                            mVUserRegistrationStateResponse.mo35569i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVUserRegistrationStateResponse.isFBRegistered = gVar.mo61690c();
                        mVUserRegistrationStateResponse.mo35570j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVUserRegistrationStateResponse.isPhoneRegistered = gVar.mo61690c();
                    mVUserRegistrationStateResponse.mo35571k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserRegistrationStateResponse$b */
    public static class C11994b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11993a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserRegistrationStateResponse$c */
    public static class C11995c extends C25240d<MVUserRegistrationStateResponse> {
        public C11995c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserRegistrationStateResponse mVUserRegistrationStateResponse = (MVUserRegistrationStateResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserRegistrationStateResponse.mo35567h()) {
                bitSet.set(0);
            }
            if (mVUserRegistrationStateResponse.mo35566g()) {
                bitSet.set(1);
            }
            if (mVUserRegistrationStateResponse.mo35565f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVUserRegistrationStateResponse.mo35567h()) {
                jVar.mo61708u(mVUserRegistrationStateResponse.isPhoneRegistered);
            }
            if (mVUserRegistrationStateResponse.mo35566g()) {
                jVar.mo61708u(mVUserRegistrationStateResponse.isFBRegistered);
            }
            if (mVUserRegistrationStateResponse.mo35565f()) {
                jVar.mo61708u(mVUserRegistrationStateResponse.isCreditCardRegistered);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserRegistrationStateResponse mVUserRegistrationStateResponse = (MVUserRegistrationStateResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVUserRegistrationStateResponse.isPhoneRegistered = jVar.mo61690c();
                mVUserRegistrationStateResponse.mo35571k();
            }
            if (T.get(1)) {
                mVUserRegistrationStateResponse.isFBRegistered = jVar.mo61690c();
                mVUserRegistrationStateResponse.mo35570j();
            }
            if (T.get(2)) {
                mVUserRegistrationStateResponse.isCreditCardRegistered = jVar.mo61690c();
                mVUserRegistrationStateResponse.mo35569i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserRegistrationStateResponse$d */
    public static class C11996d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11995c(0);
        }
    }

    static {
        new C17394d0("MVUserRegistrationStateResponse");
        HashMap hashMap = new HashMap();
        f30657e = hashMap;
        hashMap.put(C25239c.class, new C11994b());
        hashMap.put(C25240d.class, new C11996d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_PHONE_REGISTERED, new FieldMetaData("isPhoneRegistered", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_FBREGISTERED, new FieldMetaData("isFBRegistered", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_CREDIT_CARD_REGISTERED, new FieldMetaData("isCreditCardRegistered", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30658f = unmodifiableMap;
        FieldMetaData.m61947a(MVUserRegistrationStateResponse.class, unmodifiableMap);
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
        ((C25238b) f30657e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30657e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVUserRegistrationStateResponse mVUserRegistrationStateResponse = (MVUserRegistrationStateResponse) obj;
        if (!getClass().equals(mVUserRegistrationStateResponse.getClass())) {
            return getClass().getName().compareTo(mVUserRegistrationStateResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35567h()).compareTo(Boolean.valueOf(mVUserRegistrationStateResponse.mo35567h()));
        if (compareTo != 0 || ((mo35567h() && (compareTo = C25082a.m62848l(this.isPhoneRegistered, mVUserRegistrationStateResponse.isPhoneRegistered)) != 0) || (compareTo = Boolean.valueOf(mo35566g()).compareTo(Boolean.valueOf(mVUserRegistrationStateResponse.mo35566g()))) != 0 || ((mo35566g() && (compareTo = C25082a.m62848l(this.isFBRegistered, mVUserRegistrationStateResponse.isFBRegistered)) != 0) || (compareTo = Boolean.valueOf(mo35565f()).compareTo(Boolean.valueOf(mVUserRegistrationStateResponse.mo35565f()))) != 0))) {
            return compareTo;
        }
        if (!mo35565f() || (l = C25082a.m62848l(this.isCreditCardRegistered, mVUserRegistrationStateResponse.isCreditCardRegistered)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUserRegistrationStateResponse)) {
            return false;
        }
        MVUserRegistrationStateResponse mVUserRegistrationStateResponse = (MVUserRegistrationStateResponse) obj;
        if (this.isPhoneRegistered == mVUserRegistrationStateResponse.isPhoneRegistered && this.isFBRegistered == mVUserRegistrationStateResponse.isFBRegistered && this.isCreditCardRegistered == mVUserRegistrationStateResponse.isCreditCardRegistered) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35565f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo35566g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo35567h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo35569i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: j */
    public final void mo35570j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo35571k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserRegistrationStateResponse(", "isPhoneRegistered:");
        C13555b.m33977q(n, this.isPhoneRegistered, ", ", "isFBRegistered:");
        C13555b.m33977q(n, this.isFBRegistered, ", ", "isCreditCardRegistered:");
        return C25541a.m63885p(n, this.isCreditCardRegistered, ")");
    }
}
