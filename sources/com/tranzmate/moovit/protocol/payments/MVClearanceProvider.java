package com.tranzmate.moovit.protocol.payments;

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
import org.apache.thrift.meta_data.MapMetaData;
import p358af.C13437d;
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

public class MVClearanceProvider implements TBase<MVClearanceProvider, _Fields>, Serializable, Cloneable, Comparable<MVClearanceProvider> {

    /* renamed from: b */
    public static final C25113c f27172b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27173c = new C25113c("serverKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27174d = new C25113c("properties", (byte) 13, 3);

    /* renamed from: e */
    public static final HashMap f27175e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27176f;
    private _Fields[] optionals = {_Fields.PROPERTIES};
    public Map<String, String> properties;
    public String serverKey;
    public MVClearanceProviderType type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        SERVER_KEY(2, "serverKey"),
        PROPERTIES(3, "properties");
        
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
                return SERVER_KEY;
            }
            if (i != 3) {
                return null;
            }
            return PROPERTIES;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProvider$a */
    public static class C9656a extends C25239c<MVClearanceProvider> {
        public C9656a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProvider mVClearanceProvider = (MVClearanceProvider) tBase;
            mVClearanceProvider.getClass();
            C25113c cVar = MVClearanceProvider.f27172b;
            gVar.mo61687K();
            if (mVClearanceProvider.type != null) {
                gVar.mo61711x(MVClearanceProvider.f27172b);
                gVar.mo61678B(mVClearanceProvider.type.getValue());
                gVar.mo61712y();
            }
            if (mVClearanceProvider.serverKey != null) {
                gVar.mo61711x(MVClearanceProvider.f27173c);
                gVar.mo61686J(mVClearanceProvider.serverKey);
                gVar.mo61712y();
            }
            if (mVClearanceProvider.properties != null && mVClearanceProvider.mo29698f()) {
                gVar.mo61711x(MVClearanceProvider.f27174d);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVClearanceProvider.properties.size()));
                for (Map.Entry next : mVClearanceProvider.properties.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProvider mVClearanceProvider = (MVClearanceProvider) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVClearanceProvider.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 13) {
                            C25120f m = gVar.mo61700m();
                            mVClearanceProvider.properties = new HashMap(m.f63398c * 2);
                            for (int i = 0; i < m.f63398c; i++) {
                                mVClearanceProvider.properties.put(gVar.mo61704q(), gVar.mo61704q());
                            }
                            gVar.mo61701n();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVClearanceProvider.serverKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVClearanceProvider.type = MVClearanceProviderType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProvider$b */
    public static class C9657b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9656a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProvider$c */
    public static class C9658c extends C25240d<MVClearanceProvider> {
        public C9658c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProvider mVClearanceProvider = (MVClearanceProvider) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVClearanceProvider.mo29700h()) {
                bitSet.set(0);
            }
            if (mVClearanceProvider.mo29699g()) {
                bitSet.set(1);
            }
            if (mVClearanceProvider.mo29698f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVClearanceProvider.mo29700h()) {
                jVar.mo61678B(mVClearanceProvider.type.getValue());
            }
            if (mVClearanceProvider.mo29699g()) {
                jVar.mo61686J(mVClearanceProvider.serverKey);
            }
            if (mVClearanceProvider.mo29698f()) {
                jVar.mo61678B(mVClearanceProvider.properties.size());
                for (Map.Entry next : mVClearanceProvider.properties.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProvider mVClearanceProvider = (MVClearanceProvider) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVClearanceProvider.type = MVClearanceProviderType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVClearanceProvider.serverKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVClearanceProvider.properties = new HashMap(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVClearanceProvider.properties.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProvider$d */
    public static class C9659d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9658c(0);
        }
    }

    static {
        new C17394d0("MVClearanceProvider");
        HashMap hashMap = new HashMap();
        f27175e = hashMap;
        hashMap.put(C25239c.class, new C9657b());
        hashMap.put(C25240d.class, new C9659d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVClearanceProviderType.class)));
        enumMap.put(_Fields.SERVER_KEY, new FieldMetaData("serverKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROPERTIES, new FieldMetaData("properties", (byte) 2, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27176f = unmodifiableMap;
        FieldMetaData.m61947a(MVClearanceProvider.class, unmodifiableMap);
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
        ((C25238b) f27175e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27175e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29695a(MVClearanceProvider mVClearanceProvider) {
        if (mVClearanceProvider == null) {
            return false;
        }
        boolean h = mo29700h();
        boolean h2 = mVClearanceProvider.mo29700h();
        if ((h || h2) && (!h || !h2 || !this.type.equals(mVClearanceProvider.type))) {
            return false;
        }
        boolean g = mo29699g();
        boolean g2 = mVClearanceProvider.mo29699g();
        if ((g || g2) && (!g || !g2 || !this.serverKey.equals(mVClearanceProvider.serverKey))) {
            return false;
        }
        boolean f = mo29698f();
        boolean f2 = mVClearanceProvider.mo29698f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.properties.equals(mVClearanceProvider.properties)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int i;
        MVClearanceProvider mVClearanceProvider = (MVClearanceProvider) obj;
        if (!getClass().equals(mVClearanceProvider.getClass())) {
            return getClass().getName().compareTo(mVClearanceProvider.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29700h()).compareTo(Boolean.valueOf(mVClearanceProvider.mo29700h()));
        if (compareTo != 0 || ((mo29700h() && (compareTo = this.type.compareTo(mVClearanceProvider.type)) != 0) || (compareTo = Boolean.valueOf(mo29699g()).compareTo(Boolean.valueOf(mVClearanceProvider.mo29699g()))) != 0 || ((mo29699g() && (compareTo = this.serverKey.compareTo(mVClearanceProvider.serverKey)) != 0) || (compareTo = Boolean.valueOf(mo29698f()).compareTo(Boolean.valueOf(mVClearanceProvider.mo29698f()))) != 0))) {
            return compareTo;
        }
        if (!mo29698f() || (i = C25082a.m62845i(this.properties, mVClearanceProvider.properties)) == 0) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVClearanceProvider)) {
            return mo29695a((MVClearanceProvider) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29698f() {
        return this.properties != null;
    }

    /* renamed from: g */
    public final boolean mo29699g() {
        return this.serverKey != null;
    }

    /* renamed from: h */
    public final boolean mo29700h() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVClearanceProvider(", "type:");
        MVClearanceProviderType mVClearanceProviderType = this.type;
        if (mVClearanceProviderType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClearanceProviderType);
        }
        n.append(", ");
        n.append("serverKey:");
        String str = this.serverKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29698f()) {
            n.append(", ");
            n.append("properties:");
            Map<String, String> map = this.properties;
            if (map == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(map);
            }
        }
        n.append(")");
        return n.toString();
    }
}
