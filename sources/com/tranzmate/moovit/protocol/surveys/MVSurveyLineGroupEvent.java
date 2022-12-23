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

public class MVSurveyLineGroupEvent implements TBase<MVSurveyLineGroupEvent, _Fields>, Serializable, Cloneable, Comparable<MVSurveyLineGroupEvent> {

    /* renamed from: b */
    public static final C25113c f28453b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f28454c = new C25113c("lineGroupId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28455d = new C25113c("lineId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28456e = new C25113c("stopId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28457f = new C25113c("userLocation", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28458g = new C25113c("nextDeparture", (byte) 10, 6);

    /* renamed from: h */
    public static final HashMap f28459h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28460i;
    private byte __isset_bitfield = 0;
    public int lineGroupId;
    public int lineId;
    public long nextDeparture;
    private _Fields[] optionals = {_Fields.LINE_ID, _Fields.STOP_ID, _Fields.USER_LOCATION, _Fields.NEXT_DEPARTURE};
    public int stopId;
    public long timestamp;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        LINE_GROUP_ID(2, "lineGroupId"),
        LINE_ID(3, "lineId"),
        STOP_ID(4, "stopId"),
        USER_LOCATION(5, "userLocation"),
        NEXT_DEPARTURE(6, "nextDeparture");
        
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
                    return TIMESTAMP;
                case 2:
                    return LINE_GROUP_ID;
                case 3:
                    return LINE_ID;
                case 4:
                    return STOP_ID;
                case 5:
                    return USER_LOCATION;
                case 6:
                    return NEXT_DEPARTURE;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyLineGroupEvent$a */
    public static class C10631a extends C25239c<MVSurveyLineGroupEvent> {
        public C10631a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyLineGroupEvent mVSurveyLineGroupEvent = (MVSurveyLineGroupEvent) tBase;
            MVLatLon mVLatLon = mVSurveyLineGroupEvent.userLocation;
            C25113c cVar = MVSurveyLineGroupEvent.f28453b;
            gVar.mo61687K();
            gVar.mo61711x(MVSurveyLineGroupEvent.f28453b);
            gVar.mo61679C(mVSurveyLineGroupEvent.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVSurveyLineGroupEvent.f28454c);
            gVar.mo61678B(mVSurveyLineGroupEvent.lineGroupId);
            gVar.mo61712y();
            if (mVSurveyLineGroupEvent.mo31955g()) {
                gVar.mo61711x(MVSurveyLineGroupEvent.f28455d);
                gVar.mo61678B(mVSurveyLineGroupEvent.lineId);
                gVar.mo61712y();
            }
            if (mVSurveyLineGroupEvent.mo31958i()) {
                gVar.mo61711x(MVSurveyLineGroupEvent.f28456e);
                gVar.mo61678B(mVSurveyLineGroupEvent.stopId);
                gVar.mo61712y();
            }
            if (mVSurveyLineGroupEvent.userLocation != null && mVSurveyLineGroupEvent.mo31960k()) {
                gVar.mo61711x(MVSurveyLineGroupEvent.f28457f);
                mVSurveyLineGroupEvent.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSurveyLineGroupEvent.mo31956h()) {
                gVar.mo61711x(MVSurveyLineGroupEvent.f28458g);
                gVar.mo61679C(mVSurveyLineGroupEvent.nextDeparture);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyLineGroupEvent mVSurveyLineGroupEvent = (MVSurveyLineGroupEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVSurveyLineGroupEvent.userLocation;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSurveyLineGroupEvent.timestamp = gVar.mo61697j();
                            mVSurveyLineGroupEvent.mo31965q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSurveyLineGroupEvent.lineGroupId = gVar.mo61696i();
                            mVSurveyLineGroupEvent.mo31961l();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSurveyLineGroupEvent.lineId = gVar.mo61696i();
                            mVSurveyLineGroupEvent.mo31962m();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSurveyLineGroupEvent.stopId = gVar.mo61696i();
                            mVSurveyLineGroupEvent.mo31964p();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVSurveyLineGroupEvent.userLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSurveyLineGroupEvent.nextDeparture = gVar.mo61697j();
                            mVSurveyLineGroupEvent.mo31963o();
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyLineGroupEvent$b */
    public static class C10632b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10631a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyLineGroupEvent$c */
    public static class C10633c extends C25240d<MVSurveyLineGroupEvent> {
        public C10633c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyLineGroupEvent mVSurveyLineGroupEvent = (MVSurveyLineGroupEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSurveyLineGroupEvent.mo31959j()) {
                bitSet.set(0);
            }
            if (mVSurveyLineGroupEvent.mo31954f()) {
                bitSet.set(1);
            }
            if (mVSurveyLineGroupEvent.mo31955g()) {
                bitSet.set(2);
            }
            if (mVSurveyLineGroupEvent.mo31958i()) {
                bitSet.set(3);
            }
            if (mVSurveyLineGroupEvent.mo31960k()) {
                bitSet.set(4);
            }
            if (mVSurveyLineGroupEvent.mo31956h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVSurveyLineGroupEvent.mo31959j()) {
                jVar.mo61679C(mVSurveyLineGroupEvent.timestamp);
            }
            if (mVSurveyLineGroupEvent.mo31954f()) {
                jVar.mo61678B(mVSurveyLineGroupEvent.lineGroupId);
            }
            if (mVSurveyLineGroupEvent.mo31955g()) {
                jVar.mo61678B(mVSurveyLineGroupEvent.lineId);
            }
            if (mVSurveyLineGroupEvent.mo31958i()) {
                jVar.mo61678B(mVSurveyLineGroupEvent.stopId);
            }
            if (mVSurveyLineGroupEvent.mo31960k()) {
                mVSurveyLineGroupEvent.userLocation.mo25202X0(jVar);
            }
            if (mVSurveyLineGroupEvent.mo31956h()) {
                jVar.mo61679C(mVSurveyLineGroupEvent.nextDeparture);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyLineGroupEvent mVSurveyLineGroupEvent = (MVSurveyLineGroupEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVSurveyLineGroupEvent.timestamp = jVar.mo61697j();
                mVSurveyLineGroupEvent.mo31965q();
            }
            if (T.get(1)) {
                mVSurveyLineGroupEvent.lineGroupId = jVar.mo61696i();
                mVSurveyLineGroupEvent.mo31961l();
            }
            if (T.get(2)) {
                mVSurveyLineGroupEvent.lineId = jVar.mo61696i();
                mVSurveyLineGroupEvent.mo31962m();
            }
            if (T.get(3)) {
                mVSurveyLineGroupEvent.stopId = jVar.mo61696i();
                mVSurveyLineGroupEvent.mo31964p();
            }
            if (T.get(4)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVSurveyLineGroupEvent.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVSurveyLineGroupEvent.nextDeparture = jVar.mo61697j();
                mVSurveyLineGroupEvent.mo31963o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyLineGroupEvent$d */
    public static class C10634d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10633c(0);
        }
    }

    static {
        new C17394d0("MVSurveyLineGroupEvent");
        HashMap hashMap = new HashMap();
        f28459h = hashMap;
        hashMap.put(C25239c.class, new C10632b());
        hashMap.put(C25240d.class, new C10634d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.LINE_GROUP_ID, new FieldMetaData("lineGroupId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.NEXT_DEPARTURE, new FieldMetaData("nextDeparture", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28460i = unmodifiableMap;
        FieldMetaData.m61947a(MVSurveyLineGroupEvent.class, unmodifiableMap);
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
        ((C25238b) f28459h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28459h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVSurveyLineGroupEvent mVSurveyLineGroupEvent = (MVSurveyLineGroupEvent) obj;
        if (!getClass().equals(mVSurveyLineGroupEvent.getClass())) {
            return getClass().getName().compareTo(mVSurveyLineGroupEvent.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31959j()).compareTo(Boolean.valueOf(mVSurveyLineGroupEvent.mo31959j()));
        if (compareTo != 0 || ((mo31959j() && (compareTo = C25082a.m62840d(this.timestamp, mVSurveyLineGroupEvent.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo31954f()).compareTo(Boolean.valueOf(mVSurveyLineGroupEvent.mo31954f()))) != 0 || ((mo31954f() && (compareTo = C25082a.m62839c(this.lineGroupId, mVSurveyLineGroupEvent.lineGroupId)) != 0) || (compareTo = Boolean.valueOf(mo31955g()).compareTo(Boolean.valueOf(mVSurveyLineGroupEvent.mo31955g()))) != 0 || ((mo31955g() && (compareTo = C25082a.m62839c(this.lineId, mVSurveyLineGroupEvent.lineId)) != 0) || (compareTo = Boolean.valueOf(mo31958i()).compareTo(Boolean.valueOf(mVSurveyLineGroupEvent.mo31958i()))) != 0 || ((mo31958i() && (compareTo = C25082a.m62839c(this.stopId, mVSurveyLineGroupEvent.stopId)) != 0) || (compareTo = Boolean.valueOf(mo31960k()).compareTo(Boolean.valueOf(mVSurveyLineGroupEvent.mo31960k()))) != 0 || ((mo31960k() && (compareTo = this.userLocation.compareTo(mVSurveyLineGroupEvent.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo31956h()).compareTo(Boolean.valueOf(mVSurveyLineGroupEvent.mo31956h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo31956h() || (d = C25082a.m62840d(this.nextDeparture, mVSurveyLineGroupEvent.nextDeparture)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSurveyLineGroupEvent)) {
            return false;
        }
        MVSurveyLineGroupEvent mVSurveyLineGroupEvent = (MVSurveyLineGroupEvent) obj;
        if (this.timestamp != mVSurveyLineGroupEvent.timestamp || this.lineGroupId != mVSurveyLineGroupEvent.lineGroupId) {
            return false;
        }
        boolean g = mo31955g();
        boolean g2 = mVSurveyLineGroupEvent.mo31955g();
        if ((g || g2) && (!g || !g2 || this.lineId != mVSurveyLineGroupEvent.lineId)) {
            return false;
        }
        boolean i = mo31958i();
        boolean i2 = mVSurveyLineGroupEvent.mo31958i();
        if ((i || i2) && (!i || !i2 || this.stopId != mVSurveyLineGroupEvent.stopId)) {
            return false;
        }
        boolean k = mo31960k();
        boolean k2 = mVSurveyLineGroupEvent.mo31960k();
        if ((k || k2) && (!k || !k2 || !this.userLocation.mo26290a(mVSurveyLineGroupEvent.userLocation))) {
            return false;
        }
        boolean h = mo31956h();
        boolean h2 = mVSurveyLineGroupEvent.mo31956h();
        if ((h || h2) && (!h || !h2 || this.nextDeparture != mVSurveyLineGroupEvent.nextDeparture)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31954f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo31955g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo31956h() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31958i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo31959j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo31960k() {
        return this.userLocation != null;
    }

    /* renamed from: l */
    public final void mo31961l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo31962m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo31963o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: p */
    public final void mo31964p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo31965q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSurveyLineGroupEvent(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "lineGroupId:");
        n.append(this.lineGroupId);
        if (mo31955g()) {
            n.append(", ");
            n.append("lineId:");
            n.append(this.lineId);
        }
        if (mo31958i()) {
            n.append(", ");
            n.append("stopId:");
            n.append(this.stopId);
        }
        if (mo31960k()) {
            n.append(", ");
            n.append("userLocation:");
            MVLatLon mVLatLon = this.userLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        if (mo31956h()) {
            n.append(", ");
            n.append("nextDeparture:");
            n.append(this.nextDeparture);
        }
        n.append(")");
        return n.toString();
    }
}
