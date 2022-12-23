package com.tranzmate.moovit.protocol.taxi;

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

public class MVVerificationResponse implements TBase<MVVerificationResponse, _Fields>, Serializable, Cloneable, Comparable<MVVerificationResponse> {

    /* renamed from: b */
    public static final C25113c f28656b = new C25113c("migratedUser", (byte) 2, 1);

    /* renamed from: c */
    public static final HashMap f28657c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28658d;
    private byte __isset_bitfield = 0;
    public boolean migratedUser;

    public enum _Fields implements C25085c {
        MIGRATED_USER(1, "migratedUser");
        
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
            return MIGRATED_USER;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVVerificationResponse$a */
    public static class C10760a extends C25239c<MVVerificationResponse> {
        public C10760a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVerificationResponse mVVerificationResponse = (MVVerificationResponse) tBase;
            mVVerificationResponse.getClass();
            C25113c cVar = MVVerificationResponse.f28656b;
            gVar.mo61687K();
            gVar.mo61711x(MVVerificationResponse.f28656b);
            C0017h.m62S(gVar, mVVerificationResponse.migratedUser);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVerificationResponse mVVerificationResponse = (MVVerificationResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVVerificationResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 2) {
                    mVVerificationResponse.migratedUser = gVar.mo61690c();
                    mVVerificationResponse.mo32297g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVVerificationResponse$b */
    public static class C10761b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10760a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVVerificationResponse$c */
    public static class C10762c extends C25240d<MVVerificationResponse> {
        public C10762c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVerificationResponse mVVerificationResponse = (MVVerificationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVerificationResponse.mo32296f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVVerificationResponse.mo32296f()) {
                jVar.mo61708u(mVVerificationResponse.migratedUser);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVerificationResponse mVVerificationResponse = (MVVerificationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVVerificationResponse.migratedUser = jVar.mo61690c();
                mVVerificationResponse.mo32297g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVVerificationResponse$d */
    public static class C10763d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10762c(0);
        }
    }

    static {
        new C17394d0("MVVerificationResponse");
        HashMap hashMap = new HashMap();
        f28657c = hashMap;
        hashMap.put(C25239c.class, new C10761b());
        hashMap.put(C25240d.class, new C10763d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MIGRATED_USER, new FieldMetaData("migratedUser", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28658d = unmodifiableMap;
        FieldMetaData.m61947a(MVVerificationResponse.class, unmodifiableMap);
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
        ((C25238b) f28657c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28657c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVVerificationResponse mVVerificationResponse = (MVVerificationResponse) obj;
        if (!getClass().equals(mVVerificationResponse.getClass())) {
            return getClass().getName().compareTo(mVVerificationResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32296f()).compareTo(Boolean.valueOf(mVVerificationResponse.mo32296f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo32296f() || (l = C25082a.m62848l(this.migratedUser, mVVerificationResponse.migratedUser)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVVerificationResponse) && this.migratedUser == ((MVVerificationResponse) obj).migratedUser) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32296f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo32297g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C25541a.m63885p(C13437d.m33708n("MVVerificationResponse(", "migratedUser:"), this.migratedUser, ")");
    }
}
