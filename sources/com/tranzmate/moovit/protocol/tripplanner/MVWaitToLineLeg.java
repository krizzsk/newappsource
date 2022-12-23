package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertDigest;
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

public class MVWaitToLineLeg implements TBase<MVWaitToLineLeg, _Fields>, Serializable, Cloneable, Comparable<MVWaitToLineLeg> {

    /* renamed from: b */
    public static final C25113c f30233b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30234c = new C25113c("waitToLineId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30235d = new C25113c("waitAtStopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30236e = new C25113c("departOnStopId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30237f = new C25113c("futureDepartureTimes", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f30238g = new C25113c("serviceAlert", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f30239h = new C25113c("waitOnVehicle", (byte) 2, 7);

    /* renamed from: i */
    public static final C25113c f30240i = new C25113c("metroId", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f30241j = new C25113c("waitAtChildStopId", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f30242k = new C25113c("departOnChildStopId", (byte) 8, 10);

    /* renamed from: l */
    public static final HashMap f30243l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f30244m;
    private byte __isset_bitfield;
    public int departOnChildStopId;
    public int departOnStopId;
    public MVWaitToLineLegDepartureTimes futureDepartureTimes;
    public int metroId;
    private _Fields[] optionals;
    public MVLineAlertDigest serviceAlert;
    public MVTime time;
    public int waitAtChildStopId;
    public int waitAtStopId;
    public boolean waitOnVehicle;
    public int waitToLineId;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        WAIT_TO_LINE_ID(2, "waitToLineId"),
        WAIT_AT_STOP_ID(3, "waitAtStopId"),
        DEPART_ON_STOP_ID(4, "departOnStopId"),
        FUTURE_DEPARTURE_TIMES(5, "futureDepartureTimes"),
        SERVICE_ALERT(6, "serviceAlert"),
        WAIT_ON_VEHICLE(7, "waitOnVehicle"),
        METRO_ID(8, "metroId"),
        WAIT_AT_CHILD_STOP_ID(9, "waitAtChildStopId"),
        DEPART_ON_CHILD_STOP_ID(10, "departOnChildStopId");
        
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
                    return TIME;
                case 2:
                    return WAIT_TO_LINE_ID;
                case 3:
                    return WAIT_AT_STOP_ID;
                case 4:
                    return DEPART_ON_STOP_ID;
                case 5:
                    return FUTURE_DEPARTURE_TIMES;
                case 6:
                    return SERVICE_ALERT;
                case 7:
                    return WAIT_ON_VEHICLE;
                case 8:
                    return METRO_ID;
                case 9:
                    return WAIT_AT_CHILD_STOP_ID;
                case 10:
                    return DEPART_ON_CHILD_STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLeg$a */
    public static class C11706a extends C25239c<MVWaitToLineLeg> {
        public C11706a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineLeg mVWaitToLineLeg = (MVWaitToLineLeg) tBase;
            mVWaitToLineLeg.getClass();
            C25113c cVar = MVWaitToLineLeg.f30233b;
            gVar.mo61687K();
            if (mVWaitToLineLeg.time != null) {
                gVar.mo61711x(MVWaitToLineLeg.f30233b);
                mVWaitToLineLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWaitToLineLeg.f30234c);
            gVar.mo61678B(mVWaitToLineLeg.waitToLineId);
            gVar.mo61712y();
            gVar.mo61711x(MVWaitToLineLeg.f30235d);
            gVar.mo61678B(mVWaitToLineLeg.waitAtStopId);
            gVar.mo61712y();
            gVar.mo61711x(MVWaitToLineLeg.f30236e);
            gVar.mo61678B(mVWaitToLineLeg.departOnStopId);
            gVar.mo61712y();
            if (mVWaitToLineLeg.futureDepartureTimes != null) {
                gVar.mo61711x(MVWaitToLineLeg.f30237f);
                mVWaitToLineLeg.futureDepartureTimes.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWaitToLineLeg.serviceAlert != null && mVWaitToLineLeg.mo34839j()) {
                gVar.mo61711x(MVWaitToLineLeg.f30238g);
                mVWaitToLineLeg.serviceAlert.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWaitToLineLeg.f30239h);
            gVar.mo61708u(mVWaitToLineLeg.waitOnVehicle);
            gVar.mo61712y();
            gVar.mo61711x(MVWaitToLineLeg.f30240i);
            gVar.mo61678B(mVWaitToLineLeg.metroId);
            gVar.mo61712y();
            if (mVWaitToLineLeg.mo34841l()) {
                gVar.mo61711x(MVWaitToLineLeg.f30241j);
                gVar.mo61678B(mVWaitToLineLeg.waitAtChildStopId);
                gVar.mo61712y();
            }
            if (mVWaitToLineLeg.mo34834f()) {
                gVar.mo61711x(MVWaitToLineLeg.f30242k);
                gVar.mo61678B(mVWaitToLineLeg.departOnChildStopId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineLeg mVWaitToLineLeg = (MVWaitToLineLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWaitToLineLeg.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTime mVTime = new MVTime();
                            mVWaitToLineLeg.time = mVTime;
                            mVTime.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToLineLeg.waitToLineId = gVar.mo61696i();
                            mVWaitToLineLeg.mo34852w();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToLineLeg.waitAtStopId = gVar.mo61696i();
                            mVWaitToLineLeg.mo34850u();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToLineLeg.departOnStopId = gVar.mo61696i();
                            mVWaitToLineLeg.mo34846r();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = new MVWaitToLineLegDepartureTimes();
                            mVWaitToLineLeg.futureDepartureTimes = mVWaitToLineLegDepartureTimes;
                            mVWaitToLineLegDepartureTimes.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLineAlertDigest mVLineAlertDigest = new MVLineAlertDigest();
                            mVWaitToLineLeg.serviceAlert = mVLineAlertDigest;
                            mVLineAlertDigest.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToLineLeg.waitOnVehicle = gVar.mo61690c();
                            mVWaitToLineLeg.mo34851v();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToLineLeg.metroId = gVar.mo61696i();
                            mVWaitToLineLeg.mo34847s();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToLineLeg.waitAtChildStopId = gVar.mo61696i();
                            mVWaitToLineLeg.mo34848t();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToLineLeg.departOnChildStopId = gVar.mo61696i();
                            mVWaitToLineLeg.mo34845q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLeg$b */
    public static class C11707b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11706a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLeg$c */
    public static class C11708c extends C25240d<MVWaitToLineLeg> {
        public C11708c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineLeg mVWaitToLineLeg = (MVWaitToLineLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWaitToLineLeg.mo34840k()) {
                bitSet.set(0);
            }
            if (mVWaitToLineLeg.mo34844p()) {
                bitSet.set(1);
            }
            if (mVWaitToLineLeg.mo34842m()) {
                bitSet.set(2);
            }
            if (mVWaitToLineLeg.mo34835g()) {
                bitSet.set(3);
            }
            if (mVWaitToLineLeg.mo34836h()) {
                bitSet.set(4);
            }
            if (mVWaitToLineLeg.mo34839j()) {
                bitSet.set(5);
            }
            if (mVWaitToLineLeg.mo34843o()) {
                bitSet.set(6);
            }
            if (mVWaitToLineLeg.mo34838i()) {
                bitSet.set(7);
            }
            if (mVWaitToLineLeg.mo34841l()) {
                bitSet.set(8);
            }
            if (mVWaitToLineLeg.mo34834f()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVWaitToLineLeg.mo34840k()) {
                mVWaitToLineLeg.time.mo25202X0(jVar);
            }
            if (mVWaitToLineLeg.mo34844p()) {
                jVar.mo61678B(mVWaitToLineLeg.waitToLineId);
            }
            if (mVWaitToLineLeg.mo34842m()) {
                jVar.mo61678B(mVWaitToLineLeg.waitAtStopId);
            }
            if (mVWaitToLineLeg.mo34835g()) {
                jVar.mo61678B(mVWaitToLineLeg.departOnStopId);
            }
            if (mVWaitToLineLeg.mo34836h()) {
                mVWaitToLineLeg.futureDepartureTimes.mo25202X0(jVar);
            }
            if (mVWaitToLineLeg.mo34839j()) {
                mVWaitToLineLeg.serviceAlert.mo25202X0(jVar);
            }
            if (mVWaitToLineLeg.mo34843o()) {
                jVar.mo61708u(mVWaitToLineLeg.waitOnVehicle);
            }
            if (mVWaitToLineLeg.mo34838i()) {
                jVar.mo61678B(mVWaitToLineLeg.metroId);
            }
            if (mVWaitToLineLeg.mo34841l()) {
                jVar.mo61678B(mVWaitToLineLeg.waitAtChildStopId);
            }
            if (mVWaitToLineLeg.mo34834f()) {
                jVar.mo61678B(mVWaitToLineLeg.departOnChildStopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineLeg mVWaitToLineLeg = (MVWaitToLineLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVWaitToLineLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVWaitToLineLeg.waitToLineId = jVar.mo61696i();
                mVWaitToLineLeg.mo34852w();
            }
            if (T.get(2)) {
                mVWaitToLineLeg.waitAtStopId = jVar.mo61696i();
                mVWaitToLineLeg.mo34850u();
            }
            if (T.get(3)) {
                mVWaitToLineLeg.departOnStopId = jVar.mo61696i();
                mVWaitToLineLeg.mo34846r();
            }
            if (T.get(4)) {
                MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = new MVWaitToLineLegDepartureTimes();
                mVWaitToLineLeg.futureDepartureTimes = mVWaitToLineLegDepartureTimes;
                mVWaitToLineLegDepartureTimes.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVLineAlertDigest mVLineAlertDigest = new MVLineAlertDigest();
                mVWaitToLineLeg.serviceAlert = mVLineAlertDigest;
                mVLineAlertDigest.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVWaitToLineLeg.waitOnVehicle = jVar.mo61690c();
                mVWaitToLineLeg.mo34851v();
            }
            if (T.get(7)) {
                mVWaitToLineLeg.metroId = jVar.mo61696i();
                mVWaitToLineLeg.mo34847s();
            }
            if (T.get(8)) {
                mVWaitToLineLeg.waitAtChildStopId = jVar.mo61696i();
                mVWaitToLineLeg.mo34848t();
            }
            if (T.get(9)) {
                mVWaitToLineLeg.departOnChildStopId = jVar.mo61696i();
                mVWaitToLineLeg.mo34845q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineLeg$d */
    public static class C11709d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11708c(0);
        }
    }

    static {
        new C17394d0("MVWaitToLineLeg");
        HashMap hashMap = new HashMap();
        f30243l = hashMap;
        hashMap.put(C25239c.class, new C11707b());
        hashMap.put(C25240d.class, new C11709d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.WAIT_TO_LINE_ID, new FieldMetaData("waitToLineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WAIT_AT_STOP_ID, new FieldMetaData("waitAtStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEPART_ON_STOP_ID, new FieldMetaData("departOnStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FUTURE_DEPARTURE_TIMES, new FieldMetaData("futureDepartureTimes", (byte) 3, new StructMetaData(MVWaitToLineLegDepartureTimes.class)));
        enumMap.put(_Fields.SERVICE_ALERT, new FieldMetaData("serviceAlert", (byte) 2, new StructMetaData(MVLineAlertDigest.class)));
        enumMap.put(_Fields.WAIT_ON_VEHICLE, new FieldMetaData("waitOnVehicle", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WAIT_AT_CHILD_STOP_ID, new FieldMetaData("waitAtChildStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEPART_ON_CHILD_STOP_ID, new FieldMetaData("departOnChildStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30244m = unmodifiableMap;
        FieldMetaData.m61947a(MVWaitToLineLeg.class, unmodifiableMap);
    }

    public MVWaitToLineLeg() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.SERVICE_ALERT, _Fields.WAIT_AT_CHILD_STOP_ID, _Fields.DEPART_ON_CHILD_STOP_ID};
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
        ((C25238b) f30243l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30243l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVWaitToLineLeg mVWaitToLineLeg = (MVWaitToLineLeg) obj;
        if (!getClass().equals(mVWaitToLineLeg.getClass())) {
            return getClass().getName().compareTo(mVWaitToLineLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34840k()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34840k()));
        if (compareTo != 0 || ((mo34840k() && (compareTo = this.time.compareTo(mVWaitToLineLeg.time)) != 0) || (compareTo = Boolean.valueOf(mo34844p()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34844p()))) != 0 || ((mo34844p() && (compareTo = C25082a.m62839c(this.waitToLineId, mVWaitToLineLeg.waitToLineId)) != 0) || (compareTo = Boolean.valueOf(mo34842m()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34842m()))) != 0 || ((mo34842m() && (compareTo = C25082a.m62839c(this.waitAtStopId, mVWaitToLineLeg.waitAtStopId)) != 0) || (compareTo = Boolean.valueOf(mo34835g()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34835g()))) != 0 || ((mo34835g() && (compareTo = C25082a.m62839c(this.departOnStopId, mVWaitToLineLeg.departOnStopId)) != 0) || (compareTo = Boolean.valueOf(mo34836h()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34836h()))) != 0 || ((mo34836h() && (compareTo = this.futureDepartureTimes.compareTo(mVWaitToLineLeg.futureDepartureTimes)) != 0) || (compareTo = Boolean.valueOf(mo34839j()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34839j()))) != 0 || ((mo34839j() && (compareTo = this.serviceAlert.compareTo(mVWaitToLineLeg.serviceAlert)) != 0) || (compareTo = Boolean.valueOf(mo34843o()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34843o()))) != 0 || ((mo34843o() && (compareTo = C25082a.m62848l(this.waitOnVehicle, mVWaitToLineLeg.waitOnVehicle)) != 0) || (compareTo = Boolean.valueOf(mo34838i()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34838i()))) != 0 || ((mo34838i() && (compareTo = C25082a.m62839c(this.metroId, mVWaitToLineLeg.metroId)) != 0) || (compareTo = Boolean.valueOf(mo34841l()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34841l()))) != 0 || ((mo34841l() && (compareTo = C25082a.m62839c(this.waitAtChildStopId, mVWaitToLineLeg.waitAtChildStopId)) != 0) || (compareTo = Boolean.valueOf(mo34834f()).compareTo(Boolean.valueOf(mVWaitToLineLeg.mo34834f()))) != 0)))))))))) {
            return compareTo;
        }
        if (!mo34834f() || (c = C25082a.m62839c(this.departOnChildStopId, mVWaitToLineLeg.departOnChildStopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWaitToLineLeg)) {
            return false;
        }
        MVWaitToLineLeg mVWaitToLineLeg = (MVWaitToLineLeg) obj;
        boolean k = mo34840k();
        boolean k2 = mVWaitToLineLeg.mo34840k();
        if (((k || k2) && (!k || !k2 || !this.time.mo34573a(mVWaitToLineLeg.time))) || this.waitToLineId != mVWaitToLineLeg.waitToLineId || this.waitAtStopId != mVWaitToLineLeg.waitAtStopId || this.departOnStopId != mVWaitToLineLeg.departOnStopId) {
            return false;
        }
        boolean h = mo34836h();
        boolean h2 = mVWaitToLineLeg.mo34836h();
        if ((h || h2) && (!h || !h2 || !this.futureDepartureTimes.mo34854a(mVWaitToLineLeg.futureDepartureTimes))) {
            return false;
        }
        boolean j = mo34839j();
        boolean j2 = mVWaitToLineLeg.mo34839j();
        if (((j || j2) && (!j || !j2 || !this.serviceAlert.mo31607a(mVWaitToLineLeg.serviceAlert))) || this.waitOnVehicle != mVWaitToLineLeg.waitOnVehicle || this.metroId != mVWaitToLineLeg.metroId) {
            return false;
        }
        boolean l = mo34841l();
        boolean l2 = mVWaitToLineLeg.mo34841l();
        if ((l || l2) && (!l || !l2 || this.waitAtChildStopId != mVWaitToLineLeg.waitAtChildStopId)) {
            return false;
        }
        boolean f = mo34834f();
        boolean f2 = mVWaitToLineLeg.mo34834f();
        if ((f || f2) && (!f || !f2 || this.departOnChildStopId != mVWaitToLineLeg.departOnChildStopId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34834f() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: g */
    public final boolean mo34835g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo34836h() {
        return this.futureDepartureTimes != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34838i() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: j */
    public final boolean mo34839j() {
        return this.serviceAlert != null;
    }

    /* renamed from: k */
    public final boolean mo34840k() {
        return this.time != null;
    }

    /* renamed from: l */
    public final boolean mo34841l() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: m */
    public final boolean mo34842m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo34843o() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: p */
    public final boolean mo34844p() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: q */
    public final void mo34845q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: r */
    public final void mo34846r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: s */
    public final void mo34847s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: t */
    public final void mo34848t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWaitToLineLeg(", "time:");
        MVTime mVTime = this.time;
        if (mVTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTime);
        }
        n.append(", ");
        n.append("waitToLineId:");
        C0016g.m42z(n, this.waitToLineId, ", ", "waitAtStopId:");
        C0016g.m42z(n, this.waitAtStopId, ", ", "departOnStopId:");
        C0016g.m42z(n, this.departOnStopId, ", ", "futureDepartureTimes:");
        MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = this.futureDepartureTimes;
        if (mVWaitToLineLegDepartureTimes == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWaitToLineLegDepartureTimes);
        }
        if (mo34839j()) {
            n.append(", ");
            n.append("serviceAlert:");
            MVLineAlertDigest mVLineAlertDigest = this.serviceAlert;
            if (mVLineAlertDigest == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLineAlertDigest);
            }
        }
        n.append(", ");
        n.append("waitOnVehicle:");
        C13555b.m33977q(n, this.waitOnVehicle, ", ", "metroId:");
        n.append(this.metroId);
        if (mo34841l()) {
            n.append(", ");
            n.append("waitAtChildStopId:");
            n.append(this.waitAtChildStopId);
        }
        if (mo34834f()) {
            n.append(", ");
            n.append("departOnChildStopId:");
            n.append(this.departOnChildStopId);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo34850u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: v */
    public final void mo34851v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: w */
    public final void mo34852w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public MVWaitToLineLeg(MVTime mVTime, int i, int i2, int i3, MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes, boolean z, int i4) {
        this();
        this.time = mVTime;
        this.waitToLineId = i;
        mo34852w();
        this.waitAtStopId = i2;
        mo34850u();
        this.departOnStopId = i3;
        mo34846r();
        this.futureDepartureTimes = mVWaitToLineLegDepartureTimes;
        this.waitOnVehicle = z;
        mo34851v();
        this.metroId = i4;
        mo34847s();
    }
}
