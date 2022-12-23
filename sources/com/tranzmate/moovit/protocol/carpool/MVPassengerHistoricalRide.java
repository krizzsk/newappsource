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
import p001a0.C0017h;
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

public class MVPassengerHistoricalRide implements TBase<MVPassengerHistoricalRide, _Fields>, Serializable, Cloneable, Comparable<MVPassengerHistoricalRide> {

    /* renamed from: b */
    public static final C25113c f24784b = new C25113c("ride", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24785c = new C25113c("driverId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24786d = new C25113c("canRate", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f24787e = new C25113c("canReportMissing", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f24788f = new C25113c("isCanceled", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f24789g = new C25113c("stops", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f24790h = new C25113c("invitationState", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f24791i = new C25113c("inDispute", (byte) 2, 8);

    /* renamed from: j */
    public static final HashMap f24792j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f24793k;
    private byte __isset_bitfield = 0;
    public boolean canRate;
    public boolean canReportMissing;
    public String driverId;
    public boolean inDispute;
    public MVInvitationState invitationState;
    public boolean isCanceled;
    public MVRide ride;
    public MVPassengerStops stops;

    public enum _Fields implements C25085c {
        RIDE(1, "ride"),
        DRIVER_ID(2, "driverId"),
        CAN_RATE(3, "canRate"),
        CAN_REPORT_MISSING(4, "canReportMissing"),
        IS_CANCELED(5, "isCanceled"),
        STOPS(6, "stops"),
        INVITATION_STATE(7, "invitationState"),
        IN_DISPUTE(8, "inDispute");
        
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
                    return CAN_RATE;
                case 4:
                    return CAN_REPORT_MISSING;
                case 5:
                    return IS_CANCELED;
                case 6:
                    return STOPS;
                case 7:
                    return INVITATION_STATE;
                case 8:
                    return IN_DISPUTE;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerHistoricalRide$a */
    public static class C8262a extends C25239c<MVPassengerHistoricalRide> {
        public C8262a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerHistoricalRide mVPassengerHistoricalRide = (MVPassengerHistoricalRide) tBase;
            MVRide mVRide = mVPassengerHistoricalRide.ride;
            if (mVRide != null) {
                mVRide.mo25867y();
            }
            MVPassengerStops mVPassengerStops = mVPassengerHistoricalRide.stops;
            if (mVPassengerStops != null) {
                mVPassengerStops.mo25808j();
            }
            C25113c cVar = MVPassengerHistoricalRide.f24784b;
            gVar.mo61687K();
            if (mVPassengerHistoricalRide.ride != null) {
                gVar.mo61711x(MVPassengerHistoricalRide.f24784b);
                mVPassengerHistoricalRide.ride.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerHistoricalRide.driverId != null) {
                gVar.mo61711x(MVPassengerHistoricalRide.f24785c);
                gVar.mo61686J(mVPassengerHistoricalRide.driverId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPassengerHistoricalRide.f24786d);
            gVar.mo61708u(mVPassengerHistoricalRide.canRate);
            gVar.mo61712y();
            gVar.mo61711x(MVPassengerHistoricalRide.f24787e);
            gVar.mo61708u(mVPassengerHistoricalRide.canReportMissing);
            gVar.mo61712y();
            gVar.mo61711x(MVPassengerHistoricalRide.f24788f);
            gVar.mo61708u(mVPassengerHistoricalRide.isCanceled);
            gVar.mo61712y();
            if (mVPassengerHistoricalRide.stops != null) {
                gVar.mo61711x(MVPassengerHistoricalRide.f24789g);
                mVPassengerHistoricalRide.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerHistoricalRide.invitationState != null) {
                gVar.mo61711x(MVPassengerHistoricalRide.f24790h);
                gVar.mo61678B(mVPassengerHistoricalRide.invitationState.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPassengerHistoricalRide.f24791i);
            C0017h.m62S(gVar, mVPassengerHistoricalRide.inDispute);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerHistoricalRide mVPassengerHistoricalRide = (MVPassengerHistoricalRide) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVRide mVRide = mVPassengerHistoricalRide.ride;
                    if (mVRide != null) {
                        mVRide.mo25867y();
                    }
                    MVPassengerStops mVPassengerStops = mVPassengerHistoricalRide.stops;
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
                            mVPassengerHistoricalRide.ride = mVRide2;
                            mVRide2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerHistoricalRide.driverId = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerHistoricalRide.canRate = gVar.mo61690c();
                            mVPassengerHistoricalRide.mo25750o();
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerHistoricalRide.canReportMissing = gVar.mo61690c();
                            mVPassengerHistoricalRide.mo25751p();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerHistoricalRide.isCanceled = gVar.mo61690c();
                            mVPassengerHistoricalRide.mo25753r();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPassengerStops mVPassengerStops2 = new MVPassengerStops();
                            mVPassengerHistoricalRide.stops = mVPassengerStops2;
                            mVPassengerStops2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerHistoricalRide.invitationState = MVInvitationState.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerHistoricalRide.inDispute = gVar.mo61690c();
                            mVPassengerHistoricalRide.mo25752q();
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerHistoricalRide$b */
    public static class C8263b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8262a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerHistoricalRide$c */
    public static class C8264c extends C25240d<MVPassengerHistoricalRide> {
        public C8264c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerHistoricalRide mVPassengerHistoricalRide = (MVPassengerHistoricalRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerHistoricalRide.mo25748l()) {
                bitSet.set(0);
            }
            if (mVPassengerHistoricalRide.mo25743h()) {
                bitSet.set(1);
            }
            if (mVPassengerHistoricalRide.mo25741f()) {
                bitSet.set(2);
            }
            if (mVPassengerHistoricalRide.mo25742g()) {
                bitSet.set(3);
            }
            if (mVPassengerHistoricalRide.mo25747k()) {
                bitSet.set(4);
            }
            if (mVPassengerHistoricalRide.mo25749m()) {
                bitSet.set(5);
            }
            if (mVPassengerHistoricalRide.mo25746j()) {
                bitSet.set(6);
            }
            if (mVPassengerHistoricalRide.mo25745i()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPassengerHistoricalRide.mo25748l()) {
                mVPassengerHistoricalRide.ride.mo25202X0(jVar);
            }
            if (mVPassengerHistoricalRide.mo25743h()) {
                jVar.mo61686J(mVPassengerHistoricalRide.driverId);
            }
            if (mVPassengerHistoricalRide.mo25741f()) {
                jVar.mo61708u(mVPassengerHistoricalRide.canRate);
            }
            if (mVPassengerHistoricalRide.mo25742g()) {
                jVar.mo61708u(mVPassengerHistoricalRide.canReportMissing);
            }
            if (mVPassengerHistoricalRide.mo25747k()) {
                jVar.mo61708u(mVPassengerHistoricalRide.isCanceled);
            }
            if (mVPassengerHistoricalRide.mo25749m()) {
                mVPassengerHistoricalRide.stops.mo25202X0(jVar);
            }
            if (mVPassengerHistoricalRide.mo25746j()) {
                jVar.mo61678B(mVPassengerHistoricalRide.invitationState.getValue());
            }
            if (mVPassengerHistoricalRide.mo25745i()) {
                jVar.mo61708u(mVPassengerHistoricalRide.inDispute);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerHistoricalRide mVPassengerHistoricalRide = (MVPassengerHistoricalRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                MVRide mVRide = new MVRide();
                mVPassengerHistoricalRide.ride = mVRide;
                mVRide.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVPassengerHistoricalRide.driverId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPassengerHistoricalRide.canRate = jVar.mo61690c();
                mVPassengerHistoricalRide.mo25750o();
            }
            if (T.get(3)) {
                mVPassengerHistoricalRide.canReportMissing = jVar.mo61690c();
                mVPassengerHistoricalRide.mo25751p();
            }
            if (T.get(4)) {
                mVPassengerHistoricalRide.isCanceled = jVar.mo61690c();
                mVPassengerHistoricalRide.mo25753r();
            }
            if (T.get(5)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVPassengerHistoricalRide.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVPassengerHistoricalRide.invitationState = MVInvitationState.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                mVPassengerHistoricalRide.inDispute = jVar.mo61690c();
                mVPassengerHistoricalRide.mo25752q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerHistoricalRide$d */
    public static class C8265d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8264c(0);
        }
    }

    static {
        new C17394d0("MVPassengerHistoricalRide");
        HashMap hashMap = new HashMap();
        f24792j = hashMap;
        hashMap.put(C25239c.class, new C8263b());
        hashMap.put(C25240d.class, new C8265d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE, new FieldMetaData("ride", (byte) 3, new StructMetaData(MVRide.class)));
        enumMap.put(_Fields.DRIVER_ID, new FieldMetaData("driverId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAN_RATE, new FieldMetaData("canRate", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CAN_REPORT_MISSING, new FieldMetaData("canReportMissing", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_CANCELED, new FieldMetaData("isCanceled", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        enumMap.put(_Fields.INVITATION_STATE, new FieldMetaData("invitationState", (byte) 3, new EnumMetaData(MVInvitationState.class)));
        enumMap.put(_Fields.IN_DISPUTE, new FieldMetaData("inDispute", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24793k = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerHistoricalRide.class, unmodifiableMap);
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
        ((C25238b) f24792j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24792j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVPassengerHistoricalRide mVPassengerHistoricalRide = (MVPassengerHistoricalRide) obj;
        if (!getClass().equals(mVPassengerHistoricalRide.getClass())) {
            return getClass().getName().compareTo(mVPassengerHistoricalRide.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25748l()).compareTo(Boolean.valueOf(mVPassengerHistoricalRide.mo25748l()));
        if (compareTo != 0 || ((mo25748l() && (compareTo = this.ride.compareTo(mVPassengerHistoricalRide.ride)) != 0) || (compareTo = Boolean.valueOf(mo25743h()).compareTo(Boolean.valueOf(mVPassengerHistoricalRide.mo25743h()))) != 0 || ((mo25743h() && (compareTo = this.driverId.compareTo(mVPassengerHistoricalRide.driverId)) != 0) || (compareTo = Boolean.valueOf(mo25741f()).compareTo(Boolean.valueOf(mVPassengerHistoricalRide.mo25741f()))) != 0 || ((mo25741f() && (compareTo = C25082a.m62848l(this.canRate, mVPassengerHistoricalRide.canRate)) != 0) || (compareTo = Boolean.valueOf(mo25742g()).compareTo(Boolean.valueOf(mVPassengerHistoricalRide.mo25742g()))) != 0 || ((mo25742g() && (compareTo = C25082a.m62848l(this.canReportMissing, mVPassengerHistoricalRide.canReportMissing)) != 0) || (compareTo = Boolean.valueOf(mo25747k()).compareTo(Boolean.valueOf(mVPassengerHistoricalRide.mo25747k()))) != 0 || ((mo25747k() && (compareTo = C25082a.m62848l(this.isCanceled, mVPassengerHistoricalRide.isCanceled)) != 0) || (compareTo = Boolean.valueOf(mo25749m()).compareTo(Boolean.valueOf(mVPassengerHistoricalRide.mo25749m()))) != 0 || ((mo25749m() && (compareTo = this.stops.compareTo(mVPassengerHistoricalRide.stops)) != 0) || (compareTo = Boolean.valueOf(mo25746j()).compareTo(Boolean.valueOf(mVPassengerHistoricalRide.mo25746j()))) != 0 || ((mo25746j() && (compareTo = this.invitationState.compareTo(mVPassengerHistoricalRide.invitationState)) != 0) || (compareTo = Boolean.valueOf(mo25745i()).compareTo(Boolean.valueOf(mVPassengerHistoricalRide.mo25745i()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo25745i() || (l = C25082a.m62848l(this.inDispute, mVPassengerHistoricalRide.inDispute)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerHistoricalRide)) {
            return false;
        }
        MVPassengerHistoricalRide mVPassengerHistoricalRide = (MVPassengerHistoricalRide) obj;
        boolean l = mo25748l();
        boolean l2 = mVPassengerHistoricalRide.mo25748l();
        if ((l || l2) && (!l || !l2 || !this.ride.mo25845a(mVPassengerHistoricalRide.ride))) {
            return false;
        }
        boolean h = mo25743h();
        boolean h2 = mVPassengerHistoricalRide.mo25743h();
        if (((h || h2) && (!h || !h2 || !this.driverId.equals(mVPassengerHistoricalRide.driverId))) || this.canRate != mVPassengerHistoricalRide.canRate || this.canReportMissing != mVPassengerHistoricalRide.canReportMissing || this.isCanceled != mVPassengerHistoricalRide.isCanceled) {
            return false;
        }
        boolean m = mo25749m();
        boolean m2 = mVPassengerHistoricalRide.mo25749m();
        if ((m || m2) && (!m || !m2 || !this.stops.mo25800a(mVPassengerHistoricalRide.stops))) {
            return false;
        }
        boolean j = mo25746j();
        boolean j2 = mVPassengerHistoricalRide.mo25746j();
        if (((j || j2) && (!j || !j2 || !this.invitationState.equals(mVPassengerHistoricalRide.invitationState))) || this.inDispute != mVPassengerHistoricalRide.inDispute) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25741f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25742g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo25743h() {
        return this.driverId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25745i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo25746j() {
        return this.invitationState != null;
    }

    /* renamed from: k */
    public final boolean mo25747k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final boolean mo25748l() {
        return this.ride != null;
    }

    /* renamed from: m */
    public final boolean mo25749m() {
        return this.stops != null;
    }

    /* renamed from: o */
    public final void mo25750o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo25751p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: q */
    public final void mo25752q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: r */
    public final void mo25753r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerHistoricalRide(", "ride:");
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
        n.append("canRate:");
        C13555b.m33977q(n, this.canRate, ", ", "canReportMissing:");
        C13555b.m33977q(n, this.canReportMissing, ", ", "isCanceled:");
        C13555b.m33977q(n, this.isCanceled, ", ", "stops:");
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
        n.append(", ");
        n.append("inDispute:");
        return C25541a.m63885p(n, this.inDispute, ")");
    }
}
