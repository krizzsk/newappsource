package com.tranzmate.moovit.protocol.taxi;

import com.appboy.support.StringUtils;
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

public class MVTaxiPrice implements TBase<MVTaxiPrice, _Fields>, Serializable, Cloneable, Comparable<MVTaxiPrice> {

    /* renamed from: b */
    public static final C25113c f28629b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28630c = new C25113c("isRange", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f28631d = new C25113c("isPromotion", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f28632e = new C25113c("priceType", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28633f = new C25113c("isSurge", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f28634g = new C25113c("surgeUrl", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f28635h = new C25113c("priceRawData", (byte) 12, 7);

    /* renamed from: i */
    public static final HashMap f28636i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f28637j;
    private byte __isset_bitfield = 0;
    public boolean isPromotion;
    public boolean isRange;
    public boolean isSurge;
    private _Fields[] optionals = {_Fields.SURGE_URL, _Fields.PRICE_RAW_DATA};
    public String price;
    public MVTaxiPriceRawData priceRawData;
    public MVTaxiPriceType priceType;
    public String surgeUrl;

    public enum _Fields implements C25085c {
        PRICE(1, InAppPurchaseMetaData.KEY_PRICE),
        IS_RANGE(2, "isRange"),
        IS_PROMOTION(3, "isPromotion"),
        PRICE_TYPE(4, "priceType"),
        IS_SURGE(5, "isSurge"),
        SURGE_URL(6, "surgeUrl"),
        PRICE_RAW_DATA(7, "priceRawData");
        
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
                    return PRICE;
                case 2:
                    return IS_RANGE;
                case 3:
                    return IS_PROMOTION;
                case 4:
                    return PRICE_TYPE;
                case 5:
                    return IS_SURGE;
                case 6:
                    return SURGE_URL;
                case 7:
                    return PRICE_RAW_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPrice$a */
    public static class C10744a extends C25239c<MVTaxiPrice> {
        public C10744a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPrice mVTaxiPrice = (MVTaxiPrice) tBase;
            MVTaxiPriceRawData mVTaxiPriceRawData = mVTaxiPrice.priceRawData;
            C25113c cVar = MVTaxiPrice.f28629b;
            gVar.mo61687K();
            if (mVTaxiPrice.price != null) {
                gVar.mo61711x(MVTaxiPrice.f28629b);
                gVar.mo61686J(mVTaxiPrice.price);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTaxiPrice.f28630c);
            gVar.mo61708u(mVTaxiPrice.isRange);
            gVar.mo61712y();
            gVar.mo61711x(MVTaxiPrice.f28631d);
            gVar.mo61708u(mVTaxiPrice.isPromotion);
            gVar.mo61712y();
            if (mVTaxiPrice.priceType != null) {
                gVar.mo61711x(MVTaxiPrice.f28632e);
                gVar.mo61678B(mVTaxiPrice.priceType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTaxiPrice.f28633f);
            gVar.mo61708u(mVTaxiPrice.isSurge);
            gVar.mo61712y();
            if (mVTaxiPrice.surgeUrl != null && mVTaxiPrice.mo32254l()) {
                gVar.mo61711x(MVTaxiPrice.f28634g);
                gVar.mo61686J(mVTaxiPrice.surgeUrl);
                gVar.mo61712y();
            }
            if (mVTaxiPrice.priceRawData != null && mVTaxiPrice.mo32252j()) {
                gVar.mo61711x(MVTaxiPrice.f28635h);
                mVTaxiPrice.priceRawData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPrice mVTaxiPrice = (MVTaxiPrice) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTaxiPriceRawData mVTaxiPriceRawData = mVTaxiPrice.priceRawData;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiPrice.price = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiPrice.isRange = gVar.mo61690c();
                            mVTaxiPrice.mo32256o();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiPrice.isPromotion = gVar.mo61690c();
                            mVTaxiPrice.mo32255m();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiPrice.priceType = MVTaxiPriceType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiPrice.isSurge = gVar.mo61690c();
                            mVTaxiPrice.mo32257p();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiPrice.surgeUrl = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiPriceRawData mVTaxiPriceRawData2 = new MVTaxiPriceRawData();
                            mVTaxiPrice.priceRawData = mVTaxiPriceRawData2;
                            mVTaxiPriceRawData2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPrice$b */
    public static class C10745b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10744a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPrice$c */
    public static class C10746c extends C25240d<MVTaxiPrice> {
        public C10746c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPrice mVTaxiPrice = (MVTaxiPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiPrice.mo32251i()) {
                bitSet.set(0);
            }
            if (mVTaxiPrice.mo32248g()) {
                bitSet.set(1);
            }
            if (mVTaxiPrice.mo32247f()) {
                bitSet.set(2);
            }
            if (mVTaxiPrice.mo32253k()) {
                bitSet.set(3);
            }
            if (mVTaxiPrice.mo32249h()) {
                bitSet.set(4);
            }
            if (mVTaxiPrice.mo32254l()) {
                bitSet.set(5);
            }
            if (mVTaxiPrice.mo32252j()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVTaxiPrice.mo32251i()) {
                jVar.mo61686J(mVTaxiPrice.price);
            }
            if (mVTaxiPrice.mo32248g()) {
                jVar.mo61708u(mVTaxiPrice.isRange);
            }
            if (mVTaxiPrice.mo32247f()) {
                jVar.mo61708u(mVTaxiPrice.isPromotion);
            }
            if (mVTaxiPrice.mo32253k()) {
                jVar.mo61678B(mVTaxiPrice.priceType.getValue());
            }
            if (mVTaxiPrice.mo32249h()) {
                jVar.mo61708u(mVTaxiPrice.isSurge);
            }
            if (mVTaxiPrice.mo32254l()) {
                jVar.mo61686J(mVTaxiPrice.surgeUrl);
            }
            if (mVTaxiPrice.mo32252j()) {
                mVTaxiPrice.priceRawData.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPrice mVTaxiPrice = (MVTaxiPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVTaxiPrice.price = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTaxiPrice.isRange = jVar.mo61690c();
                mVTaxiPrice.mo32256o();
            }
            if (T.get(2)) {
                mVTaxiPrice.isPromotion = jVar.mo61690c();
                mVTaxiPrice.mo32255m();
            }
            if (T.get(3)) {
                mVTaxiPrice.priceType = MVTaxiPriceType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVTaxiPrice.isSurge = jVar.mo61690c();
                mVTaxiPrice.mo32257p();
            }
            if (T.get(5)) {
                mVTaxiPrice.surgeUrl = jVar.mo61704q();
            }
            if (T.get(6)) {
                MVTaxiPriceRawData mVTaxiPriceRawData = new MVTaxiPriceRawData();
                mVTaxiPrice.priceRawData = mVTaxiPriceRawData;
                mVTaxiPriceRawData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPrice$d */
    public static class C10747d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10746c(0);
        }
    }

    static {
        new C17394d0("MVTaxiPrice");
        HashMap hashMap = new HashMap();
        f28636i = hashMap;
        hashMap.put(C25239c.class, new C10745b());
        hashMap.put(C25240d.class, new C10747d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_RANGE, new FieldMetaData("isRange", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_PROMOTION, new FieldMetaData("isPromotion", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PRICE_TYPE, new FieldMetaData("priceType", (byte) 3, new EnumMetaData(MVTaxiPriceType.class)));
        enumMap.put(_Fields.IS_SURGE, new FieldMetaData("isSurge", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SURGE_URL, new FieldMetaData("surgeUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE_RAW_DATA, new FieldMetaData("priceRawData", (byte) 2, new StructMetaData(MVTaxiPriceRawData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28637j = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiPrice.class, unmodifiableMap);
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
        ((C25238b) f28636i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28636i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32244a(MVTaxiPrice mVTaxiPrice) {
        if (mVTaxiPrice == null) {
            return false;
        }
        boolean i = mo32251i();
        boolean i2 = mVTaxiPrice.mo32251i();
        if (((i || i2) && (!i || !i2 || !this.price.equals(mVTaxiPrice.price))) || this.isRange != mVTaxiPrice.isRange || this.isPromotion != mVTaxiPrice.isPromotion) {
            return false;
        }
        boolean k = mo32253k();
        boolean k2 = mVTaxiPrice.mo32253k();
        if (((k || k2) && (!k || !k2 || !this.priceType.equals(mVTaxiPrice.priceType))) || this.isSurge != mVTaxiPrice.isSurge) {
            return false;
        }
        boolean l = mo32254l();
        boolean l2 = mVTaxiPrice.mo32254l();
        if ((l || l2) && (!l || !l2 || !this.surgeUrl.equals(mVTaxiPrice.surgeUrl))) {
            return false;
        }
        boolean j = mo32252j();
        boolean j2 = mVTaxiPrice.mo32252j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.priceRawData.mo32260a(mVTaxiPrice.priceRawData)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiPrice mVTaxiPrice = (MVTaxiPrice) obj;
        if (!getClass().equals(mVTaxiPrice.getClass())) {
            return getClass().getName().compareTo(mVTaxiPrice.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32251i()).compareTo(Boolean.valueOf(mVTaxiPrice.mo32251i()));
        if (compareTo2 != 0 || ((mo32251i() && (compareTo2 = this.price.compareTo(mVTaxiPrice.price)) != 0) || (compareTo2 = Boolean.valueOf(mo32248g()).compareTo(Boolean.valueOf(mVTaxiPrice.mo32248g()))) != 0 || ((mo32248g() && (compareTo2 = C25082a.m62848l(this.isRange, mVTaxiPrice.isRange)) != 0) || (compareTo2 = Boolean.valueOf(mo32247f()).compareTo(Boolean.valueOf(mVTaxiPrice.mo32247f()))) != 0 || ((mo32247f() && (compareTo2 = C25082a.m62848l(this.isPromotion, mVTaxiPrice.isPromotion)) != 0) || (compareTo2 = Boolean.valueOf(mo32253k()).compareTo(Boolean.valueOf(mVTaxiPrice.mo32253k()))) != 0 || ((mo32253k() && (compareTo2 = this.priceType.compareTo(mVTaxiPrice.priceType)) != 0) || (compareTo2 = Boolean.valueOf(mo32249h()).compareTo(Boolean.valueOf(mVTaxiPrice.mo32249h()))) != 0 || ((mo32249h() && (compareTo2 = C25082a.m62848l(this.isSurge, mVTaxiPrice.isSurge)) != 0) || (compareTo2 = Boolean.valueOf(mo32254l()).compareTo(Boolean.valueOf(mVTaxiPrice.mo32254l()))) != 0 || ((mo32254l() && (compareTo2 = this.surgeUrl.compareTo(mVTaxiPrice.surgeUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo32252j()).compareTo(Boolean.valueOf(mVTaxiPrice.mo32252j()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo32252j() || (compareTo = this.priceRawData.compareTo(mVTaxiPrice.priceRawData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiPrice)) {
            return mo32244a((MVTaxiPrice) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32247f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo32248g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo32249h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32251i() {
        return this.price != null;
    }

    /* renamed from: j */
    public final boolean mo32252j() {
        return this.priceRawData != null;
    }

    /* renamed from: k */
    public final boolean mo32253k() {
        return this.priceType != null;
    }

    /* renamed from: l */
    public final boolean mo32254l() {
        return this.surgeUrl != null;
    }

    /* renamed from: m */
    public final void mo32255m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo32256o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo32257p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiPrice(", "price:");
        String str = this.price;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("isRange:");
        C13555b.m33977q(n, this.isRange, ", ", "isPromotion:");
        C13555b.m33977q(n, this.isPromotion, ", ", "priceType:");
        MVTaxiPriceType mVTaxiPriceType = this.priceType;
        if (mVTaxiPriceType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTaxiPriceType);
        }
        n.append(", ");
        n.append("isSurge:");
        n.append(this.isSurge);
        if (mo32254l()) {
            n.append(", ");
            n.append("surgeUrl:");
            String str2 = this.surgeUrl;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo32252j()) {
            n.append(", ");
            n.append("priceRawData:");
            MVTaxiPriceRawData mVTaxiPriceRawData = this.priceRawData;
            if (mVTaxiPriceRawData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiPriceRawData);
            }
        }
        n.append(")");
        return n.toString();
    }
}
