package com.tranzmate.moovit.protocol.discounts;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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

public class MVDiscount implements TBase<MVDiscount, _Fields>, Serializable, Cloneable, Comparable<MVDiscount> {

    /* renamed from: b */
    public static final C25113c f25577b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25578c = new C25113c("tag", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25579d = new C25113c("label", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25580e = new C25113c("amount", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f25581f = new C25113c("isRemoveable", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f25582g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25583h;
    private byte __isset_bitfield = 0;
    public MVCurrencyAmount amount;

    /* renamed from: id */
    public String f25584id;
    public boolean isRemoveable;
    public String label;
    public String tag;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        TAG(2, "tag"),
        LABEL(3, "label"),
        AMOUNT(4, "amount"),
        IS_REMOVEABLE(5, "isRemoveable");
        
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
                return ID;
            }
            if (i == 2) {
                return TAG;
            }
            if (i == 3) {
                return LABEL;
            }
            if (i == 4) {
                return AMOUNT;
            }
            if (i != 5) {
                return null;
            }
            return IS_REMOVEABLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.discounts.MVDiscount$a */
    public static class C8694a extends C25239c<MVDiscount> {
        public C8694a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDiscount mVDiscount = (MVDiscount) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVDiscount.amount;
            C25113c cVar = MVDiscount.f25577b;
            gVar.mo61687K();
            if (mVDiscount.f25584id != null) {
                gVar.mo61711x(MVDiscount.f25577b);
                gVar.mo61686J(mVDiscount.f25584id);
                gVar.mo61712y();
            }
            if (mVDiscount.tag != null) {
                gVar.mo61711x(MVDiscount.f25578c);
                gVar.mo61686J(mVDiscount.tag);
                gVar.mo61712y();
            }
            if (mVDiscount.label != null) {
                gVar.mo61711x(MVDiscount.f25579d);
                gVar.mo61686J(mVDiscount.label);
                gVar.mo61712y();
            }
            if (mVDiscount.amount != null) {
                gVar.mo61711x(MVDiscount.f25580e);
                mVDiscount.amount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDiscount.f25581f);
            C0017h.m62S(gVar, mVDiscount.isRemoveable);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDiscount mVDiscount = (MVDiscount) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVDiscount.amount;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 2) {
                                    mVDiscount.isRemoveable = gVar.mo61690c();
                                    mVDiscount.mo27128k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                                mVDiscount.amount = mVCurrencyAmount2;
                                mVCurrencyAmount2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVDiscount.label = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVDiscount.tag = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVDiscount.f25584id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.discounts.MVDiscount$b */
    public static class C8695b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8694a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.discounts.MVDiscount$c */
    public static class C8696c extends C25240d<MVDiscount> {
        public C8696c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDiscount mVDiscount = (MVDiscount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDiscount.mo27123g()) {
                bitSet.set(0);
            }
            if (mVDiscount.mo27127j()) {
                bitSet.set(1);
            }
            if (mVDiscount.mo27126i()) {
                bitSet.set(2);
            }
            if (mVDiscount.mo27122f()) {
                bitSet.set(3);
            }
            if (mVDiscount.mo27124h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVDiscount.mo27123g()) {
                jVar.mo61686J(mVDiscount.f25584id);
            }
            if (mVDiscount.mo27127j()) {
                jVar.mo61686J(mVDiscount.tag);
            }
            if (mVDiscount.mo27126i()) {
                jVar.mo61686J(mVDiscount.label);
            }
            if (mVDiscount.mo27122f()) {
                mVDiscount.amount.mo25202X0(jVar);
            }
            if (mVDiscount.mo27124h()) {
                jVar.mo61708u(mVDiscount.isRemoveable);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDiscount mVDiscount = (MVDiscount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVDiscount.f25584id = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDiscount.tag = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVDiscount.label = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVDiscount.amount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVDiscount.isRemoveable = jVar.mo61690c();
                mVDiscount.mo27128k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.discounts.MVDiscount$d */
    public static class C8697d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8696c(0);
        }
    }

    static {
        new C17394d0("MVDiscount");
        HashMap hashMap = new HashMap();
        f25582g = hashMap;
        hashMap.put(C25239c.class, new C8695b());
        hashMap.put(C25240d.class, new C8697d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TAG, new FieldMetaData("tag", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LABEL, new FieldMetaData("label", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AMOUNT, new FieldMetaData("amount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.IS_REMOVEABLE, new FieldMetaData("isRemoveable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25583h = unmodifiableMap;
        FieldMetaData.m61947a(MVDiscount.class, unmodifiableMap);
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
        ((C25238b) f25582g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25582g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVDiscount mVDiscount = (MVDiscount) obj;
        if (!getClass().equals(mVDiscount.getClass())) {
            return getClass().getName().compareTo(mVDiscount.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27123g()).compareTo(Boolean.valueOf(mVDiscount.mo27123g()));
        if (compareTo != 0 || ((mo27123g() && (compareTo = this.f25584id.compareTo(mVDiscount.f25584id)) != 0) || (compareTo = Boolean.valueOf(mo27127j()).compareTo(Boolean.valueOf(mVDiscount.mo27127j()))) != 0 || ((mo27127j() && (compareTo = this.tag.compareTo(mVDiscount.tag)) != 0) || (compareTo = Boolean.valueOf(mo27126i()).compareTo(Boolean.valueOf(mVDiscount.mo27126i()))) != 0 || ((mo27126i() && (compareTo = this.label.compareTo(mVDiscount.label)) != 0) || (compareTo = Boolean.valueOf(mo27122f()).compareTo(Boolean.valueOf(mVDiscount.mo27122f()))) != 0 || ((mo27122f() && (compareTo = this.amount.compareTo(mVDiscount.amount)) != 0) || (compareTo = Boolean.valueOf(mo27124h()).compareTo(Boolean.valueOf(mVDiscount.mo27124h()))) != 0))))) {
            return compareTo;
        }
        if (!mo27124h() || (l = C25082a.m62848l(this.isRemoveable, mVDiscount.isRemoveable)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDiscount)) {
            return false;
        }
        MVDiscount mVDiscount = (MVDiscount) obj;
        boolean g = mo27123g();
        boolean g2 = mVDiscount.mo27123g();
        if ((g || g2) && (!g || !g2 || !this.f25584id.equals(mVDiscount.f25584id))) {
            return false;
        }
        boolean j = mo27127j();
        boolean j2 = mVDiscount.mo27127j();
        if ((j || j2) && (!j || !j2 || !this.tag.equals(mVDiscount.tag))) {
            return false;
        }
        boolean i = mo27126i();
        boolean i2 = mVDiscount.mo27126i();
        if ((i || i2) && (!i || !i2 || !this.label.equals(mVDiscount.label))) {
            return false;
        }
        boolean f = mo27122f();
        boolean f2 = mVDiscount.mo27122f();
        if (((f || f2) && (!f || !f2 || !this.amount.mo26102a(mVDiscount.amount))) || this.isRemoveable != mVDiscount.isRemoveable) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27122f() {
        return this.amount != null;
    }

    /* renamed from: g */
    public final boolean mo27123g() {
        return this.f25584id != null;
    }

    /* renamed from: h */
    public final boolean mo27124h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27126i() {
        return this.label != null;
    }

    /* renamed from: j */
    public final boolean mo27127j() {
        return this.tag != null;
    }

    /* renamed from: k */
    public final void mo27128k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDiscount(", "id:");
        String str = this.f25584id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("tag:");
        String str2 = this.tag;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("label:");
        String str3 = this.label;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("amount:");
        MVCurrencyAmount mVCurrencyAmount = this.amount;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("isRemoveable:");
        return C25541a.m63885p(n, this.isRemoveable, ")");
    }
}
