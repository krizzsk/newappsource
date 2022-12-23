package com.tranzmate.moovit.protocol.fare;

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
import p389bl.C13637c;
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

public class MVItineraryFare implements TBase<MVItineraryFare, _Fields>, Serializable, Cloneable, Comparable<MVItineraryFare> {

    /* renamed from: b */
    public static final C25113c f25638b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25639c = new C25113c("maxPrice", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25640d = new C25113c("partial", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f25641e = new C25113c("altVariationFareGroups", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f25642f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25643g;
    private byte __isset_bitfield = 0;
    public List<MVAltVariationFareGroup> altVariationFareGroups;
    public long maxPrice;
    private _Fields[] optionals = {_Fields.MAX_PRICE, _Fields.ALT_VARIATION_FARE_GROUPS};
    public boolean partial;
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        PRICE(1, InAppPurchaseMetaData.KEY_PRICE),
        MAX_PRICE(2, "maxPrice"),
        PARTIAL(3, "partial"),
        ALT_VARIATION_FARE_GROUPS(4, "altVariationFareGroups");
        
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
                return MAX_PRICE;
            }
            if (i == 3) {
                return PARTIAL;
            }
            if (i != 4) {
                return null;
            }
            return ALT_VARIATION_FARE_GROUPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVItineraryFare$a */
    public static class C8739a extends C25239c<MVItineraryFare> {
        public C8739a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVItineraryFare mVItineraryFare = (MVItineraryFare) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVItineraryFare.price;
            C25113c cVar = MVItineraryFare.f25638b;
            gVar.mo61687K();
            if (mVItineraryFare.price != null) {
                gVar.mo61711x(MVItineraryFare.f25638b);
                mVItineraryFare.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVItineraryFare.mo27237g()) {
                gVar.mo61711x(MVItineraryFare.f25639c);
                gVar.mo61679C(mVItineraryFare.maxPrice);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVItineraryFare.f25640d);
            gVar.mo61708u(mVItineraryFare.partial);
            gVar.mo61712y();
            if (mVItineraryFare.altVariationFareGroups != null && mVItineraryFare.mo27236f()) {
                gVar.mo61711x(MVItineraryFare.f25641e);
                gVar.mo61680D(new C25119e((byte) 12, mVItineraryFare.altVariationFareGroups.size()));
                for (MVAltVariationFareGroup X0 : mVItineraryFare.altVariationFareGroups) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVItineraryFare mVItineraryFare = (MVItineraryFare) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVItineraryFare.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVItineraryFare.altVariationFareGroups = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVAltVariationFareGroup mVAltVariationFareGroup = new MVAltVariationFareGroup();
                                    mVAltVariationFareGroup.mo25201C1(gVar);
                                    mVItineraryFare.altVariationFareGroups.add(mVAltVariationFareGroup);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVItineraryFare.partial = gVar.mo61690c();
                            mVItineraryFare.mo27242k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVItineraryFare.maxPrice = gVar.mo61697j();
                        mVItineraryFare.mo27241j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVItineraryFare.price = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVItineraryFare$b */
    public static class C8740b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8739a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVItineraryFare$c */
    public static class C8741c extends C25240d<MVItineraryFare> {
        public C8741c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVItineraryFare mVItineraryFare = (MVItineraryFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVItineraryFare.mo27240i()) {
                bitSet.set(0);
            }
            if (mVItineraryFare.mo27237g()) {
                bitSet.set(1);
            }
            if (mVItineraryFare.mo27238h()) {
                bitSet.set(2);
            }
            if (mVItineraryFare.mo27236f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVItineraryFare.mo27240i()) {
                mVItineraryFare.price.mo25202X0(jVar);
            }
            if (mVItineraryFare.mo27237g()) {
                jVar.mo61679C(mVItineraryFare.maxPrice);
            }
            if (mVItineraryFare.mo27238h()) {
                jVar.mo61708u(mVItineraryFare.partial);
            }
            if (mVItineraryFare.mo27236f()) {
                jVar.mo61678B(mVItineraryFare.altVariationFareGroups.size());
                for (MVAltVariationFareGroup X0 : mVItineraryFare.altVariationFareGroups) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVItineraryFare mVItineraryFare = (MVItineraryFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVItineraryFare.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVItineraryFare.maxPrice = jVar.mo61697j();
                mVItineraryFare.mo27241j();
            }
            if (T.get(2)) {
                mVItineraryFare.partial = jVar.mo61690c();
                mVItineraryFare.mo27242k();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVItineraryFare.altVariationFareGroups = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAltVariationFareGroup mVAltVariationFareGroup = new MVAltVariationFareGroup();
                    mVAltVariationFareGroup.mo25201C1(jVar);
                    mVItineraryFare.altVariationFareGroups.add(mVAltVariationFareGroup);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVItineraryFare$d */
    public static class C8742d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8741c(0);
        }
    }

    static {
        new C17394d0("MVItineraryFare");
        HashMap hashMap = new HashMap();
        f25642f = hashMap;
        hashMap.put(C25239c.class, new C8740b());
        hashMap.put(C25240d.class, new C8742d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.MAX_PRICE, new FieldMetaData("maxPrice", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.PARTIAL, new FieldMetaData("partial", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ALT_VARIATION_FARE_GROUPS, new FieldMetaData("altVariationFareGroups", (byte) 2, new ListMetaData(new StructMetaData(MVAltVariationFareGroup.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25643g = unmodifiableMap;
        FieldMetaData.m61947a(MVItineraryFare.class, unmodifiableMap);
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
        ((C25238b) f25642f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25642f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27233a(MVItineraryFare mVItineraryFare) {
        if (mVItineraryFare == null) {
            return false;
        }
        boolean i = mo27240i();
        boolean i2 = mVItineraryFare.mo27240i();
        if ((i || i2) && (!i || !i2 || !this.price.mo26102a(mVItineraryFare.price))) {
            return false;
        }
        boolean g = mo27237g();
        boolean g2 = mVItineraryFare.mo27237g();
        if (((g || g2) && (!g || !g2 || this.maxPrice != mVItineraryFare.maxPrice)) || this.partial != mVItineraryFare.partial) {
            return false;
        }
        boolean f = mo27236f();
        boolean f2 = mVItineraryFare.mo27236f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.altVariationFareGroups.equals(mVItineraryFare.altVariationFareGroups)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVItineraryFare mVItineraryFare = (MVItineraryFare) obj;
        if (!getClass().equals(mVItineraryFare.getClass())) {
            return getClass().getName().compareTo(mVItineraryFare.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27240i()).compareTo(Boolean.valueOf(mVItineraryFare.mo27240i()));
        if (compareTo != 0 || ((mo27240i() && (compareTo = this.price.compareTo(mVItineraryFare.price)) != 0) || (compareTo = Boolean.valueOf(mo27237g()).compareTo(Boolean.valueOf(mVItineraryFare.mo27237g()))) != 0 || ((mo27237g() && (compareTo = C25082a.m62840d(this.maxPrice, mVItineraryFare.maxPrice)) != 0) || (compareTo = Boolean.valueOf(mo27238h()).compareTo(Boolean.valueOf(mVItineraryFare.mo27238h()))) != 0 || ((mo27238h() && (compareTo = C25082a.m62848l(this.partial, mVItineraryFare.partial)) != 0) || (compareTo = Boolean.valueOf(mo27236f()).compareTo(Boolean.valueOf(mVItineraryFare.mo27236f()))) != 0)))) {
            return compareTo;
        }
        if (!mo27236f() || (h = C25082a.m62844h(this.altVariationFareGroups, mVItineraryFare.altVariationFareGroups)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVItineraryFare)) {
            return mo27233a((MVItineraryFare) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27236f() {
        return this.altVariationFareGroups != null;
    }

    /* renamed from: g */
    public final boolean mo27237g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27238h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27240i() {
        return this.price != null;
    }

    /* renamed from: j */
    public final void mo27241j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo27242k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVItineraryFare(", "price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo27237g()) {
            n.append(", ");
            n.append("maxPrice:");
            n.append(this.maxPrice);
        }
        n.append(", ");
        n.append("partial:");
        n.append(this.partial);
        if (mo27236f()) {
            n.append(", ");
            n.append("altVariationFareGroups:");
            List<MVAltVariationFareGroup> list = this.altVariationFareGroups;
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
