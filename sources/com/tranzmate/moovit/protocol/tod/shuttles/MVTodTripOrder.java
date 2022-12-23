package com.tranzmate.moovit.protocol.tod.shuttles;

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

public class MVTodTripOrder implements TBase<MVTodTripOrder, _Fields>, Serializable, Cloneable, Comparable<MVTodTripOrder> {

    /* renamed from: b */
    public static final C25113c f29767b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29768c = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29769d = new C25113c("proposals", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29770e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29771f;
    public MVCurrencyAmount price;
    public MVTodTripOrderProposals proposals;
    public String rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        PRICE(2, InAppPurchaseMetaData.KEY_PRICE),
        PROPOSALS(3, "proposals");
        
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
                return RIDE_ID;
            }
            if (i == 2) {
                return PRICE;
            }
            if (i != 3) {
                return null;
            }
            return PROPOSALS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrder$a */
    public static class C11449a extends C25239c<MVTodTripOrder> {
        public C11449a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodTripOrder mVTodTripOrder = (MVTodTripOrder) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTodTripOrder.price;
            C25113c cVar = MVTodTripOrder.f29767b;
            gVar.mo61687K();
            if (mVTodTripOrder.rideId != null) {
                gVar.mo61711x(MVTodTripOrder.f29767b);
                gVar.mo61686J(mVTodTripOrder.rideId);
                gVar.mo61712y();
            }
            if (mVTodTripOrder.price != null) {
                gVar.mo61711x(MVTodTripOrder.f29768c);
                mVTodTripOrder.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodTripOrder.proposals != null) {
                gVar.mo61711x(MVTodTripOrder.f29769d);
                mVTodTripOrder.proposals.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodTripOrder mVTodTripOrder = (MVTodTripOrder) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTodTripOrder.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVTodTripOrderProposals mVTodTripOrderProposals = new MVTodTripOrderProposals();
                            mVTodTripOrder.proposals = mVTodTripOrderProposals;
                            mVTodTripOrderProposals.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVTodTripOrder.price = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodTripOrder.rideId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrder$b */
    public static class C11450b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11449a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrder$c */
    public static class C11451c extends C25240d<MVTodTripOrder> {
        public C11451c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodTripOrder mVTodTripOrder = (MVTodTripOrder) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodTripOrder.mo34051h()) {
                bitSet.set(0);
            }
            if (mVTodTripOrder.mo34049f()) {
                bitSet.set(1);
            }
            if (mVTodTripOrder.mo34050g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodTripOrder.mo34051h()) {
                jVar.mo61686J(mVTodTripOrder.rideId);
            }
            if (mVTodTripOrder.mo34049f()) {
                mVTodTripOrder.price.mo25202X0(jVar);
            }
            if (mVTodTripOrder.mo34050g()) {
                mVTodTripOrder.proposals.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodTripOrder mVTodTripOrder = (MVTodTripOrder) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodTripOrder.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodTripOrder.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTodTripOrderProposals mVTodTripOrderProposals = new MVTodTripOrderProposals();
                mVTodTripOrder.proposals = mVTodTripOrderProposals;
                mVTodTripOrderProposals.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrder$d */
    public static class C11452d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11451c(0);
        }
    }

    static {
        new C17394d0("MVTodTripOrder");
        HashMap hashMap = new HashMap();
        f29770e = hashMap;
        hashMap.put(C25239c.class, new C11450b());
        hashMap.put(C25240d.class, new C11452d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PROPOSALS, new FieldMetaData("proposals", (byte) 3, new StructMetaData(MVTodTripOrderProposals.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29771f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodTripOrder.class, unmodifiableMap);
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
        ((C25238b) f29770e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29770e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34046a(MVTodTripOrder mVTodTripOrder) {
        if (mVTodTripOrder == null) {
            return false;
        }
        boolean h = mo34051h();
        boolean h2 = mVTodTripOrder.mo34051h();
        if ((h || h2) && (!h || !h2 || !this.rideId.equals(mVTodTripOrder.rideId))) {
            return false;
        }
        boolean f = mo34049f();
        boolean f2 = mVTodTripOrder.mo34049f();
        if ((f || f2) && (!f || !f2 || !this.price.mo26102a(mVTodTripOrder.price))) {
            return false;
        }
        boolean g = mo34050g();
        boolean g2 = mVTodTripOrder.mo34050g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.proposals.mo34055a(mVTodTripOrder.proposals)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodTripOrder mVTodTripOrder = (MVTodTripOrder) obj;
        if (!getClass().equals(mVTodTripOrder.getClass())) {
            return getClass().getName().compareTo(mVTodTripOrder.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34051h()).compareTo(Boolean.valueOf(mVTodTripOrder.mo34051h()));
        if (compareTo2 != 0 || ((mo34051h() && (compareTo2 = this.rideId.compareTo(mVTodTripOrder.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo34049f()).compareTo(Boolean.valueOf(mVTodTripOrder.mo34049f()))) != 0 || ((mo34049f() && (compareTo2 = this.price.compareTo(mVTodTripOrder.price)) != 0) || (compareTo2 = Boolean.valueOf(mo34050g()).compareTo(Boolean.valueOf(mVTodTripOrder.mo34050g()))) != 0))) {
            return compareTo2;
        }
        if (!mo34050g() || (compareTo = this.proposals.compareTo(mVTodTripOrder.proposals)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodTripOrder)) {
            return mo34046a((MVTodTripOrder) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34049f() {
        return this.price != null;
    }

    /* renamed from: g */
    public final boolean mo34050g() {
        return this.proposals != null;
    }

    /* renamed from: h */
    public final boolean mo34051h() {
        return this.rideId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodTripOrder(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("proposals:");
        MVTodTripOrderProposals mVTodTripOrderProposals = this.proposals;
        if (mVTodTripOrderProposals == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodTripOrderProposals);
        }
        n.append(")");
        return n.toString();
    }
}
