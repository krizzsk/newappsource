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

public class MVLegFare implements TBase<MVLegFare, _Fields>, Serializable, Cloneable, Comparable<MVLegFare> {

    /* renamed from: b */
    public static final C25113c f25644b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 2);

    /* renamed from: c */
    public static final C25113c f25645c = new C25113c("payForThisLeg", (byte) 2, 3);

    /* renamed from: d */
    public static final C25113c f25646d = new C25113c("fares", (byte) 15, 5);

    /* renamed from: e */
    public static final HashMap f25647e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25648f;
    private byte __isset_bitfield = 0;
    public List<MVFareData> fares;
    public boolean payForThisLeg;
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        PRICE(2, InAppPurchaseMetaData.KEY_PRICE),
        PAY_FOR_THIS_LEG(3, "payForThisLeg"),
        FARES(5, "fares");
        
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
            if (i == 2) {
                return PRICE;
            }
            if (i == 3) {
                return PAY_FOR_THIS_LEG;
            }
            if (i != 5) {
                return null;
            }
            return FARES;
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

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVLegFare$a */
    public static class C8743a extends C25239c<MVLegFare> {
        public C8743a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLegFare mVLegFare = (MVLegFare) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVLegFare.price;
            C25113c cVar = MVLegFare.f25644b;
            gVar.mo61687K();
            if (mVLegFare.price != null) {
                gVar.mo61711x(MVLegFare.f25644b);
                mVLegFare.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVLegFare.f25645c);
            gVar.mo61708u(mVLegFare.payForThisLeg);
            gVar.mo61712y();
            if (mVLegFare.fares != null) {
                gVar.mo61711x(MVLegFare.f25646d);
                gVar.mo61680D(new C25119e((byte) 12, mVLegFare.fares.size()));
                for (MVFareData X0 : mVLegFare.fares) {
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
            MVLegFare mVLegFare = (MVLegFare) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVLegFare.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 2) {
                    if (s != 3) {
                        if (s != 5) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVLegFare.fares = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVFareData mVFareData = new MVFareData();
                                mVFareData.mo25201C1(gVar);
                                mVLegFare.fares.add(mVFareData);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVLegFare.payForThisLeg = gVar.mo61690c();
                        mVLegFare.mo27252i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVLegFare.price = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVLegFare$b */
    public static class C8744b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8743a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVLegFare$c */
    public static class C8745c extends C25240d<MVLegFare> {
        public C8745c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLegFare mVLegFare = (MVLegFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLegFare.mo27250h()) {
                bitSet.set(0);
            }
            if (mVLegFare.mo27249g()) {
                bitSet.set(1);
            }
            if (mVLegFare.mo27248f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVLegFare.mo27250h()) {
                mVLegFare.price.mo25202X0(jVar);
            }
            if (mVLegFare.mo27249g()) {
                jVar.mo61708u(mVLegFare.payForThisLeg);
            }
            if (mVLegFare.mo27248f()) {
                jVar.mo61678B(mVLegFare.fares.size());
                for (MVFareData X0 : mVLegFare.fares) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLegFare mVLegFare = (MVLegFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVLegFare.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVLegFare.payForThisLeg = jVar.mo61690c();
                mVLegFare.mo27252i();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVLegFare.fares = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVFareData mVFareData = new MVFareData();
                    mVFareData.mo25201C1(jVar);
                    mVLegFare.fares.add(mVFareData);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVLegFare$d */
    public static class C8746d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8745c(0);
        }
    }

    static {
        new C17394d0("MVLegFare");
        HashMap hashMap = new HashMap();
        f25647e = hashMap;
        hashMap.put(C25239c.class, new C8744b());
        hashMap.put(C25240d.class, new C8746d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PAY_FOR_THIS_LEG, new FieldMetaData("payForThisLeg", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.FARES, new FieldMetaData("fares", (byte) 3, new ListMetaData(new StructMetaData(MVFareData.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25648f = unmodifiableMap;
        FieldMetaData.m61947a(MVLegFare.class, unmodifiableMap);
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
        ((C25238b) f25647e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25647e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27245a(MVLegFare mVLegFare) {
        if (mVLegFare == null) {
            return false;
        }
        boolean h = mo27250h();
        boolean h2 = mVLegFare.mo27250h();
        if (((h || h2) && (!h || !h2 || !this.price.mo26102a(mVLegFare.price))) || this.payForThisLeg != mVLegFare.payForThisLeg) {
            return false;
        }
        boolean f = mo27248f();
        boolean f2 = mVLegFare.mo27248f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.fares.equals(mVLegFare.fares)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVLegFare mVLegFare = (MVLegFare) obj;
        if (!getClass().equals(mVLegFare.getClass())) {
            return getClass().getName().compareTo(mVLegFare.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27250h()).compareTo(Boolean.valueOf(mVLegFare.mo27250h()));
        if (compareTo != 0 || ((mo27250h() && (compareTo = this.price.compareTo(mVLegFare.price)) != 0) || (compareTo = Boolean.valueOf(mo27249g()).compareTo(Boolean.valueOf(mVLegFare.mo27249g()))) != 0 || ((mo27249g() && (compareTo = C25082a.m62848l(this.payForThisLeg, mVLegFare.payForThisLeg)) != 0) || (compareTo = Boolean.valueOf(mo27248f()).compareTo(Boolean.valueOf(mVLegFare.mo27248f()))) != 0))) {
            return compareTo;
        }
        if (!mo27248f() || (h = C25082a.m62844h(this.fares, mVLegFare.fares)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLegFare)) {
            return mo27245a((MVLegFare) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27248f() {
        return this.fares != null;
    }

    /* renamed from: g */
    public final boolean mo27249g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27250h() {
        return this.price != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27252i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLegFare(", "price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("payForThisLeg:");
        C13555b.m33977q(n, this.payForThisLeg, ", ", "fares:");
        List<MVFareData> list = this.fares;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
