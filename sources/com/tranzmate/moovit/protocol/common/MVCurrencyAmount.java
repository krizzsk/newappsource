package com.tranzmate.moovit.protocol.common;

import com.appboy.support.StringUtils;
import com.appsflyer.AppsFlyerProperties;
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

public class MVCurrencyAmount implements TBase<MVCurrencyAmount, _Fields>, Serializable, Cloneable, Comparable<MVCurrencyAmount> {

    /* renamed from: b */
    public static final C25113c f24985b = new C25113c("balance", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f24986c = new C25113c("currencyId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24987d = new C25113c("currencySymbol", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24988e = new C25113c(AppsFlyerProperties.CURRENCY_CODE, (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f24989f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24990g;
    private byte __isset_bitfield = 0;
    public long balance;
    public String currencyCode;
    public int currencyId;
    public String currencySymbol;

    public enum _Fields implements C25085c {
        BALANCE(1, "balance"),
        CURRENCY_ID(2, "currencyId"),
        CURRENCY_SYMBOL(3, "currencySymbol"),
        CURRENCY_CODE(4, AppsFlyerProperties.CURRENCY_CODE);
        
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
                return BALANCE;
            }
            if (i == 2) {
                return CURRENCY_ID;
            }
            if (i == 3) {
                return CURRENCY_SYMBOL;
            }
            if (i != 4) {
                return null;
            }
            return CURRENCY_CODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVCurrencyAmount$a */
    public static class C8376a extends C25239c<MVCurrencyAmount> {
        public C8376a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCurrencyAmount mVCurrencyAmount = (MVCurrencyAmount) tBase;
            mVCurrencyAmount.getClass();
            C25113c cVar = MVCurrencyAmount.f24985b;
            gVar.mo61687K();
            gVar.mo61711x(MVCurrencyAmount.f24985b);
            gVar.mo61679C(mVCurrencyAmount.balance);
            gVar.mo61712y();
            gVar.mo61711x(MVCurrencyAmount.f24986c);
            gVar.mo61678B(mVCurrencyAmount.currencyId);
            gVar.mo61712y();
            if (mVCurrencyAmount.currencySymbol != null) {
                gVar.mo61711x(MVCurrencyAmount.f24987d);
                gVar.mo61686J(mVCurrencyAmount.currencySymbol);
                gVar.mo61712y();
            }
            if (mVCurrencyAmount.currencyCode != null) {
                gVar.mo61711x(MVCurrencyAmount.f24988e);
                gVar.mo61686J(mVCurrencyAmount.currencyCode);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCurrencyAmount mVCurrencyAmount = (MVCurrencyAmount) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCurrencyAmount.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVCurrencyAmount.currencyCode = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVCurrencyAmount.currencySymbol = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVCurrencyAmount.currencyId = gVar.mo61696i();
                        mVCurrencyAmount.mo26111k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVCurrencyAmount.balance = gVar.mo61697j();
                    mVCurrencyAmount.mo26110j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVCurrencyAmount$b */
    public static class C8377b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8376a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVCurrencyAmount$c */
    public static class C8378c extends C25240d<MVCurrencyAmount> {
        public C8378c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCurrencyAmount mVCurrencyAmount = (MVCurrencyAmount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCurrencyAmount.mo26105f()) {
                bitSet.set(0);
            }
            if (mVCurrencyAmount.mo26107h()) {
                bitSet.set(1);
            }
            if (mVCurrencyAmount.mo26109i()) {
                bitSet.set(2);
            }
            if (mVCurrencyAmount.mo26106g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVCurrencyAmount.mo26105f()) {
                jVar.mo61679C(mVCurrencyAmount.balance);
            }
            if (mVCurrencyAmount.mo26107h()) {
                jVar.mo61678B(mVCurrencyAmount.currencyId);
            }
            if (mVCurrencyAmount.mo26109i()) {
                jVar.mo61686J(mVCurrencyAmount.currencySymbol);
            }
            if (mVCurrencyAmount.mo26106g()) {
                jVar.mo61686J(mVCurrencyAmount.currencyCode);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCurrencyAmount mVCurrencyAmount = (MVCurrencyAmount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVCurrencyAmount.balance = jVar.mo61697j();
                mVCurrencyAmount.mo26110j();
            }
            if (T.get(1)) {
                mVCurrencyAmount.currencyId = jVar.mo61696i();
                mVCurrencyAmount.mo26111k();
            }
            if (T.get(2)) {
                mVCurrencyAmount.currencySymbol = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCurrencyAmount.currencyCode = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVCurrencyAmount$d */
    public static class C8379d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8378c(0);
        }
    }

    static {
        new C17394d0("MVCurrencyAmount");
        HashMap hashMap = new HashMap();
        f24989f = hashMap;
        hashMap.put(C25239c.class, new C8377b());
        hashMap.put(C25240d.class, new C8379d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BALANCE, new FieldMetaData("balance", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.CURRENCY_ID, new FieldMetaData("currencyId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CURRENCY_SYMBOL, new FieldMetaData("currencySymbol", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CURRENCY_CODE, new FieldMetaData(AppsFlyerProperties.CURRENCY_CODE, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24990g = unmodifiableMap;
        FieldMetaData.m61947a(MVCurrencyAmount.class, unmodifiableMap);
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
        ((C25238b) f24989f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24989f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26102a(MVCurrencyAmount mVCurrencyAmount) {
        if (mVCurrencyAmount == null || this.balance != mVCurrencyAmount.balance || this.currencyId != mVCurrencyAmount.currencyId) {
            return false;
        }
        boolean i = mo26109i();
        boolean i2 = mVCurrencyAmount.mo26109i();
        if ((i || i2) && (!i || !i2 || !this.currencySymbol.equals(mVCurrencyAmount.currencySymbol))) {
            return false;
        }
        boolean g = mo26106g();
        boolean g2 = mVCurrencyAmount.mo26106g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.currencyCode.equals(mVCurrencyAmount.currencyCode)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCurrencyAmount mVCurrencyAmount = (MVCurrencyAmount) obj;
        if (!getClass().equals(mVCurrencyAmount.getClass())) {
            return getClass().getName().compareTo(mVCurrencyAmount.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26105f()).compareTo(Boolean.valueOf(mVCurrencyAmount.mo26105f()));
        if (compareTo2 != 0 || ((mo26105f() && (compareTo2 = C25082a.m62840d(this.balance, mVCurrencyAmount.balance)) != 0) || (compareTo2 = Boolean.valueOf(mo26107h()).compareTo(Boolean.valueOf(mVCurrencyAmount.mo26107h()))) != 0 || ((mo26107h() && (compareTo2 = C25082a.m62839c(this.currencyId, mVCurrencyAmount.currencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo26109i()).compareTo(Boolean.valueOf(mVCurrencyAmount.mo26109i()))) != 0 || ((mo26109i() && (compareTo2 = this.currencySymbol.compareTo(mVCurrencyAmount.currencySymbol)) != 0) || (compareTo2 = Boolean.valueOf(mo26106g()).compareTo(Boolean.valueOf(mVCurrencyAmount.mo26106g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo26106g() || (compareTo = this.currencyCode.compareTo(mVCurrencyAmount.currencyCode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCurrencyAmount)) {
            return mo26102a((MVCurrencyAmount) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26105f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26106g() {
        return this.currencyCode != null;
    }

    /* renamed from: h */
    public final boolean mo26107h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26109i() {
        return this.currencySymbol != null;
    }

    /* renamed from: j */
    public final void mo26110j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo26111k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCurrencyAmount(", "balance:");
        C25541a.m63889t(n, this.balance, ", ", "currencyId:");
        C0016g.m42z(n, this.currencyId, ", ", "currencySymbol:");
        String str = this.currencySymbol;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("currencyCode:");
        String str2 = this.currencyCode;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
