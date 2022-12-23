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

public class MVSetGDPRPropertiesRequest implements TBase<MVSetGDPRPropertiesRequest, _Fields>, Serializable, Cloneable, Comparable<MVSetGDPRPropertiesRequest> {

    /* renamed from: b */
    public static final C25113c f30526b = new C25113c("canUseDataForPromotions", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f30527c = new C25113c("canUseDataForResearch", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f30528d = new C25113c("agreedToTermsOfUse", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f30529e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30530f;
    private byte __isset_bitfield = 0;
    public boolean agreedToTermsOfUse;
    public boolean canUseDataForPromotions;
    public boolean canUseDataForResearch;
    private _Fields[] optionals = {_Fields.CAN_USE_DATA_FOR_PROMOTIONS, _Fields.CAN_USE_DATA_FOR_RESEARCH, _Fields.AGREED_TO_TERMS_OF_USE};

    public enum _Fields implements C25085c {
        CAN_USE_DATA_FOR_PROMOTIONS(1, "canUseDataForPromotions"),
        CAN_USE_DATA_FOR_RESEARCH(2, "canUseDataForResearch"),
        AGREED_TO_TERMS_OF_USE(3, "agreedToTermsOfUse");
        
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
                return CAN_USE_DATA_FOR_PROMOTIONS;
            }
            if (i == 2) {
                return CAN_USE_DATA_FOR_RESEARCH;
            }
            if (i != 3) {
                return null;
            }
            return AGREED_TO_TERMS_OF_USE;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetGDPRPropertiesRequest$a */
    public static class C11889a extends C25239c<MVSetGDPRPropertiesRequest> {
        public C11889a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = (MVSetGDPRPropertiesRequest) tBase;
            mVSetGDPRPropertiesRequest.getClass();
            C25113c cVar = MVSetGDPRPropertiesRequest.f30526b;
            gVar.mo61687K();
            if (mVSetGDPRPropertiesRequest.mo35321g()) {
                gVar.mo61711x(MVSetGDPRPropertiesRequest.f30526b);
                gVar.mo61708u(mVSetGDPRPropertiesRequest.canUseDataForPromotions);
                gVar.mo61712y();
            }
            if (mVSetGDPRPropertiesRequest.mo35322h()) {
                gVar.mo61711x(MVSetGDPRPropertiesRequest.f30527c);
                gVar.mo61708u(mVSetGDPRPropertiesRequest.canUseDataForResearch);
                gVar.mo61712y();
            }
            if (mVSetGDPRPropertiesRequest.mo35320f()) {
                gVar.mo61711x(MVSetGDPRPropertiesRequest.f30528d);
                gVar.mo61708u(mVSetGDPRPropertiesRequest.agreedToTermsOfUse);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = (MVSetGDPRPropertiesRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetGDPRPropertiesRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVSetGDPRPropertiesRequest.agreedToTermsOfUse = gVar.mo61690c();
                            mVSetGDPRPropertiesRequest.mo35324i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVSetGDPRPropertiesRequest.canUseDataForResearch = gVar.mo61690c();
                        mVSetGDPRPropertiesRequest.mo35326k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVSetGDPRPropertiesRequest.canUseDataForPromotions = gVar.mo61690c();
                    mVSetGDPRPropertiesRequest.mo35325j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetGDPRPropertiesRequest$b */
    public static class C11890b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11889a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetGDPRPropertiesRequest$c */
    public static class C11891c extends C25240d<MVSetGDPRPropertiesRequest> {
        public C11891c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = (MVSetGDPRPropertiesRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetGDPRPropertiesRequest.mo35321g()) {
                bitSet.set(0);
            }
            if (mVSetGDPRPropertiesRequest.mo35322h()) {
                bitSet.set(1);
            }
            if (mVSetGDPRPropertiesRequest.mo35320f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSetGDPRPropertiesRequest.mo35321g()) {
                jVar.mo61708u(mVSetGDPRPropertiesRequest.canUseDataForPromotions);
            }
            if (mVSetGDPRPropertiesRequest.mo35322h()) {
                jVar.mo61708u(mVSetGDPRPropertiesRequest.canUseDataForResearch);
            }
            if (mVSetGDPRPropertiesRequest.mo35320f()) {
                jVar.mo61708u(mVSetGDPRPropertiesRequest.agreedToTermsOfUse);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = (MVSetGDPRPropertiesRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVSetGDPRPropertiesRequest.canUseDataForPromotions = jVar.mo61690c();
                mVSetGDPRPropertiesRequest.mo35325j();
            }
            if (T.get(1)) {
                mVSetGDPRPropertiesRequest.canUseDataForResearch = jVar.mo61690c();
                mVSetGDPRPropertiesRequest.mo35326k();
            }
            if (T.get(2)) {
                mVSetGDPRPropertiesRequest.agreedToTermsOfUse = jVar.mo61690c();
                mVSetGDPRPropertiesRequest.mo35324i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetGDPRPropertiesRequest$d */
    public static class C11892d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11891c(0);
        }
    }

    static {
        new C17394d0("MVSetGDPRPropertiesRequest");
        HashMap hashMap = new HashMap();
        f30529e = hashMap;
        hashMap.put(C25239c.class, new C11890b());
        hashMap.put(C25240d.class, new C11892d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CAN_USE_DATA_FOR_PROMOTIONS, new FieldMetaData("canUseDataForPromotions", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CAN_USE_DATA_FOR_RESEARCH, new FieldMetaData("canUseDataForResearch", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.AGREED_TO_TERMS_OF_USE, new FieldMetaData("agreedToTermsOfUse", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30530f = unmodifiableMap;
        FieldMetaData.m61947a(MVSetGDPRPropertiesRequest.class, unmodifiableMap);
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
        ((C25238b) f30529e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30529e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = (MVSetGDPRPropertiesRequest) obj;
        if (!getClass().equals(mVSetGDPRPropertiesRequest.getClass())) {
            return getClass().getName().compareTo(mVSetGDPRPropertiesRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35321g()).compareTo(Boolean.valueOf(mVSetGDPRPropertiesRequest.mo35321g()));
        if (compareTo != 0 || ((mo35321g() && (compareTo = C25082a.m62848l(this.canUseDataForPromotions, mVSetGDPRPropertiesRequest.canUseDataForPromotions)) != 0) || (compareTo = Boolean.valueOf(mo35322h()).compareTo(Boolean.valueOf(mVSetGDPRPropertiesRequest.mo35322h()))) != 0 || ((mo35322h() && (compareTo = C25082a.m62848l(this.canUseDataForResearch, mVSetGDPRPropertiesRequest.canUseDataForResearch)) != 0) || (compareTo = Boolean.valueOf(mo35320f()).compareTo(Boolean.valueOf(mVSetGDPRPropertiesRequest.mo35320f()))) != 0))) {
            return compareTo;
        }
        if (!mo35320f() || (l = C25082a.m62848l(this.agreedToTermsOfUse, mVSetGDPRPropertiesRequest.agreedToTermsOfUse)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetGDPRPropertiesRequest)) {
            return false;
        }
        MVSetGDPRPropertiesRequest mVSetGDPRPropertiesRequest = (MVSetGDPRPropertiesRequest) obj;
        boolean g = mo35321g();
        boolean g2 = mVSetGDPRPropertiesRequest.mo35321g();
        if ((g || g2) && (!g || !g2 || this.canUseDataForPromotions != mVSetGDPRPropertiesRequest.canUseDataForPromotions)) {
            return false;
        }
        boolean h = mo35322h();
        boolean h2 = mVSetGDPRPropertiesRequest.mo35322h();
        if ((h || h2) && (!h || !h2 || this.canUseDataForResearch != mVSetGDPRPropertiesRequest.canUseDataForResearch)) {
            return false;
        }
        boolean f = mo35320f();
        boolean f2 = mVSetGDPRPropertiesRequest.mo35320f();
        if ((f || f2) && (!f || !f2 || this.agreedToTermsOfUse != mVSetGDPRPropertiesRequest.agreedToTermsOfUse)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35320f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo35321g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo35322h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo35324i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: j */
    public final void mo35325j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo35326k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVSetGDPRPropertiesRequest(");
        boolean z2 = false;
        if (mo35321g()) {
            sb.append("canUseDataForPromotions:");
            sb.append(this.canUseDataForPromotions);
            z = false;
        } else {
            z = true;
        }
        if (mo35322h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("canUseDataForResearch:");
            sb.append(this.canUseDataForResearch);
        } else {
            z2 = z;
        }
        if (mo35320f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("agreedToTermsOfUse:");
            sb.append(this.agreedToTermsOfUse);
        }
        sb.append(")");
        return sb.toString();
    }
}
