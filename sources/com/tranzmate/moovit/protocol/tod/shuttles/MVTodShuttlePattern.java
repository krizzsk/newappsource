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
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVTodShuttlePattern implements TBase<MVTodShuttlePattern, _Fields>, Serializable, Cloneable, Comparable<MVTodShuttlePattern> {

    /* renamed from: b */
    public static final C25113c f29733b = new C25113c("patternId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29734c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29735d = new C25113c("stopIds", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f29736e = new C25113c("restrictions", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f29737f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29738g;
    public String name;
    private _Fields[] optionals = {_Fields.RESTRICTIONS};
    public String patternId;
    public MVTodShuttlePatternRestrictions restrictions;
    public List<Integer> stopIds;

    public enum _Fields implements C25085c {
        PATTERN_ID(1, "patternId"),
        NAME(2, "name"),
        STOP_IDS(3, "stopIds"),
        RESTRICTIONS(4, "restrictions");
        
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
                return PATTERN_ID;
            }
            if (i == 2) {
                return NAME;
            }
            if (i == 3) {
                return STOP_IDS;
            }
            if (i != 4) {
                return null;
            }
            return RESTRICTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePattern$a */
    public static class C11427a extends C25239c<MVTodShuttlePattern> {
        public C11427a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttlePattern mVTodShuttlePattern = (MVTodShuttlePattern) tBase;
            MVTodShuttlePatternRestrictions mVTodShuttlePatternRestrictions = mVTodShuttlePattern.restrictions;
            C25113c cVar = MVTodShuttlePattern.f29733b;
            gVar.mo61687K();
            if (mVTodShuttlePattern.patternId != null) {
                gVar.mo61711x(MVTodShuttlePattern.f29733b);
                gVar.mo61686J(mVTodShuttlePattern.patternId);
                gVar.mo61712y();
            }
            if (mVTodShuttlePattern.name != null) {
                gVar.mo61711x(MVTodShuttlePattern.f29734c);
                gVar.mo61686J(mVTodShuttlePattern.name);
                gVar.mo61712y();
            }
            if (mVTodShuttlePattern.stopIds != null) {
                gVar.mo61711x(MVTodShuttlePattern.f29735d);
                gVar.mo61680D(new C25119e((byte) 8, mVTodShuttlePattern.stopIds.size()));
                for (Integer intValue : mVTodShuttlePattern.stopIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodShuttlePattern.restrictions != null && mVTodShuttlePattern.mo33994h()) {
                gVar.mo61711x(MVTodShuttlePattern.f29736e);
                mVTodShuttlePattern.restrictions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttlePattern mVTodShuttlePattern = (MVTodShuttlePattern) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTodShuttlePatternRestrictions mVTodShuttlePatternRestrictions = mVTodShuttlePattern.restrictions;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVTodShuttlePatternRestrictions mVTodShuttlePatternRestrictions2 = new MVTodShuttlePatternRestrictions();
                                mVTodShuttlePattern.restrictions = mVTodShuttlePatternRestrictions2;
                                mVTodShuttlePatternRestrictions2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVTodShuttlePattern.stopIds = new ArrayList(k.f63395b);
                            int i = 0;
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVTodShuttlePattern.stopIds, i, 1);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodShuttlePattern.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodShuttlePattern.patternId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePattern$b */
    public static class C11428b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11427a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePattern$c */
    public static class C11429c extends C25240d<MVTodShuttlePattern> {
        public C11429c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttlePattern mVTodShuttlePattern = (MVTodShuttlePattern) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodShuttlePattern.mo33993g()) {
                bitSet.set(0);
            }
            if (mVTodShuttlePattern.mo33992f()) {
                bitSet.set(1);
            }
            if (mVTodShuttlePattern.mo33996i()) {
                bitSet.set(2);
            }
            if (mVTodShuttlePattern.mo33994h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodShuttlePattern.mo33993g()) {
                jVar.mo61686J(mVTodShuttlePattern.patternId);
            }
            if (mVTodShuttlePattern.mo33992f()) {
                jVar.mo61686J(mVTodShuttlePattern.name);
            }
            if (mVTodShuttlePattern.mo33996i()) {
                jVar.mo61678B(mVTodShuttlePattern.stopIds.size());
                for (Integer intValue : mVTodShuttlePattern.stopIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVTodShuttlePattern.mo33994h()) {
                mVTodShuttlePattern.restrictions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodShuttlePattern mVTodShuttlePattern = (MVTodShuttlePattern) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTodShuttlePattern.patternId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodShuttlePattern.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVTodShuttlePattern.stopIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVTodShuttlePattern.stopIds, i2, 1)) {
                }
            }
            if (T.get(3)) {
                MVTodShuttlePatternRestrictions mVTodShuttlePatternRestrictions = new MVTodShuttlePatternRestrictions();
                mVTodShuttlePattern.restrictions = mVTodShuttlePatternRestrictions;
                mVTodShuttlePatternRestrictions.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePattern$d */
    public static class C11430d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11429c(0);
        }
    }

    static {
        new C17394d0("MVTodShuttlePattern");
        HashMap hashMap = new HashMap();
        f29737f = hashMap;
        hashMap.put(C25239c.class, new C11428b());
        hashMap.put(C25240d.class, new C11430d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PATTERN_ID, new FieldMetaData("patternId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STOP_IDS, new FieldMetaData("stopIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.RESTRICTIONS, new FieldMetaData("restrictions", (byte) 2, new StructMetaData(MVTodShuttlePatternRestrictions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29738g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodShuttlePattern.class, unmodifiableMap);
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
        ((C25238b) f29737f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29737f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodShuttlePattern mVTodShuttlePattern = (MVTodShuttlePattern) obj;
        if (!getClass().equals(mVTodShuttlePattern.getClass())) {
            return getClass().getName().compareTo(mVTodShuttlePattern.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33993g()).compareTo(Boolean.valueOf(mVTodShuttlePattern.mo33993g()));
        if (compareTo2 != 0 || ((mo33993g() && (compareTo2 = this.patternId.compareTo(mVTodShuttlePattern.patternId)) != 0) || (compareTo2 = Boolean.valueOf(mo33992f()).compareTo(Boolean.valueOf(mVTodShuttlePattern.mo33992f()))) != 0 || ((mo33992f() && (compareTo2 = this.name.compareTo(mVTodShuttlePattern.name)) != 0) || (compareTo2 = Boolean.valueOf(mo33996i()).compareTo(Boolean.valueOf(mVTodShuttlePattern.mo33996i()))) != 0 || ((mo33996i() && (compareTo2 = C25082a.m62844h(this.stopIds, mVTodShuttlePattern.stopIds)) != 0) || (compareTo2 = Boolean.valueOf(mo33994h()).compareTo(Boolean.valueOf(mVTodShuttlePattern.mo33994h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo33994h() || (compareTo = this.restrictions.compareTo(mVTodShuttlePattern.restrictions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodShuttlePattern)) {
            return false;
        }
        MVTodShuttlePattern mVTodShuttlePattern = (MVTodShuttlePattern) obj;
        boolean g = mo33993g();
        boolean g2 = mVTodShuttlePattern.mo33993g();
        if ((g || g2) && (!g || !g2 || !this.patternId.equals(mVTodShuttlePattern.patternId))) {
            return false;
        }
        boolean f = mo33992f();
        boolean f2 = mVTodShuttlePattern.mo33992f();
        if ((f || f2) && (!f || !f2 || !this.name.equals(mVTodShuttlePattern.name))) {
            return false;
        }
        boolean i = mo33996i();
        boolean i2 = mVTodShuttlePattern.mo33996i();
        if ((i || i2) && (!i || !i2 || !this.stopIds.equals(mVTodShuttlePattern.stopIds))) {
            return false;
        }
        boolean h = mo33994h();
        boolean h2 = mVTodShuttlePattern.mo33994h();
        if ((h || h2) && (!h || !h2 || !this.restrictions.mo34000a(mVTodShuttlePattern.restrictions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33992f() {
        return this.name != null;
    }

    /* renamed from: g */
    public final boolean mo33993g() {
        return this.patternId != null;
    }

    /* renamed from: h */
    public final boolean mo33994h() {
        return this.restrictions != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33996i() {
        return this.stopIds != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodShuttlePattern(", "patternId:");
        String str = this.patternId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("stopIds:");
        List<Integer> list = this.stopIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo33994h()) {
            n.append(", ");
            n.append("restrictions:");
            MVTodShuttlePatternRestrictions mVTodShuttlePatternRestrictions = this.restrictions;
            if (mVTodShuttlePatternRestrictions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTodShuttlePatternRestrictions);
            }
        }
        n.append(")");
        return n.toString();
    }
}
