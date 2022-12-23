package com.tranzmate.moovit.protocol.tod.shuttles;

import com.appboy.support.StringUtils;
import com.google.ads.mediation.unity.UnityMediationAdapter;
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

public class MVTodZone implements TBase<MVTodZone, _Fields>, Serializable, Cloneable, Comparable<MVTodZone> {

    /* renamed from: b */
    public static final C25113c f29785b = new C25113c(UnityMediationAdapter.KEY_PLACEMENT_ID, (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29786c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29787d = new C25113c("metadata", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29788e = new C25113c("daySchedules", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f29789f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29790g;
    private byte __isset_bitfield = 0;
    public List<MVTodZoneDaySchedule> daySchedules;
    public MVTodZoneMetaData metadata;
    public String name;
    public int zoneId;

    public enum _Fields implements C25085c {
        ZONE_ID(1, UnityMediationAdapter.KEY_PLACEMENT_ID),
        NAME(2, "name"),
        METADATA(3, "metadata"),
        DAY_SCHEDULES(4, "daySchedules");
        
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
                return ZONE_ID;
            }
            if (i == 2) {
                return NAME;
            }
            if (i == 3) {
                return METADATA;
            }
            if (i != 4) {
                return null;
            }
            return DAY_SCHEDULES;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZone$a */
    public static class C11465a extends C25239c<MVTodZone> {
        public C11465a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodZone mVTodZone = (MVTodZone) tBase;
            MVTodZoneMetaData mVTodZoneMetaData = mVTodZone.metadata;
            C25113c cVar = MVTodZone.f29785b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodZone.f29785b);
            gVar.mo61678B(mVTodZone.zoneId);
            gVar.mo61712y();
            if (mVTodZone.name != null) {
                gVar.mo61711x(MVTodZone.f29786c);
                gVar.mo61686J(mVTodZone.name);
                gVar.mo61712y();
            }
            if (mVTodZone.metadata != null) {
                gVar.mo61711x(MVTodZone.f29787d);
                mVTodZone.metadata.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodZone.daySchedules != null) {
                gVar.mo61711x(MVTodZone.f29788e);
                gVar.mo61680D(new C25119e((byte) 12, mVTodZone.daySchedules.size()));
                for (MVTodZoneDaySchedule X0 : mVTodZone.daySchedules) {
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
            MVTodZone mVTodZone = (MVTodZone) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTodZoneMetaData mVTodZoneMetaData = mVTodZone.metadata;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVTodZone.daySchedules = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVTodZoneDaySchedule mVTodZoneDaySchedule = new MVTodZoneDaySchedule();
                                    mVTodZoneDaySchedule.mo25201C1(gVar);
                                    mVTodZone.daySchedules.add(mVTodZoneDaySchedule);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTodZoneMetaData mVTodZoneMetaData2 = new MVTodZoneMetaData();
                            mVTodZone.metadata = mVTodZoneMetaData2;
                            mVTodZoneMetaData2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodZone.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTodZone.zoneId = gVar.mo61696i();
                    mVTodZone.mo34083j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZone$b */
    public static class C11466b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11465a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZone$c */
    public static class C11467c extends C25240d<MVTodZone> {
        public C11467c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodZone mVTodZone = (MVTodZone) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodZone.mo34082i()) {
                bitSet.set(0);
            }
            if (mVTodZone.mo34080h()) {
                bitSet.set(1);
            }
            if (mVTodZone.mo34079g()) {
                bitSet.set(2);
            }
            if (mVTodZone.mo34078f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodZone.mo34082i()) {
                jVar.mo61678B(mVTodZone.zoneId);
            }
            if (mVTodZone.mo34080h()) {
                jVar.mo61686J(mVTodZone.name);
            }
            if (mVTodZone.mo34079g()) {
                mVTodZone.metadata.mo25202X0(jVar);
            }
            if (mVTodZone.mo34078f()) {
                jVar.mo61678B(mVTodZone.daySchedules.size());
                for (MVTodZoneDaySchedule X0 : mVTodZone.daySchedules) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodZone mVTodZone = (MVTodZone) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTodZone.zoneId = jVar.mo61696i();
                mVTodZone.mo34083j();
            }
            if (T.get(1)) {
                mVTodZone.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTodZoneMetaData mVTodZoneMetaData = new MVTodZoneMetaData();
                mVTodZone.metadata = mVTodZoneMetaData;
                mVTodZoneMetaData.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVTodZone.daySchedules = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodZoneDaySchedule mVTodZoneDaySchedule = new MVTodZoneDaySchedule();
                    mVTodZoneDaySchedule.mo25201C1(jVar);
                    mVTodZone.daySchedules.add(mVTodZoneDaySchedule);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodZone$d */
    public static class C11468d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11467c(0);
        }
    }

    static {
        new C17394d0("MVTodZone");
        HashMap hashMap = new HashMap();
        f29789f = hashMap;
        hashMap.put(C25239c.class, new C11466b());
        hashMap.put(C25240d.class, new C11468d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ZONE_ID, new FieldMetaData(UnityMediationAdapter.KEY_PLACEMENT_ID, (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.METADATA, new FieldMetaData("metadata", (byte) 3, new StructMetaData(MVTodZoneMetaData.class)));
        enumMap.put(_Fields.DAY_SCHEDULES, new FieldMetaData("daySchedules", (byte) 3, new ListMetaData(new StructMetaData(MVTodZoneDaySchedule.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29790g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodZone.class, unmodifiableMap);
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
        ((C25238b) f29789f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29789f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTodZone mVTodZone = (MVTodZone) obj;
        if (!getClass().equals(mVTodZone.getClass())) {
            return getClass().getName().compareTo(mVTodZone.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34082i()).compareTo(Boolean.valueOf(mVTodZone.mo34082i()));
        if (compareTo != 0 || ((mo34082i() && (compareTo = C25082a.m62839c(this.zoneId, mVTodZone.zoneId)) != 0) || (compareTo = Boolean.valueOf(mo34080h()).compareTo(Boolean.valueOf(mVTodZone.mo34080h()))) != 0 || ((mo34080h() && (compareTo = this.name.compareTo(mVTodZone.name)) != 0) || (compareTo = Boolean.valueOf(mo34079g()).compareTo(Boolean.valueOf(mVTodZone.mo34079g()))) != 0 || ((mo34079g() && (compareTo = this.metadata.compareTo(mVTodZone.metadata)) != 0) || (compareTo = Boolean.valueOf(mo34078f()).compareTo(Boolean.valueOf(mVTodZone.mo34078f()))) != 0)))) {
            return compareTo;
        }
        if (!mo34078f() || (h = C25082a.m62844h(this.daySchedules, mVTodZone.daySchedules)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodZone)) {
            return false;
        }
        MVTodZone mVTodZone = (MVTodZone) obj;
        if (this.zoneId != mVTodZone.zoneId) {
            return false;
        }
        boolean h = mo34080h();
        boolean h2 = mVTodZone.mo34080h();
        if ((h || h2) && (!h || !h2 || !this.name.equals(mVTodZone.name))) {
            return false;
        }
        boolean g = mo34079g();
        boolean g2 = mVTodZone.mo34079g();
        if ((g || g2) && (!g || !g2 || !this.metadata.mo34094a(mVTodZone.metadata))) {
            return false;
        }
        boolean f = mo34078f();
        boolean f2 = mVTodZone.mo34078f();
        if ((f || f2) && (!f || !f2 || !this.daySchedules.equals(mVTodZone.daySchedules))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34078f() {
        return this.daySchedules != null;
    }

    /* renamed from: g */
    public final boolean mo34079g() {
        return this.metadata != null;
    }

    /* renamed from: h */
    public final boolean mo34080h() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34082i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo34083j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodZone(", "zoneId:");
        C0016g.m42z(n, this.zoneId, ", ", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("metadata:");
        MVTodZoneMetaData mVTodZoneMetaData = this.metadata;
        if (mVTodZoneMetaData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodZoneMetaData);
        }
        n.append(", ");
        n.append("daySchedules:");
        List<MVTodZoneDaySchedule> list = this.daySchedules;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
