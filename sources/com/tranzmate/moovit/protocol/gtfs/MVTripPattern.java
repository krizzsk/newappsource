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

public class MVTripPattern implements TBase<MVTripPattern, _Fields>, Serializable, Cloneable, Comparable<MVTripPattern> {

    /* renamed from: b */
    public static final C25113c f25847b = new C25113c("tripPatternId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25848c = new C25113c("stopIds", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f25849d = new C25113c("stopNames", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f25850e = new C25113c("shapeId", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f25851f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25852g;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.SHAPE_ID};
    public int shapeId;
    public List<Integer> stopIds;
    public List<String> stopNames;
    public int tripPatternId;

    public enum _Fields implements C25085c {
        TRIP_PATTERN_ID(1, "tripPatternId"),
        STOP_IDS(2, "stopIds"),
        STOP_NAMES(3, "stopNames"),
        SHAPE_ID(4, "shapeId");
        
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
                return TRIP_PATTERN_ID;
            }
            if (i == 2) {
                return STOP_IDS;
            }
            if (i == 3) {
                return STOP_NAMES;
            }
            if (i != 4) {
                return null;
            }
            return SHAPE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripPattern$a */
    public static class C8863a extends C25239c<MVTripPattern> {
        public C8863a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPattern mVTripPattern = (MVTripPattern) tBase;
            mVTripPattern.getClass();
            C25113c cVar = MVTripPattern.f25847b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripPattern.f25847b);
            gVar.mo61678B(mVTripPattern.tripPatternId);
            gVar.mo61712y();
            if (mVTripPattern.stopIds != null) {
                gVar.mo61711x(MVTripPattern.f25848c);
                gVar.mo61680D(new C25119e((byte) 8, mVTripPattern.stopIds.size()));
                for (Integer intValue : mVTripPattern.stopIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTripPattern.stopNames != null) {
                gVar.mo61711x(MVTripPattern.f25849d);
                gVar.mo61680D(new C25119e((byte) 11, mVTripPattern.stopNames.size()));
                for (String J : mVTripPattern.stopNames) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTripPattern.mo27601f()) {
                gVar.mo61711x(MVTripPattern.f25850e);
                gVar.mo61678B(mVTripPattern.shapeId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPattern mVTripPattern = (MVTripPattern) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPattern.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    int i = 0;
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVTripPattern.shapeId = gVar.mo61696i();
                                mVTripPattern.mo27606j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVTripPattern.stopNames = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                mVTripPattern.stopNames.add(gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k2 = gVar.mo61698k();
                        mVTripPattern.stopIds = new ArrayList(k2.f63395b);
                        while (i < k2.f63395b) {
                            i = C13437d.m33701f(gVar.mo61696i(), mVTripPattern.stopIds, i, 1);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripPattern.tripPatternId = gVar.mo61696i();
                    mVTripPattern.mo27607k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripPattern$b */
    public static class C8864b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8863a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripPattern$c */
    public static class C8865c extends C25240d<MVTripPattern> {
        public C8865c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPattern mVTripPattern = (MVTripPattern) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPattern.mo27605i()) {
                bitSet.set(0);
            }
            if (mVTripPattern.mo27602g()) {
                bitSet.set(1);
            }
            if (mVTripPattern.mo27603h()) {
                bitSet.set(2);
            }
            if (mVTripPattern.mo27601f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTripPattern.mo27605i()) {
                jVar.mo61678B(mVTripPattern.tripPatternId);
            }
            if (mVTripPattern.mo27602g()) {
                jVar.mo61678B(mVTripPattern.stopIds.size());
                for (Integer intValue : mVTripPattern.stopIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVTripPattern.mo27603h()) {
                jVar.mo61678B(mVTripPattern.stopNames.size());
                for (String J : mVTripPattern.stopNames) {
                    jVar.mo61686J(J);
                }
            }
            if (mVTripPattern.mo27601f()) {
                jVar.mo61678B(mVTripPattern.shapeId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPattern mVTripPattern = (MVTripPattern) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTripPattern.tripPatternId = jVar.mo61696i();
                mVTripPattern.mo27607k();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVTripPattern.stopIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVTripPattern.stopIds, i2, 1)) {
                }
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVTripPattern.stopNames = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVTripPattern.stopNames.add(jVar.mo61704q());
                }
            }
            if (T.get(3)) {
                mVTripPattern.shapeId = jVar.mo61696i();
                mVTripPattern.mo27606j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripPattern$d */
    public static class C8866d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8865c(0);
        }
    }

    static {
        new C17394d0("MVTripPattern");
        HashMap hashMap = new HashMap();
        f25851f = hashMap;
        hashMap.put(C25239c.class, new C8864b());
        hashMap.put(C25240d.class, new C8866d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_PATTERN_ID, new FieldMetaData("tripPatternId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_IDS, new FieldMetaData("stopIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.STOP_NAMES, new FieldMetaData("stopNames", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.SHAPE_ID, new FieldMetaData("shapeId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25852g = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPattern.class, unmodifiableMap);
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
        ((C25238b) f25851f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25851f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVTripPattern mVTripPattern = (MVTripPattern) obj;
        if (!getClass().equals(mVTripPattern.getClass())) {
            return getClass().getName().compareTo(mVTripPattern.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27605i()).compareTo(Boolean.valueOf(mVTripPattern.mo27605i()));
        if (compareTo != 0 || ((mo27605i() && (compareTo = C25082a.m62839c(this.tripPatternId, mVTripPattern.tripPatternId)) != 0) || (compareTo = Boolean.valueOf(mo27602g()).compareTo(Boolean.valueOf(mVTripPattern.mo27602g()))) != 0 || ((mo27602g() && (compareTo = C25082a.m62844h(this.stopIds, mVTripPattern.stopIds)) != 0) || (compareTo = Boolean.valueOf(mo27603h()).compareTo(Boolean.valueOf(mVTripPattern.mo27603h()))) != 0 || ((mo27603h() && (compareTo = C25082a.m62844h(this.stopNames, mVTripPattern.stopNames)) != 0) || (compareTo = Boolean.valueOf(mo27601f()).compareTo(Boolean.valueOf(mVTripPattern.mo27601f()))) != 0)))) {
            return compareTo;
        }
        if (!mo27601f() || (c = C25082a.m62839c(this.shapeId, mVTripPattern.shapeId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPattern)) {
            return false;
        }
        MVTripPattern mVTripPattern = (MVTripPattern) obj;
        if (this.tripPatternId != mVTripPattern.tripPatternId) {
            return false;
        }
        boolean g = mo27602g();
        boolean g2 = mVTripPattern.mo27602g();
        if ((g || g2) && (!g || !g2 || !this.stopIds.equals(mVTripPattern.stopIds))) {
            return false;
        }
        boolean h = mo27603h();
        boolean h2 = mVTripPattern.mo27603h();
        if ((h || h2) && (!h || !h2 || !this.stopNames.equals(mVTripPattern.stopNames))) {
            return false;
        }
        boolean f = mo27601f();
        boolean f2 = mVTripPattern.mo27601f();
        if ((f || f2) && (!f || !f2 || this.shapeId != mVTripPattern.shapeId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27601f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27602g() {
        return this.stopIds != null;
    }

    /* renamed from: h */
    public final boolean mo27603h() {
        return this.stopNames != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27605i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo27606j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo27607k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPattern(", "tripPatternId:");
        C0016g.m42z(n, this.tripPatternId, ", ", "stopIds:");
        List<Integer> list = this.stopIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("stopNames:");
        List<String> list2 = this.stopNames;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        if (mo27601f()) {
            n.append(", ");
            n.append("shapeId:");
            n.append(this.shapeId);
        }
        n.append(")");
        return n.toString();
    }
}
