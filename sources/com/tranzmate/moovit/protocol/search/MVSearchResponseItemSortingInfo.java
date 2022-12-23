package com.tranzmate.moovit.protocol.search;

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

public class MVSearchResponseItemSortingInfo implements TBase<MVSearchResponseItemSortingInfo, _Fields>, Serializable, Cloneable, Comparable<MVSearchResponseItemSortingInfo> {

    /* renamed from: b */
    public static final C25113c f28220b = new C25113c("score", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28221c = new C25113c("distance", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28222d = new C25113c("hits", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28223e = new C25113c("priority", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f28224f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28225g;
    public String distance;
    public String hits;
    public String priority;
    public String score;

    public enum _Fields implements C25085c {
        SCORE(1, "score"),
        DISTANCE(2, "distance"),
        HITS(3, "hits"),
        PRIORITY(4, "priority");
        
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
                return SCORE;
            }
            if (i == 2) {
                return DISTANCE;
            }
            if (i == 3) {
                return HITS;
            }
            if (i != 4) {
                return null;
            }
            return PRIORITY;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponseItemSortingInfo$a */
    public static class C10447a extends C25239c<MVSearchResponseItemSortingInfo> {
        public C10447a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo = (MVSearchResponseItemSortingInfo) tBase;
            mVSearchResponseItemSortingInfo.getClass();
            C25113c cVar = MVSearchResponseItemSortingInfo.f28220b;
            gVar.mo61687K();
            if (mVSearchResponseItemSortingInfo.score != null) {
                gVar.mo61711x(MVSearchResponseItemSortingInfo.f28220b);
                gVar.mo61686J(mVSearchResponseItemSortingInfo.score);
                gVar.mo61712y();
            }
            if (mVSearchResponseItemSortingInfo.distance != null) {
                gVar.mo61711x(MVSearchResponseItemSortingInfo.f28221c);
                gVar.mo61686J(mVSearchResponseItemSortingInfo.distance);
                gVar.mo61712y();
            }
            if (mVSearchResponseItemSortingInfo.hits != null) {
                gVar.mo61711x(MVSearchResponseItemSortingInfo.f28222d);
                gVar.mo61686J(mVSearchResponseItemSortingInfo.hits);
                gVar.mo61712y();
            }
            if (mVSearchResponseItemSortingInfo.priority != null) {
                gVar.mo61711x(MVSearchResponseItemSortingInfo.f28223e);
                gVar.mo61686J(mVSearchResponseItemSortingInfo.priority);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo = (MVSearchResponseItemSortingInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSearchResponseItemSortingInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVSearchResponseItemSortingInfo.priority = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVSearchResponseItemSortingInfo.hits = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVSearchResponseItemSortingInfo.distance = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVSearchResponseItemSortingInfo.score = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponseItemSortingInfo$b */
    public static class C10448b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10447a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponseItemSortingInfo$c */
    public static class C10449c extends C25240d<MVSearchResponseItemSortingInfo> {
        public C10449c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo = (MVSearchResponseItemSortingInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSearchResponseItemSortingInfo.mo31549i()) {
                bitSet.set(0);
            }
            if (mVSearchResponseItemSortingInfo.mo31545f()) {
                bitSet.set(1);
            }
            if (mVSearchResponseItemSortingInfo.mo31546g()) {
                bitSet.set(2);
            }
            if (mVSearchResponseItemSortingInfo.mo31547h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSearchResponseItemSortingInfo.mo31549i()) {
                jVar.mo61686J(mVSearchResponseItemSortingInfo.score);
            }
            if (mVSearchResponseItemSortingInfo.mo31545f()) {
                jVar.mo61686J(mVSearchResponseItemSortingInfo.distance);
            }
            if (mVSearchResponseItemSortingInfo.mo31546g()) {
                jVar.mo61686J(mVSearchResponseItemSortingInfo.hits);
            }
            if (mVSearchResponseItemSortingInfo.mo31547h()) {
                jVar.mo61686J(mVSearchResponseItemSortingInfo.priority);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo = (MVSearchResponseItemSortingInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVSearchResponseItemSortingInfo.score = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVSearchResponseItemSortingInfo.distance = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVSearchResponseItemSortingInfo.hits = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVSearchResponseItemSortingInfo.priority = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponseItemSortingInfo$d */
    public static class C10450d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10449c(0);
        }
    }

    static {
        new C17394d0("MVSearchResponseItemSortingInfo");
        HashMap hashMap = new HashMap();
        f28224f = hashMap;
        hashMap.put(C25239c.class, new C10448b());
        hashMap.put(C25240d.class, new C10450d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SCORE, new FieldMetaData("score", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISTANCE, new FieldMetaData("distance", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.HITS, new FieldMetaData("hits", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRIORITY, new FieldMetaData("priority", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28225g = unmodifiableMap;
        FieldMetaData.m61947a(MVSearchResponseItemSortingInfo.class, unmodifiableMap);
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
        ((C25238b) f28224f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28224f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31542a(MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo) {
        if (mVSearchResponseItemSortingInfo == null) {
            return false;
        }
        boolean i = mo31549i();
        boolean i2 = mVSearchResponseItemSortingInfo.mo31549i();
        if ((i || i2) && (!i || !i2 || !this.score.equals(mVSearchResponseItemSortingInfo.score))) {
            return false;
        }
        boolean f = mo31545f();
        boolean f2 = mVSearchResponseItemSortingInfo.mo31545f();
        if ((f || f2) && (!f || !f2 || !this.distance.equals(mVSearchResponseItemSortingInfo.distance))) {
            return false;
        }
        boolean g = mo31546g();
        boolean g2 = mVSearchResponseItemSortingInfo.mo31546g();
        if ((g || g2) && (!g || !g2 || !this.hits.equals(mVSearchResponseItemSortingInfo.hits))) {
            return false;
        }
        boolean h = mo31547h();
        boolean h2 = mVSearchResponseItemSortingInfo.mo31547h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.priority.equals(mVSearchResponseItemSortingInfo.priority)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo = (MVSearchResponseItemSortingInfo) obj;
        if (!getClass().equals(mVSearchResponseItemSortingInfo.getClass())) {
            return getClass().getName().compareTo(mVSearchResponseItemSortingInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31549i()).compareTo(Boolean.valueOf(mVSearchResponseItemSortingInfo.mo31549i()));
        if (compareTo2 != 0 || ((mo31549i() && (compareTo2 = this.score.compareTo(mVSearchResponseItemSortingInfo.score)) != 0) || (compareTo2 = Boolean.valueOf(mo31545f()).compareTo(Boolean.valueOf(mVSearchResponseItemSortingInfo.mo31545f()))) != 0 || ((mo31545f() && (compareTo2 = this.distance.compareTo(mVSearchResponseItemSortingInfo.distance)) != 0) || (compareTo2 = Boolean.valueOf(mo31546g()).compareTo(Boolean.valueOf(mVSearchResponseItemSortingInfo.mo31546g()))) != 0 || ((mo31546g() && (compareTo2 = this.hits.compareTo(mVSearchResponseItemSortingInfo.hits)) != 0) || (compareTo2 = Boolean.valueOf(mo31547h()).compareTo(Boolean.valueOf(mVSearchResponseItemSortingInfo.mo31547h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo31547h() || (compareTo = this.priority.compareTo(mVSearchResponseItemSortingInfo.priority)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVSearchResponseItemSortingInfo)) {
            return mo31542a((MVSearchResponseItemSortingInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31545f() {
        return this.distance != null;
    }

    /* renamed from: g */
    public final boolean mo31546g() {
        return this.hits != null;
    }

    /* renamed from: h */
    public final boolean mo31547h() {
        return this.priority != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31549i() {
        return this.score != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSearchResponseItemSortingInfo(", "score:");
        String str = this.score;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("distance:");
        String str2 = this.distance;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("hits:");
        String str3 = this.hits;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("priority:");
        String str4 = this.priority;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }
}
