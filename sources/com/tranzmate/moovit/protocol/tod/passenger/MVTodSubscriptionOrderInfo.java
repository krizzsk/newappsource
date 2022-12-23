package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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
import p001a0.C0016g;
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

public class MVTodSubscriptionOrderInfo implements TBase<MVTodSubscriptionOrderInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodSubscriptionOrderInfo> {

    /* renamed from: b */
    public static final C25113c f29633b = new C25113c("numberOfPassengers", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29634c = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29635d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29636e;
    private byte __isset_bitfield = 0;
    public int numberOfPassengers;
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        NUMBER_OF_PASSENGERS(1, "numberOfPassengers"),
        PRICE(2, InAppPurchaseMetaData.KEY_PRICE);
        
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
                return NUMBER_OF_PASSENGERS;
            }
            if (i != 2) {
                return null;
            }
            return PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionOrderInfo$a */
    public static class C11353a extends C25239c<MVTodSubscriptionOrderInfo> {
        public C11353a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = (MVTodSubscriptionOrderInfo) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTodSubscriptionOrderInfo.price;
            C25113c cVar = MVTodSubscriptionOrderInfo.f29633b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodSubscriptionOrderInfo.f29633b);
            gVar.mo61678B(mVTodSubscriptionOrderInfo.numberOfPassengers);
            gVar.mo61712y();
            if (mVTodSubscriptionOrderInfo.price != null) {
                gVar.mo61711x(MVTodSubscriptionOrderInfo.f29634c);
                mVTodSubscriptionOrderInfo.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = (MVTodSubscriptionOrderInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTodSubscriptionOrderInfo.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVTodSubscriptionOrderInfo.price = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTodSubscriptionOrderInfo.numberOfPassengers = gVar.mo61696i();
                    mVTodSubscriptionOrderInfo.mo33827h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionOrderInfo$b */
    public static class C11354b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11353a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionOrderInfo$c */
    public static class C11355c extends C25240d<MVTodSubscriptionOrderInfo> {
        public C11355c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = (MVTodSubscriptionOrderInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodSubscriptionOrderInfo.mo33825f()) {
                bitSet.set(0);
            }
            if (mVTodSubscriptionOrderInfo.mo33826g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodSubscriptionOrderInfo.mo33825f()) {
                jVar.mo61678B(mVTodSubscriptionOrderInfo.numberOfPassengers);
            }
            if (mVTodSubscriptionOrderInfo.mo33826g()) {
                mVTodSubscriptionOrderInfo.price.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = (MVTodSubscriptionOrderInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodSubscriptionOrderInfo.numberOfPassengers = jVar.mo61696i();
                mVTodSubscriptionOrderInfo.mo33827h();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodSubscriptionOrderInfo.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionOrderInfo$d */
    public static class C11356d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11355c(0);
        }
    }

    static {
        new C17394d0("MVTodSubscriptionOrderInfo");
        HashMap hashMap = new HashMap();
        f29635d = hashMap;
        hashMap.put(C25239c.class, new C11354b());
        hashMap.put(C25240d.class, new C11356d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NUMBER_OF_PASSENGERS, new FieldMetaData("numberOfPassengers", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29636e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodSubscriptionOrderInfo.class, unmodifiableMap);
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
        ((C25238b) f29635d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29635d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33822a(MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo) {
        if (mVTodSubscriptionOrderInfo == null || this.numberOfPassengers != mVTodSubscriptionOrderInfo.numberOfPassengers) {
            return false;
        }
        boolean g = mo33826g();
        boolean g2 = mVTodSubscriptionOrderInfo.mo33826g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.price.mo26102a(mVTodSubscriptionOrderInfo.price)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = (MVTodSubscriptionOrderInfo) obj;
        if (!getClass().equals(mVTodSubscriptionOrderInfo.getClass())) {
            return getClass().getName().compareTo(mVTodSubscriptionOrderInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33825f()).compareTo(Boolean.valueOf(mVTodSubscriptionOrderInfo.mo33825f()));
        if (compareTo2 != 0 || ((mo33825f() && (compareTo2 = C25082a.m62839c(this.numberOfPassengers, mVTodSubscriptionOrderInfo.numberOfPassengers)) != 0) || (compareTo2 = Boolean.valueOf(mo33826g()).compareTo(Boolean.valueOf(mVTodSubscriptionOrderInfo.mo33826g()))) != 0)) {
            return compareTo2;
        }
        if (!mo33826g() || (compareTo = this.price.compareTo(mVTodSubscriptionOrderInfo.price)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodSubscriptionOrderInfo)) {
            return mo33822a((MVTodSubscriptionOrderInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33825f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33826g() {
        return this.price != null;
    }

    /* renamed from: h */
    public final void mo33827h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodSubscriptionOrderInfo(", "numberOfPassengers:");
        C0016g.m42z(n, this.numberOfPassengers, ", ", "price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(")");
        return n.toString();
    }
}
