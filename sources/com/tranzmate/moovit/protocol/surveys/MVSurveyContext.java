package com.tranzmate.moovit.protocol.surveys;

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

public class MVSurveyContext implements TBase<MVSurveyContext, _Fields>, Serializable, Cloneable, Comparable<MVSurveyContext> {

    /* renamed from: b */
    public static final C25113c f28440b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28441c = new C25113c("lastSeenTime", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f28442d = new C25113c("metroAreaId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28443e = new C25113c("endReason", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f28444f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28445g;
    private byte __isset_bitfield = 0;
    public MVEndReason endReason;
    public long lastSeenTime;
    public int metroAreaId;
    private _Fields[] optionals = {_Fields.END_REASON};
    public MVSurveyType type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        LAST_SEEN_TIME(2, "lastSeenTime"),
        METRO_AREA_ID(3, "metroAreaId"),
        END_REASON(4, "endReason");
        
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
                return TYPE;
            }
            if (i == 2) {
                return LAST_SEEN_TIME;
            }
            if (i == 3) {
                return METRO_AREA_ID;
            }
            if (i != 4) {
                return null;
            }
            return END_REASON;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyContext$a */
    public static class C10626a extends C25239c<MVSurveyContext> {
        public C10626a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyContext mVSurveyContext = (MVSurveyContext) tBase;
            mVSurveyContext.getClass();
            C25113c cVar = MVSurveyContext.f28440b;
            gVar.mo61687K();
            if (mVSurveyContext.type != null) {
                gVar.mo61711x(MVSurveyContext.f28440b);
                gVar.mo61678B(mVSurveyContext.type.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSurveyContext.f28441c);
            gVar.mo61679C(mVSurveyContext.lastSeenTime);
            gVar.mo61712y();
            gVar.mo61711x(MVSurveyContext.f28442d);
            gVar.mo61678B(mVSurveyContext.metroAreaId);
            gVar.mo61712y();
            if (mVSurveyContext.endReason != null && mVSurveyContext.mo31939f()) {
                gVar.mo61711x(MVSurveyContext.f28443e);
                gVar.mo61678B(mVSurveyContext.endReason.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyContext mVSurveyContext = (MVSurveyContext) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSurveyContext.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVSurveyContext.endReason = MVEndReason.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVSurveyContext.metroAreaId = gVar.mo61696i();
                            mVSurveyContext.mo31945k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVSurveyContext.lastSeenTime = gVar.mo61697j();
                        mVSurveyContext.mo31944j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSurveyContext.type = MVSurveyType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyContext$b */
    public static class C10627b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10626a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyContext$c */
    public static class C10628c extends C25240d<MVSurveyContext> {
        public C10628c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyContext mVSurveyContext = (MVSurveyContext) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSurveyContext.mo31943i()) {
                bitSet.set(0);
            }
            if (mVSurveyContext.mo31940g()) {
                bitSet.set(1);
            }
            if (mVSurveyContext.mo31941h()) {
                bitSet.set(2);
            }
            if (mVSurveyContext.mo31939f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSurveyContext.mo31943i()) {
                jVar.mo61678B(mVSurveyContext.type.getValue());
            }
            if (mVSurveyContext.mo31940g()) {
                jVar.mo61679C(mVSurveyContext.lastSeenTime);
            }
            if (mVSurveyContext.mo31941h()) {
                jVar.mo61678B(mVSurveyContext.metroAreaId);
            }
            if (mVSurveyContext.mo31939f()) {
                jVar.mo61678B(mVSurveyContext.endReason.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyContext mVSurveyContext = (MVSurveyContext) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVSurveyContext.type = MVSurveyType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVSurveyContext.lastSeenTime = jVar.mo61697j();
                mVSurveyContext.mo31944j();
            }
            if (T.get(2)) {
                mVSurveyContext.metroAreaId = jVar.mo61696i();
                mVSurveyContext.mo31945k();
            }
            if (T.get(3)) {
                mVSurveyContext.endReason = MVEndReason.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVSurveyContext$d */
    public static class C10629d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10628c(0);
        }
    }

    static {
        new C17394d0("MVSurveyContext");
        HashMap hashMap = new HashMap();
        f28444f = hashMap;
        hashMap.put(C25239c.class, new C10627b());
        hashMap.put(C25240d.class, new C10629d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVSurveyType.class)));
        enumMap.put(_Fields.LAST_SEEN_TIME, new FieldMetaData("lastSeenTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.METRO_AREA_ID, new FieldMetaData("metroAreaId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.END_REASON, new FieldMetaData("endReason", (byte) 2, new EnumMetaData(MVEndReason.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28445g = unmodifiableMap;
        FieldMetaData.m61947a(MVSurveyContext.class, unmodifiableMap);
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
        ((C25238b) f28444f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28444f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSurveyContext mVSurveyContext = (MVSurveyContext) obj;
        if (!getClass().equals(mVSurveyContext.getClass())) {
            return getClass().getName().compareTo(mVSurveyContext.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31943i()).compareTo(Boolean.valueOf(mVSurveyContext.mo31943i()));
        if (compareTo2 != 0 || ((mo31943i() && (compareTo2 = this.type.compareTo(mVSurveyContext.type)) != 0) || (compareTo2 = Boolean.valueOf(mo31940g()).compareTo(Boolean.valueOf(mVSurveyContext.mo31940g()))) != 0 || ((mo31940g() && (compareTo2 = C25082a.m62840d(this.lastSeenTime, mVSurveyContext.lastSeenTime)) != 0) || (compareTo2 = Boolean.valueOf(mo31941h()).compareTo(Boolean.valueOf(mVSurveyContext.mo31941h()))) != 0 || ((mo31941h() && (compareTo2 = C25082a.m62839c(this.metroAreaId, mVSurveyContext.metroAreaId)) != 0) || (compareTo2 = Boolean.valueOf(mo31939f()).compareTo(Boolean.valueOf(mVSurveyContext.mo31939f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo31939f() || (compareTo = this.endReason.compareTo(mVSurveyContext.endReason)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSurveyContext)) {
            return false;
        }
        MVSurveyContext mVSurveyContext = (MVSurveyContext) obj;
        boolean i = mo31943i();
        boolean i2 = mVSurveyContext.mo31943i();
        if (((i || i2) && (!i || !i2 || !this.type.equals(mVSurveyContext.type))) || this.lastSeenTime != mVSurveyContext.lastSeenTime || this.metroAreaId != mVSurveyContext.metroAreaId) {
            return false;
        }
        boolean f = mo31939f();
        boolean f2 = mVSurveyContext.mo31939f();
        if ((f || f2) && (!f || !f2 || !this.endReason.equals(mVSurveyContext.endReason))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31939f() {
        return this.endReason != null;
    }

    /* renamed from: g */
    public final boolean mo31940g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo31941h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31943i() {
        return this.type != null;
    }

    /* renamed from: j */
    public final void mo31944j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo31945k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSurveyContext(", "type:");
        MVSurveyType mVSurveyType = this.type;
        if (mVSurveyType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSurveyType);
        }
        n.append(", ");
        n.append("lastSeenTime:");
        C25541a.m63889t(n, this.lastSeenTime, ", ", "metroAreaId:");
        n.append(this.metroAreaId);
        if (mo31939f()) {
            n.append(", ");
            n.append("endReason:");
            MVEndReason mVEndReason = this.endReason;
            if (mVEndReason == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVEndReason);
            }
        }
        n.append(")");
        return n.toString();
    }
}
