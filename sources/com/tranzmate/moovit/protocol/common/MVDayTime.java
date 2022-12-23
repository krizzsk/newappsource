package com.tranzmate.moovit.protocol.common;

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

public class MVDayTime implements TBase<MVDayTime, _Fields>, Serializable, Cloneable, Comparable<MVDayTime> {

    /* renamed from: b */
    public static final C25113c f24991b = new C25113c("hourOfDay", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24992c = new C25113c("minutes", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f24993d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24994e;
    private byte __isset_bitfield = 0;
    public int hourOfDay;
    public int minutes;

    public enum _Fields implements C25085c {
        HOUR_OF_DAY(1, "hourOfDay"),
        MINUTES(2, "minutes");
        
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
                return HOUR_OF_DAY;
            }
            if (i != 2) {
                return null;
            }
            return MINUTES;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVDayTime$a */
    public static class C8380a extends C25239c<MVDayTime> {
        public C8380a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDayTime mVDayTime = (MVDayTime) tBase;
            mVDayTime.getClass();
            C25113c cVar = MVDayTime.f24991b;
            gVar.mo61687K();
            gVar.mo61711x(MVDayTime.f24991b);
            gVar.mo61678B(mVDayTime.hourOfDay);
            gVar.mo61712y();
            gVar.mo61711x(MVDayTime.f24992c);
            C16530d.m42020n(gVar, mVDayTime.minutes);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDayTime mVDayTime = (MVDayTime) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDayTime.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVDayTime.minutes = gVar.mo61696i();
                        mVDayTime.mo26122i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVDayTime.hourOfDay = gVar.mo61696i();
                    mVDayTime.mo26120h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVDayTime$b */
    public static class C8381b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8380a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVDayTime$c */
    public static class C8382c extends C25240d<MVDayTime> {
        public C8382c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDayTime mVDayTime = (MVDayTime) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDayTime.mo26118f()) {
                bitSet.set(0);
            }
            if (mVDayTime.mo26119g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVDayTime.mo26118f()) {
                jVar.mo61678B(mVDayTime.hourOfDay);
            }
            if (mVDayTime.mo26119g()) {
                jVar.mo61678B(mVDayTime.minutes);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDayTime mVDayTime = (MVDayTime) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVDayTime.hourOfDay = jVar.mo61696i();
                mVDayTime.mo26120h();
            }
            if (T.get(1)) {
                mVDayTime.minutes = jVar.mo61696i();
                mVDayTime.mo26122i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVDayTime$d */
    public static class C8383d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8382c(0);
        }
    }

    static {
        new C17394d0("MVDayTime");
        HashMap hashMap = new HashMap();
        f24993d = hashMap;
        hashMap.put(C25239c.class, new C8381b());
        hashMap.put(C25240d.class, new C8383d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.HOUR_OF_DAY, new FieldMetaData("hourOfDay", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MINUTES, new FieldMetaData("minutes", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24994e = unmodifiableMap;
        FieldMetaData.m61947a(MVDayTime.class, unmodifiableMap);
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
        ((C25238b) f24993d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24993d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26115a(MVDayTime mVDayTime) {
        if (mVDayTime != null && this.hourOfDay == mVDayTime.hourOfDay && this.minutes == mVDayTime.minutes) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int c;
        MVDayTime mVDayTime = (MVDayTime) obj;
        if (!getClass().equals(mVDayTime.getClass())) {
            return getClass().getName().compareTo(mVDayTime.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26118f()).compareTo(Boolean.valueOf(mVDayTime.mo26118f()));
        if (compareTo != 0 || ((mo26118f() && (compareTo = C25082a.m62839c(this.hourOfDay, mVDayTime.hourOfDay)) != 0) || (compareTo = Boolean.valueOf(mo26119g()).compareTo(Boolean.valueOf(mVDayTime.mo26119g()))) != 0)) {
            return compareTo;
        }
        if (!mo26119g() || (c = C25082a.m62839c(this.minutes, mVDayTime.minutes)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDayTime)) {
            return mo26115a((MVDayTime) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26118f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26119g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo26120h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26122i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDayTime(", "hourOfDay:");
        C0016g.m42z(n, this.hourOfDay, ", ", "minutes:");
        return C13437d.m33707l(n, this.minutes, ")");
    }
}
