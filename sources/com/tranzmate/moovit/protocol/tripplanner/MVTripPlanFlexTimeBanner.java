package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p001a0.C0016g;
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

public class MVTripPlanFlexTimeBanner implements TBase<MVTripPlanFlexTimeBanner, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanFlexTimeBanner> {

    /* renamed from: b */
    public static final C25113c f30084b = new C25113c("sectionId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30085c = new C25113c("estimatedSaveTime", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30086d = new C25113c("time", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f30087e = new C25113c("timeType", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f30088f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f30089g;
    private byte __isset_bitfield = 0;
    public int estimatedSaveTime;
    public int sectionId;
    public long time;
    public MVTimeType timeType;

    public enum _Fields implements C25085c {
        SECTION_ID(1, "sectionId"),
        ESTIMATED_SAVE_TIME(2, "estimatedSaveTime"),
        TIME(3, "time"),
        TIME_TYPE(4, "timeType");
        
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
                return SECTION_ID;
            }
            if (i == 2) {
                return ESTIMATED_SAVE_TIME;
            }
            if (i == 3) {
                return TIME;
            }
            if (i != 4) {
                return null;
            }
            return TIME_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanFlexTimeBanner$a */
    public static class C11643a extends C25239c<MVTripPlanFlexTimeBanner> {
        public C11643a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanFlexTimeBanner mVTripPlanFlexTimeBanner = (MVTripPlanFlexTimeBanner) tBase;
            mVTripPlanFlexTimeBanner.getClass();
            C25113c cVar = MVTripPlanFlexTimeBanner.f30084b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripPlanFlexTimeBanner.f30084b);
            gVar.mo61678B(mVTripPlanFlexTimeBanner.sectionId);
            gVar.mo61712y();
            gVar.mo61711x(MVTripPlanFlexTimeBanner.f30085c);
            gVar.mo61678B(mVTripPlanFlexTimeBanner.estimatedSaveTime);
            gVar.mo61712y();
            gVar.mo61711x(MVTripPlanFlexTimeBanner.f30086d);
            gVar.mo61679C(mVTripPlanFlexTimeBanner.time);
            gVar.mo61712y();
            if (mVTripPlanFlexTimeBanner.timeType != null) {
                gVar.mo61711x(MVTripPlanFlexTimeBanner.f30087e);
                gVar.mo61678B(mVTripPlanFlexTimeBanner.timeType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanFlexTimeBanner mVTripPlanFlexTimeBanner = (MVTripPlanFlexTimeBanner) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanFlexTimeBanner.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVTripPlanFlexTimeBanner.timeType = MVTimeType.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVTripPlanFlexTimeBanner.time = gVar.mo61697j();
                            mVTripPlanFlexTimeBanner.mo34609l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTripPlanFlexTimeBanner.estimatedSaveTime = gVar.mo61696i();
                        mVTripPlanFlexTimeBanner.mo34607j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripPlanFlexTimeBanner.sectionId = gVar.mo61696i();
                    mVTripPlanFlexTimeBanner.mo34608k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanFlexTimeBanner$b */
    public static class C11644b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11643a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanFlexTimeBanner$c */
    public static class C11645c extends C25240d<MVTripPlanFlexTimeBanner> {
        public C11645c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanFlexTimeBanner mVTripPlanFlexTimeBanner = (MVTripPlanFlexTimeBanner) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanFlexTimeBanner.mo34603g()) {
                bitSet.set(0);
            }
            if (mVTripPlanFlexTimeBanner.mo34602f()) {
                bitSet.set(1);
            }
            if (mVTripPlanFlexTimeBanner.mo34604h()) {
                bitSet.set(2);
            }
            if (mVTripPlanFlexTimeBanner.mo34606i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTripPlanFlexTimeBanner.mo34603g()) {
                jVar.mo61678B(mVTripPlanFlexTimeBanner.sectionId);
            }
            if (mVTripPlanFlexTimeBanner.mo34602f()) {
                jVar.mo61678B(mVTripPlanFlexTimeBanner.estimatedSaveTime);
            }
            if (mVTripPlanFlexTimeBanner.mo34604h()) {
                jVar.mo61679C(mVTripPlanFlexTimeBanner.time);
            }
            if (mVTripPlanFlexTimeBanner.mo34606i()) {
                jVar.mo61678B(mVTripPlanFlexTimeBanner.timeType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanFlexTimeBanner mVTripPlanFlexTimeBanner = (MVTripPlanFlexTimeBanner) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTripPlanFlexTimeBanner.sectionId = jVar.mo61696i();
                mVTripPlanFlexTimeBanner.mo34608k();
            }
            if (T.get(1)) {
                mVTripPlanFlexTimeBanner.estimatedSaveTime = jVar.mo61696i();
                mVTripPlanFlexTimeBanner.mo34607j();
            }
            if (T.get(2)) {
                mVTripPlanFlexTimeBanner.time = jVar.mo61697j();
                mVTripPlanFlexTimeBanner.mo34609l();
            }
            if (T.get(3)) {
                mVTripPlanFlexTimeBanner.timeType = MVTimeType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanFlexTimeBanner$d */
    public static class C11646d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11645c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanFlexTimeBanner");
        HashMap hashMap = new HashMap();
        f30088f = hashMap;
        hashMap.put(C25239c.class, new C11644b());
        hashMap.put(C25240d.class, new C11646d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SECTION_ID, new FieldMetaData("sectionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ESTIMATED_SAVE_TIME, new FieldMetaData("estimatedSaveTime", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TIME_TYPE, new FieldMetaData("timeType", (byte) 3, new EnumMetaData(MVTimeType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30089g = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanFlexTimeBanner.class, unmodifiableMap);
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
        ((C25238b) f30088f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30088f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanFlexTimeBanner mVTripPlanFlexTimeBanner = (MVTripPlanFlexTimeBanner) obj;
        if (!getClass().equals(mVTripPlanFlexTimeBanner.getClass())) {
            return getClass().getName().compareTo(mVTripPlanFlexTimeBanner.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34603g()).compareTo(Boolean.valueOf(mVTripPlanFlexTimeBanner.mo34603g()));
        if (compareTo2 != 0 || ((mo34603g() && (compareTo2 = C25082a.m62839c(this.sectionId, mVTripPlanFlexTimeBanner.sectionId)) != 0) || (compareTo2 = Boolean.valueOf(mo34602f()).compareTo(Boolean.valueOf(mVTripPlanFlexTimeBanner.mo34602f()))) != 0 || ((mo34602f() && (compareTo2 = C25082a.m62839c(this.estimatedSaveTime, mVTripPlanFlexTimeBanner.estimatedSaveTime)) != 0) || (compareTo2 = Boolean.valueOf(mo34604h()).compareTo(Boolean.valueOf(mVTripPlanFlexTimeBanner.mo34604h()))) != 0 || ((mo34604h() && (compareTo2 = C25082a.m62840d(this.time, mVTripPlanFlexTimeBanner.time)) != 0) || (compareTo2 = Boolean.valueOf(mo34606i()).compareTo(Boolean.valueOf(mVTripPlanFlexTimeBanner.mo34606i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo34606i() || (compareTo = this.timeType.compareTo(mVTripPlanFlexTimeBanner.timeType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPlanFlexTimeBanner)) {
            return false;
        }
        MVTripPlanFlexTimeBanner mVTripPlanFlexTimeBanner = (MVTripPlanFlexTimeBanner) obj;
        if (this.sectionId != mVTripPlanFlexTimeBanner.sectionId || this.estimatedSaveTime != mVTripPlanFlexTimeBanner.estimatedSaveTime || this.time != mVTripPlanFlexTimeBanner.time) {
            return false;
        }
        boolean i = mo34606i();
        boolean i2 = mVTripPlanFlexTimeBanner.mo34606i();
        if ((i || i2) && (!i || !i2 || !this.timeType.equals(mVTripPlanFlexTimeBanner.timeType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34602f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo34603g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34604h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34606i() {
        return this.timeType != null;
    }

    /* renamed from: j */
    public final void mo34607j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo34608k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo34609l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanFlexTimeBanner(", "sectionId:");
        C0016g.m42z(n, this.sectionId, ", ", "estimatedSaveTime:");
        C0016g.m42z(n, this.estimatedSaveTime, ", ", "time:");
        C25541a.m63889t(n, this.time, ", ", "timeType:");
        MVTimeType mVTimeType = this.timeType;
        if (mVTimeType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTimeType);
        }
        n.append(")");
        return n.toString();
    }
}
