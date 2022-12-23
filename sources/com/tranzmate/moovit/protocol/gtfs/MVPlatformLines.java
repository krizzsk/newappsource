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

public class MVPlatformLines implements TBase<MVPlatformLines, _Fields>, Serializable, Cloneable, Comparable<MVPlatformLines> {

    /* renamed from: b */
    public static final C25113c f25782b = new C25113c("name", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25783c = new C25113c("lineIds", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25784d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25785e;
    public List<Integer> lineIds;
    public String name;
    private _Fields[] optionals = {_Fields.NAME};

    public enum _Fields implements C25085c {
        NAME(1, "name"),
        LINE_IDS(2, "lineIds");
        
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
                return NAME;
            }
            if (i != 2) {
                return null;
            }
            return LINE_IDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVPlatformLines$a */
    public static class C8819a extends C25239c<MVPlatformLines> {
        public C8819a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPlatformLines mVPlatformLines = (MVPlatformLines) tBase;
            mVPlatformLines.getClass();
            C25113c cVar = MVPlatformLines.f25782b;
            gVar.mo61687K();
            if (mVPlatformLines.name != null && mVPlatformLines.mo27483g()) {
                gVar.mo61711x(MVPlatformLines.f25782b);
                gVar.mo61686J(mVPlatformLines.name);
                gVar.mo61712y();
            }
            if (mVPlatformLines.lineIds != null) {
                gVar.mo61711x(MVPlatformLines.f25783c);
                gVar.mo61680D(new C25119e((byte) 8, mVPlatformLines.lineIds.size()));
                for (Integer intValue : mVPlatformLines.lineIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPlatformLines mVPlatformLines = (MVPlatformLines) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPlatformLines.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVPlatformLines.lineIds = new ArrayList(k.f63395b);
                        int i = 0;
                        while (i < k.f63395b) {
                            i = C13437d.m33701f(gVar.mo61696i(), mVPlatformLines.lineIds, i, 1);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPlatformLines.name = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVPlatformLines$b */
    public static class C8820b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8819a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVPlatformLines$c */
    public static class C8821c extends C25240d<MVPlatformLines> {
        public C8821c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPlatformLines mVPlatformLines = (MVPlatformLines) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPlatformLines.mo27483g()) {
                bitSet.set(0);
            }
            if (mVPlatformLines.mo27482f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPlatformLines.mo27483g()) {
                jVar.mo61686J(mVPlatformLines.name);
            }
            if (mVPlatformLines.mo27482f()) {
                jVar.mo61678B(mVPlatformLines.lineIds.size());
                for (Integer intValue : mVPlatformLines.lineIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPlatformLines mVPlatformLines = (MVPlatformLines) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPlatformLines.name = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPlatformLines.lineIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVPlatformLines.lineIds, i2, 1)) {
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVPlatformLines$d */
    public static class C8822d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8821c(0);
        }
    }

    static {
        new C17394d0("MVPlatformLines");
        HashMap hashMap = new HashMap();
        f25784d = hashMap;
        hashMap.put(C25239c.class, new C8820b());
        hashMap.put(C25240d.class, new C8822d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LINE_IDS, new FieldMetaData("lineIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25785e = unmodifiableMap;
        FieldMetaData.m61947a(MVPlatformLines.class, unmodifiableMap);
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
        ((C25238b) f25784d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25784d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPlatformLines mVPlatformLines = (MVPlatformLines) obj;
        if (!getClass().equals(mVPlatformLines.getClass())) {
            return getClass().getName().compareTo(mVPlatformLines.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27483g()).compareTo(Boolean.valueOf(mVPlatformLines.mo27483g()));
        if (compareTo != 0 || ((mo27483g() && (compareTo = this.name.compareTo(mVPlatformLines.name)) != 0) || (compareTo = Boolean.valueOf(mo27482f()).compareTo(Boolean.valueOf(mVPlatformLines.mo27482f()))) != 0)) {
            return compareTo;
        }
        if (!mo27482f() || (h = C25082a.m62844h(this.lineIds, mVPlatformLines.lineIds)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPlatformLines)) {
            return false;
        }
        MVPlatformLines mVPlatformLines = (MVPlatformLines) obj;
        boolean g = mo27483g();
        boolean g2 = mVPlatformLines.mo27483g();
        if ((g || g2) && (!g || !g2 || !this.name.equals(mVPlatformLines.name))) {
            return false;
        }
        boolean f = mo27482f();
        boolean f2 = mVPlatformLines.mo27482f();
        if ((f || f2) && (!f || !f2 || !this.lineIds.equals(mVPlatformLines.lineIds))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27482f() {
        return this.lineIds != null;
    }

    /* renamed from: g */
    public final boolean mo27483g() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPlatformLines(");
        if (mo27483g()) {
            sb.append("name:");
            String str = this.name;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("lineIds:");
        List<Integer> list = this.lineIds;
        if (list == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }
}
