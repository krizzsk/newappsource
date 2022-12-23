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

public class MVTodAcceptRideUpdateOfferRequest implements TBase<MVTodAcceptRideUpdateOfferRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodAcceptRideUpdateOfferRequest> {

    /* renamed from: b */
    public static final C25113c f29343b = new C25113c("offerId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29344c = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29345d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29346e;
    public String offerId;
    private _Fields[] optionals = {_Fields.PRICE};
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        OFFER_ID(1, "offerId"),
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
                return OFFER_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodAcceptRideUpdateOfferRequest$a */
    public static class C11180a extends C25239c<MVTodAcceptRideUpdateOfferRequest> {
        public C11180a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodAcceptRideUpdateOfferRequest mVTodAcceptRideUpdateOfferRequest = (MVTodAcceptRideUpdateOfferRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTodAcceptRideUpdateOfferRequest.price;
            C25113c cVar = MVTodAcceptRideUpdateOfferRequest.f29343b;
            gVar.mo61687K();
            if (mVTodAcceptRideUpdateOfferRequest.offerId != null) {
                gVar.mo61711x(MVTodAcceptRideUpdateOfferRequest.f29343b);
                gVar.mo61686J(mVTodAcceptRideUpdateOfferRequest.offerId);
                gVar.mo61712y();
            }
            if (mVTodAcceptRideUpdateOfferRequest.price != null && mVTodAcceptRideUpdateOfferRequest.mo33338g()) {
                gVar.mo61711x(MVTodAcceptRideUpdateOfferRequest.f29344c);
                mVTodAcceptRideUpdateOfferRequest.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodAcceptRideUpdateOfferRequest mVTodAcceptRideUpdateOfferRequest = (MVTodAcceptRideUpdateOfferRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTodAcceptRideUpdateOfferRequest.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVTodAcceptRideUpdateOfferRequest.price = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodAcceptRideUpdateOfferRequest.offerId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodAcceptRideUpdateOfferRequest$b */
    public static class C11181b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11180a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodAcceptRideUpdateOfferRequest$c */
    public static class C11182c extends C25240d<MVTodAcceptRideUpdateOfferRequest> {
        public C11182c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodAcceptRideUpdateOfferRequest mVTodAcceptRideUpdateOfferRequest = (MVTodAcceptRideUpdateOfferRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodAcceptRideUpdateOfferRequest.mo33337f()) {
                bitSet.set(0);
            }
            if (mVTodAcceptRideUpdateOfferRequest.mo33338g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodAcceptRideUpdateOfferRequest.mo33337f()) {
                jVar.mo61686J(mVTodAcceptRideUpdateOfferRequest.offerId);
            }
            if (mVTodAcceptRideUpdateOfferRequest.mo33338g()) {
                mVTodAcceptRideUpdateOfferRequest.price.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodAcceptRideUpdateOfferRequest mVTodAcceptRideUpdateOfferRequest = (MVTodAcceptRideUpdateOfferRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodAcceptRideUpdateOfferRequest.offerId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodAcceptRideUpdateOfferRequest.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodAcceptRideUpdateOfferRequest$d */
    public static class C11183d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11182c(0);
        }
    }

    static {
        new C17394d0("MVTodAcceptRideUpdateOfferRequest");
        HashMap hashMap = new HashMap();
        f29345d = hashMap;
        hashMap.put(C25239c.class, new C11181b());
        hashMap.put(C25240d.class, new C11183d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OFFER_ID, new FieldMetaData("offerId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29346e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodAcceptRideUpdateOfferRequest.class, unmodifiableMap);
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
        ((C25238b) f29345d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29345d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodAcceptRideUpdateOfferRequest mVTodAcceptRideUpdateOfferRequest = (MVTodAcceptRideUpdateOfferRequest) obj;
        if (!getClass().equals(mVTodAcceptRideUpdateOfferRequest.getClass())) {
            return getClass().getName().compareTo(mVTodAcceptRideUpdateOfferRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33337f()).compareTo(Boolean.valueOf(mVTodAcceptRideUpdateOfferRequest.mo33337f()));
        if (compareTo2 != 0 || ((mo33337f() && (compareTo2 = this.offerId.compareTo(mVTodAcceptRideUpdateOfferRequest.offerId)) != 0) || (compareTo2 = Boolean.valueOf(mo33338g()).compareTo(Boolean.valueOf(mVTodAcceptRideUpdateOfferRequest.mo33338g()))) != 0)) {
            return compareTo2;
        }
        if (!mo33338g() || (compareTo = this.price.compareTo(mVTodAcceptRideUpdateOfferRequest.price)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodAcceptRideUpdateOfferRequest)) {
            return false;
        }
        MVTodAcceptRideUpdateOfferRequest mVTodAcceptRideUpdateOfferRequest = (MVTodAcceptRideUpdateOfferRequest) obj;
        boolean f = mo33337f();
        boolean f2 = mVTodAcceptRideUpdateOfferRequest.mo33337f();
        if ((f || f2) && (!f || !f2 || !this.offerId.equals(mVTodAcceptRideUpdateOfferRequest.offerId))) {
            return false;
        }
        boolean g = mo33338g();
        boolean g2 = mVTodAcceptRideUpdateOfferRequest.mo33338g();
        if ((g || g2) && (!g || !g2 || !this.price.mo26102a(mVTodAcceptRideUpdateOfferRequest.price))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33337f() {
        return this.offerId != null;
    }

    /* renamed from: g */
    public final boolean mo33338g() {
        return this.price != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodAcceptRideUpdateOfferRequest(", "offerId:");
        String str = this.offerId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33338g()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        n.append(")");
        return n.toString();
    }
}
