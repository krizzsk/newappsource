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

public class MVMerchantCapabilities implements TBase<MVMerchantCapabilities, _Fields>, Serializable, Cloneable, Comparable<MVMerchantCapabilities> {

    /* renamed from: b */
    public static final C25113c f27355b = new C25113c("supports3DS", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f27356c = new C25113c("supportsEMV", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f27357d = new C25113c("supportsDebit", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f27358e = new C25113c("supportsCredit", (byte) 2, 4);

    /* renamed from: f */
    public static final HashMap f27359f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27360g;
    private byte __isset_bitfield = 0;
    public boolean supports3DS;
    public boolean supportsCredit;
    public boolean supportsDebit;
    public boolean supportsEMV;

    public enum _Fields implements C25085c {
        SUPPORTS3_DS(1, "supports3DS"),
        SUPPORTS_EMV(2, "supportsEMV"),
        SUPPORTS_DEBIT(3, "supportsDebit"),
        SUPPORTS_CREDIT(4, "supportsCredit");
        
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
                return SUPPORTS3_DS;
            }
            if (i == 2) {
                return SUPPORTS_EMV;
            }
            if (i == 3) {
                return SUPPORTS_DEBIT;
            }
            if (i != 4) {
                return null;
            }
            return SUPPORTS_CREDIT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMerchantCapabilities$a */
    public static class C9817a extends C25239c<MVMerchantCapabilities> {
        public C9817a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMerchantCapabilities mVMerchantCapabilities = (MVMerchantCapabilities) tBase;
            mVMerchantCapabilities.getClass();
            C25113c cVar = MVMerchantCapabilities.f27355b;
            gVar.mo61687K();
            gVar.mo61711x(MVMerchantCapabilities.f27355b);
            gVar.mo61708u(mVMerchantCapabilities.supports3DS);
            gVar.mo61712y();
            gVar.mo61711x(MVMerchantCapabilities.f27356c);
            gVar.mo61708u(mVMerchantCapabilities.supportsEMV);
            gVar.mo61712y();
            gVar.mo61711x(MVMerchantCapabilities.f27357d);
            gVar.mo61708u(mVMerchantCapabilities.supportsDebit);
            gVar.mo61712y();
            gVar.mo61711x(MVMerchantCapabilities.f27358e);
            C0017h.m62S(gVar, mVMerchantCapabilities.supportsCredit);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMerchantCapabilities mVMerchantCapabilities = (MVMerchantCapabilities) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMerchantCapabilities.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 2) {
                                mVMerchantCapabilities.supportsCredit = gVar.mo61690c();
                                mVMerchantCapabilities.mo30024k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVMerchantCapabilities.supportsDebit = gVar.mo61690c();
                            mVMerchantCapabilities.mo30025l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVMerchantCapabilities.supportsEMV = gVar.mo61690c();
                        mVMerchantCapabilities.mo30026m();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVMerchantCapabilities.supports3DS = gVar.mo61690c();
                    mVMerchantCapabilities.mo30023j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMerchantCapabilities$b */
    public static class C9818b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9817a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMerchantCapabilities$c */
    public static class C9819c extends C25240d<MVMerchantCapabilities> {
        public C9819c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMerchantCapabilities mVMerchantCapabilities = (MVMerchantCapabilities) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMerchantCapabilities.mo30018f()) {
                bitSet.set(0);
            }
            if (mVMerchantCapabilities.mo30022i()) {
                bitSet.set(1);
            }
            if (mVMerchantCapabilities.mo30020h()) {
                bitSet.set(2);
            }
            if (mVMerchantCapabilities.mo30019g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMerchantCapabilities.mo30018f()) {
                jVar.mo61708u(mVMerchantCapabilities.supports3DS);
            }
            if (mVMerchantCapabilities.mo30022i()) {
                jVar.mo61708u(mVMerchantCapabilities.supportsEMV);
            }
            if (mVMerchantCapabilities.mo30020h()) {
                jVar.mo61708u(mVMerchantCapabilities.supportsDebit);
            }
            if (mVMerchantCapabilities.mo30019g()) {
                jVar.mo61708u(mVMerchantCapabilities.supportsCredit);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMerchantCapabilities mVMerchantCapabilities = (MVMerchantCapabilities) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVMerchantCapabilities.supports3DS = jVar.mo61690c();
                mVMerchantCapabilities.mo30023j();
            }
            if (T.get(1)) {
                mVMerchantCapabilities.supportsEMV = jVar.mo61690c();
                mVMerchantCapabilities.mo30026m();
            }
            if (T.get(2)) {
                mVMerchantCapabilities.supportsDebit = jVar.mo61690c();
                mVMerchantCapabilities.mo30025l();
            }
            if (T.get(3)) {
                mVMerchantCapabilities.supportsCredit = jVar.mo61690c();
                mVMerchantCapabilities.mo30024k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMerchantCapabilities$d */
    public static class C9820d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9819c(0);
        }
    }

    static {
        new C17394d0("MVMerchantCapabilities");
        HashMap hashMap = new HashMap();
        f27359f = hashMap;
        hashMap.put(C25239c.class, new C9818b());
        hashMap.put(C25240d.class, new C9820d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPPORTS3_DS, new FieldMetaData("supports3DS", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SUPPORTS_EMV, new FieldMetaData("supportsEMV", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SUPPORTS_DEBIT, new FieldMetaData("supportsDebit", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SUPPORTS_CREDIT, new FieldMetaData("supportsCredit", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27360g = unmodifiableMap;
        FieldMetaData.m61947a(MVMerchantCapabilities.class, unmodifiableMap);
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
        ((C25238b) f27359f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27359f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30015a(MVMerchantCapabilities mVMerchantCapabilities) {
        if (mVMerchantCapabilities != null && this.supports3DS == mVMerchantCapabilities.supports3DS && this.supportsEMV == mVMerchantCapabilities.supportsEMV && this.supportsDebit == mVMerchantCapabilities.supportsDebit && this.supportsCredit == mVMerchantCapabilities.supportsCredit) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVMerchantCapabilities mVMerchantCapabilities = (MVMerchantCapabilities) obj;
        if (!getClass().equals(mVMerchantCapabilities.getClass())) {
            return getClass().getName().compareTo(mVMerchantCapabilities.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30018f()).compareTo(Boolean.valueOf(mVMerchantCapabilities.mo30018f()));
        if (compareTo != 0 || ((mo30018f() && (compareTo = C25082a.m62848l(this.supports3DS, mVMerchantCapabilities.supports3DS)) != 0) || (compareTo = Boolean.valueOf(mo30022i()).compareTo(Boolean.valueOf(mVMerchantCapabilities.mo30022i()))) != 0 || ((mo30022i() && (compareTo = C25082a.m62848l(this.supportsEMV, mVMerchantCapabilities.supportsEMV)) != 0) || (compareTo = Boolean.valueOf(mo30020h()).compareTo(Boolean.valueOf(mVMerchantCapabilities.mo30020h()))) != 0 || ((mo30020h() && (compareTo = C25082a.m62848l(this.supportsDebit, mVMerchantCapabilities.supportsDebit)) != 0) || (compareTo = Boolean.valueOf(mo30019g()).compareTo(Boolean.valueOf(mVMerchantCapabilities.mo30019g()))) != 0)))) {
            return compareTo;
        }
        if (!mo30019g() || (l = C25082a.m62848l(this.supportsCredit, mVMerchantCapabilities.supportsCredit)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMerchantCapabilities)) {
            return mo30015a((MVMerchantCapabilities) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30018f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30019g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo30020h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30022i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final void mo30023j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo30024k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: l */
    public final void mo30025l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo30026m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMerchantCapabilities(", "supports3DS:");
        C13555b.m33977q(n, this.supports3DS, ", ", "supportsEMV:");
        C13555b.m33977q(n, this.supportsEMV, ", ", "supportsDebit:");
        C13555b.m33977q(n, this.supportsDebit, ", ", "supportsCredit:");
        return C25541a.m63885p(n, this.supportsCredit, ")");
    }
}
