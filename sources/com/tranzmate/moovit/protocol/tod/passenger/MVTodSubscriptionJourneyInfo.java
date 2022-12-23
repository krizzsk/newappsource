package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVDayTime;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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

public class MVTodSubscriptionJourneyInfo implements TBase<MVTodSubscriptionJourneyInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodSubscriptionJourneyInfo> {

    /* renamed from: b */
    public static final C25113c f29627b = new C25113c("pickup", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29628c = new C25113c("dropoff", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29629d = new C25113c("pickupDayTime", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29630e = new C25113c("dropOffDayTime", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f29631f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29632g;
    public MVDayTime dropOffDayTime;
    public MVLocationDescriptor dropoff;
    private _Fields[] optionals = {_Fields.PICKUP_DAY_TIME, _Fields.DROP_OFF_DAY_TIME};
    public MVLocationDescriptor pickup;
    public MVDayTime pickupDayTime;

    public enum _Fields implements C25085c {
        PICKUP(1, "pickup"),
        DROPOFF(2, "dropoff"),
        PICKUP_DAY_TIME(3, "pickupDayTime"),
        DROP_OFF_DAY_TIME(4, "dropOffDayTime");
        
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
                return PICKUP;
            }
            if (i == 2) {
                return DROPOFF;
            }
            if (i == 3) {
                return PICKUP_DAY_TIME;
            }
            if (i != 4) {
                return null;
            }
            return DROP_OFF_DAY_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionJourneyInfo$a */
    public static class C11349a extends C25239c<MVTodSubscriptionJourneyInfo> {
        public C11349a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = (MVTodSubscriptionJourneyInfo) tBase;
            mVTodSubscriptionJourneyInfo.mo33819j();
            C25113c cVar = MVTodSubscriptionJourneyInfo.f29627b;
            gVar.mo61687K();
            if (mVTodSubscriptionJourneyInfo.pickup != null) {
                gVar.mo61711x(MVTodSubscriptionJourneyInfo.f29627b);
                mVTodSubscriptionJourneyInfo.pickup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodSubscriptionJourneyInfo.dropoff != null) {
                gVar.mo61711x(MVTodSubscriptionJourneyInfo.f29628c);
                mVTodSubscriptionJourneyInfo.dropoff.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodSubscriptionJourneyInfo.pickupDayTime != null && mVTodSubscriptionJourneyInfo.mo33818i()) {
                gVar.mo61711x(MVTodSubscriptionJourneyInfo.f29629d);
                mVTodSubscriptionJourneyInfo.pickupDayTime.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodSubscriptionJourneyInfo.dropOffDayTime != null && mVTodSubscriptionJourneyInfo.mo33814f()) {
                gVar.mo61711x(MVTodSubscriptionJourneyInfo.f29630e);
                mVTodSubscriptionJourneyInfo.dropOffDayTime.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = (MVTodSubscriptionJourneyInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodSubscriptionJourneyInfo.mo33819j();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVDayTime mVDayTime = new MVDayTime();
                                mVTodSubscriptionJourneyInfo.dropOffDayTime = mVDayTime;
                                mVDayTime.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVDayTime mVDayTime2 = new MVDayTime();
                            mVTodSubscriptionJourneyInfo.pickupDayTime = mVDayTime2;
                            mVDayTime2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                        mVTodSubscriptionJourneyInfo.dropoff = mVLocationDescriptor;
                        mVLocationDescriptor.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                    mVTodSubscriptionJourneyInfo.pickup = mVLocationDescriptor2;
                    mVLocationDescriptor2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionJourneyInfo$b */
    public static class C11350b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11349a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionJourneyInfo$c */
    public static class C11351c extends C25240d<MVTodSubscriptionJourneyInfo> {
        public C11351c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = (MVTodSubscriptionJourneyInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodSubscriptionJourneyInfo.mo33816h()) {
                bitSet.set(0);
            }
            if (mVTodSubscriptionJourneyInfo.mo33815g()) {
                bitSet.set(1);
            }
            if (mVTodSubscriptionJourneyInfo.mo33818i()) {
                bitSet.set(2);
            }
            if (mVTodSubscriptionJourneyInfo.mo33814f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodSubscriptionJourneyInfo.mo33816h()) {
                mVTodSubscriptionJourneyInfo.pickup.mo25202X0(jVar);
            }
            if (mVTodSubscriptionJourneyInfo.mo33815g()) {
                mVTodSubscriptionJourneyInfo.dropoff.mo25202X0(jVar);
            }
            if (mVTodSubscriptionJourneyInfo.mo33818i()) {
                mVTodSubscriptionJourneyInfo.pickupDayTime.mo25202X0(jVar);
            }
            if (mVTodSubscriptionJourneyInfo.mo33814f()) {
                mVTodSubscriptionJourneyInfo.dropOffDayTime.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = (MVTodSubscriptionJourneyInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVTodSubscriptionJourneyInfo.pickup = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVTodSubscriptionJourneyInfo.dropoff = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVDayTime mVDayTime = new MVDayTime();
                mVTodSubscriptionJourneyInfo.pickupDayTime = mVDayTime;
                mVDayTime.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVDayTime mVDayTime2 = new MVDayTime();
                mVTodSubscriptionJourneyInfo.dropOffDayTime = mVDayTime2;
                mVDayTime2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSubscriptionJourneyInfo$d */
    public static class C11352d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11351c(0);
        }
    }

    static {
        new C17394d0("MVTodSubscriptionJourneyInfo");
        HashMap hashMap = new HashMap();
        f29631f = hashMap;
        hashMap.put(C25239c.class, new C11350b());
        hashMap.put(C25240d.class, new C11352d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PICKUP, new FieldMetaData("pickup", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.DROPOFF, new FieldMetaData("dropoff", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.PICKUP_DAY_TIME, new FieldMetaData("pickupDayTime", (byte) 2, new StructMetaData(MVDayTime.class)));
        enumMap.put(_Fields.DROP_OFF_DAY_TIME, new FieldMetaData("dropOffDayTime", (byte) 2, new StructMetaData(MVDayTime.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29632g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodSubscriptionJourneyInfo.class, unmodifiableMap);
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
        ((C25238b) f29631f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29631f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33811a(MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo) {
        if (mVTodSubscriptionJourneyInfo == null) {
            return false;
        }
        boolean h = mo33816h();
        boolean h2 = mVTodSubscriptionJourneyInfo.mo33816h();
        if ((h || h2) && (!h || !h2 || !this.pickup.mo26317a(mVTodSubscriptionJourneyInfo.pickup))) {
            return false;
        }
        boolean g = mo33815g();
        boolean g2 = mVTodSubscriptionJourneyInfo.mo33815g();
        if ((g || g2) && (!g || !g2 || !this.dropoff.mo26317a(mVTodSubscriptionJourneyInfo.dropoff))) {
            return false;
        }
        boolean i = mo33818i();
        boolean i2 = mVTodSubscriptionJourneyInfo.mo33818i();
        if ((i || i2) && (!i || !i2 || !this.pickupDayTime.mo26115a(mVTodSubscriptionJourneyInfo.pickupDayTime))) {
            return false;
        }
        boolean f = mo33814f();
        boolean f2 = mVTodSubscriptionJourneyInfo.mo33814f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.dropOffDayTime.mo26115a(mVTodSubscriptionJourneyInfo.dropOffDayTime)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo = (MVTodSubscriptionJourneyInfo) obj;
        if (!getClass().equals(mVTodSubscriptionJourneyInfo.getClass())) {
            return getClass().getName().compareTo(mVTodSubscriptionJourneyInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33816h()).compareTo(Boolean.valueOf(mVTodSubscriptionJourneyInfo.mo33816h()));
        if (compareTo2 != 0 || ((mo33816h() && (compareTo2 = this.pickup.compareTo(mVTodSubscriptionJourneyInfo.pickup)) != 0) || (compareTo2 = Boolean.valueOf(mo33815g()).compareTo(Boolean.valueOf(mVTodSubscriptionJourneyInfo.mo33815g()))) != 0 || ((mo33815g() && (compareTo2 = this.dropoff.compareTo(mVTodSubscriptionJourneyInfo.dropoff)) != 0) || (compareTo2 = Boolean.valueOf(mo33818i()).compareTo(Boolean.valueOf(mVTodSubscriptionJourneyInfo.mo33818i()))) != 0 || ((mo33818i() && (compareTo2 = this.pickupDayTime.compareTo(mVTodSubscriptionJourneyInfo.pickupDayTime)) != 0) || (compareTo2 = Boolean.valueOf(mo33814f()).compareTo(Boolean.valueOf(mVTodSubscriptionJourneyInfo.mo33814f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo33814f() || (compareTo = this.dropOffDayTime.compareTo(mVTodSubscriptionJourneyInfo.dropOffDayTime)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodSubscriptionJourneyInfo)) {
            return mo33811a((MVTodSubscriptionJourneyInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33814f() {
        return this.dropOffDayTime != null;
    }

    /* renamed from: g */
    public final boolean mo33815g() {
        return this.dropoff != null;
    }

    /* renamed from: h */
    public final boolean mo33816h() {
        return this.pickup != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33818i() {
        return this.pickupDayTime != null;
    }

    /* renamed from: j */
    public final void mo33819j() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.pickup;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.dropoff;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
        MVDayTime mVDayTime = this.pickupDayTime;
        if (mVDayTime != null) {
            mVDayTime.getClass();
        }
        MVDayTime mVDayTime2 = this.dropOffDayTime;
        if (mVDayTime2 != null) {
            mVDayTime2.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodSubscriptionJourneyInfo(", "pickup:");
        MVLocationDescriptor mVLocationDescriptor = this.pickup;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(", ");
        n.append("dropoff:");
        MVLocationDescriptor mVLocationDescriptor2 = this.dropoff;
        if (mVLocationDescriptor2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor2);
        }
        if (mo33818i()) {
            n.append(", ");
            n.append("pickupDayTime:");
            MVDayTime mVDayTime = this.pickupDayTime;
            if (mVDayTime == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVDayTime);
            }
        }
        if (mo33814f()) {
            n.append(", ");
            n.append("dropOffDayTime:");
            MVDayTime mVDayTime2 = this.dropOffDayTime;
            if (mVDayTime2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVDayTime2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
