package com.tranzmate.moovit.protocol.datacollection;

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

public class MVApplicationInfos implements TBase<MVApplicationInfos, _Fields>, Serializable, Cloneable, Comparable<MVApplicationInfos> {

    /* renamed from: b */
    public static final C25113c f25495b = new C25113c("applicationInfos", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f25496c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f25497d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25498e;
    private byte __isset_bitfield = 0;
    public List<MVApplicationInfo> applicationInfos;
    private _Fields[] optionals = {_Fields.TIMESTAMP};
    public long timestamp;

    public enum _Fields implements C25085c {
        APPLICATION_INFOS(1, "applicationInfos"),
        TIMESTAMP(2, "timestamp");
        
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
                return APPLICATION_INFOS;
            }
            if (i != 2) {
                return null;
            }
            return TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.datacollection.MVApplicationInfos$a */
    public static class C8631a extends C25239c<MVApplicationInfos> {
        public C8631a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplicationInfos mVApplicationInfos = (MVApplicationInfos) tBase;
            mVApplicationInfos.getClass();
            C25113c cVar = MVApplicationInfos.f25495b;
            gVar.mo61687K();
            if (mVApplicationInfos.applicationInfos != null) {
                gVar.mo61711x(MVApplicationInfos.f25495b);
                gVar.mo61680D(new C25119e((byte) 12, mVApplicationInfos.applicationInfos.size()));
                for (MVApplicationInfo X0 : mVApplicationInfos.applicationInfos) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVApplicationInfos.mo26990g()) {
                gVar.mo61711x(MVApplicationInfos.f25496c);
                gVar.mo61679C(mVApplicationInfos.timestamp);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplicationInfos mVApplicationInfos = (MVApplicationInfos) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplicationInfos.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVApplicationInfos.timestamp = gVar.mo61697j();
                        mVApplicationInfos.mo26991h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVApplicationInfos.applicationInfos = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVApplicationInfo mVApplicationInfo = new MVApplicationInfo();
                        mVApplicationInfo.mo25201C1(gVar);
                        mVApplicationInfos.applicationInfos.add(mVApplicationInfo);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.datacollection.MVApplicationInfos$b */
    public static class C8632b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8631a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.datacollection.MVApplicationInfos$c */
    public static class C8633c extends C25240d<MVApplicationInfos> {
        public C8633c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplicationInfos mVApplicationInfos = (MVApplicationInfos) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplicationInfos.mo26989f()) {
                bitSet.set(0);
            }
            if (mVApplicationInfos.mo26990g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVApplicationInfos.mo26989f()) {
                jVar.mo61678B(mVApplicationInfos.applicationInfos.size());
                for (MVApplicationInfo X0 : mVApplicationInfos.applicationInfos) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVApplicationInfos.mo26990g()) {
                jVar.mo61679C(mVApplicationInfos.timestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplicationInfos mVApplicationInfos = (MVApplicationInfos) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVApplicationInfos.applicationInfos = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVApplicationInfo mVApplicationInfo = new MVApplicationInfo();
                    mVApplicationInfo.mo25201C1(jVar);
                    mVApplicationInfos.applicationInfos.add(mVApplicationInfo);
                }
            }
            if (T.get(1)) {
                mVApplicationInfos.timestamp = jVar.mo61697j();
                mVApplicationInfos.mo26991h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.datacollection.MVApplicationInfos$d */
    public static class C8634d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8633c(0);
        }
    }

    static {
        new C17394d0("MVApplicationInfos");
        HashMap hashMap = new HashMap();
        f25497d = hashMap;
        hashMap.put(C25239c.class, new C8632b());
        hashMap.put(C25240d.class, new C8634d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.APPLICATION_INFOS, new FieldMetaData("applicationInfos", (byte) 3, new ListMetaData(new StructMetaData(MVApplicationInfo.class))));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25498e = unmodifiableMap;
        FieldMetaData.m61947a(MVApplicationInfos.class, unmodifiableMap);
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
        ((C25238b) f25497d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25497d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVApplicationInfos mVApplicationInfos = (MVApplicationInfos) obj;
        if (!getClass().equals(mVApplicationInfos.getClass())) {
            return getClass().getName().compareTo(mVApplicationInfos.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26989f()).compareTo(Boolean.valueOf(mVApplicationInfos.mo26989f()));
        if (compareTo != 0 || ((mo26989f() && (compareTo = C25082a.m62844h(this.applicationInfos, mVApplicationInfos.applicationInfos)) != 0) || (compareTo = Boolean.valueOf(mo26990g()).compareTo(Boolean.valueOf(mVApplicationInfos.mo26990g()))) != 0)) {
            return compareTo;
        }
        if (!mo26990g() || (d = C25082a.m62840d(this.timestamp, mVApplicationInfos.timestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVApplicationInfos)) {
            return false;
        }
        MVApplicationInfos mVApplicationInfos = (MVApplicationInfos) obj;
        boolean f = mo26989f();
        boolean f2 = mVApplicationInfos.mo26989f();
        if ((f || f2) && (!f || !f2 || !this.applicationInfos.equals(mVApplicationInfos.applicationInfos))) {
            return false;
        }
        boolean g = mo26990g();
        boolean g2 = mVApplicationInfos.mo26990g();
        if ((g || g2) && (!g || !g2 || this.timestamp != mVApplicationInfos.timestamp)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26989f() {
        return this.applicationInfos != null;
    }

    /* renamed from: g */
    public final boolean mo26990g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo26991h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVApplicationInfos(", "applicationInfos:");
        List<MVApplicationInfo> list = this.applicationInfos;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo26990g()) {
            n.append(", ");
            n.append("timestamp:");
            n.append(this.timestamp);
        }
        n.append(")");
        return n.toString();
    }
}
