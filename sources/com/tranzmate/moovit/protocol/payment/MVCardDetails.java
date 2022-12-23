package com.tranzmate.moovit.protocol.payment;

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
import p531he.C17394d0;
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

public class MVCardDetails implements TBase<MVCardDetails, _Fields>, Serializable, Cloneable, Comparable<MVCardDetails> {

    /* renamed from: b */
    public static final C25113c f26872b = new C25113c("cardType", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26873c = new C25113c("cardLastFourDigits", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26874d = new C25113c("cardMonthExpiration", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26875e = new C25113c("cardYearExpiration", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26876f = new C25113c("cvv", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26877g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26878h;
    public String cardLastFourDigits;
    public String cardMonthExpiration;
    public String cardType;
    public String cardYearExpiration;
    public String cvv;
    private _Fields[] optionals = {_Fields.CARD_TYPE};

    public enum _Fields implements C25085c {
        CARD_TYPE(1, "cardType"),
        CARD_LAST_FOUR_DIGITS(2, "cardLastFourDigits"),
        CARD_MONTH_EXPIRATION(3, "cardMonthExpiration"),
        CARD_YEAR_EXPIRATION(4, "cardYearExpiration"),
        CVV(5, "cvv");
        
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
                return CARD_TYPE;
            }
            if (i == 2) {
                return CARD_LAST_FOUR_DIGITS;
            }
            if (i == 3) {
                return CARD_MONTH_EXPIRATION;
            }
            if (i == 4) {
                return CARD_YEAR_EXPIRATION;
            }
            if (i != 5) {
                return null;
            }
            return CVV;
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

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVCardDetails$a */
    public static class C9445a extends C25239c<MVCardDetails> {
        public C9445a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCardDetails mVCardDetails = (MVCardDetails) tBase;
            mVCardDetails.getClass();
            C25113c cVar = MVCardDetails.f26872b;
            gVar.mo61687K();
            if (mVCardDetails.cardType != null && mVCardDetails.mo29232h()) {
                gVar.mo61711x(MVCardDetails.f26872b);
                gVar.mo61686J(mVCardDetails.cardType);
                gVar.mo61712y();
            }
            if (mVCardDetails.cardLastFourDigits != null) {
                gVar.mo61711x(MVCardDetails.f26873c);
                gVar.mo61686J(mVCardDetails.cardLastFourDigits);
                gVar.mo61712y();
            }
            if (mVCardDetails.cardMonthExpiration != null) {
                gVar.mo61711x(MVCardDetails.f26874d);
                gVar.mo61686J(mVCardDetails.cardMonthExpiration);
                gVar.mo61712y();
            }
            if (mVCardDetails.cardYearExpiration != null) {
                gVar.mo61711x(MVCardDetails.f26875e);
                gVar.mo61686J(mVCardDetails.cardYearExpiration);
                gVar.mo61712y();
            }
            if (mVCardDetails.cvv != null) {
                gVar.mo61711x(MVCardDetails.f26876f);
                gVar.mo61686J(mVCardDetails.cvv);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCardDetails mVCardDetails = (MVCardDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCardDetails.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVCardDetails.cvv = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVCardDetails.cardYearExpiration = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVCardDetails.cardMonthExpiration = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCardDetails.cardLastFourDigits = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCardDetails.cardType = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVCardDetails$b */
    public static class C9446b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9445a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVCardDetails$c */
    public static class C9447c extends C25240d<MVCardDetails> {
        public C9447c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCardDetails mVCardDetails = (MVCardDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCardDetails.mo29232h()) {
                bitSet.set(0);
            }
            if (mVCardDetails.mo29230f()) {
                bitSet.set(1);
            }
            if (mVCardDetails.mo29231g()) {
                bitSet.set(2);
            }
            if (mVCardDetails.mo29234i()) {
                bitSet.set(3);
            }
            if (mVCardDetails.mo29235j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVCardDetails.mo29232h()) {
                jVar.mo61686J(mVCardDetails.cardType);
            }
            if (mVCardDetails.mo29230f()) {
                jVar.mo61686J(mVCardDetails.cardLastFourDigits);
            }
            if (mVCardDetails.mo29231g()) {
                jVar.mo61686J(mVCardDetails.cardMonthExpiration);
            }
            if (mVCardDetails.mo29234i()) {
                jVar.mo61686J(mVCardDetails.cardYearExpiration);
            }
            if (mVCardDetails.mo29235j()) {
                jVar.mo61686J(mVCardDetails.cvv);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCardDetails mVCardDetails = (MVCardDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVCardDetails.cardType = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCardDetails.cardLastFourDigits = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCardDetails.cardMonthExpiration = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCardDetails.cardYearExpiration = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVCardDetails.cvv = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVCardDetails$d */
    public static class C9448d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9447c(0);
        }
    }

    static {
        new C17394d0("MVCardDetails");
        HashMap hashMap = new HashMap();
        f26877g = hashMap;
        hashMap.put(C25239c.class, new C9446b());
        hashMap.put(C25240d.class, new C9448d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CARD_TYPE, new FieldMetaData("cardType", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_LAST_FOUR_DIGITS, new FieldMetaData("cardLastFourDigits", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_MONTH_EXPIRATION, new FieldMetaData("cardMonthExpiration", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_YEAR_EXPIRATION, new FieldMetaData("cardYearExpiration", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CVV, new FieldMetaData("cvv", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26878h = unmodifiableMap;
        FieldMetaData.m61947a(MVCardDetails.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f26877g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26877g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29227a(MVCardDetails mVCardDetails) {
        if (mVCardDetails == null) {
            return false;
        }
        boolean h = mo29232h();
        boolean h2 = mVCardDetails.mo29232h();
        if ((h || h2) && (!h || !h2 || !this.cardType.equals(mVCardDetails.cardType))) {
            return false;
        }
        boolean f = mo29230f();
        boolean f2 = mVCardDetails.mo29230f();
        if ((f || f2) && (!f || !f2 || !this.cardLastFourDigits.equals(mVCardDetails.cardLastFourDigits))) {
            return false;
        }
        boolean g = mo29231g();
        boolean g2 = mVCardDetails.mo29231g();
        if ((g || g2) && (!g || !g2 || !this.cardMonthExpiration.equals(mVCardDetails.cardMonthExpiration))) {
            return false;
        }
        boolean i = mo29234i();
        boolean i2 = mVCardDetails.mo29234i();
        if ((i || i2) && (!i || !i2 || !this.cardYearExpiration.equals(mVCardDetails.cardYearExpiration))) {
            return false;
        }
        boolean j = mo29235j();
        boolean j2 = mVCardDetails.mo29235j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.cvv.equals(mVCardDetails.cvv)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCardDetails mVCardDetails = (MVCardDetails) obj;
        if (!getClass().equals(mVCardDetails.getClass())) {
            return getClass().getName().compareTo(mVCardDetails.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29232h()).compareTo(Boolean.valueOf(mVCardDetails.mo29232h()));
        if (compareTo2 != 0 || ((mo29232h() && (compareTo2 = this.cardType.compareTo(mVCardDetails.cardType)) != 0) || (compareTo2 = Boolean.valueOf(mo29230f()).compareTo(Boolean.valueOf(mVCardDetails.mo29230f()))) != 0 || ((mo29230f() && (compareTo2 = this.cardLastFourDigits.compareTo(mVCardDetails.cardLastFourDigits)) != 0) || (compareTo2 = Boolean.valueOf(mo29231g()).compareTo(Boolean.valueOf(mVCardDetails.mo29231g()))) != 0 || ((mo29231g() && (compareTo2 = this.cardMonthExpiration.compareTo(mVCardDetails.cardMonthExpiration)) != 0) || (compareTo2 = Boolean.valueOf(mo29234i()).compareTo(Boolean.valueOf(mVCardDetails.mo29234i()))) != 0 || ((mo29234i() && (compareTo2 = this.cardYearExpiration.compareTo(mVCardDetails.cardYearExpiration)) != 0) || (compareTo2 = Boolean.valueOf(mo29235j()).compareTo(Boolean.valueOf(mVCardDetails.mo29235j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29235j() || (compareTo = this.cvv.compareTo(mVCardDetails.cvv)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCardDetails)) {
            return mo29227a((MVCardDetails) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29230f() {
        return this.cardLastFourDigits != null;
    }

    /* renamed from: g */
    public final boolean mo29231g() {
        return this.cardMonthExpiration != null;
    }

    /* renamed from: h */
    public final boolean mo29232h() {
        return this.cardType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29234i() {
        return this.cardYearExpiration != null;
    }

    /* renamed from: j */
    public final boolean mo29235j() {
        return this.cvv != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVCardDetails(");
        if (mo29232h()) {
            sb.append("cardType:");
            String str = this.cardType;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("cardLastFourDigits:");
        String str2 = this.cardLastFourDigits;
        if (str2 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cardMonthExpiration:");
        String str3 = this.cardMonthExpiration;
        if (str3 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("cardYearExpiration:");
        String str4 = this.cardYearExpiration;
        if (str4 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("cvv:");
        String str5 = this.cvv;
        if (str5 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str5);
        }
        sb.append(")");
        return sb.toString();
    }
}
