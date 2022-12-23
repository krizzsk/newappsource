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

public class MVCardInfo implements TBase<MVCardInfo, _Fields>, Serializable, Cloneable, Comparable<MVCardInfo> {

    /* renamed from: b */
    public static final C25113c f27144b = new C25113c("cardType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27145c = new C25113c("lastDigits", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27146d = new C25113c("cardMonthExpiration", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27147e = new C25113c("cardYearExpiration", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27148f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27149g;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCardInfo$a */
    public static class C9632a extends C25239c<MVCardInfo> {
        public C9632a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCardInfo mVCardInfo = (MVCardInfo) tBase;
            mVCardInfo.getClass();
            C25113c cVar = MVCardInfo.f27144b;
            gVar.mo61687K();
            if (mVCardInfo.cardType != null && mVCardInfo.mo29649g()) {
                gVar.mo61711x(MVCardInfo.f27144b);
                gVar.mo61678B(mVCardInfo.cardType.getValue());
                gVar.mo61712y();
            }
            if (mVCardInfo.lastDigits != null) {
                gVar.mo61711x(MVCardInfo.f27145c);
                gVar.mo61686J(mVCardInfo.lastDigits);
                gVar.mo61712y();
            }
            if (mVCardInfo.cardMonthExpiration != null && mVCardInfo.mo29648f()) {
                gVar.mo61711x(MVCardInfo.f27146d);
                gVar.mo61686J(mVCardInfo.cardMonthExpiration);
                gVar.mo61712y();
            }
            if (mVCardInfo.cardYearExpiration != null && mVCardInfo.mo29650h()) {
                gVar.mo61711x(MVCardInfo.f27147e);
                gVar.mo61686J(mVCardInfo.cardYearExpiration);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCardInfo mVCardInfo = (MVCardInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCardInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVCardInfo.cardYearExpiration = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVCardInfo.cardMonthExpiration = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCardInfo.lastDigits = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVCardInfo.cardType = MVCardType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCardInfo$b */
    public static class C9633b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9632a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCardInfo$c */
    public static class C9634c extends C25240d<MVCardInfo> {
        public C9634c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCardInfo mVCardInfo = (MVCardInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCardInfo.mo29649g()) {
                bitSet.set(0);
            }
            if (mVCardInfo.mo29652i()) {
                bitSet.set(1);
            }
            if (mVCardInfo.mo29648f()) {
                bitSet.set(2);
            }
            if (mVCardInfo.mo29650h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVCardInfo.mo29649g()) {
                jVar.mo61678B(mVCardInfo.cardType.getValue());
            }
            if (mVCardInfo.mo29652i()) {
                jVar.mo61686J(mVCardInfo.lastDigits);
            }
            if (mVCardInfo.mo29648f()) {
                jVar.mo61686J(mVCardInfo.cardMonthExpiration);
            }
            if (mVCardInfo.mo29650h()) {
                jVar.mo61686J(mVCardInfo.cardYearExpiration);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCardInfo mVCardInfo = (MVCardInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVCardInfo.cardType = MVCardType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVCardInfo.lastDigits = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCardInfo.cardMonthExpiration = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCardInfo.cardYearExpiration = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCardInfo$d */
    public static class C9635d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9634c(0);
        }
    }

    static {
        new C17394d0("MVCardInfo");
        HashMap hashMap = new HashMap();
        f27148f = hashMap;
        hashMap.put(C25239c.class, new C9633b());
        hashMap.put(C25240d.class, new C9635d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CARD_TYPE, new FieldMetaData("cardType", (byte) 2, new EnumMetaData(MVCardType.class)));
        enumMap.put(_Fields.LAST_DIGITS, new FieldMetaData("lastDigits", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_MONTH_EXPIRATION, new FieldMetaData("cardMonthExpiration", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CARD_YEAR_EXPIRATION, new FieldMetaData("cardYearExpiration", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27149g = unmodifiableMap;
        FieldMetaData.m61947a(MVCardInfo.class, unmodifiableMap);
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
        ((C25238b) f27148f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27148f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCardInfo mVCardInfo = (MVCardInfo) obj;
        if (!getClass().equals(mVCardInfo.getClass())) {
            return getClass().getName().compareTo(mVCardInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29649g()).compareTo(Boolean.valueOf(mVCardInfo.mo29649g()));
        if (compareTo2 != 0 || ((mo29649g() && (compareTo2 = this.cardType.compareTo(mVCardInfo.cardType)) != 0) || (compareTo2 = Boolean.valueOf(mo29652i()).compareTo(Boolean.valueOf(mVCardInfo.mo29652i()))) != 0 || ((mo29652i() && (compareTo2 = this.lastDigits.compareTo(mVCardInfo.lastDigits)) != 0) || (compareTo2 = Boolean.valueOf(mo29648f()).compareTo(Boolean.valueOf(mVCardInfo.mo29648f()))) != 0 || ((mo29648f() && (compareTo2 = this.cardMonthExpiration.compareTo(mVCardInfo.cardMonthExpiration)) != 0) || (compareTo2 = Boolean.valueOf(mo29650h()).compareTo(Boolean.valueOf(mVCardInfo.mo29650h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29650h() || (compareTo = this.cardYearExpiration.compareTo(mVCardInfo.cardYearExpiration)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCardInfo)) {
            return false;
        }
        MVCardInfo mVCardInfo = (MVCardInfo) obj;
        boolean g = mo29649g();
        boolean g2 = mVCardInfo.mo29649g();
        if ((g || g2) && (!g || !g2 || !this.cardType.equals(mVCardInfo.cardType))) {
            return false;
        }
        boolean i = mo29652i();
        boolean i2 = mVCardInfo.mo29652i();
        if ((i || i2) && (!i || !i2 || !this.lastDigits.equals(mVCardInfo.lastDigits))) {
            return false;
        }
        boolean f = mo29648f();
        boolean f2 = mVCardInfo.mo29648f();
        if ((f || f2) && (!f || !f2 || !this.cardMonthExpiration.equals(mVCardInfo.cardMonthExpiration))) {
            return false;
        }
        boolean h = mo29650h();
        boolean h2 = mVCardInfo.mo29650h();
        if ((h || h2) && (!h || !h2 || !this.cardYearExpiration.equals(mVCardInfo.cardYearExpiration))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29648f() {
        return this.cardMonthExpiration != null;
    }

    /* renamed from: g */
    public final boolean mo29649g() {
        return this.cardType != null;
    }

    /* renamed from: h */
    public final boolean mo29650h() {
        return this.cardYearExpiration != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29652i() {
        return this.lastDigits != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVCardInfo(");
        if (mo29649g()) {
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
        if (mo29648f()) {
            sb.append(", ");
            sb.append("cardMonthExpiration:");
            String str2 = this.cardMonthExpiration;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        if (mo29650h()) {
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
