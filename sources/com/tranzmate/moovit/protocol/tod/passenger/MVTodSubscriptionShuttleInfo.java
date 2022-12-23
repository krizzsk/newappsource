package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
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

public class MVTodSubscriptionShuttleInfo implements TBase<MVTodSubscriptionShuttleInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodSubscriptionShuttleInfo> {

    /* renamed from: b */
    public static final C25113c f29637b = new C25113c("patternId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29638c = new C25113c("patternName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29639d = new C25113c("taxiProviderId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29640e = new C25113c("journeyInfo", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29641f = new C25113c("orderInfo", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f29642g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f29643h;
    private byte __isset_bitfield = 0;
    public MVTodSubscriptionJourneyInfo journeyInfo;
    public MVTodSubscriptionOrderInfo orderInfo;
    public String patternId;
    public String patternName;
    public int taxiProviderId;

    public enum _Fields implements C25085c {
        PATTERN_ID(1, "patternId"),
        PATTERN_NAME(2, "patternName"),
        TAXI_PROVIDER_ID(3, "taxiProviderId"),
        JOURNEY_INFO(4, "journeyInfo"),
        ORDER_INFO(5, "orderInfo");
        
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
                return PATTERN_ID;
            }
            if (i == 2) {
                return PATTERN_NAME;
            }
            if (i == 3) {
                return TAXI_PROVIDER_ID;
            }
            if (i == 4) {
                return JOURNEY_INFO;
            }
            if (i != 5) {
                return null;
            }
            return ORDER_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionShuttleInfo$a */
    public static class C11357a extends C25239c<MVTodSubscriptionShuttleInfo> {
        public C11357a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = (MVTodSubscriptionShuttleInfo) tBase;
            MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = mVTodSubscriptionShuttleInfo.journeyInfo;
            if (mVTodSubscriptionJourneyInfo != null) {
                mVTodSubscriptionJourneyInfo.mo33819j();
            }
            C25113c cVar = MVTodSubscriptionShuttleInfo.f29637b;
            gVar.mo61687K();
            if (mVTodSubscriptionShuttleInfo.patternId != null) {
                gVar.mo61711x(MVTodSubscriptionShuttleInfo.f29637b);
                gVar.mo61686J(mVTodSubscriptionShuttleInfo.patternId);
                gVar.mo61712y();
            }
            if (mVTodSubscriptionShuttleInfo.patternName != null) {
                gVar.mo61711x(MVTodSubscriptionShuttleInfo.f29638c);
                gVar.mo61686J(mVTodSubscriptionShuttleInfo.patternName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodSubscriptionShuttleInfo.f29639d);
            gVar.mo61678B(mVTodSubscriptionShuttleInfo.taxiProviderId);
            gVar.mo61712y();
            if (mVTodSubscriptionShuttleInfo.journeyInfo != null) {
                gVar.mo61711x(MVTodSubscriptionShuttleInfo.f29640e);
                mVTodSubscriptionShuttleInfo.journeyInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodSubscriptionShuttleInfo.orderInfo != null) {
                gVar.mo61711x(MVTodSubscriptionShuttleInfo.f29641f);
                mVTodSubscriptionShuttleInfo.orderInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = (MVTodSubscriptionShuttleInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = new MVTodSubscriptionOrderInfo();
                                    mVTodSubscriptionShuttleInfo.orderInfo = mVTodSubscriptionOrderInfo;
                                    mVTodSubscriptionOrderInfo.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = new MVTodSubscriptionJourneyInfo();
                                mVTodSubscriptionShuttleInfo.journeyInfo = mVTodSubscriptionJourneyInfo;
                                mVTodSubscriptionJourneyInfo.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVTodSubscriptionShuttleInfo.taxiProviderId = gVar.mo61696i();
                            mVTodSubscriptionShuttleInfo.mo33840k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodSubscriptionShuttleInfo.patternName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodSubscriptionShuttleInfo.patternId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo2 = mVTodSubscriptionShuttleInfo.journeyInfo;
            if (mVTodSubscriptionJourneyInfo2 != null) {
                mVTodSubscriptionJourneyInfo2.mo33819j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionShuttleInfo$b */
    public static class C11358b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11357a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionShuttleInfo$c */
    public static class C11359c extends C25240d<MVTodSubscriptionShuttleInfo> {
        public C11359c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = (MVTodSubscriptionShuttleInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodSubscriptionShuttleInfo.mo33836h()) {
                bitSet.set(0);
            }
            if (mVTodSubscriptionShuttleInfo.mo33838i()) {
                bitSet.set(1);
            }
            if (mVTodSubscriptionShuttleInfo.mo33839j()) {
                bitSet.set(2);
            }
            if (mVTodSubscriptionShuttleInfo.mo33834f()) {
                bitSet.set(3);
            }
            if (mVTodSubscriptionShuttleInfo.mo33835g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVTodSubscriptionShuttleInfo.mo33836h()) {
                jVar.mo61686J(mVTodSubscriptionShuttleInfo.patternId);
            }
            if (mVTodSubscriptionShuttleInfo.mo33838i()) {
                jVar.mo61686J(mVTodSubscriptionShuttleInfo.patternName);
            }
            if (mVTodSubscriptionShuttleInfo.mo33839j()) {
                jVar.mo61678B(mVTodSubscriptionShuttleInfo.taxiProviderId);
            }
            if (mVTodSubscriptionShuttleInfo.mo33834f()) {
                mVTodSubscriptionShuttleInfo.journeyInfo.mo25202X0(jVar);
            }
            if (mVTodSubscriptionShuttleInfo.mo33835g()) {
                mVTodSubscriptionShuttleInfo.orderInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = (MVTodSubscriptionShuttleInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVTodSubscriptionShuttleInfo.patternId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodSubscriptionShuttleInfo.patternName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTodSubscriptionShuttleInfo.taxiProviderId = jVar.mo61696i();
                mVTodSubscriptionShuttleInfo.mo33840k();
            }
            if (T.get(3)) {
                MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = new MVTodSubscriptionJourneyInfo();
                mVTodSubscriptionShuttleInfo.journeyInfo = mVTodSubscriptionJourneyInfo;
                mVTodSubscriptionJourneyInfo.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = new MVTodSubscriptionOrderInfo();
                mVTodSubscriptionShuttleInfo.orderInfo = mVTodSubscriptionOrderInfo;
                mVTodSubscriptionOrderInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionShuttleInfo$d */
    public static class C11360d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11359c(0);
        }
    }

    static {
        new C17394d0("MVTodSubscriptionShuttleInfo");
        HashMap hashMap = new HashMap();
        f29642g = hashMap;
        hashMap.put(C25239c.class, new C11358b());
        hashMap.put(C25240d.class, new C11360d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PATTERN_ID, new FieldMetaData("patternId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PATTERN_NAME, new FieldMetaData("patternName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TAXI_PROVIDER_ID, new FieldMetaData("taxiProviderId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.JOURNEY_INFO, new FieldMetaData("journeyInfo", (byte) 3, new StructMetaData(MVTodSubscriptionJourneyInfo.class)));
        enumMap.put(_Fields.ORDER_INFO, new FieldMetaData("orderInfo", (byte) 3, new StructMetaData(MVTodSubscriptionOrderInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29643h = unmodifiableMap;
        FieldMetaData.m61947a(MVTodSubscriptionShuttleInfo.class, unmodifiableMap);
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
        ((C25238b) f29642g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29642g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33831a(MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo) {
        if (mVTodSubscriptionShuttleInfo == null) {
            return false;
        }
        boolean h = mo33836h();
        boolean h2 = mVTodSubscriptionShuttleInfo.mo33836h();
        if ((h || h2) && (!h || !h2 || !this.patternId.equals(mVTodSubscriptionShuttleInfo.patternId))) {
            return false;
        }
        boolean i = mo33838i();
        boolean i2 = mVTodSubscriptionShuttleInfo.mo33838i();
        if (((i || i2) && (!i || !i2 || !this.patternName.equals(mVTodSubscriptionShuttleInfo.patternName))) || this.taxiProviderId != mVTodSubscriptionShuttleInfo.taxiProviderId) {
            return false;
        }
        boolean f = mo33834f();
        boolean f2 = mVTodSubscriptionShuttleInfo.mo33834f();
        if ((f || f2) && (!f || !f2 || !this.journeyInfo.mo33811a(mVTodSubscriptionShuttleInfo.journeyInfo))) {
            return false;
        }
        boolean g = mo33835g();
        boolean g2 = mVTodSubscriptionShuttleInfo.mo33835g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.orderInfo.mo33822a(mVTodSubscriptionShuttleInfo.orderInfo)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = (MVTodSubscriptionShuttleInfo) obj;
        if (!getClass().equals(mVTodSubscriptionShuttleInfo.getClass())) {
            return getClass().getName().compareTo(mVTodSubscriptionShuttleInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33836h()).compareTo(Boolean.valueOf(mVTodSubscriptionShuttleInfo.mo33836h()));
        if (compareTo2 != 0 || ((mo33836h() && (compareTo2 = this.patternId.compareTo(mVTodSubscriptionShuttleInfo.patternId)) != 0) || (compareTo2 = Boolean.valueOf(mo33838i()).compareTo(Boolean.valueOf(mVTodSubscriptionShuttleInfo.mo33838i()))) != 0 || ((mo33838i() && (compareTo2 = this.patternName.compareTo(mVTodSubscriptionShuttleInfo.patternName)) != 0) || (compareTo2 = Boolean.valueOf(mo33839j()).compareTo(Boolean.valueOf(mVTodSubscriptionShuttleInfo.mo33839j()))) != 0 || ((mo33839j() && (compareTo2 = C25082a.m62839c(this.taxiProviderId, mVTodSubscriptionShuttleInfo.taxiProviderId)) != 0) || (compareTo2 = Boolean.valueOf(mo33834f()).compareTo(Boolean.valueOf(mVTodSubscriptionShuttleInfo.mo33834f()))) != 0 || ((mo33834f() && (compareTo2 = this.journeyInfo.compareTo(mVTodSubscriptionShuttleInfo.journeyInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo33835g()).compareTo(Boolean.valueOf(mVTodSubscriptionShuttleInfo.mo33835g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo33835g() || (compareTo = this.orderInfo.compareTo(mVTodSubscriptionShuttleInfo.orderInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodSubscriptionShuttleInfo)) {
            return mo33831a((MVTodSubscriptionShuttleInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33834f() {
        return this.journeyInfo != null;
    }

    /* renamed from: g */
    public final boolean mo33835g() {
        return this.orderInfo != null;
    }

    /* renamed from: h */
    public final boolean mo33836h() {
        return this.patternId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33838i() {
        return this.patternName != null;
    }

    /* renamed from: j */
    public final boolean mo33839j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo33840k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodSubscriptionShuttleInfo(", "patternId:");
        String str = this.patternId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("patternName:");
        String str2 = this.patternName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("taxiProviderId:");
        C0016g.m42z(n, this.taxiProviderId, ", ", "journeyInfo:");
        MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = this.journeyInfo;
        if (mVTodSubscriptionJourneyInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodSubscriptionJourneyInfo);
        }
        n.append(", ");
        n.append("orderInfo:");
        MVTodSubscriptionOrderInfo mVTodSubscriptionOrderInfo = this.orderInfo;
        if (mVTodSubscriptionOrderInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodSubscriptionOrderInfo);
        }
        n.append(")");
        return n.toString();
    }
}
