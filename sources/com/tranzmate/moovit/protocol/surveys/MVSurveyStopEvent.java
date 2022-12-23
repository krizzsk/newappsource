package com.tranzmate.moovit.protocol.surveys;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVSurveyStopEvent implements TBase<MVSurveyStopEvent, _Fields>, Serializable, Cloneable, Comparable<MVSurveyStopEvent> {

    /* renamed from: b */
    public static final C25113c f28471b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f28472c = new C25113c("stopId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28473d = new C25113c("userLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28474e = new C25113c("nextDeparture", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f28475f = new C25113c("distance", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f28476g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28477h;
    private byte __isset_bitfield = 0;
    public int distance;
    public long nextDeparture;
    private _Fields[] optionals = {_Fields.USER_LOCATION, _Fields.NEXT_DEPARTURE, _Fields.DISTANCE};
    public int stopId;
    public long timestamp;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        STOP_ID(2, "stopId"),
        USER_LOCATION(3, "userLocation"),
        NEXT_DEPARTURE(4, "nextDeparture"),
        DISTANCE(5, "distance");
        
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
                return TIMESTAMP;
            }
            if (i == 2) {
                return STOP_ID;
            }
            if (i == 3) {
                return USER_LOCATION;
            }
            if (i == 4) {
                return NEXT_DEPARTURE;
            }
            if (i != 5) {
                return null;
            }
            return DISTANCE;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyStopEvent$a */
    public static class C10643a extends C25239c<MVSurveyStopEvent> {
        public C10643a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyStopEvent mVSurveyStopEvent = (MVSurveyStopEvent) tBase;
            MVLatLon mVLatLon = mVSurveyStopEvent.userLocation;
            C25113c cVar = MVSurveyStopEvent.f28471b;
            gVar.mo61687K();
            gVar.mo61711x(MVSurveyStopEvent.f28471b);
            gVar.mo61679C(mVSurveyStopEvent.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVSurveyStopEvent.f28472c);
            gVar.mo61678B(mVSurveyStopEvent.stopId);
            gVar.mo61712y();
            if (mVSurveyStopEvent.userLocation != null && mVSurveyStopEvent.mo31993j()) {
                gVar.mo61711x(MVSurveyStopEvent.f28473d);
                mVSurveyStopEvent.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSurveyStopEvent.mo31989g()) {
                gVar.mo61711x(MVSurveyStopEvent.f28474e);
                gVar.mo61679C(mVSurveyStopEvent.nextDeparture);
                gVar.mo61712y();
            }
            if (mVSurveyStopEvent.mo31988f()) {
                gVar.mo61711x(MVSurveyStopEvent.f28475f);
                gVar.mo61678B(mVSurveyStopEvent.distance);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyStopEvent mVSurveyStopEvent = (MVSurveyStopEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVSurveyStopEvent.userLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVSurveyStopEvent.distance = gVar.mo61696i();
                                    mVSurveyStopEvent.mo31994k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 10) {
                                mVSurveyStopEvent.nextDeparture = gVar.mo61697j();
                                mVSurveyStopEvent.mo31995l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVSurveyStopEvent.userLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVSurveyStopEvent.stopId = gVar.mo61696i();
                        mVSurveyStopEvent.mo31996m();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVSurveyStopEvent.timestamp = gVar.mo61697j();
                    mVSurveyStopEvent.mo31997o();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyStopEvent$b */
    public static class C10644b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10643a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyStopEvent$c */
    public static class C10645c extends C25240d<MVSurveyStopEvent> {
        public C10645c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyStopEvent mVSurveyStopEvent = (MVSurveyStopEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSurveyStopEvent.mo31992i()) {
                bitSet.set(0);
            }
            if (mVSurveyStopEvent.mo31990h()) {
                bitSet.set(1);
            }
            if (mVSurveyStopEvent.mo31993j()) {
                bitSet.set(2);
            }
            if (mVSurveyStopEvent.mo31989g()) {
                bitSet.set(3);
            }
            if (mVSurveyStopEvent.mo31988f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVSurveyStopEvent.mo31992i()) {
                jVar.mo61679C(mVSurveyStopEvent.timestamp);
            }
            if (mVSurveyStopEvent.mo31990h()) {
                jVar.mo61678B(mVSurveyStopEvent.stopId);
            }
            if (mVSurveyStopEvent.mo31993j()) {
                mVSurveyStopEvent.userLocation.mo25202X0(jVar);
            }
            if (mVSurveyStopEvent.mo31989g()) {
                jVar.mo61679C(mVSurveyStopEvent.nextDeparture);
            }
            if (mVSurveyStopEvent.mo31988f()) {
                jVar.mo61678B(mVSurveyStopEvent.distance);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyStopEvent mVSurveyStopEvent = (MVSurveyStopEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVSurveyStopEvent.timestamp = jVar.mo61697j();
                mVSurveyStopEvent.mo31997o();
            }
            if (T.get(1)) {
                mVSurveyStopEvent.stopId = jVar.mo61696i();
                mVSurveyStopEvent.mo31996m();
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVSurveyStopEvent.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVSurveyStopEvent.nextDeparture = jVar.mo61697j();
                mVSurveyStopEvent.mo31995l();
            }
            if (T.get(4)) {
                mVSurveyStopEvent.distance = jVar.mo61696i();
                mVSurveyStopEvent.mo31994k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyStopEvent$d */
    public static class C10646d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10645c(0);
        }
    }

    static {
        new C17394d0("MVSurveyStopEvent");
        HashMap hashMap = new HashMap();
        f28476g = hashMap;
        hashMap.put(C25239c.class, new C10644b());
        hashMap.put(C25240d.class, new C10646d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.NEXT_DEPARTURE, new FieldMetaData("nextDeparture", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.DISTANCE, new FieldMetaData("distance", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28477h = unmodifiableMap;
        FieldMetaData.m61947a(MVSurveyStopEvent.class, unmodifiableMap);
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
        ((C25238b) f28476g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28476g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVSurveyStopEvent mVSurveyStopEvent = (MVSurveyStopEvent) obj;
        if (!getClass().equals(mVSurveyStopEvent.getClass())) {
            return getClass().getName().compareTo(mVSurveyStopEvent.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31992i()).compareTo(Boolean.valueOf(mVSurveyStopEvent.mo31992i()));
        if (compareTo != 0 || ((mo31992i() && (compareTo = C25082a.m62840d(this.timestamp, mVSurveyStopEvent.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo31990h()).compareTo(Boolean.valueOf(mVSurveyStopEvent.mo31990h()))) != 0 || ((mo31990h() && (compareTo = C25082a.m62839c(this.stopId, mVSurveyStopEvent.stopId)) != 0) || (compareTo = Boolean.valueOf(mo31993j()).compareTo(Boolean.valueOf(mVSurveyStopEvent.mo31993j()))) != 0 || ((mo31993j() && (compareTo = this.userLocation.compareTo(mVSurveyStopEvent.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo31989g()).compareTo(Boolean.valueOf(mVSurveyStopEvent.mo31989g()))) != 0 || ((mo31989g() && (compareTo = C25082a.m62840d(this.nextDeparture, mVSurveyStopEvent.nextDeparture)) != 0) || (compareTo = Boolean.valueOf(mo31988f()).compareTo(Boolean.valueOf(mVSurveyStopEvent.mo31988f()))) != 0))))) {
            return compareTo;
        }
        if (!mo31988f() || (c = C25082a.m62839c(this.distance, mVSurveyStopEvent.distance)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSurveyStopEvent)) {
            return false;
        }
        MVSurveyStopEvent mVSurveyStopEvent = (MVSurveyStopEvent) obj;
        if (this.timestamp != mVSurveyStopEvent.timestamp || this.stopId != mVSurveyStopEvent.stopId) {
            return false;
        }
        boolean j = mo31993j();
        boolean j2 = mVSurveyStopEvent.mo31993j();
        if ((j || j2) && (!j || !j2 || !this.userLocation.mo26290a(mVSurveyStopEvent.userLocation))) {
            return false;
        }
        boolean g = mo31989g();
        boolean g2 = mVSurveyStopEvent.mo31989g();
        if ((g || g2) && (!g || !g2 || this.nextDeparture != mVSurveyStopEvent.nextDeparture)) {
            return false;
        }
        boolean f = mo31988f();
        boolean f2 = mVSurveyStopEvent.mo31988f();
        if ((f || f2) && (!f || !f2 || this.distance != mVSurveyStopEvent.distance)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31988f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo31989g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo31990h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31992i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo31993j() {
        return this.userLocation != null;
    }

    /* renamed from: k */
    public final void mo31994k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: l */
    public final void mo31995l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo31996m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo31997o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSurveyStopEvent(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "stopId:");
        n.append(this.stopId);
        if (mo31993j()) {
            n.append(", ");
            n.append("userLocation:");
            MVLatLon mVLatLon = this.userLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        if (mo31989g()) {
            n.append(", ");
            n.append("nextDeparture:");
            n.append(this.nextDeparture);
        }
        if (mo31988f()) {
            n.append(", ");
            n.append("distance:");
            n.append(this.distance);
        }
        n.append(")");
        return n.toString();
    }
}
