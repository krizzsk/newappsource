package com.tranzmate.moovit.protocol.common;

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

public class MVPriceInfo implements TBase<MVPriceInfo, _Fields>, Serializable, Cloneable, Comparable<MVPriceInfo> {

    /* renamed from: b */
    public static final C25113c f25111b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25112c = new C25113c("fullPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25113d = new C25113c("label", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25114e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25115f;
    public MVCurrencyAmount fullPrice;
    public String label;
    private _Fields[] optionals = {_Fields.FULL_PRICE, _Fields.LABEL};
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        PRICE(1, InAppPurchaseMetaData.KEY_PRICE),
        FULL_PRICE(2, "fullPrice"),
        LABEL(3, "label");
        
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
            if (i != 3) {
                return null;
            }
            return LABEL;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPriceInfo$a */
    public static class C8476a extends C25239c<MVPriceInfo> {
        public C8476a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPriceInfo mVPriceInfo = (MVPriceInfo) tBase;
            mVPriceInfo.mo26354i();
            C25113c cVar = MVPriceInfo.f25111b;
            gVar.mo61687K();
            if (mVPriceInfo.price != null) {
                gVar.mo61711x(MVPriceInfo.f25111b);
                mVPriceInfo.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPriceInfo.fullPrice != null && mVPriceInfo.mo26350f()) {
                gVar.mo61711x(MVPriceInfo.f25112c);
                mVPriceInfo.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPriceInfo.label != null && mVPriceInfo.mo26351g()) {
                gVar.mo61711x(MVPriceInfo.f25113d);
                gVar.mo61686J(mVPriceInfo.label);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPriceInfo mVPriceInfo = (MVPriceInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPriceInfo.mo26354i();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPriceInfo.label = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                        mVPriceInfo.fullPrice = mVCurrencyAmount;
                        mVCurrencyAmount.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVPriceInfo.price = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPriceInfo$b */
    public static class C8477b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8476a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPriceInfo$c */
    public static class C8478c extends C25240d<MVPriceInfo> {
        public C8478c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPriceInfo mVPriceInfo = (MVPriceInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPriceInfo.mo26352h()) {
                bitSet.set(0);
            }
            if (mVPriceInfo.mo26350f()) {
                bitSet.set(1);
            }
            if (mVPriceInfo.mo26351g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPriceInfo.mo26352h()) {
                mVPriceInfo.price.mo25202X0(jVar);
            }
            if (mVPriceInfo.mo26350f()) {
                mVPriceInfo.fullPrice.mo25202X0(jVar);
            }
            if (mVPriceInfo.mo26351g()) {
                jVar.mo61686J(mVPriceInfo.label);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPriceInfo mVPriceInfo = (MVPriceInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPriceInfo.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVPriceInfo.fullPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPriceInfo.label = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPriceInfo$d */
    public static class C8479d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8478c(0);
        }
    }

    static {
        new C17394d0("MVPriceInfo");
        HashMap hashMap = new HashMap();
        f25114e = hashMap;
        hashMap.put(C25239c.class, new C8477b());
        hashMap.put(C25240d.class, new C8479d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.LABEL, new FieldMetaData("label", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25115f = unmodifiableMap;
        FieldMetaData.m61947a(MVPriceInfo.class, unmodifiableMap);
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
        ((C25238b) f25114e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25114e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26347a(MVPriceInfo mVPriceInfo) {
        if (mVPriceInfo == null) {
            return false;
        }
        boolean h = mo26352h();
        boolean h2 = mVPriceInfo.mo26352h();
        if ((h || h2) && (!h || !h2 || !this.price.mo26102a(mVPriceInfo.price))) {
            return false;
        }
        boolean f = mo26350f();
        boolean f2 = mVPriceInfo.mo26350f();
        if ((f || f2) && (!f || !f2 || !this.fullPrice.mo26102a(mVPriceInfo.fullPrice))) {
            return false;
        }
        boolean g = mo26351g();
        boolean g2 = mVPriceInfo.mo26351g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.label.equals(mVPriceInfo.label)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPriceInfo mVPriceInfo = (MVPriceInfo) obj;
        if (!getClass().equals(mVPriceInfo.getClass())) {
            return getClass().getName().compareTo(mVPriceInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26352h()).compareTo(Boolean.valueOf(mVPriceInfo.mo26352h()));
        if (compareTo2 != 0 || ((mo26352h() && (compareTo2 = this.price.compareTo(mVPriceInfo.price)) != 0) || (compareTo2 = Boolean.valueOf(mo26350f()).compareTo(Boolean.valueOf(mVPriceInfo.mo26350f()))) != 0 || ((mo26350f() && (compareTo2 = this.fullPrice.compareTo(mVPriceInfo.fullPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo26351g()).compareTo(Boolean.valueOf(mVPriceInfo.mo26351g()))) != 0))) {
            return compareTo2;
        }
        if (!mo26351g() || (compareTo = this.label.compareTo(mVPriceInfo.label)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPriceInfo)) {
            return mo26347a((MVPriceInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26350f() {
        return this.fullPrice != null;
    }

    /* renamed from: g */
    public final boolean mo26351g() {
        return this.label != null;
    }

    /* renamed from: h */
    public final boolean mo26352h() {
        return this.price != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26354i() throws TException {
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
        StringBuilder n = C13437d.m33708n("MVPriceInfo(", "price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo26350f()) {
            n.append(", ");
            n.append("fullPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.fullPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        if (mo26351g()) {
            n.append(", ");
            n.append("label:");
            String str = this.label;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
