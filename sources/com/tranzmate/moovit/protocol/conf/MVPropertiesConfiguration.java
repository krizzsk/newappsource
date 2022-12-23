package com.tranzmate.moovit.protocol.conf;

import com.appboy.support.StringUtils;
import com.unity3d.ads.metadata.MediationMetaData;
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
import org.apache.thrift.meta_data.MapMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25120f;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPropertiesConfiguration implements TBase<MVPropertiesConfiguration, _Fields>, Serializable, Cloneable, Comparable<MVPropertiesConfiguration> {

    /* renamed from: b */
    public static final C25113c f25294b = new C25113c("properties", (byte) 13, 1);

    /* renamed from: c */
    public static final C25113c f25295c = new C25113c(MediationMetaData.KEY_VERSION, (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f25296d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25297e;
    private byte __isset_bitfield = 0;
    public Map<String, String> properties;
    public long version;

    public enum _Fields implements C25085c {
        PROPERTIES(1, "properties"),
        VERSION(2, MediationMetaData.KEY_VERSION);
        
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
                return PROPERTIES;
            }
            if (i != 2) {
                return null;
            }
            return VERSION;
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

    /* renamed from: com.tranzmate.moovit.protocol.conf.MVPropertiesConfiguration$a */
    public static class C8521a extends C25239c<MVPropertiesConfiguration> {
        public C8521a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPropertiesConfiguration mVPropertiesConfiguration = (MVPropertiesConfiguration) tBase;
            mVPropertiesConfiguration.getClass();
            C25113c cVar = MVPropertiesConfiguration.f25294b;
            gVar.mo61687K();
            if (mVPropertiesConfiguration.properties != null) {
                gVar.mo61711x(MVPropertiesConfiguration.f25294b);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVPropertiesConfiguration.properties.size()));
                for (Map.Entry next : mVPropertiesConfiguration.properties.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPropertiesConfiguration.f25295c);
            C25541a.m63891v(gVar, mVPropertiesConfiguration.version);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPropertiesConfiguration mVPropertiesConfiguration = (MVPropertiesConfiguration) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPropertiesConfiguration.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVPropertiesConfiguration.version = gVar.mo61697j();
                        mVPropertiesConfiguration.mo26658h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 13) {
                    C25120f m = gVar.mo61700m();
                    mVPropertiesConfiguration.properties = new HashMap(m.f63398c * 2);
                    for (int i = 0; i < m.f63398c; i++) {
                        mVPropertiesConfiguration.properties.put(gVar.mo61704q(), gVar.mo61704q());
                    }
                    gVar.mo61701n();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.conf.MVPropertiesConfiguration$b */
    public static class C8522b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8521a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.conf.MVPropertiesConfiguration$c */
    public static class C8523c extends C25240d<MVPropertiesConfiguration> {
        public C8523c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPropertiesConfiguration mVPropertiesConfiguration = (MVPropertiesConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPropertiesConfiguration.mo26656f()) {
                bitSet.set(0);
            }
            if (mVPropertiesConfiguration.mo26657g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPropertiesConfiguration.mo26656f()) {
                jVar.mo61678B(mVPropertiesConfiguration.properties.size());
                for (Map.Entry next : mVPropertiesConfiguration.properties.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
            if (mVPropertiesConfiguration.mo26657g()) {
                jVar.mo61679C(mVPropertiesConfiguration.version);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPropertiesConfiguration mVPropertiesConfiguration = (MVPropertiesConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPropertiesConfiguration.properties = new HashMap(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPropertiesConfiguration.properties.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
            if (T.get(1)) {
                mVPropertiesConfiguration.version = jVar.mo61697j();
                mVPropertiesConfiguration.mo26658h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.conf.MVPropertiesConfiguration$d */
    public static class C8524d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8523c(0);
        }
    }

    static {
        new C17394d0("MVPropertiesConfiguration");
        HashMap hashMap = new HashMap();
        f25296d = hashMap;
        hashMap.put(C25239c.class, new C8522b());
        hashMap.put(C25240d.class, new C8524d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROPERTIES, new FieldMetaData("properties", (byte) 3, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.VERSION, new FieldMetaData(MediationMetaData.KEY_VERSION, (byte) 3, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25297e = unmodifiableMap;
        FieldMetaData.m61947a(MVPropertiesConfiguration.class, unmodifiableMap);
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
        ((C25238b) f25296d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25296d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVPropertiesConfiguration mVPropertiesConfiguration = (MVPropertiesConfiguration) obj;
        if (!getClass().equals(mVPropertiesConfiguration.getClass())) {
            return getClass().getName().compareTo(mVPropertiesConfiguration.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26656f()).compareTo(Boolean.valueOf(mVPropertiesConfiguration.mo26656f()));
        if (compareTo != 0 || ((mo26656f() && (compareTo = C25082a.m62845i(this.properties, mVPropertiesConfiguration.properties)) != 0) || (compareTo = Boolean.valueOf(mo26657g()).compareTo(Boolean.valueOf(mVPropertiesConfiguration.mo26657g()))) != 0)) {
            return compareTo;
        }
        if (!mo26657g() || (d = C25082a.m62840d(this.version, mVPropertiesConfiguration.version)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPropertiesConfiguration)) {
            return false;
        }
        MVPropertiesConfiguration mVPropertiesConfiguration = (MVPropertiesConfiguration) obj;
        boolean f = mo26656f();
        boolean f2 = mVPropertiesConfiguration.mo26656f();
        if (((f || f2) && (!f || !f2 || !this.properties.equals(mVPropertiesConfiguration.properties))) || this.version != mVPropertiesConfiguration.version) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26656f() {
        return this.properties != null;
    }

    /* renamed from: g */
    public final boolean mo26657g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo26658h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPropertiesConfiguration(", "properties:");
        Map<String, String> map = this.properties;
        if (map == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(map);
        }
        n.append(", ");
        n.append("version:");
        return C25541a.m63884o(n, this.version, ")");
    }
}
