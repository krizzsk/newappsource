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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVTodZoneDaySchedule implements TBase<MVTodZoneDaySchedule, _Fields>, Serializable, Cloneable, Comparable<MVTodZoneDaySchedule> {

    /* renamed from: b */
    public static final C25113c f29791b = new C25113c("day", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f29792c = new C25113c("trips", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f29793d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29794e;
    private byte __isset_bitfield = 0;
    public long day;
    public List<MVTodShuttleTrip> trips;

    public enum _Fields implements C25085c {
        DAY(1, "day"),
        TRIPS(2, "trips");
        
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
                return DAY;
            }
            if (i != 2) {
                return null;
            }
            return TRIPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneDaySchedule$a */
    public static class C11469a extends C25239c<MVTodZoneDaySchedule> {
        public C11469a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneDaySchedule mVTodZoneDaySchedule = (MVTodZoneDaySchedule) tBase;
            mVTodZoneDaySchedule.getClass();
            C25113c cVar = MVTodZoneDaySchedule.f29791b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodZoneDaySchedule.f29791b);
            gVar.mo61679C(mVTodZoneDaySchedule.day);
            gVar.mo61712y();
            if (mVTodZoneDaySchedule.trips != null) {
                gVar.mo61711x(MVTodZoneDaySchedule.f29792c);
                gVar.mo61680D(new C25119e((byte) 12, mVTodZoneDaySchedule.trips.size()));
                for (MVTodShuttleTrip X0 : mVTodZoneDaySchedule.trips) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneDaySchedule mVTodZoneDaySchedule = (MVTodZoneDaySchedule) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodZoneDaySchedule.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVTodZoneDaySchedule.trips = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVTodShuttleTrip mVTodShuttleTrip = new MVTodShuttleTrip();
                            mVTodShuttleTrip.mo25201C1(gVar);
                            mVTodZoneDaySchedule.trips.add(mVTodShuttleTrip);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVTodZoneDaySchedule.day = gVar.mo61697j();
                    mVTodZoneDaySchedule.mo34090h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneDaySchedule$b */
    public static class C11470b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11469a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneDaySchedule$c */
    public static class C11471c extends C25240d<MVTodZoneDaySchedule> {
        public C11471c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneDaySchedule mVTodZoneDaySchedule = (MVTodZoneDaySchedule) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodZoneDaySchedule.mo34088f()) {
                bitSet.set(0);
            }
            if (mVTodZoneDaySchedule.mo34089g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodZoneDaySchedule.mo34088f()) {
                jVar.mo61679C(mVTodZoneDaySchedule.day);
            }
            if (mVTodZoneDaySchedule.mo34089g()) {
                jVar.mo61678B(mVTodZoneDaySchedule.trips.size());
                for (MVTodShuttleTrip X0 : mVTodZoneDaySchedule.trips) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneDaySchedule mVTodZoneDaySchedule = (MVTodZoneDaySchedule) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodZoneDaySchedule.day = jVar.mo61697j();
                mVTodZoneDaySchedule.mo34090h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVTodZoneDaySchedule.trips = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodShuttleTrip mVTodShuttleTrip = new MVTodShuttleTrip();
                    mVTodShuttleTrip.mo25201C1(jVar);
                    mVTodZoneDaySchedule.trips.add(mVTodShuttleTrip);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneDaySchedule$d */
    public static class C11472d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11471c(0);
        }
    }

    static {
        new C17394d0("MVTodZoneDaySchedule");
        HashMap hashMap = new HashMap();
        f29793d = hashMap;
        hashMap.put(C25239c.class, new C11470b());
        hashMap.put(C25240d.class, new C11472d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DAY, new FieldMetaData("day", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TRIPS, new FieldMetaData("trips", (byte) 3, new ListMetaData(new StructMetaData(MVTodShuttleTrip.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29794e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodZoneDaySchedule.class, unmodifiableMap);
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
        ((C25238b) f29793d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29793d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTodZoneDaySchedule mVTodZoneDaySchedule = (MVTodZoneDaySchedule) obj;
        if (!getClass().equals(mVTodZoneDaySchedule.getClass())) {
            return getClass().getName().compareTo(mVTodZoneDaySchedule.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34088f()).compareTo(Boolean.valueOf(mVTodZoneDaySchedule.mo34088f()));
        if (compareTo != 0 || ((mo34088f() && (compareTo = C25082a.m62840d(this.day, mVTodZoneDaySchedule.day)) != 0) || (compareTo = Boolean.valueOf(mo34089g()).compareTo(Boolean.valueOf(mVTodZoneDaySchedule.mo34089g()))) != 0)) {
            return compareTo;
        }
        if (!mo34089g() || (h = C25082a.m62844h(this.trips, mVTodZoneDaySchedule.trips)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodZoneDaySchedule)) {
            return false;
        }
        MVTodZoneDaySchedule mVTodZoneDaySchedule = (MVTodZoneDaySchedule) obj;
        if (this.day != mVTodZoneDaySchedule.day) {
            return false;
        }
        boolean g = mo34089g();
        boolean g2 = mVTodZoneDaySchedule.mo34089g();
        if ((g || g2) && (!g || !g2 || !this.trips.equals(mVTodZoneDaySchedule.trips))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34088f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34089g() {
        return this.trips != null;
    }

    /* renamed from: h */
    public final void mo34090h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodZoneDaySchedule(", "day:");
        C25541a.m63889t(n, this.day, ", ", "trips:");
        List<MVTodShuttleTrip> list = this.trips;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
