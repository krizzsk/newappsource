package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTripGroup implements TBase<MVTripGroup, _Fields>, Serializable, Cloneable, Comparable<MVTripGroup> {

    /* renamed from: b */
    public static final C25113c f25832b = new C25113c("tripIntervalsId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25833c = new C25113c("tripShapeId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25834d = new C25113c("localMidnightDaysSinceEpoch", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25835e = new C25113c("departures", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f25836f = new C25113c("serviceId", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f25837g = new C25113c("departureTripIds", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f25838h = new C25113c("frequencyId", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f25839i = new C25113c("shapeSegmentIds", (byte) 15, 8);

    /* renamed from: j */
    public static final HashMap f25840j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f25841k;
    private byte __isset_bitfield = 0;
    public List<Long> departureTripIds;
    public List<Integer> departures;
    public int frequencyId;
    public int localMidnightDaysSinceEpoch;
    private _Fields[] optionals = {_Fields.FREQUENCY_ID, _Fields.SHAPE_SEGMENT_IDS};
    public int serviceId;
    public List<Integer> shapeSegmentIds;
    public int tripIntervalsId;
    public int tripShapeId;

    public enum _Fields implements C25085c {
        TRIP_INTERVALS_ID(1, "tripIntervalsId"),
        TRIP_SHAPE_ID(2, "tripShapeId"),
        LOCAL_MIDNIGHT_DAYS_SINCE_EPOCH(3, "localMidnightDaysSinceEpoch"),
        DEPARTURES(4, "departures"),
        SERVICE_ID(5, "serviceId"),
        DEPARTURE_TRIP_IDS(6, "departureTripIds"),
        FREQUENCY_ID(7, "frequencyId"),
        SHAPE_SEGMENT_IDS(8, "shapeSegmentIds");
        
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
                    return TRIP_INTERVALS_ID;
                case 2:
                    return TRIP_SHAPE_ID;
                case 3:
                    return LOCAL_MIDNIGHT_DAYS_SINCE_EPOCH;
                case 4:
                    return DEPARTURES;
                case 5:
                    return SERVICE_ID;
                case 6:
                    return DEPARTURE_TRIP_IDS;
                case 7:
                    return FREQUENCY_ID;
                case 8:
                    return SHAPE_SEGMENT_IDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripGroup$a */
    public static class C8855a extends C25239c<MVTripGroup> {
        public C8855a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripGroup mVTripGroup = (MVTripGroup) tBase;
            mVTripGroup.getClass();
            C25113c cVar = MVTripGroup.f25832b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripGroup.f25832b);
            gVar.mo61678B(mVTripGroup.tripIntervalsId);
            gVar.mo61712y();
            gVar.mo61711x(MVTripGroup.f25833c);
            gVar.mo61678B(mVTripGroup.tripShapeId);
            gVar.mo61712y();
            gVar.mo61711x(MVTripGroup.f25834d);
            gVar.mo61678B(mVTripGroup.localMidnightDaysSinceEpoch);
            gVar.mo61712y();
            if (mVTripGroup.departures != null) {
                gVar.mo61711x(MVTripGroup.f25835e);
                gVar.mo61680D(new C25119e((byte) 8, mVTripGroup.departures.size()));
                for (Integer intValue : mVTripGroup.departures) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTripGroup.f25836f);
            gVar.mo61678B(mVTripGroup.serviceId);
            gVar.mo61712y();
            if (mVTripGroup.departureTripIds != null) {
                gVar.mo61711x(MVTripGroup.f25837g);
                gVar.mo61680D(new C25119e((byte) 10, mVTripGroup.departureTripIds.size()));
                for (Long longValue : mVTripGroup.departureTripIds) {
                    gVar.mo61679C(longValue.longValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTripGroup.mo27575h()) {
                gVar.mo61711x(MVTripGroup.f25838h);
                gVar.mo61678B(mVTripGroup.frequencyId);
                gVar.mo61712y();
            }
            if (mVTripGroup.shapeSegmentIds != null && mVTripGroup.mo27579k()) {
                gVar.mo61711x(MVTripGroup.f25839i);
                gVar.mo61680D(new C25119e((byte) 8, mVTripGroup.shapeSegmentIds.size()));
                for (Integer intValue2 : mVTripGroup.shapeSegmentIds) {
                    gVar.mo61678B(intValue2.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripGroup mVTripGroup = (MVTripGroup) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripGroup.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripGroup.tripIntervalsId = gVar.mo61696i();
                            mVTripGroup.mo27585r();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripGroup.tripShapeId = gVar.mo61696i();
                            mVTripGroup.mo27586s();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripGroup.localMidnightDaysSinceEpoch = gVar.mo61696i();
                            mVTripGroup.mo27583p();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTripGroup.departures = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVTripGroup.departures, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripGroup.serviceId = gVar.mo61696i();
                            mVTripGroup.mo27584q();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVTripGroup.departureTripIds = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                mVTripGroup.departureTripIds.add(Long.valueOf(gVar.mo61697j()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripGroup.frequencyId = gVar.mo61696i();
                            mVTripGroup.mo27582o();
                            break;
                        }
                    case 8:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVTripGroup.shapeSegmentIds = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVTripGroup.shapeSegmentIds, i, 1);
                            }
                            gVar.mo61699l();
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripGroup$b */
    public static class C8856b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8855a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripGroup$c */
    public static class C8857c extends C25240d<MVTripGroup> {
        public C8857c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripGroup mVTripGroup = (MVTripGroup) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripGroup.mo27580l()) {
                bitSet.set(0);
            }
            if (mVTripGroup.mo27581m()) {
                bitSet.set(1);
            }
            if (mVTripGroup.mo27577i()) {
                bitSet.set(2);
            }
            if (mVTripGroup.mo27574g()) {
                bitSet.set(3);
            }
            if (mVTripGroup.mo27578j()) {
                bitSet.set(4);
            }
            if (mVTripGroup.mo27573f()) {
                bitSet.set(5);
            }
            if (mVTripGroup.mo27575h()) {
                bitSet.set(6);
            }
            if (mVTripGroup.mo27579k()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVTripGroup.mo27580l()) {
                jVar.mo61678B(mVTripGroup.tripIntervalsId);
            }
            if (mVTripGroup.mo27581m()) {
                jVar.mo61678B(mVTripGroup.tripShapeId);
            }
            if (mVTripGroup.mo27577i()) {
                jVar.mo61678B(mVTripGroup.localMidnightDaysSinceEpoch);
            }
            if (mVTripGroup.mo27574g()) {
                jVar.mo61678B(mVTripGroup.departures.size());
                for (Integer intValue : mVTripGroup.departures) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVTripGroup.mo27578j()) {
                jVar.mo61678B(mVTripGroup.serviceId);
            }
            if (mVTripGroup.mo27573f()) {
                jVar.mo61678B(mVTripGroup.departureTripIds.size());
                for (Long longValue : mVTripGroup.departureTripIds) {
                    jVar.mo61679C(longValue.longValue());
                }
            }
            if (mVTripGroup.mo27575h()) {
                jVar.mo61678B(mVTripGroup.frequencyId);
            }
            if (mVTripGroup.mo27579k()) {
                jVar.mo61678B(mVTripGroup.shapeSegmentIds.size());
                for (Integer intValue2 : mVTripGroup.shapeSegmentIds) {
                    jVar.mo61678B(intValue2.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripGroup mVTripGroup = (MVTripGroup) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVTripGroup.tripIntervalsId = jVar.mo61696i();
                mVTripGroup.mo27585r();
            }
            if (T.get(1)) {
                mVTripGroup.tripShapeId = jVar.mo61696i();
                mVTripGroup.mo27586s();
            }
            if (T.get(2)) {
                mVTripGroup.localMidnightDaysSinceEpoch = jVar.mo61696i();
                mVTripGroup.mo27583p();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVTripGroup.departures = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVTripGroup.departures, i2, 1)) {
                }
            }
            if (T.get(4)) {
                mVTripGroup.serviceId = jVar.mo61696i();
                mVTripGroup.mo27584q();
            }
            if (T.get(5)) {
                int i3 = jVar.mo61696i();
                mVTripGroup.departureTripIds = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVTripGroup.departureTripIds.add(Long.valueOf(jVar.mo61697j()));
                }
            }
            if (T.get(6)) {
                mVTripGroup.frequencyId = jVar.mo61696i();
                mVTripGroup.mo27582o();
            }
            if (T.get(7)) {
                int i5 = jVar.mo61696i();
                mVTripGroup.shapeSegmentIds = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6 = C13437d.m33701f(jVar.mo61696i(), mVTripGroup.shapeSegmentIds, i6, 1)) {
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripGroup$d */
    public static class C8858d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8857c(0);
        }
    }

    static {
        new C17394d0("MVTripGroup");
        HashMap hashMap = new HashMap();
        f25840j = hashMap;
        hashMap.put(C25239c.class, new C8856b());
        hashMap.put(C25240d.class, new C8858d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_INTERVALS_ID, new FieldMetaData("tripIntervalsId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRIP_SHAPE_ID, new FieldMetaData("tripShapeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LOCAL_MIDNIGHT_DAYS_SINCE_EPOCH, new FieldMetaData("localMidnightDaysSinceEpoch", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEPARTURES, new FieldMetaData("departures", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEPARTURE_TRIP_IDS, new FieldMetaData("departureTripIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 10, false))));
        enumMap.put(_Fields.FREQUENCY_ID, new FieldMetaData("frequencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SHAPE_SEGMENT_IDS, new FieldMetaData("shapeSegmentIds", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25841k = unmodifiableMap;
        FieldMetaData.m61947a(MVTripGroup.class, unmodifiableMap);
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
        ((C25238b) f25840j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25840j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTripGroup mVTripGroup = (MVTripGroup) obj;
        if (!getClass().equals(mVTripGroup.getClass())) {
            return getClass().getName().compareTo(mVTripGroup.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27580l()).compareTo(Boolean.valueOf(mVTripGroup.mo27580l()));
        if (compareTo != 0 || ((mo27580l() && (compareTo = C25082a.m62839c(this.tripIntervalsId, mVTripGroup.tripIntervalsId)) != 0) || (compareTo = Boolean.valueOf(mo27581m()).compareTo(Boolean.valueOf(mVTripGroup.mo27581m()))) != 0 || ((mo27581m() && (compareTo = C25082a.m62839c(this.tripShapeId, mVTripGroup.tripShapeId)) != 0) || (compareTo = Boolean.valueOf(mo27577i()).compareTo(Boolean.valueOf(mVTripGroup.mo27577i()))) != 0 || ((mo27577i() && (compareTo = C25082a.m62839c(this.localMidnightDaysSinceEpoch, mVTripGroup.localMidnightDaysSinceEpoch)) != 0) || (compareTo = Boolean.valueOf(mo27574g()).compareTo(Boolean.valueOf(mVTripGroup.mo27574g()))) != 0 || ((mo27574g() && (compareTo = C25082a.m62844h(this.departures, mVTripGroup.departures)) != 0) || (compareTo = Boolean.valueOf(mo27578j()).compareTo(Boolean.valueOf(mVTripGroup.mo27578j()))) != 0 || ((mo27578j() && (compareTo = C25082a.m62839c(this.serviceId, mVTripGroup.serviceId)) != 0) || (compareTo = Boolean.valueOf(mo27573f()).compareTo(Boolean.valueOf(mVTripGroup.mo27573f()))) != 0 || ((mo27573f() && (compareTo = C25082a.m62844h(this.departureTripIds, mVTripGroup.departureTripIds)) != 0) || (compareTo = Boolean.valueOf(mo27575h()).compareTo(Boolean.valueOf(mVTripGroup.mo27575h()))) != 0 || ((mo27575h() && (compareTo = C25082a.m62839c(this.frequencyId, mVTripGroup.frequencyId)) != 0) || (compareTo = Boolean.valueOf(mo27579k()).compareTo(Boolean.valueOf(mVTripGroup.mo27579k()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo27579k() || (h = C25082a.m62844h(this.shapeSegmentIds, mVTripGroup.shapeSegmentIds)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripGroup)) {
            return false;
        }
        MVTripGroup mVTripGroup = (MVTripGroup) obj;
        if (this.tripIntervalsId != mVTripGroup.tripIntervalsId || this.tripShapeId != mVTripGroup.tripShapeId || this.localMidnightDaysSinceEpoch != mVTripGroup.localMidnightDaysSinceEpoch) {
            return false;
        }
        boolean g = mo27574g();
        boolean g2 = mVTripGroup.mo27574g();
        if (((g || g2) && (!g || !g2 || !this.departures.equals(mVTripGroup.departures))) || this.serviceId != mVTripGroup.serviceId) {
            return false;
        }
        boolean f = mo27573f();
        boolean f2 = mVTripGroup.mo27573f();
        if ((f || f2) && (!f || !f2 || !this.departureTripIds.equals(mVTripGroup.departureTripIds))) {
            return false;
        }
        boolean h = mo27575h();
        boolean h2 = mVTripGroup.mo27575h();
        if ((h || h2) && (!h || !h2 || this.frequencyId != mVTripGroup.frequencyId)) {
            return false;
        }
        boolean k = mo27579k();
        boolean k2 = mVTripGroup.mo27579k();
        if ((k || k2) && (!k || !k2 || !this.shapeSegmentIds.equals(mVTripGroup.shapeSegmentIds))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27573f() {
        return this.departureTripIds != null;
    }

    /* renamed from: g */
    public final boolean mo27574g() {
        return this.departures != null;
    }

    /* renamed from: h */
    public final boolean mo27575h() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27577i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo27578j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo27579k() {
        return this.shapeSegmentIds != null;
    }

    /* renamed from: l */
    public final boolean mo27580l() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: m */
    public final boolean mo27581m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final void mo27582o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: p */
    public final void mo27583p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: q */
    public final void mo27584q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: r */
    public final void mo27585r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: s */
    public final void mo27586s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripGroup(", "tripIntervalsId:");
        C0016g.m42z(n, this.tripIntervalsId, ", ", "tripShapeId:");
        C0016g.m42z(n, this.tripShapeId, ", ", "localMidnightDaysSinceEpoch:");
        C0016g.m42z(n, this.localMidnightDaysSinceEpoch, ", ", "departures:");
        List<Integer> list = this.departures;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("serviceId:");
        C0016g.m42z(n, this.serviceId, ", ", "departureTripIds:");
        List<Long> list2 = this.departureTripIds;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        if (mo27575h()) {
            n.append(", ");
            n.append("frequencyId:");
            n.append(this.frequencyId);
        }
        if (mo27579k()) {
            n.append(", ");
            n.append("shapeSegmentIds:");
            List<Integer> list3 = this.shapeSegmentIds;
            if (list3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
