package com.tranzmate.moovit.protocol.payments;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVPaymentMethodCardInfo implements TBase<MVPaymentMethodCardInfo, _Fields>, Serializable, Cloneable, Comparable<MVPaymentMethodCardInfo> {

    /* renamed from: b */
    public static final C25113c f27489b = new C25113c("cardType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27490c = new C25113c("lastDigits", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27491d = new C25113c("cardMonthExpiration", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27492e = new C25113c("cardYearExpiration", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27493f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27494g;
    public String cardMonthExpiration;
    public MVCardType cardType;
    public String cardYearExpiration;
    public String lastDigits;
    private _Fields[] optionals = {_Fields.CARD_TYPE, _Fields.CARD_MONTH_EXPIRATION, _Fields.CARD_YEAR_EXPIRATION};

    public enum _Fields implements C25085c {
        CARD_TYPE(1, "cardType"),
        LAST_DIGITS(2, "lastDigits"),
        CARD_MONTH_EXPIRATION(3, "cardMonthExpiration"),
        CARD_YEAR_EXPIRATION(4, "cardYearExpiration");
        
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
                return LAST_DIGITS;
            }
            if (i == 3) {
                return CARD_MONTH_EXPIRATION;
            }
            if (i != 4) {
                return null;
            }
            return CARD_YEAR_EXPIRATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodCardInfo$a */
    public static class C9906a extends C25239c<MVPaymentMethodCardInfo> {
        public C9906a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodCardInfo mVPaymentMethodCardInfo = (MVPaymentMethodCardInfo) tBase;
            mVPaymentMethodCardInfo.getClass();
            C25113c cVar = MVPaymentMethodCardInfo.f27489b;
            gVar.mo61687K();
            if (mVPaymentMethodCardInfo.cardType != null && mVPaymentMethodCardInfo.mo30237g()) {
                gVar.mo61711x(MVPaymentMethodCardInfo.f27489b);
                gVar.mo61678B(mVPaymentMethodCardInfo.cardType.getValue());
                gVar.mo61712y();
            }
            if (mVPaymentMethodCardInfo.lastDigits != null) {
                gVar.mo61711x(MVPaymentMethodCardInfo.f27490c);
                gVar.mo61686J(mVPaymentMethodCardInfo.lastDigits);
                gVar.mo61712y();
            }
            if (mVPaymentMethodCardInfo.cardMonthExpiration != null && mVPaymentMethodCardInfo.mo30236f()) {
                gVar.mo61711x(MVPaymentMethodCardInfo.f27491d);
                gVar.mo61686J(mVPaymentMethodCardInfo.cardMonthExpiration);
                gVar.mo61712y();
            }
            if (mVPaymentMethodCardInfo.cardYearExpiration != null && mVPaymentMethodCardInfo.mo30238h()) {
                gVar.mo61711x(MVPaymentMethodCardInfo.f27492e);
                gVar.mo61686J(mVPaymentMethodCardInfo.cardYearExpiration);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodCardInfo mVPaymentMethodCardInfo = (MVPaymentMethodCardInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentMethodCardInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVPaymentMethodCardInfo.cardYearExpiration = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVPaymentMethodCardInfo.cardMonthExpiration = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPaymentMethodCardInfo.lastDigits = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPaymentMethodCardInfo.cardType = MVCardType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodCardInfo$b */
    public static class C9907b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9906a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodCardInfo$c */
    public static class C9908c extends C25240d<MVPaymentMethodCardInfo> {
        public C9908c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodCardInfo mVPaymentMethodCardInfo = (MVPaymentMethodCardInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentMethodCardInfo.mo30237g()) {
                bitSet.set(0);
            }
            if (mVPaymentMethodCardInfo.mo30240i()) {
                bitSet.set(1);
            }
            if (mVPaymentMethodCardInfo.mo30236f()) {
                bitSet.set(2);
            }
            if (mVPaymentMethodCardInfo.mo30238h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPaymentMethodCardInfo.mo30237g()) {
                jVar.mo61678B(mVPaymentMethodCardInfo.cardType.getValue());
            }
            if (mVPaymentMethodCardInfo.mo30240i()) {
                jVar.mo61686J(mVPaymentMethodCardInfo.lastDigits);
            }
            if (mVPaymentMethodCardInfo.mo30236f()) {
                jVar.mo61686J(mVPaymentMethodCardInfo.cardMonthExpiration);
            }
            if (mVPaymentMethodCardInfo.mo30238h()) {
                jVar.mo61686J(mVPaymentMethodCardInfo.cardYearExpiration);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodCardInfo mVPaymentMethodCardInfo = (MVPaymentMethodCardInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPaymentMethodCardInfo.cardType = MVCardType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVPaymentMethodCardInfo.lastDigits = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPaymentMethodCardInfo.cardMonthExpiration = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPaymentMethodCardInfo.cardYearExpiration = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodCardInfo$d */
    public static class C9909d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9908c(0);
        }
    }

    static {
        new C17394d0("MVPaymentMethodCardInfo");
        HashMap hashMap = new HashMap();
        f27493f = hashMap;
        hashMap.put(C25239c.class, new C9907b());
        hashMap.put(C25240d.class, new C9909d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CARD_TYPE, new FieldMetaData("cardType", (byte) 2, new EnumMetaData(MVCardType.class)));
        enumMap.put(_Fields.LAST_DIGITS, new FieldMetaData("lastDigits", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_MONTH_EXPIRATION, new FieldMetaData("cardMonthExpiration", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_YEAR_EXPIRATION, new FieldMetaData("cardYearExpiration", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27494g = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentMethodCardInfo.class, unmodifiableMap);
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
        ((C25238b) f27493f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27493f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentMethodCardInfo mVPaymentMethodCardInfo = (MVPaymentMethodCardInfo) obj;
        if (!getClass().equals(mVPaymentMethodCardInfo.getClass())) {
            return getClass().getName().compareTo(mVPaymentMethodCardInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30237g()).compareTo(Boolean.valueOf(mVPaymentMethodCardInfo.mo30237g()));
        if (compareTo2 != 0 || ((mo30237g() && (compareTo2 = this.cardType.compareTo(mVPaymentMethodCardInfo.cardType)) != 0) || (compareTo2 = Boolean.valueOf(mo30240i()).compareTo(Boolean.valueOf(mVPaymentMethodCardInfo.mo30240i()))) != 0 || ((mo30240i() && (compareTo2 = this.lastDigits.compareTo(mVPaymentMethodCardInfo.lastDigits)) != 0) || (compareTo2 = Boolean.valueOf(mo30236f()).compareTo(Boolean.valueOf(mVPaymentMethodCardInfo.mo30236f()))) != 0 || ((mo30236f() && (compareTo2 = this.cardMonthExpiration.compareTo(mVPaymentMethodCardInfo.cardMonthExpiration)) != 0) || (compareTo2 = Boolean.valueOf(mo30238h()).compareTo(Boolean.valueOf(mVPaymentMethodCardInfo.mo30238h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30238h() || (compareTo = this.cardYearExpiration.compareTo(mVPaymentMethodCardInfo.cardYearExpiration)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentMethodCardInfo)) {
            return false;
        }
        MVPaymentMethodCardInfo mVPaymentMethodCardInfo = (MVPaymentMethodCardInfo) obj;
        boolean g = mo30237g();
        boolean g2 = mVPaymentMethodCardInfo.mo30237g();
        if ((g || g2) && (!g || !g2 || !this.cardType.equals(mVPaymentMethodCardInfo.cardType))) {
            return false;
        }
        boolean i = mo30240i();
        boolean i2 = mVPaymentMethodCardInfo.mo30240i();
        if ((i || i2) && (!i || !i2 || !this.lastDigits.equals(mVPaymentMethodCardInfo.lastDigits))) {
            return false;
        }
        boolean f = mo30236f();
        boolean f2 = mVPaymentMethodCardInfo.mo30236f();
        if ((f || f2) && (!f || !f2 || !this.cardMonthExpiration.equals(mVPaymentMethodCardInfo.cardMonthExpiration))) {
            return false;
        }
        boolean h = mo30238h();
        boolean h2 = mVPaymentMethodCardInfo.mo30238h();
        if ((h || h2) && (!h || !h2 || !this.cardYearExpiration.equals(mVPaymentMethodCardInfo.cardYearExpiration))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30236f() {
        return this.cardMonthExpiration != null;
    }

    /* renamed from: g */
    public final boolean mo30237g() {
        return this.cardType != null;
    }

    /* renamed from: h */
    public final boolean mo30238h() {
        return this.cardYearExpiration != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30240i() {
        return this.lastDigits != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPaymentMethodCardInfo(");
        if (mo30237g()) {
            sb.append("cardType:");
            MVCardType mVCardType = this.cardType;
            if (mVCardType == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCardType);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("lastDigits:");
        String str = this.lastDigits;
        if (str == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str);
        }
        if (mo30236f()) {
            sb.append(", ");
            sb.append("cardMonthExpiration:");
            String str2 = this.cardMonthExpiration;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        if (mo30238h()) {
            sb.append(", ");
            sb.append("cardYearExpiration:");
            String str3 = this.cardYearExpiration;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
