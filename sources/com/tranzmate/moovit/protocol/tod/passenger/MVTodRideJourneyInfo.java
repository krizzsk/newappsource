package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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

public class MVTodRideJourneyInfo implements TBase<MVTodRideJourneyInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodRideJourneyInfo> {

    /* renamed from: b */
    public static final C25113c f29548b = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29549c = new C25113c("pickup", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29550d = new C25113c("dropoff", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29551e = new C25113c("destination", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29552f = new C25113c("pickupWalkingTime", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f29553g = new C25113c("destinationWalkingTime", (byte) 8, 6);

    /* renamed from: h */
    public static final HashMap f29554h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f29555i;
    private byte __isset_bitfield = 0;
    public MVLocationDescriptor destination;
    public int destinationWalkingTime;
    public MVLocationDescriptor dropoff;
    private _Fields[] optionals = {_Fields.PICKUP, _Fields.DROPOFF, _Fields.PICKUP_WALKING_TIME, _Fields.DESTINATION_WALKING_TIME};
    public MVLocationDescriptor origin;
    public MVLocationDescriptor pickup;
    public int pickupWalkingTime;

    public enum _Fields implements C25085c {
        ORIGIN(1, AppMeasurementSdk.ConditionalUserProperty.ORIGIN),
        PICKUP(2, "pickup"),
        DROPOFF(3, "dropoff"),
        DESTINATION(4, "destination"),
        PICKUP_WALKING_TIME(5, "pickupWalkingTime"),
        DESTINATION_WALKING_TIME(6, "destinationWalkingTime");
        
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
                    return ORIGIN;
                case 2:
                    return PICKUP;
                case 3:
                    return DROPOFF;
                case 4:
                    return DESTINATION;
                case 5:
                    return PICKUP_WALKING_TIME;
                case 6:
                    return DESTINATION_WALKING_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideJourneyInfo$a */
    public static class C11307a extends C25239c<MVTodRideJourneyInfo> {
        public C11307a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideJourneyInfo mVTodRideJourneyInfo = (MVTodRideJourneyInfo) tBase;
            mVTodRideJourneyInfo.mo33691o();
            C25113c cVar = MVTodRideJourneyInfo.f29548b;
            gVar.mo61687K();
            if (mVTodRideJourneyInfo.origin != null) {
                gVar.mo61711x(MVTodRideJourneyInfo.f29548b);
                mVTodRideJourneyInfo.origin.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideJourneyInfo.pickup != null && mVTodRideJourneyInfo.mo33687j()) {
                gVar.mo61711x(MVTodRideJourneyInfo.f29549c);
                mVTodRideJourneyInfo.pickup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideJourneyInfo.dropoff != null && mVTodRideJourneyInfo.mo33684h()) {
                gVar.mo61711x(MVTodRideJourneyInfo.f29550d);
                mVTodRideJourneyInfo.dropoff.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideJourneyInfo.destination != null) {
                gVar.mo61711x(MVTodRideJourneyInfo.f29551e);
                mVTodRideJourneyInfo.destination.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideJourneyInfo.mo33688k()) {
                gVar.mo61711x(MVTodRideJourneyInfo.f29552f);
                gVar.mo61678B(mVTodRideJourneyInfo.pickupWalkingTime);
                gVar.mo61712y();
            }
            if (mVTodRideJourneyInfo.mo33683g()) {
                gVar.mo61711x(MVTodRideJourneyInfo.f29553g);
                gVar.mo61678B(mVTodRideJourneyInfo.destinationWalkingTime);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideJourneyInfo mVTodRideJourneyInfo = (MVTodRideJourneyInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodRideJourneyInfo.mo33691o();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVTodRideJourneyInfo.origin = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVTodRideJourneyInfo.pickup = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor3 = new MVLocationDescriptor();
                            mVTodRideJourneyInfo.dropoff = mVLocationDescriptor3;
                            mVLocationDescriptor3.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor4 = new MVLocationDescriptor();
                            mVTodRideJourneyInfo.destination = mVLocationDescriptor4;
                            mVLocationDescriptor4.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideJourneyInfo.pickupWalkingTime = gVar.mo61696i();
                            mVTodRideJourneyInfo.mo33690m();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideJourneyInfo.destinationWalkingTime = gVar.mo61696i();
                            mVTodRideJourneyInfo.mo33689l();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideJourneyInfo$b */
    public static class C11308b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11307a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideJourneyInfo$c */
    public static class C11309c extends C25240d<MVTodRideJourneyInfo> {
        public C11309c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideJourneyInfo mVTodRideJourneyInfo = (MVTodRideJourneyInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodRideJourneyInfo.mo33686i()) {
                bitSet.set(0);
            }
            if (mVTodRideJourneyInfo.mo33687j()) {
                bitSet.set(1);
            }
            if (mVTodRideJourneyInfo.mo33684h()) {
                bitSet.set(2);
            }
            if (mVTodRideJourneyInfo.mo33682f()) {
                bitSet.set(3);
            }
            if (mVTodRideJourneyInfo.mo33688k()) {
                bitSet.set(4);
            }
            if (mVTodRideJourneyInfo.mo33683g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVTodRideJourneyInfo.mo33686i()) {
                mVTodRideJourneyInfo.origin.mo25202X0(jVar);
            }
            if (mVTodRideJourneyInfo.mo33687j()) {
                mVTodRideJourneyInfo.pickup.mo25202X0(jVar);
            }
            if (mVTodRideJourneyInfo.mo33684h()) {
                mVTodRideJourneyInfo.dropoff.mo25202X0(jVar);
            }
            if (mVTodRideJourneyInfo.mo33682f()) {
                mVTodRideJourneyInfo.destination.mo25202X0(jVar);
            }
            if (mVTodRideJourneyInfo.mo33688k()) {
                jVar.mo61678B(mVTodRideJourneyInfo.pickupWalkingTime);
            }
            if (mVTodRideJourneyInfo.mo33683g()) {
                jVar.mo61678B(mVTodRideJourneyInfo.destinationWalkingTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideJourneyInfo mVTodRideJourneyInfo = (MVTodRideJourneyInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVTodRideJourneyInfo.origin = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVTodRideJourneyInfo.pickup = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVLocationDescriptor mVLocationDescriptor3 = new MVLocationDescriptor();
                mVTodRideJourneyInfo.dropoff = mVLocationDescriptor3;
                mVLocationDescriptor3.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVLocationDescriptor mVLocationDescriptor4 = new MVLocationDescriptor();
                mVTodRideJourneyInfo.destination = mVLocationDescriptor4;
                mVLocationDescriptor4.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVTodRideJourneyInfo.pickupWalkingTime = jVar.mo61696i();
                mVTodRideJourneyInfo.mo33690m();
            }
            if (T.get(5)) {
                mVTodRideJourneyInfo.destinationWalkingTime = jVar.mo61696i();
                mVTodRideJourneyInfo.mo33689l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideJourneyInfo$d */
    public static class C11310d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11309c(0);
        }
    }

    static {
        new C17394d0("MVTodRideJourneyInfo");
        HashMap hashMap = new HashMap();
        f29554h = hashMap;
        hashMap.put(C25239c.class, new C11308b());
        hashMap.put(C25240d.class, new C11310d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ORIGIN, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.PICKUP, new FieldMetaData("pickup", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.DROPOFF, new FieldMetaData("dropoff", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.DESTINATION, new FieldMetaData("destination", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.PICKUP_WALKING_TIME, new FieldMetaData("pickupWalkingTime", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DESTINATION_WALKING_TIME, new FieldMetaData("destinationWalkingTime", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29555i = unmodifiableMap;
        FieldMetaData.m61947a(MVTodRideJourneyInfo.class, unmodifiableMap);
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
        ((C25238b) f29554h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29554h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33679a(MVTodRideJourneyInfo mVTodRideJourneyInfo) {
        if (mVTodRideJourneyInfo == null) {
            return false;
        }
        boolean i = mo33686i();
        boolean i2 = mVTodRideJourneyInfo.mo33686i();
        if ((i || i2) && (!i || !i2 || !this.origin.mo26317a(mVTodRideJourneyInfo.origin))) {
            return false;
        }
        boolean j = mo33687j();
        boolean j2 = mVTodRideJourneyInfo.mo33687j();
        if ((j || j2) && (!j || !j2 || !this.pickup.mo26317a(mVTodRideJourneyInfo.pickup))) {
            return false;
        }
        boolean h = mo33684h();
        boolean h2 = mVTodRideJourneyInfo.mo33684h();
        if ((h || h2) && (!h || !h2 || !this.dropoff.mo26317a(mVTodRideJourneyInfo.dropoff))) {
            return false;
        }
        boolean f = mo33682f();
        boolean f2 = mVTodRideJourneyInfo.mo33682f();
        if ((f || f2) && (!f || !f2 || !this.destination.mo26317a(mVTodRideJourneyInfo.destination))) {
            return false;
        }
        boolean k = mo33688k();
        boolean k2 = mVTodRideJourneyInfo.mo33688k();
        if ((k || k2) && (!k || !k2 || this.pickupWalkingTime != mVTodRideJourneyInfo.pickupWalkingTime)) {
            return false;
        }
        boolean g = mo33683g();
        boolean g2 = mVTodRideJourneyInfo.mo33683g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || this.destinationWalkingTime != mVTodRideJourneyInfo.destinationWalkingTime) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVTodRideJourneyInfo mVTodRideJourneyInfo = (MVTodRideJourneyInfo) obj;
        if (!getClass().equals(mVTodRideJourneyInfo.getClass())) {
            return getClass().getName().compareTo(mVTodRideJourneyInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33686i()).compareTo(Boolean.valueOf(mVTodRideJourneyInfo.mo33686i()));
        if (compareTo != 0 || ((mo33686i() && (compareTo = this.origin.compareTo(mVTodRideJourneyInfo.origin)) != 0) || (compareTo = Boolean.valueOf(mo33687j()).compareTo(Boolean.valueOf(mVTodRideJourneyInfo.mo33687j()))) != 0 || ((mo33687j() && (compareTo = this.pickup.compareTo(mVTodRideJourneyInfo.pickup)) != 0) || (compareTo = Boolean.valueOf(mo33684h()).compareTo(Boolean.valueOf(mVTodRideJourneyInfo.mo33684h()))) != 0 || ((mo33684h() && (compareTo = this.dropoff.compareTo(mVTodRideJourneyInfo.dropoff)) != 0) || (compareTo = Boolean.valueOf(mo33682f()).compareTo(Boolean.valueOf(mVTodRideJourneyInfo.mo33682f()))) != 0 || ((mo33682f() && (compareTo = this.destination.compareTo(mVTodRideJourneyInfo.destination)) != 0) || (compareTo = Boolean.valueOf(mo33688k()).compareTo(Boolean.valueOf(mVTodRideJourneyInfo.mo33688k()))) != 0 || ((mo33688k() && (compareTo = C25082a.m62839c(this.pickupWalkingTime, mVTodRideJourneyInfo.pickupWalkingTime)) != 0) || (compareTo = Boolean.valueOf(mo33683g()).compareTo(Boolean.valueOf(mVTodRideJourneyInfo.mo33683g()))) != 0)))))) {
            return compareTo;
        }
        if (!mo33683g() || (c = C25082a.m62839c(this.destinationWalkingTime, mVTodRideJourneyInfo.destinationWalkingTime)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodRideJourneyInfo)) {
            return mo33679a((MVTodRideJourneyInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33682f() {
        return this.destination != null;
    }

    /* renamed from: g */
    public final boolean mo33683g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo33684h() {
        return this.dropoff != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33686i() {
        return this.origin != null;
    }

    /* renamed from: j */
    public final boolean mo33687j() {
        return this.pickup != null;
    }

    /* renamed from: k */
    public final boolean mo33688k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final void mo33689l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo33690m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo33691o() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.origin;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.pickup;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor3 = this.dropoff;
        if (mVLocationDescriptor3 != null) {
            mVLocationDescriptor3.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor4 = this.destination;
        if (mVLocationDescriptor4 != null) {
            mVLocationDescriptor4.mo26333s();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodRideJourneyInfo(", "origin:");
        MVLocationDescriptor mVLocationDescriptor = this.origin;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        if (mo33687j()) {
            n.append(", ");
            n.append("pickup:");
            MVLocationDescriptor mVLocationDescriptor2 = this.pickup;
            if (mVLocationDescriptor2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor2);
            }
        }
        if (mo33684h()) {
            n.append(", ");
            n.append("dropoff:");
            MVLocationDescriptor mVLocationDescriptor3 = this.dropoff;
            if (mVLocationDescriptor3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor3);
            }
        }
        n.append(", ");
        n.append("destination:");
        MVLocationDescriptor mVLocationDescriptor4 = this.destination;
        if (mVLocationDescriptor4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor4);
        }
        if (mo33688k()) {
            n.append(", ");
            n.append("pickupWalkingTime:");
            n.append(this.pickupWalkingTime);
        }
        if (mo33683g()) {
            n.append(", ");
            n.append("destinationWalkingTime:");
            n.append(this.destinationWalkingTime);
        }
        n.append(")");
        return n.toString();
    }
}
