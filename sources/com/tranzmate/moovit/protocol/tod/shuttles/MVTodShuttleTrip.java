package com.tranzmate.moovit.protocol.tod.shuttles;

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

public class MVTodShuttleTrip implements TBase<MVTodShuttleTrip, _Fields>, Serializable, Cloneable, Comparable<MVTodShuttleTrip> {

    /* renamed from: b */
    public static final C25113c f29751b = new C25113c("tripId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29752c = new C25113c("patternId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29753d = new C25113c("departure", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f29754e = new C25113c("arrivalsIntervals", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f29755f = new C25113c("lockTime", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f29756g = new C25113c("inaccurateTimes", (byte) 2, 6);

    /* renamed from: h */
    public static final HashMap f29757h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f29758i;
    private byte __isset_bitfield = 0;
    public List<Short> arrivalsIntervals;
    public long departure;
    public boolean inaccurateTimes;
    public long lockTime;
    private _Fields[] optionals = {_Fields.LOCK_TIME, _Fields.INACCURATE_TIMES};
    public String patternId;
    public String tripId;

    public enum _Fields implements C25085c {
        TRIP_ID(1, "tripId"),
        PATTERN_ID(2, "patternId"),
        DEPARTURE(3, "departure"),
        ARRIVALS_INTERVALS(4, "arrivalsIntervals"),
        LOCK_TIME(5, "lockTime"),
        INACCURATE_TIMES(6, "inaccurateTimes");
        
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
                    return TRIP_ID;
                case 2:
                    return PATTERN_ID;
                case 3:
                    return DEPARTURE;
                case 4:
                    return ARRIVALS_INTERVALS;
                case 5:
                    return LOCK_TIME;
                case 6:
                    return INACCURATE_TIMES;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleTrip$a */
    public static class C11443a extends C25239c<MVTodShuttleTrip> {
        public C11443a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttleTrip mVTodShuttleTrip = (MVTodShuttleTrip) tBase;
            mVTodShuttleTrip.getClass();
            C25113c cVar = MVTodShuttleTrip.f29751b;
            gVar.mo61687K();
            if (mVTodShuttleTrip.tripId != null) {
                gVar.mo61711x(MVTodShuttleTrip.f29751b);
                gVar.mo61686J(mVTodShuttleTrip.tripId);
                gVar.mo61712y();
            }
            if (mVTodShuttleTrip.patternId != null) {
                gVar.mo61711x(MVTodShuttleTrip.f29752c);
                gVar.mo61686J(mVTodShuttleTrip.patternId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodShuttleTrip.f29753d);
            gVar.mo61679C(mVTodShuttleTrip.departure);
            gVar.mo61712y();
            if (mVTodShuttleTrip.arrivalsIntervals != null) {
                gVar.mo61711x(MVTodShuttleTrip.f29754e);
                gVar.mo61680D(new C25119e((byte) 6, mVTodShuttleTrip.arrivalsIntervals.size()));
                for (Short shortValue : mVTodShuttleTrip.arrivalsIntervals) {
                    gVar.mo61677A(shortValue.shortValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodShuttleTrip.mo34030i()) {
                gVar.mo61711x(MVTodShuttleTrip.f29755f);
                gVar.mo61679C(mVTodShuttleTrip.lockTime);
                gVar.mo61712y();
            }
            if (mVTodShuttleTrip.mo34028h()) {
                gVar.mo61711x(MVTodShuttleTrip.f29756g);
                gVar.mo61708u(mVTodShuttleTrip.inaccurateTimes);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttleTrip mVTodShuttleTrip = (MVTodShuttleTrip) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodShuttleTrip.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodShuttleTrip.tripId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodShuttleTrip.patternId = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodShuttleTrip.departure = gVar.mo61697j();
                            mVTodShuttleTrip.mo34033l();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTodShuttleTrip.arrivalsIntervals = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVTodShuttleTrip.arrivalsIntervals.add(Short.valueOf(gVar.mo61695h()));
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodShuttleTrip.lockTime = gVar.mo61697j();
                            mVTodShuttleTrip.mo34035o();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodShuttleTrip.inaccurateTimes = gVar.mo61690c();
                            mVTodShuttleTrip.mo34034m();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleTrip$b */
    public static class C11444b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11443a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleTrip$c */
    public static class C11445c extends C25240d<MVTodShuttleTrip> {
        public C11445c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttleTrip mVTodShuttleTrip = (MVTodShuttleTrip) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodShuttleTrip.mo34032k()) {
                bitSet.set(0);
            }
            if (mVTodShuttleTrip.mo34031j()) {
                bitSet.set(1);
            }
            if (mVTodShuttleTrip.mo34027g()) {
                bitSet.set(2);
            }
            if (mVTodShuttleTrip.mo34026f()) {
                bitSet.set(3);
            }
            if (mVTodShuttleTrip.mo34030i()) {
                bitSet.set(4);
            }
            if (mVTodShuttleTrip.mo34028h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVTodShuttleTrip.mo34032k()) {
                jVar.mo61686J(mVTodShuttleTrip.tripId);
            }
            if (mVTodShuttleTrip.mo34031j()) {
                jVar.mo61686J(mVTodShuttleTrip.patternId);
            }
            if (mVTodShuttleTrip.mo34027g()) {
                jVar.mo61679C(mVTodShuttleTrip.departure);
            }
            if (mVTodShuttleTrip.mo34026f()) {
                jVar.mo61678B(mVTodShuttleTrip.arrivalsIntervals.size());
                for (Short shortValue : mVTodShuttleTrip.arrivalsIntervals) {
                    jVar.mo61677A(shortValue.shortValue());
                }
            }
            if (mVTodShuttleTrip.mo34030i()) {
                jVar.mo61679C(mVTodShuttleTrip.lockTime);
            }
            if (mVTodShuttleTrip.mo34028h()) {
                jVar.mo61708u(mVTodShuttleTrip.inaccurateTimes);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttleTrip mVTodShuttleTrip = (MVTodShuttleTrip) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVTodShuttleTrip.tripId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodShuttleTrip.patternId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTodShuttleTrip.departure = jVar.mo61697j();
                mVTodShuttleTrip.mo34033l();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVTodShuttleTrip.arrivalsIntervals = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVTodShuttleTrip.arrivalsIntervals.add(Short.valueOf(jVar.mo61695h()));
                }
            }
            if (T.get(4)) {
                mVTodShuttleTrip.lockTime = jVar.mo61697j();
                mVTodShuttleTrip.mo34035o();
            }
            if (T.get(5)) {
                mVTodShuttleTrip.inaccurateTimes = jVar.mo61690c();
                mVTodShuttleTrip.mo34034m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttleTrip$d */
    public static class C11446d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11445c(0);
        }
    }

    static {
        new C17394d0("MVTodShuttleTrip");
        HashMap hashMap = new HashMap();
        f29757h = hashMap;
        hashMap.put(C25239c.class, new C11444b());
        hashMap.put(C25240d.class, new C11446d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_ID, new FieldMetaData("tripId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PATTERN_ID, new FieldMetaData("patternId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEPARTURE, new FieldMetaData("departure", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ARRIVALS_INTERVALS, new FieldMetaData("arrivalsIntervals", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 6, false))));
        enumMap.put(_Fields.LOCK_TIME, new FieldMetaData("lockTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.INACCURATE_TIMES, new FieldMetaData("inaccurateTimes", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29758i = unmodifiableMap;
        FieldMetaData.m61947a(MVTodShuttleTrip.class, unmodifiableMap);
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
        ((C25238b) f29757h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29757h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVTodShuttleTrip mVTodShuttleTrip = (MVTodShuttleTrip) obj;
        if (!getClass().equals(mVTodShuttleTrip.getClass())) {
            return getClass().getName().compareTo(mVTodShuttleTrip.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34032k()).compareTo(Boolean.valueOf(mVTodShuttleTrip.mo34032k()));
        if (compareTo != 0 || ((mo34032k() && (compareTo = this.tripId.compareTo(mVTodShuttleTrip.tripId)) != 0) || (compareTo = Boolean.valueOf(mo34031j()).compareTo(Boolean.valueOf(mVTodShuttleTrip.mo34031j()))) != 0 || ((mo34031j() && (compareTo = this.patternId.compareTo(mVTodShuttleTrip.patternId)) != 0) || (compareTo = Boolean.valueOf(mo34027g()).compareTo(Boolean.valueOf(mVTodShuttleTrip.mo34027g()))) != 0 || ((mo34027g() && (compareTo = C25082a.m62840d(this.departure, mVTodShuttleTrip.departure)) != 0) || (compareTo = Boolean.valueOf(mo34026f()).compareTo(Boolean.valueOf(mVTodShuttleTrip.mo34026f()))) != 0 || ((mo34026f() && (compareTo = C25082a.m62844h(this.arrivalsIntervals, mVTodShuttleTrip.arrivalsIntervals)) != 0) || (compareTo = Boolean.valueOf(mo34030i()).compareTo(Boolean.valueOf(mVTodShuttleTrip.mo34030i()))) != 0 || ((mo34030i() && (compareTo = C25082a.m62840d(this.lockTime, mVTodShuttleTrip.lockTime)) != 0) || (compareTo = Boolean.valueOf(mo34028h()).compareTo(Boolean.valueOf(mVTodShuttleTrip.mo34028h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo34028h() || (l = C25082a.m62848l(this.inaccurateTimes, mVTodShuttleTrip.inaccurateTimes)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodShuttleTrip)) {
            return false;
        }
        MVTodShuttleTrip mVTodShuttleTrip = (MVTodShuttleTrip) obj;
        boolean k = mo34032k();
        boolean k2 = mVTodShuttleTrip.mo34032k();
        if ((k || k2) && (!k || !k2 || !this.tripId.equals(mVTodShuttleTrip.tripId))) {
            return false;
        }
        boolean j = mo34031j();
        boolean j2 = mVTodShuttleTrip.mo34031j();
        if (((j || j2) && (!j || !j2 || !this.patternId.equals(mVTodShuttleTrip.patternId))) || this.departure != mVTodShuttleTrip.departure) {
            return false;
        }
        boolean f = mo34026f();
        boolean f2 = mVTodShuttleTrip.mo34026f();
        if ((f || f2) && (!f || !f2 || !this.arrivalsIntervals.equals(mVTodShuttleTrip.arrivalsIntervals))) {
            return false;
        }
        boolean i = mo34030i();
        boolean i2 = mVTodShuttleTrip.mo34030i();
        if ((i || i2) && (!i || !i2 || this.lockTime != mVTodShuttleTrip.lockTime)) {
            return false;
        }
        boolean h = mo34028h();
        boolean h2 = mVTodShuttleTrip.mo34028h();
        if ((h || h2) && (!h || !h2 || this.inaccurateTimes != mVTodShuttleTrip.inaccurateTimes)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34026f() {
        return this.arrivalsIntervals != null;
    }

    /* renamed from: g */
    public final boolean mo34027g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34028h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34030i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo34031j() {
        return this.patternId != null;
    }

    /* renamed from: k */
    public final boolean mo34032k() {
        return this.tripId != null;
    }

    /* renamed from: l */
    public final void mo34033l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo34034m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo34035o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodShuttleTrip(", "tripId:");
        String str = this.tripId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("patternId:");
        String str2 = this.patternId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("departure:");
        C25541a.m63889t(n, this.departure, ", ", "arrivalsIntervals:");
        List<Short> list = this.arrivalsIntervals;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo34030i()) {
            n.append(", ");
            n.append("lockTime:");
            n.append(this.lockTime);
        }
        if (mo34028h()) {
            n.append(", ");
            n.append("inaccurateTimes:");
            n.append(this.inaccurateTimes);
        }
        n.append(")");
        return n.toString();
    }
}
