package com.tranzmate.moovit.protocol.carpool;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVPassengerActiveRide implements TBase<MVPassengerActiveRide, _Fields>, Serializable, Cloneable, Comparable<MVPassengerActiveRide> {

    /* renamed from: b */
    public static final C25113c f24755b = new C25113c("ride", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24756c = new C25113c("driverId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24757d = new C25113c("rideStatus", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24758e = new C25113c("canRate", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f24759f = new C25113c("canReportMissing", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f24760g = new C25113c("stops", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f24761h = new C25113c("invitationState", (byte) 8, 7);

    /* renamed from: i */
    public static final HashMap f24762i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f24763j;
    private byte __isset_bitfield = 0;
    public boolean canRate;
    public boolean canReportMissing;
    public String driverId;
    public MVInvitationState invitationState;
    public MVRide ride;
    public MVRideStatus rideStatus;
    public MVPassengerStops stops;

    public enum _Fields implements C25085c {
        RIDE(1, "ride"),
        DRIVER_ID(2, "driverId"),
        RIDE_STATUS(3, "rideStatus"),
        CAN_RATE(4, "canRate"),
        CAN_REPORT_MISSING(5, "canReportMissing"),
        STOPS(6, "stops"),
        INVITATION_STATE(7, "invitationState");
        
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
                    return RIDE;
                case 2:
                    return DRIVER_ID;
                case 3:
                    return RIDE_STATUS;
                case 4:
                    return CAN_RATE;
                case 5:
                    return CAN_REPORT_MISSING;
                case 6:
                    return STOPS;
                case 7:
                    return INVITATION_STATE;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerActiveRide$a */
    public static class C8242a extends C25239c<MVPassengerActiveRide> {
        public C8242a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerActiveRide mVPassengerActiveRide = (MVPassengerActiveRide) tBase;
            MVRide mVRide = mVPassengerActiveRide.ride;
            if (mVRide != null) {
                mVRide.mo25867y();
            }
            MVPassengerStops mVPassengerStops = mVPassengerActiveRide.stops;
            if (mVPassengerStops != null) {
                mVPassengerStops.mo25808j();
            }
            C25113c cVar = MVPassengerActiveRide.f24755b;
            gVar.mo61687K();
            if (mVPassengerActiveRide.ride != null) {
                gVar.mo61711x(MVPassengerActiveRide.f24755b);
                mVPassengerActiveRide.ride.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerActiveRide.driverId != null) {
                gVar.mo61711x(MVPassengerActiveRide.f24756c);
                gVar.mo61686J(mVPassengerActiveRide.driverId);
                gVar.mo61712y();
            }
            if (mVPassengerActiveRide.rideStatus != null) {
                gVar.mo61711x(MVPassengerActiveRide.f24757d);
                gVar.mo61678B(mVPassengerActiveRide.rideStatus.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPassengerActiveRide.f24758e);
            gVar.mo61708u(mVPassengerActiveRide.canRate);
            gVar.mo61712y();
            gVar.mo61711x(MVPassengerActiveRide.f24759f);
            gVar.mo61708u(mVPassengerActiveRide.canReportMissing);
            gVar.mo61712y();
            if (mVPassengerActiveRide.stops != null) {
                gVar.mo61711x(MVPassengerActiveRide.f24760g);
                mVPassengerActiveRide.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerActiveRide.invitationState != null) {
                gVar.mo61711x(MVPassengerActiveRide.f24761h);
                gVar.mo61678B(mVPassengerActiveRide.invitationState.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerActiveRide mVPassengerActiveRide = (MVPassengerActiveRide) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVRide mVRide = mVPassengerActiveRide.ride;
                    if (mVRide != null) {
                        mVRide.mo25867y();
                    }
                    MVPassengerStops mVPassengerStops = mVPassengerActiveRide.stops;
                    if (mVPassengerStops != null) {
                        mVPassengerStops.mo25808j();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVRide mVRide2 = new MVRide();
                            mVPassengerActiveRide.ride = mVRide2;
                            mVRide2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerActiveRide.driverId = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerActiveRide.rideStatus = MVRideStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerActiveRide.canRate = gVar.mo61690c();
                            mVPassengerActiveRide.mo25700m();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerActiveRide.canReportMissing = gVar.mo61690c();
                            mVPassengerActiveRide.mo25701o();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPassengerStops mVPassengerStops2 = new MVPassengerStops();
                            mVPassengerActiveRide.stops = mVPassengerStops2;
                            mVPassengerStops2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerActiveRide.invitationState = MVInvitationState.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerActiveRide$b */
    public static class C8243b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8242a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerActiveRide$c */
    public static class C8244c extends C25240d<MVPassengerActiveRide> {
        public C8244c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerActiveRide mVPassengerActiveRide = (MVPassengerActiveRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerActiveRide.mo25697j()) {
                bitSet.set(0);
            }
            if (mVPassengerActiveRide.mo25694h()) {
                bitSet.set(1);
            }
            if (mVPassengerActiveRide.mo25698k()) {
                bitSet.set(2);
            }
            if (mVPassengerActiveRide.mo25692f()) {
                bitSet.set(3);
            }
            if (mVPassengerActiveRide.mo25693g()) {
                bitSet.set(4);
            }
            if (mVPassengerActiveRide.mo25699l()) {
                bitSet.set(5);
            }
            if (mVPassengerActiveRide.mo25696i()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVPassengerActiveRide.mo25697j()) {
                mVPassengerActiveRide.ride.mo25202X0(jVar);
            }
            if (mVPassengerActiveRide.mo25694h()) {
                jVar.mo61686J(mVPassengerActiveRide.driverId);
            }
            if (mVPassengerActiveRide.mo25698k()) {
                jVar.mo61678B(mVPassengerActiveRide.rideStatus.getValue());
            }
            if (mVPassengerActiveRide.mo25692f()) {
                jVar.mo61708u(mVPassengerActiveRide.canRate);
            }
            if (mVPassengerActiveRide.mo25693g()) {
                jVar.mo61708u(mVPassengerActiveRide.canReportMissing);
            }
            if (mVPassengerActiveRide.mo25699l()) {
                mVPassengerActiveRide.stops.mo25202X0(jVar);
            }
            if (mVPassengerActiveRide.mo25696i()) {
                jVar.mo61678B(mVPassengerActiveRide.invitationState.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerActiveRide mVPassengerActiveRide = (MVPassengerActiveRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                MVRide mVRide = new MVRide();
                mVPassengerActiveRide.ride = mVRide;
                mVRide.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVPassengerActiveRide.driverId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPassengerActiveRide.rideStatus = MVRideStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVPassengerActiveRide.canRate = jVar.mo61690c();
                mVPassengerActiveRide.mo25700m();
            }
            if (T.get(4)) {
                mVPassengerActiveRide.canReportMissing = jVar.mo61690c();
                mVPassengerActiveRide.mo25701o();
            }
            if (T.get(5)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVPassengerActiveRide.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVPassengerActiveRide.invitationState = MVInvitationState.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerActiveRide$d */
    public static class C8245d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8244c(0);
        }
    }

    static {
        new C17394d0("MVPassengerActiveRide");
        HashMap hashMap = new HashMap();
        f24762i = hashMap;
        hashMap.put(C25239c.class, new C8243b());
        hashMap.put(C25240d.class, new C8245d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE, new FieldMetaData("ride", (byte) 3, new StructMetaData(MVRide.class)));
        enumMap.put(_Fields.DRIVER_ID, new FieldMetaData("driverId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RIDE_STATUS, new FieldMetaData("rideStatus", (byte) 3, new EnumMetaData(MVRideStatus.class)));
        enumMap.put(_Fields.CAN_RATE, new FieldMetaData("canRate", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CAN_REPORT_MISSING, new FieldMetaData("canReportMissing", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        enumMap.put(_Fields.INVITATION_STATE, new FieldMetaData("invitationState", (byte) 3, new EnumMetaData(MVInvitationState.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24763j = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerActiveRide.class, unmodifiableMap);
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
        ((C25238b) f24762i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24762i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerActiveRide mVPassengerActiveRide = (MVPassengerActiveRide) obj;
        if (!getClass().equals(mVPassengerActiveRide.getClass())) {
            return getClass().getName().compareTo(mVPassengerActiveRide.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25697j()).compareTo(Boolean.valueOf(mVPassengerActiveRide.mo25697j()));
        if (compareTo2 != 0 || ((mo25697j() && (compareTo2 = this.ride.compareTo(mVPassengerActiveRide.ride)) != 0) || (compareTo2 = Boolean.valueOf(mo25694h()).compareTo(Boolean.valueOf(mVPassengerActiveRide.mo25694h()))) != 0 || ((mo25694h() && (compareTo2 = this.driverId.compareTo(mVPassengerActiveRide.driverId)) != 0) || (compareTo2 = Boolean.valueOf(mo25698k()).compareTo(Boolean.valueOf(mVPassengerActiveRide.mo25698k()))) != 0 || ((mo25698k() && (compareTo2 = this.rideStatus.compareTo(mVPassengerActiveRide.rideStatus)) != 0) || (compareTo2 = Boolean.valueOf(mo25692f()).compareTo(Boolean.valueOf(mVPassengerActiveRide.mo25692f()))) != 0 || ((mo25692f() && (compareTo2 = C25082a.m62848l(this.canRate, mVPassengerActiveRide.canRate)) != 0) || (compareTo2 = Boolean.valueOf(mo25693g()).compareTo(Boolean.valueOf(mVPassengerActiveRide.mo25693g()))) != 0 || ((mo25693g() && (compareTo2 = C25082a.m62848l(this.canReportMissing, mVPassengerActiveRide.canReportMissing)) != 0) || (compareTo2 = Boolean.valueOf(mo25699l()).compareTo(Boolean.valueOf(mVPassengerActiveRide.mo25699l()))) != 0 || ((mo25699l() && (compareTo2 = this.stops.compareTo(mVPassengerActiveRide.stops)) != 0) || (compareTo2 = Boolean.valueOf(mo25696i()).compareTo(Boolean.valueOf(mVPassengerActiveRide.mo25696i()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo25696i() || (compareTo = this.invitationState.compareTo(mVPassengerActiveRide.invitationState)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerActiveRide)) {
            return false;
        }
        MVPassengerActiveRide mVPassengerActiveRide = (MVPassengerActiveRide) obj;
        boolean j = mo25697j();
        boolean j2 = mVPassengerActiveRide.mo25697j();
        if ((j || j2) && (!j || !j2 || !this.ride.mo25845a(mVPassengerActiveRide.ride))) {
            return false;
        }
        boolean h = mo25694h();
        boolean h2 = mVPassengerActiveRide.mo25694h();
        if ((h || h2) && (!h || !h2 || !this.driverId.equals(mVPassengerActiveRide.driverId))) {
            return false;
        }
        boolean k = mo25698k();
        boolean k2 = mVPassengerActiveRide.mo25698k();
        if (((k || k2) && (!k || !k2 || !this.rideStatus.equals(mVPassengerActiveRide.rideStatus))) || this.canRate != mVPassengerActiveRide.canRate || this.canReportMissing != mVPassengerActiveRide.canReportMissing) {
            return false;
        }
        boolean l = mo25699l();
        boolean l2 = mVPassengerActiveRide.mo25699l();
        if ((l || l2) && (!l || !l2 || !this.stops.mo25800a(mVPassengerActiveRide.stops))) {
            return false;
        }
        boolean i = mo25696i();
        boolean i2 = mVPassengerActiveRide.mo25696i();
        if ((i || i2) && (!i || !i2 || !this.invitationState.equals(mVPassengerActiveRide.invitationState))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25692f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25693g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo25694h() {
        return this.driverId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25696i() {
        return this.invitationState != null;
    }

    /* renamed from: j */
    public final boolean mo25697j() {
        return this.ride != null;
    }

    /* renamed from: k */
    public final boolean mo25698k() {
        return this.rideStatus != null;
    }

    /* renamed from: l */
    public final boolean mo25699l() {
        return this.stops != null;
    }

    /* renamed from: m */
    public final void mo25700m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo25701o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerActiveRide(", "ride:");
        MVRide mVRide = this.ride;
        if (mVRide == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRide);
        }
        n.append(", ");
        n.append("driverId:");
        String str = this.driverId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("rideStatus:");
        MVRideStatus mVRideStatus = this.rideStatus;
        if (mVRideStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideStatus);
        }
        n.append(", ");
        n.append("canRate:");
        C13555b.m33977q(n, this.canRate, ", ", "canReportMissing:");
        C13555b.m33977q(n, this.canReportMissing, ", ", "stops:");
        MVPassengerStops mVPassengerStops = this.stops;
        if (mVPassengerStops == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStops);
        }
        n.append(", ");
        n.append("invitationState:");
        MVInvitationState mVInvitationState = this.invitationState;
        if (mVInvitationState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVInvitationState);
        }
        n.append(")");
        return n.toString();
    }
}
