package com.tranzmate.moovit.protocol.transitcardalert;

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

public class MVBalanceStat implements TBase<MVBalanceStat, _Fields>, Serializable, Cloneable, Comparable<MVBalanceStat> {

    /* renamed from: b */
    public static final C25113c f29799b = new C25113c("balance", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29800c = new C25113c("pendingBalance", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29801d = new C25113c("isInLowBalance", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f29802e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29803f;
    private byte __isset_bitfield = 0;
    public MVCurrencyAmount balance;
    public boolean isInLowBalance;
    private _Fields[] optionals = {_Fields.PENDING_BALANCE};
    public MVCurrencyAmount pendingBalance;

    public enum _Fields implements C25085c {
        BALANCE(1, "balance"),
        PENDING_BALANCE(2, "pendingBalance"),
        IS_IN_LOW_BALANCE(3, "isInLowBalance");
        
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
                return PENDING_BALANCE;
            }
            if (i != 3) {
                return null;
            }
            return IS_IN_LOW_BALANCE;
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

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVBalanceStat$a */
    public static class C11477a extends C25239c<MVBalanceStat> {
        public C11477a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBalanceStat mVBalanceStat = (MVBalanceStat) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVBalanceStat.balance;
            C25113c cVar = MVBalanceStat.f29799b;
            gVar.mo61687K();
            if (mVBalanceStat.balance != null) {
                gVar.mo61711x(MVBalanceStat.f29799b);
                mVBalanceStat.balance.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBalanceStat.pendingBalance != null && mVBalanceStat.mo34107h()) {
                gVar.mo61711x(MVBalanceStat.f29800c);
                mVBalanceStat.pendingBalance.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVBalanceStat.f29801d);
            C0017h.m62S(gVar, mVBalanceStat.isInLowBalance);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBalanceStat mVBalanceStat = (MVBalanceStat) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVBalanceStat.balance;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVBalanceStat.isInLowBalance = gVar.mo61690c();
                            mVBalanceStat.mo34109i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVBalanceStat.pendingBalance = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount3 = new MVCurrencyAmount();
                    mVBalanceStat.balance = mVCurrencyAmount3;
                    mVCurrencyAmount3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVBalanceStat$b */
    public static class C11478b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11477a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVBalanceStat$c */
    public static class C11479c extends C25240d<MVBalanceStat> {
        public C11479c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBalanceStat mVBalanceStat = (MVBalanceStat) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBalanceStat.mo34105f()) {
                bitSet.set(0);
            }
            if (mVBalanceStat.mo34107h()) {
                bitSet.set(1);
            }
            if (mVBalanceStat.mo34106g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVBalanceStat.mo34105f()) {
                mVBalanceStat.balance.mo25202X0(jVar);
            }
            if (mVBalanceStat.mo34107h()) {
                mVBalanceStat.pendingBalance.mo25202X0(jVar);
            }
            if (mVBalanceStat.mo34106g()) {
                jVar.mo61708u(mVBalanceStat.isInLowBalance);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBalanceStat mVBalanceStat = (MVBalanceStat) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVBalanceStat.balance = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVBalanceStat.pendingBalance = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVBalanceStat.isInLowBalance = jVar.mo61690c();
                mVBalanceStat.mo34109i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVBalanceStat$d */
    public static class C11480d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11479c(0);
        }
    }

    static {
        new C17394d0("MVBalanceStat");
        HashMap hashMap = new HashMap();
        f29802e = hashMap;
        hashMap.put(C25239c.class, new C11478b());
        hashMap.put(C25240d.class, new C11480d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BALANCE, new FieldMetaData("balance", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PENDING_BALANCE, new FieldMetaData("pendingBalance", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.IS_IN_LOW_BALANCE, new FieldMetaData("isInLowBalance", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29803f = unmodifiableMap;
        FieldMetaData.m61947a(MVBalanceStat.class, unmodifiableMap);
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
        ((C25238b) f29802e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29802e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34102a(MVBalanceStat mVBalanceStat) {
        if (mVBalanceStat == null) {
            return false;
        }
        boolean f = mo34105f();
        boolean f2 = mVBalanceStat.mo34105f();
        if ((f || f2) && (!f || !f2 || !this.balance.mo26102a(mVBalanceStat.balance))) {
            return false;
        }
        boolean h = mo34107h();
        boolean h2 = mVBalanceStat.mo34107h();
        if (((h || h2) && (!h || !h2 || !this.pendingBalance.mo26102a(mVBalanceStat.pendingBalance))) || this.isInLowBalance != mVBalanceStat.isInLowBalance) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVBalanceStat mVBalanceStat = (MVBalanceStat) obj;
        if (!getClass().equals(mVBalanceStat.getClass())) {
            return getClass().getName().compareTo(mVBalanceStat.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34105f()).compareTo(Boolean.valueOf(mVBalanceStat.mo34105f()));
        if (compareTo != 0 || ((mo34105f() && (compareTo = this.balance.compareTo(mVBalanceStat.balance)) != 0) || (compareTo = Boolean.valueOf(mo34107h()).compareTo(Boolean.valueOf(mVBalanceStat.mo34107h()))) != 0 || ((mo34107h() && (compareTo = this.pendingBalance.compareTo(mVBalanceStat.pendingBalance)) != 0) || (compareTo = Boolean.valueOf(mo34106g()).compareTo(Boolean.valueOf(mVBalanceStat.mo34106g()))) != 0))) {
            return compareTo;
        }
        if (!mo34106g() || (l = C25082a.m62848l(this.isInLowBalance, mVBalanceStat.isInLowBalance)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVBalanceStat)) {
            return mo34102a((MVBalanceStat) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34105f() {
        return this.balance != null;
    }

    /* renamed from: g */
    public final boolean mo34106g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34107h() {
        return this.pendingBalance != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo34109i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBalanceStat(", "balance:");
        MVCurrencyAmount mVCurrencyAmount = this.balance;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo34107h()) {
            n.append(", ");
            n.append("pendingBalance:");
            MVCurrencyAmount mVCurrencyAmount2 = this.pendingBalance;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        n.append(", ");
        n.append("isInLowBalance:");
        return C25541a.m63885p(n, this.isInLowBalance, ")");
    }
}
