package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVPurchaseCartInfo implements TBase<MVPurchaseCartInfo, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseCartInfo> {

    /* renamed from: b */
    public static final C25113c f28767b = new C25113c("cartContextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28768c = new C25113c("verificationType", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28769d = new C25113c("cartItems", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f28770e = new C25113c("totalPrice", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f28771f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28772g;
    public String cartContextId;
    public List<MVPurchaseCartItem> cartItems;
    public MVCurrencyAmount totalPrice;
    public MVPurchaseVerifacationType verificationType;

    public enum _Fields implements C25085c {
        CART_CONTEXT_ID(1, "cartContextId"),
        VERIFICATION_TYPE(2, "verificationType"),
        CART_ITEMS(3, "cartItems"),
        TOTAL_PRICE(4, "totalPrice");
        
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
                return CART_CONTEXT_ID;
            }
            if (i == 2) {
                return VERIFICATION_TYPE;
            }
            if (i == 3) {
                return CART_ITEMS;
            }
            if (i != 4) {
                return null;
            }
            return TOTAL_PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartInfo$a */
    public static class C10848a extends C25239c<MVPurchaseCartInfo> {
        public C10848a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartInfo mVPurchaseCartInfo = (MVPurchaseCartInfo) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseCartInfo.totalPrice;
            C25113c cVar = MVPurchaseCartInfo.f28767b;
            gVar.mo61687K();
            if (mVPurchaseCartInfo.cartContextId != null) {
                gVar.mo61711x(MVPurchaseCartInfo.f28767b);
                gVar.mo61686J(mVPurchaseCartInfo.cartContextId);
                gVar.mo61712y();
            }
            if (mVPurchaseCartInfo.verificationType != null) {
                gVar.mo61711x(MVPurchaseCartInfo.f28768c);
                gVar.mo61678B(mVPurchaseCartInfo.verificationType.getValue());
                gVar.mo61712y();
            }
            if (mVPurchaseCartInfo.cartItems != null) {
                gVar.mo61711x(MVPurchaseCartInfo.f28769d);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseCartInfo.cartItems.size()));
                for (MVPurchaseCartItem X0 : mVPurchaseCartInfo.cartItems) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseCartInfo.totalPrice != null) {
                gVar.mo61711x(MVPurchaseCartInfo.f28770e);
                mVPurchaseCartInfo.totalPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartInfo mVPurchaseCartInfo = (MVPurchaseCartInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseCartInfo.totalPrice;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                                mVPurchaseCartInfo.totalPrice = mVCurrencyAmount2;
                                mVCurrencyAmount2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVPurchaseCartInfo.cartItems = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVPurchaseCartItem mVPurchaseCartItem = new MVPurchaseCartItem();
                                mVPurchaseCartItem.mo25201C1(gVar);
                                mVPurchaseCartInfo.cartItems.add(mVPurchaseCartItem);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVPurchaseCartInfo.verificationType = MVPurchaseVerifacationType.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseCartInfo.cartContextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartInfo$b */
    public static class C10849b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10848a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartInfo$c */
    public static class C10850c extends C25240d<MVPurchaseCartInfo> {
        public C10850c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartInfo mVPurchaseCartInfo = (MVPurchaseCartInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseCartInfo.mo32484f()) {
                bitSet.set(0);
            }
            if (mVPurchaseCartInfo.mo32488i()) {
                bitSet.set(1);
            }
            if (mVPurchaseCartInfo.mo32485g()) {
                bitSet.set(2);
            }
            if (mVPurchaseCartInfo.mo32486h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPurchaseCartInfo.mo32484f()) {
                jVar.mo61686J(mVPurchaseCartInfo.cartContextId);
            }
            if (mVPurchaseCartInfo.mo32488i()) {
                jVar.mo61678B(mVPurchaseCartInfo.verificationType.getValue());
            }
            if (mVPurchaseCartInfo.mo32485g()) {
                jVar.mo61678B(mVPurchaseCartInfo.cartItems.size());
                for (MVPurchaseCartItem X0 : mVPurchaseCartInfo.cartItems) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseCartInfo.mo32486h()) {
                mVPurchaseCartInfo.totalPrice.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartInfo mVPurchaseCartInfo = (MVPurchaseCartInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPurchaseCartInfo.cartContextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPurchaseCartInfo.verificationType = MVPurchaseVerifacationType.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVPurchaseCartInfo.cartItems = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPurchaseCartItem mVPurchaseCartItem = new MVPurchaseCartItem();
                    mVPurchaseCartItem.mo25201C1(jVar);
                    mVPurchaseCartInfo.cartItems.add(mVPurchaseCartItem);
                }
            }
            if (T.get(3)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseCartInfo.totalPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartInfo$d */
    public static class C10851d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10850c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseCartInfo");
        HashMap hashMap = new HashMap();
        f28771f = hashMap;
        hashMap.put(C25239c.class, new C10849b());
        hashMap.put(C25240d.class, new C10851d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CART_CONTEXT_ID, new FieldMetaData("cartContextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VERIFICATION_TYPE, new FieldMetaData("verificationType", (byte) 3, new EnumMetaData(MVPurchaseVerifacationType.class)));
        enumMap.put(_Fields.CART_ITEMS, new FieldMetaData("cartItems", (byte) 3, new ListMetaData(new StructMetaData(MVPurchaseCartItem.class))));
        enumMap.put(_Fields.TOTAL_PRICE, new FieldMetaData("totalPrice", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28772g = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseCartInfo.class, unmodifiableMap);
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
        ((C25238b) f28771f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28771f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32481a(MVPurchaseCartInfo mVPurchaseCartInfo) {
        if (mVPurchaseCartInfo == null) {
            return false;
        }
        boolean f = mo32484f();
        boolean f2 = mVPurchaseCartInfo.mo32484f();
        if ((f || f2) && (!f || !f2 || !this.cartContextId.equals(mVPurchaseCartInfo.cartContextId))) {
            return false;
        }
        boolean i = mo32488i();
        boolean i2 = mVPurchaseCartInfo.mo32488i();
        if ((i || i2) && (!i || !i2 || !this.verificationType.equals(mVPurchaseCartInfo.verificationType))) {
            return false;
        }
        boolean g = mo32485g();
        boolean g2 = mVPurchaseCartInfo.mo32485g();
        if ((g || g2) && (!g || !g2 || !this.cartItems.equals(mVPurchaseCartInfo.cartItems))) {
            return false;
        }
        boolean h = mo32486h();
        boolean h2 = mVPurchaseCartInfo.mo32486h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.totalPrice.mo26102a(mVPurchaseCartInfo.totalPrice)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseCartInfo mVPurchaseCartInfo = (MVPurchaseCartInfo) obj;
        if (!getClass().equals(mVPurchaseCartInfo.getClass())) {
            return getClass().getName().compareTo(mVPurchaseCartInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32484f()).compareTo(Boolean.valueOf(mVPurchaseCartInfo.mo32484f()));
        if (compareTo2 != 0 || ((mo32484f() && (compareTo2 = this.cartContextId.compareTo(mVPurchaseCartInfo.cartContextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32488i()).compareTo(Boolean.valueOf(mVPurchaseCartInfo.mo32488i()))) != 0 || ((mo32488i() && (compareTo2 = this.verificationType.compareTo(mVPurchaseCartInfo.verificationType)) != 0) || (compareTo2 = Boolean.valueOf(mo32485g()).compareTo(Boolean.valueOf(mVPurchaseCartInfo.mo32485g()))) != 0 || ((mo32485g() && (compareTo2 = C25082a.m62844h(this.cartItems, mVPurchaseCartInfo.cartItems)) != 0) || (compareTo2 = Boolean.valueOf(mo32486h()).compareTo(Boolean.valueOf(mVPurchaseCartInfo.mo32486h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo32486h() || (compareTo = this.totalPrice.compareTo(mVPurchaseCartInfo.totalPrice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPurchaseCartInfo)) {
            return mo32481a((MVPurchaseCartInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32484f() {
        return this.cartContextId != null;
    }

    /* renamed from: g */
    public final boolean mo32485g() {
        return this.cartItems != null;
    }

    /* renamed from: h */
    public final boolean mo32486h() {
        return this.totalPrice != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32488i() {
        return this.verificationType != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseCartInfo(", "cartContextId:");
        String str = this.cartContextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("verificationType:");
        MVPurchaseVerifacationType mVPurchaseVerifacationType = this.verificationType;
        if (mVPurchaseVerifacationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseVerifacationType);
        }
        n.append(", ");
        n.append("cartItems:");
        List<MVPurchaseCartItem> list = this.cartItems;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("totalPrice:");
        MVCurrencyAmount mVCurrencyAmount = this.totalPrice;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(")");
        return n.toString();
    }
}
