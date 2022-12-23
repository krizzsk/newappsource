package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVStoredValueAmount implements TBase<MVStoredValueAmount, _Fields>, Serializable, Cloneable, Comparable<MVStoredValueAmount> {

    /* renamed from: b */
    public static final C25113c f29095b = new C25113c("amount", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29096c = new C25113c("isDefault", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f29097d = new C25113c("explanation", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29098e = new C25113c("name", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f29099f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29100g;
    private byte __isset_bitfield = 0;
    public MVCurrencyAmount amount;
    public String explanation;
    public boolean isDefault;
    public String name;
    private _Fields[] optionals = {_Fields.EXPLANATION};

    public enum _Fields implements C25085c {
        AMOUNT(1, "amount"),
        IS_DEFAULT(2, "isDefault"),
        EXPLANATION(3, "explanation"),
        NAME(4, "name");
        
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
                return AMOUNT;
            }
            if (i == 2) {
                return IS_DEFAULT;
            }
            if (i == 3) {
                return EXPLANATION;
            }
            if (i != 4) {
                return null;
            }
            return NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueAmount$a */
    public static class C11030a extends C25239c<MVStoredValueAmount> {
        public C11030a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStoredValueAmount mVStoredValueAmount = (MVStoredValueAmount) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVStoredValueAmount.amount;
            C25113c cVar = MVStoredValueAmount.f29095b;
            gVar.mo61687K();
            if (mVStoredValueAmount.amount != null) {
                gVar.mo61711x(MVStoredValueAmount.f29095b);
                mVStoredValueAmount.amount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStoredValueAmount.f29096c);
            gVar.mo61708u(mVStoredValueAmount.isDefault);
            gVar.mo61712y();
            if (mVStoredValueAmount.explanation != null && mVStoredValueAmount.mo32944g()) {
                gVar.mo61711x(MVStoredValueAmount.f29097d);
                gVar.mo61686J(mVStoredValueAmount.explanation);
                gVar.mo61712y();
            }
            if (mVStoredValueAmount.name != null) {
                gVar.mo61711x(MVStoredValueAmount.f29098e);
                gVar.mo61686J(mVStoredValueAmount.name);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStoredValueAmount mVStoredValueAmount = (MVStoredValueAmount) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVStoredValueAmount.amount;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVStoredValueAmount.name = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVStoredValueAmount.explanation = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVStoredValueAmount.isDefault = gVar.mo61690c();
                        mVStoredValueAmount.mo32948j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVStoredValueAmount.amount = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueAmount$b */
    public static class C11031b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11030a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueAmount$c */
    public static class C11032c extends C25240d<MVStoredValueAmount> {
        public C11032c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStoredValueAmount mVStoredValueAmount = (MVStoredValueAmount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStoredValueAmount.mo32943f()) {
                bitSet.set(0);
            }
            if (mVStoredValueAmount.mo32945h()) {
                bitSet.set(1);
            }
            if (mVStoredValueAmount.mo32944g()) {
                bitSet.set(2);
            }
            if (mVStoredValueAmount.mo32947i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVStoredValueAmount.mo32943f()) {
                mVStoredValueAmount.amount.mo25202X0(jVar);
            }
            if (mVStoredValueAmount.mo32945h()) {
                jVar.mo61708u(mVStoredValueAmount.isDefault);
            }
            if (mVStoredValueAmount.mo32944g()) {
                jVar.mo61686J(mVStoredValueAmount.explanation);
            }
            if (mVStoredValueAmount.mo32947i()) {
                jVar.mo61686J(mVStoredValueAmount.name);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStoredValueAmount mVStoredValueAmount = (MVStoredValueAmount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVStoredValueAmount.amount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVStoredValueAmount.isDefault = jVar.mo61690c();
                mVStoredValueAmount.mo32948j();
            }
            if (T.get(2)) {
                mVStoredValueAmount.explanation = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVStoredValueAmount.name = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueAmount$d */
    public static class C11033d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11032c(0);
        }
    }

    static {
        new C17394d0("MVStoredValueAmount");
        HashMap hashMap = new HashMap();
        f29099f = hashMap;
        hashMap.put(C25239c.class, new C11031b());
        hashMap.put(C25240d.class, new C11033d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AMOUNT, new FieldMetaData("amount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.IS_DEFAULT, new FieldMetaData("isDefault", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.EXPLANATION, new FieldMetaData("explanation", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29100g = unmodifiableMap;
        FieldMetaData.m61947a(MVStoredValueAmount.class, unmodifiableMap);
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
        ((C25238b) f29099f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29099f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32940a(MVStoredValueAmount mVStoredValueAmount) {
        if (mVStoredValueAmount == null) {
            return false;
        }
        boolean f = mo32943f();
        boolean f2 = mVStoredValueAmount.mo32943f();
        if (((f || f2) && (!f || !f2 || !this.amount.mo26102a(mVStoredValueAmount.amount))) || this.isDefault != mVStoredValueAmount.isDefault) {
            return false;
        }
        boolean g = mo32944g();
        boolean g2 = mVStoredValueAmount.mo32944g();
        if ((g || g2) && (!g || !g2 || !this.explanation.equals(mVStoredValueAmount.explanation))) {
            return false;
        }
        boolean i = mo32947i();
        boolean i2 = mVStoredValueAmount.mo32947i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.name.equals(mVStoredValueAmount.name)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVStoredValueAmount mVStoredValueAmount = (MVStoredValueAmount) obj;
        if (!getClass().equals(mVStoredValueAmount.getClass())) {
            return getClass().getName().compareTo(mVStoredValueAmount.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32943f()).compareTo(Boolean.valueOf(mVStoredValueAmount.mo32943f()));
        if (compareTo2 != 0 || ((mo32943f() && (compareTo2 = this.amount.compareTo(mVStoredValueAmount.amount)) != 0) || (compareTo2 = Boolean.valueOf(mo32945h()).compareTo(Boolean.valueOf(mVStoredValueAmount.mo32945h()))) != 0 || ((mo32945h() && (compareTo2 = C25082a.m62848l(this.isDefault, mVStoredValueAmount.isDefault)) != 0) || (compareTo2 = Boolean.valueOf(mo32944g()).compareTo(Boolean.valueOf(mVStoredValueAmount.mo32944g()))) != 0 || ((mo32944g() && (compareTo2 = this.explanation.compareTo(mVStoredValueAmount.explanation)) != 0) || (compareTo2 = Boolean.valueOf(mo32947i()).compareTo(Boolean.valueOf(mVStoredValueAmount.mo32947i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo32947i() || (compareTo = this.name.compareTo(mVStoredValueAmount.name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVStoredValueAmount)) {
            return mo32940a((MVStoredValueAmount) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32943f() {
        return this.amount != null;
    }

    /* renamed from: g */
    public final boolean mo32944g() {
        return this.explanation != null;
    }

    /* renamed from: h */
    public final boolean mo32945h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32947i() {
        return this.name != null;
    }

    /* renamed from: j */
    public final void mo32948j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStoredValueAmount(", "amount:");
        MVCurrencyAmount mVCurrencyAmount = this.amount;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("isDefault:");
        n.append(this.isDefault);
        if (mo32944g()) {
            n.append(", ");
            n.append("explanation:");
            String str = this.explanation;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
