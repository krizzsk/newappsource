package com.tranzmate.moovit.protocol.surveys;

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

public class MVLocalLineGroupSurvey implements TBase<MVLocalLineGroupSurvey, _Fields>, Serializable, Cloneable, Comparable<MVLocalLineGroupSurvey> {

    /* renamed from: b */
    public static final C25113c f28401b = new C25113c("lineGroupId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28402c = new C25113c("lineId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28403d = new C25113c("stopId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f28404e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28405f;
    private byte __isset_bitfield = 0;
    public int lineGroupId;
    public int lineId;
    private _Fields[] optionals = {_Fields.LINE_ID, _Fields.STOP_ID};
    public int stopId;

    public enum _Fields implements C25085c {
        LINE_GROUP_ID(1, "lineGroupId"),
        LINE_ID(2, "lineId"),
        STOP_ID(3, "stopId");
        
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
                return LINE_GROUP_ID;
            }
            if (i == 2) {
                return LINE_ID;
            }
            if (i != 3) {
                return null;
            }
            return STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVLocalLineGroupSurvey$a */
    public static class C10601a extends C25239c<MVLocalLineGroupSurvey> {
        public C10601a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocalLineGroupSurvey mVLocalLineGroupSurvey = (MVLocalLineGroupSurvey) tBase;
            mVLocalLineGroupSurvey.getClass();
            C25113c cVar = MVLocalLineGroupSurvey.f28401b;
            gVar.mo61687K();
            gVar.mo61711x(MVLocalLineGroupSurvey.f28401b);
            gVar.mo61678B(mVLocalLineGroupSurvey.lineGroupId);
            gVar.mo61712y();
            if (mVLocalLineGroupSurvey.mo31875g()) {
                gVar.mo61711x(MVLocalLineGroupSurvey.f28402c);
                gVar.mo61678B(mVLocalLineGroupSurvey.lineId);
                gVar.mo61712y();
            }
            if (mVLocalLineGroupSurvey.mo31876h()) {
                gVar.mo61711x(MVLocalLineGroupSurvey.f28403d);
                gVar.mo61678B(mVLocalLineGroupSurvey.stopId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocalLineGroupSurvey mVLocalLineGroupSurvey = (MVLocalLineGroupSurvey) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLocalLineGroupSurvey.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVLocalLineGroupSurvey.stopId = gVar.mo61696i();
                            mVLocalLineGroupSurvey.mo31880k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVLocalLineGroupSurvey.lineId = gVar.mo61696i();
                        mVLocalLineGroupSurvey.mo31879j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLocalLineGroupSurvey.lineGroupId = gVar.mo61696i();
                    mVLocalLineGroupSurvey.mo31878i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVLocalLineGroupSurvey$b */
    public static class C10602b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10601a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVLocalLineGroupSurvey$c */
    public static class C10603c extends C25240d<MVLocalLineGroupSurvey> {
        public C10603c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocalLineGroupSurvey mVLocalLineGroupSurvey = (MVLocalLineGroupSurvey) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLocalLineGroupSurvey.mo31874f()) {
                bitSet.set(0);
            }
            if (mVLocalLineGroupSurvey.mo31875g()) {
                bitSet.set(1);
            }
            if (mVLocalLineGroupSurvey.mo31876h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVLocalLineGroupSurvey.mo31874f()) {
                jVar.mo61678B(mVLocalLineGroupSurvey.lineGroupId);
            }
            if (mVLocalLineGroupSurvey.mo31875g()) {
                jVar.mo61678B(mVLocalLineGroupSurvey.lineId);
            }
            if (mVLocalLineGroupSurvey.mo31876h()) {
                jVar.mo61678B(mVLocalLineGroupSurvey.stopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocalLineGroupSurvey mVLocalLineGroupSurvey = (MVLocalLineGroupSurvey) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVLocalLineGroupSurvey.lineGroupId = jVar.mo61696i();
                mVLocalLineGroupSurvey.mo31878i();
            }
            if (T.get(1)) {
                mVLocalLineGroupSurvey.lineId = jVar.mo61696i();
                mVLocalLineGroupSurvey.mo31879j();
            }
            if (T.get(2)) {
                mVLocalLineGroupSurvey.stopId = jVar.mo61696i();
                mVLocalLineGroupSurvey.mo31880k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVLocalLineGroupSurvey$d */
    public static class C10604d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10603c(0);
        }
    }

    static {
        new C17394d0("MVLocalLineGroupSurvey");
        HashMap hashMap = new HashMap();
        f28404e = hashMap;
        hashMap.put(C25239c.class, new C10602b());
        hashMap.put(C25240d.class, new C10604d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_GROUP_ID, new FieldMetaData("lineGroupId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28405f = unmodifiableMap;
        FieldMetaData.m61947a(MVLocalLineGroupSurvey.class, unmodifiableMap);
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
        ((C25238b) f28404e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28404e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVLocalLineGroupSurvey mVLocalLineGroupSurvey = (MVLocalLineGroupSurvey) obj;
        if (!getClass().equals(mVLocalLineGroupSurvey.getClass())) {
            return getClass().getName().compareTo(mVLocalLineGroupSurvey.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31874f()).compareTo(Boolean.valueOf(mVLocalLineGroupSurvey.mo31874f()));
        if (compareTo != 0 || ((mo31874f() && (compareTo = C25082a.m62839c(this.lineGroupId, mVLocalLineGroupSurvey.lineGroupId)) != 0) || (compareTo = Boolean.valueOf(mo31875g()).compareTo(Boolean.valueOf(mVLocalLineGroupSurvey.mo31875g()))) != 0 || ((mo31875g() && (compareTo = C25082a.m62839c(this.lineId, mVLocalLineGroupSurvey.lineId)) != 0) || (compareTo = Boolean.valueOf(mo31876h()).compareTo(Boolean.valueOf(mVLocalLineGroupSurvey.mo31876h()))) != 0))) {
            return compareTo;
        }
        if (!mo31876h() || (c = C25082a.m62839c(this.stopId, mVLocalLineGroupSurvey.stopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLocalLineGroupSurvey)) {
            return false;
        }
        MVLocalLineGroupSurvey mVLocalLineGroupSurvey = (MVLocalLineGroupSurvey) obj;
        if (this.lineGroupId != mVLocalLineGroupSurvey.lineGroupId) {
            return false;
        }
        boolean g = mo31875g();
        boolean g2 = mVLocalLineGroupSurvey.mo31875g();
        if ((g || g2) && (!g || !g2 || this.lineId != mVLocalLineGroupSurvey.lineId)) {
            return false;
        }
        boolean h = mo31876h();
        boolean h2 = mVLocalLineGroupSurvey.mo31876h();
        if ((h || h2) && (!h || !h2 || this.stopId != mVLocalLineGroupSurvey.stopId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31874f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31875g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo31876h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31878i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo31879j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo31880k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLocalLineGroupSurvey(", "lineGroupId:");
        n.append(this.lineGroupId);
        if (mo31875g()) {
            n.append(", ");
            n.append("lineId:");
            n.append(this.lineId);
        }
        if (mo31876h()) {
            n.append(", ");
            n.append("stopId:");
            n.append(this.stopId);
        }
        n.append(")");
        return n.toString();
    }
}
