package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget;
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
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVTodSession implements TBase<MVTodSession, _Fields>, Serializable, Cloneable, Comparable<MVTodSession> {

    /* renamed from: b */
    public static final C25113c f29618b = new C25113c("sessionId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29619c = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29620d = new C25113c("destination", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29621e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29622f;
    public MVLocationTarget destination;
    private _Fields[] optionals = {_Fields.ORIGIN, _Fields.DESTINATION};
    public MVLocationTarget origin;
    public String sessionId;

    public enum _Fields implements C25085c {
        SESSION_ID(1, "sessionId"),
        ORIGIN(2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN),
        DESTINATION(3, "destination");
        
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
                return SESSION_ID;
            }
            if (i == 2) {
                return ORIGIN;
            }
            if (i != 3) {
                return null;
            }
            return DESTINATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSession$a */
    public static class C11344a extends C25239c<MVTodSession> {
        public C11344a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSession mVTodSession = (MVTodSession) tBase;
            MVLocationTarget mVLocationTarget = mVTodSession.origin;
            if (mVLocationTarget != null) {
                mVLocationTarget.mo34391h();
            }
            MVLocationTarget mVLocationTarget2 = mVTodSession.destination;
            if (mVLocationTarget2 != null) {
                mVLocationTarget2.mo34391h();
            }
            C25113c cVar = MVTodSession.f29618b;
            gVar.mo61687K();
            if (mVTodSession.sessionId != null) {
                gVar.mo61711x(MVTodSession.f29618b);
                gVar.mo61686J(mVTodSession.sessionId);
                gVar.mo61712y();
            }
            if (mVTodSession.origin != null && mVTodSession.mo33802g()) {
                gVar.mo61711x(MVTodSession.f29619c);
                mVTodSession.origin.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodSession.destination != null && mVTodSession.mo33801f()) {
                gVar.mo61711x(MVTodSession.f29620d);
                mVTodSession.destination.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSession mVTodSession = (MVTodSession) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVLocationTarget mVLocationTarget = new MVLocationTarget();
                            mVTodSession.destination = mVLocationTarget;
                            mVLocationTarget.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLocationTarget mVLocationTarget2 = new MVLocationTarget();
                        mVTodSession.origin = mVLocationTarget2;
                        mVLocationTarget2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodSession.sessionId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVLocationTarget mVLocationTarget3 = mVTodSession.origin;
            if (mVLocationTarget3 != null) {
                mVLocationTarget3.mo34391h();
            }
            MVLocationTarget mVLocationTarget4 = mVTodSession.destination;
            if (mVLocationTarget4 != null) {
                mVLocationTarget4.mo34391h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSession$b */
    public static class C11345b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11344a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSession$c */
    public static class C11346c extends C25240d<MVTodSession> {
        public C11346c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSession mVTodSession = (MVTodSession) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodSession.mo33803h()) {
                bitSet.set(0);
            }
            if (mVTodSession.mo33802g()) {
                bitSet.set(1);
            }
            if (mVTodSession.mo33801f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodSession.mo33803h()) {
                jVar.mo61686J(mVTodSession.sessionId);
            }
            if (mVTodSession.mo33802g()) {
                mVTodSession.origin.mo25202X0(jVar);
            }
            if (mVTodSession.mo33801f()) {
                mVTodSession.destination.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSession mVTodSession = (MVTodSession) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodSession.sessionId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLocationTarget mVLocationTarget = new MVLocationTarget();
                mVTodSession.origin = mVLocationTarget;
                mVLocationTarget.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVLocationTarget mVLocationTarget2 = new MVLocationTarget();
                mVTodSession.destination = mVLocationTarget2;
                mVLocationTarget2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodSession$d */
    public static class C11347d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11346c(0);
        }
    }

    static {
        new C17394d0("MVTodSession");
        HashMap hashMap = new HashMap();
        f29621e = hashMap;
        hashMap.put(C25239c.class, new C11345b());
        hashMap.put(C25240d.class, new C11347d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SESSION_ID, new FieldMetaData("sessionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ORIGIN, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 2, new StructMetaData(MVLocationTarget.class)));
        enumMap.put(_Fields.DESTINATION, new FieldMetaData("destination", (byte) 2, new StructMetaData(MVLocationTarget.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29622f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodSession.class, unmodifiableMap);
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
        ((C25238b) f29621e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29621e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33798a(MVTodSession mVTodSession) {
        if (mVTodSession == null) {
            return false;
        }
        boolean h = mo33803h();
        boolean h2 = mVTodSession.mo33803h();
        if ((h || h2) && (!h || !h2 || !this.sessionId.equals(mVTodSession.sessionId))) {
            return false;
        }
        boolean g = mo33802g();
        boolean g2 = mVTodSession.mo33802g();
        if ((g || g2) && (!g || !g2 || !this.origin.mo34386a(mVTodSession.origin))) {
            return false;
        }
        boolean f = mo33801f();
        boolean f2 = mVTodSession.mo33801f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.destination.mo34386a(mVTodSession.destination)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodSession mVTodSession = (MVTodSession) obj;
        if (!getClass().equals(mVTodSession.getClass())) {
            return getClass().getName().compareTo(mVTodSession.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33803h()).compareTo(Boolean.valueOf(mVTodSession.mo33803h()));
        if (compareTo2 != 0 || ((mo33803h() && (compareTo2 = this.sessionId.compareTo(mVTodSession.sessionId)) != 0) || (compareTo2 = Boolean.valueOf(mo33802g()).compareTo(Boolean.valueOf(mVTodSession.mo33802g()))) != 0 || ((mo33802g() && (compareTo2 = this.origin.compareTo(mVTodSession.origin)) != 0) || (compareTo2 = Boolean.valueOf(mo33801f()).compareTo(Boolean.valueOf(mVTodSession.mo33801f()))) != 0))) {
            return compareTo2;
        }
        if (!mo33801f() || (compareTo = this.destination.compareTo(mVTodSession.destination)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodSession)) {
            return mo33798a((MVTodSession) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33801f() {
        return this.destination != null;
    }

    /* renamed from: g */
    public final boolean mo33802g() {
        return this.origin != null;
    }

    /* renamed from: h */
    public final boolean mo33803h() {
        return this.sessionId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodSession(", "sessionId:");
        String str = this.sessionId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33802g()) {
            n.append(", ");
            n.append("origin:");
            MVLocationTarget mVLocationTarget = this.origin;
            if (mVLocationTarget == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationTarget);
            }
        }
        if (mo33801f()) {
            n.append(", ");
            n.append("destination:");
            MVLocationTarget mVLocationTarget2 = this.destination;
            if (mVLocationTarget2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationTarget2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
