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

public class MVStopLineSchedulePattern implements TBase<MVStopLineSchedulePattern, _Fields>, Serializable, Cloneable, Comparable<MVStopLineSchedulePattern> {

    /* renamed from: b */
    public static final C25113c f25786b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25787c = new C25113c("departures", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f25788d = new C25113c("serviceOperationId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25789e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25790f;
    private byte __isset_bitfield = 0;
    public List<Integer> departures;
    public int lineId;
    public int serviceOperationId;

    public enum _Fields implements C25085c {
        LINE_ID(1, "lineId"),
        DEPARTURES(2, "departures"),
        SERVICE_OPERATION_ID(3, "serviceOperationId");
        
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
                return DEPARTURES;
            }
            if (i != 3) {
                return null;
            }
            return SERVICE_OPERATION_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopLineSchedulePattern$a */
    public static class C8823a extends C25239c<MVStopLineSchedulePattern> {
        public C8823a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopLineSchedulePattern mVStopLineSchedulePattern = (MVStopLineSchedulePattern) tBase;
            mVStopLineSchedulePattern.getClass();
            C25113c cVar = MVStopLineSchedulePattern.f25786b;
            gVar.mo61687K();
            gVar.mo61711x(MVStopLineSchedulePattern.f25786b);
            gVar.mo61678B(mVStopLineSchedulePattern.lineId);
            gVar.mo61712y();
            if (mVStopLineSchedulePattern.departures != null) {
                gVar.mo61711x(MVStopLineSchedulePattern.f25787c);
                gVar.mo61680D(new C25119e((byte) 8, mVStopLineSchedulePattern.departures.size()));
                for (Integer intValue : mVStopLineSchedulePattern.departures) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStopLineSchedulePattern.f25788d);
            C16530d.m42020n(gVar, mVStopLineSchedulePattern.serviceOperationId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopLineSchedulePattern mVStopLineSchedulePattern = (MVStopLineSchedulePattern) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStopLineSchedulePattern.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVStopLineSchedulePattern.serviceOperationId = gVar.mo61696i();
                            mVStopLineSchedulePattern.mo27495j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVStopLineSchedulePattern.departures = new ArrayList(k.f63395b);
                        int i = 0;
                        while (i < k.f63395b) {
                            i = C13437d.m33701f(gVar.mo61696i(), mVStopLineSchedulePattern.departures, i, 1);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVStopLineSchedulePattern.lineId = gVar.mo61696i();
                    mVStopLineSchedulePattern.mo27494i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopLineSchedulePattern$b */
    public static class C8824b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8823a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopLineSchedulePattern$c */
    public static class C8825c extends C25240d<MVStopLineSchedulePattern> {
        public C8825c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopLineSchedulePattern mVStopLineSchedulePattern = (MVStopLineSchedulePattern) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopLineSchedulePattern.mo27491g()) {
                bitSet.set(0);
            }
            if (mVStopLineSchedulePattern.mo27490f()) {
                bitSet.set(1);
            }
            if (mVStopLineSchedulePattern.mo27492h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVStopLineSchedulePattern.mo27491g()) {
                jVar.mo61678B(mVStopLineSchedulePattern.lineId);
            }
            if (mVStopLineSchedulePattern.mo27490f()) {
                jVar.mo61678B(mVStopLineSchedulePattern.departures.size());
                for (Integer intValue : mVStopLineSchedulePattern.departures) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVStopLineSchedulePattern.mo27492h()) {
                jVar.mo61678B(mVStopLineSchedulePattern.serviceOperationId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopLineSchedulePattern mVStopLineSchedulePattern = (MVStopLineSchedulePattern) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVStopLineSchedulePattern.lineId = jVar.mo61696i();
                mVStopLineSchedulePattern.mo27494i();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVStopLineSchedulePattern.departures = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVStopLineSchedulePattern.departures, i2, 1)) {
                }
            }
            if (T.get(2)) {
                mVStopLineSchedulePattern.serviceOperationId = jVar.mo61696i();
                mVStopLineSchedulePattern.mo27495j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopLineSchedulePattern$d */
    public static class C8826d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8825c(0);
        }
    }

    static {
        new C17394d0("MVStopLineSchedulePattern");
        HashMap hashMap = new HashMap();
        f25789e = hashMap;
        hashMap.put(C25239c.class, new C8824b());
        hashMap.put(C25240d.class, new C8826d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEPARTURES, new FieldMetaData("departures", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.SERVICE_OPERATION_ID, new FieldMetaData("serviceOperationId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25790f = unmodifiableMap;
        FieldMetaData.m61947a(MVStopLineSchedulePattern.class, unmodifiableMap);
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
        ((C25238b) f25789e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25789e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVStopLineSchedulePattern mVStopLineSchedulePattern = (MVStopLineSchedulePattern) obj;
        if (!getClass().equals(mVStopLineSchedulePattern.getClass())) {
            return getClass().getName().compareTo(mVStopLineSchedulePattern.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27491g()).compareTo(Boolean.valueOf(mVStopLineSchedulePattern.mo27491g()));
        if (compareTo != 0 || ((mo27491g() && (compareTo = C25082a.m62839c(this.lineId, mVStopLineSchedulePattern.lineId)) != 0) || (compareTo = Boolean.valueOf(mo27490f()).compareTo(Boolean.valueOf(mVStopLineSchedulePattern.mo27490f()))) != 0 || ((mo27490f() && (compareTo = C25082a.m62844h(this.departures, mVStopLineSchedulePattern.departures)) != 0) || (compareTo = Boolean.valueOf(mo27492h()).compareTo(Boolean.valueOf(mVStopLineSchedulePattern.mo27492h()))) != 0))) {
            return compareTo;
        }
        if (!mo27492h() || (c = C25082a.m62839c(this.serviceOperationId, mVStopLineSchedulePattern.serviceOperationId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStopLineSchedulePattern)) {
            return false;
        }
        MVStopLineSchedulePattern mVStopLineSchedulePattern = (MVStopLineSchedulePattern) obj;
        if (this.lineId != mVStopLineSchedulePattern.lineId) {
            return false;
        }
        boolean f = mo27490f();
        boolean f2 = mVStopLineSchedulePattern.mo27490f();
        if (((f || f2) && (!f || !f2 || !this.departures.equals(mVStopLineSchedulePattern.departures))) || this.serviceOperationId != mVStopLineSchedulePattern.serviceOperationId) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27490f() {
        return this.departures != null;
    }

    /* renamed from: g */
    public final boolean mo27491g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27492h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27494i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo27495j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStopLineSchedulePattern(", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "departures:");
        List<Integer> list = this.departures;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("serviceOperationId:");
        return C13437d.m33707l(n, this.serviceOperationId, ")");
    }
}
