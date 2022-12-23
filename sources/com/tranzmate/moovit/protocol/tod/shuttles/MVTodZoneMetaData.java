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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
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

public class MVTodZoneMetaData implements TBase<MVTodZoneMetaData, _Fields>, Serializable, Cloneable, Comparable<MVTodZoneMetaData> {

    /* renamed from: b */
    public static final C25113c f29795b = new C25113c("stops", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29796c = new C25113c("patterns", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f29797d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29798e;
    public List<MVTodShuttlePattern> patterns;
    public List<MVTodShuttleStop> stops;

    public enum _Fields implements C25085c {
        STOPS(1, "stops"),
        PATTERNS(2, "patterns");
        
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
                return STOPS;
            }
            if (i != 2) {
                return null;
            }
            return PATTERNS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneMetaData$a */
    public static class C11473a extends C25239c<MVTodZoneMetaData> {
        public C11473a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneMetaData mVTodZoneMetaData = (MVTodZoneMetaData) tBase;
            mVTodZoneMetaData.getClass();
            C25113c cVar = MVTodZoneMetaData.f29795b;
            gVar.mo61687K();
            if (mVTodZoneMetaData.stops != null) {
                gVar.mo61711x(MVTodZoneMetaData.f29795b);
                gVar.mo61680D(new C25119e((byte) 12, mVTodZoneMetaData.stops.size()));
                for (MVTodShuttleStop X0 : mVTodZoneMetaData.stops) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodZoneMetaData.patterns != null) {
                gVar.mo61711x(MVTodZoneMetaData.f29796c);
                gVar.mo61680D(new C25119e((byte) 12, mVTodZoneMetaData.patterns.size()));
                for (MVTodShuttlePattern X02 : mVTodZoneMetaData.patterns) {
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
            MVTodZoneMetaData mVTodZoneMetaData = (MVTodZoneMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodZoneMetaData.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVTodZoneMetaData.patterns = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            MVTodShuttlePattern mVTodShuttlePattern = new MVTodShuttlePattern();
                            mVTodShuttlePattern.mo25201C1(gVar);
                            mVTodZoneMetaData.patterns.add(mVTodShuttlePattern);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVTodZoneMetaData.stops = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVTodShuttleStop mVTodShuttleStop = new MVTodShuttleStop();
                        mVTodShuttleStop.mo25201C1(gVar);
                        mVTodZoneMetaData.stops.add(mVTodShuttleStop);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneMetaData$b */
    public static class C11474b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11473a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneMetaData$c */
    public static class C11475c extends C25240d<MVTodZoneMetaData> {
        public C11475c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneMetaData mVTodZoneMetaData = (MVTodZoneMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodZoneMetaData.mo34098g()) {
                bitSet.set(0);
            }
            if (mVTodZoneMetaData.mo34097f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodZoneMetaData.mo34098g()) {
                jVar.mo61678B(mVTodZoneMetaData.stops.size());
                for (MVTodShuttleStop X0 : mVTodZoneMetaData.stops) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTodZoneMetaData.mo34097f()) {
                jVar.mo61678B(mVTodZoneMetaData.patterns.size());
                for (MVTodShuttlePattern X02 : mVTodZoneMetaData.patterns) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodZoneMetaData mVTodZoneMetaData = (MVTodZoneMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVTodZoneMetaData.stops = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodShuttleStop mVTodShuttleStop = new MVTodShuttleStop();
                    mVTodShuttleStop.mo25201C1(jVar);
                    mVTodZoneMetaData.stops.add(mVTodShuttleStop);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVTodZoneMetaData.patterns = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVTodShuttlePattern mVTodShuttlePattern = new MVTodShuttlePattern();
                    mVTodShuttlePattern.mo25201C1(jVar);
                    mVTodZoneMetaData.patterns.add(mVTodShuttlePattern);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZoneMetaData$d */
    public static class C11476d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11475c(0);
        }
    }

    static {
        new C17394d0("MVTodZoneMetaData");
        HashMap hashMap = new HashMap();
        f29797d = hashMap;
        hashMap.put(C25239c.class, new C11474b());
        hashMap.put(C25240d.class, new C11476d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new ListMetaData(new StructMetaData(MVTodShuttleStop.class))));
        enumMap.put(_Fields.PATTERNS, new FieldMetaData("patterns", (byte) 3, new ListMetaData(new StructMetaData(MVTodShuttlePattern.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29798e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodZoneMetaData.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f29797d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29797d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34094a(MVTodZoneMetaData mVTodZoneMetaData) {
        if (mVTodZoneMetaData == null) {
            return false;
        }
        boolean g = mo34098g();
        boolean g2 = mVTodZoneMetaData.mo34098g();
        if ((g || g2) && (!g || !g2 || !this.stops.equals(mVTodZoneMetaData.stops))) {
            return false;
        }
        boolean f = mo34097f();
        boolean f2 = mVTodZoneMetaData.mo34097f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.patterns.equals(mVTodZoneMetaData.patterns)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVTodZoneMetaData mVTodZoneMetaData = (MVTodZoneMetaData) obj;
        if (!getClass().equals(mVTodZoneMetaData.getClass())) {
            return getClass().getName().compareTo(mVTodZoneMetaData.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34098g()).compareTo(Boolean.valueOf(mVTodZoneMetaData.mo34098g()));
        if (compareTo != 0 || ((mo34098g() && (compareTo = C25082a.m62844h(this.stops, mVTodZoneMetaData.stops)) != 0) || (compareTo = Boolean.valueOf(mo34097f()).compareTo(Boolean.valueOf(mVTodZoneMetaData.mo34097f()))) != 0)) {
            return compareTo;
        }
        if (!mo34097f() || (h = C25082a.m62844h(this.patterns, mVTodZoneMetaData.patterns)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodZoneMetaData)) {
            return mo34094a((MVTodZoneMetaData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34097f() {
        return this.patterns != null;
    }

    /* renamed from: g */
    public final boolean mo34098g() {
        return this.stops != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodZoneMetaData(", "stops:");
        List<MVTodShuttleStop> list = this.stops;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("patterns:");
        List<MVTodShuttlePattern> list2 = this.patterns;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
