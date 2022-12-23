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

public class MVWaitToLineAlternative implements TBase<MVWaitToLineAlternative, _Fields>, Serializable, Cloneable, Comparable<MVWaitToLineAlternative> {

    /* renamed from: b */
    public static final C25113c f30226b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30227c = new C25113c("waitToLineId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30228d = new C25113c("futureDepartureTimes", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30229e = new C25113c("serviceAlert", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f30230f = new C25113c("waitOnVehicle", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f30231g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30232h;
    private byte __isset_bitfield = 0;
    public MVWaitToLineLegDepartureTimes futureDepartureTimes;
    private _Fields[] optionals = {_Fields.SERVICE_ALERT};
    public MVLineAlertDigest serviceAlert;
    public MVTime time;
    public boolean waitOnVehicle;
    public int waitToLineId;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        WAIT_TO_LINE_ID(2, "waitToLineId"),
        FUTURE_DEPARTURE_TIMES(3, "futureDepartureTimes"),
        SERVICE_ALERT(4, "serviceAlert"),
        WAIT_ON_VEHICLE(5, "waitOnVehicle");
        
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
                return TIME;
            }
            if (i == 2) {
                return WAIT_TO_LINE_ID;
            }
            if (i == 3) {
                return FUTURE_DEPARTURE_TIMES;
            }
            if (i == 4) {
                return SERVICE_ALERT;
            }
            if (i != 5) {
                return null;
            }
            return WAIT_ON_VEHICLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineAlternative$a */
    public static class C11702a extends C25239c<MVWaitToLineAlternative> {
        public C11702a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineAlternative mVWaitToLineAlternative = (MVWaitToLineAlternative) tBase;
            mVWaitToLineAlternative.getClass();
            C25113c cVar = MVWaitToLineAlternative.f30226b;
            gVar.mo61687K();
            if (mVWaitToLineAlternative.time != null) {
                gVar.mo61711x(MVWaitToLineAlternative.f30226b);
                mVWaitToLineAlternative.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWaitToLineAlternative.f30227c);
            gVar.mo61678B(mVWaitToLineAlternative.waitToLineId);
            gVar.mo61712y();
            if (mVWaitToLineAlternative.futureDepartureTimes != null) {
                gVar.mo61711x(MVWaitToLineAlternative.f30228d);
                mVWaitToLineAlternative.futureDepartureTimes.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWaitToLineAlternative.serviceAlert != null && mVWaitToLineAlternative.mo34823g()) {
                gVar.mo61711x(MVWaitToLineAlternative.f30229e);
                mVWaitToLineAlternative.serviceAlert.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWaitToLineAlternative.f30230f);
            C0017h.m62S(gVar, mVWaitToLineAlternative.waitOnVehicle);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineAlternative mVWaitToLineAlternative = (MVWaitToLineAlternative) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWaitToLineAlternative.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 2) {
                                    mVWaitToLineAlternative.waitOnVehicle = gVar.mo61690c();
                                    mVWaitToLineAlternative.mo34828k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVLineAlertDigest mVLineAlertDigest = new MVLineAlertDigest();
                                mVWaitToLineAlternative.serviceAlert = mVLineAlertDigest;
                                mVLineAlertDigest.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = new MVWaitToLineLegDepartureTimes();
                            mVWaitToLineAlternative.futureDepartureTimes = mVWaitToLineLegDepartureTimes;
                            mVWaitToLineLegDepartureTimes.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVWaitToLineAlternative.waitToLineId = gVar.mo61696i();
                        mVWaitToLineAlternative.mo34829l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTime mVTime = new MVTime();
                    mVWaitToLineAlternative.time = mVTime;
                    mVTime.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineAlternative$b */
    public static class C11703b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11702a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineAlternative$c */
    public static class C11704c extends C25240d<MVWaitToLineAlternative> {
        public C11704c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineAlternative mVWaitToLineAlternative = (MVWaitToLineAlternative) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWaitToLineAlternative.mo34824h()) {
                bitSet.set(0);
            }
            if (mVWaitToLineAlternative.mo34827j()) {
                bitSet.set(1);
            }
            if (mVWaitToLineAlternative.mo34822f()) {
                bitSet.set(2);
            }
            if (mVWaitToLineAlternative.mo34823g()) {
                bitSet.set(3);
            }
            if (mVWaitToLineAlternative.mo34826i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVWaitToLineAlternative.mo34824h()) {
                mVWaitToLineAlternative.time.mo25202X0(jVar);
            }
            if (mVWaitToLineAlternative.mo34827j()) {
                jVar.mo61678B(mVWaitToLineAlternative.waitToLineId);
            }
            if (mVWaitToLineAlternative.mo34822f()) {
                mVWaitToLineAlternative.futureDepartureTimes.mo25202X0(jVar);
            }
            if (mVWaitToLineAlternative.mo34823g()) {
                mVWaitToLineAlternative.serviceAlert.mo25202X0(jVar);
            }
            if (mVWaitToLineAlternative.mo34826i()) {
                jVar.mo61708u(mVWaitToLineAlternative.waitOnVehicle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToLineAlternative mVWaitToLineAlternative = (MVWaitToLineAlternative) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVWaitToLineAlternative.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVWaitToLineAlternative.waitToLineId = jVar.mo61696i();
                mVWaitToLineAlternative.mo34829l();
            }
            if (T.get(2)) {
                MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = new MVWaitToLineLegDepartureTimes();
                mVWaitToLineAlternative.futureDepartureTimes = mVWaitToLineLegDepartureTimes;
                mVWaitToLineLegDepartureTimes.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVLineAlertDigest mVLineAlertDigest = new MVLineAlertDigest();
                mVWaitToLineAlternative.serviceAlert = mVLineAlertDigest;
                mVLineAlertDigest.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVWaitToLineAlternative.waitOnVehicle = jVar.mo61690c();
                mVWaitToLineAlternative.mo34828k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToLineAlternative$d */
    public static class C11705d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11704c(0);
        }
    }

    static {
        new C17394d0("MVWaitToLineAlternative");
        HashMap hashMap = new HashMap();
        f30231g = hashMap;
        hashMap.put(C25239c.class, new C11703b());
        hashMap.put(C25240d.class, new C11705d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.WAIT_TO_LINE_ID, new FieldMetaData("waitToLineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FUTURE_DEPARTURE_TIMES, new FieldMetaData("futureDepartureTimes", (byte) 3, new StructMetaData(MVWaitToLineLegDepartureTimes.class)));
        enumMap.put(_Fields.SERVICE_ALERT, new FieldMetaData("serviceAlert", (byte) 2, new StructMetaData(MVLineAlertDigest.class)));
        enumMap.put(_Fields.WAIT_ON_VEHICLE, new FieldMetaData("waitOnVehicle", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30232h = unmodifiableMap;
        FieldMetaData.m61947a(MVWaitToLineAlternative.class, unmodifiableMap);
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
        ((C25238b) f30231g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30231g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVWaitToLineAlternative mVWaitToLineAlternative = (MVWaitToLineAlternative) obj;
        if (!getClass().equals(mVWaitToLineAlternative.getClass())) {
            return getClass().getName().compareTo(mVWaitToLineAlternative.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34824h()).compareTo(Boolean.valueOf(mVWaitToLineAlternative.mo34824h()));
        if (compareTo != 0 || ((mo34824h() && (compareTo = this.time.compareTo(mVWaitToLineAlternative.time)) != 0) || (compareTo = Boolean.valueOf(mo34827j()).compareTo(Boolean.valueOf(mVWaitToLineAlternative.mo34827j()))) != 0 || ((mo34827j() && (compareTo = C25082a.m62839c(this.waitToLineId, mVWaitToLineAlternative.waitToLineId)) != 0) || (compareTo = Boolean.valueOf(mo34822f()).compareTo(Boolean.valueOf(mVWaitToLineAlternative.mo34822f()))) != 0 || ((mo34822f() && (compareTo = this.futureDepartureTimes.compareTo(mVWaitToLineAlternative.futureDepartureTimes)) != 0) || (compareTo = Boolean.valueOf(mo34823g()).compareTo(Boolean.valueOf(mVWaitToLineAlternative.mo34823g()))) != 0 || ((mo34823g() && (compareTo = this.serviceAlert.compareTo(mVWaitToLineAlternative.serviceAlert)) != 0) || (compareTo = Boolean.valueOf(mo34826i()).compareTo(Boolean.valueOf(mVWaitToLineAlternative.mo34826i()))) != 0))))) {
            return compareTo;
        }
        if (!mo34826i() || (l = C25082a.m62848l(this.waitOnVehicle, mVWaitToLineAlternative.waitOnVehicle)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWaitToLineAlternative)) {
            return false;
        }
        MVWaitToLineAlternative mVWaitToLineAlternative = (MVWaitToLineAlternative) obj;
        boolean h = mo34824h();
        boolean h2 = mVWaitToLineAlternative.mo34824h();
        if (((h || h2) && (!h || !h2 || !this.time.mo34573a(mVWaitToLineAlternative.time))) || this.waitToLineId != mVWaitToLineAlternative.waitToLineId) {
            return false;
        }
        boolean f = mo34822f();
        boolean f2 = mVWaitToLineAlternative.mo34822f();
        if ((f || f2) && (!f || !f2 || !this.futureDepartureTimes.mo34854a(mVWaitToLineAlternative.futureDepartureTimes))) {
            return false;
        }
        boolean g = mo34823g();
        boolean g2 = mVWaitToLineAlternative.mo34823g();
        if (((g || g2) && (!g || !g2 || !this.serviceAlert.mo31607a(mVWaitToLineAlternative.serviceAlert))) || this.waitOnVehicle != mVWaitToLineAlternative.waitOnVehicle) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34822f() {
        return this.futureDepartureTimes != null;
    }

    /* renamed from: g */
    public final boolean mo34823g() {
        return this.serviceAlert != null;
    }

    /* renamed from: h */
    public final boolean mo34824h() {
        return this.time != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34826i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo34827j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo34828k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo34829l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWaitToLineAlternative(", "time:");
        MVTime mVTime = this.time;
        if (mVTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTime);
        }
        n.append(", ");
        n.append("waitToLineId:");
        C0016g.m42z(n, this.waitToLineId, ", ", "futureDepartureTimes:");
        MVWaitToLineLegDepartureTimes mVWaitToLineLegDepartureTimes = this.futureDepartureTimes;
        if (mVWaitToLineLegDepartureTimes == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWaitToLineLegDepartureTimes);
        }
        if (mo34823g()) {
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
        return C25541a.m63885p(n, this.waitOnVehicle, ")");
    }
}
