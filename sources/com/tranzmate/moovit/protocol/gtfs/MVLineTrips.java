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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVLineTrips implements TBase<MVLineTrips, _Fields>, Serializable, Cloneable, Comparable<MVLineTrips> {

    /* renamed from: b */
    public static final C25113c f25735b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25736c = new C25113c("tripGroups", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f25737d = new C25113c("tripIntervals", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f25738e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25739f;
    private byte __isset_bitfield = 0;
    public int lineId;
    public List<MVTripGroup> tripGroups;
    public List<MVTripIntervals> tripIntervals;

    public enum _Fields implements C25085c {
        LINE_ID(1, "lineId"),
        TRIP_GROUPS(2, "tripGroups"),
        TRIP_INTERVALS(3, "tripIntervals");
        
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
                return LINE_ID;
            }
            if (i == 2) {
                return TRIP_GROUPS;
            }
            if (i != 3) {
                return null;
            }
            return TRIP_INTERVALS;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineTrips$a */
    public static class C8795a extends C25239c<MVLineTrips> {
        public C8795a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineTrips mVLineTrips = (MVLineTrips) tBase;
            mVLineTrips.getClass();
            C25113c cVar = MVLineTrips.f25735b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineTrips.f25735b);
            gVar.mo61678B(mVLineTrips.lineId);
            gVar.mo61712y();
            if (mVLineTrips.tripGroups != null) {
                gVar.mo61711x(MVLineTrips.f25736c);
                gVar.mo61680D(new C25119e((byte) 12, mVLineTrips.tripGroups.size()));
                for (MVTripGroup X0 : mVLineTrips.tripGroups) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineTrips.tripIntervals != null) {
                gVar.mo61711x(MVLineTrips.f25737d);
                gVar.mo61680D(new C25119e((byte) 12, mVLineTrips.tripIntervals.size()));
                for (MVTripIntervals X02 : mVLineTrips.tripIntervals) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineTrips mVLineTrips = (MVLineTrips) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineTrips.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    int i = 0;
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVLineTrips.tripIntervals = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVTripIntervals mVTripIntervals = new MVTripIntervals();
                                mVTripIntervals.mo25201C1(gVar);
                                mVLineTrips.tripIntervals.add(mVTripIntervals);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k2 = gVar.mo61698k();
                        mVLineTrips.tripGroups = new ArrayList(k2.f63395b);
                        while (i < k2.f63395b) {
                            MVTripGroup mVTripGroup = new MVTripGroup();
                            mVTripGroup.mo25201C1(gVar);
                            mVLineTrips.tripGroups.add(mVTripGroup);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLineTrips.lineId = gVar.mo61696i();
                    mVLineTrips.mo27410i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineTrips$b */
    public static class C8796b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8795a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineTrips$c */
    public static class C8797c extends C25240d<MVLineTrips> {
        public C8797c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineTrips mVLineTrips = (MVLineTrips) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineTrips.mo27406f()) {
                bitSet.set(0);
            }
            if (mVLineTrips.mo27407g()) {
                bitSet.set(1);
            }
            if (mVLineTrips.mo27408h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVLineTrips.mo27406f()) {
                jVar.mo61678B(mVLineTrips.lineId);
            }
            if (mVLineTrips.mo27407g()) {
                jVar.mo61678B(mVLineTrips.tripGroups.size());
                for (MVTripGroup X0 : mVLineTrips.tripGroups) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVLineTrips.mo27408h()) {
                jVar.mo61678B(mVLineTrips.tripIntervals.size());
                for (MVTripIntervals X02 : mVLineTrips.tripIntervals) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineTrips mVLineTrips = (MVLineTrips) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVLineTrips.lineId = jVar.mo61696i();
                mVLineTrips.mo27410i();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVLineTrips.tripGroups = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTripGroup mVTripGroup = new MVTripGroup();
                    mVTripGroup.mo25201C1(jVar);
                    mVLineTrips.tripGroups.add(mVTripGroup);
                }
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVLineTrips.tripIntervals = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVTripIntervals mVTripIntervals = new MVTripIntervals();
                    mVTripIntervals.mo25201C1(jVar);
                    mVLineTrips.tripIntervals.add(mVTripIntervals);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVLineTrips$d */
    public static class C8798d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8797c(0);
        }
    }

    static {
        new C17394d0("MVLineTrips");
        HashMap hashMap = new HashMap();
        f25738e = hashMap;
        hashMap.put(C25239c.class, new C8796b());
        hashMap.put(C25240d.class, new C8798d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRIP_GROUPS, new FieldMetaData("tripGroups", (byte) 3, new ListMetaData(new StructMetaData(MVTripGroup.class))));
        enumMap.put(_Fields.TRIP_INTERVALS, new FieldMetaData("tripIntervals", (byte) 3, new ListMetaData(new StructMetaData(MVTripIntervals.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25739f = unmodifiableMap;
        FieldMetaData.m61947a(MVLineTrips.class, unmodifiableMap);
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
        ((C25238b) f25738e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25738e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVLineTrips mVLineTrips = (MVLineTrips) obj;
        if (!getClass().equals(mVLineTrips.getClass())) {
            return getClass().getName().compareTo(mVLineTrips.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27406f()).compareTo(Boolean.valueOf(mVLineTrips.mo27406f()));
        if (compareTo != 0 || ((mo27406f() && (compareTo = C25082a.m62839c(this.lineId, mVLineTrips.lineId)) != 0) || (compareTo = Boolean.valueOf(mo27407g()).compareTo(Boolean.valueOf(mVLineTrips.mo27407g()))) != 0 || ((mo27407g() && (compareTo = C25082a.m62844h(this.tripGroups, mVLineTrips.tripGroups)) != 0) || (compareTo = Boolean.valueOf(mo27408h()).compareTo(Boolean.valueOf(mVLineTrips.mo27408h()))) != 0))) {
            return compareTo;
        }
        if (!mo27408h() || (h = C25082a.m62844h(this.tripIntervals, mVLineTrips.tripIntervals)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineTrips)) {
            return false;
        }
        MVLineTrips mVLineTrips = (MVLineTrips) obj;
        if (this.lineId != mVLineTrips.lineId) {
            return false;
        }
        boolean g = mo27407g();
        boolean g2 = mVLineTrips.mo27407g();
        if ((g || g2) && (!g || !g2 || !this.tripGroups.equals(mVLineTrips.tripGroups))) {
            return false;
        }
        boolean h = mo27408h();
        boolean h2 = mVLineTrips.mo27408h();
        if ((h || h2) && (!h || !h2 || !this.tripIntervals.equals(mVLineTrips.tripIntervals))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27406f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27407g() {
        return this.tripGroups != null;
    }

    /* renamed from: h */
    public final boolean mo27408h() {
        return this.tripIntervals != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27410i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineTrips(", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "tripGroups:");
        List<MVTripGroup> list = this.tripGroups;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("tripIntervals:");
        List<MVTripIntervals> list2 = this.tripIntervals;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
