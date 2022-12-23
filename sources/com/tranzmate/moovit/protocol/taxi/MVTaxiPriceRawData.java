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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVTaxiPriceRawData implements TBase<MVTaxiPriceRawData, _Fields>, Serializable, Cloneable, Comparable<MVTaxiPriceRawData> {

    /* renamed from: b */
    public static final C25113c f28638b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f28639c = new C25113c("upperLimitPrice", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f28640d = new C25113c("isPriceEstimate", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f28641e = new C25113c("iso4217AlphabeticCurrencyCode", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f28642f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28643g;
    private byte __isset_bitfield = 0;
    public boolean isPriceEstimate;
    public String iso4217AlphabeticCurrencyCode;
    private _Fields[] optionals = {_Fields.UPPER_LIMIT_PRICE, _Fields.IS_PRICE_ESTIMATE};
    public long price;
    public long upperLimitPrice;

    public enum _Fields implements C25085c {
        PRICE(1, InAppPurchaseMetaData.KEY_PRICE),
        UPPER_LIMIT_PRICE(2, "upperLimitPrice"),
        IS_PRICE_ESTIMATE(3, "isPriceEstimate"),
        ISO4217_ALPHABETIC_CURRENCY_CODE(4, "iso4217AlphabeticCurrencyCode");
        
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
                return UPPER_LIMIT_PRICE;
            }
            if (i == 3) {
                return IS_PRICE_ESTIMATE;
            }
            if (i != 4) {
                return null;
            }
            return ISO4217_ALPHABETIC_CURRENCY_CODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPriceRawData$a */
    public static class C10748a extends C25239c<MVTaxiPriceRawData> {
        public C10748a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPriceRawData mVTaxiPriceRawData = (MVTaxiPriceRawData) tBase;
            mVTaxiPriceRawData.getClass();
            C25113c cVar = MVTaxiPriceRawData.f28638b;
            gVar.mo61687K();
            gVar.mo61711x(MVTaxiPriceRawData.f28638b);
            gVar.mo61679C(mVTaxiPriceRawData.price);
            gVar.mo61712y();
            if (mVTaxiPriceRawData.mo32267i()) {
                gVar.mo61711x(MVTaxiPriceRawData.f28639c);
                gVar.mo61679C(mVTaxiPriceRawData.upperLimitPrice);
                gVar.mo61712y();
            }
            if (mVTaxiPriceRawData.mo32263f()) {
                gVar.mo61711x(MVTaxiPriceRawData.f28640d);
                gVar.mo61708u(mVTaxiPriceRawData.isPriceEstimate);
                gVar.mo61712y();
            }
            if (mVTaxiPriceRawData.iso4217AlphabeticCurrencyCode != null) {
                gVar.mo61711x(MVTaxiPriceRawData.f28641e);
                gVar.mo61686J(mVTaxiPriceRawData.iso4217AlphabeticCurrencyCode);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPriceRawData mVTaxiPriceRawData = (MVTaxiPriceRawData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiPriceRawData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVTaxiPriceRawData.iso4217AlphabeticCurrencyCode = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVTaxiPriceRawData.isPriceEstimate = gVar.mo61690c();
                            mVTaxiPriceRawData.mo32268j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVTaxiPriceRawData.upperLimitPrice = gVar.mo61697j();
                        mVTaxiPriceRawData.mo32270l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVTaxiPriceRawData.price = gVar.mo61697j();
                    mVTaxiPriceRawData.mo32269k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPriceRawData$b */
    public static class C10749b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10748a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPriceRawData$c */
    public static class C10750c extends C25240d<MVTaxiPriceRawData> {
        public C10750c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPriceRawData mVTaxiPriceRawData = (MVTaxiPriceRawData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiPriceRawData.mo32265h()) {
                bitSet.set(0);
            }
            if (mVTaxiPriceRawData.mo32267i()) {
                bitSet.set(1);
            }
            if (mVTaxiPriceRawData.mo32263f()) {
                bitSet.set(2);
            }
            if (mVTaxiPriceRawData.mo32264g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTaxiPriceRawData.mo32265h()) {
                jVar.mo61679C(mVTaxiPriceRawData.price);
            }
            if (mVTaxiPriceRawData.mo32267i()) {
                jVar.mo61679C(mVTaxiPriceRawData.upperLimitPrice);
            }
            if (mVTaxiPriceRawData.mo32263f()) {
                jVar.mo61708u(mVTaxiPriceRawData.isPriceEstimate);
            }
            if (mVTaxiPriceRawData.mo32264g()) {
                jVar.mo61686J(mVTaxiPriceRawData.iso4217AlphabeticCurrencyCode);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPriceRawData mVTaxiPriceRawData = (MVTaxiPriceRawData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTaxiPriceRawData.price = jVar.mo61697j();
                mVTaxiPriceRawData.mo32269k();
            }
            if (T.get(1)) {
                mVTaxiPriceRawData.upperLimitPrice = jVar.mo61697j();
                mVTaxiPriceRawData.mo32270l();
            }
            if (T.get(2)) {
                mVTaxiPriceRawData.isPriceEstimate = jVar.mo61690c();
                mVTaxiPriceRawData.mo32268j();
            }
            if (T.get(3)) {
                mVTaxiPriceRawData.iso4217AlphabeticCurrencyCode = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPriceRawData$d */
    public static class C10751d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10750c(0);
        }
    }

    static {
        new C17394d0("MVTaxiPriceRawData");
        HashMap hashMap = new HashMap();
        f28642f = hashMap;
        hashMap.put(C25239c.class, new C10749b());
        hashMap.put(C25240d.class, new C10751d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.UPPER_LIMIT_PRICE, new FieldMetaData("upperLimitPrice", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.IS_PRICE_ESTIMATE, new FieldMetaData("isPriceEstimate", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ISO4217_ALPHABETIC_CURRENCY_CODE, new FieldMetaData("iso4217AlphabeticCurrencyCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28643g = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiPriceRawData.class, unmodifiableMap);
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
        ((C25238b) f28642f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28642f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32260a(MVTaxiPriceRawData mVTaxiPriceRawData) {
        if (mVTaxiPriceRawData == null || this.price != mVTaxiPriceRawData.price) {
            return false;
        }
        boolean i = mo32267i();
        boolean i2 = mVTaxiPriceRawData.mo32267i();
        if ((i || i2) && (!i || !i2 || this.upperLimitPrice != mVTaxiPriceRawData.upperLimitPrice)) {
            return false;
        }
        boolean f = mo32263f();
        boolean f2 = mVTaxiPriceRawData.mo32263f();
        if ((f || f2) && (!f || !f2 || this.isPriceEstimate != mVTaxiPriceRawData.isPriceEstimate)) {
            return false;
        }
        boolean g = mo32264g();
        boolean g2 = mVTaxiPriceRawData.mo32264g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.iso4217AlphabeticCurrencyCode.equals(mVTaxiPriceRawData.iso4217AlphabeticCurrencyCode)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiPriceRawData mVTaxiPriceRawData = (MVTaxiPriceRawData) obj;
        if (!getClass().equals(mVTaxiPriceRawData.getClass())) {
            return getClass().getName().compareTo(mVTaxiPriceRawData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32265h()).compareTo(Boolean.valueOf(mVTaxiPriceRawData.mo32265h()));
        if (compareTo2 != 0 || ((mo32265h() && (compareTo2 = C25082a.m62840d(this.price, mVTaxiPriceRawData.price)) != 0) || (compareTo2 = Boolean.valueOf(mo32267i()).compareTo(Boolean.valueOf(mVTaxiPriceRawData.mo32267i()))) != 0 || ((mo32267i() && (compareTo2 = C25082a.m62840d(this.upperLimitPrice, mVTaxiPriceRawData.upperLimitPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo32263f()).compareTo(Boolean.valueOf(mVTaxiPriceRawData.mo32263f()))) != 0 || ((mo32263f() && (compareTo2 = C25082a.m62848l(this.isPriceEstimate, mVTaxiPriceRawData.isPriceEstimate)) != 0) || (compareTo2 = Boolean.valueOf(mo32264g()).compareTo(Boolean.valueOf(mVTaxiPriceRawData.mo32264g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo32264g() || (compareTo = this.iso4217AlphabeticCurrencyCode.compareTo(mVTaxiPriceRawData.iso4217AlphabeticCurrencyCode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiPriceRawData)) {
            return mo32260a((MVTaxiPriceRawData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32263f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo32264g() {
        return this.iso4217AlphabeticCurrencyCode != null;
    }

    /* renamed from: h */
    public final boolean mo32265h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32267i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final void mo32268j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo32269k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo32270l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiPriceRawData(", "price:");
        n.append(this.price);
        if (mo32267i()) {
            n.append(", ");
            n.append("upperLimitPrice:");
            n.append(this.upperLimitPrice);
        }
        if (mo32263f()) {
            n.append(", ");
            n.append("isPriceEstimate:");
            n.append(this.isPriceEstimate);
        }
        n.append(", ");
        n.append("iso4217AlphabeticCurrencyCode:");
        String str = this.iso4217AlphabeticCurrencyCode;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
