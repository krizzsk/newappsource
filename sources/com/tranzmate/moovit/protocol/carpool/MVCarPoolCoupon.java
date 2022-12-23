package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
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

public class MVCarPoolCoupon implements TBase<MVCarPoolCoupon, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolCoupon> {

    /* renamed from: b */
    public static final C25113c f24616b = new C25113c("code", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24617c = new C25113c("driverBonusAmount", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24618d = new C25113c("passengerCreditAmount", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f24619e = new C25113c("landingPageUrl", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f24620f = new C25113c("passengerCreditValidityDays", (byte) 6, 5);

    /* renamed from: g */
    public static final HashMap f24621g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f24622h;
    private byte __isset_bitfield = 0;
    public String code;
    public MVCarPoolPrice driverBonusAmount;
    public String landingPageUrl;
    private _Fields[] optionals = {_Fields.PASSENGER_CREDIT_VALIDITY_DAYS};
    public MVCarPoolPrice passengerCreditAmount;
    public short passengerCreditValidityDays;

    public enum _Fields implements C25085c {
        CODE(1, "code"),
        DRIVER_BONUS_AMOUNT(2, "driverBonusAmount"),
        PASSENGER_CREDIT_AMOUNT(3, "passengerCreditAmount"),
        LANDING_PAGE_URL(4, "landingPageUrl"),
        PASSENGER_CREDIT_VALIDITY_DAYS(5, "passengerCreditValidityDays");
        
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
                return CODE;
            }
            if (i == 2) {
                return DRIVER_BONUS_AMOUNT;
            }
            if (i == 3) {
                return PASSENGER_CREDIT_AMOUNT;
            }
            if (i == 4) {
                return LANDING_PAGE_URL;
            }
            if (i != 5) {
                return null;
            }
            return PASSENGER_CREDIT_VALIDITY_DAYS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolCoupon$a */
    public static class C8149a extends C25239c<MVCarPoolCoupon> {
        public C8149a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolCoupon mVCarPoolCoupon = (MVCarPoolCoupon) tBase;
            MVCarPoolPrice mVCarPoolPrice = mVCarPoolCoupon.driverBonusAmount;
            C25113c cVar = MVCarPoolCoupon.f24616b;
            gVar.mo61687K();
            if (mVCarPoolCoupon.code != null) {
                gVar.mo61711x(MVCarPoolCoupon.f24616b);
                gVar.mo61686J(mVCarPoolCoupon.code);
                gVar.mo61712y();
            }
            if (mVCarPoolCoupon.driverBonusAmount != null) {
                gVar.mo61711x(MVCarPoolCoupon.f24617c);
                mVCarPoolCoupon.driverBonusAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarPoolCoupon.passengerCreditAmount != null) {
                gVar.mo61711x(MVCarPoolCoupon.f24618d);
                mVCarPoolCoupon.passengerCreditAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarPoolCoupon.landingPageUrl != null) {
                gVar.mo61711x(MVCarPoolCoupon.f24619e);
                gVar.mo61686J(mVCarPoolCoupon.landingPageUrl);
                gVar.mo61712y();
            }
            if (mVCarPoolCoupon.mo25428j()) {
                gVar.mo61711x(MVCarPoolCoupon.f24620f);
                gVar.mo61677A(mVCarPoolCoupon.passengerCreditValidityDays);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolCoupon mVCarPoolCoupon = (MVCarPoolCoupon) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCarPoolPrice mVCarPoolPrice = mVCarPoolCoupon.driverBonusAmount;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 6) {
                                    mVCarPoolCoupon.passengerCreditValidityDays = gVar.mo61695h();
                                    mVCarPoolCoupon.mo25429k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVCarPoolCoupon.landingPageUrl = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                            mVCarPoolCoupon.passengerCreditAmount = mVCarPoolPrice2;
                            mVCarPoolPrice2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCarPoolPrice mVCarPoolPrice3 = new MVCarPoolPrice();
                        mVCarPoolCoupon.driverBonusAmount = mVCarPoolPrice3;
                        mVCarPoolPrice3.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCarPoolCoupon.code = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolCoupon$b */
    public static class C8150b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8149a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolCoupon$c */
    public static class C8151c extends C25240d<MVCarPoolCoupon> {
        public C8151c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolCoupon mVCarPoolCoupon = (MVCarPoolCoupon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolCoupon.mo25423f()) {
                bitSet.set(0);
            }
            if (mVCarPoolCoupon.mo25424g()) {
                bitSet.set(1);
            }
            if (mVCarPoolCoupon.mo25427i()) {
                bitSet.set(2);
            }
            if (mVCarPoolCoupon.mo25425h()) {
                bitSet.set(3);
            }
            if (mVCarPoolCoupon.mo25428j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVCarPoolCoupon.mo25423f()) {
                jVar.mo61686J(mVCarPoolCoupon.code);
            }
            if (mVCarPoolCoupon.mo25424g()) {
                mVCarPoolCoupon.driverBonusAmount.mo25202X0(jVar);
            }
            if (mVCarPoolCoupon.mo25427i()) {
                mVCarPoolCoupon.passengerCreditAmount.mo25202X0(jVar);
            }
            if (mVCarPoolCoupon.mo25425h()) {
                jVar.mo61686J(mVCarPoolCoupon.landingPageUrl);
            }
            if (mVCarPoolCoupon.mo25428j()) {
                jVar.mo61677A(mVCarPoolCoupon.passengerCreditValidityDays);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolCoupon mVCarPoolCoupon = (MVCarPoolCoupon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVCarPoolCoupon.code = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                mVCarPoolCoupon.driverBonusAmount = mVCarPoolPrice;
                mVCarPoolPrice.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                mVCarPoolCoupon.passengerCreditAmount = mVCarPoolPrice2;
                mVCarPoolPrice2.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVCarPoolCoupon.landingPageUrl = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVCarPoolCoupon.passengerCreditValidityDays = jVar.mo61695h();
                mVCarPoolCoupon.mo25429k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolCoupon$d */
    public static class C8152d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8151c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolCoupon");
        HashMap hashMap = new HashMap();
        f24621g = hashMap;
        hashMap.put(C25239c.class, new C8150b());
        hashMap.put(C25240d.class, new C8152d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CODE, new FieldMetaData("code", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DRIVER_BONUS_AMOUNT, new FieldMetaData("driverBonusAmount", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.PASSENGER_CREDIT_AMOUNT, new FieldMetaData("passengerCreditAmount", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.LANDING_PAGE_URL, new FieldMetaData("landingPageUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PASSENGER_CREDIT_VALIDITY_DAYS, new FieldMetaData("passengerCreditValidityDays", (byte) 2, new FieldValueMetaData((byte) 6, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24622h = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolCoupon.class, unmodifiableMap);
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
        ((C25238b) f24621g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24621g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25420a(MVCarPoolCoupon mVCarPoolCoupon) {
        if (mVCarPoolCoupon == null) {
            return false;
        }
        boolean f = mo25423f();
        boolean f2 = mVCarPoolCoupon.mo25423f();
        if ((f || f2) && (!f || !f2 || !this.code.equals(mVCarPoolCoupon.code))) {
            return false;
        }
        boolean g = mo25424g();
        boolean g2 = mVCarPoolCoupon.mo25424g();
        if ((g || g2) && (!g || !g2 || !this.driverBonusAmount.mo25461a(mVCarPoolCoupon.driverBonusAmount))) {
            return false;
        }
        boolean i = mo25427i();
        boolean i2 = mVCarPoolCoupon.mo25427i();
        if ((i || i2) && (!i || !i2 || !this.passengerCreditAmount.mo25461a(mVCarPoolCoupon.passengerCreditAmount))) {
            return false;
        }
        boolean h = mo25425h();
        boolean h2 = mVCarPoolCoupon.mo25425h();
        if ((h || h2) && (!h || !h2 || !this.landingPageUrl.equals(mVCarPoolCoupon.landingPageUrl))) {
            return false;
        }
        boolean j = mo25428j();
        boolean j2 = mVCarPoolCoupon.mo25428j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || this.passengerCreditValidityDays != mVCarPoolCoupon.passengerCreditValidityDays) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int k;
        MVCarPoolCoupon mVCarPoolCoupon = (MVCarPoolCoupon) obj;
        if (!getClass().equals(mVCarPoolCoupon.getClass())) {
            return getClass().getName().compareTo(mVCarPoolCoupon.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25423f()).compareTo(Boolean.valueOf(mVCarPoolCoupon.mo25423f()));
        if (compareTo != 0 || ((mo25423f() && (compareTo = this.code.compareTo(mVCarPoolCoupon.code)) != 0) || (compareTo = Boolean.valueOf(mo25424g()).compareTo(Boolean.valueOf(mVCarPoolCoupon.mo25424g()))) != 0 || ((mo25424g() && (compareTo = this.driverBonusAmount.compareTo(mVCarPoolCoupon.driverBonusAmount)) != 0) || (compareTo = Boolean.valueOf(mo25427i()).compareTo(Boolean.valueOf(mVCarPoolCoupon.mo25427i()))) != 0 || ((mo25427i() && (compareTo = this.passengerCreditAmount.compareTo(mVCarPoolCoupon.passengerCreditAmount)) != 0) || (compareTo = Boolean.valueOf(mo25425h()).compareTo(Boolean.valueOf(mVCarPoolCoupon.mo25425h()))) != 0 || ((mo25425h() && (compareTo = this.landingPageUrl.compareTo(mVCarPoolCoupon.landingPageUrl)) != 0) || (compareTo = Boolean.valueOf(mo25428j()).compareTo(Boolean.valueOf(mVCarPoolCoupon.mo25428j()))) != 0))))) {
            return compareTo;
        }
        if (!mo25428j() || (k = C25082a.m62847k(this.passengerCreditValidityDays, mVCarPoolCoupon.passengerCreditValidityDays)) == 0) {
            return 0;
        }
        return k;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCarPoolCoupon)) {
            return mo25420a((MVCarPoolCoupon) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25423f() {
        return this.code != null;
    }

    /* renamed from: g */
    public final boolean mo25424g() {
        return this.driverBonusAmount != null;
    }

    /* renamed from: h */
    public final boolean mo25425h() {
        return this.landingPageUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25427i() {
        return this.passengerCreditAmount != null;
    }

    /* renamed from: j */
    public final boolean mo25428j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo25429k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolCoupon(", "code:");
        String str = this.code;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("driverBonusAmount:");
        MVCarPoolPrice mVCarPoolPrice = this.driverBonusAmount;
        if (mVCarPoolPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice);
        }
        n.append(", ");
        n.append("passengerCreditAmount:");
        MVCarPoolPrice mVCarPoolPrice2 = this.passengerCreditAmount;
        if (mVCarPoolPrice2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice2);
        }
        n.append(", ");
        n.append("landingPageUrl:");
        String str2 = this.landingPageUrl;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo25428j()) {
            n.append(", ");
            n.append("passengerCreditValidityDays:");
            n.append(this.passengerCreditValidityDays);
        }
        n.append(")");
        return n.toString();
    }
}
