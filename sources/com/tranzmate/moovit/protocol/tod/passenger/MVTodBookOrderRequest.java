package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
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

public class MVTodBookOrderRequest implements TBase<MVTodBookOrderRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodBookOrderRequest> {

    /* renamed from: b */
    public static final C25113c f29350b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29351c = new C25113c("payOnboard", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f29352d = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29353e = new C25113c("paymentProvider", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29354f = new C25113c("discountContextId", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f29355g = new C25113c("itineraryGuid", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f29356h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f29357i;
    private byte __isset_bitfield = 0;
    public String discountContextId;
    public String itineraryGuid;
    private _Fields[] optionals = {_Fields.PAY_ONBOARD, _Fields.PRICE, _Fields.PAYMENT_PROVIDER, _Fields.DISCOUNT_CONTEXT_ID, _Fields.ITINERARY_GUID};
    public boolean payOnboard;
    public MVPaymentProvider paymentProvider;
    public MVCurrencyAmount price;
    public String rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        PAY_ONBOARD(2, "payOnboard"),
        PRICE(3, InAppPurchaseMetaData.KEY_PRICE),
        PAYMENT_PROVIDER(4, "paymentProvider"),
        DISCOUNT_CONTEXT_ID(5, "discountContextId"),
        ITINERARY_GUID(6, "itineraryGuid");
        
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
                    return RIDE_ID;
                case 2:
                    return PAY_ONBOARD;
                case 3:
                    return PRICE;
                case 4:
                    return PAYMENT_PROVIDER;
                case 5:
                    return DISCOUNT_CONTEXT_ID;
                case 6:
                    return ITINERARY_GUID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodBookOrderRequest$a */
    public static class C11188a extends C25239c<MVTodBookOrderRequest> {
        public C11188a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodBookOrderRequest mVTodBookOrderRequest = (MVTodBookOrderRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTodBookOrderRequest.price;
            C25113c cVar = MVTodBookOrderRequest.f29350b;
            gVar.mo61687K();
            if (mVTodBookOrderRequest.rideId != null) {
                gVar.mo61711x(MVTodBookOrderRequest.f29350b);
                gVar.mo61686J(mVTodBookOrderRequest.rideId);
                gVar.mo61712y();
            }
            if (mVTodBookOrderRequest.mo33352h()) {
                gVar.mo61711x(MVTodBookOrderRequest.f29351c);
                gVar.mo61708u(mVTodBookOrderRequest.payOnboard);
                gVar.mo61712y();
            }
            if (mVTodBookOrderRequest.price != null && mVTodBookOrderRequest.mo33355j()) {
                gVar.mo61711x(MVTodBookOrderRequest.f29352d);
                mVTodBookOrderRequest.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodBookOrderRequest.paymentProvider != null && mVTodBookOrderRequest.mo33354i()) {
                gVar.mo61711x(MVTodBookOrderRequest.f29353e);
                mVTodBookOrderRequest.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodBookOrderRequest.discountContextId != null && mVTodBookOrderRequest.mo33350f()) {
                gVar.mo61711x(MVTodBookOrderRequest.f29354f);
                gVar.mo61686J(mVTodBookOrderRequest.discountContextId);
                gVar.mo61712y();
            }
            if (mVTodBookOrderRequest.itineraryGuid != null && mVTodBookOrderRequest.mo33351g()) {
                gVar.mo61711x(MVTodBookOrderRequest.f29355g);
                gVar.mo61686J(mVTodBookOrderRequest.itineraryGuid);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodBookOrderRequest mVTodBookOrderRequest = (MVTodBookOrderRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTodBookOrderRequest.price;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodBookOrderRequest.rideId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodBookOrderRequest.payOnboard = gVar.mo61690c();
                            mVTodBookOrderRequest.mo33357l();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVTodBookOrderRequest.price = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                            mVTodBookOrderRequest.paymentProvider = mVPaymentProvider;
                            mVPaymentProvider.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodBookOrderRequest.discountContextId = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodBookOrderRequest.itineraryGuid = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodBookOrderRequest$b */
    public static class C11189b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11188a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodBookOrderRequest$c */
    public static class C11190c extends C25240d<MVTodBookOrderRequest> {
        public C11190c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodBookOrderRequest mVTodBookOrderRequest = (MVTodBookOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodBookOrderRequest.mo33356k()) {
                bitSet.set(0);
            }
            if (mVTodBookOrderRequest.mo33352h()) {
                bitSet.set(1);
            }
            if (mVTodBookOrderRequest.mo33355j()) {
                bitSet.set(2);
            }
            if (mVTodBookOrderRequest.mo33354i()) {
                bitSet.set(3);
            }
            if (mVTodBookOrderRequest.mo33350f()) {
                bitSet.set(4);
            }
            if (mVTodBookOrderRequest.mo33351g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVTodBookOrderRequest.mo33356k()) {
                jVar.mo61686J(mVTodBookOrderRequest.rideId);
            }
            if (mVTodBookOrderRequest.mo33352h()) {
                jVar.mo61708u(mVTodBookOrderRequest.payOnboard);
            }
            if (mVTodBookOrderRequest.mo33355j()) {
                mVTodBookOrderRequest.price.mo25202X0(jVar);
            }
            if (mVTodBookOrderRequest.mo33354i()) {
                mVTodBookOrderRequest.paymentProvider.mo25202X0(jVar);
            }
            if (mVTodBookOrderRequest.mo33350f()) {
                jVar.mo61686J(mVTodBookOrderRequest.discountContextId);
            }
            if (mVTodBookOrderRequest.mo33351g()) {
                jVar.mo61686J(mVTodBookOrderRequest.itineraryGuid);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodBookOrderRequest mVTodBookOrderRequest = (MVTodBookOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVTodBookOrderRequest.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodBookOrderRequest.payOnboard = jVar.mo61690c();
                mVTodBookOrderRequest.mo33357l();
            }
            if (T.get(2)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodBookOrderRequest.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVTodBookOrderRequest.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVTodBookOrderRequest.discountContextId = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVTodBookOrderRequest.itineraryGuid = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodBookOrderRequest$d */
    public static class C11191d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11190c(0);
        }
    }

    static {
        new C17394d0("MVTodBookOrderRequest");
        HashMap hashMap = new HashMap();
        f29356h = hashMap;
        hashMap.put(C25239c.class, new C11189b());
        hashMap.put(C25240d.class, new C11191d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAY_ONBOARD, new FieldMetaData("payOnboard", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITINERARY_GUID, new FieldMetaData("itineraryGuid", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29357i = unmodifiableMap;
        FieldMetaData.m61947a(MVTodBookOrderRequest.class, unmodifiableMap);
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
        ((C25238b) f29356h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29356h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodBookOrderRequest mVTodBookOrderRequest = (MVTodBookOrderRequest) obj;
        if (!getClass().equals(mVTodBookOrderRequest.getClass())) {
            return getClass().getName().compareTo(mVTodBookOrderRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33356k()).compareTo(Boolean.valueOf(mVTodBookOrderRequest.mo33356k()));
        if (compareTo2 != 0 || ((mo33356k() && (compareTo2 = this.rideId.compareTo(mVTodBookOrderRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo33352h()).compareTo(Boolean.valueOf(mVTodBookOrderRequest.mo33352h()))) != 0 || ((mo33352h() && (compareTo2 = C25082a.m62848l(this.payOnboard, mVTodBookOrderRequest.payOnboard)) != 0) || (compareTo2 = Boolean.valueOf(mo33355j()).compareTo(Boolean.valueOf(mVTodBookOrderRequest.mo33355j()))) != 0 || ((mo33355j() && (compareTo2 = this.price.compareTo(mVTodBookOrderRequest.price)) != 0) || (compareTo2 = Boolean.valueOf(mo33354i()).compareTo(Boolean.valueOf(mVTodBookOrderRequest.mo33354i()))) != 0 || ((mo33354i() && (compareTo2 = this.paymentProvider.compareTo(mVTodBookOrderRequest.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo33350f()).compareTo(Boolean.valueOf(mVTodBookOrderRequest.mo33350f()))) != 0 || ((mo33350f() && (compareTo2 = this.discountContextId.compareTo(mVTodBookOrderRequest.discountContextId)) != 0) || (compareTo2 = Boolean.valueOf(mo33351g()).compareTo(Boolean.valueOf(mVTodBookOrderRequest.mo33351g()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo33351g() || (compareTo = this.itineraryGuid.compareTo(mVTodBookOrderRequest.itineraryGuid)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodBookOrderRequest)) {
            return false;
        }
        MVTodBookOrderRequest mVTodBookOrderRequest = (MVTodBookOrderRequest) obj;
        boolean k = mo33356k();
        boolean k2 = mVTodBookOrderRequest.mo33356k();
        if ((k || k2) && (!k || !k2 || !this.rideId.equals(mVTodBookOrderRequest.rideId))) {
            return false;
        }
        boolean h = mo33352h();
        boolean h2 = mVTodBookOrderRequest.mo33352h();
        if ((h || h2) && (!h || !h2 || this.payOnboard != mVTodBookOrderRequest.payOnboard)) {
            return false;
        }
        boolean j = mo33355j();
        boolean j2 = mVTodBookOrderRequest.mo33355j();
        if ((j || j2) && (!j || !j2 || !this.price.mo26102a(mVTodBookOrderRequest.price))) {
            return false;
        }
        boolean i = mo33354i();
        boolean i2 = mVTodBookOrderRequest.mo33354i();
        if ((i || i2) && (!i || !i2 || !this.paymentProvider.mo30299m(mVTodBookOrderRequest.paymentProvider))) {
            return false;
        }
        boolean f = mo33350f();
        boolean f2 = mVTodBookOrderRequest.mo33350f();
        if ((f || f2) && (!f || !f2 || !this.discountContextId.equals(mVTodBookOrderRequest.discountContextId))) {
            return false;
        }
        boolean g = mo33351g();
        boolean g2 = mVTodBookOrderRequest.mo33351g();
        if ((g || g2) && (!g || !g2 || !this.itineraryGuid.equals(mVTodBookOrderRequest.itineraryGuid))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33350f() {
        return this.discountContextId != null;
    }

    /* renamed from: g */
    public final boolean mo33351g() {
        return this.itineraryGuid != null;
    }

    /* renamed from: h */
    public final boolean mo33352h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33354i() {
        return this.paymentProvider != null;
    }

    /* renamed from: j */
    public final boolean mo33355j() {
        return this.price != null;
    }

    /* renamed from: k */
    public final boolean mo33356k() {
        return this.rideId != null;
    }

    /* renamed from: l */
    public final void mo33357l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodBookOrderRequest(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33352h()) {
            n.append(", ");
            n.append("payOnboard:");
            n.append(this.payOnboard);
        }
        if (mo33355j()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo33354i()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        if (mo33350f()) {
            n.append(", ");
            n.append("discountContextId:");
            String str2 = this.discountContextId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo33351g()) {
            n.append(", ");
            n.append("itineraryGuid:");
            String str3 = this.itineraryGuid;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
