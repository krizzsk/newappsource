package com.tranzmate.moovit.protocol.metrics;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p001a0.C0016g;
import p001a0.C0017h;
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

public class MVDeviceTimeZone implements TBase<MVDeviceTimeZone, _Fields>, Serializable, Cloneable, Comparable<MVDeviceTimeZone> {

    /* renamed from: b */
    public static final C25113c f26376b = new C25113c("timeZoneId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26377c = new C25113c("timeZoneName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26378d = new C25113c("timeZoneRawOffset", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26379e = new C25113c("timeZoneInDaylightTime", (byte) 2, 4);

    /* renamed from: f */
    public static final HashMap f26380f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26381g;
    private byte __isset_bitfield = 0;
    public String timeZoneId;
    public boolean timeZoneInDaylightTime;
    public String timeZoneName;
    public int timeZoneRawOffset;

    public enum _Fields implements C25085c {
        TIME_ZONE_ID(1, "timeZoneId"),
        TIME_ZONE_NAME(2, "timeZoneName"),
        TIME_ZONE_RAW_OFFSET(3, "timeZoneRawOffset"),
        TIME_ZONE_IN_DAYLIGHT_TIME(4, "timeZoneInDaylightTime");
        
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
                return TIME_ZONE_ID;
            }
            if (i == 2) {
                return TIME_ZONE_NAME;
            }
            if (i == 3) {
                return TIME_ZONE_RAW_OFFSET;
            }
            if (i != 4) {
                return null;
            }
            return TIME_ZONE_IN_DAYLIGHT_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDeviceTimeZone$a */
    public static class C9130a extends C25239c<MVDeviceTimeZone> {
        public C9130a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeviceTimeZone mVDeviceTimeZone = (MVDeviceTimeZone) tBase;
            mVDeviceTimeZone.getClass();
            C25113c cVar = MVDeviceTimeZone.f26376b;
            gVar.mo61687K();
            if (mVDeviceTimeZone.timeZoneId != null) {
                gVar.mo61711x(MVDeviceTimeZone.f26376b);
                gVar.mo61686J(mVDeviceTimeZone.timeZoneId);
                gVar.mo61712y();
            }
            if (mVDeviceTimeZone.timeZoneName != null) {
                gVar.mo61711x(MVDeviceTimeZone.f26377c);
                gVar.mo61686J(mVDeviceTimeZone.timeZoneName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDeviceTimeZone.f26378d);
            gVar.mo61678B(mVDeviceTimeZone.timeZoneRawOffset);
            gVar.mo61712y();
            gVar.mo61711x(MVDeviceTimeZone.f26379e);
            C0017h.m62S(gVar, mVDeviceTimeZone.timeZoneInDaylightTime);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeviceTimeZone mVDeviceTimeZone = (MVDeviceTimeZone) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDeviceTimeZone.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 2) {
                                mVDeviceTimeZone.timeZoneInDaylightTime = gVar.mo61690c();
                                mVDeviceTimeZone.mo28438j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVDeviceTimeZone.timeZoneRawOffset = gVar.mo61696i();
                            mVDeviceTimeZone.mo28439k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVDeviceTimeZone.timeZoneName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVDeviceTimeZone.timeZoneId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDeviceTimeZone$b */
    public static class C9131b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9130a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDeviceTimeZone$c */
    public static class C9132c extends C25240d<MVDeviceTimeZone> {
        public C9132c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeviceTimeZone mVDeviceTimeZone = (MVDeviceTimeZone) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDeviceTimeZone.mo28433f()) {
                bitSet.set(0);
            }
            if (mVDeviceTimeZone.mo28435h()) {
                bitSet.set(1);
            }
            if (mVDeviceTimeZone.mo28437i()) {
                bitSet.set(2);
            }
            if (mVDeviceTimeZone.mo28434g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVDeviceTimeZone.mo28433f()) {
                jVar.mo61686J(mVDeviceTimeZone.timeZoneId);
            }
            if (mVDeviceTimeZone.mo28435h()) {
                jVar.mo61686J(mVDeviceTimeZone.timeZoneName);
            }
            if (mVDeviceTimeZone.mo28437i()) {
                jVar.mo61678B(mVDeviceTimeZone.timeZoneRawOffset);
            }
            if (mVDeviceTimeZone.mo28434g()) {
                jVar.mo61708u(mVDeviceTimeZone.timeZoneInDaylightTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeviceTimeZone mVDeviceTimeZone = (MVDeviceTimeZone) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVDeviceTimeZone.timeZoneId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDeviceTimeZone.timeZoneName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVDeviceTimeZone.timeZoneRawOffset = jVar.mo61696i();
                mVDeviceTimeZone.mo28439k();
            }
            if (T.get(3)) {
                mVDeviceTimeZone.timeZoneInDaylightTime = jVar.mo61690c();
                mVDeviceTimeZone.mo28438j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDeviceTimeZone$d */
    public static class C9133d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9132c(0);
        }
    }

    static {
        new C17394d0("MVDeviceTimeZone");
        HashMap hashMap = new HashMap();
        f26380f = hashMap;
        hashMap.put(C25239c.class, new C9131b());
        hashMap.put(C25240d.class, new C9133d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME_ZONE_ID, new FieldMetaData("timeZoneId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TIME_ZONE_NAME, new FieldMetaData("timeZoneName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TIME_ZONE_RAW_OFFSET, new FieldMetaData("timeZoneRawOffset", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIME_ZONE_IN_DAYLIGHT_TIME, new FieldMetaData("timeZoneInDaylightTime", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26381g = unmodifiableMap;
        FieldMetaData.m61947a(MVDeviceTimeZone.class, unmodifiableMap);
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
        ((C25238b) f26380f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26380f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28430a(MVDeviceTimeZone mVDeviceTimeZone) {
        if (mVDeviceTimeZone == null) {
            return false;
        }
        boolean f = mo28433f();
        boolean f2 = mVDeviceTimeZone.mo28433f();
        if ((f || f2) && (!f || !f2 || !this.timeZoneId.equals(mVDeviceTimeZone.timeZoneId))) {
            return false;
        }
        boolean h = mo28435h();
        boolean h2 = mVDeviceTimeZone.mo28435h();
        if (((!h && !h2) || (h && h2 && this.timeZoneName.equals(mVDeviceTimeZone.timeZoneName))) && this.timeZoneRawOffset == mVDeviceTimeZone.timeZoneRawOffset && this.timeZoneInDaylightTime == mVDeviceTimeZone.timeZoneInDaylightTime) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVDeviceTimeZone mVDeviceTimeZone = (MVDeviceTimeZone) obj;
        if (!getClass().equals(mVDeviceTimeZone.getClass())) {
            return getClass().getName().compareTo(mVDeviceTimeZone.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28433f()).compareTo(Boolean.valueOf(mVDeviceTimeZone.mo28433f()));
        if (compareTo != 0 || ((mo28433f() && (compareTo = this.timeZoneId.compareTo(mVDeviceTimeZone.timeZoneId)) != 0) || (compareTo = Boolean.valueOf(mo28435h()).compareTo(Boolean.valueOf(mVDeviceTimeZone.mo28435h()))) != 0 || ((mo28435h() && (compareTo = this.timeZoneName.compareTo(mVDeviceTimeZone.timeZoneName)) != 0) || (compareTo = Boolean.valueOf(mo28437i()).compareTo(Boolean.valueOf(mVDeviceTimeZone.mo28437i()))) != 0 || ((mo28437i() && (compareTo = C25082a.m62839c(this.timeZoneRawOffset, mVDeviceTimeZone.timeZoneRawOffset)) != 0) || (compareTo = Boolean.valueOf(mo28434g()).compareTo(Boolean.valueOf(mVDeviceTimeZone.mo28434g()))) != 0)))) {
            return compareTo;
        }
        if (!mo28434g() || (l = C25082a.m62848l(this.timeZoneInDaylightTime, mVDeviceTimeZone.timeZoneInDaylightTime)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDeviceTimeZone)) {
            return mo28430a((MVDeviceTimeZone) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28433f() {
        return this.timeZoneId != null;
    }

    /* renamed from: g */
    public final boolean mo28434g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo28435h() {
        return this.timeZoneName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28437i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo28438j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo28439k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDeviceTimeZone(", "timeZoneId:");
        String str = this.timeZoneId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("timeZoneName:");
        String str2 = this.timeZoneName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("timeZoneRawOffset:");
        C0016g.m42z(n, this.timeZoneRawOffset, ", ", "timeZoneInDaylightTime:");
        return C25541a.m63885p(n, this.timeZoneInDaylightTime, ")");
    }
}
