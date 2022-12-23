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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPTBActivationPrice implements TBase<MVPTBActivationPrice, _Fields>, Serializable, Cloneable, Comparable<MVPTBActivationPrice> {

    /* renamed from: b */
    public static final C25113c f27833b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27834c = new C25113c("fullPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27835d = new C25113c("discountReasons", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f27836e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27837f;
    public List<String> discountReasons;
    public MVCurrencyAmount fullPrice;
    private _Fields[] optionals = {_Fields.FULL_PRICE, _Fields.DISCOUNT_REASONS};
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        PRICE(1, InAppPurchaseMetaData.KEY_PRICE),
        FULL_PRICE(2, "fullPrice"),
        DISCOUNT_REASONS(3, "discountReasons");
        
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
            return DISCOUNT_REASONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationPrice$a */
    public static class C10161a extends C25239c<MVPTBActivationPrice> {
        public C10161a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivationPrice mVPTBActivationPrice = (MVPTBActivationPrice) tBase;
            mVPTBActivationPrice.mo30836i();
            C25113c cVar = MVPTBActivationPrice.f27833b;
            gVar.mo61687K();
            if (mVPTBActivationPrice.price != null) {
                gVar.mo61711x(MVPTBActivationPrice.f27833b);
                mVPTBActivationPrice.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBActivationPrice.fullPrice != null && mVPTBActivationPrice.mo30833g()) {
                gVar.mo61711x(MVPTBActivationPrice.f27834c);
                mVPTBActivationPrice.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBActivationPrice.discountReasons != null && mVPTBActivationPrice.mo30832f()) {
                gVar.mo61711x(MVPTBActivationPrice.f27835d);
                gVar.mo61680D(new C25119e((byte) 11, mVPTBActivationPrice.discountReasons.size()));
                for (String J : mVPTBActivationPrice.discountReasons) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivationPrice mVPTBActivationPrice = (MVPTBActivationPrice) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPTBActivationPrice.mo30836i();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVPTBActivationPrice.discountReasons = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVPTBActivationPrice.discountReasons.add(gVar.mo61704q());
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                        mVPTBActivationPrice.fullPrice = mVCurrencyAmount;
                        mVCurrencyAmount.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVPTBActivationPrice.price = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationPrice$b */
    public static class C10162b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10161a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationPrice$c */
    public static class C10163c extends C25240d<MVPTBActivationPrice> {
        public C10163c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivationPrice mVPTBActivationPrice = (MVPTBActivationPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBActivationPrice.mo30834h()) {
                bitSet.set(0);
            }
            if (mVPTBActivationPrice.mo30833g()) {
                bitSet.set(1);
            }
            if (mVPTBActivationPrice.mo30832f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPTBActivationPrice.mo30834h()) {
                mVPTBActivationPrice.price.mo25202X0(jVar);
            }
            if (mVPTBActivationPrice.mo30833g()) {
                mVPTBActivationPrice.fullPrice.mo25202X0(jVar);
            }
            if (mVPTBActivationPrice.mo30832f()) {
                jVar.mo61678B(mVPTBActivationPrice.discountReasons.size());
                for (String J : mVPTBActivationPrice.discountReasons) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivationPrice mVPTBActivationPrice = (MVPTBActivationPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPTBActivationPrice.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVPTBActivationPrice.fullPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVPTBActivationPrice.discountReasons = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPTBActivationPrice.discountReasons.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationPrice$d */
    public static class C10164d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10163c(0);
        }
    }

    static {
        new C17394d0("MVPTBActivationPrice");
        HashMap hashMap = new HashMap();
        f27836e = hashMap;
        hashMap.put(C25239c.class, new C10162b());
        hashMap.put(C25240d.class, new C10164d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.DISCOUNT_REASONS, new FieldMetaData("discountReasons", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27837f = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBActivationPrice.class, unmodifiableMap);
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
        ((C25238b) f27836e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27836e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30829a(MVPTBActivationPrice mVPTBActivationPrice) {
        if (mVPTBActivationPrice == null) {
            return false;
        }
        boolean h = mo30834h();
        boolean h2 = mVPTBActivationPrice.mo30834h();
        if ((h || h2) && (!h || !h2 || !this.price.mo26102a(mVPTBActivationPrice.price))) {
            return false;
        }
        boolean g = mo30833g();
        boolean g2 = mVPTBActivationPrice.mo30833g();
        if ((g || g2) && (!g || !g2 || !this.fullPrice.mo26102a(mVPTBActivationPrice.fullPrice))) {
            return false;
        }
        boolean f = mo30832f();
        boolean f2 = mVPTBActivationPrice.mo30832f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.discountReasons.equals(mVPTBActivationPrice.discountReasons)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVPTBActivationPrice mVPTBActivationPrice = (MVPTBActivationPrice) obj;
        if (!getClass().equals(mVPTBActivationPrice.getClass())) {
            return getClass().getName().compareTo(mVPTBActivationPrice.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30834h()).compareTo(Boolean.valueOf(mVPTBActivationPrice.mo30834h()));
        if (compareTo != 0 || ((mo30834h() && (compareTo = this.price.compareTo(mVPTBActivationPrice.price)) != 0) || (compareTo = Boolean.valueOf(mo30833g()).compareTo(Boolean.valueOf(mVPTBActivationPrice.mo30833g()))) != 0 || ((mo30833g() && (compareTo = this.fullPrice.compareTo(mVPTBActivationPrice.fullPrice)) != 0) || (compareTo = Boolean.valueOf(mo30832f()).compareTo(Boolean.valueOf(mVPTBActivationPrice.mo30832f()))) != 0))) {
            return compareTo;
        }
        if (!mo30832f() || (h = C25082a.m62844h(this.discountReasons, mVPTBActivationPrice.discountReasons)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPTBActivationPrice)) {
            return mo30829a((MVPTBActivationPrice) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30832f() {
        return this.discountReasons != null;
    }

    /* renamed from: g */
    public final boolean mo30833g() {
        return this.fullPrice != null;
    }

    /* renamed from: h */
    public final boolean mo30834h() {
        return this.price != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30836i() throws TException {
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
        StringBuilder n = C13437d.m33708n("MVPTBActivationPrice(", "price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo30833g()) {
            n.append(", ");
            n.append("fullPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.fullPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        if (mo30832f()) {
            n.append(", ");
            n.append("discountReasons:");
            List<String> list = this.discountReasons;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(")");
        return n.toString();
    }
}
