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

public class MVSetPrivacyPolicyRequest implements TBase<MVSetPrivacyPolicyRequest, _Fields>, Serializable, Cloneable, Comparable<MVSetPrivacyPolicyRequest> {

    /* renamed from: b */
    public static final C25113c f30531b = new C25113c("locationDataAllowed", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f30532c = new C25113c("sellingDataAllowed", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f30533d = new C25113c("personalizedAdsAllowed", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f30534e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30535f;
    private byte __isset_bitfield = 0;
    public boolean locationDataAllowed;
    private _Fields[] optionals = {_Fields.PERSONALIZED_ADS_ALLOWED};
    public boolean personalizedAdsAllowed;
    public boolean sellingDataAllowed;

    public enum _Fields implements C25085c {
        LOCATION_DATA_ALLOWED(1, "locationDataAllowed"),
        SELLING_DATA_ALLOWED(2, "sellingDataAllowed"),
        PERSONALIZED_ADS_ALLOWED(3, "personalizedAdsAllowed");
        
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
                return LOCATION_DATA_ALLOWED;
            }
            if (i == 2) {
                return SELLING_DATA_ALLOWED;
            }
            if (i != 3) {
                return null;
            }
            return PERSONALIZED_ADS_ALLOWED;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetPrivacyPolicyRequest$a */
    public static class C11893a extends C25239c<MVSetPrivacyPolicyRequest> {
        public C11893a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = (MVSetPrivacyPolicyRequest) tBase;
            mVSetPrivacyPolicyRequest.getClass();
            C25113c cVar = MVSetPrivacyPolicyRequest.f30531b;
            gVar.mo61687K();
            gVar.mo61711x(MVSetPrivacyPolicyRequest.f30531b);
            gVar.mo61708u(mVSetPrivacyPolicyRequest.locationDataAllowed);
            gVar.mo61712y();
            gVar.mo61711x(MVSetPrivacyPolicyRequest.f30532c);
            gVar.mo61708u(mVSetPrivacyPolicyRequest.sellingDataAllowed);
            gVar.mo61712y();
            if (mVSetPrivacyPolicyRequest.mo35333g()) {
                gVar.mo61711x(MVSetPrivacyPolicyRequest.f30533d);
                gVar.mo61708u(mVSetPrivacyPolicyRequest.personalizedAdsAllowed);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = (MVSetPrivacyPolicyRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetPrivacyPolicyRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVSetPrivacyPolicyRequest.personalizedAdsAllowed = gVar.mo61690c();
                            mVSetPrivacyPolicyRequest.mo35337j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVSetPrivacyPolicyRequest.sellingDataAllowed = gVar.mo61690c();
                        mVSetPrivacyPolicyRequest.mo35338k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVSetPrivacyPolicyRequest.locationDataAllowed = gVar.mo61690c();
                    mVSetPrivacyPolicyRequest.mo35336i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetPrivacyPolicyRequest$b */
    public static class C11894b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11893a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetPrivacyPolicyRequest$c */
    public static class C11895c extends C25240d<MVSetPrivacyPolicyRequest> {
        public C11895c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = (MVSetPrivacyPolicyRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetPrivacyPolicyRequest.mo35332f()) {
                bitSet.set(0);
            }
            if (mVSetPrivacyPolicyRequest.mo35334h()) {
                bitSet.set(1);
            }
            if (mVSetPrivacyPolicyRequest.mo35333g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSetPrivacyPolicyRequest.mo35332f()) {
                jVar.mo61708u(mVSetPrivacyPolicyRequest.locationDataAllowed);
            }
            if (mVSetPrivacyPolicyRequest.mo35334h()) {
                jVar.mo61708u(mVSetPrivacyPolicyRequest.sellingDataAllowed);
            }
            if (mVSetPrivacyPolicyRequest.mo35333g()) {
                jVar.mo61708u(mVSetPrivacyPolicyRequest.personalizedAdsAllowed);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = (MVSetPrivacyPolicyRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVSetPrivacyPolicyRequest.locationDataAllowed = jVar.mo61690c();
                mVSetPrivacyPolicyRequest.mo35336i();
            }
            if (T.get(1)) {
                mVSetPrivacyPolicyRequest.sellingDataAllowed = jVar.mo61690c();
                mVSetPrivacyPolicyRequest.mo35338k();
            }
            if (T.get(2)) {
                mVSetPrivacyPolicyRequest.personalizedAdsAllowed = jVar.mo61690c();
                mVSetPrivacyPolicyRequest.mo35337j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetPrivacyPolicyRequest$d */
    public static class C11896d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11895c(0);
        }
    }

    static {
        new C17394d0("MVSetPrivacyPolicyRequest");
        HashMap hashMap = new HashMap();
        f30534e = hashMap;
        hashMap.put(C25239c.class, new C11894b());
        hashMap.put(C25240d.class, new C11896d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION_DATA_ALLOWED, new FieldMetaData("locationDataAllowed", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SELLING_DATA_ALLOWED, new FieldMetaData("sellingDataAllowed", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PERSONALIZED_ADS_ALLOWED, new FieldMetaData("personalizedAdsAllowed", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30535f = unmodifiableMap;
        FieldMetaData.m61947a(MVSetPrivacyPolicyRequest.class, unmodifiableMap);
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
        ((C25238b) f30534e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30534e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35329a(MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest) {
        if (mVSetPrivacyPolicyRequest == null || this.locationDataAllowed != mVSetPrivacyPolicyRequest.locationDataAllowed || this.sellingDataAllowed != mVSetPrivacyPolicyRequest.sellingDataAllowed) {
            return false;
        }
        boolean g = mo35333g();
        boolean g2 = mVSetPrivacyPolicyRequest.mo35333g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || this.personalizedAdsAllowed != mVSetPrivacyPolicyRequest.personalizedAdsAllowed) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = (MVSetPrivacyPolicyRequest) obj;
        if (!getClass().equals(mVSetPrivacyPolicyRequest.getClass())) {
            return getClass().getName().compareTo(mVSetPrivacyPolicyRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35332f()).compareTo(Boolean.valueOf(mVSetPrivacyPolicyRequest.mo35332f()));
        if (compareTo != 0 || ((mo35332f() && (compareTo = C25082a.m62848l(this.locationDataAllowed, mVSetPrivacyPolicyRequest.locationDataAllowed)) != 0) || (compareTo = Boolean.valueOf(mo35334h()).compareTo(Boolean.valueOf(mVSetPrivacyPolicyRequest.mo35334h()))) != 0 || ((mo35334h() && (compareTo = C25082a.m62848l(this.sellingDataAllowed, mVSetPrivacyPolicyRequest.sellingDataAllowed)) != 0) || (compareTo = Boolean.valueOf(mo35333g()).compareTo(Boolean.valueOf(mVSetPrivacyPolicyRequest.mo35333g()))) != 0))) {
            return compareTo;
        }
        if (!mo35333g() || (l = C25082a.m62848l(this.personalizedAdsAllowed, mVSetPrivacyPolicyRequest.personalizedAdsAllowed)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVSetPrivacyPolicyRequest)) {
            return mo35329a((MVSetPrivacyPolicyRequest) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35332f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo35333g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo35334h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo35336i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo35337j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo35338k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSetPrivacyPolicyRequest(", "locationDataAllowed:");
        C13555b.m33977q(n, this.locationDataAllowed, ", ", "sellingDataAllowed:");
        n.append(this.sellingDataAllowed);
        if (mo35333g()) {
            n.append(", ");
            n.append("personalizedAdsAllowed:");
            n.append(this.personalizedAdsAllowed);
        }
        n.append(")");
        return n.toString();
    }
}
