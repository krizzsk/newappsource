package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVPTBBillingUpcomingStatement implements TBase<MVPTBBillingUpcomingStatement, _Fields>, Serializable, Cloneable, Comparable<MVPTBBillingUpcomingStatement> {

    /* renamed from: b */
    public static final C25113c f27856b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27857c = new C25113c("fullPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27858d = new C25113c("calculationTime", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f27859e = new C25113c("period", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f27860f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27861g;
    private byte __isset_bitfield = 0;
    public long calculationTime;
    public MVCurrencyAmount fullPrice;
    private _Fields[] optionals = {_Fields.FULL_PRICE};
    public MVPTBBillingStatementPeriod period;
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        PRICE(1, InAppPurchaseMetaData.KEY_PRICE),
        FULL_PRICE(2, "fullPrice"),
        CALCULATION_TIME(3, "calculationTime"),
        PERIOD(4, "period");
        
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
                return PRICE;
            }
            if (i == 2) {
                return FULL_PRICE;
            }
            if (i == 3) {
                return CALCULATION_TIME;
            }
            if (i != 4) {
                return null;
            }
            return PERIOD;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingUpcomingStatement$a */
    public static class C10177a extends C25239c<MVPTBBillingUpcomingStatement> {
        public C10177a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = (MVPTBBillingUpcomingStatement) tBase;
            mVPTBBillingUpcomingStatement.mo30883k();
            C25113c cVar = MVPTBBillingUpcomingStatement.f27856b;
            gVar.mo61687K();
            if (mVPTBBillingUpcomingStatement.price != null) {
                gVar.mo61711x(MVPTBBillingUpcomingStatement.f27856b);
                mVPTBBillingUpcomingStatement.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBBillingUpcomingStatement.fullPrice != null && mVPTBBillingUpcomingStatement.mo30878g()) {
                gVar.mo61711x(MVPTBBillingUpcomingStatement.f27857c);
                mVPTBBillingUpcomingStatement.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPTBBillingUpcomingStatement.f27858d);
            gVar.mo61679C(mVPTBBillingUpcomingStatement.calculationTime);
            gVar.mo61712y();
            if (mVPTBBillingUpcomingStatement.period != null) {
                gVar.mo61711x(MVPTBBillingUpcomingStatement.f27859e);
                gVar.mo61678B(mVPTBBillingUpcomingStatement.period.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = (MVPTBBillingUpcomingStatement) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPTBBillingUpcomingStatement.mo30883k();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVPTBBillingUpcomingStatement.period = MVPTBBillingStatementPeriod.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVPTBBillingUpcomingStatement.calculationTime = gVar.mo61697j();
                            mVPTBBillingUpcomingStatement.mo30882j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                        mVPTBBillingUpcomingStatement.fullPrice = mVCurrencyAmount;
                        mVCurrencyAmount.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVPTBBillingUpcomingStatement.price = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingUpcomingStatement$b */
    public static class C10178b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10177a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingUpcomingStatement$c */
    public static class C10179c extends C25240d<MVPTBBillingUpcomingStatement> {
        public C10179c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = (MVPTBBillingUpcomingStatement) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBBillingUpcomingStatement.mo30881i()) {
                bitSet.set(0);
            }
            if (mVPTBBillingUpcomingStatement.mo30878g()) {
                bitSet.set(1);
            }
            if (mVPTBBillingUpcomingStatement.mo30877f()) {
                bitSet.set(2);
            }
            if (mVPTBBillingUpcomingStatement.mo30879h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPTBBillingUpcomingStatement.mo30881i()) {
                mVPTBBillingUpcomingStatement.price.mo25202X0(jVar);
            }
            if (mVPTBBillingUpcomingStatement.mo30878g()) {
                mVPTBBillingUpcomingStatement.fullPrice.mo25202X0(jVar);
            }
            if (mVPTBBillingUpcomingStatement.mo30877f()) {
                jVar.mo61679C(mVPTBBillingUpcomingStatement.calculationTime);
            }
            if (mVPTBBillingUpcomingStatement.mo30879h()) {
                jVar.mo61678B(mVPTBBillingUpcomingStatement.period.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = (MVPTBBillingUpcomingStatement) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPTBBillingUpcomingStatement.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVPTBBillingUpcomingStatement.fullPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPTBBillingUpcomingStatement.calculationTime = jVar.mo61697j();
                mVPTBBillingUpcomingStatement.mo30882j();
            }
            if (T.get(3)) {
                mVPTBBillingUpcomingStatement.period = MVPTBBillingStatementPeriod.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingUpcomingStatement$d */
    public static class C10180d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10179c(0);
        }
    }

    static {
        new C17394d0("MVPTBBillingUpcomingStatement");
        HashMap hashMap = new HashMap();
        f27860f = hashMap;
        hashMap.put(C25239c.class, new C10178b());
        hashMap.put(C25240d.class, new C10180d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.CALCULATION_TIME, new FieldMetaData("calculationTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.PERIOD, new FieldMetaData("period", (byte) 3, new EnumMetaData(MVPTBBillingStatementPeriod.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27861g = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBBillingUpcomingStatement.class, unmodifiableMap);
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
        ((C25238b) f27860f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27860f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30874a(MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement) {
        if (mVPTBBillingUpcomingStatement == null) {
            return false;
        }
        boolean i = mo30881i();
        boolean i2 = mVPTBBillingUpcomingStatement.mo30881i();
        if ((i || i2) && (!i || !i2 || !this.price.mo26102a(mVPTBBillingUpcomingStatement.price))) {
            return false;
        }
        boolean g = mo30878g();
        boolean g2 = mVPTBBillingUpcomingStatement.mo30878g();
        if (((g || g2) && (!g || !g2 || !this.fullPrice.mo26102a(mVPTBBillingUpcomingStatement.fullPrice))) || this.calculationTime != mVPTBBillingUpcomingStatement.calculationTime) {
            return false;
        }
        boolean h = mo30879h();
        boolean h2 = mVPTBBillingUpcomingStatement.mo30879h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.period.equals(mVPTBBillingUpcomingStatement.period)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = (MVPTBBillingUpcomingStatement) obj;
        if (!getClass().equals(mVPTBBillingUpcomingStatement.getClass())) {
            return getClass().getName().compareTo(mVPTBBillingUpcomingStatement.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30881i()).compareTo(Boolean.valueOf(mVPTBBillingUpcomingStatement.mo30881i()));
        if (compareTo2 != 0 || ((mo30881i() && (compareTo2 = this.price.compareTo(mVPTBBillingUpcomingStatement.price)) != 0) || (compareTo2 = Boolean.valueOf(mo30878g()).compareTo(Boolean.valueOf(mVPTBBillingUpcomingStatement.mo30878g()))) != 0 || ((mo30878g() && (compareTo2 = this.fullPrice.compareTo(mVPTBBillingUpcomingStatement.fullPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo30877f()).compareTo(Boolean.valueOf(mVPTBBillingUpcomingStatement.mo30877f()))) != 0 || ((mo30877f() && (compareTo2 = C25082a.m62840d(this.calculationTime, mVPTBBillingUpcomingStatement.calculationTime)) != 0) || (compareTo2 = Boolean.valueOf(mo30879h()).compareTo(Boolean.valueOf(mVPTBBillingUpcomingStatement.mo30879h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30879h() || (compareTo = this.period.compareTo(mVPTBBillingUpcomingStatement.period)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPTBBillingUpcomingStatement)) {
            return mo30874a((MVPTBBillingUpcomingStatement) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30877f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30878g() {
        return this.fullPrice != null;
    }

    /* renamed from: h */
    public final boolean mo30879h() {
        return this.period != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30881i() {
        return this.price != null;
    }

    /* renamed from: j */
    public final void mo30882j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo30883k() throws TException {
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount != null) {
            mVCurrencyAmount.getClass();
        }
        MVCurrencyAmount mVCurrencyAmount2 = this.fullPrice;
        if (mVCurrencyAmount2 != null) {
            mVCurrencyAmount2.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBBillingUpcomingStatement(", "price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo30878g()) {
            n.append(", ");
            n.append("fullPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.fullPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        n.append(", ");
        n.append("calculationTime:");
        C25541a.m63889t(n, this.calculationTime, ", ", "period:");
        MVPTBBillingStatementPeriod mVPTBBillingStatementPeriod = this.period;
        if (mVPTBBillingStatementPeriod == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBBillingStatementPeriod);
        }
        n.append(")");
        return n.toString();
    }
}
