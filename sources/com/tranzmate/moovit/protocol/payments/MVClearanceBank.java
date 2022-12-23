package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVClearanceBank implements TBase<MVClearanceBank, _Fields>, Serializable, Cloneable, Comparable<MVClearanceBank> {

    /* renamed from: b */
    public static final C25113c f27163b = new C25113c("bankId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27164c = new C25113c("bankName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27165d = new C25113c("image", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27166e = new C25113c("clearanceBankType", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27167f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27168g;
    private byte __isset_bitfield = 0;
    public int bankId;
    public String bankName;
    public String clearanceBankType;
    public MVImageReferenceWithParams image;

    public enum _Fields implements C25085c {
        BANK_ID(1, "bankId"),
        BANK_NAME(2, "bankName"),
        IMAGE(3, "image"),
        CLEARANCE_BANK_TYPE(4, "clearanceBankType");
        
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
                return BANK_ID;
            }
            if (i == 2) {
                return BANK_NAME;
            }
            if (i == 3) {
                return IMAGE;
            }
            if (i != 4) {
                return null;
            }
            return CLEARANCE_BANK_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceBank$a */
    public static class C9648a extends C25239c<MVClearanceBank> {
        public C9648a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClearanceBank mVClearanceBank = (MVClearanceBank) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVClearanceBank.image;
            C25113c cVar = MVClearanceBank.f27163b;
            gVar.mo61687K();
            gVar.mo61711x(MVClearanceBank.f27163b);
            gVar.mo61678B(mVClearanceBank.bankId);
            gVar.mo61712y();
            if (mVClearanceBank.bankName != null) {
                gVar.mo61711x(MVClearanceBank.f27164c);
                gVar.mo61686J(mVClearanceBank.bankName);
                gVar.mo61712y();
            }
            if (mVClearanceBank.image != null) {
                gVar.mo61711x(MVClearanceBank.f27165d);
                mVClearanceBank.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVClearanceBank.clearanceBankType != null) {
                gVar.mo61711x(MVClearanceBank.f27166e);
                gVar.mo61686J(mVClearanceBank.clearanceBankType);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClearanceBank mVClearanceBank = (MVClearanceBank) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVClearanceBank.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVClearanceBank.clearanceBankType = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVClearanceBank.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVClearanceBank.bankName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVClearanceBank.bankId = gVar.mo61696i();
                    mVClearanceBank.mo29686j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceBank$b */
    public static class C9649b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9648a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceBank$c */
    public static class C9650c extends C25240d<MVClearanceBank> {
        public C9650c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClearanceBank mVClearanceBank = (MVClearanceBank) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVClearanceBank.mo29681f()) {
                bitSet.set(0);
            }
            if (mVClearanceBank.mo29682g()) {
                bitSet.set(1);
            }
            if (mVClearanceBank.mo29685i()) {
                bitSet.set(2);
            }
            if (mVClearanceBank.mo29683h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVClearanceBank.mo29681f()) {
                jVar.mo61678B(mVClearanceBank.bankId);
            }
            if (mVClearanceBank.mo29682g()) {
                jVar.mo61686J(mVClearanceBank.bankName);
            }
            if (mVClearanceBank.mo29685i()) {
                mVClearanceBank.image.mo25202X0(jVar);
            }
            if (mVClearanceBank.mo29683h()) {
                jVar.mo61686J(mVClearanceBank.clearanceBankType);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClearanceBank mVClearanceBank = (MVClearanceBank) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVClearanceBank.bankId = jVar.mo61696i();
                mVClearanceBank.mo29686j();
            }
            if (T.get(1)) {
                mVClearanceBank.bankName = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVClearanceBank.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVClearanceBank.clearanceBankType = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceBank$d */
    public static class C9651d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9650c(0);
        }
    }

    static {
        new C17394d0("MVClearanceBank");
        HashMap hashMap = new HashMap();
        f27167f = hashMap;
        hashMap.put(C25239c.class, new C9649b());
        hashMap.put(C25240d.class, new C9651d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BANK_ID, new FieldMetaData("bankId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.BANK_NAME, new FieldMetaData("bankName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.CLEARANCE_BANK_TYPE, new FieldMetaData("clearanceBankType", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27168g = unmodifiableMap;
        FieldMetaData.m61947a(MVClearanceBank.class, unmodifiableMap);
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
        ((C25238b) f27167f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27167f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVClearanceBank mVClearanceBank = (MVClearanceBank) obj;
        if (!getClass().equals(mVClearanceBank.getClass())) {
            return getClass().getName().compareTo(mVClearanceBank.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29681f()).compareTo(Boolean.valueOf(mVClearanceBank.mo29681f()));
        if (compareTo2 != 0 || ((mo29681f() && (compareTo2 = C25082a.m62839c(this.bankId, mVClearanceBank.bankId)) != 0) || (compareTo2 = Boolean.valueOf(mo29682g()).compareTo(Boolean.valueOf(mVClearanceBank.mo29682g()))) != 0 || ((mo29682g() && (compareTo2 = this.bankName.compareTo(mVClearanceBank.bankName)) != 0) || (compareTo2 = Boolean.valueOf(mo29685i()).compareTo(Boolean.valueOf(mVClearanceBank.mo29685i()))) != 0 || ((mo29685i() && (compareTo2 = this.image.compareTo(mVClearanceBank.image)) != 0) || (compareTo2 = Boolean.valueOf(mo29683h()).compareTo(Boolean.valueOf(mVClearanceBank.mo29683h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29683h() || (compareTo = this.clearanceBankType.compareTo(mVClearanceBank.clearanceBankType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVClearanceBank)) {
            return false;
        }
        MVClearanceBank mVClearanceBank = (MVClearanceBank) obj;
        if (this.bankId != mVClearanceBank.bankId) {
            return false;
        }
        boolean g = mo29682g();
        boolean g2 = mVClearanceBank.mo29682g();
        if ((g || g2) && (!g || !g2 || !this.bankName.equals(mVClearanceBank.bankName))) {
            return false;
        }
        boolean i = mo29685i();
        boolean i2 = mVClearanceBank.mo29685i();
        if ((i || i2) && (!i || !i2 || !this.image.mo26245a(mVClearanceBank.image))) {
            return false;
        }
        boolean h = mo29683h();
        boolean h2 = mVClearanceBank.mo29683h();
        if ((h || h2) && (!h || !h2 || !this.clearanceBankType.equals(mVClearanceBank.clearanceBankType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29681f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29682g() {
        return this.bankName != null;
    }

    /* renamed from: h */
    public final boolean mo29683h() {
        return this.clearanceBankType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29685i() {
        return this.image != null;
    }

    /* renamed from: j */
    public final void mo29686j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVClearanceBank(", "bankId:");
        C0016g.m42z(n, this.bankId, ", ", "bankName:");
        String str = this.bankName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("image:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("clearanceBankType:");
        String str2 = this.clearanceBankType;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
