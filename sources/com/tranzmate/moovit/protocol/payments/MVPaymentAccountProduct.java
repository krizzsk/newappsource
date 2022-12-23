package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVInfoBoxData;
import com.tranzmate.moovit.protocol.common.MVPriceInfo;
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

public class MVPaymentAccountProduct implements TBase<MVPaymentAccountProduct, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountProduct> {

    /* renamed from: b */
    public static final C25113c f27432b = new C25113c("identifier", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27433c = new C25113c("paymentType", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f27434d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27435e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27436f = new C25113c("priceInfo", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f27437g = new C25113c("disclaimer", (byte) 12, 6);

    /* renamed from: h */
    public static final HashMap f27438h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f27439i;
    public MVInfoBoxData disclaimer;
    public String identifier;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.SUBTITLE, _Fields.PRICE_INFO, _Fields.DISCLAIMER};
    public MVPaymentAccountProductType paymentType;
    public MVPriceInfo priceInfo;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        IDENTIFIER(1, "identifier"),
        PAYMENT_TYPE(2, "paymentType"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        PRICE_INFO(5, "priceInfo"),
        DISCLAIMER(6, "disclaimer");
        
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
            switch (i) {
                case 1:
                    return IDENTIFIER;
                case 2:
                    return PAYMENT_TYPE;
                case 3:
                    return TITLE;
                case 4:
                    return SUBTITLE;
                case 5:
                    return PRICE_INFO;
                case 6:
                    return DISCLAIMER;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountProduct$a */
    public static class C9865a extends C25239c<MVPaymentAccountProduct> {
        public C9865a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountProduct mVPaymentAccountProduct = (MVPaymentAccountProduct) tBase;
            MVPriceInfo mVPriceInfo = mVPaymentAccountProduct.priceInfo;
            if (mVPriceInfo != null) {
                mVPriceInfo.mo26354i();
            }
            C25113c cVar = MVPaymentAccountProduct.f27432b;
            gVar.mo61687K();
            if (mVPaymentAccountProduct.identifier != null) {
                gVar.mo61711x(MVPaymentAccountProduct.f27432b);
                gVar.mo61686J(mVPaymentAccountProduct.identifier);
                gVar.mo61712y();
            }
            if (mVPaymentAccountProduct.paymentType != null) {
                gVar.mo61711x(MVPaymentAccountProduct.f27433c);
                gVar.mo61678B(mVPaymentAccountProduct.paymentType.getValue());
                gVar.mo61712y();
            }
            if (mVPaymentAccountProduct.title != null && mVPaymentAccountProduct.mo30150k()) {
                gVar.mo61711x(MVPaymentAccountProduct.f27434d);
                gVar.mo61686J(mVPaymentAccountProduct.title);
                gVar.mo61712y();
            }
            if (mVPaymentAccountProduct.subtitle != null && mVPaymentAccountProduct.mo30149j()) {
                gVar.mo61711x(MVPaymentAccountProduct.f27435e);
                gVar.mo61686J(mVPaymentAccountProduct.subtitle);
                gVar.mo61712y();
            }
            if (mVPaymentAccountProduct.priceInfo != null && mVPaymentAccountProduct.mo30148i()) {
                gVar.mo61711x(MVPaymentAccountProduct.f27436f);
                mVPaymentAccountProduct.priceInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccountProduct.disclaimer != null && mVPaymentAccountProduct.mo30144f()) {
                gVar.mo61711x(MVPaymentAccountProduct.f27437g);
                mVPaymentAccountProduct.disclaimer.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountProduct mVPaymentAccountProduct = (MVPaymentAccountProduct) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPriceInfo mVPriceInfo = mVPaymentAccountProduct.priceInfo;
                    if (mVPriceInfo != null) {
                        mVPriceInfo.mo26354i();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountProduct.identifier = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountProduct.paymentType = MVPaymentAccountProductType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountProduct.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountProduct.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPriceInfo mVPriceInfo2 = new MVPriceInfo();
                            mVPaymentAccountProduct.priceInfo = mVPriceInfo2;
                            mVPriceInfo2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVInfoBoxData mVInfoBoxData = new MVInfoBoxData();
                            mVPaymentAccountProduct.disclaimer = mVInfoBoxData;
                            mVInfoBoxData.mo25201C1(gVar);
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountProduct$b */
    public static class C9866b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9865a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountProduct$c */
    public static class C9867c extends C25240d<MVPaymentAccountProduct> {
        public C9867c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountProduct mVPaymentAccountProduct = (MVPaymentAccountProduct) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountProduct.mo30145g()) {
                bitSet.set(0);
            }
            if (mVPaymentAccountProduct.mo30146h()) {
                bitSet.set(1);
            }
            if (mVPaymentAccountProduct.mo30150k()) {
                bitSet.set(2);
            }
            if (mVPaymentAccountProduct.mo30149j()) {
                bitSet.set(3);
            }
            if (mVPaymentAccountProduct.mo30148i()) {
                bitSet.set(4);
            }
            if (mVPaymentAccountProduct.mo30144f()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVPaymentAccountProduct.mo30145g()) {
                jVar.mo61686J(mVPaymentAccountProduct.identifier);
            }
            if (mVPaymentAccountProduct.mo30146h()) {
                jVar.mo61678B(mVPaymentAccountProduct.paymentType.getValue());
            }
            if (mVPaymentAccountProduct.mo30150k()) {
                jVar.mo61686J(mVPaymentAccountProduct.title);
            }
            if (mVPaymentAccountProduct.mo30149j()) {
                jVar.mo61686J(mVPaymentAccountProduct.subtitle);
            }
            if (mVPaymentAccountProduct.mo30148i()) {
                mVPaymentAccountProduct.priceInfo.mo25202X0(jVar);
            }
            if (mVPaymentAccountProduct.mo30144f()) {
                mVPaymentAccountProduct.disclaimer.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountProduct mVPaymentAccountProduct = (MVPaymentAccountProduct) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVPaymentAccountProduct.identifier = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentAccountProduct.paymentType = MVPaymentAccountProductType.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVPaymentAccountProduct.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPaymentAccountProduct.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVPriceInfo mVPriceInfo = new MVPriceInfo();
                mVPaymentAccountProduct.priceInfo = mVPriceInfo;
                mVPriceInfo.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVInfoBoxData mVInfoBoxData = new MVInfoBoxData();
                mVPaymentAccountProduct.disclaimer = mVInfoBoxData;
                mVInfoBoxData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountProduct$d */
    public static class C9868d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9867c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountProduct");
        HashMap hashMap = new HashMap();
        f27438h = hashMap;
        hashMap.put(C25239c.class, new C9866b());
        hashMap.put(C25240d.class, new C9868d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IDENTIFIER, new FieldMetaData("identifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_TYPE, new FieldMetaData("paymentType", (byte) 3, new EnumMetaData(MVPaymentAccountProductType.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE_INFO, new FieldMetaData("priceInfo", (byte) 2, new StructMetaData(MVPriceInfo.class)));
        enumMap.put(_Fields.DISCLAIMER, new FieldMetaData("disclaimer", (byte) 2, new StructMetaData(MVInfoBoxData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27439i = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountProduct.class, unmodifiableMap);
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
        ((C25238b) f27438h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27438h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentAccountProduct mVPaymentAccountProduct = (MVPaymentAccountProduct) obj;
        if (!getClass().equals(mVPaymentAccountProduct.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountProduct.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30145g()).compareTo(Boolean.valueOf(mVPaymentAccountProduct.mo30145g()));
        if (compareTo2 != 0 || ((mo30145g() && (compareTo2 = this.identifier.compareTo(mVPaymentAccountProduct.identifier)) != 0) || (compareTo2 = Boolean.valueOf(mo30146h()).compareTo(Boolean.valueOf(mVPaymentAccountProduct.mo30146h()))) != 0 || ((mo30146h() && (compareTo2 = this.paymentType.compareTo(mVPaymentAccountProduct.paymentType)) != 0) || (compareTo2 = Boolean.valueOf(mo30150k()).compareTo(Boolean.valueOf(mVPaymentAccountProduct.mo30150k()))) != 0 || ((mo30150k() && (compareTo2 = this.title.compareTo(mVPaymentAccountProduct.title)) != 0) || (compareTo2 = Boolean.valueOf(mo30149j()).compareTo(Boolean.valueOf(mVPaymentAccountProduct.mo30149j()))) != 0 || ((mo30149j() && (compareTo2 = this.subtitle.compareTo(mVPaymentAccountProduct.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo30148i()).compareTo(Boolean.valueOf(mVPaymentAccountProduct.mo30148i()))) != 0 || ((mo30148i() && (compareTo2 = this.priceInfo.compareTo(mVPaymentAccountProduct.priceInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo30144f()).compareTo(Boolean.valueOf(mVPaymentAccountProduct.mo30144f()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo30144f() || (compareTo = this.disclaimer.compareTo(mVPaymentAccountProduct.disclaimer)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentAccountProduct)) {
            return false;
        }
        MVPaymentAccountProduct mVPaymentAccountProduct = (MVPaymentAccountProduct) obj;
        boolean g = mo30145g();
        boolean g2 = mVPaymentAccountProduct.mo30145g();
        if ((g || g2) && (!g || !g2 || !this.identifier.equals(mVPaymentAccountProduct.identifier))) {
            return false;
        }
        boolean h = mo30146h();
        boolean h2 = mVPaymentAccountProduct.mo30146h();
        if ((h || h2) && (!h || !h2 || !this.paymentType.equals(mVPaymentAccountProduct.paymentType))) {
            return false;
        }
        boolean k = mo30150k();
        boolean k2 = mVPaymentAccountProduct.mo30150k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVPaymentAccountProduct.title))) {
            return false;
        }
        boolean j = mo30149j();
        boolean j2 = mVPaymentAccountProduct.mo30149j();
        if ((j || j2) && (!j || !j2 || !this.subtitle.equals(mVPaymentAccountProduct.subtitle))) {
            return false;
        }
        boolean i = mo30148i();
        boolean i2 = mVPaymentAccountProduct.mo30148i();
        if ((i || i2) && (!i || !i2 || !this.priceInfo.mo26347a(mVPaymentAccountProduct.priceInfo))) {
            return false;
        }
        boolean f = mo30144f();
        boolean f2 = mVPaymentAccountProduct.mo30144f();
        if ((f || f2) && (!f || !f2 || !this.disclaimer.mo26280a(mVPaymentAccountProduct.disclaimer))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30144f() {
        return this.disclaimer != null;
    }

    /* renamed from: g */
    public final boolean mo30145g() {
        return this.identifier != null;
    }

    /* renamed from: h */
    public final boolean mo30146h() {
        return this.paymentType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30148i() {
        return this.priceInfo != null;
    }

    /* renamed from: j */
    public final boolean mo30149j() {
        return this.subtitle != null;
    }

    /* renamed from: k */
    public final boolean mo30150k() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccountProduct(", "identifier:");
        String str = this.identifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("paymentType:");
        MVPaymentAccountProductType mVPaymentAccountProductType = this.paymentType;
        if (mVPaymentAccountProductType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentAccountProductType);
        }
        if (mo30150k()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo30149j()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo30148i()) {
            n.append(", ");
            n.append("priceInfo:");
            MVPriceInfo mVPriceInfo = this.priceInfo;
            if (mVPriceInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPriceInfo);
            }
        }
        if (mo30144f()) {
            n.append(", ");
            n.append("disclaimer:");
            MVInfoBoxData mVInfoBoxData = this.disclaimer;
            if (mVInfoBoxData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVInfoBoxData);
            }
        }
        n.append(")");
        return n.toString();
    }
}
