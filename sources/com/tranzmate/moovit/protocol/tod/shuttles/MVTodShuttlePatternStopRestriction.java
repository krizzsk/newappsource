package com.tranzmate.moovit.protocol.tod.shuttles;

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

public class MVTodShuttlePatternStopRestriction implements TBase<MVTodShuttlePatternStopRestriction, _Fields>, Serializable, Cloneable, Comparable<MVTodShuttlePatternStopRestriction> {

    /* renamed from: b */
    public static final C25113c f29742b = new C25113c("stopIndex", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29743c = new C25113c("restrictionType", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f29744d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29745e;
    private byte __isset_bitfield = 0;
    public MVTodShuttlePatternRestrictionType restrictionType;
    public int stopIndex;

    public enum _Fields implements C25085c {
        STOP_INDEX(1, "stopIndex"),
        RESTRICTION_TYPE(2, "restrictionType");
        
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
                return STOP_INDEX;
            }
            if (i != 2) {
                return null;
            }
            return RESTRICTION_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternStopRestriction$a */
    public static class C11435a extends C25239c<MVTodShuttlePatternStopRestriction> {
        public C11435a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttlePatternStopRestriction mVTodShuttlePatternStopRestriction = (MVTodShuttlePatternStopRestriction) tBase;
            mVTodShuttlePatternStopRestriction.getClass();
            C25113c cVar = MVTodShuttlePatternStopRestriction.f29742b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodShuttlePatternStopRestriction.f29742b);
            gVar.mo61678B(mVTodShuttlePatternStopRestriction.stopIndex);
            gVar.mo61712y();
            if (mVTodShuttlePatternStopRestriction.restrictionType != null) {
                gVar.mo61711x(MVTodShuttlePatternStopRestriction.f29743c);
                gVar.mo61678B(mVTodShuttlePatternStopRestriction.restrictionType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttlePatternStopRestriction mVTodShuttlePatternStopRestriction = (MVTodShuttlePatternStopRestriction) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodShuttlePatternStopRestriction.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVTodShuttlePatternStopRestriction.restrictionType = MVTodShuttlePatternRestrictionType.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTodShuttlePatternStopRestriction.stopIndex = gVar.mo61696i();
                    mVTodShuttlePatternStopRestriction.mo34011h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternStopRestriction$b */
    public static class C11436b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11435a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternStopRestriction$c */
    public static class C11437c extends C25240d<MVTodShuttlePatternStopRestriction> {
        public C11437c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttlePatternStopRestriction mVTodShuttlePatternStopRestriction = (MVTodShuttlePatternStopRestriction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodShuttlePatternStopRestriction.mo34010g()) {
                bitSet.set(0);
            }
            if (mVTodShuttlePatternStopRestriction.mo34009f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodShuttlePatternStopRestriction.mo34010g()) {
                jVar.mo61678B(mVTodShuttlePatternStopRestriction.stopIndex);
            }
            if (mVTodShuttlePatternStopRestriction.mo34009f()) {
                jVar.mo61678B(mVTodShuttlePatternStopRestriction.restrictionType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttlePatternStopRestriction mVTodShuttlePatternStopRestriction = (MVTodShuttlePatternStopRestriction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodShuttlePatternStopRestriction.stopIndex = jVar.mo61696i();
                mVTodShuttlePatternStopRestriction.mo34011h();
            }
            if (T.get(1)) {
                mVTodShuttlePatternStopRestriction.restrictionType = MVTodShuttlePatternRestrictionType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePatternStopRestriction$d */
    public static class C11438d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11437c(0);
        }
    }

    static {
        new C17394d0("MVTodShuttlePatternStopRestriction");
        HashMap hashMap = new HashMap();
        f29744d = hashMap;
        hashMap.put(C25239c.class, new C11436b());
        hashMap.put(C25240d.class, new C11438d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_INDEX, new FieldMetaData("stopIndex", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RESTRICTION_TYPE, new FieldMetaData("restrictionType", (byte) 3, new EnumMetaData(MVTodShuttlePatternRestrictionType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29745e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodShuttlePatternStopRestriction.class, unmodifiableMap);
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
        ((C25238b) f29744d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29744d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodShuttlePatternStopRestriction mVTodShuttlePatternStopRestriction = (MVTodShuttlePatternStopRestriction) obj;
        if (!getClass().equals(mVTodShuttlePatternStopRestriction.getClass())) {
            return getClass().getName().compareTo(mVTodShuttlePatternStopRestriction.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34010g()).compareTo(Boolean.valueOf(mVTodShuttlePatternStopRestriction.mo34010g()));
        if (compareTo2 != 0 || ((mo34010g() && (compareTo2 = C25082a.m62839c(this.stopIndex, mVTodShuttlePatternStopRestriction.stopIndex)) != 0) || (compareTo2 = Boolean.valueOf(mo34009f()).compareTo(Boolean.valueOf(mVTodShuttlePatternStopRestriction.mo34009f()))) != 0)) {
            return compareTo2;
        }
        if (!mo34009f() || (compareTo = this.restrictionType.compareTo(mVTodShuttlePatternStopRestriction.restrictionType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodShuttlePatternStopRestriction)) {
            return false;
        }
        MVTodShuttlePatternStopRestriction mVTodShuttlePatternStopRestriction = (MVTodShuttlePatternStopRestriction) obj;
        if (this.stopIndex != mVTodShuttlePatternStopRestriction.stopIndex) {
            return false;
        }
        boolean f = mo34009f();
        boolean f2 = mVTodShuttlePatternStopRestriction.mo34009f();
        if ((f || f2) && (!f || !f2 || !this.restrictionType.equals(mVTodShuttlePatternStopRestriction.restrictionType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34009f() {
        return this.restrictionType != null;
    }

    /* renamed from: g */
    public final boolean mo34010g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo34011h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodShuttlePatternStopRestriction(", "stopIndex:");
        C0016g.m42z(n, this.stopIndex, ", ", "restrictionType:");
        MVTodShuttlePatternRestrictionType mVTodShuttlePatternRestrictionType = this.restrictionType;
        if (mVTodShuttlePatternRestrictionType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodShuttlePatternRestrictionType);
        }
        n.append(")");
        return n.toString();
    }
}
